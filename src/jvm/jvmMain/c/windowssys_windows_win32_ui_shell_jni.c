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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocCreateForClasses(JNIEnv* km_env, jclass km_clazz, jlong rgclasses, jint cclasses, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocCreateForClasses");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rgclasses, (uint32_t)cclasses, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)rgclasses;
    (void)cclasses;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocGetDetailsOfPropKey(JNIEnv* km_env, jclass km_clazz, jlong psf, jlong pidl, jlong pkey, jlong pv, jlong pffoundpropkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocGetDetailsOfPropKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psf, (void*)(uintptr_t)pidl, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pv, (void*)(uintptr_t)pffoundpropkey) : -1;
#else
    (void)psf;
    (void)pidl;
    (void)pkey;
    (void)pv;
    (void)pffoundpropkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocGetPerceivedType(JNIEnv* km_env, jclass km_clazz, jlong pszext, jlong ptype, jlong pflag, jlong ppsztype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocGetPerceivedType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszext, (void*)(uintptr_t)ptype, (void*)(uintptr_t)pflag, (void*)(uintptr_t)ppsztype) : -1;
#else
    (void)pszext;
    (void)ptype;
    (void)pflag;
    (void)ppsztype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocIsDangerous(JNIEnv* km_env, jclass km_clazz, jlong pszassoc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocIsDangerous");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszassoc) : -1;
#else
    (void)pszassoc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocQueryKeyA(JNIEnv* km_env, jclass km_clazz, jint flags, jint key, jlong pszassoc, jlong pszextra, jlong phkeyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryKeyA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (int32_t)key, (void*)(uintptr_t)pszassoc, (void*)(uintptr_t)pszextra, (void*)(uintptr_t)phkeyout) : -1;
#else
    (void)flags;
    (void)key;
    (void)pszassoc;
    (void)pszextra;
    (void)phkeyout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocQueryKeyW(JNIEnv* km_env, jclass km_clazz, jint flags, jint key, jlong pszassoc, jlong pszextra, jlong phkeyout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryKeyW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (int32_t)key, (void*)(uintptr_t)pszassoc, (void*)(uintptr_t)pszextra, (void*)(uintptr_t)phkeyout) : -1;
#else
    (void)flags;
    (void)key;
    (void)pszassoc;
    (void)pszextra;
    (void)phkeyout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocQueryStringA(JNIEnv* km_env, jclass km_clazz, jint flags, jint str, jlong pszassoc, jlong pszextra, jlong pszout, jlong pcchout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryStringA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (int32_t)str, (void*)(uintptr_t)pszassoc, (void*)(uintptr_t)pszextra, (void*)(uintptr_t)pszout, (void*)(uintptr_t)pcchout) : -1;
#else
    (void)flags;
    (void)str;
    (void)pszassoc;
    (void)pszextra;
    (void)pszout;
    (void)pcchout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocQueryStringByKeyA(JNIEnv* km_env, jclass km_clazz, jint flags, jint str, jlong hkassoc, jlong pszextra, jlong pszout, jlong pcchout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryStringByKeyA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (int32_t)str, (void*)(uintptr_t)hkassoc, (void*)(uintptr_t)pszextra, (void*)(uintptr_t)pszout, (void*)(uintptr_t)pcchout) : -1;
#else
    (void)flags;
    (void)str;
    (void)hkassoc;
    (void)pszextra;
    (void)pszout;
    (void)pcchout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocQueryStringByKeyW(JNIEnv* km_env, jclass km_clazz, jint flags, jint str, jlong hkassoc, jlong pszextra, jlong pszout, jlong pcchout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryStringByKeyW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (int32_t)str, (void*)(uintptr_t)hkassoc, (void*)(uintptr_t)pszextra, (void*)(uintptr_t)pszout, (void*)(uintptr_t)pcchout) : -1;
#else
    (void)flags;
    (void)str;
    (void)hkassoc;
    (void)pszextra;
    (void)pszout;
    (void)pcchout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1assocQueryStringW(JNIEnv* km_env, jclass km_clazz, jint flags, jint str, jlong pszassoc, jlong pszextra, jlong pszout, jlong pcchout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssocQueryStringW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (int32_t)str, (void*)(uintptr_t)pszassoc, (void*)(uintptr_t)pszextra, (void*)(uintptr_t)pszout, (void*)(uintptr_t)pcchout) : -1;
#else
    (void)flags;
    (void)str;
    (void)pszassoc;
    (void)pszextra;
    (void)pszout;
    (void)pcchout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1cdefFolderMenuCreate2(JNIEnv* km_env, jclass km_clazz, jlong pidlfolder, jlong hwnd, jint cidl, jlong apidl, jlong psf, jlong pfn, jint nkeys, jlong ahkeys, jlong ppcm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CDefFolderMenu_Create2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlfolder, (void*)(uintptr_t)hwnd, (uint32_t)cidl, (void*)(uintptr_t)apidl, (void*)(uintptr_t)psf, (void*)(uintptr_t)pfn, (uint32_t)nkeys, (void*)(uintptr_t)ahkeys, (void*)(uintptr_t)ppcm) : -1;
#else
    (void)pidlfolder;
    (void)hwnd;
    (void)cidl;
    (void)apidl;
    (void)psf;
    (void)pfn;
    (void)nkeys;
    (void)ahkeys;
    (void)ppcm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1cidldataCreateFromIdarray(JNIEnv* km_env, jclass km_clazz, jlong pidlfolder, jint cidl, jlong apidl, jlong ppdtobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CIDLData_CreateFromIDArray");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlfolder, (uint32_t)cidl, (void*)(uintptr_t)apidl, (void*)(uintptr_t)ppdtobj) : -1;
#else
    (void)pidlfolder;
    (void)cidl;
    (void)apidl;
    (void)ppdtobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1chrCmpIA(JNIEnv* km_env, jclass km_clazz, jshort w1, jshort w2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChrCmpIA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)w1, (uint16_t)w2) : -1;
#else
    (void)w1;
    (void)w2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1chrCmpIW(JNIEnv* km_env, jclass km_clazz, jshort w1, jshort w2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChrCmpIW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)w1, (uint16_t)w2) : -1;
#else
    (void)w1;
    (void)w2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1colorAdjustLuma(JNIEnv* km_env, jclass km_clazz, jint clrrgb, jint n, jint fscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorAdjustLuma");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)clrrgb, (int32_t)n, (int32_t)fscale) : 0;
#else
    (void)clrrgb;
    (void)n;
    (void)fscale;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1colorHLSToRGB(JNIEnv* km_env, jclass km_clazz, jshort whue, jshort wluminance, jshort wsaturation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorHLSToRGB");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)whue, (uint16_t)wluminance, (uint16_t)wsaturation) : 0;
#else
    (void)whue;
    (void)wluminance;
    (void)wsaturation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1colorRGBToHLS(JNIEnv* km_env, jclass km_clazz, jint clrrgb, jlong pwhue, jlong pwluminance, jlong pwsaturation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ColorRGBToHLS");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)clrrgb, (void*)(uintptr_t)pwhue, (void*)(uintptr_t)pwluminance, (void*)(uintptr_t)pwsaturation);
#else
    (void)clrrgb;
    (void)pwhue;
    (void)pwluminance;
    (void)pwsaturation;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1commandLineToArgvW(JNIEnv* km_env, jclass km_clazz, jlong lpcmdline, jlong pnumargs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommandLineToArgvW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpcmdline, (void*)(uintptr_t)pnumargs) : NULL;
#else
    (void)lpcmdline;
    (void)pnumargs;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1connectToConnectionPoint(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong riidevent, jint fconnect, jlong punktarget, jlong pdwcookie, jlong ppcpout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConnectToConnectionPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)riidevent, (int32_t)fconnect, (void*)(uintptr_t)punktarget, (void*)(uintptr_t)pdwcookie, (void*)(uintptr_t)ppcpout) : -1;
#else
    (void)punk;
    (void)riidevent;
    (void)fconnect;
    (void)punktarget;
    (void)pdwcookie;
    (void)ppcpout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1createProfile(JNIEnv* km_env, jclass km_clazz, jlong pszusersid, jlong pszusername, jlong pszprofilepath, jint cchprofilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProfile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszusersid, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszprofilepath, (uint32_t)cchprofilepath) : -1;
#else
    (void)pszusersid;
    (void)pszusername;
    (void)pszprofilepath;
    (void)cchprofilepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1dadAutoScroll(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pad, jlong pptnow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DAD_AutoScroll");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pad, (void*)(uintptr_t)pptnow) : -1;
#else
    (void)hwnd;
    (void)pad;
    (void)pptnow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1dadDragLeave(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DAD_DragLeave");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1dadSetDragImage(JNIEnv* km_env, jclass km_clazz, jlong him, jlong pptoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DAD_SetDragImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)him, (void*)(uintptr_t)pptoffset) : -1;
#else
    (void)him;
    (void)pptoffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1dadShowDragImage(JNIEnv* km_env, jclass km_clazz, jint fshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DAD_ShowDragImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fshow) : -1;
#else
    (void)fshow;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1defSubclassProc(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint umsg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefSubclassProc");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)umsg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)hwnd;
    (void)umsg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1deleteProfileA(JNIEnv* km_env, jclass km_clazz, jlong lpsidstring, jlong lpprofilepath, jlong lpcomputername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteProfileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsidstring, (void*)(uintptr_t)lpprofilepath, (void*)(uintptr_t)lpcomputername) : -1;
#else
    (void)lpsidstring;
    (void)lpprofilepath;
    (void)lpcomputername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1deleteProfileW(JNIEnv* km_env, jclass km_clazz, jlong lpsidstring, jlong lpprofilepath, jlong lpcomputername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteProfileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsidstring, (void*)(uintptr_t)lpprofilepath, (void*)(uintptr_t)lpcomputername) : -1;
#else
    (void)lpsidstring;
    (void)lpprofilepath;
    (void)lpcomputername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1doEnvironmentSubstA(JNIEnv* km_env, jclass km_clazz, jlong pszsrc, jint cchsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DoEnvironmentSubstA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsrc, (uint32_t)cchsrc) : 0;
#else
    (void)pszsrc;
    (void)cchsrc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1doEnvironmentSubstW(JNIEnv* km_env, jclass km_clazz, jlong pszsrc, jint cchsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DoEnvironmentSubstW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsrc, (uint32_t)cchsrc) : 0;
#else
    (void)pszsrc;
    (void)cchsrc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1dragAcceptFiles(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint faccept) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragAcceptFiles");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)faccept);
#else
    (void)hwnd;
    (void)faccept;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1dragFinish(JNIEnv* km_env, jclass km_clazz, jlong hdrop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragFinish");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hdrop);
#else
    (void)hdrop;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1dragQueryFileA(JNIEnv* km_env, jclass km_clazz, jlong hdrop, jint ifile, jlong lpszfile, jint cch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragQueryFileA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdrop, (uint32_t)ifile, (void*)(uintptr_t)lpszfile, (uint32_t)cch) : 0;
#else
    (void)hdrop;
    (void)ifile;
    (void)lpszfile;
    (void)cch;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1dragQueryFileW(JNIEnv* km_env, jclass km_clazz, jlong hdrop, jint ifile, jlong lpszfile, jint cch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragQueryFileW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdrop, (uint32_t)ifile, (void*)(uintptr_t)lpszfile, (uint32_t)cch) : 0;
#else
    (void)hdrop;
    (void)ifile;
    (void)lpszfile;
    (void)cch;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1dragQueryPoint(JNIEnv* km_env, jclass km_clazz, jlong hdrop, jlong ppt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DragQueryPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdrop, (void*)(uintptr_t)ppt) : -1;
#else
    (void)hdrop;
    (void)ppt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1driveType(JNIEnv* km_env, jclass km_clazz, jint idrive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DriveType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)idrive) : -1;
#else
    (void)idrive;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1duplicateIcon(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong hicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateIcon");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)hicon) : NULL;
#else
    (void)hinst;
    (void)hicon;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1extractAssociatedIconA(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong psziconpath, jlong piicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractAssociatedIconA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)psziconpath, (void*)(uintptr_t)piicon) : NULL;
#else
    (void)hinst;
    (void)psziconpath;
    (void)piicon;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1extractAssociatedIconExA(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong psziconpath, jlong piiconindex, jlong piiconid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractAssociatedIconExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)psziconpath, (void*)(uintptr_t)piiconindex, (void*)(uintptr_t)piiconid) : NULL;
#else
    (void)hinst;
    (void)psziconpath;
    (void)piiconindex;
    (void)piiconid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1extractAssociatedIconExW(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong psziconpath, jlong piiconindex, jlong piiconid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractAssociatedIconExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)psziconpath, (void*)(uintptr_t)piiconindex, (void*)(uintptr_t)piiconid) : NULL;
#else
    (void)hinst;
    (void)psziconpath;
    (void)piiconindex;
    (void)piiconid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1extractAssociatedIconW(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong psziconpath, jlong piicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractAssociatedIconW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)psziconpath, (void*)(uintptr_t)piicon) : NULL;
#else
    (void)hinst;
    (void)psziconpath;
    (void)piicon;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1extractIconA(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong pszexefilename, jint niconindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractIconA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)pszexefilename, (uint32_t)niconindex) : NULL;
#else
    (void)hinst;
    (void)pszexefilename;
    (void)niconindex;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1extractIconExA(JNIEnv* km_env, jclass km_clazz, jlong lpszfile, jint niconindex, jlong phiconlarge, jlong phiconsmall, jint nicons) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractIconExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfile, (int32_t)niconindex, (void*)(uintptr_t)phiconlarge, (void*)(uintptr_t)phiconsmall, (uint32_t)nicons) : 0;
#else
    (void)lpszfile;
    (void)niconindex;
    (void)phiconlarge;
    (void)phiconsmall;
    (void)nicons;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1extractIconExW(JNIEnv* km_env, jclass km_clazz, jlong lpszfile, jint niconindex, jlong phiconlarge, jlong phiconsmall, jint nicons) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractIconExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfile, (int32_t)niconindex, (void*)(uintptr_t)phiconlarge, (void*)(uintptr_t)phiconsmall, (uint32_t)nicons) : 0;
#else
    (void)lpszfile;
    (void)niconindex;
    (void)phiconlarge;
    (void)phiconsmall;
    (void)nicons;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1extractIconW(JNIEnv* km_env, jclass km_clazz, jlong hinst, jlong pszexefilename, jint niconindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExtractIconW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (void*)(uintptr_t)pszexefilename, (uint32_t)niconindex) : NULL;
#else
    (void)hinst;
    (void)pszexefilename;
    (void)niconindex;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1findExecutableA(JNIEnv* km_env, jclass km_clazz, jlong lpfile, jlong lpdirectory, jlong lpresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfile, (void*)(uintptr_t)lpdirectory, (void*)(uintptr_t)lpresult) : NULL;
#else
    (void)lpfile;
    (void)lpdirectory;
    (void)lpresult;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1findExecutableW(JNIEnv* km_env, jclass km_clazz, jlong lpfile, jlong lpdirectory, jlong lpresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindExecutableW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfile, (void*)(uintptr_t)lpdirectory, (void*)(uintptr_t)lpresult) : NULL;
#else
    (void)lpfile;
    (void)lpdirectory;
    (void)lpresult;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getAcceptLanguagesA(JNIEnv* km_env, jclass km_clazz, jlong pszlanguages, jlong pcchlanguages) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAcceptLanguagesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlanguages, (void*)(uintptr_t)pcchlanguages) : -1;
#else
    (void)pszlanguages;
    (void)pcchlanguages;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getAcceptLanguagesW(JNIEnv* km_env, jclass km_clazz, jlong pszlanguages, jlong pcchlanguages) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAcceptLanguagesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlanguages, (void*)(uintptr_t)pcchlanguages) : -1;
#else
    (void)pszlanguages;
    (void)pcchlanguages;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getAllUsersProfileDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpprofiledir, jlong lpcchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAllUsersProfileDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprofiledir, (void*)(uintptr_t)lpcchsize) : -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getAllUsersProfileDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpprofiledir, jlong lpcchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAllUsersProfileDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprofiledir, (void*)(uintptr_t)lpcchsize) : -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getCurrentProcessExplicitAppUserModelID(JNIEnv* km_env, jclass km_clazz, jlong appid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcessExplicitAppUserModelID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)appid) : -1;
#else
    (void)appid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getDefaultUserProfileDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpprofiledir, jlong lpcchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultUserProfileDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprofiledir, (void*)(uintptr_t)lpcchsize) : -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getDefaultUserProfileDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpprofiledir, jlong lpcchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDefaultUserProfileDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprofiledir, (void*)(uintptr_t)lpcchsize) : -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getDpiForShellUIComponent(JNIEnv* km_env, jclass km_clazz, jint param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDpiForShellUIComponent");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getFileNameFromBrowse(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszfilepath, jint cchfilepath, jlong pszworkingdir, jlong pszdefext, jlong pszfilters, jlong psztitle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileNameFromBrowse");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszfilepath, (uint32_t)cchfilepath, (void*)(uintptr_t)pszworkingdir, (void*)(uintptr_t)pszdefext, (void*)(uintptr_t)pszfilters, (void*)(uintptr_t)psztitle) : -1;
#else
    (void)hwnd;
    (void)pszfilepath;
    (void)cchfilepath;
    (void)pszworkingdir;
    (void)pszdefext;
    (void)pszfilters;
    (void)psztitle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getMenuContextHelpId(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuContextHelpId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getMenuPosFromID(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMenuPosFromID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (uint32_t)id) : -1;
#else
    (void)hmenu;
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getProfileType(JNIEnv* km_env, jclass km_clazz, jlong dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfileType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dwflags) : -1;
#else
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getProfilesDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lpprofiledir, jlong lpcchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfilesDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprofiledir, (void*)(uintptr_t)lpcchsize) : -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getProfilesDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lpprofiledir, jlong lpcchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProfilesDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpprofiledir, (void*)(uintptr_t)lpcchsize) : -1;
#else
    (void)lpprofiledir;
    (void)lpcchsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getScaleFactorForDevice(JNIEnv* km_env, jclass km_clazz, jint devicetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScaleFactorForDevice");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)devicetype) : -1;
#else
    (void)devicetype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getScaleFactorForMonitor(JNIEnv* km_env, jclass km_clazz, jlong hmon, jlong pscale) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetScaleFactorForMonitor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmon, (void*)(uintptr_t)pscale) : -1;
#else
    (void)hmon;
    (void)pscale;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getUserProfileDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpprofiledir, jlong lpcchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserProfileDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpprofiledir, (void*)(uintptr_t)lpcchsize) : -1;
#else
    (void)htoken;
    (void)lpprofiledir;
    (void)lpcchsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getUserProfileDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpprofiledir, jlong lpcchsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserProfileDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpprofiledir, (void*)(uintptr_t)lpcchsize) : -1;
