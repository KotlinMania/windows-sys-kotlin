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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredDeleteA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredDeleteA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredDeleteW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredDeleteW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredEnumerateA(JNIEnv* km_env, jclass km_clazz, jlong filter, jint flags, jlong count, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredEnumerateA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filter, (uint32_t)flags, (void*)(uintptr_t)count, (void*)(uintptr_t)credential) : -1;
#else
    (void)filter;
    (void)flags;
    (void)count;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredEnumerateW(JNIEnv* km_env, jclass km_clazz, jlong filter, jint flags, jlong count, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredEnumerateW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filter, (uint32_t)flags, (void*)(uintptr_t)count, (void*)(uintptr_t)credential) : -1;
#else
    (void)filter;
    (void)flags;
    (void)count;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredFindBestCredentialA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredFindBestCredentialA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags, (void*)(uintptr_t)credential) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredFindBestCredentialW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredFindBestCredentialW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags, (void*)(uintptr_t)credential) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredFree(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)buffer);
#else
    (void)buffer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredGetSessionTypes(JNIEnv* km_env, jclass km_clazz, jint maximumpersistcount, jlong maximumpersist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredGetSessionTypes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)maximumpersistcount, (void*)(uintptr_t)maximumpersist) : -1;
#else
    (void)maximumpersistcount;
    (void)maximumpersist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredGetTargetInfoA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint flags, jlong targetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredGetTargetInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)flags, (void*)(uintptr_t)targetinfo) : -1;
#else
    (void)targetname;
    (void)flags;
    (void)targetinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredGetTargetInfoW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint flags, jlong targetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredGetTargetInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)flags, (void*)(uintptr_t)targetinfo) : -1;
#else
    (void)targetname;
    (void)flags;
    (void)targetinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredIsMarshaledCredentialA(JNIEnv* km_env, jclass km_clazz, jlong marshaledcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsMarshaledCredentialA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)marshaledcredential) : -1;
#else
    (void)marshaledcredential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredIsMarshaledCredentialW(JNIEnv* km_env, jclass km_clazz, jlong marshaledcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsMarshaledCredentialW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)marshaledcredential) : -1;
#else
    (void)marshaledcredential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredIsProtectedA(JNIEnv* km_env, jclass km_clazz, jlong pszprotectedcredentials, jlong pprotectiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsProtectedA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprotectedcredentials, (void*)(uintptr_t)pprotectiontype) : -1;
#else
    (void)pszprotectedcredentials;
    (void)pprotectiontype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredIsProtectedW(JNIEnv* km_env, jclass km_clazz, jlong pszprotectedcredentials, jlong pprotectiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredIsProtectedW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprotectedcredentials, (void*)(uintptr_t)pprotectiontype) : -1;
#else
    (void)pszprotectedcredentials;
    (void)pprotectiontype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredMarshalCredentialA(JNIEnv* km_env, jclass km_clazz, jint credtype, jlong credential, jlong marshaledcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredMarshalCredentialA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)credtype, (void*)(uintptr_t)credential, (void*)(uintptr_t)marshaledcredential) : -1;
#else
    (void)credtype;
    (void)credential;
    (void)marshaledcredential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredMarshalCredentialW(JNIEnv* km_env, jclass km_clazz, jint credtype, jlong credential, jlong marshaledcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredMarshalCredentialW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)credtype, (void*)(uintptr_t)credential, (void*)(uintptr_t)marshaledcredential) : -1;
#else
    (void)credtype;
    (void)credential;
    (void)marshaledcredential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredPackAuthenticationBufferA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pszusername, jlong pszpassword, jlong ppackedcredentials, jlong pcbpackedcredentials) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredPackAuthenticationBufferA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszpassword, (void*)(uintptr_t)ppackedcredentials, (void*)(uintptr_t)pcbpackedcredentials) : -1;
#else
    (void)dwflags;
    (void)pszusername;
    (void)pszpassword;
    (void)ppackedcredentials;
    (void)pcbpackedcredentials;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredPackAuthenticationBufferW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pszusername, jlong pszpassword, jlong ppackedcredentials, jlong pcbpackedcredentials) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredPackAuthenticationBufferW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszpassword, (void*)(uintptr_t)ppackedcredentials, (void*)(uintptr_t)pcbpackedcredentials) : -1;
