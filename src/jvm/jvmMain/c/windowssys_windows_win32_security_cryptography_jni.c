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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunction(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pszfunction, jint dwposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptAddContextFunction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction, (uint32_t)dwposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)dwposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunctionProvider(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pszfunction, jlong pszprovider, jint dwposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptAddContextFunctionProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction, (void*)(uintptr_t)pszprovider, (uint32_t)dwposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszprovider;
    (void)dwposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptCloseAlgorithmProvider(JNIEnv* km_env, jclass km_clazz, jlong halgorithm, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptCloseAlgorithmProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)halgorithm, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)halgorithm;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptConfigureContext(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jlong pconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptConfigureContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (void*)(uintptr_t)pconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)pconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptConfigureContextFunction(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pszfunction, jlong pconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptConfigureContextFunction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction, (void*)(uintptr_t)pconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptCreateContext(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jlong pconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptCreateContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (void*)(uintptr_t)pconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)pconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptCreateHash(JNIEnv* km_env, jclass km_clazz, jlong halgorithm, jlong phhash, jlong pbhashobject, jint cbhashobject, jlong pbsecret, jint cbsecret, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptCreateHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)halgorithm, (void*)(uintptr_t)phhash, (void*)(uintptr_t)pbhashobject, (uint32_t)cbhashobject, (void*)(uintptr_t)pbsecret, (uint32_t)cbsecret, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)halgorithm;
    (void)phhash;
    (void)pbhashobject;
    (void)cbhashobject;
    (void)pbsecret;
    (void)cbsecret;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptCreateMultiHash(JNIEnv* km_env, jclass km_clazz, jlong halgorithm, jlong phhash, jint nhashes, jlong pbhashobject, jint cbhashobject, jlong pbsecret, jint cbsecret, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptCreateMultiHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)halgorithm, (void*)(uintptr_t)phhash, (uint32_t)nhashes, (void*)(uintptr_t)pbhashobject, (uint32_t)cbhashobject, (void*)(uintptr_t)pbsecret, (uint32_t)cbsecret, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)halgorithm;
    (void)phhash;
    (void)nhashes;
    (void)pbhashobject;
    (void)cbhashobject;
    (void)pbsecret;
    (void)cbsecret;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDecrypt(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pbinput, jint cbinput, jlong ppaddinginfo, jlong pbiv, jint cbiv, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDecrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (void*)(uintptr_t)ppaddinginfo, (void*)(uintptr_t)pbiv, (uint32_t)cbiv, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pbiv;
    (void)cbiv;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDeleteContext(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDeleteContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDeriveKey(JNIEnv* km_env, jclass km_clazz, jlong hsharedsecret, jlong pwszkdf, jlong pparameterlist, jlong pbderivedkey, jint cbderivedkey, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDeriveKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsharedsecret, (void*)(uintptr_t)pwszkdf, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pbderivedkey, (uint32_t)cbderivedkey, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsharedsecret;
    (void)pwszkdf;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyCapi(JNIEnv* km_env, jclass km_clazz, jlong hhash, jlong htargetalg, jlong pbderivedkey, jint cbderivedkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDeriveKeyCapi");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hhash, (void*)(uintptr_t)htargetalg, (void*)(uintptr_t)pbderivedkey, (uint32_t)cbderivedkey, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)htargetalg;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyPBKDF2(JNIEnv* km_env, jclass km_clazz, jlong hprf, jlong pbpassword, jint cbpassword, jlong pbsalt, jint cbsalt, jlong citerations, jlong pbderivedkey, jint cbderivedkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDeriveKeyPBKDF2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprf, (void*)(uintptr_t)pbpassword, (uint32_t)cbpassword, (void*)(uintptr_t)pbsalt, (uint32_t)cbsalt, (uint64_t)citerations, (void*)(uintptr_t)pbderivedkey, (uint32_t)cbderivedkey, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprf;
    (void)pbpassword;
    (void)cbpassword;
    (void)pbsalt;
    (void)cbsalt;
    (void)citerations;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDestroyHash(JNIEnv* km_env, jclass km_clazz, jlong hhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDestroyHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDestroyKey(JNIEnv* km_env, jclass km_clazz, jlong hkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDestroyKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDestroySecret(JNIEnv* km_env, jclass km_clazz, jlong hsecret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDestroySecret");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsecret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsecret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDuplicateHash(JNIEnv* km_env, jclass km_clazz, jlong hhash, jlong phnewhash, jlong pbhashobject, jint cbhashobject, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDuplicateHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hhash, (void*)(uintptr_t)phnewhash, (void*)(uintptr_t)pbhashobject, (uint32_t)cbhashobject, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)phnewhash;
    (void)pbhashobject;
    (void)cbhashobject;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptDuplicateKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong phnewkey, jlong pbkeyobject, jint cbkeyobject, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptDuplicateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)phnewkey, (void*)(uintptr_t)pbkeyobject, (uint32_t)cbkeyobject, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)phnewkey;
    (void)pbkeyobject;
    (void)cbkeyobject;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptEncrypt(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pbinput, jint cbinput, jlong ppaddinginfo, jlong pbiv, jint cbiv, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEncrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (void*)(uintptr_t)ppaddinginfo, (void*)(uintptr_t)pbiv, (uint32_t)cbiv, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pbiv;
    (void)cbiv;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptEnumAlgorithms(JNIEnv* km_env, jclass km_clazz, jint dwalgoperations, jlong palgcount, jlong ppalglist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumAlgorithms");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwalgoperations, (void*)(uintptr_t)palgcount, (void*)(uintptr_t)ppalglist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwalgoperations;
    (void)palgcount;
    (void)ppalglist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctionProviders(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pszfunction, jlong pcbbuffer, jlong ppbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumContextFunctionProviders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction, (void*)(uintptr_t)pcbbuffer, (void*)(uintptr_t)ppbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctions(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pcbbuffer, jlong ppbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumContextFunctions");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pcbbuffer, (void*)(uintptr_t)ppbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptEnumContexts(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pcbbuffer, jlong ppbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumContexts");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pcbbuffer, (void*)(uintptr_t)ppbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptEnumProviders(JNIEnv* km_env, jclass km_clazz, jlong pszalgid, jlong pimplcount, jlong ppimpllist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumProviders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszalgid, (void*)(uintptr_t)pimplcount, (void*)(uintptr_t)ppimpllist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszalgid;
    (void)pimplcount;
    (void)ppimpllist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptEnumRegisteredProviders(JNIEnv* km_env, jclass km_clazz, jlong pcbbuffer, jlong ppbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptEnumRegisteredProviders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcbbuffer, (void*)(uintptr_t)ppbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptExportKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong hexportkey, jlong pszblobtype, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptExportKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)hexportkey, (void*)(uintptr_t)pszblobtype, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)hexportkey;
    (void)pszblobtype;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptFinalizeKeyPair(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptFinalizeKeyPair");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptFinishHash(JNIEnv* km_env, jclass km_clazz, jlong hhash, jlong pboutput, jint cboutput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptFinishHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hhash, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)pboutput;
    (void)cboutput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong pvbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptFreeBuffer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pvbuffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pvbuffer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptGenRandom(JNIEnv* km_env, jclass km_clazz, jlong halgorithm, jlong pbbuffer, jint cbbuffer, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGenRandom");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)halgorithm, (void*)(uintptr_t)pbbuffer, (uint32_t)cbbuffer, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)halgorithm;
    (void)pbbuffer;
    (void)cbbuffer;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptGenerateKeyPair(JNIEnv* km_env, jclass km_clazz, jlong halgorithm, jlong phkey, jint dwlength, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGenerateKeyPair");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)halgorithm, (void*)(uintptr_t)phkey, (uint32_t)dwlength, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)halgorithm;
    (void)phkey;
    (void)dwlength;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptGenerateSymmetricKey(JNIEnv* km_env, jclass km_clazz, jlong halgorithm, jlong phkey, jlong pbkeyobject, jint cbkeyobject, jlong pbsecret, jint cbsecret, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGenerateSymmetricKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)halgorithm, (void*)(uintptr_t)phkey, (void*)(uintptr_t)pbkeyobject, (uint32_t)cbkeyobject, (void*)(uintptr_t)pbsecret, (uint32_t)cbsecret, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)halgorithm;
    (void)phkey;
    (void)pbkeyobject;
    (void)cbkeyobject;
    (void)pbsecret;
    (void)cbsecret;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptGetFipsAlgorithmMode(JNIEnv* km_env, jclass km_clazz, jlong pfenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGetFipsAlgorithmMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfenabled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfenabled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptGetProperty(JNIEnv* km_env, jclass km_clazz, jlong hobject, jlong pszproperty, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptGetProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobject, (void*)(uintptr_t)pszproperty, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    (void)pszproperty;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptHash(JNIEnv* km_env, jclass km_clazz, jlong halgorithm, jlong pbsecret, jint cbsecret, jlong pbinput, jint cbinput, jlong pboutput, jint cboutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)halgorithm, (void*)(uintptr_t)pbsecret, (uint32_t)cbsecret, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (void*)(uintptr_t)pboutput, (uint32_t)cboutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)halgorithm;
    (void)pbsecret;
    (void)cbsecret;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptHashData(JNIEnv* km_env, jclass km_clazz, jlong hhash, jlong pbinput, jint cbinput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptHashData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hhash, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptImportKey(JNIEnv* km_env, jclass km_clazz, jlong halgorithm, jlong himportkey, jlong pszblobtype, jlong phkey, jlong pbkeyobject, jint cbkeyobject, jlong pbinput, jint cbinput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptImportKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)halgorithm, (void*)(uintptr_t)himportkey, (void*)(uintptr_t)pszblobtype, (void*)(uintptr_t)phkey, (void*)(uintptr_t)pbkeyobject, (uint32_t)cbkeyobject, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)halgorithm;
    (void)himportkey;
    (void)pszblobtype;
    (void)phkey;
    (void)pbkeyobject;
    (void)cbkeyobject;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptImportKeyPair(JNIEnv* km_env, jclass km_clazz, jlong halgorithm, jlong himportkey, jlong pszblobtype, jlong phkey, jlong pbinput, jint cbinput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptImportKeyPair");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)halgorithm, (void*)(uintptr_t)himportkey, (void*)(uintptr_t)pszblobtype, (void*)(uintptr_t)phkey, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)halgorithm;
    (void)himportkey;
    (void)pszblobtype;
    (void)phkey;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptKeyDerivation(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pparameterlist, jlong pbderivedkey, jint cbderivedkey, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptKeyDerivation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pbderivedkey, (uint32_t)cbderivedkey, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptOpenAlgorithmProvider(JNIEnv* km_env, jclass km_clazz, jlong phalgorithm, jlong pszalgid, jlong pszimplementation, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptOpenAlgorithmProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phalgorithm, (void*)(uintptr_t)pszalgid, (void*)(uintptr_t)pszimplementation, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phalgorithm;
    (void)pszalgid;
    (void)pszimplementation;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptProcessMultiOperations(JNIEnv* km_env, jclass km_clazz, jlong hobject, jint operationtype, jlong poperations, jint cboperations, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptProcessMultiOperations");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobject, (int32_t)operationtype, (void*)(uintptr_t)poperations, (uint32_t)cboperations, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    (void)operationtype;
    (void)poperations;
    (void)cboperations;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptQueryContextConfiguration(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jlong pcbbuffer, jlong ppbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptQueryContextConfiguration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (void*)(uintptr_t)pcbbuffer, (void*)(uintptr_t)ppbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionConfiguration(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pszfunction, jlong pcbbuffer, jlong ppbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptQueryContextFunctionConfiguration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction, (void*)(uintptr_t)pcbbuffer, (void*)(uintptr_t)ppbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionProperty(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pszfunction, jlong pszproperty, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptQueryContextFunctionProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction, (void*)(uintptr_t)pszproperty, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszproperty;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptQueryProviderRegistration(JNIEnv* km_env, jclass km_clazz, jlong pszprovider, jint dwmode, jint dwinterface, jlong pcbbuffer, jlong ppbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptQueryProviderRegistration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovider, (uint32_t)dwmode, (uint32_t)dwinterface, (void*)(uintptr_t)pcbbuffer, (void*)(uintptr_t)ppbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovider;
    (void)dwmode;
    (void)dwinterface;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptRegisterConfigChangeNotify(JNIEnv* km_env, jclass km_clazz, jlong phevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptRegisterConfigChangeNotify");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptRegisterProvider(JNIEnv* km_env, jclass km_clazz, jlong pszprovider, jint dwflags, jlong preg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptRegisterProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovider, (uint32_t)dwflags, (void*)(uintptr_t)preg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovider;
    (void)dwflags;
    (void)preg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunction(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pszfunction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptRemoveContextFunction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunctionProvider(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pszfunction, jlong pszprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptRemoveContextFunctionProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction, (void*)(uintptr_t)pszprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptResolveProviders(JNIEnv* km_env, jclass km_clazz, jlong pszcontext, jint dwinterface, jlong pszfunction, jlong pszprovider, jint dwmode, jint dwflags, jlong pcbbuffer, jlong ppbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptResolveProviders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction, (void*)(uintptr_t)pszprovider, (uint32_t)dwmode, (uint32_t)dwflags, (void*)(uintptr_t)pcbbuffer, (void*)(uintptr_t)ppbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszprovider;
    (void)dwmode;
    (void)dwflags;
    (void)pcbbuffer;
    (void)ppbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptSecretAgreement(JNIEnv* km_env, jclass km_clazz, jlong hprivkey, jlong hpubkey, jlong phagreedsecret, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptSecretAgreement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprivkey, (void*)(uintptr_t)hpubkey, (void*)(uintptr_t)phagreedsecret, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprivkey;
    (void)hpubkey;
    (void)phagreedsecret;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptSetContextFunctionProperty(JNIEnv* km_env, jclass km_clazz, jint dwtable, jlong pszcontext, jint dwinterface, jlong pszfunction, jlong pszproperty, jint cbvalue, jlong pbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptSetContextFunctionProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtable, (void*)(uintptr_t)pszcontext, (uint32_t)dwinterface, (void*)(uintptr_t)pszfunction, (void*)(uintptr_t)pszproperty, (uint32_t)cbvalue, (void*)(uintptr_t)pbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtable;
    (void)pszcontext;
    (void)dwinterface;
    (void)pszfunction;
    (void)pszproperty;
    (void)cbvalue;
    (void)pbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptSetProperty(JNIEnv* km_env, jclass km_clazz, jlong hobject, jlong pszproperty, jlong pbinput, jint cbinput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptSetProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobject, (void*)(uintptr_t)pszproperty, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    (void)pszproperty;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptSignHash(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong ppaddinginfo, jlong pbinput, jint cbinput, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptSignHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)ppaddinginfo, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptUnregisterConfigChangeNotify(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptUnregisterConfigChangeNotify");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptUnregisterProvider(JNIEnv* km_env, jclass km_clazz, jlong pszprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptUnregisterProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyBCryptVerifySignature(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong ppaddinginfo, jlong pbhash, jint cbhash, jlong pbsignature, jint cbsignature, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BCryptVerifySignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)ppaddinginfo, (void*)(uintptr_t)pbhash, (uint32_t)cbhash, (void*)(uintptr_t)pbsignature, (uint32_t)cbsignature, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbhash;
    (void)cbhash;
    (void)pbsignature;
    (void)cbsignature;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddCRLContextToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pcrlcontext, jint dwadddisposition, jlong ppstorecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCRLContextToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pcrlcontext, (uint32_t)dwadddisposition, (void*)(uintptr_t)ppstorecontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)pcrlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddCRLLinkToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pcrlcontext, jint dwadddisposition, jlong ppstorecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCRLLinkToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pcrlcontext, (uint32_t)dwadddisposition, (void*)(uintptr_t)ppstorecontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)pcrlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddCTLContextToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pctlcontext, jint dwadddisposition, jlong ppstorecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCTLContextToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pctlcontext, (uint32_t)dwadddisposition, (void*)(uintptr_t)ppstorecontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)pctlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddCTLLinkToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pctlcontext, jint dwadddisposition, jlong ppstorecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCTLLinkToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pctlcontext, (uint32_t)dwadddisposition, (void*)(uintptr_t)ppstorecontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)pctlcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddCertificateContextToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pcertcontext, jint dwadddisposition, jlong ppstorecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCertificateContextToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pcertcontext, (uint32_t)dwadddisposition, (void*)(uintptr_t)ppstorecontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)pcertcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddCertificateLinkToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pcertcontext, jint dwadddisposition, jlong ppstorecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddCertificateLinkToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pcertcontext, (uint32_t)dwadddisposition, (void*)(uintptr_t)ppstorecontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)pcertcontext;
    (void)dwadddisposition;
    (void)ppstorecontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddEncodedCRLToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwcertencodingtype, jlong pbcrlencoded, jint cbcrlencoded, jint dwadddisposition, jlong ppcrlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCRLToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pbcrlencoded, (uint32_t)cbcrlencoded, (uint32_t)dwadddisposition, (void*)(uintptr_t)ppcrlcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)pbcrlencoded;
    (void)cbcrlencoded;
    (void)dwadddisposition;
    (void)ppcrlcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddEncodedCTLToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwmsgandcertencodingtype, jlong pbctlencoded, jint cbctlencoded, jint dwadddisposition, jlong ppctlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCTLToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwmsgandcertencodingtype, (void*)(uintptr_t)pbctlencoded, (uint32_t)cbctlencoded, (uint32_t)dwadddisposition, (void*)(uintptr_t)ppctlcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)dwmsgandcertencodingtype;
    (void)pbctlencoded;
    (void)cbctlencoded;
    (void)dwadddisposition;
    (void)ppctlcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwcertencodingtype, jlong pbcertencoded, jint cbcertencoded, jint dwadddisposition, jlong ppcertcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCertificateToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pbcertencoded, (uint32_t)cbcertencoded, (uint32_t)dwadddisposition, (void*)(uintptr_t)ppcertcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)pbcertencoded;
    (void)cbcertencoded;
    (void)dwadddisposition;
    (void)ppcertcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreA(JNIEnv* km_env, jclass km_clazz, jlong szcertstorename, jlong pbcertencoded, jint cbcertencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCertificateToSystemStoreA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szcertstorename, (void*)(uintptr_t)pbcertencoded, (uint32_t)cbcertencoded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szcertstorename;
    (void)pbcertencoded;
    (void)cbcertencoded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreW(JNIEnv* km_env, jclass km_clazz, jlong szcertstorename, jlong pbcertencoded, jint cbcertencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEncodedCertificateToSystemStoreW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szcertstorename, (void*)(uintptr_t)pbcertencoded, (uint32_t)cbcertencoded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szcertstorename;
    (void)pbcertencoded;
    (void)cbcertencoded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddEnhancedKeyUsageIdentifier(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jlong pszusageidentifier) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddEnhancedKeyUsageIdentifier");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)pszusageidentifier);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)pszusageidentifier;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponse(JNIEnv* km_env, jclass km_clazz, jlong hserverocspresponse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddRefServerOcspResponse");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hserverocspresponse);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hserverocspresponse;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponseContext(JNIEnv* km_env, jclass km_clazz, jlong pserverocspresponsecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddRefServerOcspResponseContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pserverocspresponsecontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pserverocspresponsecontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddSerializedElementToStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pbelement, jint cbelement, jint dwadddisposition, jint dwflags, jint dwcontexttypeflags, jlong pdwcontexttype, jlong ppvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddSerializedElementToStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pbelement, (uint32_t)cbelement, (uint32_t)dwadddisposition, (uint32_t)dwflags, (uint32_t)dwcontexttypeflags, (void*)(uintptr_t)pdwcontexttype, (void*)(uintptr_t)ppvcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)pbelement;
    (void)cbelement;
    (void)dwadddisposition;
    (void)dwflags;
    (void)dwcontexttypeflags;
    (void)pdwcontexttype;
    (void)ppvcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAddStoreToCollection(JNIEnv* km_env, jclass km_clazz, jlong hcollectionstore, jlong hsiblingstore, jint dwupdateflags, jint dwpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAddStoreToCollection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcollectionstore, (void*)(uintptr_t)hsiblingstore, (uint32_t)dwupdateflags, (uint32_t)dwpriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcollectionstore;
    (void)hsiblingstore;
    (void)dwupdateflags;
    (void)dwpriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertAlgIdToOID(JNIEnv* km_env, jclass km_clazz, jint dwalgid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertAlgIdToOID");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwalgid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwalgid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCloseServerOcspResponse(JNIEnv* km_env, jclass km_clazz, jlong hserverocspresponse, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCloseServerOcspResponse");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hserverocspresponse, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hserverocspresponse;
    (void)dwflags;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCloseStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCloseStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCompareCertificate(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pcertid1, jlong pcertid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCompareCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pcertid1, (void*)(uintptr_t)pcertid2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)pcertid1;
    (void)pcertid2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCompareCertificateName(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pcertname1, jlong pcertname2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCompareCertificateName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pcertname1, (void*)(uintptr_t)pcertname2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)pcertname1;
    (void)pcertname2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCompareIntegerBlob(JNIEnv* km_env, jclass km_clazz, jlong pint1, jlong pint2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCompareIntegerBlob");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pint1, (void*)(uintptr_t)pint2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pint1;
    (void)pint2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertComparePublicKeyInfo(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong ppublickey1, jlong ppublickey2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertComparePublicKeyInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)ppublickey1, (void*)(uintptr_t)ppublickey2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)ppublickey1;
    (void)ppublickey2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertControlStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwflags, jint dwctrltype, jlong pvctrlpara) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertControlStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwflags, (uint32_t)dwctrltype, (void*)(uintptr_t)pvctrlpara);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)dwflags;
    (void)dwctrltype;
    (void)pvctrlpara;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCreateCRLContext(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pbcrlencoded, jint cbcrlencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCRLContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pbcrlencoded, (uint32_t)cbcrlencoded);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwcertencodingtype;
    (void)pbcrlencoded;
    (void)cbcrlencoded;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCreateCTLContext(JNIEnv* km_env, jclass km_clazz, jint dwmsgandcertencodingtype, jlong pbctlencoded, jint cbctlencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCTLContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmsgandcertencodingtype, (void*)(uintptr_t)pbctlencoded, (uint32_t)cbctlencoded);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwmsgandcertencodingtype;
    (void)pbctlencoded;
    (void)cbctlencoded;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCreateCTLEntryFromCertificateContextProperties(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jint coptattr, jlong rgoptattr, jint dwflags, jlong pvreserved, jlong pctlentry, jlong pcbctlentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCTLEntryFromCertificateContextProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (uint32_t)coptattr, (void*)(uintptr_t)rgoptattr, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pctlentry, (void*)(uintptr_t)pcbctlentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)coptattr;
    (void)rgoptattr;
    (void)dwflags;
    (void)pvreserved;
    (void)pctlentry;
    (void)pcbctlentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCreateCertificateChainEngine(JNIEnv* km_env, jclass km_clazz, jlong pconfig, jlong phchainengine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCertificateChainEngine");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pconfig, (void*)(uintptr_t)phchainengine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pconfig;
    (void)phchainengine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCreateCertificateContext(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pbcertencoded, jint cbcertencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateCertificateContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pbcertencoded, (uint32_t)cbcertencoded);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwcertencodingtype;
    (void)pbcertencoded;
    (void)cbcertencoded;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCreateContext(JNIEnv* km_env, jclass km_clazz, jint dwcontexttype, jint dwencodingtype, jlong pbencoded, jint cbencoded, jint dwflags, jlong pcreatepara) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcontexttype, (uint32_t)dwencodingtype, (void*)(uintptr_t)pbencoded, (uint32_t)cbencoded, (uint32_t)dwflags, (void*)(uintptr_t)pcreatepara);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwcontexttype;
    (void)dwencodingtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)dwflags;
    (void)pcreatepara;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertCreateSelfSignCertificate(JNIEnv* km_env, jclass km_clazz, jlong hcryptprovorncryptkey, jlong psubjectissuerblob, jint dwflags, jlong pkeyprovinfo, jlong psignaturealgorithm, jlong pstarttime, jlong pendtime, jlong pextensions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertCreateSelfSignCertificate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprovorncryptkey, (void*)(uintptr_t)psubjectissuerblob, (uint32_t)dwflags, (void*)(uintptr_t)pkeyprovinfo, (void*)(uintptr_t)psignaturealgorithm, (void*)(uintptr_t)pstarttime, (void*)(uintptr_t)pendtime, (void*)(uintptr_t)pextensions);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcryptprovorncryptkey;
    (void)psubjectissuerblob;
    (void)dwflags;
    (void)pkeyprovinfo;
    (void)psignaturealgorithm;
    (void)pstarttime;
    (void)pendtime;
    (void)pextensions;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertDeleteCRLFromStore(JNIEnv* km_env, jclass km_clazz, jlong pcrlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDeleteCRLFromStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcrlcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcrlcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertDeleteCTLFromStore(JNIEnv* km_env, jclass km_clazz, jlong pctlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDeleteCTLFromStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pctlcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pctlcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertDeleteCertificateFromStore(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDeleteCertificateFromStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertDuplicateCRLContext(JNIEnv* km_env, jclass km_clazz, jlong pcrlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateCRLContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcrlcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pcrlcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertDuplicateCTLContext(JNIEnv* km_env, jclass km_clazz, jlong pctlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateCTLContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pctlcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pctlcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateChain(JNIEnv* km_env, jclass km_clazz, jlong pchaincontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateCertificateChain");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pchaincontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pchaincontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateContext(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateCertificateContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pcertcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertDuplicateStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertDuplicateStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumCRLContextProperties(JNIEnv* km_env, jclass km_clazz, jlong pcrlcontext, jint dwpropid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCRLContextProperties");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcrlcontext, (uint32_t)dwpropid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcrlcontext;
    (void)dwpropid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumCRLsInStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pprevcrlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCRLsInStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pprevcrlcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)pprevcrlcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumCTLContextProperties(JNIEnv* km_env, jclass km_clazz, jlong pctlcontext, jint dwpropid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCTLContextProperties");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pctlcontext, (uint32_t)dwpropid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pctlcontext;
    (void)dwpropid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumCTLsInStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pprevctlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCTLsInStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pprevctlcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)pprevctlcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumCertificateContextProperties(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jint dwpropid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCertificateContextProperties");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (uint32_t)dwpropid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcertcontext;
    (void)dwpropid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumCertificatesInStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pprevcertcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumCertificatesInStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pprevcertcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)pprevcertcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumPhysicalStore(JNIEnv* km_env, jclass km_clazz, jlong pvsystemstore, jint dwflags, jlong pvarg, jlong pfnenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumPhysicalStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvsystemstore, (uint32_t)dwflags, (void*)(uintptr_t)pvarg, (void*)(uintptr_t)pfnenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumSubjectInSortedCTL(JNIEnv* km_env, jclass km_clazz, jlong pctlcontext, jlong ppvnextsubject, jlong psubjectidentifier, jlong pencodedattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumSubjectInSortedCTL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pctlcontext, (void*)(uintptr_t)ppvnextsubject, (void*)(uintptr_t)psubjectidentifier, (void*)(uintptr_t)pencodedattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pctlcontext;
    (void)ppvnextsubject;
    (void)psubjectidentifier;
    (void)pencodedattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumSystemStore(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pvsystemstorelocationpara, jlong pvarg, jlong pfnenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumSystemStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pvsystemstorelocationpara, (void*)(uintptr_t)pvarg, (void*)(uintptr_t)pfnenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pvsystemstorelocationpara;
    (void)pvarg;
    (void)pfnenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertEnumSystemStoreLocation(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pvarg, jlong pfnenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertEnumSystemStoreLocation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pvarg, (void*)(uintptr_t)pfnenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pvarg;
    (void)pfnenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindAttribute(JNIEnv* km_env, jclass km_clazz, jlong pszobjid, jint cattr, jlong rgattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindAttribute");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszobjid, (uint32_t)cattr, (void*)(uintptr_t)rgattr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pszobjid;
    (void)cattr;
    (void)rgattr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindCRLInStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwcertencodingtype, jint dwfindflags, jint dwfindtype, jlong pvfindpara, jlong pprevcrlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindCRLInStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwcertencodingtype, (uint32_t)dwfindflags, (uint32_t)dwfindtype, (void*)(uintptr_t)pvfindpara, (void*)(uintptr_t)pprevcrlcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevcrlcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindCTLInStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwmsgandcertencodingtype, jint dwfindflags, jint dwfindtype, jlong pvfindpara, jlong pprevctlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindCTLInStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwmsgandcertencodingtype, (uint32_t)dwfindflags, (uint32_t)dwfindtype, (void*)(uintptr_t)pvfindpara, (void*)(uintptr_t)pprevctlcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)dwmsgandcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevctlcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindCertificateInCRL(JNIEnv* km_env, jclass km_clazz, jlong pcert, jlong pcrlcontext, jint dwflags, jlong pvreserved, jlong ppcrlentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindCertificateInCRL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcert, (void*)(uintptr_t)pcrlcontext, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)ppcrlentry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcert;
    (void)pcrlcontext;
    (void)dwflags;
    (void)pvreserved;
    (void)ppcrlentry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindCertificateInStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwcertencodingtype, jint dwfindflags, jint dwfindtype, jlong pvfindpara, jlong pprevcertcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindCertificateInStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwcertencodingtype, (uint32_t)dwfindflags, (uint32_t)dwfindtype, (void*)(uintptr_t)pvfindpara, (void*)(uintptr_t)pprevcertcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevcertcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindChainInStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwcertencodingtype, jint dwfindflags, jint dwfindtype, jlong pvfindpara, jlong pprevchaincontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindChainInStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwcertencodingtype, (uint32_t)dwfindflags, (uint32_t)dwfindtype, (void*)(uintptr_t)pvfindpara, (void*)(uintptr_t)pprevchaincontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)dwfindflags;
    (void)dwfindtype;
    (void)pvfindpara;
    (void)pprevchaincontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindExtension(JNIEnv* km_env, jclass km_clazz, jlong pszobjid, jint cextensions, jlong rgextensions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindExtension");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszobjid, (uint32_t)cextensions, (void*)(uintptr_t)rgextensions);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pszobjid;
    (void)cextensions;
    (void)rgextensions;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindRDNAttr(JNIEnv* km_env, jclass km_clazz, jlong pszobjid, jlong pname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindRDNAttr");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszobjid, (void*)(uintptr_t)pname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pszobjid;
    (void)pname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindSubjectInCTL(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jint dwsubjecttype, jlong pvsubject, jlong pctlcontext, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindSubjectInCTL");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (uint32_t)dwsubjecttype, (void*)(uintptr_t)pvsubject, (void*)(uintptr_t)pctlcontext, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwencodingtype;
    (void)dwsubjecttype;
    (void)pvsubject;
    (void)pctlcontext;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFindSubjectInSortedCTL(JNIEnv* km_env, jclass km_clazz, jlong psubjectidentifier, jlong pctlcontext, jint dwflags, jlong pvreserved, jlong pencodedattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFindSubjectInSortedCTL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectidentifier, (void*)(uintptr_t)pctlcontext, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pencodedattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectidentifier;
    (void)pctlcontext;
    (void)dwflags;
    (void)pvreserved;
    (void)pencodedattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFreeCRLContext(JNIEnv* km_env, jclass km_clazz, jlong pcrlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCRLContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcrlcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcrlcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFreeCTLContext(JNIEnv* km_env, jclass km_clazz, jlong pctlcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCTLContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pctlcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pctlcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChain(JNIEnv* km_env, jclass km_clazz, jlong pchaincontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCertificateChain");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pchaincontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pchaincontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainEngine(JNIEnv* km_env, jclass km_clazz, jlong hchainengine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCertificateChainEngine");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hchainengine);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hchainengine;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainList(JNIEnv* km_env, jclass km_clazz, jlong prgpselection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCertificateChainList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prgpselection);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prgpselection;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFreeCertificateContext(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeCertificateContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertFreeServerOcspResponseContext(JNIEnv* km_env, jclass km_clazz, jlong pserverocspresponsecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertFreeServerOcspResponseContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pserverocspresponsecontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pserverocspresponsecontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetCRLContextProperty(JNIEnv* km_env, jclass km_clazz, jlong pcrlcontext, jint dwpropid, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCRLContextProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcrlcontext, (uint32_t)dwpropid, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcrlcontext;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetCRLFromStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong pissuercontext, jlong pprevcrlcontext, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCRLFromStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)pissuercontext, (void*)(uintptr_t)pprevcrlcontext, (void*)(uintptr_t)pdwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)pissuercontext;
    (void)pprevcrlcontext;
    (void)pdwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetCTLContextProperty(JNIEnv* km_env, jclass km_clazz, jlong pctlcontext, jint dwpropid, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCTLContextProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pctlcontext, (uint32_t)dwpropid, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pctlcontext;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetCertificateChain(JNIEnv* km_env, jclass km_clazz, jlong hchainengine, jlong pcertcontext, jlong ptime, jlong hadditionalstore, jlong pchainpara, jint dwflags, jlong pvreserved, jlong ppchaincontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCertificateChain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hchainengine, (void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)ptime, (void*)(uintptr_t)hadditionalstore, (void*)(uintptr_t)pchainpara, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)ppchaincontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchainengine;
    (void)pcertcontext;
    (void)ptime;
    (void)hadditionalstore;
    (void)pchainpara;
    (void)dwflags;
    (void)pvreserved;
    (void)ppchaincontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetCertificateContextProperty(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jint dwpropid, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetCertificateContextProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (uint32_t)dwpropid, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetEnhancedKeyUsage(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jint dwflags, jlong pusage, jlong pcbusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetEnhancedKeyUsage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (uint32_t)dwflags, (void*)(uintptr_t)pusage, (void*)(uintptr_t)pcbusage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)dwflags;
    (void)pusage;
    (void)pcbusage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetIntendedKeyUsage(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pcertinfo, jlong pbkeyusage, jint cbkeyusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetIntendedKeyUsage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pcertinfo, (void*)(uintptr_t)pbkeyusage, (uint32_t)cbkeyusage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)pcertinfo;
    (void)pbkeyusage;
    (void)cbkeyusage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetIssuerCertificateFromStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jlong psubjectcontext, jlong pprevissuercontext, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetIssuerCertificateFromStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (void*)(uintptr_t)psubjectcontext, (void*)(uintptr_t)pprevissuercontext, (void*)(uintptr_t)pdwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)psubjectcontext;
    (void)pprevissuercontext;
    (void)pdwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetNameStringA(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jint dwtype, jint dwflags, jlong pvtypepara, jlong psznamestring, jint cchnamestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetNameStringA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (uint32_t)dwtype, (uint32_t)dwflags, (void*)(uintptr_t)pvtypepara, (void*)(uintptr_t)psznamestring, (uint32_t)cchnamestring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcertcontext;
    (void)dwtype;
    (void)dwflags;
    (void)pvtypepara;
    (void)psznamestring;
    (void)cchnamestring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetNameStringW(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jint dwtype, jint dwflags, jlong pvtypepara, jlong psznamestring, jint cchnamestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetNameStringW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (uint32_t)dwtype, (uint32_t)dwflags, (void*)(uintptr_t)pvtypepara, (void*)(uintptr_t)psznamestring, (uint32_t)cchnamestring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pcertcontext;
    (void)dwtype;
    (void)dwflags;
    (void)pvtypepara;
    (void)psznamestring;
    (void)cchnamestring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetPublicKeyLength(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong ppublickey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetPublicKeyLength");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)ppublickey);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwcertencodingtype;
    (void)ppublickey;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetServerOcspResponseContext(JNIEnv* km_env, jclass km_clazz, jlong hserverocspresponse, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetServerOcspResponseContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hserverocspresponse, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hserverocspresponse;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetStoreProperty(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwpropid, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetStoreProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwpropid, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)dwpropid;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetSubjectCertificateFromStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwcertencodingtype, jlong pcertid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetSubjectCertificateFromStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pcertid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcertstore;
    (void)dwcertencodingtype;
    (void)pcertid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertGetValidUsages(JNIEnv* km_env, jclass km_clazz, jint ccerts, jlong rghcerts, jlong cnumoids, jlong rghoids, jlong pcboids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertGetValidUsages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ccerts, (void*)(uintptr_t)rghcerts, (void*)(uintptr_t)cnumoids, (void*)(uintptr_t)rghoids, (void*)(uintptr_t)pcboids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ccerts;
    (void)rghcerts;
    (void)cnumoids;
    (void)rghoids;
    (void)pcboids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertIsRDNAttrsInCertificateName(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jint dwflags, jlong pcertname, jlong prdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertIsRDNAttrsInCertificateName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (uint32_t)dwflags, (void*)(uintptr_t)pcertname, (void*)(uintptr_t)prdn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)dwflags;
    (void)pcertname;
    (void)prdn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertIsStrongHashToSign(JNIEnv* km_env, jclass km_clazz, jlong pstrongsignpara, jlong pwszcnghashalgid, jlong psigningcert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertIsStrongHashToSign");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstrongsignpara, (void*)(uintptr_t)pwszcnghashalgid, (void*)(uintptr_t)psigningcert);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstrongsignpara;
    (void)pwszcnghashalgid;
    (void)psigningcert;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertIsValidCRLForCertificate(JNIEnv* km_env, jclass km_clazz, jlong pcert, jlong pcrl, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertIsValidCRLForCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcert, (void*)(uintptr_t)pcrl, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcert;
    (void)pcrl;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertIsWeakHash(JNIEnv* km_env, jclass km_clazz, jint dwhashusetype, jlong pwszcnghashalgid, jint dwchainflags, jlong psignerchaincontext, jlong ptimestamp, jlong pwszfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertIsWeakHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwhashusetype, (void*)(uintptr_t)pwszcnghashalgid, (uint32_t)dwchainflags, (void*)(uintptr_t)psignerchaincontext, (void*)(uintptr_t)ptimestamp, (void*)(uintptr_t)pwszfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwhashusetype;
    (void)pwszcnghashalgid;
    (void)dwchainflags;
    (void)psignerchaincontext;
    (void)ptimestamp;
    (void)pwszfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertNameToStrA(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pname, jint dwstrtype, jlong psz, jint csz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertNameToStrA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pname, (uint32_t)dwstrtype, (void*)(uintptr_t)psz, (uint32_t)csz);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwcertencodingtype;
    (void)pname;
    (void)dwstrtype;
    (void)psz;
    (void)csz;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertNameToStrW(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pname, jint dwstrtype, jlong psz, jint csz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertNameToStrW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pname, (uint32_t)dwstrtype, (void*)(uintptr_t)psz, (uint32_t)csz);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwcertencodingtype;
    (void)pname;
    (void)dwstrtype;
    (void)psz;
    (void)csz;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertOIDToAlgId(JNIEnv* km_env, jclass km_clazz, jlong pszobjid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOIDToAlgId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszobjid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszobjid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertOpenServerOcspResponse(JNIEnv* km_env, jclass km_clazz, jlong pchaincontext, jint dwflags, jlong popenpara) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOpenServerOcspResponse");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pchaincontext, (uint32_t)dwflags, (void*)(uintptr_t)popenpara);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pchaincontext;
    (void)dwflags;
    (void)popenpara;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertOpenStore(JNIEnv* km_env, jclass km_clazz, jlong lpszstoreprovider, jint dwencodingtype, jlong hcryptprov, jint dwflags, jlong pvpara) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOpenStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszstoreprovider, (uint32_t)dwencodingtype, (uint64_t)hcryptprov, (uint32_t)dwflags, (void*)(uintptr_t)pvpara);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpszstoreprovider;
    (void)dwencodingtype;
    (void)hcryptprov;
    (void)dwflags;
    (void)pvpara;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreA(JNIEnv* km_env, jclass km_clazz, jlong hprov, jlong szsubsystemprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOpenSystemStoreA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (void*)(uintptr_t)szsubsystemprotocol);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprov;
    (void)szsubsystemprotocol;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreW(JNIEnv* km_env, jclass km_clazz, jlong hprov, jlong szsubsystemprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertOpenSystemStoreW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (void*)(uintptr_t)szsubsystemprotocol);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprov;
    (void)szsubsystemprotocol;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrA(JNIEnv* km_env, jclass km_clazz, jint dwvaluetype, jlong pvalue, jlong psz, jint csz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRDNValueToStrA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwvaluetype, (void*)(uintptr_t)pvalue, (void*)(uintptr_t)psz, (uint32_t)csz);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwvaluetype;
    (void)pvalue;
    (void)psz;
    (void)csz;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrW(JNIEnv* km_env, jclass km_clazz, jint dwvaluetype, jlong pvalue, jlong psz, jint csz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRDNValueToStrW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwvaluetype, (void*)(uintptr_t)pvalue, (void*)(uintptr_t)psz, (uint32_t)csz);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwvaluetype;
    (void)pvalue;
    (void)psz;
    (void)csz;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertRegisterPhysicalStore(JNIEnv* km_env, jclass km_clazz, jlong pvsystemstore, jint dwflags, jlong pwszstorename, jlong pstoreinfo, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRegisterPhysicalStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvsystemstore, (uint32_t)dwflags, (void*)(uintptr_t)pwszstorename, (void*)(uintptr_t)pstoreinfo, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pwszstorename;
    (void)pstoreinfo;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertRegisterSystemStore(JNIEnv* km_env, jclass km_clazz, jlong pvsystemstore, jint dwflags, jlong pstoreinfo, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRegisterSystemStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvsystemstore, (uint32_t)dwflags, (void*)(uintptr_t)pstoreinfo, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pstoreinfo;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertRemoveEnhancedKeyUsageIdentifier(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jlong pszusageidentifier) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRemoveEnhancedKeyUsageIdentifier");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)pszusageidentifier);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)pszusageidentifier;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertRemoveStoreFromCollection(JNIEnv* km_env, jclass km_clazz, jlong hcollectionstore, jlong hsiblingstore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRemoveStoreFromCollection");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hcollectionstore, (void*)(uintptr_t)hsiblingstore);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hcollectionstore;
    (void)hsiblingstore;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertResyncCertificateChainEngine(JNIEnv* km_env, jclass km_clazz, jlong hchainengine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertResyncCertificateChainEngine");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hchainengine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hchainengine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertRetrieveLogoOrBiometricInfo(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jlong lpszlogoorbiometrictype, jint dwretrievalflags, jint dwtimeout, jint dwflags, jlong pvreserved, jlong ppbdata, jlong pcbdata, jlong ppwszmimetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertRetrieveLogoOrBiometricInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)lpszlogoorbiometrictype, (uint32_t)dwretrievalflags, (uint32_t)dwtimeout, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)ppbdata, (void*)(uintptr_t)pcbdata, (void*)(uintptr_t)ppwszmimetype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)lpszlogoorbiometrictype;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)dwflags;
    (void)pvreserved;
    (void)ppbdata;
    (void)pcbdata;
    (void)ppwszmimetype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSaveStore(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwencodingtype, jint dwsaveas, jint dwsaveto, jlong pvsavetopara, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSaveStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwencodingtype, (uint32_t)dwsaveas, (uint32_t)dwsaveto, (void*)(uintptr_t)pvsavetopara, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)dwencodingtype;
    (void)dwsaveas;
    (void)dwsaveto;
    (void)pvsavetopara;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSelectCertificateChains(JNIEnv* km_env, jclass km_clazz, jlong pselectioncontext, jint dwflags, jlong pchainparameters, jint ccriteria, jlong rgpcriteria, jlong hstore, jlong pcselection, jlong pprgpselection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSelectCertificateChains");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pselectioncontext, (uint32_t)dwflags, (void*)(uintptr_t)pchainparameters, (uint32_t)ccriteria, (void*)(uintptr_t)rgpcriteria, (void*)(uintptr_t)hstore, (void*)(uintptr_t)pcselection, (void*)(uintptr_t)pprgpselection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pselectioncontext;
    (void)dwflags;
    (void)pchainparameters;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)hstore;
    (void)pcselection;
    (void)pprgpselection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSerializeCRLStoreElement(JNIEnv* km_env, jclass km_clazz, jlong pcrlcontext, jint dwflags, jlong pbelement, jlong pcbelement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSerializeCRLStoreElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcrlcontext, (uint32_t)dwflags, (void*)(uintptr_t)pbelement, (void*)(uintptr_t)pcbelement);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcrlcontext;
    (void)dwflags;
    (void)pbelement;
    (void)pcbelement;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSerializeCTLStoreElement(JNIEnv* km_env, jclass km_clazz, jlong pctlcontext, jint dwflags, jlong pbelement, jlong pcbelement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSerializeCTLStoreElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pctlcontext, (uint32_t)dwflags, (void*)(uintptr_t)pbelement, (void*)(uintptr_t)pcbelement);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pctlcontext;
    (void)dwflags;
    (void)pbelement;
    (void)pcbelement;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSerializeCertificateStoreElement(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jint dwflags, jlong pbelement, jlong pcbelement) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSerializeCertificateStoreElement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (uint32_t)dwflags, (void*)(uintptr_t)pbelement, (void*)(uintptr_t)pcbelement);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)dwflags;
    (void)pbelement;
    (void)pcbelement;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSetCRLContextProperty(JNIEnv* km_env, jclass km_clazz, jlong pcrlcontext, jint dwpropid, jint dwflags, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetCRLContextProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcrlcontext, (uint32_t)dwpropid, (uint32_t)dwflags, (void*)(uintptr_t)pvdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcrlcontext;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSetCTLContextProperty(JNIEnv* km_env, jclass km_clazz, jlong pctlcontext, jint dwpropid, jint dwflags, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetCTLContextProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pctlcontext, (uint32_t)dwpropid, (uint32_t)dwflags, (void*)(uintptr_t)pvdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pctlcontext;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextPropertiesFromCTLEntry(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jlong pctlentry, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetCertificateContextPropertiesFromCTLEntry");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)pctlentry, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)pctlentry;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextProperty(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jint dwpropid, jint dwflags, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetCertificateContextProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (uint32_t)dwpropid, (uint32_t)dwflags, (void*)(uintptr_t)pvdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSetEnhancedKeyUsage(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jlong pusage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetEnhancedKeyUsage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)pusage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)pusage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertSetStoreProperty(JNIEnv* km_env, jclass km_clazz, jlong hcertstore, jint dwpropid, jint dwflags, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSetStoreProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcertstore, (uint32_t)dwpropid, (uint32_t)dwflags, (void*)(uintptr_t)pvdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcertstore;
    (void)dwpropid;
    (void)dwflags;
    (void)pvdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertStrToNameA(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pszx500, jint dwstrtype, jlong pvreserved, jlong pbencoded, jlong pcbencoded, jlong ppszerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertStrToNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pszx500, (uint32_t)dwstrtype, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pbencoded, (void*)(uintptr_t)pcbencoded, (void*)(uintptr_t)ppszerror);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)pszx500;
    (void)dwstrtype;
    (void)pvreserved;
    (void)pbencoded;
    (void)pcbencoded;
    (void)ppszerror;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertStrToNameW(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pszx500, jint dwstrtype, jlong pvreserved, jlong pbencoded, jlong pcbencoded, jlong ppszerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertStrToNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pszx500, (uint32_t)dwstrtype, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pbencoded, (void*)(uintptr_t)pcbencoded, (void*)(uintptr_t)ppszerror);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)pszx500;
    (void)dwstrtype;
    (void)pvreserved;
    (void)pbencoded;
    (void)pcbencoded;
    (void)ppszerror;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertUnregisterPhysicalStore(JNIEnv* km_env, jclass km_clazz, jlong pvsystemstore, jint dwflags, jlong pwszstorename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertUnregisterPhysicalStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvsystemstore, (uint32_t)dwflags, (void*)(uintptr_t)pwszstorename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvsystemstore;
    (void)dwflags;
    (void)pwszstorename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertUnregisterSystemStore(JNIEnv* km_env, jclass km_clazz, jlong pvsystemstore, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertUnregisterSystemStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvsystemstore, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvsystemstore;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertVerifyCRLRevocation(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pcertid, jint ccrlinfo, jlong rgpcrlinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyCRLRevocation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pcertid, (uint32_t)ccrlinfo, (void*)(uintptr_t)rgpcrlinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)pcertid;
    (void)ccrlinfo;
    (void)rgpcrlinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertVerifyCRLTimeValidity(JNIEnv* km_env, jclass km_clazz, jlong ptimetoverify, jlong pcrlinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyCRLTimeValidity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptimetoverify, (void*)(uintptr_t)pcrlinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptimetoverify;
    (void)pcrlinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertVerifyCTLUsage(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jint dwsubjecttype, jlong pvsubject, jlong psubjectusage, jint dwflags, jlong pverifyusagepara, jlong pverifyusagestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyCTLUsage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (uint32_t)dwsubjecttype, (void*)(uintptr_t)pvsubject, (void*)(uintptr_t)psubjectusage, (uint32_t)dwflags, (void*)(uintptr_t)pverifyusagepara, (void*)(uintptr_t)pverifyusagestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)dwsubjecttype;
    (void)pvsubject;
    (void)psubjectusage;
    (void)dwflags;
    (void)pverifyusagepara;
    (void)pverifyusagestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertVerifyCertificateChainPolicy(JNIEnv* km_env, jclass km_clazz, jlong pszpolicyoid, jlong pchaincontext, jlong ppolicypara, jlong ppolicystatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyCertificateChainPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpolicyoid, (void*)(uintptr_t)pchaincontext, (void*)(uintptr_t)ppolicypara, (void*)(uintptr_t)ppolicystatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpolicyoid;
    (void)pchaincontext;
    (void)ppolicypara;
    (void)ppolicystatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertVerifyRevocation(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jint dwrevtype, jint ccontext, jlong rgpvcontext, jint dwflags, jlong prevpara, jlong prevstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyRevocation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (uint32_t)dwrevtype, (uint32_t)ccontext, (void*)(uintptr_t)rgpvcontext, (uint32_t)dwflags, (void*)(uintptr_t)prevpara, (void*)(uintptr_t)prevstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)dwrevtype;
    (void)ccontext;
    (void)rgpvcontext;
    (void)dwflags;
    (void)prevpara;
    (void)prevstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertVerifySubjectCertificateContext(JNIEnv* km_env, jclass km_clazz, jlong psubject, jlong pissuer, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifySubjectCertificateContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubject, (void*)(uintptr_t)pissuer, (void*)(uintptr_t)pdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubject;
    (void)pissuer;
    (void)pdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertVerifyTimeValidity(JNIEnv* km_env, jclass km_clazz, jlong ptimetoverify, jlong pcertinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyTimeValidity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptimetoverify, (void*)(uintptr_t)pcertinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptimetoverify;
    (void)pcertinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCertVerifyValidityNesting(JNIEnv* km_env, jclass km_clazz, jlong psubjectinfo, jlong pissuerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertVerifyValidityNesting");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)pissuerinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectinfo;
    (void)pissuerinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCloseCryptoHandle(JNIEnv* km_env, jclass km_clazz, jlong hcrypto) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseCryptoHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptAcquireCertificatePrivateKey(JNIEnv* km_env, jclass km_clazz, jlong pcert, jint dwflags, jlong pvparameters, jlong phcryptprovorncryptkey, jlong pdwkeyspec, jlong pfcallerfreeprovorncryptkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptAcquireCertificatePrivateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcert, (uint32_t)dwflags, (void*)(uintptr_t)pvparameters, (void*)(uintptr_t)phcryptprovorncryptkey, (void*)(uintptr_t)pdwkeyspec, (void*)(uintptr_t)pfcallerfreeprovorncryptkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcert;
    (void)dwflags;
    (void)pvparameters;
    (void)phcryptprovorncryptkey;
    (void)pdwkeyspec;
    (void)pfcallerfreeprovorncryptkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptAcquireContextA(JNIEnv* km_env, jclass km_clazz, jlong phprov, jlong szcontainer, jlong szprovider, jint dwprovtype, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptAcquireContextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phprov, (void*)(uintptr_t)szcontainer, (void*)(uintptr_t)szprovider, (uint32_t)dwprovtype, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phprov;
    (void)szcontainer;
    (void)szprovider;
    (void)dwprovtype;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptAcquireContextW(JNIEnv* km_env, jclass km_clazz, jlong phprov, jlong szcontainer, jlong szprovider, jint dwprovtype, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptAcquireContextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phprov, (void*)(uintptr_t)szcontainer, (void*)(uintptr_t)szprovider, (uint32_t)dwprovtype, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phprov;
    (void)szcontainer;
    (void)szprovider;
    (void)dwprovtype;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringA(JNIEnv* km_env, jclass km_clazz, jlong pbbinary, jint cbbinary, jint dwflags, jlong pszstring, jlong pcchstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptBinaryToStringA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbbinary, (uint32_t)cbbinary, (uint32_t)dwflags, (void*)(uintptr_t)pszstring, (void*)(uintptr_t)pcchstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbbinary;
    (void)cbbinary;
    (void)dwflags;
    (void)pszstring;
    (void)pcchstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringW(JNIEnv* km_env, jclass km_clazz, jlong pbbinary, jint cbbinary, jint dwflags, jlong pszstring, jlong pcchstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptBinaryToStringW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbbinary, (uint32_t)cbbinary, (uint32_t)dwflags, (void*)(uintptr_t)pszstring, (void*)(uintptr_t)pcchstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbbinary;
    (void)cbbinary;
    (void)dwflags;
    (void)pszstring;
    (void)pcchstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(JNIEnv* km_env, jclass km_clazz, jlong hasync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCloseAsyncHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hasync);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hasync;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptContextAddRef(JNIEnv* km_env, jclass km_clazz, jlong hprov, jlong pdwreserved, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptContextAddRef");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)pdwreserved;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptCreateAsyncHandle(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong phasync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCreateAsyncHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)phasync);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)phasync;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptCreateHash(JNIEnv* km_env, jclass km_clazz, jlong hprov, jint algid, jlong hkey, jint dwflags, jlong phhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCreateHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (uint32_t)algid, (uint64_t)hkey, (uint32_t)dwflags, (void*)(uintptr_t)phhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)algid;
    (void)hkey;
    (void)dwflags;
    (void)phhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptCreateKeyIdentifierFromCSP(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pszpubkeyoid, jlong ppubkeystruc, jint cbpubkeystruc, jint dwflags, jlong pvreserved, jlong pbhash, jlong pcbhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptCreateKeyIdentifierFromCSP");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pszpubkeyoid, (void*)(uintptr_t)ppubkeystruc, (uint32_t)cbpubkeystruc, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pbhash, (void*)(uintptr_t)pcbhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)pszpubkeyoid;
    (void)ppubkeystruc;
    (void)cbpubkeystruc;
    (void)dwflags;
    (void)pvreserved;
    (void)pbhash;
    (void)pcbhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDecodeMessage(JNIEnv* km_env, jclass km_clazz, jint dwmsgtypeflags, jlong pdecryptpara, jlong pverifypara, jint dwsignerindex, jlong pbencodedblob, jint cbencodedblob, jint dwprevinnercontenttype, jlong pdwmsgtype, jlong pdwinnercontenttype, jlong pbdecoded, jlong pcbdecoded, jlong ppxchgcert, jlong ppsignercert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecodeMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmsgtypeflags, (void*)(uintptr_t)pdecryptpara, (void*)(uintptr_t)pverifypara, (uint32_t)dwsignerindex, (void*)(uintptr_t)pbencodedblob, (uint32_t)cbencodedblob, (uint32_t)dwprevinnercontenttype, (void*)(uintptr_t)pdwmsgtype, (void*)(uintptr_t)pdwinnercontenttype, (void*)(uintptr_t)pbdecoded, (void*)(uintptr_t)pcbdecoded, (void*)(uintptr_t)ppxchgcert, (void*)(uintptr_t)ppsignercert);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwmsgtypeflags;
    (void)pdecryptpara;
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbencodedblob;
    (void)cbencodedblob;
    (void)dwprevinnercontenttype;
    (void)pdwmsgtype;
    (void)pdwinnercontenttype;
    (void)pbdecoded;
    (void)pcbdecoded;
    (void)ppxchgcert;
    (void)ppsignercert;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDecodeObject(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong lpszstructtype, jlong pbencoded, jint cbencoded, jint dwflags, jlong pvstructinfo, jlong pcbstructinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecodeObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)lpszstructtype, (void*)(uintptr_t)pbencoded, (uint32_t)cbencoded, (uint32_t)dwflags, (void*)(uintptr_t)pvstructinfo, (void*)(uintptr_t)pcbstructinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)dwflags;
    (void)pvstructinfo;
    (void)pcbstructinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDecodeObjectEx(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong lpszstructtype, jlong pbencoded, jint cbencoded, jint dwflags, jlong pdecodepara, jlong pvstructinfo, jlong pcbstructinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecodeObjectEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)lpszstructtype, (void*)(uintptr_t)pbencoded, (uint32_t)cbencoded, (uint32_t)dwflags, (void*)(uintptr_t)pdecodepara, (void*)(uintptr_t)pvstructinfo, (void*)(uintptr_t)pcbstructinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)dwflags;
    (void)pdecodepara;
    (void)pvstructinfo;
    (void)pcbstructinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDecrypt(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong hhash, jint final, jint dwflags, jlong pbdata, jlong pdwdatalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (uint64_t)hhash, (int32_t)final, (uint32_t)dwflags, (void*)(uintptr_t)pbdata, (void*)(uintptr_t)pdwdatalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)hhash;
    (void)final;
    (void)dwflags;
    (void)pbdata;
    (void)pdwdatalen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDecryptAndVerifyMessageSignature(JNIEnv* km_env, jclass km_clazz, jlong pdecryptpara, jlong pverifypara, jint dwsignerindex, jlong pbencryptedblob, jint cbencryptedblob, jlong pbdecrypted, jlong pcbdecrypted, jlong ppxchgcert, jlong ppsignercert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecryptAndVerifyMessageSignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecryptpara, (void*)(uintptr_t)pverifypara, (uint32_t)dwsignerindex, (void*)(uintptr_t)pbencryptedblob, (uint32_t)cbencryptedblob, (void*)(uintptr_t)pbdecrypted, (void*)(uintptr_t)pcbdecrypted, (void*)(uintptr_t)ppxchgcert, (void*)(uintptr_t)ppsignercert);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecryptpara;
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbencryptedblob;
    (void)cbencryptedblob;
    (void)pbdecrypted;
    (void)pcbdecrypted;
    (void)ppxchgcert;
    (void)ppsignercert;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDecryptMessage(JNIEnv* km_env, jclass km_clazz, jlong pdecryptpara, jlong pbencryptedblob, jint cbencryptedblob, jlong pbdecrypted, jlong pcbdecrypted, jlong ppxchgcert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDecryptMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdecryptpara, (void*)(uintptr_t)pbencryptedblob, (uint32_t)cbencryptedblob, (void*)(uintptr_t)pbdecrypted, (void*)(uintptr_t)pcbdecrypted, (void*)(uintptr_t)ppxchgcert);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdecryptpara;
    (void)pbencryptedblob;
    (void)cbencryptedblob;
    (void)pbdecrypted;
    (void)pcbdecrypted;
    (void)ppxchgcert;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDeriveKey(JNIEnv* km_env, jclass km_clazz, jlong hprov, jint algid, jlong hbasedata, jint dwflags, jlong phkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDeriveKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (uint32_t)algid, (uint64_t)hbasedata, (uint32_t)dwflags, (void*)(uintptr_t)phkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)algid;
    (void)hbasedata;
    (void)dwflags;
    (void)phkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDestroyHash(JNIEnv* km_env, jclass km_clazz, jlong hhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDestroyHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDestroyKey(JNIEnv* km_env, jclass km_clazz, jlong hkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDestroyKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDuplicateHash(JNIEnv* km_env, jclass km_clazz, jlong hhash, jlong pdwreserved, jint dwflags, jlong phhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDuplicateHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags, (void*)(uintptr_t)phhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)pdwreserved;
    (void)dwflags;
    (void)phhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptDuplicateKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pdwreserved, jint dwflags, jlong phkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptDuplicateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags, (void*)(uintptr_t)phkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)pdwreserved;
    (void)dwflags;
    (void)phkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEncodeObject(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong lpszstructtype, jlong pvstructinfo, jlong pbencoded, jlong pcbencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEncodeObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)lpszstructtype, (void*)(uintptr_t)pvstructinfo, (void*)(uintptr_t)pbencoded, (void*)(uintptr_t)pcbencoded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pvstructinfo;
    (void)pbencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEncodeObjectEx(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong lpszstructtype, jlong pvstructinfo, jint dwflags, jlong pencodepara, jlong pvencoded, jlong pcbencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEncodeObjectEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)lpszstructtype, (void*)(uintptr_t)pvstructinfo, (uint32_t)dwflags, (void*)(uintptr_t)pencodepara, (void*)(uintptr_t)pvencoded, (void*)(uintptr_t)pcbencoded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pvstructinfo;
    (void)dwflags;
    (void)pencodepara;
    (void)pvencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEncrypt(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong hhash, jint final, jint dwflags, jlong pbdata, jlong pdwdatalen, jint dwbuflen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEncrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (uint64_t)hhash, (int32_t)final, (uint32_t)dwflags, (void*)(uintptr_t)pbdata, (void*)(uintptr_t)pdwdatalen, (uint32_t)dwbuflen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)hhash;
    (void)final;
    (void)dwflags;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwbuflen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEncryptMessage(JNIEnv* km_env, jclass km_clazz, jlong pencryptpara, jint crecipientcert, jlong rgprecipientcert, jlong pbtobeencrypted, jint cbtobeencrypted, jlong pbencryptedblob, jlong pcbencryptedblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEncryptMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pencryptpara, (uint32_t)crecipientcert, (void*)(uintptr_t)rgprecipientcert, (void*)(uintptr_t)pbtobeencrypted, (uint32_t)cbtobeencrypted, (void*)(uintptr_t)pbencryptedblob, (void*)(uintptr_t)pcbencryptedblob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pencryptpara;
    (void)crecipientcert;
    (void)rgprecipientcert;
    (void)pbtobeencrypted;
    (void)cbtobeencrypted;
    (void)pbencryptedblob;
    (void)pcbencryptedblob;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEnumKeyIdentifierProperties(JNIEnv* km_env, jclass km_clazz, jlong pkeyidentifier, jint dwpropid, jint dwflags, jlong pwszcomputername, jlong pvreserved, jlong pvarg, jlong pfnenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumKeyIdentifierProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pkeyidentifier, (uint32_t)dwpropid, (uint32_t)dwflags, (void*)(uintptr_t)pwszcomputername, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pvarg, (void*)(uintptr_t)pfnenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pkeyidentifier;
    (void)dwpropid;
    (void)dwflags;
    (void)pwszcomputername;
    (void)pvreserved;
    (void)pvarg;
    (void)pfnenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEnumOIDFunction(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jlong pszfuncname, jlong pszoid, jint dwflags, jlong pvarg, jlong pfnenumoidfunc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumOIDFunction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (void*)(uintptr_t)pszfuncname, (void*)(uintptr_t)pszoid, (uint32_t)dwflags, (void*)(uintptr_t)pvarg, (void*)(uintptr_t)pfnenumoidfunc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenumoidfunc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEnumOIDInfo(JNIEnv* km_env, jclass km_clazz, jint dwgroupid, jint dwflags, jlong pvarg, jlong pfnenumoidinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumOIDInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwgroupid, (uint32_t)dwflags, (void*)(uintptr_t)pvarg, (void*)(uintptr_t)pfnenumoidinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwgroupid;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenumoidinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesA(JNIEnv* km_env, jclass km_clazz, jint dwindex, jlong pdwreserved, jint dwflags, jlong pdwprovtype, jlong sztypename, jlong pcbtypename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumProviderTypesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwindex, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags, (void*)(uintptr_t)pdwprovtype, (void*)(uintptr_t)sztypename, (void*)(uintptr_t)pcbtypename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)sztypename;
    (void)pcbtypename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesW(JNIEnv* km_env, jclass km_clazz, jint dwindex, jlong pdwreserved, jint dwflags, jlong pdwprovtype, jlong sztypename, jlong pcbtypename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumProviderTypesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwindex, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags, (void*)(uintptr_t)pdwprovtype, (void*)(uintptr_t)sztypename, (void*)(uintptr_t)pcbtypename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)sztypename;
    (void)pcbtypename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersA(JNIEnv* km_env, jclass km_clazz, jint dwindex, jlong pdwreserved, jint dwflags, jlong pdwprovtype, jlong szprovname, jlong pcbprovname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumProvidersA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwindex, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags, (void*)(uintptr_t)pdwprovtype, (void*)(uintptr_t)szprovname, (void*)(uintptr_t)pcbprovname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)szprovname;
    (void)pcbprovname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersW(JNIEnv* km_env, jclass km_clazz, jint dwindex, jlong pdwreserved, jint dwflags, jlong pdwprovtype, jlong szprovname, jlong pcbprovname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptEnumProvidersW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwindex, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags, (void*)(uintptr_t)pdwprovtype, (void*)(uintptr_t)szprovname, (void*)(uintptr_t)pcbprovname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwindex;
    (void)pdwreserved;
    (void)dwflags;
    (void)pdwprovtype;
    (void)szprovname;
    (void)pcbprovname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptExportKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong hexpkey, jint dwblobtype, jint dwflags, jlong pbdata, jlong pdwdatalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (uint64_t)hexpkey, (uint32_t)dwblobtype, (uint32_t)dwflags, (void*)(uintptr_t)pbdata, (void*)(uintptr_t)pdwdatalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)hexpkey;
    (void)dwblobtype;
    (void)dwflags;
    (void)pbdata;
    (void)pdwdatalen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptExportPKCS8(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint dwkeyspec, jlong pszprivatekeyobjid, jint dwflags, jlong pvauxinfo, jlong pbprivatekeyblob, jlong pcbprivatekeyblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportPKCS8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)dwkeyspec, (void*)(uintptr_t)pszprivatekeyobjid, (uint32_t)dwflags, (void*)(uintptr_t)pvauxinfo, (void*)(uintptr_t)pbprivatekeyblob, (void*)(uintptr_t)pcbprivatekeyblob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)dwkeyspec;
    (void)pszprivatekeyobjid;
    (void)dwflags;
    (void)pvauxinfo;
    (void)pbprivatekeyblob;
    (void)pcbprivatekeyblob;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfo(JNIEnv* km_env, jclass km_clazz, jlong hcryptprovorncryptkey, jint dwkeyspec, jint dwcertencodingtype, jlong pinfo, jlong pcbinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportPublicKeyInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprovorncryptkey, (uint32_t)dwkeyspec, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pcbinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)pcbinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hcryptprovorncryptkey, jint dwkeyspec, jint dwcertencodingtype, jlong pszpublickeyobjid, jint dwflags, jlong pvauxinfo, jlong pinfo, jlong pcbinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportPublicKeyInfoEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprovorncryptkey, (uint32_t)dwkeyspec, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pszpublickeyobjid, (uint32_t)dwflags, (void*)(uintptr_t)pvauxinfo, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pcbinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)pszpublickeyobjid;
    (void)dwflags;
    (void)pvauxinfo;
    (void)pinfo;
    (void)pcbinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoFromBCryptKeyHandle(JNIEnv* km_env, jclass km_clazz, jlong hbcryptkey, jint dwcertencodingtype, jlong pszpublickeyobjid, jint dwflags, jlong pvauxinfo, jlong pinfo, jlong pcbinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptExportPublicKeyInfoFromBCryptKeyHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbcryptkey, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pszpublickeyobjid, (uint32_t)dwflags, (void*)(uintptr_t)pvauxinfo, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pcbinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbcryptkey;
    (void)dwcertencodingtype;
    (void)pszpublickeyobjid;
    (void)dwflags;
    (void)pvauxinfo;
    (void)pinfo;
    (void)pcbinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptFindCertificateKeyProvInfo(JNIEnv* km_env, jclass km_clazz, jlong pcert, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFindCertificateKeyProvInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcert, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcert;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptFindLocalizedName(JNIEnv* km_env, jclass km_clazz, jlong pwszcryptname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFindLocalizedName");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszcryptname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pwszcryptname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptFindOIDInfo(JNIEnv* km_env, jclass km_clazz, jint dwkeytype, jlong pvkey, jint dwgroupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFindOIDInfo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwkeytype, (void*)(uintptr_t)pvkey, (uint32_t)dwgroupid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwkeytype;
    (void)pvkey;
    (void)dwgroupid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptFormatObject(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jint dwformattype, jint dwformatstrtype, jlong pformatstruct, jlong lpszstructtype, jlong pbencoded, jint cbencoded, jlong pbformat, jlong pcbformat) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFormatObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (uint32_t)dwformattype, (uint32_t)dwformatstrtype, (void*)(uintptr_t)pformatstruct, (void*)(uintptr_t)lpszstructtype, (void*)(uintptr_t)pbencoded, (uint32_t)cbencoded, (void*)(uintptr_t)pbformat, (void*)(uintptr_t)pcbformat);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)dwformattype;
    (void)dwformatstrtype;
    (void)pformatstruct;
    (void)lpszstructtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbformat;
    (void)pcbformat;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptFreeOIDFunctionAddress(JNIEnv* km_env, jclass km_clazz, jlong hfuncaddr, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptFreeOIDFunctionAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfuncaddr, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfuncaddr;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGenKey(JNIEnv* km_env, jclass km_clazz, jlong hprov, jint algid, jint dwflags, jlong phkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGenKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (uint32_t)algid, (uint32_t)dwflags, (void*)(uintptr_t)phkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)algid;
    (void)dwflags;
    (void)phkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGenRandom(JNIEnv* km_env, jclass km_clazz, jlong hprov, jint dwlen, jlong pbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGenRandom");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (uint32_t)dwlen, (void*)(uintptr_t)pbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)dwlen;
    (void)pbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetAsyncParam(JNIEnv* km_env, jclass km_clazz, jlong hasync, jlong pszparamoid, jlong ppvparam, jlong ppfnfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetAsyncParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hasync, (void*)(uintptr_t)pszparamoid, (void*)(uintptr_t)ppvparam, (void*)(uintptr_t)ppfnfree);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hasync;
    (void)pszparamoid;
    (void)ppvparam;
    (void)ppfnfree;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDDllList(JNIEnv* km_env, jclass km_clazz, jlong hfuncset, jint dwencodingtype, jlong pwszdlllist, jlong pcchdlllist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetDefaultOIDDllList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfuncset, (uint32_t)dwencodingtype, (void*)(uintptr_t)pwszdlllist, (void*)(uintptr_t)pcchdlllist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfuncset;
    (void)dwencodingtype;
    (void)pwszdlllist;
    (void)pcchdlllist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDFunctionAddress(JNIEnv* km_env, jclass km_clazz, jlong hfuncset, jint dwencodingtype, jlong pwszdll, jint dwflags, jlong ppvfuncaddr, jlong phfuncaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetDefaultOIDFunctionAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfuncset, (uint32_t)dwencodingtype, (void*)(uintptr_t)pwszdll, (uint32_t)dwflags, (void*)(uintptr_t)ppvfuncaddr, (void*)(uintptr_t)phfuncaddr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfuncset;
    (void)dwencodingtype;
    (void)pwszdll;
    (void)dwflags;
    (void)ppvfuncaddr;
    (void)phfuncaddr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderA(JNIEnv* km_env, jclass km_clazz, jint dwprovtype, jlong pdwreserved, jint dwflags, jlong pszprovname, jlong pcbprovname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetDefaultProviderA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwprovtype, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags, (void*)(uintptr_t)pszprovname, (void*)(uintptr_t)pcbprovname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    (void)pszprovname;
    (void)pcbprovname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderW(JNIEnv* km_env, jclass km_clazz, jint dwprovtype, jlong pdwreserved, jint dwflags, jlong pszprovname, jlong pcbprovname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetDefaultProviderW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwprovtype, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags, (void*)(uintptr_t)pszprovname, (void*)(uintptr_t)pcbprovname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    (void)pszprovname;
    (void)pcbprovname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetHashParam(JNIEnv* km_env, jclass km_clazz, jlong hhash, jint dwparam, jlong pbdata, jlong pdwdatalen, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetHashParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash, (uint32_t)dwparam, (void*)(uintptr_t)pbdata, (void*)(uintptr_t)pdwdatalen, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)dwparam;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetKeyIdentifierProperty(JNIEnv* km_env, jclass km_clazz, jlong pkeyidentifier, jint dwpropid, jint dwflags, jlong pwszcomputername, jlong pvreserved, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetKeyIdentifierProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pkeyidentifier, (uint32_t)dwpropid, (uint32_t)dwflags, (void*)(uintptr_t)pwszcomputername, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pkeyidentifier;
    (void)dwpropid;
    (void)dwflags;
    (void)pwszcomputername;
    (void)pvreserved;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetKeyParam(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwparam, jlong pbdata, jlong pdwdatalen, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetKeyParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (uint32_t)dwparam, (void*)(uintptr_t)pbdata, (void*)(uintptr_t)pdwdatalen, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)dwparam;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetMessageCertificates(JNIEnv* km_env, jclass km_clazz, jint dwmsgandcertencodingtype, jlong hcryptprov, jint dwflags, jlong pbsignedblob, jint cbsignedblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetMessageCertificates");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmsgandcertencodingtype, (uint64_t)hcryptprov, (uint32_t)dwflags, (void*)(uintptr_t)pbsignedblob, (uint32_t)cbsignedblob);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwmsgandcertencodingtype;
    (void)hcryptprov;
    (void)dwflags;
    (void)pbsignedblob;
    (void)cbsignedblob;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetMessageSignerCount(JNIEnv* km_env, jclass km_clazz, jint dwmsgencodingtype, jlong pbsignedblob, jint cbsignedblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetMessageSignerCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmsgencodingtype, (void*)(uintptr_t)pbsignedblob, (uint32_t)cbsignedblob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwmsgencodingtype;
    (void)pbsignedblob;
    (void)cbsignedblob;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionAddress(JNIEnv* km_env, jclass km_clazz, jlong hfuncset, jint dwencodingtype, jlong pszoid, jint dwflags, jlong ppvfuncaddr, jlong phfuncaddr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetOIDFunctionAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfuncset, (uint32_t)dwencodingtype, (void*)(uintptr_t)pszoid, (uint32_t)dwflags, (void*)(uintptr_t)ppvfuncaddr, (void*)(uintptr_t)phfuncaddr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfuncset;
    (void)dwencodingtype;
    (void)pszoid;
    (void)dwflags;
    (void)ppvfuncaddr;
    (void)phfuncaddr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionValue(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jlong pszfuncname, jlong pszoid, jlong pwszvaluename, jlong pdwvaluetype, jlong pbvaluedata, jlong pcbvaluedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetOIDFunctionValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (void*)(uintptr_t)pszfuncname, (void*)(uintptr_t)pszoid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pdwvaluetype, (void*)(uintptr_t)pbvaluedata, (void*)(uintptr_t)pcbvaluedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)pwszvaluename;
    (void)pdwvaluetype;
    (void)pbvaluedata;
    (void)pcbvaluedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetObjectUrl(JNIEnv* km_env, jclass km_clazz, jlong pszurloid, jlong pvpara, jint dwflags, jlong purlarray, jlong pcburlarray, jlong purlinfo, jlong pcburlinfo, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetObjectUrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszurloid, (void*)(uintptr_t)pvpara, (uint32_t)dwflags, (void*)(uintptr_t)purlarray, (void*)(uintptr_t)pcburlarray, (void*)(uintptr_t)purlinfo, (void*)(uintptr_t)pcburlinfo, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszurloid;
    (void)pvpara;
    (void)dwflags;
    (void)purlarray;
    (void)pcburlarray;
    (void)purlinfo;
    (void)pcburlinfo;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetProvParam(JNIEnv* km_env, jclass km_clazz, jlong hprov, jint dwparam, jlong pbdata, jlong pdwdatalen, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetProvParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (uint32_t)dwparam, (void*)(uintptr_t)pbdata, (void*)(uintptr_t)pdwdatalen, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)dwparam;
    (void)pbdata;
    (void)pdwdatalen;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptGetUserKey(JNIEnv* km_env, jclass km_clazz, jlong hprov, jint dwkeyspec, jlong phuserkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptGetUserKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (uint32_t)dwkeyspec, (void*)(uintptr_t)phuserkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)dwkeyspec;
    (void)phuserkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptHashCertificate(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint algid, jint dwflags, jlong pbencoded, jint cbencoded, jlong pbcomputedhash, jlong pcbcomputedhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)algid, (uint32_t)dwflags, (void*)(uintptr_t)pbencoded, (uint32_t)cbencoded, (void*)(uintptr_t)pbcomputedhash, (void*)(uintptr_t)pcbcomputedhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)algid;
    (void)dwflags;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptHashCertificate2(JNIEnv* km_env, jclass km_clazz, jlong pwszcnghashalgid, jint dwflags, jlong pvreserved, jlong pbencoded, jint cbencoded, jlong pbcomputedhash, jlong pcbcomputedhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashCertificate2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszcnghashalgid, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pbencoded, (uint32_t)cbencoded, (void*)(uintptr_t)pbcomputedhash, (void*)(uintptr_t)pcbcomputedhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszcnghashalgid;
    (void)dwflags;
    (void)pvreserved;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptHashData(JNIEnv* km_env, jclass km_clazz, jlong hhash, jlong pbdata, jint dwdatalen, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash, (void*)(uintptr_t)pbdata, (uint32_t)dwdatalen, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)pbdata;
    (void)dwdatalen;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptHashMessage(JNIEnv* km_env, jclass km_clazz, jlong phashpara, jint fdetachedhash, jint ctobehashed, jlong rgpbtobehashed, jlong rgcbtobehashed, jlong pbhashedblob, jlong pcbhashedblob, jlong pbcomputedhash, jlong pcbcomputedhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phashpara, (int32_t)fdetachedhash, (uint32_t)ctobehashed, (void*)(uintptr_t)rgpbtobehashed, (void*)(uintptr_t)rgcbtobehashed, (void*)(uintptr_t)pbhashedblob, (void*)(uintptr_t)pcbhashedblob, (void*)(uintptr_t)pbcomputedhash, (void*)(uintptr_t)pcbcomputedhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phashpara;
    (void)fdetachedhash;
    (void)ctobehashed;
    (void)rgpbtobehashed;
    (void)rgcbtobehashed;
    (void)pbhashedblob;
    (void)pcbhashedblob;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptHashPublicKeyInfo(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint algid, jint dwflags, jint dwcertencodingtype, jlong pinfo, jlong pbcomputedhash, jlong pcbcomputedhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashPublicKeyInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)algid, (uint32_t)dwflags, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)pbcomputedhash, (void*)(uintptr_t)pcbcomputedhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)algid;
    (void)dwflags;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(JNIEnv* km_env, jclass km_clazz, jlong hhash, jlong hkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashSessionKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash, (uint64_t)hkey, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptHashToBeSigned(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint dwcertencodingtype, jlong pbencoded, jint cbencoded, jlong pbcomputedhash, jlong pcbcomputedhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptHashToBeSigned");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pbencoded, (uint32_t)cbencoded, (void*)(uintptr_t)pbcomputedhash, (void*)(uintptr_t)pcbcomputedhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptImportKey(JNIEnv* km_env, jclass km_clazz, jlong hprov, jlong pbdata, jint dwdatalen, jlong hpubkey, jint dwflags, jlong phkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptImportKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (void*)(uintptr_t)pbdata, (uint32_t)dwdatalen, (uint64_t)hpubkey, (uint32_t)dwflags, (void*)(uintptr_t)phkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)pbdata;
    (void)dwdatalen;
    (void)hpubkey;
    (void)dwflags;
    (void)phkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfo(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint dwcertencodingtype, jlong pinfo, jlong phkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptImportPublicKeyInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pinfo, (void*)(uintptr_t)phkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)phkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint dwcertencodingtype, jlong pinfo, jint aikeyalg, jint dwflags, jlong pvauxinfo, jlong phkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptImportPublicKeyInfoEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pinfo, (uint32_t)aikeyalg, (uint32_t)dwflags, (void*)(uintptr_t)pvauxinfo, (void*)(uintptr_t)phkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)aikeyalg;
    (void)dwflags;
    (void)pvauxinfo;
    (void)phkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx2(JNIEnv* km_env, jclass km_clazz, jint dwcertencodingtype, jlong pinfo, jint dwflags, jlong pvauxinfo, jlong phkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptImportPublicKeyInfoEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwcertencodingtype, (void*)(uintptr_t)pinfo, (uint32_t)dwflags, (void*)(uintptr_t)pvauxinfo, (void*)(uintptr_t)phkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwcertencodingtype;
    (void)pinfo;
    (void)dwflags;
    (void)pvauxinfo;
    (void)phkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptInitOIDFunctionSet(JNIEnv* km_env, jclass km_clazz, jlong pszfuncname, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptInitOIDFunctionSet");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszfuncname, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pszfuncname;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptInstallCancelRetrieval(JNIEnv* km_env, jclass km_clazz, jlong pfncancel, jlong pvarg, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptInstallCancelRetrieval");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfncancel, (void*)(uintptr_t)pvarg, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfncancel;
    (void)pvarg;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptInstallDefaultContext(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint dwdefaulttype, jlong pvdefaultpara, jint dwflags, jlong pvreserved, jlong phdefaultcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptInstallDefaultContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)dwdefaulttype, (void*)(uintptr_t)pvdefaultpara, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)phdefaultcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)dwdefaulttype;
    (void)pvdefaultpara;
    (void)dwflags;
    (void)pvreserved;
    (void)phdefaultcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptInstallOIDFunctionAddress(JNIEnv* km_env, jclass km_clazz, jlong hmodule, jint dwencodingtype, jlong pszfuncname, jint cfuncentry, jlong rgfuncentry, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptInstallOIDFunctionAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmodule, (uint32_t)dwencodingtype, (void*)(uintptr_t)pszfuncname, (uint32_t)cfuncentry, (void*)(uintptr_t)rgfuncentry, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmodule;
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)cfuncentry;
    (void)rgfuncentry;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMemAlloc(JNIEnv* km_env, jclass km_clazz, jint cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMemAlloc");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cbsize);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)cbsize;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMemFree(JNIEnv* km_env, jclass km_clazz, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMemFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pv);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pv;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMemRealloc(JNIEnv* km_env, jclass km_clazz, jlong pv, jint cbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMemRealloc");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pv, (uint32_t)cbsize);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pv;
    (void)cbsize;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgCalculateEncodedLength(JNIEnv* km_env, jclass km_clazz, jint dwmsgencodingtype, jint dwflags, jint dwmsgtype, jlong pvmsgencodeinfo, jlong pszinnercontentobjid, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgCalculateEncodedLength");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmsgencodingtype, (uint32_t)dwflags, (uint32_t)dwmsgtype, (void*)(uintptr_t)pvmsgencodeinfo, (void*)(uintptr_t)pszinnercontentobjid, (uint32_t)cbdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwmsgencodingtype;
    (void)dwflags;
    (void)dwmsgtype;
    (void)pvmsgencodeinfo;
    (void)pszinnercontentobjid;
    (void)cbdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgClose(JNIEnv* km_env, jclass km_clazz, jlong hcryptmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptmsg);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptmsg;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgControl(JNIEnv* km_env, jclass km_clazz, jlong hcryptmsg, jint dwflags, jint dwctrltype, jlong pvctrlpara) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptmsg, (uint32_t)dwflags, (uint32_t)dwctrltype, (void*)(uintptr_t)pvctrlpara);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptmsg;
    (void)dwflags;
    (void)dwctrltype;
    (void)pvctrlpara;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgCountersign(JNIEnv* km_env, jclass km_clazz, jlong hcryptmsg, jint dwindex, jint ccountersigners, jlong rgcountersigners) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgCountersign");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptmsg, (uint32_t)dwindex, (uint32_t)ccountersigners, (void*)(uintptr_t)rgcountersigners);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptmsg;
    (void)dwindex;
    (void)ccountersigners;
    (void)rgcountersigners;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgCountersignEncoded(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jlong pbsignerinfo, jint cbsignerinfo, jint ccountersigners, jlong rgcountersigners, jlong pbcountersignature, jlong pcbcountersignature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgCountersignEncoded");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (void*)(uintptr_t)pbsignerinfo, (uint32_t)cbsignerinfo, (uint32_t)ccountersigners, (void*)(uintptr_t)rgcountersigners, (void*)(uintptr_t)pbcountersignature, (void*)(uintptr_t)pcbcountersignature);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)pbsignerinfo;
    (void)cbsignerinfo;
    (void)ccountersigners;
    (void)rgcountersigners;
    (void)pbcountersignature;
    (void)pcbcountersignature;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgDuplicate(JNIEnv* km_env, jclass km_clazz, jlong hcryptmsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgDuplicate");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptmsg);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hcryptmsg;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgEncodeAndSignCTL(JNIEnv* km_env, jclass km_clazz, jint dwmsgencodingtype, jlong pctlinfo, jlong psigninfo, jint dwflags, jlong pbencoded, jlong pcbencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgEncodeAndSignCTL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmsgencodingtype, (void*)(uintptr_t)pctlinfo, (void*)(uintptr_t)psigninfo, (uint32_t)dwflags, (void*)(uintptr_t)pbencoded, (void*)(uintptr_t)pcbencoded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwmsgencodingtype;
    (void)pctlinfo;
    (void)psigninfo;
    (void)dwflags;
    (void)pbencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgGetAndVerifySigner(JNIEnv* km_env, jclass km_clazz, jlong hcryptmsg, jint csignerstore, jlong rghsignerstore, jint dwflags, jlong ppsigner, jlong pdwsignerindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgGetAndVerifySigner");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptmsg, (uint32_t)csignerstore, (void*)(uintptr_t)rghsignerstore, (uint32_t)dwflags, (void*)(uintptr_t)ppsigner, (void*)(uintptr_t)pdwsignerindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptmsg;
    (void)csignerstore;
    (void)rghsignerstore;
    (void)dwflags;
    (void)ppsigner;
    (void)pdwsignerindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgGetParam(JNIEnv* km_env, jclass km_clazz, jlong hcryptmsg, jint dwparamtype, jint dwindex, jlong pvdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgGetParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptmsg, (uint32_t)dwparamtype, (uint32_t)dwindex, (void*)(uintptr_t)pvdata, (void*)(uintptr_t)pcbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptmsg;
    (void)dwparamtype;
    (void)dwindex;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToDecode(JNIEnv* km_env, jclass km_clazz, jint dwmsgencodingtype, jint dwflags, jint dwmsgtype, jlong hcryptprov, jlong precipientinfo, jlong pstreaminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgOpenToDecode");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmsgencodingtype, (uint32_t)dwflags, (uint32_t)dwmsgtype, (uint64_t)hcryptprov, (void*)(uintptr_t)precipientinfo, (void*)(uintptr_t)pstreaminfo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwmsgencodingtype;
    (void)dwflags;
    (void)dwmsgtype;
    (void)hcryptprov;
    (void)precipientinfo;
    (void)pstreaminfo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToEncode(JNIEnv* km_env, jclass km_clazz, jint dwmsgencodingtype, jint dwflags, jint dwmsgtype, jlong pvmsgencodeinfo, jlong pszinnercontentobjid, jlong pstreaminfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgOpenToEncode");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmsgencodingtype, (uint32_t)dwflags, (uint32_t)dwmsgtype, (void*)(uintptr_t)pvmsgencodeinfo, (void*)(uintptr_t)pszinnercontentobjid, (void*)(uintptr_t)pstreaminfo);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwmsgencodingtype;
    (void)dwflags;
    (void)dwmsgtype;
    (void)pvmsgencodeinfo;
    (void)pszinnercontentobjid;
    (void)pstreaminfo;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgSignCTL(JNIEnv* km_env, jclass km_clazz, jint dwmsgencodingtype, jlong pbctlcontent, jint cbctlcontent, jlong psigninfo, jint dwflags, jlong pbencoded, jlong pcbencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgSignCTL");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmsgencodingtype, (void*)(uintptr_t)pbctlcontent, (uint32_t)cbctlcontent, (void*)(uintptr_t)psigninfo, (uint32_t)dwflags, (void*)(uintptr_t)pbencoded, (void*)(uintptr_t)pcbencoded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwmsgencodingtype;
    (void)pbctlcontent;
    (void)cbctlcontent;
    (void)psigninfo;
    (void)dwflags;
    (void)pbencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgUpdate(JNIEnv* km_env, jclass km_clazz, jlong hcryptmsg, jlong pbdata, jint cbdata, jint ffinal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgUpdate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptmsg, (void*)(uintptr_t)pbdata, (uint32_t)cbdata, (int32_t)ffinal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptmsg;
    (void)pbdata;
    (void)cbdata;
    (void)ffinal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncoded(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint dwencodingtype, jlong pbsignerinfo, jint cbsignerinfo, jlong pbsignerinfocountersignature, jint cbsignerinfocountersignature, jlong pcicountersigner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgVerifyCountersignatureEncoded");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)dwencodingtype, (void*)(uintptr_t)pbsignerinfo, (uint32_t)cbsignerinfo, (void*)(uintptr_t)pbsignerinfocountersignature, (uint32_t)cbsignerinfocountersignature, (void*)(uintptr_t)pcicountersigner);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)dwencodingtype;
    (void)pbsignerinfo;
    (void)cbsignerinfo;
    (void)pbsignerinfocountersignature;
    (void)cbsignerinfocountersignature;
    (void)pcicountersigner;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncodedEx(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint dwencodingtype, jlong pbsignerinfo, jint cbsignerinfo, jlong pbsignerinfocountersignature, jint cbsignerinfocountersignature, jint dwsignertype, jlong pvsigner, jint dwflags, jlong pvextra) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptMsgVerifyCountersignatureEncodedEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)dwencodingtype, (void*)(uintptr_t)pbsignerinfo, (uint32_t)cbsignerinfo, (void*)(uintptr_t)pbsignerinfocountersignature, (uint32_t)cbsignerinfocountersignature, (uint32_t)dwsignertype, (void*)(uintptr_t)pvsigner, (uint32_t)dwflags, (void*)(uintptr_t)pvextra);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)dwencodingtype;
    (void)pbsignerinfo;
    (void)cbsignerinfo;
    (void)pbsignerinfocountersignature;
    (void)cbsignerinfocountersignature;
    (void)dwsignertype;
    (void)pvsigner;
    (void)dwflags;
    (void)pvextra;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptProtectData(JNIEnv* km_env, jclass km_clazz, jlong pdatain, jlong szdatadescr, jlong poptionalentropy, jlong pvreserved, jlong ppromptstruct, jint dwflags, jlong pdataout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptProtectData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdatain, (void*)(uintptr_t)szdatadescr, (void*)(uintptr_t)poptionalentropy, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)ppromptstruct, (uint32_t)dwflags, (void*)(uintptr_t)pdataout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdatain;
    (void)szdatadescr;
    (void)poptionalentropy;
    (void)pvreserved;
    (void)ppromptstruct;
    (void)dwflags;
    (void)pdataout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptProtectMemory(JNIEnv* km_env, jclass km_clazz, jlong pdatain, jint cbdatain, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptProtectMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdatain, (uint32_t)cbdatain, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdatain;
    (void)cbdatain;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptQueryObject(JNIEnv* km_env, jclass km_clazz, jint dwobjecttype, jlong pvobject, jint dwexpectedcontenttypeflags, jint dwexpectedformattypeflags, jint dwflags, jlong pdwmsgandcertencodingtype, jlong pdwcontenttype, jlong pdwformattype, jlong phcertstore, jlong phmsg, jlong ppvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptQueryObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwobjecttype, (void*)(uintptr_t)pvobject, (uint32_t)dwexpectedcontenttypeflags, (uint32_t)dwexpectedformattypeflags, (uint32_t)dwflags, (void*)(uintptr_t)pdwmsgandcertencodingtype, (void*)(uintptr_t)pdwcontenttype, (void*)(uintptr_t)pdwformattype, (void*)(uintptr_t)phcertstore, (void*)(uintptr_t)phmsg, (void*)(uintptr_t)ppvcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwobjecttype;
    (void)pvobject;
    (void)dwexpectedcontenttypeflags;
    (void)dwexpectedformattypeflags;
    (void)dwflags;
    (void)pdwmsgandcertencodingtype;
    (void)pdwcontenttype;
    (void)pdwformattype;
    (void)phcertstore;
    (void)phmsg;
    (void)ppvcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptRegisterDefaultOIDFunction(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jlong pszfuncname, jint dwindex, jlong pwszdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRegisterDefaultOIDFunction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (void*)(uintptr_t)pszfuncname, (uint32_t)dwindex, (void*)(uintptr_t)pwszdll);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)dwindex;
    (void)pwszdll;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDFunction(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jlong pszfuncname, jlong pszoid, jlong pwszdll, jlong pszoverridefuncname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRegisterOIDFunction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (void*)(uintptr_t)pszfuncname, (void*)(uintptr_t)pszoid, (void*)(uintptr_t)pwszdll, (void*)(uintptr_t)pszoverridefuncname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)pwszdll;
    (void)pszoverridefuncname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDInfo(JNIEnv* km_env, jclass km_clazz, jlong pinfo, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRegisterOIDInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinfo, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinfo;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptReleaseContext(JNIEnv* km_env, jclass km_clazz, jlong hprov, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptReleaseContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlA(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszobjectoid, jint dwretrievalflags, jint dwtimeout, jlong ppvobject, jlong hasyncretrieve, jlong pcredentials, jlong pvverify, jlong pauxinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRetrieveObjectByUrlA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszobjectoid, (uint32_t)dwretrievalflags, (uint32_t)dwtimeout, (void*)(uintptr_t)ppvobject, (int64_t)hasyncretrieve, (void*)(uintptr_t)pcredentials, (void*)(uintptr_t)pvverify, (void*)(uintptr_t)pauxinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszurl;
    (void)pszobjectoid;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)ppvobject;
    (void)hasyncretrieve;
    (void)pcredentials;
    (void)pvverify;
    (void)pauxinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlW(JNIEnv* km_env, jclass km_clazz, jlong pszurl, jlong pszobjectoid, jint dwretrievalflags, jint dwtimeout, jlong ppvobject, jlong hasyncretrieve, jlong pcredentials, jlong pvverify, jlong pauxinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRetrieveObjectByUrlW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszurl, (void*)(uintptr_t)pszobjectoid, (uint32_t)dwretrievalflags, (uint32_t)dwtimeout, (void*)(uintptr_t)ppvobject, (int64_t)hasyncretrieve, (void*)(uintptr_t)pcredentials, (void*)(uintptr_t)pvverify, (void*)(uintptr_t)pauxinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszurl;
    (void)pszobjectoid;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)ppvobject;
    (void)hasyncretrieve;
    (void)pcredentials;
    (void)pvverify;
    (void)pauxinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptRetrieveTimeStamp(JNIEnv* km_env, jclass km_clazz, jlong wszurl, jint dwretrievalflags, jint dwtimeout, jlong pszhashid, jlong ppara, jlong pbdata, jint cbdata, jlong pptscontext, jlong pptssigner, jlong phstore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptRetrieveTimeStamp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszurl, (uint32_t)dwretrievalflags, (uint32_t)dwtimeout, (void*)(uintptr_t)pszhashid, (void*)(uintptr_t)ppara, (void*)(uintptr_t)pbdata, (uint32_t)cbdata, (void*)(uintptr_t)pptscontext, (void*)(uintptr_t)pptssigner, (void*)(uintptr_t)phstore);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszurl;
    (void)dwretrievalflags;
    (void)dwtimeout;
    (void)pszhashid;
    (void)ppara;
    (void)pbdata;
    (void)cbdata;
    (void)pptscontext;
    (void)pptssigner;
    (void)phstore;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetAsyncParam(JNIEnv* km_env, jclass km_clazz, jlong hasync, jlong pszparamoid, jlong pvparam, jlong pfnfree) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetAsyncParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hasync, (void*)(uintptr_t)pszparamoid, (void*)(uintptr_t)pvparam, (void*)(uintptr_t)pfnfree);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hasync;
    (void)pszparamoid;
    (void)pvparam;
    (void)pfnfree;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetHashParam(JNIEnv* km_env, jclass km_clazz, jlong hhash, jint dwparam, jlong pbdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetHashParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash, (uint32_t)dwparam, (void*)(uintptr_t)pbdata, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)dwparam;
    (void)pbdata;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetKeyIdentifierProperty(JNIEnv* km_env, jclass km_clazz, jlong pkeyidentifier, jint dwpropid, jint dwflags, jlong pwszcomputername, jlong pvreserved, jlong pvdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetKeyIdentifierProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pkeyidentifier, (uint32_t)dwpropid, (uint32_t)dwflags, (void*)(uintptr_t)pwszcomputername, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)pvdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pkeyidentifier;
    (void)dwpropid;
    (void)dwflags;
    (void)pwszcomputername;
    (void)pvreserved;
    (void)pvdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetKeyParam(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwparam, jlong pbdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetKeyParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (uint32_t)dwparam, (void*)(uintptr_t)pbdata, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)dwparam;
    (void)pbdata;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetOIDFunctionValue(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jlong pszfuncname, jlong pszoid, jlong pwszvaluename, jint dwvaluetype, jlong pbvaluedata, jint cbvaluedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetOIDFunctionValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (void*)(uintptr_t)pszfuncname, (void*)(uintptr_t)pszoid, (void*)(uintptr_t)pwszvaluename, (uint32_t)dwvaluetype, (void*)(uintptr_t)pbvaluedata, (uint32_t)cbvaluedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    (void)pwszvaluename;
    (void)dwvaluetype;
    (void)pbvaluedata;
    (void)cbvaluedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetProvParam(JNIEnv* km_env, jclass km_clazz, jlong hprov, jint dwparam, jlong pbdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProvParam");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprov, (uint32_t)dwparam, (void*)(uintptr_t)pbdata, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprov;
    (void)dwparam;
    (void)pbdata;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetProviderA(JNIEnv* km_env, jclass km_clazz, jlong pszprovname, jint dwprovtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProviderA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovname, (uint32_t)dwprovtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovname;
    (void)dwprovtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetProviderExA(JNIEnv* km_env, jclass km_clazz, jlong pszprovname, jint dwprovtype, jlong pdwreserved, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProviderExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovname, (uint32_t)dwprovtype, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovname;
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetProviderExW(JNIEnv* km_env, jclass km_clazz, jlong pszprovname, jint dwprovtype, jlong pdwreserved, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProviderExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovname, (uint32_t)dwprovtype, (void*)(uintptr_t)pdwreserved, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovname;
    (void)dwprovtype;
    (void)pdwreserved;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSetProviderW(JNIEnv* km_env, jclass km_clazz, jlong pszprovname, jint dwprovtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSetProviderW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovname, (uint32_t)dwprovtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovname;
    (void)dwprovtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSignAndEncodeCertificate(JNIEnv* km_env, jclass km_clazz, jlong hcryptprovorncryptkey, jint dwkeyspec, jint dwcertencodingtype, jlong lpszstructtype, jlong pvstructinfo, jlong psignaturealgorithm, jlong pvhashauxinfo, jlong pbencoded, jlong pcbencoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignAndEncodeCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprovorncryptkey, (uint32_t)dwkeyspec, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)lpszstructtype, (void*)(uintptr_t)pvstructinfo, (void*)(uintptr_t)psignaturealgorithm, (void*)(uintptr_t)pvhashauxinfo, (void*)(uintptr_t)pbencoded, (void*)(uintptr_t)pcbencoded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)lpszstructtype;
    (void)pvstructinfo;
    (void)psignaturealgorithm;
    (void)pvhashauxinfo;
    (void)pbencoded;
    (void)pcbencoded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSignAndEncryptMessage(JNIEnv* km_env, jclass km_clazz, jlong psignpara, jlong pencryptpara, jint crecipientcert, jlong rgprecipientcert, jlong pbtobesignedandencrypted, jint cbtobesignedandencrypted, jlong pbsignedandencryptedblob, jlong pcbsignedandencryptedblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignAndEncryptMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psignpara, (void*)(uintptr_t)pencryptpara, (uint32_t)crecipientcert, (void*)(uintptr_t)rgprecipientcert, (void*)(uintptr_t)pbtobesignedandencrypted, (uint32_t)cbtobesignedandencrypted, (void*)(uintptr_t)pbsignedandencryptedblob, (void*)(uintptr_t)pcbsignedandencryptedblob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psignpara;
    (void)pencryptpara;
    (void)crecipientcert;
    (void)rgprecipientcert;
    (void)pbtobesignedandencrypted;
    (void)cbtobesignedandencrypted;
    (void)pbsignedandencryptedblob;
    (void)pcbsignedandencryptedblob;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSignCertificate(JNIEnv* km_env, jclass km_clazz, jlong hcryptprovorncryptkey, jint dwkeyspec, jint dwcertencodingtype, jlong pbencodedtobesigned, jint cbencodedtobesigned, jlong psignaturealgorithm, jlong pvhashauxinfo, jlong pbsignature, jlong pcbsignature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprovorncryptkey, (uint32_t)dwkeyspec, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pbencodedtobesigned, (uint32_t)cbencodedtobesigned, (void*)(uintptr_t)psignaturealgorithm, (void*)(uintptr_t)pvhashauxinfo, (void*)(uintptr_t)pbsignature, (void*)(uintptr_t)pcbsignature);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprovorncryptkey;
    (void)dwkeyspec;
    (void)dwcertencodingtype;
    (void)pbencodedtobesigned;
    (void)cbencodedtobesigned;
    (void)psignaturealgorithm;
    (void)pvhashauxinfo;
    (void)pbsignature;
    (void)pcbsignature;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSignHashA(JNIEnv* km_env, jclass km_clazz, jlong hhash, jint dwkeyspec, jlong szdescription, jint dwflags, jlong pbsignature, jlong pdwsiglen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignHashA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash, (uint32_t)dwkeyspec, (void*)(uintptr_t)szdescription, (uint32_t)dwflags, (void*)(uintptr_t)pbsignature, (void*)(uintptr_t)pdwsiglen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)dwkeyspec;
    (void)szdescription;
    (void)dwflags;
    (void)pbsignature;
    (void)pdwsiglen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSignHashW(JNIEnv* km_env, jclass km_clazz, jlong hhash, jint dwkeyspec, jlong szdescription, jint dwflags, jlong pbsignature, jlong pdwsiglen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignHashW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash, (uint32_t)dwkeyspec, (void*)(uintptr_t)szdescription, (uint32_t)dwflags, (void*)(uintptr_t)pbsignature, (void*)(uintptr_t)pdwsiglen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)dwkeyspec;
    (void)szdescription;
    (void)dwflags;
    (void)pbsignature;
    (void)pdwsiglen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSignMessage(JNIEnv* km_env, jclass km_clazz, jlong psignpara, jint fdetachedsignature, jint ctobesigned, jlong rgpbtobesigned, jlong rgcbtobesigned, jlong pbsignedblob, jlong pcbsignedblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psignpara, (int32_t)fdetachedsignature, (uint32_t)ctobesigned, (void*)(uintptr_t)rgpbtobesigned, (void*)(uintptr_t)rgcbtobesigned, (void*)(uintptr_t)pbsignedblob, (void*)(uintptr_t)pcbsignedblob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psignpara;
    (void)fdetachedsignature;
    (void)ctobesigned;
    (void)rgpbtobesigned;
    (void)rgcbtobesigned;
    (void)pbsignedblob;
    (void)pcbsignedblob;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptSignMessageWithKey(JNIEnv* km_env, jclass km_clazz, jlong psignpara, jlong pbtobesigned, jint cbtobesigned, jlong pbsignedblob, jlong pcbsignedblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptSignMessageWithKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psignpara, (void*)(uintptr_t)pbtobesigned, (uint32_t)cbtobesigned, (void*)(uintptr_t)pbsignedblob, (void*)(uintptr_t)pcbsignedblob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psignpara;
    (void)pbtobesigned;
    (void)cbtobesigned;
    (void)pbsignedblob;
    (void)pcbsignedblob;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryA(JNIEnv* km_env, jclass km_clazz, jlong pszstring, jint cchstring, jint dwflags, jlong pbbinary, jlong pcbbinary, jlong pdwskip, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptStringToBinaryA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszstring, (uint32_t)cchstring, (uint32_t)dwflags, (void*)(uintptr_t)pbbinary, (void*)(uintptr_t)pcbbinary, (void*)(uintptr_t)pdwskip, (void*)(uintptr_t)pdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszstring;
    (void)cchstring;
    (void)dwflags;
    (void)pbbinary;
    (void)pcbbinary;
    (void)pdwskip;
    (void)pdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryW(JNIEnv* km_env, jclass km_clazz, jlong pszstring, jint cchstring, jint dwflags, jlong pbbinary, jlong pcbbinary, jlong pdwskip, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptStringToBinaryW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszstring, (uint32_t)cchstring, (uint32_t)dwflags, (void*)(uintptr_t)pbbinary, (void*)(uintptr_t)pcbbinary, (void*)(uintptr_t)pdwskip, (void*)(uintptr_t)pdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszstring;
    (void)cchstring;
    (void)dwflags;
    (void)pbbinary;
    (void)pcbbinary;
    (void)pdwskip;
    (void)pdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptUninstallCancelRetrieval(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptnet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUninstallCancelRetrieval");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptUninstallDefaultContext(JNIEnv* km_env, jclass km_clazz, jlong hdefaultcontext, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUninstallDefaultContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdefaultcontext, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdefaultcontext;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptUnprotectData(JNIEnv* km_env, jclass km_clazz, jlong pdatain, jlong ppszdatadescr, jlong poptionalentropy, jlong pvreserved, jlong ppromptstruct, jint dwflags, jlong pdataout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnprotectData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdatain, (void*)(uintptr_t)ppszdatadescr, (void*)(uintptr_t)poptionalentropy, (void*)(uintptr_t)pvreserved, (void*)(uintptr_t)ppromptstruct, (uint32_t)dwflags, (void*)(uintptr_t)pdataout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdatain;
    (void)ppszdatadescr;
    (void)poptionalentropy;
    (void)pvreserved;
    (void)ppromptstruct;
    (void)dwflags;
    (void)pdataout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptUnprotectMemory(JNIEnv* km_env, jclass km_clazz, jlong pdatain, jint cbdatain, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnprotectMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdatain, (uint32_t)cbdatain, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdatain;
    (void)cbdatain;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptUnregisterDefaultOIDFunction(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jlong pszfuncname, jlong pwszdll) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnregisterDefaultOIDFunction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (void*)(uintptr_t)pszfuncname, (void*)(uintptr_t)pwszdll);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pwszdll;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDFunction(JNIEnv* km_env, jclass km_clazz, jint dwencodingtype, jlong pszfuncname, jlong pszoid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnregisterOIDFunction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwencodingtype, (void*)(uintptr_t)pszfuncname, (void*)(uintptr_t)pszoid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwencodingtype;
    (void)pszfuncname;
    (void)pszoid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDInfo(JNIEnv* km_env, jclass km_clazz, jlong pinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUnregisterOIDInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptUpdateProtectedState(JNIEnv* km_env, jclass km_clazz, jlong poldsid, jlong pwszoldpassword, jint dwflags, jlong pdwsuccesscount, jlong pdwfailurecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptUpdateProtectedState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poldsid, (void*)(uintptr_t)pwszoldpassword, (uint32_t)dwflags, (void*)(uintptr_t)pdwsuccesscount, (void*)(uintptr_t)pdwfailurecount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)poldsid;
    (void)pwszoldpassword;
    (void)dwflags;
    (void)pdwsuccesscount;
    (void)pdwfailurecount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignature(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint dwcertencodingtype, jlong pbencoded, jint cbencoded, jlong ppublickey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyCertificateSignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)dwcertencodingtype, (void*)(uintptr_t)pbencoded, (uint32_t)cbencoded, (void*)(uintptr_t)ppublickey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)pbencoded;
    (void)cbencoded;
    (void)ppublickey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignatureEx(JNIEnv* km_env, jclass km_clazz, jlong hcryptprov, jint dwcertencodingtype, jint dwsubjecttype, jlong pvsubject, jint dwissuertype, jlong pvissuer, jint dwflags, jlong pvextra) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyCertificateSignatureEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcryptprov, (uint32_t)dwcertencodingtype, (uint32_t)dwsubjecttype, (void*)(uintptr_t)pvsubject, (uint32_t)dwissuertype, (void*)(uintptr_t)pvissuer, (uint32_t)dwflags, (void*)(uintptr_t)pvextra);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptprov;
    (void)dwcertencodingtype;
    (void)dwsubjecttype;
    (void)pvsubject;
    (void)dwissuertype;
    (void)pvissuer;
    (void)dwflags;
    (void)pvextra;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageHash(JNIEnv* km_env, jclass km_clazz, jlong phashpara, jlong pbdetachedhashblob, jint cbdetachedhashblob, jint ctobehashed, jlong rgpbtobehashed, jlong rgcbtobehashed, jlong pbcomputedhash, jlong pcbcomputedhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyDetachedMessageHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phashpara, (void*)(uintptr_t)pbdetachedhashblob, (uint32_t)cbdetachedhashblob, (uint32_t)ctobehashed, (void*)(uintptr_t)rgpbtobehashed, (void*)(uintptr_t)rgcbtobehashed, (void*)(uintptr_t)pbcomputedhash, (void*)(uintptr_t)pcbcomputedhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phashpara;
    (void)pbdetachedhashblob;
    (void)cbdetachedhashblob;
    (void)ctobehashed;
    (void)rgpbtobehashed;
    (void)rgcbtobehashed;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageSignature(JNIEnv* km_env, jclass km_clazz, jlong pverifypara, jint dwsignerindex, jlong pbdetachedsignblob, jint cbdetachedsignblob, jint ctobesigned, jlong rgpbtobesigned, jlong rgcbtobesigned, jlong ppsignercert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyDetachedMessageSignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pverifypara, (uint32_t)dwsignerindex, (void*)(uintptr_t)pbdetachedsignblob, (uint32_t)cbdetachedsignblob, (uint32_t)ctobesigned, (void*)(uintptr_t)rgpbtobesigned, (void*)(uintptr_t)rgcbtobesigned, (void*)(uintptr_t)ppsignercert);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbdetachedsignblob;
    (void)cbdetachedsignblob;
    (void)ctobesigned;
    (void)rgpbtobesigned;
    (void)rgcbtobesigned;
    (void)ppsignercert;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageHash(JNIEnv* km_env, jclass km_clazz, jlong phashpara, jlong pbhashedblob, jint cbhashedblob, jlong pbtobehashed, jlong pcbtobehashed, jlong pbcomputedhash, jlong pcbcomputedhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyMessageHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phashpara, (void*)(uintptr_t)pbhashedblob, (uint32_t)cbhashedblob, (void*)(uintptr_t)pbtobehashed, (void*)(uintptr_t)pcbtobehashed, (void*)(uintptr_t)pbcomputedhash, (void*)(uintptr_t)pcbcomputedhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phashpara;
    (void)pbhashedblob;
    (void)cbhashedblob;
    (void)pbtobehashed;
    (void)pcbtobehashed;
    (void)pbcomputedhash;
    (void)pcbcomputedhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignature(JNIEnv* km_env, jclass km_clazz, jlong pverifypara, jint dwsignerindex, jlong pbsignedblob, jint cbsignedblob, jlong pbdecoded, jlong pcbdecoded, jlong ppsignercert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyMessageSignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pverifypara, (uint32_t)dwsignerindex, (void*)(uintptr_t)pbsignedblob, (uint32_t)cbsignedblob, (void*)(uintptr_t)pbdecoded, (void*)(uintptr_t)pcbdecoded, (void*)(uintptr_t)ppsignercert);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pverifypara;
    (void)dwsignerindex;
    (void)pbsignedblob;
    (void)cbsignedblob;
    (void)pbdecoded;
    (void)pcbdecoded;
    (void)ppsignercert;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignatureWithKey(JNIEnv* km_env, jclass km_clazz, jlong pverifypara, jlong ppublickeyinfo, jlong pbsignedblob, jint cbsignedblob, jlong pbdecoded, jlong pcbdecoded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyMessageSignatureWithKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pverifypara, (void*)(uintptr_t)ppublickeyinfo, (void*)(uintptr_t)pbsignedblob, (uint32_t)cbsignedblob, (void*)(uintptr_t)pbdecoded, (void*)(uintptr_t)pcbdecoded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pverifypara;
    (void)ppublickeyinfo;
    (void)pbsignedblob;
    (void)cbsignedblob;
    (void)pbdecoded;
    (void)pcbdecoded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureA(JNIEnv* km_env, jclass km_clazz, jlong hhash, jlong pbsignature, jint dwsiglen, jlong hpubkey, jlong szdescription, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifySignatureA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash, (void*)(uintptr_t)pbsignature, (uint32_t)dwsiglen, (uint64_t)hpubkey, (void*)(uintptr_t)szdescription, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)pbsignature;
    (void)dwsiglen;
    (void)hpubkey;
    (void)szdescription;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureW(JNIEnv* km_env, jclass km_clazz, jlong hhash, jlong pbsignature, jint dwsiglen, jlong hpubkey, jlong szdescription, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifySignatureW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hhash, (void*)(uintptr_t)pbsignature, (uint32_t)dwsiglen, (uint64_t)hpubkey, (void*)(uintptr_t)szdescription, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hhash;
    (void)pbsignature;
    (void)dwsiglen;
    (void)hpubkey;
    (void)szdescription;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptVerifyTimeStampSignature(JNIEnv* km_env, jclass km_clazz, jlong pbtscontentinfo, jint cbtscontentinfo, jlong pbdata, jint cbdata, jlong hadditionalstore, jlong pptscontext, jlong pptssigner, jlong phstore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptVerifyTimeStampSignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbtscontentinfo, (uint32_t)cbtscontentinfo, (void*)(uintptr_t)pbdata, (uint32_t)cbdata, (void*)(uintptr_t)hadditionalstore, (void*)(uintptr_t)pptscontext, (void*)(uintptr_t)pptssigner, (void*)(uintptr_t)phstore);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbtscontentinfo;
    (void)cbtscontentinfo;
    (void)pbdata;
    (void)cbdata;
    (void)hadditionalstore;
    (void)pptscontext;
    (void)pptssigner;
    (void)phstore;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlAddObject(JNIEnv* km_env, jclass km_clazz, jlong hsignatureorobject, jint dwflags, jlong rgproperty, jint cproperty, jlong pencoded, jlong ppobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlAddObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsignatureorobject, (uint32_t)dwflags, (void*)(uintptr_t)rgproperty, (uint32_t)cproperty, (void*)(uintptr_t)pencoded, (void*)(uintptr_t)ppobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsignatureorobject;
    (void)dwflags;
    (void)rgproperty;
    (void)cproperty;
    (void)pencoded;
    (void)ppobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlClose(JNIEnv* km_env, jclass km_clazz, jlong hcryptxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlCreateReference(JNIEnv* km_env, jclass km_clazz, jlong hcryptxml, jint dwflags, jlong wszid, jlong wszuri, jlong wsztype, jlong pdigestmethod, jint ctransform, jlong rgtransform, jlong phreference) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlCreateReference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptxml, (uint32_t)dwflags, (void*)(uintptr_t)wszid, (void*)(uintptr_t)wszuri, (void*)(uintptr_t)wsztype, (void*)(uintptr_t)pdigestmethod, (uint32_t)ctransform, (void*)(uintptr_t)rgtransform, (void*)(uintptr_t)phreference);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptxml;
    (void)dwflags;
    (void)wszid;
    (void)wszuri;
    (void)wsztype;
    (void)pdigestmethod;
    (void)ctransform;
    (void)rgtransform;
    (void)phreference;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlDigestReference(JNIEnv* km_env, jclass km_clazz, jlong hreference, jint dwflags, jlong pdataproviderin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlDigestReference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hreference, (uint32_t)dwflags, (void*)(uintptr_t)pdataproviderin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hreference;
    (void)dwflags;
    (void)pdataproviderin;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlEncode(JNIEnv* km_env, jclass km_clazz, jlong hcryptxml, jint dwcharset, jlong rgproperty, jint cproperty, jlong pvcallbackstate, jlong pfnwrite) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlEncode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptxml, (int32_t)dwcharset, (void*)(uintptr_t)rgproperty, (uint32_t)cproperty, (void*)(uintptr_t)pvcallbackstate, (void*)(uintptr_t)pfnwrite);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptxml;
    (void)dwcharset;
    (void)rgproperty;
    (void)cproperty;
    (void)pvcallbackstate;
    (void)pfnwrite;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlEnumAlgorithmInfo(JNIEnv* km_env, jclass km_clazz, jint dwgroupid, jint dwflags, jlong pvarg, jlong pfnenumalginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlEnumAlgorithmInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwgroupid, (uint32_t)dwflags, (void*)(uintptr_t)pvarg, (void*)(uintptr_t)pfnenumalginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwgroupid;
    (void)dwflags;
    (void)pvarg;
    (void)pfnenumalginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlFindAlgorithmInfo(JNIEnv* km_env, jclass km_clazz, jint dwfindbytype, jlong pvfindby, jint dwgroupid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlFindAlgorithmInfo");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwfindbytype, (void*)(uintptr_t)pvfindby, (uint32_t)dwgroupid, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwfindbytype;
    (void)pvfindby;
    (void)dwgroupid;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlGetAlgorithmInfo(JNIEnv* km_env, jclass km_clazz, jlong pxmlalgorithm, jint dwflags, jlong ppalginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetAlgorithmInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pxmlalgorithm, (uint32_t)dwflags, (void*)(uintptr_t)ppalginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pxmlalgorithm;
    (void)dwflags;
    (void)ppalginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlGetDocContext(JNIEnv* km_env, jclass km_clazz, jlong hcryptxml, jlong ppstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetDocContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptxml, (void*)(uintptr_t)ppstruct);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptxml;
    (void)ppstruct;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlGetReference(JNIEnv* km_env, jclass km_clazz, jlong hcryptxml, jlong ppstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetReference");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptxml, (void*)(uintptr_t)ppstruct);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptxml;
    (void)ppstruct;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlGetSignature(JNIEnv* km_env, jclass km_clazz, jlong hcryptxml, jlong ppstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetSignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptxml, (void*)(uintptr_t)ppstruct);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptxml;
    (void)ppstruct;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlGetStatus(JNIEnv* km_env, jclass km_clazz, jlong hcryptxml, jlong pstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcryptxml, (void*)(uintptr_t)pstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptxml;
    (void)pstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlGetTransforms(JNIEnv* km_env, jclass km_clazz, jlong ppconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlGetTransforms");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlImportPublicKey(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pkeyvalue, jlong phkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlImportPublicKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pkeyvalue, (void*)(uintptr_t)phkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pkeyvalue;
    (void)phkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToDecode(JNIEnv* km_env, jclass km_clazz, jlong pconfig, jint dwflags, jlong rgproperty, jint cproperty, jlong pencoded, jlong phcryptxml) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlOpenToDecode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pconfig, (uint32_t)dwflags, (void*)(uintptr_t)rgproperty, (uint32_t)cproperty, (void*)(uintptr_t)pencoded, (void*)(uintptr_t)phcryptxml);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pconfig;
    (void)dwflags;
    (void)rgproperty;
    (void)cproperty;
    (void)pencoded;
    (void)phcryptxml;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToEncode(JNIEnv* km_env, jclass km_clazz, jlong pconfig, jint dwflags, jlong wszid, jlong rgproperty, jint cproperty, jlong pencoded, jlong phsignature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlOpenToEncode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pconfig, (uint32_t)dwflags, (void*)(uintptr_t)wszid, (void*)(uintptr_t)rgproperty, (uint32_t)cproperty, (void*)(uintptr_t)pencoded, (void*)(uintptr_t)phsignature);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pconfig;
    (void)dwflags;
    (void)wszid;
    (void)rgproperty;
    (void)cproperty;
    (void)pencoded;
    (void)phsignature;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlSetHMACSecret(JNIEnv* km_env, jclass km_clazz, jlong hsignature, jlong pbsecret, jint cbsecret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlSetHMACSecret");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsignature, (void*)(uintptr_t)pbsecret, (uint32_t)cbsecret);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsignature;
    (void)pbsecret;
    (void)cbsecret;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlSign(JNIEnv* km_env, jclass km_clazz, jlong hsignature, jlong hkey, jint dwkeyspec, jint dwflags, jint dwkeyinfospec, jlong pvkeyinfospec, jlong psignaturemethod, jlong pcanonicalization) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlSign");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsignature, (uint64_t)hkey, (uint32_t)dwkeyspec, (uint32_t)dwflags, (int32_t)dwkeyinfospec, (void*)(uintptr_t)pvkeyinfospec, (void*)(uintptr_t)psignaturemethod, (void*)(uintptr_t)pcanonicalization);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsignature;
    (void)hkey;
    (void)dwkeyspec;
    (void)dwflags;
    (void)dwkeyinfospec;
    (void)pvkeyinfospec;
    (void)psignaturemethod;
    (void)pcanonicalization;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyCryptXmlVerifySignature(JNIEnv* km_env, jclass km_clazz, jlong hsignature, jlong hkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cryptxml.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CryptXmlVerifySignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsignature, (void*)(uintptr_t)hkey, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsignature;
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyDecrypt(JNIEnv* km_env, jclass km_clazz, jlong hcrypto, jint foaep, jint cbindata, jlong pindata, jlong pcboutdata, jlong ppoutdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Decrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto, (int32_t)foaep, (uint32_t)cbindata, (void*)(uintptr_t)pindata, (void*)(uintptr_t)pcboutdata, (void*)(uintptr_t)ppoutdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    (void)foaep;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyEncrypt(JNIEnv* km_env, jclass km_clazz, jlong hcrypto, jint foaep, jint cbindata, jlong pindata, jlong pcboutdata, jlong ppoutdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Encrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto, (int32_t)foaep, (uint32_t)cbindata, (void*)(uintptr_t)pindata, (void*)(uintptr_t)pcboutdata, (void*)(uintptr_t)ppoutdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    (void)foaep;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyFindCertsByIssuer(JNIEnv* km_env, jclass km_clazz, jlong pcertchains, jlong pcbcertchains, jlong pccertchains, jlong pbencodedissuername, jint cbencodedissuername, jlong pwszpurpose, jint dwkeyspec) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wintrust.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindCertsByIssuer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertchains, (void*)(uintptr_t)pcbcertchains, (void*)(uintptr_t)pccertchains, (void*)(uintptr_t)pbencodedissuername, (uint32_t)cbencodedissuername, (void*)(uintptr_t)pwszpurpose, (uint32_t)dwkeyspec);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertchains;
    (void)pcbcertchains;
    (void)pccertchains;
    (void)pbencodedissuername;
    (void)cbencodedissuername;
    (void)pwszpurpose;
    (void)dwkeyspec;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyFreeToken(JNIEnv* km_env, jclass km_clazz, jlong pallocmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pallocmemory);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pallocmemory;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGenerateDerivedKey(JNIEnv* km_env, jclass km_clazz, jlong hcrypto, jint cblabel, jlong plabel, jint cbnonce, jlong pnonce, jint derivedkeylength, jint offset, jlong algid, jlong pcbkey, jlong ppkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GenerateDerivedKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto, (uint32_t)cblabel, (void*)(uintptr_t)plabel, (uint32_t)cbnonce, (void*)(uintptr_t)pnonce, (uint32_t)derivedkeylength, (uint32_t)offset, (void*)(uintptr_t)algid, (void*)(uintptr_t)pcbkey, (void*)(uintptr_t)ppkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    (void)cblabel;
    (void)plabel;
    (void)cbnonce;
    (void)pnonce;
    (void)derivedkeylength;
    (void)offset;
    (void)algid;
    (void)pcbkey;
    (void)ppkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetAsymmetricEncryptionInterface(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong pszalgid, jlong ppfunctiontable, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAsymmetricEncryptionInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)pszalgid, (void*)(uintptr_t)ppfunctiontable, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetBrowserToken(JNIEnv* km_env, jclass km_clazz, jint dwparamtype, jlong pparam, jlong pcbtoken, jlong pptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBrowserToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwparamtype, (void*)(uintptr_t)pparam, (void*)(uintptr_t)pcbtoken, (void*)(uintptr_t)pptoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwparamtype;
    (void)pparam;
    (void)pcbtoken;
    (void)pptoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetCipherInterface(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong pszalgid, jlong ppfunctiontable, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCipherInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)pszalgid, (void*)(uintptr_t)ppfunctiontable, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetHashInterface(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong pszalgid, jlong ppfunctiontable, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHashInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)pszalgid, (void*)(uintptr_t)ppfunctiontable, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetKeyDerivationInterface(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong pszalgid, jlong ppfunctiontable, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyDerivationInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)pszalgid, (void*)(uintptr_t)ppfunctiontable, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetKeyStorageInterface(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong ppfunctiontable, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyStorageInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)ppfunctiontable, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovidername;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetKeyedHash(JNIEnv* km_env, jclass km_clazz, jlong hsymmetriccrypto, jlong pphhash) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKeyedHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsymmetriccrypto, (void*)(uintptr_t)pphhash);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsymmetriccrypto;
    (void)pphhash;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetRngInterface(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong ppfunctiontable, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRngInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)ppfunctiontable, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovidername;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetSChannelInterface(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong ppfunctiontable, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSChannelInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)ppfunctiontable, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovidername;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetSecretAgreementInterface(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong pszalgid, jlong ppfunctiontable, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecretAgreementInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)pszalgid, (void*)(uintptr_t)ppfunctiontable, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetSignatureInterface(JNIEnv* km_env, jclass km_clazz, jlong pszprovidername, jlong pszalgid, jlong ppfunctiontable, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSignatureInterface");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprovidername, (void*)(uintptr_t)pszalgid, (void*)(uintptr_t)ppfunctiontable, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprovidername;
    (void)pszalgid;
    (void)ppfunctiontable;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyGetToken(JNIEnv* km_env, jclass km_clazz, jint cpolicychain, jlong ppolicychain, jlong securitytoken, jlong phprooftokencrypto) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)cpolicychain, (void*)(uintptr_t)ppolicychain, (void*)(uintptr_t)securitytoken, (void*)(uintptr_t)phprooftokencrypto);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)cpolicychain;
    (void)ppolicychain;
    (void)securitytoken;
    (void)phprooftokencrypto;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyHashCore(JNIEnv* km_env, jclass km_clazz, jlong hcrypto, jint cbindata, jlong pindata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HashCore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto, (uint32_t)cbindata, (void*)(uintptr_t)pindata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyHashFinal(JNIEnv* km_env, jclass km_clazz, jlong hcrypto, jint cbindata, jlong pindata, jlong pcboutdata, jlong ppoutdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HashFinal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto, (uint32_t)cbindata, (void*)(uintptr_t)pindata, (void*)(uintptr_t)pcboutdata, (void*)(uintptr_t)ppoutdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyImportInformationCard(JNIEnv* km_env, jclass km_clazz, jlong filename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportInformationCard");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyManageCardSpace(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ManageCardSpace");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptCloseProtectionDescriptor(JNIEnv* km_env, jclass km_clazz, jlong hdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptCloseProtectionDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptCreateClaim(JNIEnv* km_env, jclass km_clazz, jlong hsubjectkey, jlong hauthoritykey, jint dwclaimtype, jlong pparameterlist, jlong pbclaimblob, jint cbclaimblob, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptCreateClaim");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsubjectkey, (uint64_t)hauthoritykey, (uint32_t)dwclaimtype, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pbclaimblob, (uint32_t)cbclaimblob, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsubjectkey;
    (void)hauthoritykey;
    (void)dwclaimtype;
    (void)pparameterlist;
    (void)pbclaimblob;
    (void)cbclaimblob;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptCreatePersistedKey(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong phkey, jlong pszalgid, jlong pszkeyname, jint dwlegacykeyspec, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptCreatePersistedKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprovider, (void*)(uintptr_t)phkey, (void*)(uintptr_t)pszalgid, (void*)(uintptr_t)pszkeyname, (uint32_t)dwlegacykeyspec, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprovider;
    (void)phkey;
    (void)pszalgid;
    (void)pszkeyname;
    (void)dwlegacykeyspec;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptCreateProtectionDescriptor(JNIEnv* km_env, jclass km_clazz, jlong pwszdescriptorstring, jint dwflags, jlong phdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptCreateProtectionDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszdescriptorstring, (uint32_t)dwflags, (void*)(uintptr_t)phdescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszdescriptorstring;
    (void)dwflags;
    (void)phdescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptDecrypt(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pbinput, jint cbinput, jlong ppaddinginfo, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptDecrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (void*)(uintptr_t)ppaddinginfo, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptDeleteKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptDeriveKey(JNIEnv* km_env, jclass km_clazz, jlong hsharedsecret, jlong pwszkdf, jlong pparameterlist, jlong pbderivedkey, jint cbderivedkey, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptDeriveKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsharedsecret, (void*)(uintptr_t)pwszkdf, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pbderivedkey, (uint32_t)cbderivedkey, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsharedsecret;
    (void)pwszkdf;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptEncrypt(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pbinput, jint cbinput, jlong ppaddinginfo, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptEncrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (void*)(uintptr_t)ppaddinginfo, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)ppaddinginfo;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptEnumAlgorithms(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jint dwalgoperations, jlong pdwalgcount, jlong ppalglist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptEnumAlgorithms");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprovider, (uint32_t)dwalgoperations, (void*)(uintptr_t)pdwalgcount, (void*)(uintptr_t)ppalglist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprovider;
    (void)dwalgoperations;
    (void)pdwalgcount;
    (void)ppalglist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptEnumKeys(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong pszscope, jlong ppkeyname, jlong ppenumstate, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptEnumKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprovider, (void*)(uintptr_t)pszscope, (void*)(uintptr_t)ppkeyname, (void*)(uintptr_t)ppenumstate, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprovider;
    (void)pszscope;
    (void)ppkeyname;
    (void)ppenumstate;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptEnumStorageProviders(JNIEnv* km_env, jclass km_clazz, jlong pdwprovidercount, jlong ppproviderlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptEnumStorageProviders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwprovidercount, (void*)(uintptr_t)ppproviderlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdwprovidercount;
    (void)ppproviderlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptExportKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong hexportkey, jlong pszblobtype, jlong pparameterlist, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptExportKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (uint64_t)hexportkey, (void*)(uintptr_t)pszblobtype, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)hexportkey;
    (void)pszblobtype;
    (void)pparameterlist;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptFinalizeKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong pvinput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptFreeBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvinput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvinput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptFreeObject(JNIEnv* km_env, jclass km_clazz, jlong hobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptFreeObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptGetProperty(JNIEnv* km_env, jclass km_clazz, jlong hobject, jlong pszproperty, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptGetProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hobject, (void*)(uintptr_t)pszproperty, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    (void)pszproperty;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptGetProtectionDescriptorInfo(JNIEnv* km_env, jclass km_clazz, jlong hdescriptor, jlong pmempara, jint dwinfotype, jlong ppvinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptGetProtectionDescriptorInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdescriptor, (void*)(uintptr_t)pmempara, (uint32_t)dwinfotype, (void*)(uintptr_t)ppvinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdescriptor;
    (void)pmempara;
    (void)dwinfotype;
    (void)ppvinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptImportKey(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong himportkey, jlong pszblobtype, jlong pparameterlist, jlong phkey, jlong pbdata, jint cbdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptImportKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprovider, (uint64_t)himportkey, (void*)(uintptr_t)pszblobtype, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)phkey, (void*)(uintptr_t)pbdata, (uint32_t)cbdata, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprovider;
    (void)himportkey;
    (void)pszblobtype;
    (void)pparameterlist;
    (void)phkey;
    (void)pbdata;
    (void)cbdata;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptIsAlgSupported(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong pszalgid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptIsAlgSupported");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprovider, (void*)(uintptr_t)pszalgid, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprovider;
    (void)pszalgid;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(JNIEnv* km_env, jclass km_clazz, jlong hkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptIsKeyHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptKeyDerivation(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pparameterlist, jlong pbderivedkey, jint cbderivedkey, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptKeyDerivation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pbderivedkey, (uint32_t)cbderivedkey, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)pparameterlist;
    (void)pbderivedkey;
    (void)cbderivedkey;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptNotifyChangeKey(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong phevent, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptNotifyChangeKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprovider, (void*)(uintptr_t)phevent, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprovider;
    (void)phevent;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptOpenKey(JNIEnv* km_env, jclass km_clazz, jlong hprovider, jlong phkey, jlong pszkeyname, jint dwlegacykeyspec, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptOpenKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprovider, (void*)(uintptr_t)phkey, (void*)(uintptr_t)pszkeyname, (uint32_t)dwlegacykeyspec, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprovider;
    (void)phkey;
    (void)pszkeyname;
    (void)dwlegacykeyspec;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptOpenStorageProvider(JNIEnv* km_env, jclass km_clazz, jlong phprovider, jlong pszprovidername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptOpenStorageProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phprovider, (void*)(uintptr_t)pszprovidername, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phprovider;
    (void)pszprovidername;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptProtectSecret(JNIEnv* km_env, jclass km_clazz, jlong hdescriptor, jint dwflags, jlong pbdata, jint cbdata, jlong pmempara, jlong hwnd, jlong ppbprotectedblob, jlong pcbprotectedblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptProtectSecret");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdescriptor, (uint32_t)dwflags, (void*)(uintptr_t)pbdata, (uint32_t)cbdata, (void*)(uintptr_t)pmempara, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)ppbprotectedblob, (void*)(uintptr_t)pcbprotectedblob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdescriptor;
    (void)dwflags;
    (void)pbdata;
    (void)cbdata;
    (void)pmempara;
    (void)hwnd;
    (void)ppbprotectedblob;
    (void)pcbprotectedblob;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptQueryProtectionDescriptorName(JNIEnv* km_env, jclass km_clazz, jlong pwszname, jlong pwszdescriptorstring, jlong pcdescriptorstring, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptQueryProtectionDescriptorName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszname, (void*)(uintptr_t)pwszdescriptorstring, (void*)(uintptr_t)pcdescriptorstring, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszname;
    (void)pwszdescriptorstring;
    (void)pcdescriptorstring;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptRegisterProtectionDescriptorName(JNIEnv* km_env, jclass km_clazz, jlong pwszname, jlong pwszdescriptorstring, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptRegisterProtectionDescriptorName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszname, (void*)(uintptr_t)pwszdescriptorstring, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszname;
    (void)pwszdescriptorstring;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptSecretAgreement(JNIEnv* km_env, jclass km_clazz, jlong hprivkey, jlong hpubkey, jlong phagreedsecret, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptSecretAgreement");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hprivkey, (uint64_t)hpubkey, (void*)(uintptr_t)phagreedsecret, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprivkey;
    (void)hpubkey;
    (void)phagreedsecret;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptSetProperty(JNIEnv* km_env, jclass km_clazz, jlong hobject, jlong pszproperty, jlong pbinput, jint cbinput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptSetProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hobject, (void*)(uintptr_t)pszproperty, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    (void)pszproperty;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptSignHash(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong ppaddinginfo, jlong pbhashvalue, jint cbhashvalue, jlong pbsignature, jint cbsignature, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptSignHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (void*)(uintptr_t)ppaddinginfo, (void*)(uintptr_t)pbhashvalue, (uint32_t)cbhashvalue, (void*)(uintptr_t)pbsignature, (uint32_t)cbsignature, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptStreamClose(JNIEnv* km_env, jclass km_clazz, jlong hstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hstream);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstream;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToProtect(JNIEnv* km_env, jclass km_clazz, jlong hdescriptor, jint dwflags, jlong hwnd, jlong pstreaminfo, jlong phstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamOpenToProtect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hdescriptor, (uint32_t)dwflags, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)pstreaminfo, (void*)(uintptr_t)phstream);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdescriptor;
    (void)dwflags;
    (void)hwnd;
    (void)pstreaminfo;
    (void)phstream;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotect(JNIEnv* km_env, jclass km_clazz, jlong pstreaminfo, jint dwflags, jlong hwnd, jlong phstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamOpenToUnprotect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstreaminfo, (uint32_t)dwflags, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)phstream);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstreaminfo;
    (void)dwflags;
    (void)hwnd;
    (void)phstream;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotectEx(JNIEnv* km_env, jclass km_clazz, jlong pstreaminfo, jint dwflags, jlong hwnd, jlong phstream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamOpenToUnprotectEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pstreaminfo, (uint32_t)dwflags, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)phstream);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pstreaminfo;
    (void)dwflags;
    (void)hwnd;
    (void)phstream;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptStreamUpdate(JNIEnv* km_env, jclass km_clazz, jlong hstream, jlong pbdata, jlong cbdata, jint ffinal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptStreamUpdate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hstream, (void*)(uintptr_t)pbdata, (uint64_t)cbdata, (int32_t)ffinal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstream;
    (void)pbdata;
    (void)cbdata;
    (void)ffinal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptTranslateHandle(JNIEnv* km_env, jclass km_clazz, jlong phprovider, jlong phkey, jlong hlegacyprov, jlong hlegacykey, jint dwlegacykeyspec, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptTranslateHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phprovider, (void*)(uintptr_t)phkey, (uint64_t)hlegacyprov, (uint64_t)hlegacykey, (uint32_t)dwlegacykeyspec, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phprovider;
    (void)phkey;
    (void)hlegacyprov;
    (void)hlegacykey;
    (void)dwlegacykeyspec;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptUnprotectSecret(JNIEnv* km_env, jclass km_clazz, jlong phdescriptor, jint dwflags, jlong pbprotectedblob, jint cbprotectedblob, jlong pmempara, jlong hwnd, jlong ppbdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptUnprotectSecret");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phdescriptor, (uint32_t)dwflags, (void*)(uintptr_t)pbprotectedblob, (uint32_t)cbprotectedblob, (void*)(uintptr_t)pmempara, (void*)(uintptr_t)hwnd, (void*)(uintptr_t)ppbdata, (void*)(uintptr_t)pcbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phdescriptor;
    (void)dwflags;
    (void)pbprotectedblob;
    (void)cbprotectedblob;
    (void)pmempara;
    (void)hwnd;
    (void)ppbdata;
    (void)pcbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptVerifyClaim(JNIEnv* km_env, jclass km_clazz, jlong hsubjectkey, jlong hauthoritykey, jint dwclaimtype, jlong pparameterlist, jlong pbclaimblob, jint cbclaimblob, jlong poutput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptVerifyClaim");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsubjectkey, (uint64_t)hauthoritykey, (uint32_t)dwclaimtype, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pbclaimblob, (uint32_t)cbclaimblob, (void*)(uintptr_t)poutput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsubjectkey;
    (void)hauthoritykey;
    (void)dwclaimtype;
    (void)pparameterlist;
    (void)pbclaimblob;
    (void)cbclaimblob;
    (void)poutput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyNCryptVerifySignature(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong ppaddinginfo, jlong pbhashvalue, jint cbhashvalue, jlong pbsignature, jint cbsignature, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NCryptVerifySignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (void*)(uintptr_t)ppaddinginfo, (void*)(uintptr_t)pbhashvalue, (uint32_t)cbhashvalue, (void*)(uintptr_t)pbsignature, (uint32_t)cbsignature, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)ppaddinginfo;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyPFXExportCertStore(JNIEnv* km_env, jclass km_clazz, jlong hstore, jlong ppfx, jlong szpassword, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXExportCertStore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hstore, (void*)(uintptr_t)ppfx, (void*)(uintptr_t)szpassword, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstore;
    (void)ppfx;
    (void)szpassword;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyPFXExportCertStoreEx(JNIEnv* km_env, jclass km_clazz, jlong hstore, jlong ppfx, jlong szpassword, jlong pvpara, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXExportCertStoreEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hstore, (void*)(uintptr_t)ppfx, (void*)(uintptr_t)szpassword, (void*)(uintptr_t)pvpara, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hstore;
    (void)ppfx;
    (void)szpassword;
    (void)pvpara;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyPFXImportCertStore(JNIEnv* km_env, jclass km_clazz, jlong ppfx, jlong szpassword, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXImportCertStore");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppfx, (void*)(uintptr_t)szpassword, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ppfx;
    (void)szpassword;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyPFXIsPFXBlob(JNIEnv* km_env, jclass km_clazz, jlong ppfx) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXIsPFXBlob");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppfx);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppfx;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyPFXVerifyPassword(JNIEnv* km_env, jclass km_clazz, jlong ppfx, jlong szpassword, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("crypt32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PFXVerifyPassword");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppfx, (void*)(uintptr_t)szpassword, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppfx;
    (void)szpassword;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyProcessPrng(JNIEnv* km_env, jclass km_clazz, jlong pbdata, jlong cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ProcessPrng");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbdata, (uint64_t)cbdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbdata;
    (void)cbdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignError");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignHash(JNIEnv* km_env, jclass km_clazz, jlong hcrypto, jint cbhash, jlong phash, jlong hashalgoid, jlong pcbsig, jlong ppsig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto, (uint32_t)cbhash, (void*)(uintptr_t)phash, (void*)(uintptr_t)hashalgoid, (void*)(uintptr_t)pcbsig, (void*)(uintptr_t)ppsig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    (void)cbhash;
    (void)phash;
    (void)hashalgoid;
    (void)pcbsig;
    (void)ppsig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignerFreeSignerContext(JNIEnv* km_env, jclass km_clazz, jlong psignercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerFreeSignerContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psignercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psignercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignerSign(JNIEnv* km_env, jclass km_clazz, jlong psubjectinfo, jlong psignercert, jlong psignatureinfo, jlong pproviderinfo, jlong pwszhttptimestamp, jlong psrequest, jlong psipdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerSign");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)psignercert, (void*)(uintptr_t)psignatureinfo, (void*)(uintptr_t)pproviderinfo, (void*)(uintptr_t)pwszhttptimestamp, (void*)(uintptr_t)psrequest, (void*)(uintptr_t)psipdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignerSignEx(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong psubjectinfo, jlong psignercert, jlong psignatureinfo, jlong pproviderinfo, jlong pwszhttptimestamp, jlong psrequest, jlong psipdata, jlong ppsignercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerSignEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)psignercert, (void*)(uintptr_t)psignatureinfo, (void*)(uintptr_t)pproviderinfo, (void*)(uintptr_t)pwszhttptimestamp, (void*)(uintptr_t)psrequest, (void*)(uintptr_t)psipdata, (void*)(uintptr_t)ppsignercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignerSignEx2(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong psubjectinfo, jlong psignercert, jlong psignatureinfo, jlong pproviderinfo, jint dwtimestampflags, jlong psztimestampalgorithmoid, jlong pwszhttptimestamp, jlong psrequest, jlong psipdata, jlong ppsignercontext, jlong pcryptopolicy, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerSignEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)psignercert, (void*)(uintptr_t)psignatureinfo, (void*)(uintptr_t)pproviderinfo, (uint32_t)dwtimestampflags, (void*)(uintptr_t)psztimestampalgorithmoid, (void*)(uintptr_t)pwszhttptimestamp, (void*)(uintptr_t)psrequest, (void*)(uintptr_t)psipdata, (void*)(uintptr_t)ppsignercontext, (void*)(uintptr_t)pcryptopolicy, (void*)(uintptr_t)preserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)dwtimestampflags;
    (void)psztimestampalgorithmoid;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    (void)pcryptopolicy;
    (void)preserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignerSignEx3(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong psubjectinfo, jlong psignercert, jlong psignatureinfo, jlong pproviderinfo, jint dwtimestampflags, jlong psztimestampalgorithmoid, jlong pwszhttptimestamp, jlong psrequest, jlong psipdata, jlong ppsignercontext, jlong pcryptopolicy, jlong pdigestsigninfo, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerSignEx3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)psignercert, (void*)(uintptr_t)psignatureinfo, (void*)(uintptr_t)pproviderinfo, (uint32_t)dwtimestampflags, (void*)(uintptr_t)psztimestampalgorithmoid, (void*)(uintptr_t)pwszhttptimestamp, (void*)(uintptr_t)psrequest, (void*)(uintptr_t)psipdata, (void*)(uintptr_t)ppsignercontext, (void*)(uintptr_t)pcryptopolicy, (void*)(uintptr_t)pdigestsigninfo, (void*)(uintptr_t)preserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)psignercert;
    (void)psignatureinfo;
    (void)pproviderinfo;
    (void)dwtimestampflags;
    (void)psztimestampalgorithmoid;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    (void)pcryptopolicy;
    (void)pdigestsigninfo;
    (void)preserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignerTimeStamp(JNIEnv* km_env, jclass km_clazz, jlong psubjectinfo, jlong pwszhttptimestamp, jlong psrequest, jlong psipdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerTimeStamp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)pwszhttptimestamp, (void*)(uintptr_t)psrequest, (void*)(uintptr_t)psipdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignerTimeStampEx(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong psubjectinfo, jlong pwszhttptimestamp, jlong psrequest, jlong psipdata, jlong ppsignercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerTimeStampEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)pwszhttptimestamp, (void*)(uintptr_t)psrequest, (void*)(uintptr_t)psipdata, (void*)(uintptr_t)ppsignercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignerTimeStampEx2(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong psubjectinfo, jlong pwszhttptimestamp, jint dwalgid, jlong psrequest, jlong psipdata, jlong ppsignercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerTimeStampEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)pwszhttptimestamp, (uint32_t)dwalgid, (void*)(uintptr_t)psrequest, (void*)(uintptr_t)psipdata, (void*)(uintptr_t)ppsignercontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)dwalgid;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySignerTimeStampEx3(JNIEnv* km_env, jclass km_clazz, jint dwflags, jint dwindex, jlong psubjectinfo, jlong pwszhttptimestamp, jlong pszalgorithmoid, jlong psrequest, jlong psipdata, jlong ppsignercontext, jlong pcryptopolicy, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mssign32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignerTimeStampEx3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (uint32_t)dwindex, (void*)(uintptr_t)psubjectinfo, (void*)(uintptr_t)pwszhttptimestamp, (void*)(uintptr_t)pszalgorithmoid, (void*)(uintptr_t)psrequest, (void*)(uintptr_t)psipdata, (void*)(uintptr_t)ppsignercontext, (void*)(uintptr_t)pcryptopolicy, (void*)(uintptr_t)preserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)dwindex;
    (void)psubjectinfo;
    (void)pwszhttptimestamp;
    (void)pszalgorithmoid;
    (void)psrequest;
    (void)psipdata;
    (void)ppsignercontext;
    (void)pcryptopolicy;
    (void)preserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslChangeNotify(JNIEnv* km_env, jclass km_clazz, jlong hevent, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslChangeNotify");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hevent, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslComputeClientAuthHash(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hmasterkey, jlong hhandshakehash, jlong pszalgid, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslComputeClientAuthHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hmasterkey, (uint64_t)hhandshakehash, (void*)(uintptr_t)pszalgid, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)hhandshakehash;
    (void)pszalgid;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslComputeEapKeyBlock(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hmasterkey, jlong pbrandoms, jint cbrandoms, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslComputeEapKeyBlock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hmasterkey, (void*)(uintptr_t)pbrandoms, (uint32_t)cbrandoms, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)pbrandoms;
    (void)cbrandoms;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslComputeFinishedHash(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hmasterkey, jlong hhandshakehash, jlong pboutput, jint cboutput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslComputeFinishedHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hmasterkey, (uint64_t)hhandshakehash, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)hhandshakehash;
    (void)pboutput;
    (void)cboutput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslComputeSessionHash(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hhandshakehash, jint dwprotocol, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslComputeSessionHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hhandshakehash, (uint32_t)dwprotocol, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hhandshakehash;
    (void)dwprotocol;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslCreateClientAuthHash(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong phhandshakehash, jint dwprotocol, jint dwciphersuite, jlong pszhashalgid, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslCreateClientAuthHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (void*)(uintptr_t)phhandshakehash, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (void*)(uintptr_t)pszhashalgid, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)phhandshakehash;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pszhashalgid;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslCreateEphemeralKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong phephemeralkey, jint dwprotocol, jint dwciphersuite, jint dwkeytype, jint dwkeybitlen, jlong pbparams, jint cbparams, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslCreateEphemeralKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (void*)(uintptr_t)phephemeralkey, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (uint32_t)dwkeytype, (uint32_t)dwkeybitlen, (void*)(uintptr_t)pbparams, (uint32_t)cbparams, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)phephemeralkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)dwkeybitlen;
    (void)pbparams;
    (void)cbparams;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslCreateHandshakeHash(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong phhandshakehash, jint dwprotocol, jint dwciphersuite, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslCreateHandshakeHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (void*)(uintptr_t)phhandshakehash, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)phhandshakehash;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslDecrementProviderReferenceCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslDecryptPacket(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hkey, jlong pbinput, jint cbinput, jlong pboutput, jint cboutput, jlong pcbresult, jlong sequencenumber, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslDecryptPacket");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hkey, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint64_t)sequencenumber, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)sequencenumber;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslDuplicateTranscriptHash(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong htranscripthash, jlong phtranscripthash, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslDuplicateTranscriptHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)htranscripthash, (void*)(uintptr_t)phtranscripthash, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)htranscripthash;
    (void)phtranscripthash;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslEncryptPacket(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hkey, jlong pbinput, jint cbinput, jlong pboutput, jint cboutput, jlong pcbresult, jlong sequencenumber, jint dwcontenttype, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEncryptPacket");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hkey, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint64_t)sequencenumber, (uint32_t)dwcontenttype, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hkey;
    (void)pbinput;
    (void)cbinput;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)sequencenumber;
    (void)dwcontenttype;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslEnumCipherSuites(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hprivatekey, jlong ppciphersuite, jlong ppenumstate, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEnumCipherSuites");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hprivatekey, (void*)(uintptr_t)ppciphersuite, (void*)(uintptr_t)ppenumstate, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)ppciphersuite;
    (void)ppenumstate;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslEnumCipherSuitesEx(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hprivatekey, jlong ppciphersuite, jlong ppenumstate, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEnumCipherSuitesEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hprivatekey, (void*)(uintptr_t)ppciphersuite, (void*)(uintptr_t)ppenumstate, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)ppciphersuite;
    (void)ppenumstate;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslEnumEccCurves(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong pecccurvecount, jlong ppecccurve, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEnumEccCurves");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (void*)(uintptr_t)pecccurvecount, (void*)(uintptr_t)ppecccurve, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)pecccurvecount;
    (void)ppecccurve;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslEnumProtocolProviders(JNIEnv* km_env, jclass km_clazz, jlong pdwprovidercount, jlong ppproviderlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEnumProtocolProviders");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdwprovidercount, (void*)(uintptr_t)ppproviderlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdwprovidercount;
    (void)ppproviderlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExpandBinderKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hearlykey, jlong phbinderkey, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandBinderKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hearlykey, (void*)(uintptr_t)phbinderkey, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hearlykey;
    (void)phbinderkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExpandExporterMasterKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hbasekey, jlong hhashvalue, jlong phexportermasterkey, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandExporterMasterKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hbasekey, (uint64_t)hhashvalue, (void*)(uintptr_t)phexportermasterkey, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hbasekey;
    (void)hhashvalue;
    (void)phexportermasterkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExpandPreSharedKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hresumptionmasterkey, jlong pbticketnonce, jint cbticketnonce, jlong phpresharedkey, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandPreSharedKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hresumptionmasterkey, (void*)(uintptr_t)pbticketnonce, (uint32_t)cbticketnonce, (void*)(uintptr_t)phpresharedkey, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hresumptionmasterkey;
    (void)pbticketnonce;
    (void)cbticketnonce;
    (void)phpresharedkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExpandResumptionMasterKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hmasterkey, jlong hhashvalue, jlong phresumptionmasterkey, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandResumptionMasterKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hmasterkey, (uint64_t)hhashvalue, (void*)(uintptr_t)phresumptionmasterkey, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)hhashvalue;
    (void)phresumptionmasterkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExpandTrafficKeys(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hbasekey, jlong hhashvalue, jlong phclienttraffickey, jlong phservertraffickey, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandTrafficKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hbasekey, (uint64_t)hhashvalue, (void*)(uintptr_t)phclienttraffickey, (void*)(uintptr_t)phservertraffickey, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hbasekey;
    (void)hhashvalue;
    (void)phclienttraffickey;
    (void)phservertraffickey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExpandWriteKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hbasetraffickey, jlong phwritekey, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExpandWriteKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hbasetraffickey, (void*)(uintptr_t)phwritekey, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hbasetraffickey;
    (void)phwritekey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExportKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hkey, jlong pszblobtype, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExportKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hkey, (void*)(uintptr_t)pszblobtype, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hkey;
    (void)pszblobtype;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExportKeyingMaterial(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hmasterkey, jlong slabel, jlong pbrandoms, jint cbrandoms, jlong pbcontextvalue, jshort cbcontextvalue, jlong pboutput, jint cboutput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, void*, uint16_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExportKeyingMaterial");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hmasterkey, (void*)(uintptr_t)slabel, (void*)(uintptr_t)pbrandoms, (uint32_t)cbrandoms, (void*)(uintptr_t)pbcontextvalue, (uint16_t)cbcontextvalue, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)slabel;
    (void)pbrandoms;
    (void)cbrandoms;
    (void)pbcontextvalue;
    (void)cbcontextvalue;
    (void)pboutput;
    (void)cboutput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExtractEarlyKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hpresharedkey, jlong phearlykey, jint dwprotocol, jint dwciphersuite, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExtractEarlyKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hpresharedkey, (void*)(uintptr_t)phearlykey, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hpresharedkey;
    (void)phearlykey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExtractHandshakeKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hprivatekey, jlong hpublickey, jlong hearlykey, jlong phhandshakekey, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExtractHandshakeKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hprivatekey, (uint64_t)hpublickey, (uint64_t)hearlykey, (void*)(uintptr_t)phhandshakekey, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)hpublickey;
    (void)hearlykey;
    (void)phhandshakekey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslExtractMasterKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hhandshakekey, jlong phmasterkey, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslExtractMasterKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hhandshakekey, (void*)(uintptr_t)phmasterkey, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hhandshakekey;
    (void)phmasterkey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong pvinput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslFreeBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvinput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvinput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslFreeObject(JNIEnv* km_env, jclass km_clazz, jlong hobject, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslFreeObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hobject, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobject;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslGenerateMasterKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hprivatekey, jlong hpublickey, jlong phmasterkey, jint dwprotocol, jint dwciphersuite, jlong pparameterlist, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGenerateMasterKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hprivatekey, (uint64_t)hpublickey, (void*)(uintptr_t)phmasterkey, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)hpublickey;
    (void)phmasterkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslGeneratePreMasterKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hpublickey, jlong phpremasterkey, jint dwprotocol, jint dwciphersuite, jlong pparameterlist, jlong pboutput, jint cboutput, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGeneratePreMasterKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hpublickey, (void*)(uintptr_t)phpremasterkey, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pboutput, (uint32_t)cboutput, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hpublickey;
    (void)phpremasterkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)pboutput;
    (void)cboutput;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslGenerateSessionKeys(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hmasterkey, jlong phreadkey, jlong phwritekey, jlong pparameterlist, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGenerateSessionKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hmasterkey, (void*)(uintptr_t)phreadkey, (void*)(uintptr_t)phwritekey, (void*)(uintptr_t)pparameterlist, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hmasterkey;
    (void)phreadkey;
    (void)phwritekey;
    (void)pparameterlist;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslGetCipherSuitePRFHashAlgorithm(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jint dwprotocol, jint dwciphersuite, jint dwkeytype, jlong szprfhash, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetCipherSuitePRFHashAlgorithm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (uint32_t)dwkeytype, (void*)(uintptr_t)szprfhash, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)szprfhash;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslGetKeyProperty(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong pszproperty, jlong ppboutput, jlong pcboutput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetKeyProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hkey, (void*)(uintptr_t)pszproperty, (void*)(uintptr_t)ppboutput, (void*)(uintptr_t)pcboutput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hkey;
    (void)pszproperty;
    (void)ppboutput;
    (void)pcboutput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslGetProviderProperty(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong pszproperty, jlong ppboutput, jlong pcboutput, jlong ppenumstate, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetProviderProperty");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (void*)(uintptr_t)pszproperty, (void*)(uintptr_t)ppboutput, (void*)(uintptr_t)pcboutput, (void*)(uintptr_t)ppenumstate, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)pszproperty;
    (void)ppboutput;
    (void)pcboutput;
    (void)ppenumstate;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslHashHandshake(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hhandshakehash, jlong pbinput, jint cbinput, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslHashHandshake");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hhandshakehash, (void*)(uintptr_t)pbinput, (uint32_t)cbinput, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hhandshakehash;
    (void)pbinput;
    (void)cbinput;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslImportKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong phkey, jlong pszblobtype, jlong pbkeyblob, jint cbkeyblob, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslImportKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (void*)(uintptr_t)phkey, (void*)(uintptr_t)pszblobtype, (void*)(uintptr_t)pbkeyblob, (uint32_t)cbkeyblob, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)phkey;
    (void)pszblobtype;
    (void)pbkeyblob;
    (void)cbkeyblob;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslImportMasterKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hprivatekey, jlong phmasterkey, jint dwprotocol, jint dwciphersuite, jlong pparameterlist, jlong pbencryptedkey, jint cbencryptedkey, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslImportMasterKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hprivatekey, (void*)(uintptr_t)phmasterkey, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (void*)(uintptr_t)pparameterlist, (void*)(uintptr_t)pbencryptedkey, (uint32_t)cbencryptedkey, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)phmasterkey;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)pparameterlist;
    (void)pbencryptedkey;
    (void)cbencryptedkey;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslIncrementProviderReferenceCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslLookupCipherLengths(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jint dwprotocol, jint dwciphersuite, jint dwkeytype, jlong pcipherlengths, jint cbcipherlengths, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslLookupCipherLengths");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (uint32_t)dwkeytype, (void*)(uintptr_t)pcipherlengths, (uint32_t)cbcipherlengths, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)pcipherlengths;
    (void)cbcipherlengths;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslLookupCipherSuiteInfo(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jint dwprotocol, jint dwciphersuite, jint dwkeytype, jlong pciphersuite, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslLookupCipherSuiteInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint32_t)dwprotocol, (uint32_t)dwciphersuite, (uint32_t)dwkeytype, (void*)(uintptr_t)pciphersuite, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)dwprotocol;
    (void)dwciphersuite;
    (void)dwkeytype;
    (void)pciphersuite;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslOpenPrivateKey(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong phprivatekey, jlong pcertcontext, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslOpenPrivateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (void*)(uintptr_t)phprivatekey, (void*)(uintptr_t)pcertcontext, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)phprivatekey;
    (void)pcertcontext;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslOpenProvider(JNIEnv* km_env, jclass km_clazz, jlong phsslprovider, jlong pszprovidername, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslOpenProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phsslprovider, (void*)(uintptr_t)pszprovidername, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phsslprovider;
    (void)pszprovidername;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslSignHash(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hprivatekey, jlong pbhashvalue, jint cbhashvalue, jlong pbsignature, jint cbsignature, jlong pcbresult, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslSignHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hprivatekey, (void*)(uintptr_t)pbhashvalue, (uint32_t)cbhashvalue, (void*)(uintptr_t)pbsignature, (uint32_t)cbsignature, (void*)(uintptr_t)pcbresult, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hprivatekey;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)pcbresult;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySslVerifySignature(JNIEnv* km_env, jclass km_clazz, jlong hsslprovider, jlong hpublickey, jlong pbhashvalue, jint cbhashvalue, jlong pbsignature, jint cbsignature, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ncrypt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslVerifySignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hsslprovider, (uint64_t)hpublickey, (void*)(uintptr_t)pbhashvalue, (uint32_t)cbhashvalue, (void*)(uintptr_t)pbsignature, (uint32_t)cbsignature, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsslprovider;
    (void)hpublickey;
    (void)pbhashvalue;
    (void)cbhashvalue;
    (void)pbsignature;
    (void)cbsignature;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographySystemPrng(JNIEnv* km_env, jclass km_clazz, jlong pbrandomdata, jlong cbrandomdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("bcryptprimitives.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemPrng");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbrandomdata, (uint64_t)cbrandomdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbrandomdata;
    (void)cbrandomdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyTransformBlock(JNIEnv* km_env, jclass km_clazz, jlong hcrypto, jint cbindata, jlong pindata, jlong pcboutdata, jlong ppoutdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformBlock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto, (uint32_t)cbindata, (void*)(uintptr_t)pindata, (void*)(uintptr_t)pcboutdata, (void*)(uintptr_t)ppoutdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyTransformFinalBlock(JNIEnv* km_env, jclass km_clazz, jlong hcrypto, jint cbindata, jlong pindata, jlong pcboutdata, jlong ppoutdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TransformFinalBlock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto, (uint32_t)cbindata, (void*)(uintptr_t)pindata, (void*)(uintptr_t)pcboutdata, (void*)(uintptr_t)ppoutdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    (void)cbindata;
    (void)pindata;
    (void)pcboutdata;
    (void)ppoutdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_WindowsWin32SecurityCryptographyJniBridge_windowssysWindowsWin32SecurityCryptographyVerifyHash(JNIEnv* km_env, jclass km_clazz, jlong hcrypto, jint cbhash, jlong phash, jlong hashalgoid, jint cbsig, jlong psig, jlong pfverified) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("infocardapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyHash");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcrypto, (uint32_t)cbhash, (void*)(uintptr_t)phash, (void*)(uintptr_t)hashalgoid, (uint32_t)cbsig, (void*)(uintptr_t)psig, (void*)(uintptr_t)pfverified);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcrypto;
    (void)cbhash;
    (void)phash;
    (void)hashalgoid;
    (void)cbsig;
    (void)psig;
    (void)pfverified;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