#else
    (void)htoken;
    (void)lpprofiledir;
    (void)lpcchsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getWindowContextHelpId(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowContextHelpId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : 0;
#else
    (void)param0;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1getWindowSubclass(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pfnsubclass, jlong uidsubclass, jlong pdwrefdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowSubclass");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pfnsubclass, (uint64_t)uidsubclass, (void*)(uintptr_t)pdwrefdata) : -1;
#else
    (void)hwnd;
    (void)pfnsubclass;
    (void)uidsubclass;
    (void)pdwrefdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hmonitorUserFree(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
#else
    (void)param0;
    (void)param1;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hmonitorUserFree64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserFree64");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1);
#else
    (void)param0;
    (void)param1;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hmonitorUserMarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserMarshal");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hmonitorUserMarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserMarshal64");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hmonitorUserSize(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hmonitorUserSize64(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserSize64");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1, (void*)(uintptr_t)param2) : 0;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hmonitorUserUnmarshal(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserUnmarshal");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hmonitorUserUnmarshal64(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HMONITOR_UserUnmarshal64");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2) : NULL;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hashData(JNIEnv* km_env, jclass km_clazz, jlong pbdata, jint cbdata, jlong pbhash, jint cbhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HashData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbdata, (uint32_t)cbdata, (void*)(uintptr_t)pbhash, (uint32_t)cbhash) : -1;
#else
    (void)pbdata;
    (void)cbdata;
    (void)pbhash;
    (void)cbhash;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkClone(JNIEnv* km_env, jclass km_clazz, jlong pihl, jlong riid, jlong pihlsiteforclone, jint dwsitedata, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkClone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pihl, (void*)(uintptr_t)riid, (void*)(uintptr_t)pihlsiteforclone, (uint32_t)dwsitedata, (void*)(uintptr_t)ppvobj) : -1;
#else
    (void)pihl;
    (void)riid;
    (void)pihlsiteforclone;
    (void)dwsitedata;
    (void)ppvobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkCreateBrowseContext(JNIEnv* km_env, jclass km_clazz, jlong piunkouter, jlong riid, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateBrowseContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)piunkouter, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobj) : -1;
#else
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkCreateExtensionServices(JNIEnv* km_env, jclass km_clazz, jlong pwzadditionalheaders, jlong phwnd, jlong pszusername, jlong pszpassword, jlong piunkouter, jlong riid, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateExtensionServices");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzadditionalheaders, (void*)(uintptr_t)phwnd, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszpassword, (void*)(uintptr_t)piunkouter, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobj) : -1;
#else
    (void)pwzadditionalheaders;
    (void)phwnd;
    (void)pszusername;
    (void)pszpassword;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkCreateFromData(JNIEnv* km_env, jclass km_clazz, jlong pidataobj, jlong pihlsite, jint dwsitedata, jlong piunkouter, jlong riid, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateFromData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidataobj, (void*)(uintptr_t)pihlsite, (uint32_t)dwsitedata, (void*)(uintptr_t)piunkouter, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobj) : -1;
#else
    (void)pidataobj;
    (void)pihlsite;
    (void)dwsitedata;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkCreateFromMoniker(JNIEnv* km_env, jclass km_clazz, jlong pimktrgt, jlong pwzlocation, jlong pwzfriendlyname, jlong pihlsite, jint dwsitedata, jlong piunkouter, jlong riid, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateFromMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pimktrgt, (void*)(uintptr_t)pwzlocation, (void*)(uintptr_t)pwzfriendlyname, (void*)(uintptr_t)pihlsite, (uint32_t)dwsitedata, (void*)(uintptr_t)piunkouter, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobj) : -1;
#else
    (void)pimktrgt;
    (void)pwzlocation;
    (void)pwzfriendlyname;
    (void)pihlsite;
    (void)dwsitedata;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkCreateFromString(JNIEnv* km_env, jclass km_clazz, jlong pwztarget, jlong pwzlocation, jlong pwzfriendlyname, jlong pihlsite, jint dwsitedata, jlong piunkouter, jlong riid, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateFromString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwztarget, (void*)(uintptr_t)pwzlocation, (void*)(uintptr_t)pwzfriendlyname, (void*)(uintptr_t)pihlsite, (uint32_t)dwsitedata, (void*)(uintptr_t)piunkouter, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobj) : -1;
#else
    (void)pwztarget;
    (void)pwzlocation;
    (void)pwzfriendlyname;
    (void)pihlsite;
    (void)dwsitedata;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkCreateShortcut(JNIEnv* km_env, jclass km_clazz, jint grfhlshortcutf, jlong pihl, jlong pwzdir, jlong pwzfilename, jlong ppwzshortcutfile, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateShortcut");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)grfhlshortcutf, (void*)(uintptr_t)pihl, (void*)(uintptr_t)pwzdir, (void*)(uintptr_t)pwzfilename, (void*)(uintptr_t)ppwzshortcutfile, (uint32_t)dwreserved) : -1;
#else
    (void)grfhlshortcutf;
    (void)pihl;
    (void)pwzdir;
    (void)pwzfilename;
    (void)ppwzshortcutfile;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkCreateShortcutFromMoniker(JNIEnv* km_env, jclass km_clazz, jint grfhlshortcutf, jlong pimktarget, jlong pwzlocation, jlong pwzdir, jlong pwzfilename, jlong ppwzshortcutfile, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateShortcutFromMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)grfhlshortcutf, (void*)(uintptr_t)pimktarget, (void*)(uintptr_t)pwzlocation, (void*)(uintptr_t)pwzdir, (void*)(uintptr_t)pwzfilename, (void*)(uintptr_t)ppwzshortcutfile, (uint32_t)dwreserved) : -1;
#else
    (void)grfhlshortcutf;
    (void)pimktarget;
    (void)pwzlocation;
    (void)pwzdir;
    (void)pwzfilename;
    (void)ppwzshortcutfile;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkCreateShortcutFromString(JNIEnv* km_env, jclass km_clazz, jint grfhlshortcutf, jlong pwztarget, jlong pwzlocation, jlong pwzdir, jlong pwzfilename, jlong ppwzshortcutfile, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkCreateShortcutFromString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)grfhlshortcutf, (void*)(uintptr_t)pwztarget, (void*)(uintptr_t)pwzlocation, (void*)(uintptr_t)pwzdir, (void*)(uintptr_t)pwzfilename, (void*)(uintptr_t)ppwzshortcutfile, (uint32_t)dwreserved) : -1;
#else
    (void)grfhlshortcutf;
    (void)pwztarget;
    (void)pwzlocation;
    (void)pwzdir;
    (void)pwzfilename;
    (void)ppwzshortcutfile;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkGetSpecialReference(JNIEnv* km_env, jclass km_clazz, jint ureference, jlong ppwzreference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkGetSpecialReference");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ureference, (void*)(uintptr_t)ppwzreference) : -1;
#else
    (void)ureference;
    (void)ppwzreference;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkGetValueFromParams(JNIEnv* km_env, jclass km_clazz, jlong pwzparams, jlong pwzname, jlong ppwzvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkGetValueFromParams");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzparams, (void*)(uintptr_t)pwzname, (void*)(uintptr_t)ppwzvalue) : -1;
#else
    (void)pwzparams;
    (void)pwzname;
    (void)ppwzvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkIsShortcut(JNIEnv* km_env, jclass km_clazz, jlong pwzfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkIsShortcut");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzfilename) : -1;
#else
    (void)pwzfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkNavigate(JNIEnv* km_env, jclass km_clazz, jlong pihl, jlong pihlframe, jint grfhlnf, jlong pbc, jlong pibsc, jlong pihlbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkNavigate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pihl, (void*)(uintptr_t)pihlframe, (uint32_t)grfhlnf, (void*)(uintptr_t)pbc, (void*)(uintptr_t)pibsc, (void*)(uintptr_t)pihlbc) : -1;
#else
    (void)pihl;
    (void)pihlframe;
    (void)grfhlnf;
    (void)pbc;
    (void)pibsc;
    (void)pihlbc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkNavigateToStringReference(JNIEnv* km_env, jclass km_clazz, jlong pwztarget, jlong pwzlocation, jlong pihlsite, jint dwsitedata, jlong pihlframe, jint grfhlnf, jlong pibc, jlong pibsc, jlong pihlbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkNavigateToStringReference");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwztarget, (void*)(uintptr_t)pwzlocation, (void*)(uintptr_t)pihlsite, (uint32_t)dwsitedata, (void*)(uintptr_t)pihlframe, (uint32_t)grfhlnf, (void*)(uintptr_t)pibc, (void*)(uintptr_t)pibsc, (void*)(uintptr_t)pihlbc) : -1;
#else
    (void)pwztarget;
    (void)pwzlocation;
    (void)pihlsite;
    (void)dwsitedata;
    (void)pihlframe;
    (void)grfhlnf;
    (void)pibc;
    (void)pibsc;
    (void)pihlbc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkOnNavigate(JNIEnv* km_env, jclass km_clazz, jlong pihlframe, jlong pihlbc, jint grfhlnf, jlong pimktarget, jlong pwzlocation, jlong pwzfriendlyname, jlong puhlid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkOnNavigate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pihlframe, (void*)(uintptr_t)pihlbc, (uint32_t)grfhlnf, (void*)(uintptr_t)pimktarget, (void*)(uintptr_t)pwzlocation, (void*)(uintptr_t)pwzfriendlyname, (void*)(uintptr_t)puhlid) : -1;
#else
    (void)pihlframe;
    (void)pihlbc;
    (void)grfhlnf;
    (void)pimktarget;
    (void)pwzlocation;
    (void)pwzfriendlyname;
    (void)puhlid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkOnRenameDocument(JNIEnv* km_env, jclass km_clazz, jint dwreserved, jlong pihlbc, jlong pimkold, jlong pimknew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkOnRenameDocument");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwreserved, (void*)(uintptr_t)pihlbc, (void*)(uintptr_t)pimkold, (void*)(uintptr_t)pimknew) : -1;
#else
    (void)dwreserved;
    (void)pihlbc;
    (void)pimkold;
    (void)pimknew;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkParseDisplayName(JNIEnv* km_env, jclass km_clazz, jlong pibc, jlong pwzdisplayname, jint fnoforceabs, jlong pccheaten, jlong ppimk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkParseDisplayName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pibc, (void*)(uintptr_t)pwzdisplayname, (int32_t)fnoforceabs, (void*)(uintptr_t)pccheaten, (void*)(uintptr_t)ppimk) : -1;
#else
    (void)pibc;
    (void)pwzdisplayname;
    (void)fnoforceabs;
    (void)pccheaten;
    (void)ppimk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkPreprocessMoniker(JNIEnv* km_env, jclass km_clazz, jlong pibc, jlong pimkin, jlong ppimkout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkPreprocessMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pibc, (void*)(uintptr_t)pimkin, (void*)(uintptr_t)ppimkout) : -1;
#else
    (void)pibc;
    (void)pimkin;
    (void)ppimkout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkQueryCreateFromData(JNIEnv* km_env, jclass km_clazz, jlong pidataobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkQueryCreateFromData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidataobj) : -1;
#else
    (void)pidataobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkResolveMonikerForData(JNIEnv* km_env, jclass km_clazz, jlong pimkreference, jint reserved, jlong pibc, jint cfmtetc, jlong rgfmtetc, jlong pibsc, jlong pimkbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveMonikerForData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pimkreference, (uint32_t)reserved, (void*)(uintptr_t)pibc, (uint32_t)cfmtetc, (void*)(uintptr_t)rgfmtetc, (void*)(uintptr_t)pibsc, (void*)(uintptr_t)pimkbase) : -1;
#else
    (void)pimkreference;
    (void)reserved;
    (void)pibc;
    (void)cfmtetc;
    (void)rgfmtetc;
    (void)pibsc;
    (void)pimkbase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkResolveShortcut(JNIEnv* km_env, jclass km_clazz, jlong pwzshortcutfilename, jlong pihlsite, jint dwsitedata, jlong piunkouter, jlong riid, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveShortcut");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzshortcutfilename, (void*)(uintptr_t)pihlsite, (uint32_t)dwsitedata, (void*)(uintptr_t)piunkouter, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobj) : -1;
#else
    (void)pwzshortcutfilename;
    (void)pihlsite;
    (void)dwsitedata;
    (void)piunkouter;
    (void)riid;
    (void)ppvobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkResolveShortcutToMoniker(JNIEnv* km_env, jclass km_clazz, jlong pwzshortcutfilename, jlong ppimktarget, jlong ppwzlocation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveShortcutToMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzshortcutfilename, (void*)(uintptr_t)ppimktarget, (void*)(uintptr_t)ppwzlocation) : -1;
#else
    (void)pwzshortcutfilename;
    (void)ppimktarget;
    (void)ppwzlocation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkResolveShortcutToString(JNIEnv* km_env, jclass km_clazz, jlong pwzshortcutfilename, jlong ppwztarget, jlong ppwzlocation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveShortcutToString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzshortcutfilename, (void*)(uintptr_t)ppwztarget, (void*)(uintptr_t)ppwzlocation) : -1;
#else
    (void)pwzshortcutfilename;
    (void)ppwztarget;
    (void)ppwzlocation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkResolveStringForData(JNIEnv* km_env, jclass km_clazz, jlong pwzreference, jint reserved, jlong pibc, jint cfmtetc, jlong rgfmtetc, jlong pibsc, jlong pimkbase) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkResolveStringForData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzreference, (uint32_t)reserved, (void*)(uintptr_t)pibc, (uint32_t)cfmtetc, (void*)(uintptr_t)rgfmtetc, (void*)(uintptr_t)pibsc, (void*)(uintptr_t)pimkbase) : -1;
#else
    (void)pwzreference;
    (void)reserved;
    (void)pibc;
    (void)cfmtetc;
    (void)rgfmtetc;
    (void)pibsc;
    (void)pimkbase;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkSetSpecialReference(JNIEnv* km_env, jclass km_clazz, jint ureference, jlong pwzreference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkSetSpecialReference");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ureference, (void*)(uintptr_t)pwzreference) : -1;
#else
    (void)ureference;
    (void)pwzreference;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkTranslateURL(JNIEnv* km_env, jclass km_clazz, jlong pwzurl, jint grfflags, jlong ppwztranslatedurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkTranslateURL");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzurl, (uint32_t)grfflags, (void*)(uintptr_t)ppwztranslatedurl) : -1;
#else
    (void)pwzurl;
    (void)grfflags;
    (void)ppwztranslatedurl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1hlinkUpdateStackItem(JNIEnv* km_env, jclass km_clazz, jlong pihlframe, jlong pihlbc, jint uhlid, jlong pimktrgt, jlong pwzlocation, jlong pwzfriendlyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HlinkUpdateStackItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pihlframe, (void*)(uintptr_t)pihlbc, (uint32_t)uhlid, (void*)(uintptr_t)pimktrgt, (void*)(uintptr_t)pwzlocation, (void*)(uintptr_t)pwzfriendlyname) : -1;
#else
    (void)pihlframe;
    (void)pihlbc;
    (void)uhlid;
    (void)pimktrgt;
    (void)pwzlocation;
    (void)pwzfriendlyname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLAppendID(JNIEnv* km_env, jclass km_clazz, jlong pidl, jlong pmkid, jint fappend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILAppendID");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl, (void*)(uintptr_t)pmkid, (int32_t)fappend) : NULL;
#else
    (void)pidl;
    (void)pmkid;
    (void)fappend;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLClone(JNIEnv* km_env, jclass km_clazz, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILClone");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl) : NULL;
#else
    (void)pidl;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLCloneFirst(JNIEnv* km_env, jclass km_clazz, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILCloneFirst");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl) : NULL;
#else
    (void)pidl;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLCombine(JNIEnv* km_env, jclass km_clazz, jlong pidl1, jlong pidl2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILCombine");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl1, (void*)(uintptr_t)pidl2) : NULL;
#else
    (void)pidl1;
    (void)pidl2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLCreateFromPathA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILCreateFromPathA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLCreateFromPathW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILCreateFromPathW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLFindChild(JNIEnv* km_env, jclass km_clazz, jlong pidlparent, jlong pidlchild) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILFindChild");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlparent, (void*)(uintptr_t)pidlchild) : NULL;
#else
    (void)pidlparent;
    (void)pidlchild;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLFindLastID(JNIEnv* km_env, jclass km_clazz, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILFindLastID");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl) : NULL;
#else
    (void)pidl;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLFree(JNIEnv* km_env, jclass km_clazz, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pidl);
#else
    (void)pidl;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLGetNext(JNIEnv* km_env, jclass km_clazz, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILGetNext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl) : NULL;
#else
    (void)pidl;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLGetSize(JNIEnv* km_env, jclass km_clazz, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILGetSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl) : 0;
#else
    (void)pidl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLIsEqual(JNIEnv* km_env, jclass km_clazz, jlong pidl1, jlong pidl2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILIsEqual");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl1, (void*)(uintptr_t)pidl2) : -1;
#else
    (void)pidl1;
    (void)pidl2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLIsParent(JNIEnv* km_env, jclass km_clazz, jlong pidl1, jlong pidl2, jint fimmediate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILIsParent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl1, (void*)(uintptr_t)pidl2, (int32_t)fimmediate) : -1;
#else
    (void)pidl1;
    (void)pidl2;
    (void)fimmediate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLLoadFromStreamEx(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILLoadFromStreamEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)pidl) : -1;
#else
    (void)pstm;
    (void)pidl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLRemoveLastID(JNIEnv* km_env, jclass km_clazz, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILRemoveLastID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl) : -1;
#else
    (void)pidl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iLSaveToStream(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ILSaveToStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)pidl) : -1;
#else
    (void)pstm;
    (void)pidl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1istreamCopy(JNIEnv* km_env, jclass km_clazz, jlong pstmfrom, jlong pstmto, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Copy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstmfrom, (void*)(uintptr_t)pstmto, (uint32_t)cb) : -1;
#else
    (void)pstmfrom;
    (void)pstmto;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1istreamRead(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Read");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)pv, (uint32_t)cb) : -1;
#else
    (void)pstm;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1istreamReadPidl(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong ppidlout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_ReadPidl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)ppidlout) : -1;
#else
    (void)pstm;
    (void)ppidlout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1istreamReadStr(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong ppsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_ReadStr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)ppsz) : -1;
#else
    (void)pstm;
    (void)ppsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1istreamReset(JNIEnv* km_env, jclass km_clazz, jlong pstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Reset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm) : -1;
#else
    (void)pstm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1istreamSize(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong pui) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Size");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)pui) : -1;
#else
    (void)pstm;
    (void)pui;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1istreamWrite(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_Write");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)pv, (uint32_t)cb) : -1;
#else
    (void)pstm;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1istreamWritePidl(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong pidlwrite) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_WritePidl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)pidlwrite) : -1;
#else
    (void)pstm;
    (void)pidlwrite;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1istreamWriteStr(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong psz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IStream_WriteStr");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)psz) : -1;
#else
    (void)pstm;
    (void)psz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iunknownAtomicRelease(JNIEnv* km_env, jclass km_clazz, jlong ppunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_AtomicRelease");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ppunk);
#else
    (void)ppunk;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iunknownGetSite(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_GetSite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)punk;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iunknownGetWindow(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong phwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_GetWindow");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)phwnd) : -1;
#else
    (void)punk;
    (void)phwnd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iunknownQueryService(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong guidservice, jlong riid, jlong ppvout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_QueryService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)guidservice, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvout) : -1;
#else
    (void)punk;
    (void)guidservice;
    (void)riid;
    (void)ppvout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iunknownSet(JNIEnv* km_env, jclass km_clazz, jlong ppunk, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_Set");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ppunk, (void*)(uintptr_t)punk);
#else
    (void)ppunk;
    (void)punk;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1iunknownSetSite(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong punksite) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IUnknown_SetSite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)punksite) : -1;
#else
    (void)punk;
    (void)punksite;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1importPrivacySettings(JNIEnv* km_env, jclass km_clazz, jlong pszfilename, jlong pfparseprivacypreferences, jlong pfparsepersiterules) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shdocvw.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportPrivacySettings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfilename, (void*)(uintptr_t)pfparseprivacypreferences, (void*)(uintptr_t)pfparsepersiterules) : -1;
#else
    (void)pszfilename;
    (void)pfparseprivacypreferences;
    (void)pfparsepersiterules;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1initNetworkAddressControl(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitNetworkAddressControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1initPropVariantFromStrRet(JNIEnv* km_env, jclass km_clazz, jlong pstrret, jlong pidl, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromStrRet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstrret, (void*)(uintptr_t)pidl, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)pstrret;
    (void)pidl;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1initVariantFromStrRet(JNIEnv* km_env, jclass km_clazz, jlong pstrret, jlong pidl, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitVariantFromStrRet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstrret, (void*)(uintptr_t)pidl, (void*)(uintptr_t)pvar) : -1;
#else
    (void)pstrret;
    (void)pidl;
    (void)pvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1intlStrEqWorkerA(JNIEnv* km_env, jclass km_clazz, jint fcasesens, jlong lpstring1, jlong lpstring2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntlStrEqWorkerA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fcasesens, (void*)(uintptr_t)lpstring1, (void*)(uintptr_t)lpstring2, (int32_t)nchar) : -1;
#else
    (void)fcasesens;
    (void)lpstring1;
    (void)lpstring2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1intlStrEqWorkerW(JNIEnv* km_env, jclass km_clazz, jint fcasesens, jlong lpstring1, jlong lpstring2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IntlStrEqWorkerW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fcasesens, (void*)(uintptr_t)lpstring1, (void*)(uintptr_t)lpstring2, (int32_t)nchar) : -1;
#else
    (void)fcasesens;
    (void)lpstring1;
    (void)lpstring2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1isCharSpaceA(JNIEnv* km_env, jclass km_clazz, jbyte wch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharSpaceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int8_t)wch) : -1;
#else
    (void)wch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1isCharSpaceW(JNIEnv* km_env, jclass km_clazz, jshort wch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCharSpaceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)wch) : -1;
#else
    (void)wch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1isInternetESCEnabled(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsInternetESCEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1isLFNDriveA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsLFNDriveA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1isLFNDriveW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsLFNDriveW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1isNetDrive(JNIEnv* km_env, jclass km_clazz, jint idrive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsNetDrive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)idrive) : -1;
#else
    (void)idrive;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1isOS(JNIEnv* km_env, jclass km_clazz, jint dwos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsOS");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwos) : -1;
#else
    (void)dwos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1isUserAnAdmin(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsUserAnAdmin");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1loadUserProfileA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpprofileinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadUserProfileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpprofileinfo) : -1;
#else
    (void)htoken;
    (void)lpprofileinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1loadUserProfileW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpprofileinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LoadUserProfileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpprofileinfo) : -1;
#else
    (void)htoken;
    (void)lpprofileinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1oleSaveToStreamEx(JNIEnv* km_env, jclass km_clazz, jlong piunk, jlong pistm, jint fcleardirty) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("hlink.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleSaveToStreamEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)piunk, (void*)(uintptr_t)pistm, (int32_t)fcleardirty) : -1;
#else
    (void)piunk;
    (void)pistm;
    (void)fcleardirty;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1openRegStream(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jint grfmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenRegStream");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (uint32_t)grfmode) : NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1parseURLA(JNIEnv* km_env, jclass km_clazz, jlong pcszurl, jlong ppu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseURLA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcszurl, (void*)(uintptr_t)ppu) : -1;
#else
    (void)pcszurl;
    (void)ppu;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1parseURLW(JNIEnv* km_env, jclass km_clazz, jlong pcszurl, jlong ppu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseURLW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcszurl, (void*)(uintptr_t)ppu) : -1;
#else
    (void)pcszurl;
    (void)ppu;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathAddBackslashA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAddBackslashA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathAddBackslashW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAddBackslashW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathAddExtensionA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAddExtensionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszext) : -1;
#else
    (void)pszpath;
    (void)pszext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathAddExtensionW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAddExtensionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszext) : -1;
#else
    (void)pszpath;
    (void)pszext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathAllocCanonicalize(JNIEnv* km_env, jclass km_clazz, jlong pszpathin, jint dwflags, jlong ppszpathout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAllocCanonicalize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpathin, (uint32_t)dwflags, (void*)(uintptr_t)ppszpathout) : -1;
#else
    (void)pszpathin;
    (void)dwflags;
    (void)ppszpathout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathAllocCombine(JNIEnv* km_env, jclass km_clazz, jlong pszpathin, jlong pszmore, jint dwflags, jlong ppszpathout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAllocCombine");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpathin, (void*)(uintptr_t)pszmore, (uint32_t)dwflags, (void*)(uintptr_t)ppszpathout) : -1;
#else
    (void)pszpathin;
    (void)pszmore;
    (void)dwflags;
    (void)ppszpathout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathAppendA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszmore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAppendA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszmore) : -1;
#else
    (void)pszpath;
    (void)pszmore;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathAppendW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszmore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathAppendW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszmore) : -1;
#else
    (void)pszpath;
    (void)pszmore;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathBuildRootA(JNIEnv* km_env, jclass km_clazz, jlong pszroot, jint idrive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathBuildRootA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszroot, (int32_t)idrive) : NULL;
#else
    (void)pszroot;
    (void)idrive;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathBuildRootW(JNIEnv* km_env, jclass km_clazz, jlong pszroot, jint idrive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathBuildRootW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszroot, (int32_t)idrive) : NULL;
#else
    (void)pszroot;
    (void)idrive;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCanonicalizeA(JNIEnv* km_env, jclass km_clazz, jlong pszbuf, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCanonicalizeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszbuf, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszbuf;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCanonicalizeW(JNIEnv* km_env, jclass km_clazz, jlong pszbuf, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCanonicalizeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszbuf, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszbuf;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchAddBackslash(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAddBackslash");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchAddBackslashEx(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath, jlong ppszend, jlong pcchremaining) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAddBackslashEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath, (void*)(uintptr_t)ppszend, (void*)(uintptr_t)pcchremaining) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)ppszend;
    (void)pcchremaining;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchAddExtension(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath, jlong pszext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAddExtension");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath, (void*)(uintptr_t)pszext) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)pszext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchAppend(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath, jlong pszmore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAppend");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath, (void*)(uintptr_t)pszmore) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)pszmore;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchAppendEx(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath, jlong pszmore, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchAppendEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath, (void*)(uintptr_t)pszmore, (uint32_t)dwflags) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)pszmore;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchCanonicalize(JNIEnv* km_env, jclass km_clazz, jlong pszpathout, jlong cchpathout, jlong pszpathin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchCanonicalize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpathout, (uint64_t)cchpathout, (void*)(uintptr_t)pszpathin) : -1;
#else
    (void)pszpathout;
    (void)cchpathout;
    (void)pszpathin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchCanonicalizeEx(JNIEnv* km_env, jclass km_clazz, jlong pszpathout, jlong cchpathout, jlong pszpathin, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchCanonicalizeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpathout, (uint64_t)cchpathout, (void*)(uintptr_t)pszpathin, (uint32_t)dwflags) : -1;
#else
    (void)pszpathout;
    (void)cchpathout;
    (void)pszpathin;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchCombine(JNIEnv* km_env, jclass km_clazz, jlong pszpathout, jlong cchpathout, jlong pszpathin, jlong pszmore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchCombine");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpathout, (uint64_t)cchpathout, (void*)(uintptr_t)pszpathin, (void*)(uintptr_t)pszmore) : -1;
#else
    (void)pszpathout;
    (void)cchpathout;
    (void)pszpathin;
    (void)pszmore;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchCombineEx(JNIEnv* km_env, jclass km_clazz, jlong pszpathout, jlong cchpathout, jlong pszpathin, jlong pszmore, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchCombineEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpathout, (uint64_t)cchpathout, (void*)(uintptr_t)pszpathin, (void*)(uintptr_t)pszmore, (uint32_t)dwflags) : -1;
#else
    (void)pszpathout;
    (void)cchpathout;
    (void)pszpathin;
    (void)pszmore;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchFindExtension(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath, jlong ppszext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchFindExtension");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath, (void*)(uintptr_t)ppszext) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)ppszext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchIsRoot(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchIsRoot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchRemoveBackslash(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRemoveBackslash");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchRemoveBackslashEx(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath, jlong ppszend, jlong pcchremaining) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRemoveBackslashEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath, (void*)(uintptr_t)ppszend, (void*)(uintptr_t)pcchremaining) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)ppszend;
    (void)pcchremaining;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchRemoveExtension(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRemoveExtension");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchRemoveFileSpec(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRemoveFileSpec");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchRenameExtension(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath, jlong pszext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchRenameExtension");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath, (void*)(uintptr_t)pszext) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    (void)pszext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchSkipRoot(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong ppszrootend) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchSkipRoot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)ppszrootend) : -1;
#else
    (void)pszpath;
    (void)ppszrootend;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchStripPrefix(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchStripPrefix");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCchStripToRoot(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong cchpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCchStripToRoot");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint64_t)cchpath) : -1;
#else
    (void)pszpath;
    (void)cchpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCleanupSpec(JNIEnv* km_env, jclass km_clazz, jlong pszdir, jlong pszspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCleanupSpec");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdir, (void*)(uintptr_t)pszspec) : -1;
#else
    (void)pszdir;
    (void)pszspec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCombineA(JNIEnv* km_env, jclass km_clazz, jlong pszdest, jlong pszdir, jlong pszfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCombineA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdest, (void*)(uintptr_t)pszdir, (void*)(uintptr_t)pszfile) : NULL;
#else
    (void)pszdest;
    (void)pszdir;
    (void)pszfile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCombineW(JNIEnv* km_env, jclass km_clazz, jlong pszdest, jlong pszdir, jlong pszfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCombineW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdest, (void*)(uintptr_t)pszdir, (void*)(uintptr_t)pszfile) : NULL;
#else
    (void)pszdest;
    (void)pszdir;
    (void)pszfile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCommonPrefixA(JNIEnv* km_env, jclass km_clazz, jlong pszfile1, jlong pszfile2, jlong achpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCommonPrefixA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile1, (void*)(uintptr_t)pszfile2, (void*)(uintptr_t)achpath) : -1;
#else
    (void)pszfile1;
    (void)pszfile2;
    (void)achpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCommonPrefixW(JNIEnv* km_env, jclass km_clazz, jlong pszfile1, jlong pszfile2, jlong achpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCommonPrefixW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile1, (void*)(uintptr_t)pszfile2, (void*)(uintptr_t)achpath) : -1;
#else
    (void)pszfile1;
    (void)pszfile2;
    (void)achpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCompactPathA(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pszpath, jint dx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCompactPathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pszpath, (uint32_t)dx) : -1;
#else
    (void)hdc;
    (void)pszpath;
    (void)dx;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCompactPathExA(JNIEnv* km_env, jclass km_clazz, jlong pszout, jlong pszsrc, jint cchmax, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCompactPathExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszout, (void*)(uintptr_t)pszsrc, (uint32_t)cchmax, (uint32_t)dwflags) : -1;
#else
    (void)pszout;
    (void)pszsrc;
    (void)cchmax;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCompactPathExW(JNIEnv* km_env, jclass km_clazz, jlong pszout, jlong pszsrc, jint cchmax, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCompactPathExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszout, (void*)(uintptr_t)pszsrc, (uint32_t)cchmax, (uint32_t)dwflags) : -1;
#else
    (void)pszout;
    (void)pszsrc;
    (void)cchmax;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCompactPathW(JNIEnv* km_env, jclass km_clazz, jlong hdc, jlong pszpath, jint dx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCompactPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc, (void*)(uintptr_t)pszpath, (uint32_t)dx) : -1;
#else
    (void)hdc;
    (void)pszpath;
    (void)dx;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCreateFromUrlA(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszpath, jlong pcchpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCreateFromUrlA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszpath, (void*)(uintptr_t)pcchpath, (uint32_t)dwflags) : -1;
#else
    (void)pszurl;
    (void)pszpath;
    (void)pcchpath;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCreateFromUrlAlloc(JNIEnv* km_env, jclass km_clazz, jlong pszin, jlong ppszout, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCreateFromUrlAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszin, (void*)(uintptr_t)ppszout, (uint32_t)dwflags) : -1;
#else
    (void)pszin;
    (void)ppszout;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathCreateFromUrlW(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszpath, jlong pcchpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathCreateFromUrlW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszpath, (void*)(uintptr_t)pcchpath, (uint32_t)dwflags) : -1;
#else
    (void)pszurl;
    (void)pszpath;
    (void)pcchpath;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFileExistsA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFileExistsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFileExistsW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFileExistsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindExtensionA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindExtensionA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindExtensionW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindExtensionW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindFileNameA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindFileNameA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindFileNameW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindFileNameW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindNextComponentA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindNextComponentA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindNextComponentW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindNextComponentW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindOnPathA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong ppszotherdirs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindOnPathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)ppszotherdirs) : -1;
#else
    (void)pszpath;
    (void)ppszotherdirs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindOnPathW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong ppszotherdirs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindOnPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)ppszotherdirs) : -1;
#else
    (void)pszpath;
    (void)ppszotherdirs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindSuffixArrayA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong apszsuffix, jint iarraysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindSuffixArrayA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)apszsuffix, (int32_t)iarraysize) : NULL;
#else
    (void)pszpath;
    (void)apszsuffix;
    (void)iarraysize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathFindSuffixArrayW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong apszsuffix, jint iarraysize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathFindSuffixArrayW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)apszsuffix, (int32_t)iarraysize) : NULL;
#else
    (void)pszpath;
    (void)apszsuffix;
    (void)iarraysize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathGetArgsA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetArgsA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathGetArgsW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetArgsW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathGetCharTypeA(JNIEnv* km_env, jclass km_clazz, jbyte ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetCharTypeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint8_t)ch) : 0;
#else
    (void)ch;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathGetCharTypeW(JNIEnv* km_env, jclass km_clazz, jshort ch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetCharTypeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)ch) : 0;