#else
    (void)dwflags;
    (void)pszusername;
    (void)pszpassword;
    (void)ppackedcredentials;
    (void)pcbpackedcredentials;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredProtectA(JNIEnv* km_env, jclass km_clazz, jint fasself, jlong pszcredentials, jint cchcredentials, jlong pszprotectedcredentials, jlong pcchmaxchars, jlong protectiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredProtectA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fasself, (void*)(uintptr_t)pszcredentials, (uint32_t)cchcredentials, (void*)(uintptr_t)pszprotectedcredentials, (void*)(uintptr_t)pcchmaxchars, (void*)(uintptr_t)protectiontype) : -1;
#else
    (void)fasself;
    (void)pszcredentials;
    (void)cchcredentials;
    (void)pszprotectedcredentials;
    (void)pcchmaxchars;
    (void)protectiontype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredProtectW(JNIEnv* km_env, jclass km_clazz, jint fasself, jlong pszcredentials, jint cchcredentials, jlong pszprotectedcredentials, jlong pcchmaxchars, jlong protectiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredProtectW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fasself, (void*)(uintptr_t)pszcredentials, (uint32_t)cchcredentials, (void*)(uintptr_t)pszprotectedcredentials, (void*)(uintptr_t)pcchmaxchars, (void*)(uintptr_t)protectiontype) : -1;
#else
    (void)fasself;
    (void)pszcredentials;
    (void)cchcredentials;
    (void)pszprotectedcredentials;
    (void)pcchmaxchars;
    (void)protectiontype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredReadA(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags, (void*)(uintptr_t)credential) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredReadDomainCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong targetinfo, jint flags, jlong count, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadDomainCredentialsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetinfo, (uint32_t)flags, (void*)(uintptr_t)count, (void*)(uintptr_t)credential) : -1;
#else
    (void)targetinfo;
    (void)flags;
    (void)count;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredReadDomainCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong targetinfo, jint flags, jlong count, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadDomainCredentialsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetinfo, (uint32_t)flags, (void*)(uintptr_t)count, (void*)(uintptr_t)credential) : -1;
#else
    (void)targetinfo;
    (void)flags;
    (void)count;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredReadW(JNIEnv* km_env, jclass km_clazz, jlong targetname, jint type, jint flags, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredReadW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetname, (uint32_t)type, (uint32_t)flags, (void*)(uintptr_t)credential) : -1;
#else
    (void)targetname;
    (void)type;
    (void)flags;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredRenameA(JNIEnv* km_env, jclass km_clazz, jlong oldtargetname, jlong newtargetname, jint type, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredRenameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oldtargetname, (void*)(uintptr_t)newtargetname, (uint32_t)type, (uint32_t)flags) : -1;
#else
    (void)oldtargetname;
    (void)newtargetname;
    (void)type;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredRenameW(JNIEnv* km_env, jclass km_clazz, jlong oldtargetname, jlong newtargetname, jint type, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredRenameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oldtargetname, (void*)(uintptr_t)newtargetname, (uint32_t)type, (uint32_t)flags) : -1;
#else
    (void)oldtargetname;
    (void)newtargetname;
    (void)type;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUICmdLinePromptForCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong pcontext, jint dwautherror, jlong username, jint uluserbuffersize, jlong pszpassword, jint ulpasswordbuffersize, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUICmdLinePromptForCredentialsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcontext, (uint32_t)dwautherror, (void*)(uintptr_t)username, (uint32_t)uluserbuffersize, (void*)(uintptr_t)pszpassword, (uint32_t)ulpasswordbuffersize, (void*)(uintptr_t)pfsave, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUICmdLinePromptForCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong pcontext, jint dwautherror, jlong username, jint uluserbuffersize, jlong pszpassword, jint ulpasswordbuffersize, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUICmdLinePromptForCredentialsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcontext, (uint32_t)dwautherror, (void*)(uintptr_t)username, (uint32_t)uluserbuffersize, (void*)(uintptr_t)pszpassword, (uint32_t)ulpasswordbuffersize, (void*)(uintptr_t)pfsave, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIConfirmCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jint bconfirm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIConfirmCredentialsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargetname, (int32_t)bconfirm) : 0;
#else
    (void)psztargetname;
    (void)bconfirm;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIConfirmCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jint bconfirm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIConfirmCredentialsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargetname, (int32_t)bconfirm) : 0;
#else
    (void)psztargetname;
    (void)bconfirm;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIParseUserNameA(JNIEnv* km_env, jclass km_clazz, jlong username, jlong user, jint userbuffersize, jlong domain, jint domainbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIParseUserNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)username, (void*)(uintptr_t)user, (uint32_t)userbuffersize, (void*)(uintptr_t)domain, (uint32_t)domainbuffersize) : 0;
