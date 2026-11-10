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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1certSelectionGetSerializedBlob(JNIEnv* km_env, jclass km_clazz, jlong pcsi, jlong ppoutbuffer, jlong puloutbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSelectionGetSerializedBlob");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcsi, (void*)(uintptr_t)ppoutbuffer, (void*)(uintptr_t)puloutbuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcsi;
    (void)ppoutbuffer;
    (void)puloutbuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1cryptUIDlgCertMgr(JNIEnv* km_env, jclass km_clazz, jlong pcryptuicertmgr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgCertMgr");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcryptuicertmgr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcryptuicertmgr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1cryptUIDlgSelectCertificateFromStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong hwnd, jlong pwsztitle, jlong pwszdisplaystring, jint dwdontusecolumn, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgSelectCertificateFromStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pwsztitle, (void*)(uintptr_t)pwszdisplaystring, (uint32_t)dwdontusecolumn, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)hwnd;
    (void)pwsztitle;
    (void)pwszdisplaystring;
    (void)dwdontusecolumn;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1cryptUIDlgViewCertificateA(JNIEnv* km_env, jclass km_clazz, jlong pcertviewinfo, jlong pfpropertieschanged) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgViewCertificateA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertviewinfo, (void*)(uintptr_t)pfpropertieschanged);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertviewinfo;
    (void)pfpropertieschanged;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1cryptUIDlgViewCertificateW(JNIEnv* km_env, jclass km_clazz, jlong pcertviewinfo, jlong pfpropertieschanged) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgViewCertificateW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertviewinfo, (void*)(uintptr_t)pfpropertieschanged);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertviewinfo;
    (void)pfpropertieschanged;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1cryptUIDlgViewContext(JNIEnv* km_env, jclass km_clazz, jint dwcontexttype, jlong pvcontext, jlong hwnd, jlong pwsztitle, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIDlgViewContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcontexttype, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pwsztitle, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcontexttype;
    (void)pvcontext;
    (void)hwnd;
    (void)pwsztitle;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1cryptUIWizDigitalSign(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong hwndparent, jlong pwszwizardtitle, jlong pdigitalsigninfo, jlong ppsigncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIWizDigitalSign");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)pwszwizardtitle, (void*)(uintptr_t)pdigitalsigninfo, (void*)(uintptr_t)ppsigncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)hwndparent;
    (void)pwszwizardtitle;
    (void)pdigitalsigninfo;
    (void)ppsigncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1cryptUIWizExport(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong hwndparent, jlong pwszwizardtitle, jlong pexportinfo, jlong pvoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIWizExport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)pwszwizardtitle, (void*)(uintptr_t)pexportinfo, (void*)(uintptr_t)pvoid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)hwndparent;
    (void)pwszwizardtitle;
    (void)pexportinfo;
    (void)pvoid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1cryptUIWizFreeDigitalSignContext(JNIEnv* km_env, jclass km_clazz, jlong psigncontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIWizFreeDigitalSignContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psigncontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psigncontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_ui_WindowsWin32SecurityCryptographyUiJniBridge_windowssys_1windows_1win32_1security_1cryptography_1ui_1cryptUIWizImport(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong hwndparent, jlong pwszwizardtitle, jlong pimportsrc, jlong hdestcertstore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUIWizImport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)hwndparent, (void*)(uintptr_t)pwszwizardtitle, (void*)(uintptr_t)pimportsrc, (void*)(uintptr_t)hdestcertstore);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)hwndparent;
    (void)pwszwizardtitle;
    (void)pimportsrc;
    (void)hdestcertstore;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