#else
    (void)ch;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathGetDriveNumberA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetDriveNumberA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathGetDriveNumberW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetDriveNumberW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathGetShortPath(JNIEnv* km_env, jclass km_clazz, jlong pszlongpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathGetShortPath");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszlongpath);
#else
    (void)pszlongpath;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsContentTypeA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszcontenttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsContentTypeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszcontenttype) : -1;
#else
    (void)pszpath;
    (void)pszcontenttype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsContentTypeW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszcontenttype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsContentTypeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszcontenttype) : -1;
#else
    (void)pszpath;
    (void)pszcontenttype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsDirectoryEmptyA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsDirectoryEmptyA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsDirectoryEmptyW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsDirectoryEmptyW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsExe(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsExe");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsFileSpecA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsFileSpecA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsFileSpecW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsFileSpecW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsLFNFileSpecA(JNIEnv* km_env, jclass km_clazz, jlong pszname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsLFNFileSpecA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname) : -1;
#else
    (void)pszname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsLFNFileSpecW(JNIEnv* km_env, jclass km_clazz, jlong pszname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsLFNFileSpecW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname) : -1;
#else
    (void)pszname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsNetworkPathA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsNetworkPathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsNetworkPathW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsNetworkPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsPrefixA(JNIEnv* km_env, jclass km_clazz, jlong pszprefix, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsPrefixA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprefix, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszprefix;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsPrefixW(JNIEnv* km_env, jclass km_clazz, jlong pszprefix, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsPrefixW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprefix, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszprefix;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsRelativeA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsRelativeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsRelativeW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsRelativeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsRootA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsRootA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsRootW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsRootW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsSameRootA(JNIEnv* km_env, jclass km_clazz, jlong pszpath1, jlong pszpath2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSameRootA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath1, (void*)(uintptr_t)pszpath2) : -1;
#else
    (void)pszpath1;
    (void)pszpath2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsSameRootW(JNIEnv* km_env, jclass km_clazz, jlong pszpath1, jlong pszpath2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSameRootW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath1, (void*)(uintptr_t)pszpath2) : -1;
#else
    (void)pszpath1;
    (void)pszpath2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsSlowA(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jint dwattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSlowA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (uint32_t)dwattr) : -1;
#else
    (void)pszfile;
    (void)dwattr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsSlowW(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jint dwattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSlowW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (uint32_t)dwattr) : -1;
#else
    (void)pszfile;
    (void)dwattr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsSystemFolderA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jint dwattrb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSystemFolderA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint32_t)dwattrb) : -1;
#else
    (void)pszpath;
    (void)dwattrb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsSystemFolderW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jint dwattrb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsSystemFolderW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint32_t)dwattrb) : -1;
#else
    (void)pszpath;
    (void)dwattrb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsUNCA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsUNCEx(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong ppszserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-path-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)ppszserver) : -1;
#else
    (void)pszpath;
    (void)ppszserver;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsUNCServerA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCServerA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsUNCServerShareA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCServerShareA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsUNCServerShareW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCServerShareW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsUNCServerW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCServerW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsUNCW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsUNCW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsURLA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsURLA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathIsURLW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathIsURLW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathMakePrettyA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakePrettyA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathMakePrettyW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakePrettyW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathMakeSystemFolderA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakeSystemFolderA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathMakeSystemFolderW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakeSystemFolderW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathMakeUniqueName(JNIEnv* km_env, jclass km_clazz, jlong pszuniquename, jint cchmax, jlong psztemplate, jlong pszlongplate, jlong pszdir) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMakeUniqueName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszuniquename, (uint32_t)cchmax, (void*)(uintptr_t)psztemplate, (void*)(uintptr_t)pszlongplate, (void*)(uintptr_t)pszdir) : -1;
#else
    (void)pszuniquename;
    (void)cchmax;
    (void)psztemplate;
    (void)pszlongplate;
    (void)pszdir;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathMatchSpecA(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jlong pszspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMatchSpecA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (void*)(uintptr_t)pszspec) : -1;
#else
    (void)pszfile;
    (void)pszspec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathMatchSpecExA(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jlong pszspec, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMatchSpecExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (void*)(uintptr_t)pszspec, (uint32_t)dwflags) : -1;
#else
    (void)pszfile;
    (void)pszspec;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathMatchSpecExW(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jlong pszspec, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMatchSpecExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (void*)(uintptr_t)pszspec, (uint32_t)dwflags) : -1;
#else
    (void)pszfile;
    (void)pszspec;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathMatchSpecW(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jlong pszspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathMatchSpecW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (void*)(uintptr_t)pszspec) : -1;
#else
    (void)pszfile;
    (void)pszspec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathParseIconLocationA(JNIEnv* km_env, jclass km_clazz, jlong psziconfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathParseIconLocationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psziconfile) : -1;
#else
    (void)psziconfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathParseIconLocationW(JNIEnv* km_env, jclass km_clazz, jlong psziconfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathParseIconLocationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psziconfile) : -1;
#else
    (void)psziconfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathQualify(JNIEnv* km_env, jclass km_clazz, jlong psz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathQualify");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)psz);
#else
    (void)psz;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathQuoteSpacesA(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathQuoteSpacesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : -1;
#else
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathQuoteSpacesW(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathQuoteSpacesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : -1;
#else
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRelativePathToA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszfrom, jint dwattrfrom, jlong pszto, jint dwattrto) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRelativePathToA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszfrom, (uint32_t)dwattrfrom, (void*)(uintptr_t)pszto, (uint32_t)dwattrto) : -1;
#else
    (void)pszpath;
    (void)pszfrom;
    (void)dwattrfrom;
    (void)pszto;
    (void)dwattrto;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRelativePathToW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszfrom, jint dwattrfrom, jlong pszto, jint dwattrto) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRelativePathToW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszfrom, (uint32_t)dwattrfrom, (void*)(uintptr_t)pszto, (uint32_t)dwattrto) : -1;
#else
    (void)pszpath;
    (void)pszfrom;
    (void)dwattrfrom;
    (void)pszto;
    (void)dwattrto;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveArgsA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveArgsA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveArgsW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveArgsW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveBackslashA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveBackslashA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveBackslashW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveBackslashW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveBlanksA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveBlanksA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveBlanksW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveBlanksW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveExtensionA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveExtensionA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveExtensionW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveExtensionW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveFileSpecA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveFileSpecA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRemoveFileSpecW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRemoveFileSpecW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRenameExtensionA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRenameExtensionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszext) : -1;
#else
    (void)pszpath;
    (void)pszext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathRenameExtensionW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathRenameExtensionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszext) : -1;
#else
    (void)pszpath;
    (void)pszext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathResolve(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong dirs, jint fflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathResolve");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)dirs, (uint32_t)fflags) : -1;
#else
    (void)pszpath;
    (void)dirs;
    (void)fflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathSearchAndQualifyA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSearchAndQualifyA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : -1;
#else
    (void)pszpath;
    (void)pszbuf;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathSearchAndQualifyW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSearchAndQualifyW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : -1;
#else
    (void)pszpath;
    (void)pszbuf;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathSetDlgItemPathA(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint id, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSetDlgItemPathA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)id, (void*)(uintptr_t)pszpath);
#else
    (void)hdlg;
    (void)id;
    (void)pszpath;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathSetDlgItemPathW(JNIEnv* km_env, jclass km_clazz, jlong hdlg, jint id, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSetDlgItemPathW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hdlg, (int32_t)id, (void*)(uintptr_t)pszpath);
#else
    (void)hdlg;
    (void)id;
    (void)pszpath;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathSkipRootA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSkipRootA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathSkipRootW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathSkipRootW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathStripPathA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathStripPathA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathStripPathW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathStripPathW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathStripToRootA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathStripToRootA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathStripToRootW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathStripToRootW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathUnExpandEnvStringsA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnExpandEnvStringsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : -1;
#else
    (void)pszpath;
    (void)pszbuf;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathUnExpandEnvStringsW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnExpandEnvStringsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : -1;
#else
    (void)pszpath;
    (void)pszbuf;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathUndecorateA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUndecorateA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathUndecorateW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUndecorateW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszpath);