#else
    (void)username;
    (void)user;
    (void)userbuffersize;
    (void)domain;
    (void)domainbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIParseUserNameW(JNIEnv* km_env, jclass km_clazz, jlong username, jlong user, jint userbuffersize, jlong domain, jint domainbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIParseUserNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)username, (void*)(uintptr_t)user, (uint32_t)userbuffersize, (void*)(uintptr_t)domain, (uint32_t)domainbuffersize) : 0;
#else
    (void)username;
    (void)user;
    (void)userbuffersize;
    (void)domain;
    (void)domainbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIPromptForCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong puiinfo, jlong psztargetname, jlong pcontext, jint dwautherror, jlong pszusername, jint ulusernamebuffersize, jlong pszpassword, jint ulpasswordbuffersize, jlong save, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForCredentialsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puiinfo, (void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcontext, (uint32_t)dwautherror, (void*)(uintptr_t)pszusername, (uint32_t)ulusernamebuffersize, (void*)(uintptr_t)pszpassword, (uint32_t)ulpasswordbuffersize, (void*)(uintptr_t)save, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIPromptForCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong puiinfo, jlong psztargetname, jlong pcontext, jint dwautherror, jlong pszusername, jint ulusernamebuffersize, jlong pszpassword, jint ulpasswordbuffersize, jlong save, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForCredentialsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puiinfo, (void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcontext, (uint32_t)dwautherror, (void*)(uintptr_t)pszusername, (uint32_t)ulusernamebuffersize, (void*)(uintptr_t)pszpassword, (uint32_t)ulpasswordbuffersize, (void*)(uintptr_t)save, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIPromptForWindowsCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong puiinfo, jint dwautherror, jlong pulauthpackage, jlong pvinauthbuffer, jint ulinauthbuffersize, jlong ppvoutauthbuffer, jlong puloutauthbuffersize, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForWindowsCredentialsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puiinfo, (uint32_t)dwautherror, (void*)(uintptr_t)pulauthpackage, (void*)(uintptr_t)pvinauthbuffer, (uint32_t)ulinauthbuffersize, (void*)(uintptr_t)ppvoutauthbuffer, (void*)(uintptr_t)puloutauthbuffersize, (void*)(uintptr_t)pfsave, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIPromptForWindowsCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong puiinfo, jint dwautherror, jlong pulauthpackage, jlong pvinauthbuffer, jint ulinauthbuffersize, jlong ppvoutauthbuffer, jlong puloutauthbuffersize, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIPromptForWindowsCredentialsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)puiinfo, (uint32_t)dwautherror, (void*)(uintptr_t)pulauthpackage, (void*)(uintptr_t)pvinauthbuffer, (uint32_t)ulinauthbuffersize, (void*)(uintptr_t)ppvoutauthbuffer, (void*)(uintptr_t)puloutauthbuffersize, (void*)(uintptr_t)pfsave, (uint32_t)dwflags) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIReadSSOCredW(JNIEnv* km_env, jclass km_clazz, jlong pszrealm, jlong ppszusername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIReadSSOCredW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszrealm, (void*)(uintptr_t)ppszusername) : 0;
#else
    (void)pszrealm;
    (void)ppszusername;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUIStoreSSOCredW(JNIEnv* km_env, jclass km_clazz, jlong pszrealm, jlong pszusername, jlong pszpassword, jint bpersist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUIStoreSSOCredW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszrealm, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszpassword, (int32_t)bpersist) : 0;
#else
    (void)pszrealm;
    (void)pszusername;
    (void)pszpassword;
    (void)bpersist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUnPackAuthenticationBufferA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pauthbuffer, jint cbauthbuffer, jlong pszusername, jlong pcchlmaxusername, jlong pszdomainname, jlong pcchmaxdomainname, jlong pszpassword, jlong pcchmaxpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnPackAuthenticationBufferA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pauthbuffer, (uint32_t)cbauthbuffer, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pcchlmaxusername, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pcchmaxdomainname, (void*)(uintptr_t)pszpassword, (void*)(uintptr_t)pcchmaxpassword) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUnPackAuthenticationBufferW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pauthbuffer, jint cbauthbuffer, jlong pszusername, jlong pcchmaxusername, jlong pszdomainname, jlong pcchmaxdomainname, jlong pszpassword, jlong pcchmaxpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnPackAuthenticationBufferW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pauthbuffer, (uint32_t)cbauthbuffer, (void*)(uintptr_t)pszusername, (void*)(uintptr_t)pcchmaxusername, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pcchmaxdomainname, (void*)(uintptr_t)pszpassword, (void*)(uintptr_t)pcchmaxpassword) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUnmarshalCredentialA(JNIEnv* km_env, jclass km_clazz, jlong marshaledcredential, jlong credtype, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnmarshalCredentialA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)marshaledcredential, (void*)(uintptr_t)credtype, (void*)(uintptr_t)credential) : -1;
