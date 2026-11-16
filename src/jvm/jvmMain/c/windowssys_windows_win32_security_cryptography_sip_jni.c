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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPAddProvider(JNIEnv* km_env, jclass km_clazz, jlong psnewprov) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPAddProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psnewprov);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psnewprov;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPCreateIndirectData(JNIEnv* km_env, jclass km_clazz, jlong psubjectinfo, jlong pcbindirectdata, jlong pindirectdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPCreateIndirectData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)pcbindirectdata, (void*)(uintptr_t)pindirectdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectinfo;
    (void)pcbindirectdata;
    (void)pindirectdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPGetCaps(JNIEnv* km_env, jclass km_clazz, jlong psubjinfo, jlong pcaps) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPGetCaps");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjinfo, (void*)(uintptr_t)pcaps);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjinfo;
    (void)pcaps;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSealedDigest(JNIEnv* km_env, jclass km_clazz, jlong psubjectinfo, jlong psig, jint dwsig, jlong pbdigest, jlong pcbdigest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPGetSealedDigest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)psig, (uint32_t)dwsig, (void*)(uintptr_t)pbdigest, (void*)(uintptr_t)pcbdigest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectinfo;
    (void)psig;
    (void)dwsig;
    (void)pbdigest;
    (void)pcbdigest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPGetSignedDataMsg(JNIEnv* km_env, jclass km_clazz, jlong psubjectinfo, jlong pdwencodingtype, jint dwindex, jlong pcbsigneddatamsg, jlong pbsigneddatamsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPGetSignedDataMsg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)pdwencodingtype, (uint32_t)dwindex, (void*)(uintptr_t)pcbsigneddatamsg, (void*)(uintptr_t)pbsigneddatamsg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectinfo;
    (void)pdwencodingtype;
    (void)dwindex;
    (void)pcbsigneddatamsg;
    (void)pbsigneddatamsg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPLoad(JNIEnv* km_env, jclass km_clazz, jlong pgsubject, jint dwflags, jlong psipdispatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPLoad");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pgsubject, (uint32_t)dwflags, (void*)(uintptr_t)psipdispatch);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pgsubject;
    (void)dwflags;
    (void)psipdispatch;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPPutSignedDataMsg(JNIEnv* km_env, jclass km_clazz, jlong psubjectinfo, jint dwencodingtype, jlong pdwindex, jint cbsigneddatamsg, jlong pbsigneddatamsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPPutSignedDataMsg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectinfo, (uint32_t)dwencodingtype, (void*)(uintptr_t)pdwindex, (uint32_t)cbsigneddatamsg, (void*)(uintptr_t)pbsigneddatamsg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectinfo;
    (void)dwencodingtype;
    (void)pdwindex;
    (void)cbsigneddatamsg;
    (void)pbsigneddatamsg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveProvider(JNIEnv* km_env, jclass km_clazz, jlong pgprov) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPRemoveProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pgprov);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pgprov;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPRemoveSignedDataMsg(JNIEnv* km_env, jclass km_clazz, jlong psubjectinfo, jint dwindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPRemoveSignedDataMsg");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectinfo, (uint32_t)dwindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectinfo;
    (void)dwindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuid(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong hfilein, jlong pgsubject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPRetrieveSubjectGuid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)hfilein, (void*)(uintptr_t)pgsubject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)hfilein;
    (void)pgsubject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPRetrieveSubjectGuidForCatalogFile(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong hfilein, jlong pgsubject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPRetrieveSubjectGuidForCatalogFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)hfilein, (void*)(uintptr_t)pgsubject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)hfilein;
    (void)pgsubject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_sip_WindowsWin32SecurityCryptographySipJniBridge_windowssysWindowsWin32SecurityCryptographySipCryptSIPVerifyIndirectData(JNIEnv* km_env, jclass km_clazz, jlong psubjectinfo, jlong pindirectdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSIPVerifyIndirectData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)pindirectdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectinfo;
    (void)pindirectdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

