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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credDeleteA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredDeleteA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetname;
    (void)type;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credDeleteW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredDeleteW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetname;
    (void)type;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credEnumerateA(JNIEnv* km_env, jclass km_clazz, jlong filter, jint flags, jlong count, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredEnumerateA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filter, (uint32_t)flags, (void*)(uintptr_t)count, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)flags;
    (void)count;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credEnumerateW(JNIEnv* km_env, jclass km_clazz, jlong filter, jint flags, jlong count, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredEnumerateW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filter, (uint32_t)flags, (void*)(uintptr_t)count, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filter;
    (void)flags;
    (void)count;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credFindBestCredentialA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredFindBestCredentialA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credFindBestCredentialW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredFindBestCredentialW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credFree(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credGetSessionTypes(JNIEnv* km_env, jclass km_clazz, jint maximumpersistcount, jlong maximumpersist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredGetSessionTypes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)maximumpersistcount, (void*)(uintptr_t)maximumpersist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)maximumpersistcount;
    (void)maximumpersist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credGetTargetInfoA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint flags, jlong targetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredGetTargetInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)flags, (void*)(uintptr_t)targetinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetname;
    (void)flags;
    (void)targetinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credGetTargetInfoW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint flags, jlong targetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredGetTargetInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)flags, (void*)(uintptr_t)targetinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetname;
    (void)flags;
    (void)targetinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credIsMarshaledCredentialA(JNIEnv* km_env, jclass km_clazz, jlong marshaledcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsMarshaledCredentialA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)marshaledcredential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)marshaledcredential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credIsMarshaledCredentialW(JNIEnv* km_env, jclass km_clazz, jlong marshaledcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsMarshaledCredentialW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)marshaledcredential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)marshaledcredential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credIsProtectedA(JNIEnv* km_env, jclass km_clazz, jlong pszprotectedcredentials, jlong pprotectiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsProtectedA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprotectedcredentials, (void*)(uintptr_t)pprotectiontype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprotectedcredentials;
    (void)pprotectiontype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credIsProtectedW(JNIEnv* km_env, jclass km_clazz, jlong pszprotectedcredentials, jlong pprotectiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsProtectedW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprotectedcredentials, (void*)(uintptr_t)pprotectiontype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprotectedcredentials;
    (void)pprotectiontype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credMarshalCredentialA(JNIEnv* km_env, jclass km_clazz, jint credtype, jlong credential, jlong marshaledcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredMarshalCredentialA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)credtype, (void*)(uintptr_t)credential, (void*)(uintptr_t)marshaledcredential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)credtype;
    (void)credential;
    (void)marshaledcredential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credMarshalCredentialW(JNIEnv* km_env, jclass km_clazz, jint credtype, jlong credential, jlong marshaledcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredMarshalCredentialW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)credtype, (void*)(uintptr_t)credential, (void*)(uintptr_t)marshaledcredential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)credtype;
    (void)credential;
    (void)marshaledcredential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credPackAuthenticationBufferA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pszusername, jlong pszpassword, jlong ppackedcredentials, jlong pcbpackedcredentials) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredPackAuthenticationBufferA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszpassword, (void*)(uintptr_t)ppackedcredentials, (void*)(uintptr_t)pcbpackedcredentials);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pszusername;
    (void)pszpassword;
    (void)ppackedcredentials;
    (void)pcbpackedcredentials;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credPackAuthenticationBufferW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pszusername, jlong pszpassword, jlong ppackedcredentials, jlong pcbpackedcredentials) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredPackAuthenticationBufferW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszpassword, (void*)(uintptr_t)ppackedcredentials, (void*)(uintptr_t)pcbpackedcredentials);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pszusername;
    (void)pszpassword;
    (void)ppackedcredentials;
    (void)pcbpackedcredentials;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credProtectA(JNIEnv* km_env, jclass km_clazz, jint fasself, jlong pszcredentials, jint cchcredentials, jlong pszprotectedcredentials, jlong pcchmaxchars, jlong protectiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredProtectA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fasself, (void*)(uintptr_t)pszcredentials, (uint32_t)cchcredentials, (void*)(uintptr_t)pszprotectedcredentials, (void*)(uintptr_t)pcchmaxchars, (void*)(uintptr_t)protectiontype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fasself;
    (void)pszcredentials;
    (void)cchcredentials;
    (void)pszprotectedcredentials;
    (void)pcchmaxchars;
    (void)protectiontype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credProtectW(JNIEnv* km_env, jclass km_clazz, jint fasself, jlong pszcredentials, jint cchcredentials, jlong pszprotectedcredentials, jlong pcchmaxchars, jlong protectiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredProtectW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fasself, (void*)(uintptr_t)pszcredentials, (uint32_t)cchcredentials, (void*)(uintptr_t)pszprotectedcredentials, (void*)(uintptr_t)pcchmaxchars, (void*)(uintptr_t)protectiontype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fasself;
    (void)pszcredentials;
    (void)cchcredentials;
    (void)pszprotectedcredentials;
    (void)pcchmaxchars;
    (void)protectiontype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credReadA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credReadDomainCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong targetinfo, jint flags, jlong count, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadDomainCredentialsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetinfo, (uint32_t)flags, (void*)(uintptr_t)count, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetinfo;
    (void)flags;
    (void)count;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credReadDomainCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong targetinfo, jint flags, jlong count, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadDomainCredentialsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetinfo, (uint32_t)flags, (void*)(uintptr_t)count, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetinfo;
    (void)flags;
    (void)count;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credReadW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credRenameA(JNIEnv* km_env, jclass km_clazz, jlong oldtargetname, jlong newtargetname, jint type, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredRenameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oldtargetname, (void*)(uintptr_t)newtargetname, (uint32_t)type, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oldtargetname;
    (void)newtargetname;
    (void)type;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credRenameW(JNIEnv* km_env, jclass km_clazz, jlong oldtargetname, jlong newtargetname, jint type, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredRenameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oldtargetname, (void*)(uintptr_t)newtargetname, (uint32_t)type, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oldtargetname;
    (void)newtargetname;
    (void)type;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUICmdLinePromptForCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong pcontext, jint dwautherror, jlong username, jint uluserbuffersize, jlong pszpassword, jint ulpasswordbuffersize, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUICmdLinePromptForCredentialsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcontext, (uint32_t)dwautherror, (void*)(uintptr_t)username, (uint32_t)uluserbuffersize, (void*)(uintptr_t)pszpassword, (uint32_t)ulpasswordbuffersize, (void*)(uintptr_t)pfsave, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)username;
    (void)uluserbuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUICmdLinePromptForCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong pcontext, jint dwautherror, jlong username, jint uluserbuffersize, jlong pszpassword, jint ulpasswordbuffersize, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUICmdLinePromptForCredentialsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcontext, (uint32_t)dwautherror, (void*)(uintptr_t)username, (uint32_t)uluserbuffersize, (void*)(uintptr_t)pszpassword, (uint32_t)ulpasswordbuffersize, (void*)(uintptr_t)pfsave, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)username;
    (void)uluserbuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIConfirmCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jint bconfirm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIConfirmCredentialsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psztargetname, (int32_t)bconfirm);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psztargetname;
    (void)bconfirm;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIConfirmCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jint bconfirm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIConfirmCredentialsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psztargetname, (int32_t)bconfirm);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psztargetname;
    (void)bconfirm;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIParseUserNameA(JNIEnv* km_env, jclass km_clazz, jlong username, jlong user, jint userbuffersize, jlong domain, jint domainbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIParseUserNameA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)username, (void*)(uintptr_t)user, (uint32_t)userbuffersize, (void*)(uintptr_t)domain, (uint32_t)domainbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)username;
    (void)user;
    (void)userbuffersize;
    (void)domain;
    (void)domainbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIParseUserNameW(JNIEnv* km_env, jclass km_clazz, jlong username, jlong user, jint userbuffersize, jlong domain, jint domainbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIParseUserNameW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)username, (void*)(uintptr_t)user, (uint32_t)userbuffersize, (void*)(uintptr_t)domain, (uint32_t)domainbuffersize);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)username;
    (void)user;
    (void)userbuffersize;
    (void)domain;
    (void)domainbuffersize;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIPromptForCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong puiinfo, jlong psztargetname, jlong pcontext, jint dwautherror, jlong pszusername, jint ulusernamebuffersize, jlong pszpassword, jint ulpasswordbuffersize, jlong save, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForCredentialsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puiinfo, (void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcontext, (uint32_t)dwautherror, (void*)(uintptr_t)pszusername, (uint32_t)ulusernamebuffersize, (void*)(uintptr_t)pszpassword, (uint32_t)ulpasswordbuffersize, (void*)(uintptr_t)save, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)puiinfo;
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)pszusername;
    (void)ulusernamebuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)save;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIPromptForCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong puiinfo, jlong psztargetname, jlong pcontext, jint dwautherror, jlong pszusername, jint ulusernamebuffersize, jlong pszpassword, jint ulpasswordbuffersize, jlong save, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForCredentialsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puiinfo, (void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcontext, (uint32_t)dwautherror, (void*)(uintptr_t)pszusername, (uint32_t)ulusernamebuffersize, (void*)(uintptr_t)pszpassword, (uint32_t)ulpasswordbuffersize, (void*)(uintptr_t)save, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)puiinfo;
    (void)psztargetname;
    (void)pcontext;
    (void)dwautherror;
    (void)pszusername;
    (void)ulusernamebuffersize;
    (void)pszpassword;
    (void)ulpasswordbuffersize;
    (void)save;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIPromptForWindowsCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong puiinfo, jint dwautherror, jlong pulauthpackage, jlong pvinauthbuffer, jint ulinauthbuffersize, jlong ppvoutauthbuffer, jlong puloutauthbuffersize, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForWindowsCredentialsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puiinfo, (uint32_t)dwautherror, (void*)(uintptr_t)pulauthpackage, (void*)(uintptr_t)pvinauthbuffer, (uint32_t)ulinauthbuffersize, (void*)(uintptr_t)ppvoutauthbuffer, (void*)(uintptr_t)puloutauthbuffersize, (void*)(uintptr_t)pfsave, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)puiinfo;
    (void)dwautherror;
    (void)pulauthpackage;
    (void)pvinauthbuffer;
    (void)ulinauthbuffersize;
    (void)ppvoutauthbuffer;
    (void)puloutauthbuffersize;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIPromptForWindowsCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong puiinfo, jint dwautherror, jlong pulauthpackage, jlong pvinauthbuffer, jint ulinauthbuffersize, jlong ppvoutauthbuffer, jlong puloutauthbuffersize, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForWindowsCredentialsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)puiinfo, (uint32_t)dwautherror, (void*)(uintptr_t)pulauthpackage, (void*)(uintptr_t)pvinauthbuffer, (uint32_t)ulinauthbuffersize, (void*)(uintptr_t)ppvoutauthbuffer, (void*)(uintptr_t)puloutauthbuffersize, (void*)(uintptr_t)pfsave, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)puiinfo;
    (void)dwautherror;
    (void)pulauthpackage;
    (void)pvinauthbuffer;
    (void)ulinauthbuffersize;
    (void)ppvoutauthbuffer;
    (void)puloutauthbuffersize;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIReadSSOCredW(JNIEnv* km_env, jclass km_clazz, jlong pszrealm, jlong ppszusername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIReadSSOCredW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszrealm, (void*)(uintptr_t)ppszusername);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszrealm;
    (void)ppszusername;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUIStoreSSOCredW(JNIEnv* km_env, jclass km_clazz, jlong pszrealm, jlong pszusername, jlong pszpassword, jint bpersist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIStoreSSOCredW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszrealm, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszpassword, (int32_t)bpersist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pszrealm;
    (void)pszusername;
    (void)pszpassword;
    (void)bpersist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUnPackAuthenticationBufferA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pauthbuffer, jint cbauthbuffer, jlong pszusername, jlong pcchlmaxusername, jlong pszdomainname, jlong pcchmaxdomainname, jlong pszpassword, jlong pcchmaxpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnPackAuthenticationBufferA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pauthbuffer, (uint32_t)cbauthbuffer, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pcchlmaxusername, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pcchmaxdomainname, (void*)(uintptr_t)pszpassword, (void*)(uintptr_t)pcchmaxpassword);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)pszusername;
    (void)pcchlmaxusername;
    (void)pszdomainname;
    (void)pcchmaxdomainname;
    (void)pszpassword;
    (void)pcchmaxpassword;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUnPackAuthenticationBufferW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pauthbuffer, jint cbauthbuffer, jlong pszusername, jlong pcchmaxusername, jlong pszdomainname, jlong pcchmaxdomainname, jlong pszpassword, jlong pcchmaxpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnPackAuthenticationBufferW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pauthbuffer, (uint32_t)cbauthbuffer, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pcchmaxusername, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pcchmaxdomainname, (void*)(uintptr_t)pszpassword, (void*)(uintptr_t)pcchmaxpassword);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pauthbuffer;
    (void)cbauthbuffer;
    (void)pszusername;
    (void)pcchmaxusername;
    (void)pszdomainname;
    (void)pcchmaxdomainname;
    (void)pszpassword;
    (void)pcchmaxpassword;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUnmarshalCredentialA(JNIEnv* km_env, jclass km_clazz, jlong marshaledcredential, jlong credtype, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnmarshalCredentialA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)marshaledcredential, (void*)(uintptr_t)credtype, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)marshaledcredential;
    (void)credtype;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUnmarshalCredentialW(JNIEnv* km_env, jclass km_clazz, jlong marshaledcredential, jlong credtype, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnmarshalCredentialW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)marshaledcredential, (void*)(uintptr_t)credtype, (void*)(uintptr_t)credential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)marshaledcredential;
    (void)credtype;
    (void)credential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUnprotectA(JNIEnv* km_env, jclass km_clazz, jint fasself, jlong pszprotectedcredentials, jint cchprotectedcredentials, jlong pszcredentials, jlong pcchmaxchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnprotectA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fasself, (void*)(uintptr_t)pszprotectedcredentials, (uint32_t)cchprotectedcredentials, (void*)(uintptr_t)pszcredentials, (void*)(uintptr_t)pcchmaxchars);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fasself;
    (void)pszprotectedcredentials;
    (void)cchprotectedcredentials;
    (void)pszcredentials;
    (void)pcchmaxchars;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credUnprotectW(JNIEnv* km_env, jclass km_clazz, jint fasself, jlong pszprotectedcredentials, jint cchprotectedcredentials, jlong pszcredentials, jlong pcchmaxchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnprotectW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fasself, (void*)(uintptr_t)pszprotectedcredentials, (uint32_t)cchprotectedcredentials, (void*)(uintptr_t)pszcredentials, (void*)(uintptr_t)pcchmaxchars);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fasself;
    (void)pszprotectedcredentials;
    (void)cchprotectedcredentials;
    (void)pszcredentials;
    (void)pcchmaxchars;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credWriteA(JNIEnv* km_env, jclass km_clazz, jlong credential, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)credential, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)credential;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credWriteDomainCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong targetinfo, jlong credential, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteDomainCredentialsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetinfo, (void*)(uintptr_t)credential, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetinfo;
    (void)credential;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credWriteDomainCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong targetinfo, jlong credential, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteDomainCredentialsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetinfo, (void*)(uintptr_t)credential, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetinfo;
    (void)credential;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1credWriteW(JNIEnv* km_env, jclass km_clazz, jlong credential, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)credential, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)credential;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1getOpenCardNameA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenCardNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1getOpenCardNameW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenCardNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1keyCredentialManagerFreeInformation(JNIEnv* km_env, jclass km_clazz, jlong keycredentialmanagerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerFreeInformation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)keycredentialmanagerinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)keycredentialmanagerinfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1keyCredentialManagerGetInformation(JNIEnv* km_env, jclass km_clazz, jlong keycredentialmanagerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerGetInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keycredentialmanagerinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keycredentialmanagerinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1keyCredentialManagerGetOperationErrorStates(JNIEnv* km_env, jclass km_clazz, jint keycredentialmanageroperationtype, jlong isready, jlong keycredentialmanageroperationerrorstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerGetOperationErrorStates");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)keycredentialmanageroperationtype, (void*)(uintptr_t)isready, (void*)(uintptr_t)keycredentialmanageroperationerrorstates);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keycredentialmanageroperationtype;
    (void)isready;
    (void)keycredentialmanageroperationerrorstates;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1keyCredentialManagerShowUIOperation(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jint keycredentialmanageroperationtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerShowUIOperation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwndowner, (int32_t)keycredentialmanageroperationtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwndowner;
    (void)keycredentialmanageroperationtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardAccessStartedEvent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAccessStartedEvent");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardAddReaderToGroupA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAddReaderToGroupA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardAddReaderToGroupW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAddReaderToGroupW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardAudit(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jint dwevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAudit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (uint32_t)dwevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)dwevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardBeginTransaction(JNIEnv* km_env, jclass km_clazz, jlong hcard) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardBeginTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardCancel(JNIEnv* km_env, jclass km_clazz, jlong hcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardCancel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardConnectA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreader, jint dwsharemode, jint dwpreferredprotocols, jlong phcard, jlong pdwactiveprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardConnectA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreader, (uint32_t)dwsharemode, (uint32_t)dwpreferredprotocols, (void*)(uintptr_t)phcard, (void*)(uintptr_t)pdwactiveprotocol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreader;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)phcard;
    (void)pdwactiveprotocol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardConnectW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreader, jint dwsharemode, jint dwpreferredprotocols, jlong phcard, jlong pdwactiveprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardConnectW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreader, (uint32_t)dwsharemode, (uint32_t)dwpreferredprotocols, (void*)(uintptr_t)phcard, (void*)(uintptr_t)pdwactiveprotocol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreader;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)phcard;
    (void)pdwactiveprotocol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardControl(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwcontrolcode, jlong lpinbuffer, jint cbinbuffersize, jlong lpoutbuffer, jint cboutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)cboutbuffersize, (void*)(uintptr_t)lpbytesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwdisposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardDisconnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (uint32_t)dwdisposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)dwdisposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardDlgExtendedError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardDlgExtendedError");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardEndTransaction(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwdisposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardEndTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (uint32_t)dwdisposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)dwdisposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardEstablishContext(JNIEnv* km_env, jclass km_clazz, jint dwscope, jlong pvreserved1, jlong pvreserved2, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardEstablishContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwscope, (void*)(uintptr_t)pvreserved1, (void*)(uintptr_t)pvreserved2, (void*)(uintptr_t)phcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwscope;
    (void)pvreserved1;
    (void)pvreserved2;
    (void)phcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardForgetCardTypeA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetCardTypeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcardname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardForgetCardTypeW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetCardTypeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcardname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardForgetReaderA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardForgetReaderGroupA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderGroupA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardForgetReaderGroupW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderGroupW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardForgetReaderW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong pvmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardFreeMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)pvmem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)pvmem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetAttrib(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwattrid, jlong pbattr, jlong pcbattrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetAttrib");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (uint32_t)dwattrid, (void*)(uintptr_t)pbattr, (void*)(uintptr_t)pcbattrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)dwattrid;
    (void)pbattr;
    (void)pcbattrlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetCardTypeProviderNameA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jint dwproviderid, jlong szprovider, jlong pcchprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetCardTypeProviderNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (uint32_t)dwproviderid, (void*)(uintptr_t)szprovider, (void*)(uintptr_t)pcchprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    (void)pcchprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetCardTypeProviderNameW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jint dwproviderid, jlong szprovider, jlong pcchprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetCardTypeProviderNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (uint32_t)dwproviderid, (void*)(uintptr_t)szprovider, (void*)(uintptr_t)pcchprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    (void)pcchprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetDeviceTypeIdA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong pdwdevicetypeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetDeviceTypeIdA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)pdwdevicetypeid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)pdwdevicetypeid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetDeviceTypeIdW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong pdwdevicetypeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetDeviceTypeIdW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)pdwdevicetypeid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)pdwdevicetypeid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetProviderIdA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcard, jlong pguidproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetProviderIdA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcard, (void*)(uintptr_t)pguidproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetProviderIdW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcard, jlong pguidproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetProviderIdW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcard, (void*)(uintptr_t)pguidproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetReaderDeviceInstanceIdA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szdeviceinstanceid, jlong pcchdeviceinstanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderDeviceInstanceIdA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szdeviceinstanceid, (void*)(uintptr_t)pcchdeviceinstanceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdeviceinstanceid;
    (void)pcchdeviceinstanceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetReaderDeviceInstanceIdW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szdeviceinstanceid, jlong pcchdeviceinstanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderDeviceInstanceIdW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szdeviceinstanceid, (void*)(uintptr_t)pcchdeviceinstanceid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdeviceinstanceid;
    (void)pcchdeviceinstanceid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetReaderIconA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong pbicon, jlong pcbicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderIconA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)pbicon, (void*)(uintptr_t)pcbicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)pbicon;
    (void)pcbicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetReaderIconW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong pbicon, jlong pcbicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderIconW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)pbicon, (void*)(uintptr_t)pcbicon);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)pbicon;
    (void)pcbicon;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetStatusChangeA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jint dwtimeout, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetStatusChangeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (uint32_t)dwtimeout, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)dwtimeout;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetStatusChangeW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jint dwtimeout, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetStatusChangeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (uint32_t)dwtimeout, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)dwtimeout;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardGetTransmitCount(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong pctransmitcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetTransmitCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)pctransmitcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)pctransmitcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardIntroduceCardTypeA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jlong pguidprimaryprovider, jlong rgguidinterfaces, jint dwinterfacecount, jlong pbatr, jlong pbatrmask, jint cbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceCardTypeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (void*)(uintptr_t)pguidprimaryprovider, (void*)(uintptr_t)rgguidinterfaces, (uint32_t)dwinterfacecount, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pbatrmask, (uint32_t)cbatrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcardname;
    (void)pguidprimaryprovider;
    (void)rgguidinterfaces;
    (void)dwinterfacecount;
    (void)pbatr;
    (void)pbatrmask;
    (void)cbatrlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardIntroduceCardTypeW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jlong pguidprimaryprovider, jlong rgguidinterfaces, jint dwinterfacecount, jlong pbatr, jlong pbatrmask, jint cbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceCardTypeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (void*)(uintptr_t)pguidprimaryprovider, (void*)(uintptr_t)rgguidinterfaces, (uint32_t)dwinterfacecount, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pbatrmask, (uint32_t)cbatrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcardname;
    (void)pguidprimaryprovider;
    (void)rgguidinterfaces;
    (void)dwinterfacecount;
    (void)pbatr;
    (void)pbatrmask;
    (void)cbatrlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardIntroduceReaderA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szdevicename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdevicename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardIntroduceReaderGroupA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderGroupA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardIntroduceReaderGroupW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderGroupW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardIntroduceReaderW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szdevicename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdevicename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardIsValidContext(JNIEnv* km_env, jclass km_clazz, jlong hcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIsValidContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListCardsA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong pbatr, jlong rgquidinterfaces, jint cguidinterfacecount, jlong mszcards, jlong pcchcards) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListCardsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)rgquidinterfaces, (uint32_t)cguidinterfacecount, (void*)(uintptr_t)mszcards, (void*)(uintptr_t)pcchcards);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)pbatr;
    (void)rgquidinterfaces;
    (void)cguidinterfacecount;
    (void)mszcards;
    (void)pcchcards;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListCardsW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong pbatr, jlong rgquidinterfaces, jint cguidinterfacecount, jlong mszcards, jlong pcchcards) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListCardsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)rgquidinterfaces, (uint32_t)cguidinterfacecount, (void*)(uintptr_t)mszcards, (void*)(uintptr_t)pcchcards);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)pbatr;
    (void)rgquidinterfaces;
    (void)cguidinterfacecount;
    (void)mszcards;
    (void)pcchcards;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListInterfacesA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcard, jlong pguidinterfaces, jlong pcguidinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListInterfacesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcard, (void*)(uintptr_t)pguidinterfaces, (void*)(uintptr_t)pcguidinterfaces);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidinterfaces;
    (void)pcguidinterfaces;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListInterfacesW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcard, jlong pguidinterfaces, jlong pcguidinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListInterfacesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcard, (void*)(uintptr_t)pguidinterfaces, (void*)(uintptr_t)pcguidinterfaces);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidinterfaces;
    (void)pcguidinterfaces;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListReaderGroupsA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszgroups, jlong pcchgroups) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReaderGroupsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszgroups, (void*)(uintptr_t)pcchgroups);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)mszgroups;
    (void)pcchgroups;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListReaderGroupsW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszgroups, jlong pcchgroups) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReaderGroupsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszgroups, (void*)(uintptr_t)pcchgroups);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)mszgroups;
    (void)pcchgroups;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListReadersA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszgroups, jlong mszreaders, jlong pcchreaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszgroups, (void*)(uintptr_t)mszreaders, (void*)(uintptr_t)pcchreaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)mszgroups;
    (void)mszreaders;
    (void)pcchreaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListReadersW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszgroups, jlong mszreaders, jlong pcchreaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszgroups, (void*)(uintptr_t)mszreaders, (void*)(uintptr_t)pcchreaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)mszgroups;
    (void)mszreaders;
    (void)pcchreaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListReadersWithDeviceInstanceIdA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szdeviceinstanceid, jlong mszreaders, jlong pcchreaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersWithDeviceInstanceIdA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szdeviceinstanceid, (void*)(uintptr_t)mszreaders, (void*)(uintptr_t)pcchreaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szdeviceinstanceid;
    (void)mszreaders;
    (void)pcchreaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardListReadersWithDeviceInstanceIdW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szdeviceinstanceid, jlong mszreaders, jlong pcchreaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersWithDeviceInstanceIdW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szdeviceinstanceid, (void*)(uintptr_t)mszreaders, (void*)(uintptr_t)pcchreaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szdeviceinstanceid;
    (void)mszreaders;
    (void)pcchreaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardLocateCardsA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszcards, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszcards, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)mszcards;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardLocateCardsByATRA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong rgatrmasks, jint catrs, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsByATRA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)rgatrmasks, (uint32_t)catrs, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)rgatrmasks;
    (void)catrs;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardLocateCardsByATRW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong rgatrmasks, jint catrs, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsByATRW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)rgatrmasks, (uint32_t)catrs, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)rgatrmasks;
    (void)catrs;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardLocateCardsW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszcards, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszcards, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)mszcards;
    (void)rgreaderstates;
    (void)creaders;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardReadCacheA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong cardidentifier, jint freshnesscounter, jlong lookupname, jlong data, jlong datalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReadCacheA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)cardidentifier, (uint32_t)freshnesscounter, (void*)(uintptr_t)lookupname, (void*)(uintptr_t)data, (void*)(uintptr_t)datalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardReadCacheW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong cardidentifier, jint freshnesscounter, jlong lookupname, jlong data, jlong datalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReadCacheW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)cardidentifier, (uint32_t)freshnesscounter, (void*)(uintptr_t)lookupname, (void*)(uintptr_t)data, (void*)(uintptr_t)datalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardReconnect(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwsharemode, jint dwpreferredprotocols, jint dwinitialization, jlong pdwactiveprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReconnect");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (uint32_t)dwsharemode, (uint32_t)dwpreferredprotocols, (uint32_t)dwinitialization, (void*)(uintptr_t)pdwactiveprotocol);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)dwinitialization;
    (void)pdwactiveprotocol;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardReleaseContext(JNIEnv* km_env, jclass km_clazz, jlong hcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReleaseContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardReleaseStartedEvent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReleaseStartedEvent");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardRemoveReaderFromGroupA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardRemoveReaderFromGroupA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardRemoveReaderFromGroupW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardRemoveReaderFromGroupW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardSetAttrib(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwattrid, jlong pbattr, jint cbattrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardSetAttrib");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (uint32_t)dwattrid, (void*)(uintptr_t)pbattr, (uint32_t)cbattrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)dwattrid;
    (void)pbattr;
    (void)cbattrlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardSetCardTypeProviderNameA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jint dwproviderid, jlong szprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardSetCardTypeProviderNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (uint32_t)dwproviderid, (void*)(uintptr_t)szprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardSetCardTypeProviderNameW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jint dwproviderid, jlong szprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardSetCardTypeProviderNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (uint32_t)dwproviderid, (void*)(uintptr_t)szprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardState(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong pdwstate, jlong pdwprotocol, jlong pbatr, jlong pcbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)pdwstate, (void*)(uintptr_t)pdwprotocol, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pcbatrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardStatusA(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong mszreadernames, jlong pcchreaderlen, jlong pdwstate, jlong pdwprotocol, jlong pbatr, jlong pcbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardStatusA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)mszreadernames, (void*)(uintptr_t)pcchreaderlen, (void*)(uintptr_t)pdwstate, (void*)(uintptr_t)pdwprotocol, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pcbatrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)mszreadernames;
    (void)pcchreaderlen;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardStatusW(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong mszreadernames, jlong pcchreaderlen, jlong pdwstate, jlong pdwprotocol, jlong pbatr, jlong pcbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardStatusW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)mszreadernames, (void*)(uintptr_t)pcchreaderlen, (void*)(uintptr_t)pdwstate, (void*)(uintptr_t)pdwprotocol, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pcbatrlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)mszreadernames;
    (void)pcchreaderlen;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardTransmit(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong piosendpci, jlong pbsendbuffer, jint cbsendlength, jlong piorecvpci, jlong pbrecvbuffer, jlong pcbrecvlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardTransmit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)piosendpci, (void*)(uintptr_t)pbsendbuffer, (uint32_t)cbsendlength, (void*)(uintptr_t)piorecvpci, (void*)(uintptr_t)pbrecvbuffer, (void*)(uintptr_t)pcbrecvlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcard;
    (void)piosendpci;
    (void)pbsendbuffer;
    (void)cbsendlength;
    (void)piorecvpci;
    (void)pbrecvbuffer;
    (void)pcbrecvlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardUIDlgSelectCardA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardUIDlgSelectCardA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardUIDlgSelectCardW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardUIDlgSelectCardW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)param0);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)param0;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardWriteCacheA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong cardidentifier, jint freshnesscounter, jlong lookupname, jlong data, jint datalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardWriteCacheA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)cardidentifier, (uint32_t)freshnesscounter, (void*)(uintptr_t)lookupname, (void*)(uintptr_t)data, (uint32_t)datalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1sCardWriteCacheW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong cardidentifier, jint freshnesscounter, jlong lookupname, jlong data, jint datalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardWriteCacheW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)cardidentifier, (uint32_t)freshnesscounter, (void*)(uintptr_t)lookupname, (void*)(uintptr_t)data, (uint32_t)datalen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