#else
    (void)marshaledcredential;
    (void)credtype;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUnmarshalCredentialW(JNIEnv* km_env, jclass km_clazz, jlong marshaledcredential, jlong credtype, jlong credential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnmarshalCredentialW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)marshaledcredential, (void*)(uintptr_t)credtype, (void*)(uintptr_t)credential) : -1;
#else
    (void)marshaledcredential;
    (void)credtype;
    (void)credential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUnprotectA(JNIEnv* km_env, jclass km_clazz, jint fasself, jlong pszprotectedcredentials, jint cchprotectedcredentials, jlong pszcredentials, jlong pcchmaxchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnprotectA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fasself, (void*)(uintptr_t)pszprotectedcredentials, (uint32_t)cchprotectedcredentials, (void*)(uintptr_t)pszcredentials, (void*)(uintptr_t)pcchmaxchars) : -1;
#else
    (void)fasself;
    (void)pszprotectedcredentials;
    (void)cchprotectedcredentials;
    (void)pszcredentials;
    (void)pcchmaxchars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredUnprotectW(JNIEnv* km_env, jclass km_clazz, jint fasself, jlong pszprotectedcredentials, jint cchprotectedcredentials, jlong pszcredentials, jlong pcchmaxchars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnprotectW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fasself, (void*)(uintptr_t)pszprotectedcredentials, (uint32_t)cchprotectedcredentials, (void*)(uintptr_t)pszcredentials, (void*)(uintptr_t)pcchmaxchars) : -1;
#else
    (void)fasself;
    (void)pszprotectedcredentials;
    (void)cchprotectedcredentials;
    (void)pszcredentials;
    (void)pcchmaxchars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredWriteA(JNIEnv* km_env, jclass km_clazz, jlong credential, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)credential, (uint32_t)flags) : -1;
#else
    (void)credential;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredWriteDomainCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong targetinfo, jlong credential, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteDomainCredentialsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetinfo, (void*)(uintptr_t)credential, (uint32_t)flags) : -1;
#else
    (void)targetinfo;
    (void)credential;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredWriteDomainCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong targetinfo, jlong credential, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteDomainCredentialsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetinfo, (void*)(uintptr_t)credential, (uint32_t)flags) : -1;
#else
    (void)targetinfo;
    (void)credential;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1CredWriteW(JNIEnv* km_env, jclass km_clazz, jlong credential, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredWriteW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)credential, (uint32_t)flags) : -1;
#else
    (void)credential;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1GetOpenCardNameA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenCardNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1GetOpenCardNameW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetOpenCardNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1KeyCredentialManagerFreeInformation(JNIEnv* km_env, jclass km_clazz, jlong keycredentialmanagerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerFreeInformation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)keycredentialmanagerinfo);
#else
    (void)keycredentialmanagerinfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1KeyCredentialManagerGetInformation(JNIEnv* km_env, jclass km_clazz, jlong keycredentialmanagerinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerGetInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)keycredentialmanagerinfo) : -1;