#else
    (void)pszpath;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathUnmakeSystemFolderA(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnmakeSystemFolderA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathUnmakeSystemFolderW(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnmakeSystemFolderW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathUnquoteSpacesA(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnquoteSpacesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : -1;
#else
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathUnquoteSpacesW(JNIEnv* km_env, jclass km_clazz, jlong lpsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathUnquoteSpacesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsz) : -1;
#else
    (void)lpsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pathYetAnotherMakeUniqueName(JNIEnv* km_env, jclass km_clazz, jlong pszuniquename, jlong pszpath, jlong pszshort, jlong pszfilespec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PathYetAnotherMakeUniqueName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszuniquename, (void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszshort, (void*)(uintptr_t)pszfilespec) : -1;
#else
    (void)pszuniquename;
    (void)pszpath;
    (void)pszshort;
    (void)pszfilespec;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1pickIconDlg(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psziconpath, jint cchiconpath, jlong piiconindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PickIconDlg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psziconpath, (uint32_t)cchiconpath, (void*)(uintptr_t)piiconindex) : -1;
#else
    (void)hwnd;
    (void)psziconpath;
    (void)cchiconpath;
    (void)piiconindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1propVariantToStrRet(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pstrret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStrRet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pstrret) : -1;
#else
    (void)propvar;
    (void)pstrret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1qISearch(JNIEnv* km_env, jclass km_clazz, jlong that, jlong pqit, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QISearch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)that, (void*)(uintptr_t)pqit, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)that;
    (void)pqit;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1readCabinetState(JNIEnv* km_env, jclass km_clazz, jlong pcs, jint clength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadCabinetState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcs, (int32_t)clength) : -1;
#else
    (void)pcs;
    (void)clength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1realDriveType(JNIEnv* km_env, jclass km_clazz, jint idrive, jint foktohitnet) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RealDriveType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)idrive, (int32_t)foktohitnet) : -1;
#else
    (void)idrive;
    (void)foktohitnet;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1registerAppConstrainedChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong routine, jlong context, jlong registration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-psm-appnotify-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterAppConstrainedChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)routine, (void*)(uintptr_t)context, (void*)(uintptr_t)registration) : 0;
#else
    (void)routine;
    (void)context;
    (void)registration;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1registerAppStateChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong routine, jlong context, jlong registration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-psm-appnotify-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterAppStateChangeNotification");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)routine, (void*)(uintptr_t)context, (void*)(uintptr_t)registration) : 0;
#else
    (void)routine;
    (void)context;
    (void)registration;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1registerScaleChangeEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent, jlong pdwcookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterScaleChangeEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hevent, (void*)(uintptr_t)pdwcookie) : -1;
#else
    (void)hevent;
    (void)pdwcookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1registerScaleChangeNotifications(JNIEnv* km_env, jclass km_clazz, jint displaydevice, jlong hwndnotify, jint umsgnotify, jlong pdwcookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterScaleChangeNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)displaydevice, (void*)(uintptr_t)hwndnotify, (uint32_t)umsgnotify, (void*)(uintptr_t)pdwcookie) : -1;
#else
    (void)displaydevice;
    (void)hwndnotify;
    (void)umsgnotify;
    (void)pdwcookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1removeWindowSubclass(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pfnsubclass, jlong uidsubclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveWindowSubclass");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pfnsubclass, (uint64_t)uidsubclass) : -1;
#else
    (void)hwnd;
    (void)pfnsubclass;
    (void)uidsubclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1restartDialog(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszprompt, jint dwreturn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestartDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszprompt, (uint32_t)dwreturn) : -1;
#else
    (void)hwnd;
    (void)pszprompt;
    (void)dwreturn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1restartDialogEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszprompt, jint dwreturn, jint dwreasoncode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestartDialogEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszprompt, (uint32_t)dwreturn, (uint32_t)dwreasoncode) : -1;
