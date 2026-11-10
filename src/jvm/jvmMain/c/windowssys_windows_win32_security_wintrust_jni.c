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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1openPersonalTrustDBDialog(JNIEnv* km_env, jclass km_clazz, jlong hwndparent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPersonalTrustDBDialog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent) : -1;
#else
    (void)hwndparent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1openPersonalTrustDBDialogEx(JNIEnv* km_env, jclass km_clazz, jlong hwndparent, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPersonalTrustDBDialogEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndparent, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)hwndparent;
    (void)dwflags;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wTHelperCertCheckValidSignature(JNIEnv* km_env, jclass km_clazz, jlong pprovdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperCertCheckValidSignature");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovdata) : -1;
#else
    (void)pprovdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wTHelperCertIsSelfSigned(JNIEnv* km_env, jclass km_clazz, jint dwencoding, jlong pcert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperCertIsSelfSigned");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwencoding, (void*)(uintptr_t)pcert) : -1;
#else
    (void)dwencoding;
    (void)pcert;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wTHelperGetProvCertFromChain(JNIEnv* km_env, jclass km_clazz, jlong psgnr, jint idxcert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperGetProvCertFromChain");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psgnr, (uint32_t)idxcert) : NULL;
#else
    (void)psgnr;
    (void)idxcert;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wTHelperGetProvPrivateDataFromChain(JNIEnv* km_env, jclass km_clazz, jlong pprovdata, jlong pgproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperGetProvPrivateDataFromChain");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovdata, (void*)(uintptr_t)pgproviderid) : NULL;
#else
    (void)pprovdata;
    (void)pgproviderid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wTHelperGetProvSignerFromChain(JNIEnv* km_env, jclass km_clazz, jlong pprovdata, jint idxsigner, jint fcountersigner, jint idxcountersigner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperGetProvSignerFromChain");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovdata, (uint32_t)idxsigner, (int32_t)fcountersigner, (uint32_t)idxcountersigner) : NULL;
#else
    (void)pprovdata;
    (void)idxsigner;
    (void)fcountersigner;
    (void)idxcountersigner;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wTHelperProvDataFromStateData(JNIEnv* km_env, jclass km_clazz, jlong hstatedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WTHelperProvDataFromStateData");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstatedata) : NULL;
#else
    (void)hstatedata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1winVerifyTrust(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pgactionid, jlong pwvtdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinVerifyTrust");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pgactionid, (void*)(uintptr_t)pwvtdata) : -1;
#else
    (void)hwnd;
    (void)pgactionid;
    (void)pwvtdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1winVerifyTrustEx(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pgactionid, jlong pwintrustdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinVerifyTrustEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pgactionid, (void*)(uintptr_t)pwintrustdata) : -1;
#else
    (void)hwnd;
    (void)pgactionid;
    (void)pwintrustdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wintrustAddActionID(JNIEnv* km_env, jclass km_clazz, jlong pgactionid, jint fdwflags, jlong psprovinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustAddActionID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pgactionid, (uint32_t)fdwflags, (void*)(uintptr_t)psprovinfo) : -1;
#else
    (void)pgactionid;
    (void)fdwflags;
    (void)psprovinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wintrustAddDefaultForUsage(JNIEnv* km_env, jclass km_clazz, jlong pszusageoid, jlong psdefusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustAddDefaultForUsage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszusageoid, (void*)(uintptr_t)psdefusage) : -1;
#else
    (void)pszusageoid;
    (void)psdefusage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wintrustGetDefaultForUsage(JNIEnv* km_env, jclass km_clazz, jint dwaction, jlong pszusageoid, jlong psusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustGetDefaultForUsage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwaction, (void*)(uintptr_t)pszusageoid, (void*)(uintptr_t)psusage) : -1;
#else
    (void)dwaction;
    (void)pszusageoid;
    (void)psusage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wintrustGetRegPolicyFlags(JNIEnv* km_env, jclass km_clazz, jlong pdwpolicyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustGetRegPolicyFlags");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pdwpolicyflags);
#else
    (void)pdwpolicyflags;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wintrustLoadFunctionPointers(JNIEnv* km_env, jclass km_clazz, jlong pgactionid, jlong ppfns) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustLoadFunctionPointers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pgactionid, (void*)(uintptr_t)ppfns) : -1;
#else
    (void)pgactionid;
    (void)ppfns;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wintrustRemoveActionID(JNIEnv* km_env, jclass km_clazz, jlong pgactionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustRemoveActionID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pgactionid) : -1;
#else
    (void)pgactionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wintrustSetDefaultIncludePEPageHashes(JNIEnv* km_env, jclass km_clazz, jint fincludepepagehashes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustSetDefaultIncludePEPageHashes");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)fincludepepagehashes);
#else
    (void)fincludepepagehashes;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_wintrust_WindowsWin32SecurityWintrustJniBridge_windowssys_1windows_1win32_1security_1wintrust_1wintrustSetRegPolicyFlags(JNIEnv* km_env, jclass km_clazz, jint dwpolicyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WintrustSetRegPolicyFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwpolicyflags) : -1;
#else
    (void)dwpolicyflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