#else
    (void)keycredentialmanagerinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1KeyCredentialManagerGetOperationErrorStates(JNIEnv* km_env, jclass km_clazz, jint keycredentialmanageroperationtype, jlong isready, jlong keycredentialmanageroperationerrorstates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerGetOperationErrorStates");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)keycredentialmanageroperationtype, (void*)(uintptr_t)isready, (void*)(uintptr_t)keycredentialmanageroperationerrorstates) : -1;
#else
    (void)keycredentialmanageroperationtype;
    (void)isready;
    (void)keycredentialmanageroperationerrorstates;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1KeyCredentialManagerShowUIOperation(JNIEnv* km_env, jclass km_clazz, jlong hwndowner, jint keycredentialmanageroperationtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("keycredmgr.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeyCredentialManagerShowUIOperation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndowner, (int32_t)keycredentialmanageroperationtype) : -1;
#else
    (void)hwndowner;
    (void)keycredentialmanageroperationtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardAccessStartedEvent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAccessStartedEvent");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardAddReaderToGroupA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAddReaderToGroupA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szgroupname) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardAddReaderToGroupW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAddReaderToGroupW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szgroupname) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardAudit(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jint dwevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardAudit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (uint32_t)dwevent) : -1;
#else
    (void)hcontext;
    (void)dwevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardBeginTransaction(JNIEnv* km_env, jclass km_clazz, jlong hcard) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardBeginTransaction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard) : -1;
#else
    (void)hcard;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardCancel(JNIEnv* km_env, jclass km_clazz, jlong hcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardCancel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext) : -1;
#else
    (void)hcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardConnectA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreader, jint dwsharemode, jint dwpreferredprotocols, jlong phcard, jlong pdwactiveprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardConnectA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreader, (uint32_t)dwsharemode, (uint32_t)dwpreferredprotocols, (void*)(uintptr_t)phcard, (void*)(uintptr_t)pdwactiveprotocol) : -1;
#else
    (void)hcontext;
    (void)szreader;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)phcard;
    (void)pdwactiveprotocol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardConnectW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreader, jint dwsharemode, jint dwpreferredprotocols, jlong phcard, jlong pdwactiveprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardConnectW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreader, (uint32_t)dwsharemode, (uint32_t)dwpreferredprotocols, (void*)(uintptr_t)phcard, (void*)(uintptr_t)pdwactiveprotocol) : -1;
#else
    (void)hcontext;
    (void)szreader;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)phcard;
    (void)pdwactiveprotocol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardControl(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwcontrolcode, jlong lpinbuffer, jint cbinbuffersize, jlong lpoutbuffer, jint cboutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)cboutbuffersize, (void*)(uintptr_t)lpbytesreturned) : -1;
#else
    (void)hcard;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardDisconnect(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwdisposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardDisconnect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (uint32_t)dwdisposition) : -1;
#else
    (void)hcard;
    (void)dwdisposition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardDlgExtendedError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardDlgExtendedError");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardEndTransaction(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwdisposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardEndTransaction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (uint32_t)dwdisposition) : -1;
#else
    (void)hcard;
    (void)dwdisposition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardEstablishContext(JNIEnv* km_env, jclass km_clazz, jint dwscope, jlong pvreserved1, jlong pvreserved2, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardEstablishContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwscope, (void*)(uintptr_t)pvreserved1, (void*)(uintptr_t)pvreserved2, (void*)(uintptr_t)phcontext) : -1;
#else
    (void)dwscope;
    (void)pvreserved1;
    (void)pvreserved2;
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardForgetCardTypeA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetCardTypeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardForgetCardTypeW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetCardTypeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardForgetReaderA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardForgetReaderGroupA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderGroupA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szgroupname) : -1;
#else
    (void)hcontext;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardForgetReaderGroupW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderGroupW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szgroupname) : -1;
#else
    (void)hcontext;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardForgetReaderW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardForgetReaderW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong pvmem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardFreeMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)pvmem) : -1;
#else
    (void)hcontext;
    (void)pvmem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetAttrib(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwattrid, jlong pbattr, jlong pcbattrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetAttrib");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (uint32_t)dwattrid, (void*)(uintptr_t)pbattr, (void*)(uintptr_t)pcbattrlen) : -1;
#else
    (void)hcard;
    (void)dwattrid;
    (void)pbattr;
    (void)pcbattrlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetCardTypeProviderNameA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jint dwproviderid, jlong szprovider, jlong pcchprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetCardTypeProviderNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (uint32_t)dwproviderid, (void*)(uintptr_t)szprovider, (void*)(uintptr_t)pcchprovider) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    (void)pcchprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetCardTypeProviderNameW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jint dwproviderid, jlong szprovider, jlong pcchprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetCardTypeProviderNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (uint32_t)dwproviderid, (void*)(uintptr_t)szprovider, (void*)(uintptr_t)pcchprovider) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    (void)pcchprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetDeviceTypeIdA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong pdwdevicetypeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetDeviceTypeIdA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)pdwdevicetypeid) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pdwdevicetypeid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetDeviceTypeIdW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong pdwdevicetypeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetDeviceTypeIdW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)pdwdevicetypeid) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pdwdevicetypeid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetProviderIdA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcard, jlong pguidproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetProviderIdA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcard, (void*)(uintptr_t)pguidproviderid) : -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetProviderIdW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcard, jlong pguidproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetProviderIdW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcard, (void*)(uintptr_t)pguidproviderid) : -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetReaderDeviceInstanceIdA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szdeviceinstanceid, jlong pcchdeviceinstanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderDeviceInstanceIdA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szdeviceinstanceid, (void*)(uintptr_t)pcchdeviceinstanceid) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdeviceinstanceid;
    (void)pcchdeviceinstanceid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetReaderDeviceInstanceIdW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szdeviceinstanceid, jlong pcchdeviceinstanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderDeviceInstanceIdW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szdeviceinstanceid, (void*)(uintptr_t)pcchdeviceinstanceid) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdeviceinstanceid;
    (void)pcchdeviceinstanceid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetReaderIconA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong pbicon, jlong pcbicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderIconA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)pbicon, (void*)(uintptr_t)pcbicon) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pbicon;
    (void)pcbicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetReaderIconW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong pbicon, jlong pcbicon) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetReaderIconW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)pbicon, (void*)(uintptr_t)pcbicon) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)pbicon;
    (void)pcbicon;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetStatusChangeA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jint dwtimeout, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetStatusChangeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (uint32_t)dwtimeout, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders) : -1;