#else
    (void)hwnd;
    (void)pszprompt;
    (void)dwreturn;
    (void)dwreasoncode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1revokeScaleChangeNotifications(JNIEnv* km_env, jclass km_clazz, jint displaydevice, jint dwcookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevokeScaleChangeNotifications");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)displaydevice, (uint32_t)dwcookie) : -1;
#else
    (void)displaydevice;
    (void)dwcookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHAddToRecentDocs(JNIEnv* km_env, jclass km_clazz, jint uflags, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAddToRecentDocs");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)uflags, (void*)(uintptr_t)pv);
#else
    (void)uflags;
    (void)pv;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHAlloc(JNIEnv* km_env, jclass km_clazz, jlong cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAlloc");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)cb) : NULL;
#else
    (void)cb;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHAllocShared(JNIEnv* km_env, jclass km_clazz, jlong pvdata, jint dwsize, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAllocShared");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvdata, (uint32_t)dwsize, (uint32_t)dwprocessid) : NULL;
#else
    (void)pvdata;
    (void)dwsize;
    (void)dwprocessid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHAnsiToAnsi(JNIEnv* km_env, jclass km_clazz, jlong pszsrc, jlong pszdst, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAnsiToAnsi");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsrc, (void*)(uintptr_t)pszdst, (int32_t)cchbuf) : -1;
#else
    (void)pszsrc;
    (void)pszdst;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHAnsiToUnicode(JNIEnv* km_env, jclass km_clazz, jlong pszsrc, jlong pwszdst, jint cwchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAnsiToUnicode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsrc, (void*)(uintptr_t)pwszdst, (int32_t)cwchbuf) : -1;
#else
    (void)pszsrc;
    (void)pwszdst;
    (void)cwchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHAppBarMessage(JNIEnv* km_env, jclass km_clazz, jint dwmessage, jlong pdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAppBarMessage");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwmessage, (void*)(uintptr_t)pdata) : 0;
#else
    (void)dwmessage;
    (void)pdata;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHAssocEnumHandlers(JNIEnv* km_env, jclass km_clazz, jlong pszextra, jint affilter, jlong ppenumhandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAssocEnumHandlers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszextra, (int32_t)affilter, (void*)(uintptr_t)ppenumhandler) : -1;
#else
    (void)pszextra;
    (void)affilter;
    (void)ppenumhandler;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHAssocEnumHandlersForProtocolByApplication(JNIEnv* km_env, jclass km_clazz, jlong protocol, jlong riid, jlong enumhandlers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAssocEnumHandlersForProtocolByApplication");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)protocol, (void*)(uintptr_t)riid, (void*)(uintptr_t)enumhandlers) : -1;
#else
    (void)protocol;
    (void)riid;
    (void)enumhandlers;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHAutoComplete(JNIEnv* km_env, jclass km_clazz, jlong hwndedit, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHAutoComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndedit, (uint32_t)dwflags) : -1;
#else
    (void)hwndedit;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHBindToFolderIDListParent(JNIEnv* km_env, jclass km_clazz, jlong psfroot, jlong pidl, jlong riid, jlong ppv, jlong ppidllast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBindToFolderIDListParent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psfroot, (void*)(uintptr_t)pidl, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv, (void*)(uintptr_t)ppidllast) : -1;
#else
    (void)psfroot;
    (void)pidl;
    (void)riid;
    (void)ppv;
    (void)ppidllast;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHBindToFolderIDListParentEx(JNIEnv* km_env, jclass km_clazz, jlong psfroot, jlong pidl, jlong ppbc, jlong riid, jlong ppv, jlong ppidllast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBindToFolderIDListParentEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psfroot, (void*)(uintptr_t)pidl, (void*)(uintptr_t)ppbc, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv, (void*)(uintptr_t)ppidllast) : -1;
#else
    (void)psfroot;
    (void)pidl;
    (void)ppbc;
    (void)riid;
    (void)ppv;
    (void)ppidllast;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHBindToObject(JNIEnv* km_env, jclass km_clazz, jlong psf, jlong pidl, jlong pbc, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBindToObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psf, (void*)(uintptr_t)pidl, (void*)(uintptr_t)pbc, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)psf;
    (void)pidl;
    (void)pbc;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHBindToParent(JNIEnv* km_env, jclass km_clazz, jlong pidl, jlong riid, jlong ppv, jlong ppidllast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBindToParent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv, (void*)(uintptr_t)ppidllast) : -1;
#else
    (void)pidl;
    (void)riid;
    (void)ppv;
    (void)ppidllast;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHBrowseForFolderA(JNIEnv* km_env, jclass km_clazz, jlong lpbi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBrowseForFolderA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbi) : NULL;
#else
    (void)lpbi;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHBrowseForFolderW(JNIEnv* km_env, jclass km_clazz, jlong lpbi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHBrowseForFolderW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpbi) : NULL;
#else
    (void)lpbi;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCLSIDFromString(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCLSIDFromString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)pclsid) : -1;
#else
    (void)psz;
    (void)pclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shchangeNotificationLock(JNIEnv* km_env, jclass km_clazz, jlong hchange, jint dwprocid, jlong pppidl, jlong plevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotification_Lock");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hchange, (uint32_t)dwprocid, (void*)(uintptr_t)pppidl, (void*)(uintptr_t)plevent) : NULL;
#else
    (void)hchange;
    (void)dwprocid;
    (void)pppidl;
    (void)plevent;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shchangeNotificationUnlock(JNIEnv* km_env, jclass km_clazz, jlong hlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotification_Unlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlock) : -1;
#else
    (void)hlock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHChangeNotify(JNIEnv* km_env, jclass km_clazz, jint weventid, jint uflags, jlong dwitem1, jlong dwitem2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotify");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)weventid, (uint32_t)uflags, (void*)(uintptr_t)dwitem1, (void*)(uintptr_t)dwitem2);
#else
    (void)weventid;
    (void)uflags;
    (void)dwitem1;
    (void)dwitem2;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHChangeNotifyDeregister(JNIEnv* km_env, jclass km_clazz, jint ulid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotifyDeregister");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ulid) : -1;
#else
    (void)ulid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHChangeNotifyRegister(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint fsources, jint fevents, jint wmsg, jint centries, jlong pshcne) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotifyRegister");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)fsources, (int32_t)fevents, (uint32_t)wmsg, (int32_t)centries, (void*)(uintptr_t)pshcne) : 0;
#else
    (void)hwnd;
    (void)fsources;
    (void)fevents;
    (void)wmsg;
    (void)centries;
    (void)pshcne;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHChangeNotifyRegisterThread(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHChangeNotifyRegisterThread");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)status);
#else
    (void)status;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCloneSpecialIDList(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint csidl, jint fcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCloneSpecialIDList");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)csidl, (int32_t)fcreate) : NULL;
#else
    (void)hwnd;
    (void)csidl;
    (void)fcreate;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCoCreateInstance(JNIEnv* km_env, jclass km_clazz, jlong pszclsid, jlong pclsid, jlong punkouter, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCoCreateInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszclsid, (void*)(uintptr_t)pclsid, (void*)(uintptr_t)punkouter, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pszclsid;
    (void)pclsid;
    (void)punkouter;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCopyKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkeysrc, jlong pszsrcsubkey, jlong hkeydest, jint freserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCopyKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeysrc, (void*)(uintptr_t)pszsrcsubkey, (void*)(uintptr_t)hkeydest, (uint32_t)freserved) : 0;
#else
    (void)hkeysrc;
    (void)pszsrcsubkey;
    (void)hkeydest;
    (void)freserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCopyKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkeysrc, jlong pszsrcsubkey, jlong hkeydest, jint freserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCopyKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeysrc, (void*)(uintptr_t)pszsrcsubkey, (void*)(uintptr_t)hkeydest, (uint32_t)freserved) : 0;
#else
    (void)hkeysrc;
    (void)pszsrcsubkey;
    (void)hkeydest;
    (void)freserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateAssociationRegistration(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateAssociationRegistration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateDataObject(JNIEnv* km_env, jclass km_clazz, jlong pidlfolder, jint cidl, jlong apidl, jlong pdtinner, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDataObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlfolder, (uint32_t)cidl, (void*)(uintptr_t)apidl, (void*)(uintptr_t)pdtinner, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pidlfolder;
    (void)cidl;
    (void)apidl;
    (void)pdtinner;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateDefaultContextMenu(JNIEnv* km_env, jclass km_clazz, jlong pdcm, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDefaultContextMenu");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdcm, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pdcm;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateDefaultExtractIcon(JNIEnv* km_env, jclass km_clazz, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDefaultExtractIcon");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateDefaultPropertiesOp(JNIEnv* km_env, jclass km_clazz, jlong psi, jlong ppfileop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDefaultPropertiesOp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psi, (void*)(uintptr_t)ppfileop) : -1;
#else
    (void)psi;
    (void)ppfileop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateDirectory(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDirectory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)hwnd;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateDirectoryExA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszpath, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDirectoryExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszpath, (void*)(uintptr_t)psa) : -1;
#else
    (void)hwnd;
    (void)pszpath;
    (void)psa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateDirectoryExW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszpath, jlong psa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateDirectoryExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszpath, (void*)(uintptr_t)psa) : -1;
#else
    (void)hwnd;
    (void)pszpath;
    (void)psa;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateFileExtractIconW(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jint dwfileattributes, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateFileExtractIconW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (uint32_t)dwfileattributes, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pszfile;
    (void)dwfileattributes;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateItemFromIDList(JNIEnv* km_env, jclass km_clazz, jlong pidl, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemFromIDList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pidl;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateItemFromParsingName(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pbc, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemFromParsingName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pbc, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pszpath;
    (void)pbc;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateItemFromRelativeName(JNIEnv* km_env, jclass km_clazz, jlong psiparent, jlong pszname, jlong pbc, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemFromRelativeName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psiparent, (void*)(uintptr_t)pszname, (void*)(uintptr_t)pbc, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)psiparent;
    (void)pszname;
    (void)pbc;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateItemInKnownFolder(JNIEnv* km_env, jclass km_clazz, jlong kfid, jint dwkfflags, jlong pszitem, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemInKnownFolder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)kfid, (uint32_t)dwkfflags, (void*)(uintptr_t)pszitem, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)kfid;
    (void)dwkfflags;
    (void)pszitem;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateItemWithParent(JNIEnv* km_env, jclass km_clazz, jlong pidlparent, jlong psfparent, jlong pidl, jlong riid, jlong ppvitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateItemWithParent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlparent, (void*)(uintptr_t)psfparent, (void*)(uintptr_t)pidl, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvitem) : -1;
#else
    (void)pidlparent;
    (void)psfparent;
    (void)pidl;
    (void)riid;
    (void)ppvitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateMemStream(JNIEnv* km_env, jclass km_clazz, jlong pinit, jint cbinit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateMemStream");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinit, (uint32_t)cbinit) : NULL;
#else
    (void)pinit;
    (void)cbinit;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateProcessAsUserW(JNIEnv* km_env, jclass km_clazz, jlong pscpi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateProcessAsUserW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pscpi) : -1;
#else
    (void)pscpi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreatePropSheetExtArray(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jint max_iface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreatePropSheetExtArray");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (uint32_t)max_iface) : NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)max_iface;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateQueryCancelAutoPlayMoniker(JNIEnv* km_env, jclass km_clazz, jlong ppmoniker) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateQueryCancelAutoPlayMoniker");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppmoniker) : -1;
#else
    (void)ppmoniker;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateShellFolderView(JNIEnv* km_env, jclass km_clazz, jlong pcsfv, jlong ppsv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellFolderView");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcsfv, (void*)(uintptr_t)ppsv) : -1;
#else
    (void)pcsfv;
    (void)ppsv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateShellFolderViewEx(JNIEnv* km_env, jclass km_clazz, jlong pcsfv, jlong ppsv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellFolderViewEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcsfv, (void*)(uintptr_t)ppsv) : -1;
#else
    (void)pcsfv;
    (void)ppsv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateShellItem(JNIEnv* km_env, jclass km_clazz, jlong pidlparent, jlong psfparent, jlong pidl, jlong ppsi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlparent, (void*)(uintptr_t)psfparent, (void*)(uintptr_t)pidl, (void*)(uintptr_t)ppsi) : -1;
#else
    (void)pidlparent;
    (void)psfparent;
    (void)pidl;
    (void)ppsi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateShellItemArray(JNIEnv* km_env, jclass km_clazz, jlong pidlparent, jlong psf, jint cidl, jlong ppidl, jlong ppsiitemarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItemArray");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlparent, (void*)(uintptr_t)psf, (uint32_t)cidl, (void*)(uintptr_t)ppidl, (void*)(uintptr_t)ppsiitemarray) : -1;
#else
    (void)pidlparent;
    (void)psf;
    (void)cidl;
    (void)ppidl;
    (void)ppsiitemarray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateShellItemArrayFromDataObject(JNIEnv* km_env, jclass km_clazz, jlong pdo, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItemArrayFromDataObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdo, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pdo;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateShellItemArrayFromIDLists(JNIEnv* km_env, jclass km_clazz, jint cidl, jlong rgpidl, jlong ppsiitemarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItemArrayFromIDLists");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cidl, (void*)(uintptr_t)rgpidl, (void*)(uintptr_t)ppsiitemarray) : -1;
#else
    (void)cidl;
    (void)rgpidl;
    (void)ppsiitemarray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateShellItemArrayFromShellItem(JNIEnv* km_env, jclass km_clazz, jlong psi, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellItemArrayFromShellItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psi, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)psi;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateShellPalette(JNIEnv* km_env, jclass km_clazz, jlong hdc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateShellPalette");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdc) : NULL;
#else
    (void)hdc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateStdEnumFmtEtc(JNIEnv* km_env, jclass km_clazz, jint cfmt, jlong afmt, jlong ppenumformatetc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateStdEnumFmtEtc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cfmt, (void*)(uintptr_t)afmt, (void*)(uintptr_t)ppenumformatetc) : -1;
#else
    (void)cfmt;
    (void)afmt;
    (void)ppenumformatetc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateStreamOnFileA(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jint grfmode, jlong ppstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateStreamOnFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (uint32_t)grfmode, (void*)(uintptr_t)ppstm) : -1;
#else
    (void)pszfile;
    (void)grfmode;
    (void)ppstm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateStreamOnFileEx(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jint grfmode, jint dwattributes, jint fcreate, jlong pstmtemplate, jlong ppstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateStreamOnFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (uint32_t)grfmode, (uint32_t)dwattributes, (int32_t)fcreate, (void*)(uintptr_t)pstmtemplate, (void*)(uintptr_t)ppstm) : -1;
#else
    (void)pszfile;
    (void)grfmode;
    (void)dwattributes;
    (void)fcreate;
    (void)pstmtemplate;
    (void)ppstm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateStreamOnFileW(JNIEnv* km_env, jclass km_clazz, jlong pszfile, jint grfmode, jlong ppstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateStreamOnFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfile, (uint32_t)grfmode, (void*)(uintptr_t)ppstm) : -1;
#else
    (void)pszfile;
    (void)grfmode;
    (void)ppstm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateThread(JNIEnv* km_env, jclass km_clazz, jlong pfnthreadproc, jlong pdata, jint flags, jlong pfncallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfnthreadproc, (void*)(uintptr_t)pdata, (uint32_t)flags, (void*)(uintptr_t)pfncallback) : -1;
#else
    (void)pfnthreadproc;
    (void)pdata;
    (void)flags;
    (void)pfncallback;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateThreadRef(JNIEnv* km_env, jclass km_clazz, jlong pcref, jlong ppunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateThreadRef");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcref, (void*)(uintptr_t)ppunk) : -1;
#else
    (void)pcref;
    (void)ppunk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHCreateThreadWithHandle(JNIEnv* km_env, jclass km_clazz, jlong pfnthreadproc, jlong pdata, jint flags, jlong pfncallback, jlong phandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHCreateThreadWithHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfnthreadproc, (void*)(uintptr_t)pdata, (uint32_t)flags, (void*)(uintptr_t)pfncallback, (void*)(uintptr_t)phandle) : -1;
#else
    (void)pfnthreadproc;
    (void)pdata;
    (void)flags;
    (void)pfncallback;
    (void)phandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDefExtractIconA(JNIEnv* km_env, jclass km_clazz, jlong psziconfile, jint iindex, jint uflags, jlong phiconlarge, jlong phiconsmall, jint niconsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDefExtractIconA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psziconfile, (int32_t)iindex, (uint32_t)uflags, (void*)(uintptr_t)phiconlarge, (void*)(uintptr_t)phiconsmall, (uint32_t)niconsize) : -1;
#else
    (void)psziconfile;
    (void)iindex;
    (void)uflags;
    (void)phiconlarge;
    (void)phiconsmall;
    (void)niconsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDefExtractIconW(JNIEnv* km_env, jclass km_clazz, jlong psziconfile, jint iindex, jint uflags, jlong phiconlarge, jlong phiconsmall, jint niconsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDefExtractIconW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psziconfile, (int32_t)iindex, (uint32_t)uflags, (void*)(uintptr_t)phiconlarge, (void*)(uintptr_t)phiconsmall, (uint32_t)niconsize) : -1;
#else
    (void)psziconfile;
    (void)iindex;
    (void)uflags;
    (void)phiconlarge;
    (void)phiconsmall;
    (void)niconsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDeleteEmptyKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteEmptyKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDeleteEmptyKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteEmptyKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDeleteKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDeleteKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDeleteValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDeleteValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDeleteValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDestroyPropSheetExtArray(JNIEnv* km_env, jclass km_clazz, jlong hpsxa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDestroyPropSheetExtArray");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hpsxa);
#else
    (void)hpsxa;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHDoDragDrop(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pdata, jlong pdsrc, jint dweffect, jlong pdweffect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHDoDragDrop");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pdata, (void*)(uintptr_t)pdsrc, (uint32_t)dweffect, (void*)(uintptr_t)pdweffect) : -1;
#else
    (void)hwnd;
    (void)pdata;
    (void)pdsrc;
    (void)dweffect;
    (void)pdweffect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHEmptyRecycleBinA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszrootpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEmptyRecycleBinA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszrootpath, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)pszrootpath;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHEmptyRecycleBinW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszrootpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEmptyRecycleBinW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszrootpath, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)pszrootpath;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHEnumKeyExA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong pszname, jlong pcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumKeyExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)pszname, (void*)(uintptr_t)pcchname) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)pszname;
    (void)pcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHEnumKeyExW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong pszname, jlong pcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumKeyExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)pszname, (void*)(uintptr_t)pcchname) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)pszname;
    (void)pcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHEnumValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong pszvaluename, jlong pcchvaluename, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)pcchvaluename, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)pszvaluename;
    (void)pcchvaluename;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHEnumValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong pszvaluename, jlong pcchvaluename, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)pcchvaluename, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)pszvaluename;
    (void)pcchvaluename;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHEnumerateUnreadMailAccountsW(JNIEnv* km_env, jclass km_clazz, jlong hkeyuser, jint dwindex, jlong pszmailaddress, jint cchmailaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEnumerateUnreadMailAccountsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyuser, (uint32_t)dwindex, (void*)(uintptr_t)pszmailaddress, (int32_t)cchmailaddress) : -1;
#else
    (void)hkeyuser;
    (void)dwindex;
    (void)pszmailaddress;
    (void)cchmailaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHEvaluateSystemCommandTemplate(JNIEnv* km_env, jclass km_clazz, jlong pszcmdtemplate, jlong ppszapplication, jlong ppszcommandline, jlong ppszparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHEvaluateSystemCommandTemplate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszcmdtemplate, (void*)(uintptr_t)ppszapplication, (void*)(uintptr_t)ppszcommandline, (void*)(uintptr_t)ppszparameters) : -1;
#else
    (void)pszcmdtemplate;
    (void)ppszapplication;
    (void)ppszcommandline;
    (void)ppszparameters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFileOperationA(JNIEnv* km_env, jclass km_clazz, jlong lpfileop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFileOperationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfileop) : -1;
#else
    (void)lpfileop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFileOperationW(JNIEnv* km_env, jclass km_clazz, jlong lpfileop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFileOperationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfileop) : -1;
#else
    (void)lpfileop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFindFiles(JNIEnv* km_env, jclass km_clazz, jlong pidlfolder, jlong pidlsavefile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFindFiles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlfolder, (void*)(uintptr_t)pidlsavefile) : -1;
#else
    (void)pidlfolder;
    (void)pidlsavefile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shfindInitMenuPopup(JNIEnv* km_env, jclass km_clazz, jlong hmenu, jlong hwndowner, jint idcmdfirst, jint idcmdlast) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFind_InitMenuPopup");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmenu, (void*)(uintptr_t)hwndowner, (uint32_t)idcmdfirst, (uint32_t)idcmdlast) : NULL;
#else
    (void)hmenu;
    (void)hwndowner;
    (void)idcmdfirst;
    (void)idcmdlast;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFlushSFCache(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFlushSFCache");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFormatDateTimeA(JNIEnv* km_env, jclass km_clazz, jlong pft, jlong pdwflags, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFormatDateTimeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pft, (void*)(uintptr_t)pdwflags, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : -1;
#else
    (void)pft;
    (void)pdwflags;
    (void)pszbuf;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFormatDateTimeW(JNIEnv* km_env, jclass km_clazz, jlong pft, jlong pdwflags, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFormatDateTimeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pft, (void*)(uintptr_t)pdwflags, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : -1;
#else
    (void)pft;
    (void)pdwflags;
    (void)pszbuf;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFormatDrive(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint drive, jint fmtid, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFormatDrive");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)drive, (uint32_t)fmtid, (uint32_t)options) : 0;
#else
    (void)hwnd;
    (void)drive;
    (void)fmtid;
    (void)options;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFree(JNIEnv* km_env, jclass km_clazz, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pv);
#else
    (void)pv;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFreeNameMappings(JNIEnv* km_env, jclass km_clazz, jlong hnamemappings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFreeNameMappings");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hnamemappings);
#else
    (void)hnamemappings;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHFreeShared(JNIEnv* km_env, jclass km_clazz, jlong hdata, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHFreeShared");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdata, (uint32_t)dwprocessid) : -1;
#else
    (void)hdata;
    (void)dwprocessid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetAttributesFromDataObject(JNIEnv* km_env, jclass km_clazz, jlong pdo, jint dwattributemask, jlong pdwattributes, jlong pcitems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetAttributesFromDataObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdo, (uint32_t)dwattributemask, (void*)(uintptr_t)pdwattributes, (void*)(uintptr_t)pcitems) : -1;
#else
    (void)pdo;
    (void)dwattributemask;
    (void)pdwattributes;
    (void)pcitems;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetDataFromIDListA(JNIEnv* km_env, jclass km_clazz, jlong psf, jlong pidl, jint nformat, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDataFromIDListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psf, (void*)(uintptr_t)pidl, (int32_t)nformat, (void*)(uintptr_t)pv, (int32_t)cb) : -1;
#else
    (void)psf;
    (void)pidl;
    (void)nformat;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetDataFromIDListW(JNIEnv* km_env, jclass km_clazz, jlong psf, jlong pidl, jint nformat, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDataFromIDListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psf, (void*)(uintptr_t)pidl, (int32_t)nformat, (void*)(uintptr_t)pv, (int32_t)cb) : -1;
#else
    (void)psf;
    (void)pidl;
    (void)nformat;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetDesktopFolder(JNIEnv* km_env, jclass km_clazz, jlong ppshf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDesktopFolder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppshf) : -1;
#else
    (void)ppshf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetDiskFreeSpaceExA(JNIEnv* km_env, jclass km_clazz, jlong pszdirectoryname, jlong pulfreebytesavailabletocaller, jlong pultotalnumberofbytes, jlong pultotalnumberoffreebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDiskFreeSpaceExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdirectoryname, (void*)(uintptr_t)pulfreebytesavailabletocaller, (void*)(uintptr_t)pultotalnumberofbytes, (void*)(uintptr_t)pultotalnumberoffreebytes) : -1;
#else
    (void)pszdirectoryname;
    (void)pulfreebytesavailabletocaller;
    (void)pultotalnumberofbytes;
    (void)pultotalnumberoffreebytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetDiskFreeSpaceExW(JNIEnv* km_env, jclass km_clazz, jlong pszdirectoryname, jlong pulfreebytesavailabletocaller, jlong pultotalnumberofbytes, jlong pultotalnumberoffreebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDiskFreeSpaceExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdirectoryname, (void*)(uintptr_t)pulfreebytesavailabletocaller, (void*)(uintptr_t)pultotalnumberofbytes, (void*)(uintptr_t)pultotalnumberoffreebytes) : -1;
#else
    (void)pszdirectoryname;
    (void)pulfreebytesavailabletocaller;
    (void)pultotalnumberofbytes;
    (void)pultotalnumberoffreebytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetDriveMedia(JNIEnv* km_env, jclass km_clazz, jlong pszdrive, jlong pdwmediacontent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetDriveMedia");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdrive, (void*)(uintptr_t)pdwmediacontent) : -1;
#else
    (void)pszdrive;
    (void)pdwmediacontent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetFileInfoA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jint dwfileattributes, jlong psfi, jint cbfileinfo, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFileInfoA");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint32_t)dwfileattributes, (void*)(uintptr_t)psfi, (uint32_t)cbfileinfo, (uint32_t)uflags) : 0;
#else
    (void)pszpath;
    (void)dwfileattributes;
    (void)psfi;
    (void)cbfileinfo;
    (void)uflags;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetFileInfoW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jint dwfileattributes, jlong psfi, jint cbfileinfo, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFileInfoW");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint32_t)dwfileattributes, (void*)(uintptr_t)psfi, (uint32_t)cbfileinfo, (uint32_t)uflags) : 0;
#else
    (void)pszpath;
    (void)dwfileattributes;
    (void)psfi;
    (void)cbfileinfo;
    (void)uflags;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetFolderLocation(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint csidl, jlong htoken, jint dwflags, jlong ppidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderLocation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)csidl, (void*)(uintptr_t)htoken, (uint32_t)dwflags, (void*)(uintptr_t)ppidl) : -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)ppidl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetFolderPathA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint csidl, jlong htoken, jint dwflags, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderPathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)csidl, (void*)(uintptr_t)htoken, (uint32_t)dwflags, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetFolderPathAndSubDirA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint csidl, jlong htoken, jint dwflags, jlong pszsubdir, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderPathAndSubDirA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)csidl, (void*)(uintptr_t)htoken, (uint32_t)dwflags, (void*)(uintptr_t)pszsubdir, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszsubdir;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetFolderPathAndSubDirW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint csidl, jlong htoken, jint dwflags, jlong pszsubdir, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderPathAndSubDirW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)csidl, (void*)(uintptr_t)htoken, (uint32_t)dwflags, (void*)(uintptr_t)pszsubdir, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszsubdir;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetFolderPathW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint csidl, jlong htoken, jint dwflags, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetFolderPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)csidl, (void*)(uintptr_t)htoken, (uint32_t)dwflags, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetIDListFromObject(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong ppidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetIDListFromObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)ppidl) : -1;
#else
    (void)punk;
    (void)ppidl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetIconOverlayIndexA(JNIEnv* km_env, jclass km_clazz, jlong psziconpath, jint iiconindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetIconOverlayIndexA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psziconpath, (int32_t)iiconindex) : -1;
#else
    (void)psziconpath;
    (void)iiconindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetIconOverlayIndexW(JNIEnv* km_env, jclass km_clazz, jlong psziconpath, jint iiconindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetIconOverlayIndexW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psziconpath, (int32_t)iiconindex) : -1;
#else
    (void)psziconpath;
    (void)iiconindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetImageList(JNIEnv* km_env, jclass km_clazz, jint iimagelist, jlong riid, jlong ppvobj) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetImageList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)iimagelist, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppvobj) : -1;
#else
    (void)iimagelist;
    (void)riid;
    (void)ppvobj;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetInstanceExplorer(JNIEnv* km_env, jclass km_clazz, jlong ppunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetInstanceExplorer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppunk) : -1;
#else
    (void)ppunk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetInverseCMAP(JNIEnv* km_env, jclass km_clazz, jlong pbmap, jint cbmap) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetInverseCMAP");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbmap, (uint32_t)cbmap) : -1;
#else
    (void)pbmap;
    (void)cbmap;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetItemFromDataObject(JNIEnv* km_env, jclass km_clazz, jlong pdtobj, jint dwflags, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetItemFromDataObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdtobj, (int32_t)dwflags, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pdtobj;
    (void)dwflags;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetItemFromObject(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetItemFromObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)punk;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetKnownFolderIDList(JNIEnv* km_env, jclass km_clazz, jlong rfid, jint dwflags, jlong htoken, jlong ppidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetKnownFolderIDList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rfid, (uint32_t)dwflags, (void*)(uintptr_t)htoken, (void*)(uintptr_t)ppidl) : -1;
#else
    (void)rfid;
    (void)dwflags;
    (void)htoken;
    (void)ppidl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetKnownFolderItem(JNIEnv* km_env, jclass km_clazz, jlong rfid, jint flags, jlong htoken, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetKnownFolderItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rfid, (int32_t)flags, (void*)(uintptr_t)htoken, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)rfid;
    (void)flags;
    (void)htoken;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetKnownFolderPath(JNIEnv* km_env, jclass km_clazz, jlong rfid, jint dwflags, jlong htoken, jlong ppszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetKnownFolderPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rfid, (uint32_t)dwflags, (void*)(uintptr_t)htoken, (void*)(uintptr_t)ppszpath) : -1;
#else
    (void)rfid;
    (void)dwflags;
    (void)htoken;
    (void)ppszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetLocalizedName(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszresmodule, jint cch, jlong pidsres) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetLocalizedName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszresmodule, (uint32_t)cch, (void*)(uintptr_t)pidsres) : -1;
#else
    (void)pszpath;
    (void)pszresmodule;
    (void)cch;
    (void)pidsres;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetMalloc(JNIEnv* km_env, jclass km_clazz, jlong ppmalloc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetMalloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppmalloc) : -1;
#else
    (void)ppmalloc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetNameFromIDList(JNIEnv* km_env, jclass km_clazz, jlong pidl, jint sigdnname, jlong ppszname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetNameFromIDList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl, (int32_t)sigdnname, (void*)(uintptr_t)ppszname) : -1;
#else
    (void)pidl;
    (void)sigdnname;
    (void)ppszname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetNewLinkInfoA(JNIEnv* km_env, jclass km_clazz, jlong pszlinkto, jlong pszdir, jlong pszname, jlong pfmustcopy, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetNewLinkInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlinkto, (void*)(uintptr_t)pszdir, (void*)(uintptr_t)pszname, (void*)(uintptr_t)pfmustcopy, (uint32_t)uflags) : -1;
#else
    (void)pszlinkto;
    (void)pszdir;
    (void)pszname;
    (void)pfmustcopy;
    (void)uflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetNewLinkInfoW(JNIEnv* km_env, jclass km_clazz, jlong pszlinkto, jlong pszdir, jlong pszname, jlong pfmustcopy, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetNewLinkInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlinkto, (void*)(uintptr_t)pszdir, (void*)(uintptr_t)pszname, (void*)(uintptr_t)pfmustcopy, (uint32_t)uflags) : -1;
#else
    (void)pszlinkto;
    (void)pszdir;
    (void)pszname;
    (void)pfmustcopy;
    (void)uflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetPathFromIDListA(JNIEnv* km_env, jclass km_clazz, jlong pidl, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPathFromIDListA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)pidl;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetPathFromIDListEx(JNIEnv* km_env, jclass km_clazz, jlong pidl, jlong pszpath, jint cchpath, jint uopts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPathFromIDListEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl, (void*)(uintptr_t)pszpath, (uint32_t)cchpath, (uint32_t)uopts) : -1;
#else
    (void)pidl;
    (void)pszpath;
    (void)cchpath;
    (void)uopts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetPathFromIDListW(JNIEnv* km_env, jclass km_clazz, jlong pidl, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetPathFromIDListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)pidl;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetRealIDL(JNIEnv* km_env, jclass km_clazz, jlong psf, jlong pidlsimple, jlong ppidlreal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetRealIDL");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psf, (void*)(uintptr_t)pidlsimple, (void*)(uintptr_t)ppidlreal) : -1;
#else
    (void)psf;
    (void)pidlsimple;
    (void)ppidlreal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetSetFolderCustomSettings(JNIEnv* km_env, jclass km_clazz, jlong pfcs, jlong pszpath, jint dwreadwrite) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSetFolderCustomSettings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfcs, (void*)(uintptr_t)pszpath, (uint32_t)dwreadwrite) : -1;
#else
    (void)pfcs;
    (void)pszpath;
    (void)dwreadwrite;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetSetSettings(JNIEnv* km_env, jclass km_clazz, jlong lpss, jint dwmask, jint bset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSetSettings");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpss, (uint32_t)dwmask, (int32_t)bset);
#else
    (void)lpss;
    (void)dwmask;
    (void)bset;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetSettings(JNIEnv* km_env, jclass km_clazz, jlong psfs, jint dwmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSettings");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)psfs, (uint32_t)dwmask);
#else
    (void)psfs;
    (void)dwmask;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetSpecialFolderLocation(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint csidl, jlong ppidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSpecialFolderLocation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (int32_t)csidl, (void*)(uintptr_t)ppidl) : -1;
#else
    (void)hwnd;
    (void)csidl;
    (void)ppidl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetSpecialFolderPathA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszpath, jint csidl, jint fcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSpecialFolderPathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszpath, (int32_t)csidl, (int32_t)fcreate) : -1;
#else
    (void)hwnd;
    (void)pszpath;
    (void)csidl;
    (void)fcreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetSpecialFolderPathW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszpath, jint csidl, jint fcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetSpecialFolderPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszpath, (int32_t)csidl, (int32_t)fcreate) : -1;
#else
    (void)hwnd;
    (void)pszpath;
    (void)csidl;
    (void)fcreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetStockIconInfo(JNIEnv* km_env, jclass km_clazz, jint siid, jint uflags, jlong psii) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetStockIconInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)siid, (uint32_t)uflags, (void*)(uintptr_t)psii) : -1;
#else
    (void)siid;
    (void)uflags;
    (void)psii;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetTemporaryPropertyForItem(JNIEnv* km_env, jclass km_clazz, jlong psi, jlong propkey, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetTemporaryPropertyForItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psi, (void*)(uintptr_t)propkey, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)psi;
    (void)propkey;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetThreadRef(JNIEnv* km_env, jclass km_clazz, jlong ppunk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetThreadRef");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppunk) : -1;
#else
    (void)ppunk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetUnreadMailCountW(JNIEnv* km_env, jclass km_clazz, jlong hkeyuser, jlong pszmailaddress, jlong pdwcount, jlong pfiletime, jlong pszshellexecutecommand, jint cchshellexecutecommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetUnreadMailCountW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyuser, (void*)(uintptr_t)pszmailaddress, (void*)(uintptr_t)pdwcount, (void*)(uintptr_t)pfiletime, (void*)(uintptr_t)pszshellexecutecommand, (int32_t)cchshellexecutecommand) : -1;
#else
    (void)hkeyuser;
    (void)pszmailaddress;
    (void)pdwcount;
    (void)pfiletime;
    (void)pszshellexecutecommand;
    (void)cchshellexecutecommand;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGetViewStatePropertyBag(JNIEnv* km_env, jclass km_clazz, jlong pidl, jlong pszbagname, jint dwflags, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGetViewStatePropertyBag");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl, (void*)(uintptr_t)pszbagname, (uint32_t)dwflags, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pidl;
    (void)pszbagname;
    (void)dwflags;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGlobalCounterDecrement(JNIEnv* km_env, jclass km_clazz, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGlobalCounterDecrement");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)id) : -1;
#else
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGlobalCounterGetValue(JNIEnv* km_env, jclass km_clazz, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGlobalCounterGetValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)id) : -1;
#else
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHGlobalCounterIncrement(JNIEnv* km_env, jclass km_clazz, jint id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHGlobalCounterIncrement");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)id) : -1;
#else
    (void)id;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHHandleUpdateImage(JNIEnv* km_env, jclass km_clazz, jlong pidlextra) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHHandleUpdateImage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlextra) : -1;
#else
    (void)pidlextra;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHILCreateFromPath(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong ppidl, jlong rgfinout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHILCreateFromPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)ppidl, (void*)(uintptr_t)rgfinout) : -1;
#else
    (void)pszpath;
    (void)ppidl;
    (void)rgfinout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHInvokePrinterCommandA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint uaction, jlong lpbuf1, jlong lpbuf2, jint fmodal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHInvokePrinterCommandA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)uaction, (void*)(uintptr_t)lpbuf1, (void*)(uintptr_t)lpbuf2, (int32_t)fmodal) : -1;
#else
    (void)hwnd;
    (void)uaction;
    (void)lpbuf1;
    (void)lpbuf2;
    (void)fmodal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHInvokePrinterCommandW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint uaction, jlong lpbuf1, jlong lpbuf2, jint fmodal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHInvokePrinterCommandW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)uaction, (void*)(uintptr_t)lpbuf1, (void*)(uintptr_t)lpbuf2, (int32_t)fmodal) : -1;