#else
    (void)hcontext;
    (void)dwtimeout;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetStatusChangeW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jint dwtimeout, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetStatusChangeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (uint32_t)dwtimeout, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders) : -1;
#else
    (void)hcontext;
    (void)dwtimeout;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardGetTransmitCount(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong pctransmitcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardGetTransmitCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)pctransmitcount) : -1;
#else
    (void)hcard;
    (void)pctransmitcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardIntroduceCardTypeA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jlong pguidprimaryprovider, jlong rgguidinterfaces, jint dwinterfacecount, jlong pbatr, jlong pbatrmask, jint cbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceCardTypeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (void*)(uintptr_t)pguidprimaryprovider, (void*)(uintptr_t)rgguidinterfaces, (uint32_t)dwinterfacecount, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pbatrmask, (uint32_t)cbatrlen) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)pguidprimaryprovider;
    (void)rgguidinterfaces;
    (void)dwinterfacecount;
    (void)pbatr;
    (void)pbatrmask;
    (void)cbatrlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardIntroduceCardTypeW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jlong pguidprimaryprovider, jlong rgguidinterfaces, jint dwinterfacecount, jlong pbatr, jlong pbatrmask, jint cbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceCardTypeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (void*)(uintptr_t)pguidprimaryprovider, (void*)(uintptr_t)rgguidinterfaces, (uint32_t)dwinterfacecount, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pbatrmask, (uint32_t)cbatrlen) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)pguidprimaryprovider;
    (void)rgguidinterfaces;
    (void)dwinterfacecount;
    (void)pbatr;
    (void)pbatrmask;
    (void)cbatrlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardIntroduceReaderA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szdevicename) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdevicename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardIntroduceReaderGroupA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderGroupA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szgroupname) : -1;
#else
    (void)hcontext;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardIntroduceReaderGroupW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderGroupW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szgroupname) : -1;
#else
    (void)hcontext;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardIntroduceReaderW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szdevicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIntroduceReaderW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szdevicename) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szdevicename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardIsValidContext(JNIEnv* km_env, jclass km_clazz, jlong hcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardIsValidContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext) : -1;
#else
    (void)hcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListCardsA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong pbatr, jlong rgquidinterfaces, jint cguidinterfacecount, jlong mszcards, jlong pcchcards) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListCardsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)rgquidinterfaces, (uint32_t)cguidinterfacecount, (void*)(uintptr_t)mszcards, (void*)(uintptr_t)pcchcards) : -1;
#else
    (void)hcontext;
    (void)pbatr;
    (void)rgquidinterfaces;
    (void)cguidinterfacecount;
    (void)mszcards;
    (void)pcchcards;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListCardsW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong pbatr, jlong rgquidinterfaces, jint cguidinterfacecount, jlong mszcards, jlong pcchcards) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListCardsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)rgquidinterfaces, (uint32_t)cguidinterfacecount, (void*)(uintptr_t)mszcards, (void*)(uintptr_t)pcchcards) : -1;
#else
    (void)hcontext;
    (void)pbatr;
    (void)rgquidinterfaces;
    (void)cguidinterfacecount;
    (void)mszcards;
    (void)pcchcards;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListInterfacesA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcard, jlong pguidinterfaces, jlong pcguidinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListInterfacesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcard, (void*)(uintptr_t)pguidinterfaces, (void*)(uintptr_t)pcguidinterfaces) : -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidinterfaces;
    (void)pcguidinterfaces;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListInterfacesW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcard, jlong pguidinterfaces, jlong pcguidinterfaces) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListInterfacesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcard, (void*)(uintptr_t)pguidinterfaces, (void*)(uintptr_t)pcguidinterfaces) : -1;
#else
    (void)hcontext;
    (void)szcard;
    (void)pguidinterfaces;
    (void)pcguidinterfaces;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListReaderGroupsA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszgroups, jlong pcchgroups) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReaderGroupsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszgroups, (void*)(uintptr_t)pcchgroups) : -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)pcchgroups;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListReaderGroupsW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszgroups, jlong pcchgroups) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReaderGroupsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszgroups, (void*)(uintptr_t)pcchgroups) : -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)pcchgroups;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListReadersA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszgroups, jlong mszreaders, jlong pcchreaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszgroups, (void*)(uintptr_t)mszreaders, (void*)(uintptr_t)pcchreaders) : -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)mszreaders;
    (void)pcchreaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListReadersW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszgroups, jlong mszreaders, jlong pcchreaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszgroups, (void*)(uintptr_t)mszreaders, (void*)(uintptr_t)pcchreaders) : -1;
#else
    (void)hcontext;
    (void)mszgroups;
    (void)mszreaders;
    (void)pcchreaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListReadersWithDeviceInstanceIdA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szdeviceinstanceid, jlong mszreaders, jlong pcchreaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersWithDeviceInstanceIdA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szdeviceinstanceid, (void*)(uintptr_t)mszreaders, (void*)(uintptr_t)pcchreaders) : -1;
#else
    (void)hcontext;
    (void)szdeviceinstanceid;
    (void)mszreaders;
    (void)pcchreaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardListReadersWithDeviceInstanceIdW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szdeviceinstanceid, jlong mszreaders, jlong pcchreaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardListReadersWithDeviceInstanceIdW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szdeviceinstanceid, (void*)(uintptr_t)mszreaders, (void*)(uintptr_t)pcchreaders) : -1;
#else
    (void)hcontext;
    (void)szdeviceinstanceid;
    (void)mszreaders;
    (void)pcchreaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardLocateCardsA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszcards, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszcards, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders) : -1;
#else
    (void)hcontext;
    (void)mszcards;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardLocateCardsByATRA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong rgatrmasks, jint catrs, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsByATRA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)rgatrmasks, (uint32_t)catrs, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders) : -1;
#else
    (void)hcontext;
    (void)rgatrmasks;
    (void)catrs;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardLocateCardsByATRW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong rgatrmasks, jint catrs, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsByATRW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)rgatrmasks, (uint32_t)catrs, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders) : -1;
#else
    (void)hcontext;
    (void)rgatrmasks;
    (void)catrs;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardLocateCardsW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong mszcards, jlong rgreaderstates, jint creaders) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardLocateCardsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)mszcards, (void*)(uintptr_t)rgreaderstates, (uint32_t)creaders) : -1;
#else
    (void)hcontext;
    (void)mszcards;
    (void)rgreaderstates;
    (void)creaders;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardReadCacheA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong cardidentifier, jint freshnesscounter, jlong lookupname, jlong data, jlong datalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReadCacheA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)cardidentifier, (uint32_t)freshnesscounter, (void*)(uintptr_t)lookupname, (void*)(uintptr_t)data, (void*)(uintptr_t)datalen) : -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardReadCacheW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong cardidentifier, jint freshnesscounter, jlong lookupname, jlong data, jlong datalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReadCacheW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)cardidentifier, (uint32_t)freshnesscounter, (void*)(uintptr_t)lookupname, (void*)(uintptr_t)data, (void*)(uintptr_t)datalen) : -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardReconnect(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwsharemode, jint dwpreferredprotocols, jint dwinitialization, jlong pdwactiveprotocol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReconnect");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (uint32_t)dwsharemode, (uint32_t)dwpreferredprotocols, (uint32_t)dwinitialization, (void*)(uintptr_t)pdwactiveprotocol) : -1;
#else
    (void)hcard;
    (void)dwsharemode;
    (void)dwpreferredprotocols;
    (void)dwinitialization;
    (void)pdwactiveprotocol;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardReleaseContext(JNIEnv* km_env, jclass km_clazz, jlong hcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReleaseContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext) : -1;
#else
    (void)hcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardReleaseStartedEvent(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardReleaseStartedEvent");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardRemoveReaderFromGroupA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardRemoveReaderFromGroupA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szgroupname) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardRemoveReaderFromGroupW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szreadername, jlong szgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardRemoveReaderFromGroupW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szreadername, (void*)(uintptr_t)szgroupname) : -1;
#else
    (void)hcontext;
    (void)szreadername;
    (void)szgroupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardSetAttrib(JNIEnv* km_env, jclass km_clazz, jlong hcard, jint dwattrid, jlong pbattr, jint cbattrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardSetAttrib");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (uint32_t)dwattrid, (void*)(uintptr_t)pbattr, (uint32_t)cbattrlen) : -1;
#else
    (void)hcard;
    (void)dwattrid;
    (void)pbattr;
    (void)cbattrlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardSetCardTypeProviderNameA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jint dwproviderid, jlong szprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardSetCardTypeProviderNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (uint32_t)dwproviderid, (void*)(uintptr_t)szprovider) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardSetCardTypeProviderNameW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong szcardname, jint dwproviderid, jlong szprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardSetCardTypeProviderNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)szcardname, (uint32_t)dwproviderid, (void*)(uintptr_t)szprovider) : -1;