#else
    (void)hwnd;
    (void)uaction;
    (void)lpbuf1;
    (void)lpbuf2;
    (void)fmodal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHIsFileAvailableOffline(JNIEnv* km_env, jclass km_clazz, jlong pwszpath, jlong pdwstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHIsFileAvailableOffline");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszpath, (void*)(uintptr_t)pdwstatus) : -1;
#else
    (void)pwszpath;
    (void)pdwstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHIsLowMemoryMachine(JNIEnv* km_env, jclass km_clazz, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHIsLowMemoryMachine");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwtype) : -1;
#else
    (void)dwtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHLimitInputEdit(JNIEnv* km_env, jclass km_clazz, jlong hwndedit, jlong psf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLimitInputEdit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndedit, (void*)(uintptr_t)psf) : -1;
#else
    (void)hwndedit;
    (void)psf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHLoadInProc(JNIEnv* km_env, jclass km_clazz, jlong rclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLoadInProc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rclsid) : -1;
#else
    (void)rclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHLoadIndirectString(JNIEnv* km_env, jclass km_clazz, jlong pszsource, jlong pszoutbuf, jint cchoutbuf, jlong ppvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLoadIndirectString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsource, (void*)(uintptr_t)pszoutbuf, (uint32_t)cchoutbuf, (void*)(uintptr_t)ppvreserved) : -1;
#else
    (void)pszsource;
    (void)pszoutbuf;
    (void)cchoutbuf;
    (void)ppvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHLoadNonloadedIconOverlayIdentifiers(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLoadNonloadedIconOverlayIdentifiers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHLockShared(JNIEnv* km_env, jclass km_clazz, jlong hdata, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHLockShared");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdata, (uint32_t)dwprocessid) : NULL;
#else
    (void)hdata;
    (void)dwprocessid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHMapPIDLToSystemImageListIndex(JNIEnv* km_env, jclass km_clazz, jlong pshf, jlong pidl, jlong piindexsel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHMapPIDLToSystemImageListIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pshf, (void*)(uintptr_t)pidl, (void*)(uintptr_t)piindexsel) : -1;
#else
    (void)pshf;
    (void)pidl;
    (void)piindexsel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHMessageBoxCheckA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztext, jlong pszcaption, jint utype, jint idefault, jlong pszregval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHMessageBoxCheckA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztext, (void*)(uintptr_t)pszcaption, (uint32_t)utype, (int32_t)idefault, (void*)(uintptr_t)pszregval) : -1;
#else
    (void)hwnd;
    (void)psztext;
    (void)pszcaption;
    (void)utype;
    (void)idefault;
    (void)pszregval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHMessageBoxCheckW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psztext, jlong pszcaption, jint utype, jint idefault, jlong pszregval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHMessageBoxCheckW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psztext, (void*)(uintptr_t)pszcaption, (uint32_t)utype, (int32_t)idefault, (void*)(uintptr_t)pszregval) : -1;
#else
    (void)hwnd;
    (void)psztext;
    (void)pszcaption;
    (void)utype;
    (void)idefault;
    (void)pszregval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHMultiFileProperties(JNIEnv* km_env, jclass km_clazz, jlong pdtobj, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHMultiFileProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdtobj, (uint32_t)dwflags) : -1;
#else
    (void)pdtobj;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHObjectProperties(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jint shopobjecttype, jlong pszobjectname, jlong pszpropertypage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHObjectProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (uint32_t)shopobjecttype, (void*)(uintptr_t)pszobjectname, (void*)(uintptr_t)pszpropertypage) : -1;
#else
    (void)hwnd;
    (void)shopobjecttype;
    (void)pszobjectname;
    (void)pszpropertypage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHOpenFolderAndSelectItems(JNIEnv* km_env, jclass km_clazz, jlong pidlfolder, jint cidl, jlong apidl, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenFolderAndSelectItems");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidlfolder, (uint32_t)cidl, (void*)(uintptr_t)apidl, (uint32_t)dwflags) : -1;
#else
    (void)pidlfolder;
    (void)cidl;
    (void)apidl;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHOpenPropSheetW(JNIEnv* km_env, jclass km_clazz, jlong pszcaption, jlong ahkeys, jint ckeys, jlong pclsiddefault, jlong pdtobj, jlong psb, jlong pstartpage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenPropSheetW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszcaption, (void*)(uintptr_t)ahkeys, (uint32_t)ckeys, (void*)(uintptr_t)pclsiddefault, (void*)(uintptr_t)pdtobj, (void*)(uintptr_t)psb, (void*)(uintptr_t)pstartpage) : -1;
#else
    (void)pszcaption;
    (void)ahkeys;
    (void)ckeys;
    (void)pclsiddefault;
    (void)pdtobj;
    (void)psb;
    (void)pstartpage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHOpenRegStream2A(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jint grfmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenRegStream2A");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (uint32_t)grfmode) : NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHOpenRegStream2W(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jint grfmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenRegStream2W");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (uint32_t)grfmode) : NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHOpenRegStreamA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jint grfmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenRegStreamA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (uint32_t)grfmode) : NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHOpenRegStreamW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jint grfmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenRegStreamW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (uint32_t)grfmode) : NULL;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)grfmode;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHOpenWithDialog(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jlong poainfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHOpenWithDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (void*)(uintptr_t)poainfo) : -1;
#else
    (void)hwndparent;
    (void)poainfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHParseDisplayName(JNIEnv* km_env, jclass km_clazz, jlong pszname, jlong pbc, jlong ppidl, jint sfgaoin, jlong psfgaoout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHParseDisplayName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszname, (void*)(uintptr_t)pbc, (void*)(uintptr_t)ppidl, (uint32_t)sfgaoin, (void*)(uintptr_t)psfgaoout) : -1;
#else
    (void)pszname;
    (void)pbc;
    (void)ppidl;
    (void)sfgaoin;
    (void)psfgaoout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHPathPrepareForWriteA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong punkenablemodless, jlong pszpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPathPrepareForWriteA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)punkenablemodless, (void*)(uintptr_t)pszpath, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)punkenablemodless;
    (void)pszpath;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHPathPrepareForWriteW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong punkenablemodless, jlong pszpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHPathPrepareForWriteW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)punkenablemodless, (void*)(uintptr_t)pszpath, (uint32_t)dwflags) : -1;
#else
    (void)hwnd;
    (void)punkenablemodless;
    (void)pszpath;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHQueryInfoKeyA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pcsubkeys, jlong pcchmaxsubkeylen, jlong pcvalues, jlong pcchmaxvaluenamelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryInfoKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pcsubkeys, (void*)(uintptr_t)pcchmaxsubkeylen, (void*)(uintptr_t)pcvalues, (void*)(uintptr_t)pcchmaxvaluenamelen) : 0;
#else
    (void)hkey;
    (void)pcsubkeys;
    (void)pcchmaxsubkeylen;
    (void)pcvalues;
    (void)pcchmaxvaluenamelen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHQueryInfoKeyW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pcsubkeys, jlong pcchmaxsubkeylen, jlong pcvalues, jlong pcchmaxvaluenamelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryInfoKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pcsubkeys, (void*)(uintptr_t)pcchmaxsubkeylen, (void*)(uintptr_t)pcvalues, (void*)(uintptr_t)pcchmaxvaluenamelen) : 0;
#else
    (void)hkey;
    (void)pcsubkeys;
    (void)pcchmaxsubkeylen;
    (void)pcvalues;
    (void)pcchmaxvaluenamelen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHQueryRecycleBinA(JNIEnv* km_env, jclass km_clazz, jlong pszrootpath, jlong pshqueryrbinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryRecycleBinA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszrootpath, (void*)(uintptr_t)pshqueryrbinfo) : -1;
#else
    (void)pszrootpath;
    (void)pshqueryrbinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHQueryRecycleBinW(JNIEnv* km_env, jclass km_clazz, jlong pszrootpath, jlong pshqueryrbinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryRecycleBinW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszrootpath, (void*)(uintptr_t)pshqueryrbinfo) : -1;
#else
    (void)pszrootpath;
    (void)pshqueryrbinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHQueryUserNotificationState(JNIEnv* km_env, jclass km_clazz, jlong pquns) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryUserNotificationState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pquns) : -1;
#else
    (void)pquns;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHQueryValueExA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszvalue, jlong pdwreserved, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryValueExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pdwreserved, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pdwreserved;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHQueryValueExW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszvalue, jlong pdwreserved, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHQueryValueExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pdwreserved, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pdwreserved;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegCloseUSKey(JNIEnv* km_env, jclass km_clazz, jlong huskey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegCloseUSKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey) : 0;
#else
    (void)huskey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegCreateUSKeyA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jint samdesired, jlong hrelativeuskey, jlong phnewuskey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegCreateUSKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint32_t)samdesired, (int64_t)hrelativeuskey, (void*)(uintptr_t)phnewuskey, (uint32_t)dwflags) : 0;
#else
    (void)pszpath;
    (void)samdesired;
    (void)hrelativeuskey;
    (void)phnewuskey;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegCreateUSKeyW(JNIEnv* km_env, jclass km_clazz, jlong pwzpath, jint samdesired, jlong hrelativeuskey, jlong phnewuskey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegCreateUSKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzpath, (uint32_t)samdesired, (int64_t)hrelativeuskey, (void*)(uintptr_t)phnewuskey, (uint32_t)dwflags) : 0;
#else
    (void)pwzpath;
    (void)samdesired;
    (void)hrelativeuskey;
    (void)phnewuskey;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegDeleteEmptyUSKeyA(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pszsubkey, jint delregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDeleteEmptyUSKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pszsubkey, (int32_t)delregflags) : 0;
#else
    (void)huskey;
    (void)pszsubkey;
    (void)delregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegDeleteEmptyUSKeyW(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pwzsubkey, jint delregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDeleteEmptyUSKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pwzsubkey, (int32_t)delregflags) : 0;
#else
    (void)huskey;
    (void)pwzsubkey;
    (void)delregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegDeleteUSValueA(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pszvalue, jint delregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDeleteUSValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pszvalue, (int32_t)delregflags) : 0;
#else
    (void)huskey;
    (void)pszvalue;
    (void)delregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegDeleteUSValueW(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pwzvalue, jint delregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDeleteUSValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pwzvalue, (int32_t)delregflags) : 0;
#else
    (void)huskey;
    (void)pwzvalue;
    (void)delregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegDuplicateHKey(JNIEnv* km_env, jclass km_clazz, jlong hkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegDuplicateHKey");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey) : NULL;
#else
    (void)hkey;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegEnumUSKeyA(JNIEnv* km_env, jclass km_clazz, jlong huskey, jint dwindex, jlong pszname, jlong pcchname, jint enumregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegEnumUSKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (uint32_t)dwindex, (void*)(uintptr_t)pszname, (void*)(uintptr_t)pcchname, (int32_t)enumregflags) : 0;
#else
    (void)huskey;
    (void)dwindex;
    (void)pszname;
    (void)pcchname;
    (void)enumregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegEnumUSKeyW(JNIEnv* km_env, jclass km_clazz, jlong huskey, jint dwindex, jlong pwzname, jlong pcchname, jint enumregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegEnumUSKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (uint32_t)dwindex, (void*)(uintptr_t)pwzname, (void*)(uintptr_t)pcchname, (int32_t)enumregflags) : 0;
#else
    (void)huskey;
    (void)dwindex;
    (void)pwzname;
    (void)pcchname;
    (void)enumregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegEnumUSValueA(JNIEnv* km_env, jclass km_clazz, jlong huskey, jint dwindex, jlong pszvaluename, jlong pcchvaluename, jlong pdwtype, jlong pvdata, jlong pcbdata, jint enumregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegEnumUSValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (uint32_t)dwindex, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)pcchvaluename, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata, (int32_t)enumregflags) : 0;
#else
    (void)huskey;
    (void)dwindex;
    (void)pszvaluename;
    (void)pcchvaluename;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)enumregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegEnumUSValueW(JNIEnv* km_env, jclass km_clazz, jlong huskey, jint dwindex, jlong pszvaluename, jlong pcchvaluename, jlong pdwtype, jlong pvdata, jlong pcbdata, jint enumregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegEnumUSValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (uint32_t)dwindex, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)pcchvaluename, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata, (int32_t)enumregflags) : 0;
#else
    (void)huskey;
    (void)dwindex;
    (void)pszvaluename;
    (void)pcchvaluename;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)enumregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetBoolUSValueA(JNIEnv* km_env, jclass km_clazz, jlong pszsubkey, jlong pszvalue, jint fignorehkcu, jint fdefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetBoolUSValueA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (int32_t)fignorehkcu, (int32_t)fdefault) : -1;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)fignorehkcu;
    (void)fdefault;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetBoolUSValueW(JNIEnv* km_env, jclass km_clazz, jlong pszsubkey, jlong pszvalue, jint fignorehkcu, jint fdefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetBoolUSValueW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (int32_t)fignorehkcu, (int32_t)fdefault) : -1;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)fignorehkcu;
    (void)fdefault;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetIntW(JNIEnv* km_env, jclass km_clazz, jlong hk, jlong pwzkey, jint idefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetIntW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hk, (void*)(uintptr_t)pwzkey, (int32_t)idefault) : -1;
#else
    (void)hk;
    (void)pwzkey;
    (void)idefault;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetPathA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pcszsubkey, jlong pcszvalue, jlong pszpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pcszsubkey, (void*)(uintptr_t)pcszvalue, (void*)(uintptr_t)pszpath, (uint32_t)dwflags) : 0;
#else
    (void)hkey;
    (void)pcszsubkey;
    (void)pcszvalue;
    (void)pszpath;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetPathW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pcszsubkey, jlong pcszvalue, jlong pszpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pcszsubkey, (void*)(uintptr_t)pcszvalue, (void*)(uintptr_t)pszpath, (uint32_t)dwflags) : 0;
#else
    (void)hkey;
    (void)pcszsubkey;
    (void)pcszvalue;
    (void)pszpath;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetUSValueA(JNIEnv* km_env, jclass km_clazz, jlong pszsubkey, jlong pszvalue, jlong pdwtype, jlong pvdata, jlong pcbdata, jint fignorehkcu, jlong pvdefaultdata, jint dwdefaultdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetUSValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata, (int32_t)fignorehkcu, (void*)(uintptr_t)pvdefaultdata, (uint32_t)dwdefaultdatasize) : 0;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)fignorehkcu;
    (void)pvdefaultdata;
    (void)dwdefaultdatasize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetUSValueW(JNIEnv* km_env, jclass km_clazz, jlong pszsubkey, jlong pszvalue, jlong pdwtype, jlong pvdata, jlong pcbdata, jint fignorehkcu, jlong pvdefaultdata, jint dwdefaultdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetUSValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata, (int32_t)fignorehkcu, (void*)(uintptr_t)pvdefaultdata, (uint32_t)dwdefaultdatasize) : 0;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)fignorehkcu;
    (void)pvdefaultdata;
    (void)dwdefaultdatasize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jint srrfflags, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (int32_t)srrfflags, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)srrfflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetValueFromHKCUHKLM(JNIEnv* km_env, jclass km_clazz, jlong pwszkey, jlong pwszvalue, jint srrfflags, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetValueFromHKCUHKLM");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszkey, (void*)(uintptr_t)pwszvalue, (int32_t)srrfflags, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)pwszkey;
    (void)pwszvalue;
    (void)srrfflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegGetValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jint srrfflags, jlong pdwtype, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegGetValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (int32_t)srrfflags, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)srrfflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegOpenUSKeyA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jint samdesired, jlong hrelativeuskey, jlong phnewuskey, jint fignorehkcu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegOpenUSKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (uint32_t)samdesired, (int64_t)hrelativeuskey, (void*)(uintptr_t)phnewuskey, (int32_t)fignorehkcu) : 0;
#else
    (void)pszpath;
    (void)samdesired;
    (void)hrelativeuskey;
    (void)phnewuskey;
    (void)fignorehkcu;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegOpenUSKeyW(JNIEnv* km_env, jclass km_clazz, jlong pwzpath, jint samdesired, jlong hrelativeuskey, jlong phnewuskey, jint fignorehkcu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegOpenUSKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzpath, (uint32_t)samdesired, (int64_t)hrelativeuskey, (void*)(uintptr_t)phnewuskey, (int32_t)fignorehkcu) : 0;
#else
    (void)pwzpath;
    (void)samdesired;
    (void)hrelativeuskey;
    (void)phnewuskey;
    (void)fignorehkcu;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegQueryInfoUSKeyA(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pcsubkeys, jlong pcchmaxsubkeylen, jlong pcvalues, jlong pcchmaxvaluenamelen, jint enumregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegQueryInfoUSKeyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pcsubkeys, (void*)(uintptr_t)pcchmaxsubkeylen, (void*)(uintptr_t)pcvalues, (void*)(uintptr_t)pcchmaxvaluenamelen, (int32_t)enumregflags) : 0;
#else
    (void)huskey;
    (void)pcsubkeys;
    (void)pcchmaxsubkeylen;
    (void)pcvalues;
    (void)pcchmaxvaluenamelen;
    (void)enumregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegQueryInfoUSKeyW(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pcsubkeys, jlong pcchmaxsubkeylen, jlong pcvalues, jlong pcchmaxvaluenamelen, jint enumregflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegQueryInfoUSKeyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pcsubkeys, (void*)(uintptr_t)pcchmaxsubkeylen, (void*)(uintptr_t)pcvalues, (void*)(uintptr_t)pcchmaxvaluenamelen, (int32_t)enumregflags) : 0;
#else
    (void)huskey;
    (void)pcsubkeys;
    (void)pcchmaxsubkeylen;
    (void)pcvalues;
    (void)pcchmaxvaluenamelen;
    (void)enumregflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegQueryUSValueA(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pszvalue, jlong pdwtype, jlong pvdata, jlong pcbdata, jint fignorehkcu, jlong pvdefaultdata, jint dwdefaultdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegQueryUSValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata, (int32_t)fignorehkcu, (void*)(uintptr_t)pvdefaultdata, (uint32_t)dwdefaultdatasize) : 0;
#else
    (void)huskey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)fignorehkcu;
    (void)pvdefaultdata;
    (void)dwdefaultdatasize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegQueryUSValueW(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pszvalue, jlong pdwtype, jlong pvdata, jlong pcbdata, jint fignorehkcu, jlong pvdefaultdata, jint dwdefaultdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegQueryUSValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pszvalue, (void*)(uintptr_t)pdwtype, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata, (int32_t)fignorehkcu, (void*)(uintptr_t)pvdefaultdata, (uint32_t)dwdefaultdatasize) : 0;
#else
    (void)huskey;
    (void)pszvalue;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    (void)fignorehkcu;
    (void)pvdefaultdata;
    (void)dwdefaultdatasize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegSetPathA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pcszsubkey, jlong pcszvalue, jlong pcszpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegSetPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pcszsubkey, (void*)(uintptr_t)pcszvalue, (void*)(uintptr_t)pcszpath, (uint32_t)dwflags) : 0;
#else
    (void)hkey;
    (void)pcszsubkey;
    (void)pcszvalue;
    (void)pcszpath;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegSetPathW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pcszsubkey, jlong pcszvalue, jlong pcszpath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegSetPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pcszsubkey, (void*)(uintptr_t)pcszvalue, (void*)(uintptr_t)pcszpath, (uint32_t)dwflags) : 0;
#else
    (void)hkey;
    (void)pcszsubkey;
    (void)pcszvalue;
    (void)pcszpath;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegSetUSValueA(JNIEnv* km_env, jclass km_clazz, jlong pszsubkey, jlong pszvalue, jint dwtype, jlong pvdata, jint cbdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegSetUSValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (uint32_t)dwtype, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)dwflags) : 0;
#else
    (void)pszsubkey;
    (void)pszvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegSetUSValueW(JNIEnv* km_env, jclass km_clazz, jlong pwzsubkey, jlong pwzvalue, jint dwtype, jlong pvdata, jint cbdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegSetUSValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzsubkey, (void*)(uintptr_t)pwzvalue, (uint32_t)dwtype, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)dwflags) : 0;
#else
    (void)pwzsubkey;
    (void)pwzvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegWriteUSValueA(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pszvalue, jint dwtype, jlong pvdata, jint cbdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegWriteUSValueA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pszvalue, (uint32_t)dwtype, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)dwflags) : 0;
#else
    (void)huskey;
    (void)pszvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRegWriteUSValueW(JNIEnv* km_env, jclass km_clazz, jlong huskey, jlong pwzvalue, jint dwtype, jlong pvdata, jint cbdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRegWriteUSValueW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)huskey, (void*)(uintptr_t)pwzvalue, (uint32_t)dwtype, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)dwflags) : 0;
#else
    (void)huskey;
    (void)pwzvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHReleaseThreadRef(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHReleaseThreadRef");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRemoveLocalizedName(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRemoveLocalizedName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHResolveLibrary(JNIEnv* km_env, jclass km_clazz, jlong psilibrary) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHResolveLibrary");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psilibrary) : -1;