#else
    (void)hcontext;
    (void)szcardname;
    (void)dwproviderid;
    (void)szprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardState(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong pdwstate, jlong pdwprotocol, jlong pbatr, jlong pcbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)pdwstate, (void*)(uintptr_t)pdwprotocol, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pcbatrlen) : -1;
#else
    (void)hcard;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardStatusA(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong mszreadernames, jlong pcchreaderlen, jlong pdwstate, jlong pdwprotocol, jlong pbatr, jlong pcbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardStatusA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)mszreadernames, (void*)(uintptr_t)pcchreaderlen, (void*)(uintptr_t)pdwstate, (void*)(uintptr_t)pdwprotocol, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pcbatrlen) : -1;
#else
    (void)hcard;
    (void)mszreadernames;
    (void)pcchreaderlen;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardStatusW(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong mszreadernames, jlong pcchreaderlen, jlong pdwstate, jlong pdwprotocol, jlong pbatr, jlong pcbatrlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardStatusW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)mszreadernames, (void*)(uintptr_t)pcchreaderlen, (void*)(uintptr_t)pdwstate, (void*)(uintptr_t)pdwprotocol, (void*)(uintptr_t)pbatr, (void*)(uintptr_t)pcbatrlen) : -1;
#else
    (void)hcard;
    (void)mszreadernames;
    (void)pcchreaderlen;
    (void)pdwstate;
    (void)pdwprotocol;
    (void)pbatr;
    (void)pcbatrlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardTransmit(JNIEnv* km_env, jclass km_clazz, jlong hcard, jlong piosendpci, jlong pbsendbuffer, jint cbsendlength, jlong piorecvpci, jlong pbrecvbuffer, jlong pcbrecvlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardTransmit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcard, (void*)(uintptr_t)piosendpci, (void*)(uintptr_t)pbsendbuffer, (uint32_t)cbsendlength, (void*)(uintptr_t)piorecvpci, (void*)(uintptr_t)pbrecvbuffer, (void*)(uintptr_t)pcbrecvlength) : -1;
#else
    (void)hcard;
    (void)piosendpci;
    (void)pbsendbuffer;
    (void)cbsendlength;
    (void)piorecvpci;
    (void)pbrecvbuffer;
    (void)pcbrecvlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardUIDlgSelectCardA(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardUIDlgSelectCardA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardUIDlgSelectCardW(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("scarddlg.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardUIDlgSelectCardW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardWriteCacheA(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong cardidentifier, jint freshnesscounter, jlong lookupname, jlong data, jint datalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardWriteCacheA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)cardidentifier, (uint32_t)freshnesscounter, (void*)(uintptr_t)lookupname, (void*)(uintptr_t)data, (uint32_t)datalen) : -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_credentials_WindowsWin32SecurityCredentialsJniBridge_windowssys_1windows_1win32_1security_1credentials_1SCardWriteCacheW(JNIEnv* km_env, jclass km_clazz, jlong hcontext, jlong cardidentifier, jint freshnesscounter, jlong lookupname, jlong data, jint datalen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("winscard.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SCardWriteCacheW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hcontext, (void*)(uintptr_t)cardidentifier, (uint32_t)freshnesscounter, (void*)(uintptr_t)lookupname, (void*)(uintptr_t)data, (uint32_t)datalen) : -1;
#else
    (void)hcontext;
    (void)cardidentifier;
    (void)freshnesscounter;
    (void)lookupname;
    (void)data;
    (void)datalen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