#else
    (void)psilibrary;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHRestricted(JNIEnv* km_env, jclass km_clazz, jint rest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHRestricted");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)rest) : 0;
#else
    (void)rest;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSendMessageBroadcastA(JNIEnv* km_env, jclass km_clazz, jint umsg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSendMessageBroadcastA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)umsg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)umsg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSendMessageBroadcastW(JNIEnv* km_env, jclass km_clazz, jint umsg, jlong wparam, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(uint32_t, uint64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSendMessageBroadcastW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)umsg, (uint64_t)wparam, (int64_t)lparam) : -1;
#else
    (void)umsg;
    (void)wparam;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetDefaultProperties(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong psi, jint dwfileopflags, jlong pfops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetDefaultProperties");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)psi, (uint32_t)dwfileopflags, (void*)(uintptr_t)pfops) : -1;
#else
    (void)hwnd;
    (void)psi;
    (void)dwfileopflags;
    (void)pfops;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetFolderPathA(JNIEnv* km_env, jclass km_clazz, jint csidl, jlong htoken, jint dwflags, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetFolderPathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)csidl, (void*)(uintptr_t)htoken, (uint32_t)dwflags, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetFolderPathW(JNIEnv* km_env, jclass km_clazz, jint csidl, jlong htoken, jint dwflags, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetFolderPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)csidl, (void*)(uintptr_t)htoken, (uint32_t)dwflags, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)csidl;
    (void)htoken;
    (void)dwflags;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetInstanceExplorer(JNIEnv* km_env, jclass km_clazz, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetInstanceExplorer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)punk);
#else
    (void)punk;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetKnownFolderPath(JNIEnv* km_env, jclass km_clazz, jlong rfid, jint dwflags, jlong htoken, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetKnownFolderPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rfid, (uint32_t)dwflags, (void*)(uintptr_t)htoken, (void*)(uintptr_t)pszpath) : -1;
#else
    (void)rfid;
    (void)dwflags;
    (void)htoken;
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetLocalizedName(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszresmodule, jint idsres) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetLocalizedName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszresmodule, (int32_t)idsres) : -1;
#else
    (void)pszpath;
    (void)pszresmodule;
    (void)idsres;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetTemporaryPropertyForItem(JNIEnv* km_env, jclass km_clazz, jlong psi, jlong propkey, jlong propvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetTemporaryPropertyForItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psi, (void*)(uintptr_t)propkey, (void*)(uintptr_t)propvar) : -1;
#else
    (void)psi;
    (void)propkey;
    (void)propvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetThreadRef(JNIEnv* km_env, jclass km_clazz, jlong punk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetThreadRef");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk) : -1;
#else
    (void)punk;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetUnreadMailCountW(JNIEnv* km_env, jclass km_clazz, jlong pszmailaddress, jint dwcount, jlong pszshellexecutecommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetUnreadMailCountW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszmailaddress, (uint32_t)dwcount, (void*)(uintptr_t)pszshellexecutecommand) : -1;
#else
    (void)pszmailaddress;
    (void)dwcount;
    (void)pszshellexecutecommand;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetValueA(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jint dwtype, jlong pvdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetValueA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (uint32_t)dwtype, (void*)(uintptr_t)pvdata, (uint32_t)cbdata) : -1;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSetValueW(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszsubkey, jlong pszvalue, jint dwtype, jlong pvdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSetValueW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pszsubkey, (void*)(uintptr_t)pszvalue, (uint32_t)dwtype, (void*)(uintptr_t)pvdata, (uint32_t)cbdata) : -1;
#else
    (void)hkey;
    (void)pszsubkey;
    (void)pszvalue;
    (void)dwtype;
    (void)pvdata;
    (void)cbdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shshellFolderViewMessage(JNIEnv* km_env, jclass km_clazz, jlong hwndmain, jint umsg, jlong lparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHShellFolderView_Message");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndmain, (uint32_t)umsg, (int64_t)lparam) : -1;
#else
    (void)hwndmain;
    (void)umsg;
    (void)lparam;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHShowManageLibraryUI(JNIEnv* km_env, jclass km_clazz, jlong psilibrary, jlong hwndowner, jlong psztitle, jlong pszinstruction, jint lmdoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHShowManageLibraryUI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psilibrary, (void*)(uintptr_t)hwndowner, (void*)(uintptr_t)psztitle, (void*)(uintptr_t)pszinstruction, (int32_t)lmdoptions) : -1;
#else
    (void)psilibrary;
    (void)hwndowner;
    (void)psztitle;
    (void)pszinstruction;
    (void)lmdoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSimpleIDListFromPath(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSimpleIDListFromPath");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : NULL;
#else
    (void)pszpath;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHSkipJunction(JNIEnv* km_env, jclass km_clazz, jlong pbc, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHSkipJunction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbc, (void*)(uintptr_t)pclsid) : -1;
#else
    (void)pbc;
    (void)pclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHStartNetConnectionDialogW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszremotename, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStartNetConnectionDialogW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszremotename, (uint32_t)dwtype) : -1;
#else
    (void)hwnd;
    (void)pszremotename;
    (void)dwtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHStrDupA(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong ppwsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStrDupA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)ppwsz) : -1;
#else
    (void)psz;
    (void)ppwsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHStrDupW(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong ppwsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStrDupW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)ppwsz) : -1;
#else
    (void)psz;
    (void)ppwsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHStripMneumonicA(JNIEnv* km_env, jclass km_clazz, jlong pszmenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStripMneumonicA");
    }
    int8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszmenu) : -1;
#else
    (void)pszmenu;
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHStripMneumonicW(JNIEnv* km_env, jclass km_clazz, jlong pszmenu) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHStripMneumonicW");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszmenu) : 0;
#else
    (void)pszmenu;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHTestTokenMembership(JNIEnv* km_env, jclass km_clazz, jlong htoken, jint ulrid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHTestTokenMembership");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (uint32_t)ulrid) : -1;
#else
    (void)htoken;
    (void)ulrid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHUnicodeToAnsi(JNIEnv* km_env, jclass km_clazz, jlong pwszsrc, jlong pszdst, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUnicodeToAnsi");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszsrc, (void*)(uintptr_t)pszdst, (int32_t)cchbuf) : -1;
#else
    (void)pwszsrc;
    (void)pszdst;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHUnicodeToUnicode(JNIEnv* km_env, jclass km_clazz, jlong pwzsrc, jlong pwzdst, jint cwchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUnicodeToUnicode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzsrc, (void*)(uintptr_t)pwzdst, (int32_t)cwchbuf) : -1;
#else
    (void)pwzsrc;
    (void)pwzdst;
    (void)cwchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHUnlockShared(JNIEnv* km_env, jclass km_clazz, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUnlockShared");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvdata) : -1;
#else
    (void)pvdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHUpdateImageA(JNIEnv* km_env, jclass km_clazz, jlong pszhashitem, jint iindex, jint uflags, jint iimageindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUpdateImageA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszhashitem, (int32_t)iindex, (uint32_t)uflags, (int32_t)iimageindex);
#else
    (void)pszhashitem;
    (void)iindex;
    (void)uflags;
    (void)iimageindex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHUpdateImageW(JNIEnv* km_env, jclass km_clazz, jlong pszhashitem, jint iindex, jint uflags, jint iimageindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHUpdateImageW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pszhashitem, (int32_t)iindex, (uint32_t)uflags, (int32_t)iimageindex);
#else
    (void)pszhashitem;
    (void)iindex;
    (void)uflags;
    (void)iimageindex;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1sHValidateUNC(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jlong pszfile, jint fconnect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SHValidateUNC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (void*)(uintptr_t)pszfile, (uint32_t)fconnect) : -1;
#else
    (void)hwndowner;
    (void)pszfile;
    (void)fconnect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1setCurrentProcessExplicitAppUserModelID(JNIEnv* km_env, jclass km_clazz, jlong appid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCurrentProcessExplicitAppUserModelID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)appid) : -1;
#else
    (void)appid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1setMenuContextHelpId(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetMenuContextHelpId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1setWindowContextHelpId(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowContextHelpId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (uint32_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1setWindowSubclass(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pfnsubclass, jlong uidsubclass, jlong dwrefdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("comctl32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWindowSubclass");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pfnsubclass, (uint64_t)uidsubclass, (uint64_t)dwrefdata) : -1;
#else
    (void)hwnd;
    (void)pfnsubclass;
    (void)uidsubclass;
    (void)dwrefdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellAboutA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szapp, jlong szotherstuff, jlong hicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellAboutA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szapp, (void*)(uintptr_t)szotherstuff, (void*)(uintptr_t)hicon) : -1;
#else
    (void)hwnd;
    (void)szapp;
    (void)szotherstuff;
    (void)hicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellAboutW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong szapp, jlong szotherstuff, jlong hicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellAboutW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)szapp, (void*)(uintptr_t)szotherstuff, (void*)(uintptr_t)hicon) : -1;
#else
    (void)hwnd;
    (void)szapp;
    (void)szotherstuff;
    (void)hicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellExecuteA(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpoperation, jlong lpfile, jlong lpparameters, jlong lpdirectory, jint nshowcmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellExecuteA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpoperation, (void*)(uintptr_t)lpfile, (void*)(uintptr_t)lpparameters, (void*)(uintptr_t)lpdirectory, (int32_t)nshowcmd) : NULL;
#else
    (void)hwnd;
    (void)lpoperation;
    (void)lpfile;
    (void)lpparameters;
    (void)lpdirectory;
    (void)nshowcmd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellExecuteExA(JNIEnv* km_env, jclass km_clazz, jlong pexecinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellExecuteExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pexecinfo) : -1;
#else
    (void)pexecinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellExecuteExW(JNIEnv* km_env, jclass km_clazz, jlong pexecinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellExecuteExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pexecinfo) : -1;
#else
    (void)pexecinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellExecuteW(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong lpoperation, jlong lpfile, jlong lpparameters, jlong lpdirectory, jint nshowcmd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellExecuteW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpoperation, (void*)(uintptr_t)lpfile, (void*)(uintptr_t)lpparameters, (void*)(uintptr_t)lpdirectory, (int32_t)nshowcmd) : NULL;
#else
    (void)hwnd;
    (void)lpoperation;
    (void)lpfile;
    (void)lpparameters;
    (void)lpdirectory;
    (void)nshowcmd;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellMessageBoxA(JNIEnv* km_env, jclass km_clazz, jlong happinst, jlong hwnd, jlong lpctext, jlong lpctitle, jint fustyle, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, void*, void*, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellMessageBoxA");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    }
#else
    (void)happinst;
    (void)hwnd;
    (void)lpctext;
    (void)lpctitle;
    (void)fustyle;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellMessageBoxW(JNIEnv* km_env, jclass km_clazz, jlong happinst, jlong hwnd, jlong lpctext, jlong lpctitle, jint fustyle, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, void*, void*, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ShellMessageBoxW");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)happinst, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)lpctext, (void*)(uintptr_t)lpctitle, (uint32_t)fustyle, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    }
#else
    (void)happinst;
    (void)hwnd;
    (void)lpctext;
    (void)lpctitle;
    (void)fustyle;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellGetCachedImageIndex(JNIEnv* km_env, jclass km_clazz, jlong pwsziconpath, jint iiconindex, jint uiconflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_GetCachedImageIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwsziconpath, (int32_t)iiconindex, (uint32_t)uiconflags) : -1;
#else
    (void)pwsziconpath;
    (void)iiconindex;
    (void)uiconflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellGetCachedImageIndexA(JNIEnv* km_env, jclass km_clazz, jlong psziconpath, jint iiconindex, jint uiconflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_GetCachedImageIndexA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psziconpath, (int32_t)iiconindex, (uint32_t)uiconflags) : -1;
#else
    (void)psziconpath;
    (void)iiconindex;
    (void)uiconflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellGetCachedImageIndexW(JNIEnv* km_env, jclass km_clazz, jlong psziconpath, jint iiconindex, jint uiconflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_GetCachedImageIndexW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psziconpath, (int32_t)iiconindex, (uint32_t)uiconflags) : -1;
#else
    (void)psziconpath;
    (void)iiconindex;
    (void)uiconflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellGetImageLists(JNIEnv* km_env, jclass km_clazz, jlong phiml, jlong phimlsmall) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_GetImageLists");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phiml, (void*)(uintptr_t)phimlsmall) : -1;
#else
    (void)phiml;
    (void)phimlsmall;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellMergeMenus(JNIEnv* km_env, jclass km_clazz, jlong hmdst, jlong hmsrc, jint uinsert, jint uidadjust, jint uidadjustmax, jint uflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_MergeMenus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hmdst, (void*)(uintptr_t)hmsrc, (uint32_t)uinsert, (uint32_t)uidadjust, (uint32_t)uidadjustmax, (uint32_t)uflags) : 0;
#else
    (void)hmdst;
    (void)hmsrc;
    (void)uinsert;
    (void)uidadjust;
    (void)uidadjustmax;
    (void)uflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellNotifyIconA(JNIEnv* km_env, jclass km_clazz, jint dwmessage, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_NotifyIconA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwmessage, (void*)(uintptr_t)lpdata) : -1;
#else
    (void)dwmessage;
    (void)lpdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellNotifyIconGetRect(JNIEnv* km_env, jclass km_clazz, jlong identifier, jlong iconlocation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_NotifyIconGetRect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)identifier, (void*)(uintptr_t)iconlocation) : -1;
#else
    (void)identifier;
    (void)iconlocation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1shellNotifyIconW(JNIEnv* km_env, jclass km_clazz, jint dwmessage, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Shell_NotifyIconW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwmessage, (void*)(uintptr_t)lpdata) : -1;
#else
    (void)dwmessage;
    (void)lpdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1signalFileOpen(JNIEnv* km_env, jclass km_clazz, jlong pidl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignalFileOpen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidl) : -1;
#else
    (void)pidl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1softwareUpdateMessageBox(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pszdistunit, jint dwflags, jlong psdi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shdocvw.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SoftwareUpdateMessageBox");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pszdistunit, (uint32_t)dwflags, (void*)(uintptr_t)psdi) : 0;
#else
    (void)hwnd;
    (void)pszdistunit;
    (void)dwflags;
    (void)psdi;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1stgMakeUniqueName(JNIEnv* km_env, jclass km_clazz, jlong pstgparent, jlong pszfilespec, jint grfmode, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgMakeUniqueName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstgparent, (void*)(uintptr_t)pszfilespec, (uint32_t)grfmode, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pstgparent;
    (void)pszfilespec;
    (void)grfmode;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCSpnA(JNIEnv* km_env, jclass km_clazz, jlong pszstr, jlong pszset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCSpnA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr, (void*)(uintptr_t)pszset) : -1;
#else
    (void)pszstr;
    (void)pszset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCSpnIA(JNIEnv* km_env, jclass km_clazz, jlong pszstr, jlong pszset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCSpnIA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr, (void*)(uintptr_t)pszset) : -1;
#else
    (void)pszstr;
    (void)pszset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCSpnIW(JNIEnv* km_env, jclass km_clazz, jlong pszstr, jlong pszset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCSpnIW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr, (void*)(uintptr_t)pszset) : -1;
#else
    (void)pszstr;
    (void)pszset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCSpnW(JNIEnv* km_env, jclass km_clazz, jlong pszstr, jlong pszset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCSpnW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr, (void*)(uintptr_t)pszset) : -1;
#else
    (void)pszstr;
    (void)pszset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCatBuffA(JNIEnv* km_env, jclass km_clazz, jlong pszdest, jlong pszsrc, jint cchdestbuffsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCatBuffA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdest, (void*)(uintptr_t)pszsrc, (int32_t)cchdestbuffsize) : NULL;
#else
    (void)pszdest;
    (void)pszsrc;
    (void)cchdestbuffsize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCatBuffW(JNIEnv* km_env, jclass km_clazz, jlong pszdest, jlong pszsrc, jint cchdestbuffsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCatBuffW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdest, (void*)(uintptr_t)pszsrc, (int32_t)cchdestbuffsize) : NULL;
#else
    (void)pszdest;
    (void)pszsrc;
    (void)cchdestbuffsize;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCatChainW(JNIEnv* km_env, jclass km_clazz, jlong pszdst, jint cchdst, jint ichat, jlong pszsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCatChainW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdst, (uint32_t)cchdst, (uint32_t)ichat, (void*)(uintptr_t)pszsrc) : 0;
#else
    (void)pszdst;
    (void)cchdst;
    (void)ichat;
    (void)pszsrc;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCatW(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCatW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2) : NULL;
#else
    (void)psz1;
    (void)psz2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strChrA(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jshort wmatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (uint16_t)wmatch) : NULL;
#else
    (void)pszstart;
    (void)wmatch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strChrIA(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jshort wmatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrIA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (uint16_t)wmatch) : NULL;
#else
    (void)pszstart;
    (void)wmatch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strChrIW(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jshort wmatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrIW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (uint16_t)wmatch) : NULL;
#else
    (void)pszstart;
    (void)wmatch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strChrNIW(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jshort wmatch, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrNIW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (uint16_t)wmatch, (uint32_t)cchmax) : NULL;
#else
    (void)pszstart;
    (void)wmatch;
    (void)cchmax;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strChrNW(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jshort wmatch, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrNW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (uint16_t)wmatch, (uint32_t)cchmax) : NULL;
#else
    (void)pszstart;
    (void)wmatch;
    (void)cchmax;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strChrW(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jshort wmatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrChrW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (uint16_t)wmatch) : NULL;
#else
    (void)pszstart;
    (void)wmatch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpCA(JNIEnv* km_env, jclass km_clazz, jlong pszstr1, jlong pszstr2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpCA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr1, (void*)(uintptr_t)pszstr2) : -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpCW(JNIEnv* km_env, jclass km_clazz, jlong pszstr1, jlong pszstr2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpCW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr1, (void*)(uintptr_t)pszstr2) : -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpICA(JNIEnv* km_env, jclass km_clazz, jlong pszstr1, jlong pszstr2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpICA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr1, (void*)(uintptr_t)pszstr2) : -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpICW(JNIEnv* km_env, jclass km_clazz, jlong pszstr1, jlong pszstr2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpICW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr1, (void*)(uintptr_t)pszstr2) : -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpIW(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpIW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2) : -1;
#else
    (void)psz1;
    (void)psz2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpLogicalW(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpLogicalW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2) : -1;
#else
    (void)psz1;
    (void)psz2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpNA(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2, (int32_t)nchar) : -1;
#else
    (void)psz1;
    (void)psz2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpNCA(JNIEnv* km_env, jclass km_clazz, jlong pszstr1, jlong pszstr2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNCA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr1, (void*)(uintptr_t)pszstr2, (int32_t)nchar) : -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpNCW(JNIEnv* km_env, jclass km_clazz, jlong pszstr1, jlong pszstr2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNCW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr1, (void*)(uintptr_t)pszstr2, (int32_t)nchar) : -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpNIA(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNIA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2, (int32_t)nchar) : -1;
#else
    (void)psz1;
    (void)psz2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpNICA(JNIEnv* km_env, jclass km_clazz, jlong pszstr1, jlong pszstr2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNICA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr1, (void*)(uintptr_t)pszstr2, (int32_t)nchar) : -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpNICW(JNIEnv* km_env, jclass km_clazz, jlong pszstr1, jlong pszstr2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNICW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstr1, (void*)(uintptr_t)pszstr2, (int32_t)nchar) : -1;
#else
    (void)pszstr1;
    (void)pszstr2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpNIW(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNIW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2, (int32_t)nchar) : -1;
#else
    (void)psz1;
    (void)psz2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpNW(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpNW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2, (int32_t)nchar) : -1;
#else
    (void)psz1;
    (void)psz2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCmpW(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCmpW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2) : -1;
#else
    (void)psz1;
    (void)psz2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCpyNW(JNIEnv* km_env, jclass km_clazz, jlong pszdst, jlong pszsrc, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCpyNW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdst, (void*)(uintptr_t)pszsrc, (int32_t)cchmax) : NULL;
#else
    (void)pszdst;
    (void)pszsrc;
    (void)cchmax;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strCpyW(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrCpyW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2) : NULL;
#else
    (void)psz1;
    (void)psz2;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strDupA(JNIEnv* km_env, jclass km_clazz, jlong pszsrch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrDupA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsrch) : NULL;
#else
    (void)pszsrch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strDupW(JNIEnv* km_env, jclass km_clazz, jlong pszsrch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrDupW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsrch) : NULL;
#else
    (void)pszsrch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strFormatByteSize64A(JNIEnv* km_env, jclass km_clazz, jlong qdw, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatByteSize64A");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)qdw, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : NULL;
#else
    (void)qdw;
    (void)pszbuf;
    (void)cchbuf;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strFormatByteSizeA(JNIEnv* km_env, jclass km_clazz, jint dw, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatByteSizeA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dw, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : NULL;
#else
    (void)dw;
    (void)pszbuf;
    (void)cchbuf;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strFormatByteSizeEx(JNIEnv* km_env, jclass km_clazz, jlong ull, jint flags, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatByteSizeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)ull, (int32_t)flags, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : -1;
#else
    (void)ull;
    (void)flags;
    (void)pszbuf;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strFormatByteSizeW(JNIEnv* km_env, jclass km_clazz, jlong qdw, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatByteSizeW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)qdw, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : NULL;
#else
    (void)qdw;
    (void)pszbuf;
    (void)cchbuf;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strFormatKBSizeA(JNIEnv* km_env, jclass km_clazz, jlong qdw, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatKBSizeA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)qdw, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : NULL;
#else
    (void)qdw;
    (void)pszbuf;
    (void)cchbuf;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strFormatKBSizeW(JNIEnv* km_env, jclass km_clazz, jlong qdw, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFormatKBSizeW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)qdw, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : NULL;
#else
    (void)qdw;
    (void)pszbuf;
    (void)cchbuf;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strFromTimeIntervalA(JNIEnv* km_env, jclass km_clazz, jlong pszout, jint cchmax, jint dwtimems, jint digits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFromTimeIntervalA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszout, (uint32_t)cchmax, (uint32_t)dwtimems, (int32_t)digits) : -1;
#else
    (void)pszout;
    (void)cchmax;
    (void)dwtimems;
    (void)digits;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strFromTimeIntervalW(JNIEnv* km_env, jclass km_clazz, jlong pszout, jint cchmax, jint dwtimems, jint digits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrFromTimeIntervalW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszout, (uint32_t)cchmax, (uint32_t)dwtimems, (int32_t)digits) : -1;
#else
    (void)pszout;
    (void)cchmax;
    (void)dwtimems;
    (void)digits;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strIsIntlEqualA(JNIEnv* km_env, jclass km_clazz, jint fcasesens, jlong pszstring1, jlong pszstring2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrIsIntlEqualA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fcasesens, (void*)(uintptr_t)pszstring1, (void*)(uintptr_t)pszstring2, (int32_t)nchar) : -1;
#else
    (void)fcasesens;
    (void)pszstring1;
    (void)pszstring2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strIsIntlEqualW(JNIEnv* km_env, jclass km_clazz, jint fcasesens, jlong pszstring1, jlong pszstring2, jint nchar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrIsIntlEqualW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fcasesens, (void*)(uintptr_t)pszstring1, (void*)(uintptr_t)pszstring2, (int32_t)nchar) : -1;
#else
    (void)fcasesens;
    (void)pszstring1;
    (void)pszstring2;
    (void)nchar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strNCatA(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrNCatA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2, (int32_t)cchmax) : NULL;
#else
    (void)psz1;
    (void)psz2;
    (void)cchmax;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strNCatW(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrNCatW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2, (int32_t)cchmax) : NULL;
#else
    (void)psz1;
    (void)psz2;
    (void)cchmax;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strPBrkA(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong pszset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrPBrkA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)pszset) : NULL;
#else
    (void)psz;
    (void)pszset;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strPBrkW(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong pszset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrPBrkW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)pszset) : NULL;
#else
    (void)psz;
    (void)pszset;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRChrA(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jlong pszend, jshort wmatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRChrA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (void*)(uintptr_t)pszend, (uint16_t)wmatch) : NULL;
#else
    (void)pszstart;
    (void)pszend;
    (void)wmatch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRChrIA(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jlong pszend, jshort wmatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRChrIA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (void*)(uintptr_t)pszend, (uint16_t)wmatch) : NULL;
#else
    (void)pszstart;
    (void)pszend;
    (void)wmatch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRChrIW(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jlong pszend, jshort wmatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRChrIW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (void*)(uintptr_t)pszend, (uint16_t)wmatch) : NULL;
#else
    (void)pszstart;
    (void)pszend;
    (void)wmatch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRChrW(JNIEnv* km_env, jclass km_clazz, jlong pszstart, jlong pszend, jshort wmatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRChrW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstart, (void*)(uintptr_t)pszend, (uint16_t)wmatch) : NULL;
#else
    (void)pszstart;
    (void)pszend;
    (void)wmatch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRStrIA(JNIEnv* km_env, jclass km_clazz, jlong pszsource, jlong pszlast, jlong pszsrch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRStrIA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsource, (void*)(uintptr_t)pszlast, (void*)(uintptr_t)pszsrch) : NULL;
#else
    (void)pszsource;
    (void)pszlast;
    (void)pszsrch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRStrIW(JNIEnv* km_env, jclass km_clazz, jlong pszsource, jlong pszlast, jlong pszsrch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRStrIW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsource, (void*)(uintptr_t)pszlast, (void*)(uintptr_t)pszsrch) : NULL;
#else
    (void)pszsource;
    (void)pszlast;
    (void)pszsrch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRetToBSTR(JNIEnv* km_env, jclass km_clazz, jlong pstr, jlong pidl, jlong pbstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToBSTR");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstr, (void*)(uintptr_t)pidl, (void*)(uintptr_t)pbstr) : -1;
#else
    (void)pstr;
    (void)pidl;
    (void)pbstr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRetToBufA(JNIEnv* km_env, jclass km_clazz, jlong pstr, jlong pidl, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToBufA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstr, (void*)(uintptr_t)pidl, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : -1;
#else
    (void)pstr;
    (void)pidl;
    (void)pszbuf;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRetToBufW(JNIEnv* km_env, jclass km_clazz, jlong pstr, jlong pidl, jlong pszbuf, jint cchbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToBufW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstr, (void*)(uintptr_t)pidl, (void*)(uintptr_t)pszbuf, (uint32_t)cchbuf) : -1;
#else
    (void)pstr;
    (void)pidl;
    (void)pszbuf;
    (void)cchbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRetToStrA(JNIEnv* km_env, jclass km_clazz, jlong pstr, jlong pidl, jlong ppsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToStrA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstr, (void*)(uintptr_t)pidl, (void*)(uintptr_t)ppsz) : -1;
#else
    (void)pstr;
    (void)pidl;
    (void)ppsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strRetToStrW(JNIEnv* km_env, jclass km_clazz, jlong pstr, jlong pidl, jlong ppsz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrRetToStrW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstr, (void*)(uintptr_t)pidl, (void*)(uintptr_t)ppsz) : -1;
#else
    (void)pstr;
    (void)pidl;
    (void)ppsz;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strSpnA(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong pszset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrSpnA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)pszset) : -1;
#else
    (void)psz;
    (void)pszset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strSpnW(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong pszset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrSpnW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)pszset) : -1;
#else
    (void)psz;
    (void)pszset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strStrA(JNIEnv* km_env, jclass km_clazz, jlong pszfirst, jlong pszsrch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfirst, (void*)(uintptr_t)pszsrch) : NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strStrIA(JNIEnv* km_env, jclass km_clazz, jlong pszfirst, jlong pszsrch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrIA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfirst, (void*)(uintptr_t)pszsrch) : NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strStrIW(JNIEnv* km_env, jclass km_clazz, jlong pszfirst, jlong pszsrch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrIW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfirst, (void*)(uintptr_t)pszsrch) : NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strStrNIW(JNIEnv* km_env, jclass km_clazz, jlong pszfirst, jlong pszsrch, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrNIW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfirst, (void*)(uintptr_t)pszsrch, (uint32_t)cchmax) : NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    (void)cchmax;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strStrNW(JNIEnv* km_env, jclass km_clazz, jlong pszfirst, jlong pszsrch, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrNW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfirst, (void*)(uintptr_t)pszsrch, (uint32_t)cchmax) : NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    (void)cchmax;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strStrW(JNIEnv* km_env, jclass km_clazz, jlong pszfirst, jlong pszsrch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrStrW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszfirst, (void*)(uintptr_t)pszsrch) : NULL;
#else
    (void)pszfirst;
    (void)pszsrch;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strToInt64ExA(JNIEnv* km_env, jclass km_clazz, jlong pszstring, jint dwflags, jlong pllret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToInt64ExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstring, (int32_t)dwflags, (void*)(uintptr_t)pllret) : -1;
#else
    (void)pszstring;
    (void)dwflags;
    (void)pllret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strToInt64ExW(JNIEnv* km_env, jclass km_clazz, jlong pszstring, jint dwflags, jlong pllret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToInt64ExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstring, (int32_t)dwflags, (void*)(uintptr_t)pllret) : -1;
#else
    (void)pszstring;
    (void)dwflags;
    (void)pllret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strToIntA(JNIEnv* km_env, jclass km_clazz, jlong pszsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToIntA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsrc) : -1;
#else
    (void)pszsrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strToIntExA(JNIEnv* km_env, jclass km_clazz, jlong pszstring, jint dwflags, jlong piret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToIntExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstring, (int32_t)dwflags, (void*)(uintptr_t)piret) : -1;
#else
    (void)pszstring;
    (void)dwflags;
    (void)piret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strToIntExW(JNIEnv* km_env, jclass km_clazz, jlong pszstring, jint dwflags, jlong piret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToIntExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszstring, (int32_t)dwflags, (void*)(uintptr_t)piret) : -1;
#else
    (void)pszstring;
    (void)dwflags;
    (void)piret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strToIntW(JNIEnv* km_env, jclass km_clazz, jlong pszsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrToIntW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsrc) : -1;
#else
    (void)pszsrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strTrimA(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong psztrimchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrTrimA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)psztrimchars) : -1;
#else
    (void)psz;
    (void)psztrimchars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1strTrimW(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong psztrimchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StrTrimW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)psztrimchars) : -1;
#else
    (void)psz;
    (void)psztrimchars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1unloadUserProfile(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong hprofile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("userenv.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnloadUserProfile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)hprofile) : -1;
#else
    (void)htoken;
    (void)hprofile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1unregisterAppConstrainedChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong registration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-psm-appnotify-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterAppConstrainedChangeNotification");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)registration);
#else
    (void)registration;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1unregisterAppStateChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong registration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-psm-appnotify-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterAppStateChangeNotification");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)registration);
#else
    (void)registration;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1unregisterScaleChangeEvent(JNIEnv* km_env, jclass km_clazz, jlong dwcookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-shcore-scaling-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterScaleChangeEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)dwcookie) : -1;
#else
    (void)dwcookie;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlApplySchemeA(JNIEnv* km_env, jclass km_clazz, jlong pszin, jlong pszout, jlong pcchout, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlApplySchemeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszin, (void*)(uintptr_t)pszout, (void*)(uintptr_t)pcchout, (uint32_t)dwflags) : -1;
#else
    (void)pszin;
    (void)pszout;
    (void)pcchout;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlApplySchemeW(JNIEnv* km_env, jclass km_clazz, jlong pszin, jlong pszout, jlong pcchout, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlApplySchemeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszin, (void*)(uintptr_t)pszout, (void*)(uintptr_t)pcchout, (uint32_t)dwflags) : -1;
#else
    (void)pszin;
    (void)pszout;
    (void)pcchout;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlCanonicalizeA(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszcanonicalized, jlong pcchcanonicalized, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCanonicalizeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszcanonicalized, (void*)(uintptr_t)pcchcanonicalized, (uint32_t)dwflags) : -1;
#else
    (void)pszurl;
    (void)pszcanonicalized;
    (void)pcchcanonicalized;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlCanonicalizeW(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszcanonicalized, jlong pcchcanonicalized, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCanonicalizeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszcanonicalized, (void*)(uintptr_t)pcchcanonicalized, (uint32_t)dwflags) : -1;
#else
    (void)pszurl;
    (void)pszcanonicalized;
    (void)pcchcanonicalized;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlCombineA(JNIEnv* km_env, jclass km_clazz, jlong pszbase, jlong pszrelative, jlong pszcombined, jlong pcchcombined, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCombineA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszbase, (void*)(uintptr_t)pszrelative, (void*)(uintptr_t)pszcombined, (void*)(uintptr_t)pcchcombined, (uint32_t)dwflags) : -1;
#else
    (void)pszbase;
    (void)pszrelative;
    (void)pszcombined;
    (void)pcchcombined;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlCombineW(JNIEnv* km_env, jclass km_clazz, jlong pszbase, jlong pszrelative, jlong pszcombined, jlong pcchcombined, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCombineW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszbase, (void*)(uintptr_t)pszrelative, (void*)(uintptr_t)pszcombined, (void*)(uintptr_t)pcchcombined, (uint32_t)dwflags) : -1;
#else
    (void)pszbase;
    (void)pszrelative;
    (void)pszcombined;
    (void)pcchcombined;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlCompareA(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2, jint fignoreslash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCompareA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2, (int32_t)fignoreslash) : -1;
#else
    (void)psz1;
    (void)psz2;
    (void)fignoreslash;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlCompareW(JNIEnv* km_env, jclass km_clazz, jlong psz1, jlong psz2, jint fignoreslash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCompareW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz1, (void*)(uintptr_t)psz2, (int32_t)fignoreslash) : -1;
#else
    (void)psz1;
    (void)psz2;
    (void)fignoreslash;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlCreateFromPathA(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszurl, jlong pcchurl, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCreateFromPathA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszurl, (void*)(uintptr_t)pcchurl, (uint32_t)dwflags) : -1;
#else
    (void)pszpath;
    (void)pszurl;
    (void)pcchurl;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlCreateFromPathW(JNIEnv* km_env, jclass km_clazz, jlong pszpath, jlong pszurl, jlong pcchurl, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlCreateFromPathW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath, (void*)(uintptr_t)pszurl, (void*)(uintptr_t)pcchurl, (uint32_t)dwflags) : -1;
#else
    (void)pszpath;
    (void)pszurl;
    (void)pcchurl;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlEscapeA(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszescaped, jlong pcchescaped, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlEscapeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszescaped, (void*)(uintptr_t)pcchescaped, (uint32_t)dwflags) : -1;
#else
    (void)pszurl;
    (void)pszescaped;
    (void)pcchescaped;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlEscapeW(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszescaped, jlong pcchescaped, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlEscapeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszescaped, (void*)(uintptr_t)pcchescaped, (uint32_t)dwflags) : -1;
#else
    (void)pszurl;
    (void)pszescaped;
    (void)pcchescaped;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlFixupW(JNIEnv* km_env, jclass km_clazz, jlong pcszurl, jlong psztranslatedurl, jint cchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlFixupW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcszurl, (void*)(uintptr_t)psztranslatedurl, (uint32_t)cchmax) : -1;
#else
    (void)pcszurl;
    (void)psztranslatedurl;
    (void)cchmax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlGetLocationA(JNIEnv* km_env, jclass km_clazz, jlong pszurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlGetLocationA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl) : NULL;
#else
    (void)pszurl;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlGetLocationW(JNIEnv* km_env, jclass km_clazz, jlong pszurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlGetLocationW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl) : NULL;
#else
    (void)pszurl;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlGetPartA(JNIEnv* km_env, jclass km_clazz, jlong pszin, jlong pszout, jlong pcchout, jint dwpart, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlGetPartA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszin, (void*)(uintptr_t)pszout, (void*)(uintptr_t)pcchout, (uint32_t)dwpart, (uint32_t)dwflags) : -1;
#else
    (void)pszin;
    (void)pszout;
    (void)pcchout;
    (void)dwpart;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlGetPartW(JNIEnv* km_env, jclass km_clazz, jlong pszin, jlong pszout, jlong pcchout, jint dwpart, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlGetPartW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszin, (void*)(uintptr_t)pszout, (void*)(uintptr_t)pcchout, (uint32_t)dwpart, (uint32_t)dwflags) : -1;
#else
    (void)pszin;
    (void)pszout;
    (void)pcchout;
    (void)dwpart;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlHashA(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pbhash, jint cbhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlHashA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pbhash, (uint32_t)cbhash) : -1;
#else
    (void)pszurl;
    (void)pbhash;
    (void)cbhash;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlHashW(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pbhash, jint cbhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlHashW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pbhash, (uint32_t)cbhash) : -1;
#else
    (void)pszurl;
    (void)pbhash;
    (void)cbhash;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlIsA(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jint urlis) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (int32_t)urlis) : -1;
#else
    (void)pszurl;
    (void)urlis;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlIsNoHistoryA(JNIEnv* km_env, jclass km_clazz, jlong pszurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsNoHistoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl) : -1;
#else
    (void)pszurl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlIsNoHistoryW(JNIEnv* km_env, jclass km_clazz, jlong pszurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsNoHistoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl) : -1;
#else
    (void)pszurl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlIsOpaqueA(JNIEnv* km_env, jclass km_clazz, jlong pszurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsOpaqueA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl) : -1;
#else
    (void)pszurl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlIsOpaqueW(JNIEnv* km_env, jclass km_clazz, jlong pszurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsOpaqueW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl) : -1;
#else
    (void)pszurl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlIsW(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jint urlis) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlIsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (int32_t)urlis) : -1;
#else
    (void)pszurl;
    (void)urlis;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlUnescapeA(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszunescaped, jlong pcchunescaped, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlUnescapeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszunescaped, (void*)(uintptr_t)pcchunescaped, (uint32_t)dwflags) : -1;
#else
    (void)pszurl;
    (void)pszunescaped;
    (void)pcchunescaped;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1urlUnescapeW(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszunescaped, jlong pcchunescaped, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UrlUnescapeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszunescaped, (void*)(uintptr_t)pcchunescaped, (uint32_t)dwflags) : -1;
#else
    (void)pszurl;
    (void)pszunescaped;
    (void)pcchunescaped;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1variantToStrRet(JNIEnv* km_env, jclass km_clazz, jlong varin, jlong pstrret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToStrRet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)varin, (void*)(uintptr_t)pstrret) : -1;
#else
    (void)varin;
    (void)pstrret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1whichPlatform(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WhichPlatform");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1win32DeleteFile(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Win32DeleteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1winHelpA(JNIEnv* km_env, jclass km_clazz, jlong hwndmain, jlong lpszhelp, jint ucommand, jlong dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHelpA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndmain, (void*)(uintptr_t)lpszhelp, (uint32_t)ucommand, (uint64_t)dwdata) : -1;
#else
    (void)hwndmain;
    (void)lpszhelp;
    (void)ucommand;
    (void)dwdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1winHelpW(JNIEnv* km_env, jclass km_clazz, jlong hwndmain, jlong lpszhelp, jint ucommand, jlong dwdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinHelpW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndmain, (void*)(uintptr_t)lpszhelp, (uint32_t)ucommand, (uint64_t)dwdata) : -1;
#else
    (void)hwndmain;
    (void)lpszhelp;
    (void)ucommand;
    (void)dwdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1writeCabinetState(JNIEnv* km_env, jclass km_clazz, jlong pcs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shell32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteCabinetState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcs) : -1;
#else
    (void)pcs;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1wnsprintfA(JNIEnv* km_env, jclass km_clazz, jlong pszdest, jint cchdest, jlong pszfmt, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, int32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wnsprintfA");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    }
#else
    (void)pszdest;
    (void)cchdest;
    (void)pszfmt;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1wnsprintfW(JNIEnv* km_env, jclass km_clazz, jlong pszdest, jint cchdest, jlong pszfmt, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, int32_t, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wnsprintfW");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    }
#else
    (void)pszdest;
    (void)cchdest;
    (void)pszfmt;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1wvnsprintfA(JNIEnv* km_env, jclass km_clazz, jlong pszdest, jint cchdest, jlong pszfmt, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wvnsprintfA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (void*)(uintptr_t)arglist) : -1;
#else
    (void)pszdest;
    (void)cchdest;
    (void)pszfmt;
    (void)arglist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_ui_shell_WindowsWin32UiShellJniBridge_windowssys_1windows_1win32_1ui_1shell_1wvnsprintfW(JNIEnv* km_env, jclass km_clazz, jlong pszdest, jint cchdest, jlong pszfmt, jlong arglist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("shlwapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "wvnsprintfW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszdest, (int32_t)cchdest, (void*)(uintptr_t)pszfmt, (void*)(uintptr_t)arglist) : -1;
#else
    (void)pszdest;
    (void)cchdest;
    (void)pszfmt;
    (void)arglist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

