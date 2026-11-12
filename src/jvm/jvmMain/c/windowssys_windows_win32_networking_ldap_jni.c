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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetLastError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapGetLastError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapMapErrorToWin32(JNIEnv* km_env, jclass km_clazz, jint ldaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapMapErrorToWin32");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ldaperror);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ldaperror;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapUTF8ToUnicode(JNIEnv* km_env, jclass km_clazz, jlong lpsrcstr, jint cchsrc, jlong lpdeststr, jint cchdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapUTF8ToUnicode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsrcstr, (int32_t)cchsrc, (void*)(uintptr_t)lpdeststr, (int32_t)cchdest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapUnicodeToUTF8(JNIEnv* km_env, jclass km_clazz, jlong lpsrcstr, jint cchsrc, jlong lpdeststr, jint cchdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapUnicodeToUTF8");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsrcstr, (int32_t)cchsrc, (void*)(uintptr_t)lpdeststr, (int32_t)cchdest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerAllocT(JNIEnv* km_env, jclass km_clazz, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_alloc_t");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)options);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)options;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerBvdup(JNIEnv* km_env, jclass km_clazz, jlong pberval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_bvdup");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pberval);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pberval;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerBvecfree(JNIEnv* km_env, jclass km_clazz, jlong pberval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_bvecfree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pberval);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pberval;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerBvfree(JNIEnv* km_env, jclass km_clazz, jlong bv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_bvfree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bv);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bv;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerFirstElement(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong plen, jlong ppopaque) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_first_element");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)plen, (void*)(uintptr_t)ppopaque);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pberelement;
    (void)plen;
    (void)ppopaque;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerFlatten(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong pberval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_flatten");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)pberval);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pberelement;
    (void)pberval;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerFree(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jint fbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_free");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pberelement, (int32_t)fbuf);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pberelement;
    (void)fbuf;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerInit(JNIEnv* km_env, jclass km_clazz, jlong pberval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_init");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pberval);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pberval;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerNextElement(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong plen, jlong opaque) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_next_element");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)plen, (void*)(uintptr_t)opaque);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pberelement;
    (void)plen;
    (void)opaque;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerPeekTag(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong plen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_peek_tag");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)plen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pberelement;
    (void)plen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerPrintf(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong fmt, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_printf");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)pberelement;
    (void)fmt;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerScanf(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong fmt, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (*km_fn_t)(void*, void*, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_scanf");
    }
    uint32_t km_res = 0;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)fmt, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)pberelement;
    (void)fmt;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapBerSkipTag(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong plen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_skip_tag");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)plen);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pberelement;
    (void)plen;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapCldapOpen(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "cldap_open");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapCldapOpenA(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "cldap_openA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapCldapOpenW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "cldap_openW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAbandon(JNIEnv* km_env, jclass km_clazz, jlong ld, jint msgid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_abandon");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (uint32_t)msgid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)msgid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAdd(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_addA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_addW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddExt(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddExtA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_extA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddExtW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_extW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddExtS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddExtSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddExtSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapAddSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapBind(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapBindA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bindA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapBindW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bindW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapBindS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapBindSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapBindSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCheckFilterA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong searchfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_check_filterA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)searchfilter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)searchfilter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCheckFilterW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong searchfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_check_filterW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)searchfilter);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)searchfilter;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCleanup(JNIEnv* km_env, jclass km_clazz, jlong hinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_cleanup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hinstance);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hinstance;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCloseExtendedOp(JNIEnv* km_env, jclass km_clazz, jlong ld, jint messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_close_extended_op");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (uint32_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompare(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compareA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compareW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareExt(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareExtA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_extA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareExtW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_extW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareExtS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareExtSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareExtSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCompareSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapConnFromMsg(JNIEnv* km_env, jclass km_clazz, jlong primaryconn, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_conn_from_msg");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)primaryconn, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)primaryconn;
    (void)res;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapConnect(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_connect");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)timeout;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapControlFree(JNIEnv* km_env, jclass km_clazz, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_control_free");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)control;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapControlFreeA(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_control_freeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)controls);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)controls;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapControlFreeW(JNIEnv* km_env, jclass km_clazz, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_control_freeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)control;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapControlsFree(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_controls_free");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)controls);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)controls;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapControlsFreeA(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_controls_freeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)controls);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)controls;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapControlsFreeW(JNIEnv* km_env, jclass km_clazz, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_controls_freeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)control;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCountEntries(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_entries");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCountReferences(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_references");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCountValues(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_values");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCountValuesA(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_valuesA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCountValuesW(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_valuesW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCountValuesLen(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_values_len");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCreatePageControl(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jint pagesize, jlong cookie, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_page_control");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (uint32_t)pagesize, (void*)(uintptr_t)cookie, (uint8_t)iscritical, (void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)pagesize;
    (void)cookie;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCreatePageControlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jint pagesize, jlong cookie, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_page_controlA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (uint32_t)pagesize, (void*)(uintptr_t)cookie, (uint8_t)iscritical, (void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)pagesize;
    (void)cookie;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCreatePageControlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jint pagesize, jlong cookie, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_page_controlW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (uint32_t)pagesize, (void*)(uintptr_t)cookie, (uint8_t)iscritical, (void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)pagesize;
    (void)cookie;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCreateSortControl(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_sort_control");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (uint8_t)iscritical, (void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCreateSortControlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_sort_controlA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (uint8_t)iscritical, (void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCreateSortControlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_sort_controlW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (uint8_t)iscritical, (void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong vlvinfo, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_vlv_controlA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)vlvinfo, (uint8_t)iscritical, (void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)vlvinfo;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapCreateVlvControlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong vlvinfo, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_vlv_controlW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)vlvinfo, (uint8_t)iscritical, (void*)(uintptr_t)control);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)vlvinfo;
    (void)iscritical;
    (void)control;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDelete(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_deleteA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_deleteW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteExt(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteExtA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_extA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteExtW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_extW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteExtS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteExtSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteExtSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDeleteSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDn2ufn(JNIEnv* km_env, jclass km_clazz, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_dn2ufn");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dn);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dn;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDn2ufnA(JNIEnv* km_env, jclass km_clazz, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_dn2ufnA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dn);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dn;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapDn2ufnW(JNIEnv* km_env, jclass km_clazz, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_dn2ufnW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dn);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dn;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jlong control, jboolean criticality) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_encode_sort_controlA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (void*)(uintptr_t)control, (bool)criticality);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)control;
    (void)criticality;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapEncodeSortControlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jlong control, jboolean criticality) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_encode_sort_controlW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (void*)(uintptr_t)control, (bool)criticality);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)control;
    (void)criticality;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapErr2string(JNIEnv* km_env, jclass km_clazz, jint err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_err2string");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)err);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)err;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapErr2stringA(JNIEnv* km_env, jclass km_clazz, jint err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_err2stringA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)err);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)err;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapErr2stringW(JNIEnv* km_env, jclass km_clazz, jint err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_err2stringW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)err);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)err;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElement(JNIEnv* km_env, jclass km_clazz, jlong sourcefilterelement, jint sourcelength, jlong destfilterelement, jint destlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_escape_filter_element");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefilterelement, (uint32_t)sourcelength, (void*)(uintptr_t)destfilterelement, (uint32_t)destlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sourcefilterelement;
    (void)sourcelength;
    (void)destfilterelement;
    (void)destlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementA(JNIEnv* km_env, jclass km_clazz, jlong sourcefilterelement, jint sourcelength, jlong destfilterelement, jint destlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_escape_filter_elementA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefilterelement, (uint32_t)sourcelength, (void*)(uintptr_t)destfilterelement, (uint32_t)destlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sourcefilterelement;
    (void)sourcelength;
    (void)destfilterelement;
    (void)destlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapEscapeFilterElementW(JNIEnv* km_env, jclass km_clazz, jlong sourcefilterelement, jint sourcelength, jlong destfilterelement, jint destlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_escape_filter_elementW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefilterelement, (uint32_t)sourcelength, (void*)(uintptr_t)destfilterelement, (uint32_t)destlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sourcefilterelement;
    (void)sourcelength;
    (void)destfilterelement;
    (void)destlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapExplodeDn(JNIEnv* km_env, jclass km_clazz, jlong dn, jint notypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_explode_dn");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dn, (uint32_t)notypes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dn;
    (void)notypes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapExplodeDnA(JNIEnv* km_env, jclass km_clazz, jlong dn, jint notypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_explode_dnA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dn, (uint32_t)notypes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dn;
    (void)notypes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapExplodeDnW(JNIEnv* km_env, jclass km_clazz, jlong dn, jint notypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_explode_dnW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dn, (uint32_t)notypes);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dn;
    (void)notypes;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapExtendedOperation(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapExtendedOperationA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operationA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapExtendedOperationW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operationW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong returnedoid, jlong returneddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operation_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)returnedoid, (void*)(uintptr_t)returneddata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)returnedoid;
    (void)returneddata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapExtendedOperationSW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong returnedoid, jlong returneddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operation_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)returnedoid, (void*)(uintptr_t)returneddata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)returnedoid;
    (void)returneddata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapFirstAttribute(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_attribute");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapFirstAttributeA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_attributeA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapFirstAttributeW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_attributeW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapFirstEntry(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_entry");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)res;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapFirstReference(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_reference");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)res;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapFreeControls(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_free_controls");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)controls);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)controls;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapFreeControlsA(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_free_controlsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)controls);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)controls;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapFreeControlsW(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_free_controlsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)controls);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)controls;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetDn(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_dn");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetDnA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_dnA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetDnW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_dnW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetNextPage(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong searchhandle, jint pagesize, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_next_page");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (int64_t)searchhandle, (uint32_t)pagesize, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)searchhandle;
    (void)pagesize;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetNextPageS(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong searchhandle, jlong timeout, jint pagesize, jlong totalcount, jlong results) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_next_page_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (int64_t)searchhandle, (void*)(uintptr_t)timeout, (uint32_t)pagesize, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)results);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)searchhandle;
    (void)timeout;
    (void)pagesize;
    (void)totalcount;
    (void)results;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetOption(JNIEnv* km_env, jclass km_clazz, jlong ld, jint option, jlong outvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_option");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (int32_t)option, (void*)(uintptr_t)outvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)option;
    (void)outvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetOptionW(JNIEnv* km_env, jclass km_clazz, jlong ld, jint option, jlong outvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_optionW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (int32_t)option, (void*)(uintptr_t)outvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)option;
    (void)outvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetPagedCount(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong searchblock, jlong totalcount, jlong results) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_paged_count");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (int64_t)searchblock, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)results);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)searchblock;
    (void)totalcount;
    (void)results;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetValues(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)attr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    (void)attr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetValuesA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_valuesA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)attr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    (void)attr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetValuesW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_valuesW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)attr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    (void)attr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetValuesLen(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong message, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values_len");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)message, (void*)(uintptr_t)attr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)externalhandle;
    (void)message;
    (void)attr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetValuesLenA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong message, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values_lenA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)message, (void*)(uintptr_t)attr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)externalhandle;
    (void)message;
    (void)attr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapGetValuesLenW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong message, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values_lenW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)message, (void*)(uintptr_t)attr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)externalhandle;
    (void)message;
    (void)attr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapInit(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_init");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapInitA(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_initA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapInitW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_initW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapMemfree(JNIEnv* km_env, jclass km_clazz, jlong block) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_memfree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)block);
    } else {
        errno = ENOSYS;
    }
#else
    (void)block;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapMemfreeA(JNIEnv* km_env, jclass km_clazz, jlong block) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_memfreeA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)block);
    } else {
        errno = ENOSYS;
    }
#else
    (void)block;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapMemfreeW(JNIEnv* km_env, jclass km_clazz, jlong block) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_memfreeW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)block);
    } else {
        errno = ENOSYS;
    }
#else
    (void)block;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModify(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifyA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modifyA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifyW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modifyW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifyExt(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifyExtA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_extA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifyExtW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_extW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifyExtS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifyExtSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifyExtSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifyS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifySA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModifySW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)mods;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdn(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdn2(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdn2A(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2A");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdn2W(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2W");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdn2S(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdn2SA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdn2SW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdnA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdnA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdnW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdnW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdnS(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdnSA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapModrdnSW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapMsgfree(JNIEnv* km_env, jclass km_clazz, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_msgfree");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapNextAttribute(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_attribute");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapNextAttributeA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_attributeA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapNextAttributeW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_attributeW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapNextEntry(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_entry");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapNextReference(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_reference");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ld;
    (void)entry;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapOpen(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_open");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapOpenA(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_openA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapOpenW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_openW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultA(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong resultoid, jlong resultdata, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_extended_resultA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)resultoid, (void*)(uintptr_t)resultdata, (bool)freeit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connection;
    (void)resultmessage;
    (void)resultoid;
    (void)resultdata;
    (void)freeit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseExtendedResultW(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong resultoid, jlong resultdata, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_extended_resultW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)resultoid, (void*)(uintptr_t)resultdata, (bool)freeit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connection;
    (void)resultmessage;
    (void)resultoid;
    (void)resultdata;
    (void)freeit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParsePageControl(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong servercontrols, jlong totalcount, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_page_control");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)cookie);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)servercontrols;
    (void)totalcount;
    (void)cookie;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParsePageControlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong servercontrols, jlong totalcount, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_page_controlA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)cookie);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)servercontrols;
    (void)totalcount;
    (void)cookie;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParsePageControlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong servercontrols, jlong totalcount, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_page_controlW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)cookie);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)servercontrols;
    (void)totalcount;
    (void)cookie;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseReference(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong referrals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_reference");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)referrals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connection;
    (void)resultmessage;
    (void)referrals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseReferenceA(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong referrals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_referenceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)referrals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connection;
    (void)resultmessage;
    (void)referrals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseReferenceW(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong referrals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_referenceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)referrals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connection;
    (void)resultmessage;
    (void)referrals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseResult(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong returncode, jlong matcheddns, jlong errormessage, jlong referrals, jlong servercontrols, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_result");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)returncode, (void*)(uintptr_t)matcheddns, (void*)(uintptr_t)errormessage, (void*)(uintptr_t)referrals, (void*)(uintptr_t)servercontrols, (bool)freeit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connection;
    (void)resultmessage;
    (void)returncode;
    (void)matcheddns;
    (void)errormessage;
    (void)referrals;
    (void)servercontrols;
    (void)freeit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseResultA(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong returncode, jlong matcheddns, jlong errormessage, jlong referrals, jlong servercontrols, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_resultA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)returncode, (void*)(uintptr_t)matcheddns, (void*)(uintptr_t)errormessage, (void*)(uintptr_t)referrals, (void*)(uintptr_t)servercontrols, (bool)freeit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connection;
    (void)resultmessage;
    (void)returncode;
    (void)matcheddns;
    (void)errormessage;
    (void)referrals;
    (void)servercontrols;
    (void)freeit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseResultW(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong returncode, jlong matcheddns, jlong errormessage, jlong referrals, jlong servercontrols, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_resultW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)returncode, (void*)(uintptr_t)matcheddns, (void*)(uintptr_t)errormessage, (void*)(uintptr_t)referrals, (void*)(uintptr_t)servercontrols, (bool)freeit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)connection;
    (void)resultmessage;
    (void)returncode;
    (void)matcheddns;
    (void)errormessage;
    (void)referrals;
    (void)servercontrols;
    (void)freeit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseSortControl(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong result, jlong attribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_sort_control");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)result, (void*)(uintptr_t)attribute);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)control;
    (void)result;
    (void)attribute;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseSortControlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong result, jlong attribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_sort_controlA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)result, (void*)(uintptr_t)attribute);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)control;
    (void)result;
    (void)attribute;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseSortControlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong result, jlong attribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_sort_controlW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)result, (void*)(uintptr_t)attribute);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)control;
    (void)result;
    (void)attribute;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseVlvControlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong targetpos, jlong listcount, jlong context, jlong errcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_vlv_controlA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)targetpos, (void*)(uintptr_t)listcount, (void*)(uintptr_t)context, (void*)(uintptr_t)errcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)control;
    (void)targetpos;
    (void)listcount;
    (void)context;
    (void)errcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapParseVlvControlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong targetpos, jlong listcount, jlong context, jlong errcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_vlv_controlW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)targetpos, (void*)(uintptr_t)listcount, (void*)(uintptr_t)context, (void*)(uintptr_t)errcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)control;
    (void)targetpos;
    (void)listcount;
    (void)context;
    (void)errcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapPerror(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_perror");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)msg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ld;
    (void)msg;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapRenameExt(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapRenameExtA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_extA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapRenameExtW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_extW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapRenameExtS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapRenameExtSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapRenameExtSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapResult(JNIEnv* km_env, jclass km_clazz, jlong ld, jint msgid, jint all, jlong timeout, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_result");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (uint32_t)msgid, (uint32_t)all, (void*)(uintptr_t)timeout, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)msgid;
    (void)all;
    (void)timeout;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapResult2error(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res, jint freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_result2error");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res, (uint32_t)freeit);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)res;
    (void)freeit;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSaslBindA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distname, jlong authmechanism, jlong cred, jlong serverctrls, jlong clientctrls, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bindA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distname, (void*)(uintptr_t)authmechanism, (void*)(uintptr_t)cred, (void*)(uintptr_t)serverctrls, (void*)(uintptr_t)clientctrls, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)messagenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSaslBindW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distname, jlong authmechanism, jlong cred, jlong serverctrls, jlong clientctrls, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bindW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distname, (void*)(uintptr_t)authmechanism, (void*)(uintptr_t)cred, (void*)(uintptr_t)serverctrls, (void*)(uintptr_t)clientctrls, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)messagenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSaslBindSA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distname, jlong authmechanism, jlong cred, jlong serverctrls, jlong clientctrls, jlong serverdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bind_sA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distname, (void*)(uintptr_t)authmechanism, (void*)(uintptr_t)cred, (void*)(uintptr_t)serverctrls, (void*)(uintptr_t)clientctrls, (void*)(uintptr_t)serverdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)serverdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSaslBindSW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distname, jlong authmechanism, jlong cred, jlong serverctrls, jlong clientctrls, jlong serverdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bind_sW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distname, (void*)(uintptr_t)authmechanism, (void*)(uintptr_t)cred, (void*)(uintptr_t)serverctrls, (void*)(uintptr_t)clientctrls, (void*)(uintptr_t)serverdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)serverdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearch(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_searchA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_searchW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchAbandonPage(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong searchblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_abandon_page");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (int64_t)searchblock);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)searchblock;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchExt(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jint timelimit, jint sizelimit, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)timelimit, (uint32_t)sizelimit, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timelimit;
    (void)sizelimit;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchExtA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jint timelimit, jint sizelimit, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_extA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)timelimit, (uint32_t)sizelimit, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timelimit;
    (void)sizelimit;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchExtW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jint timelimit, jint sizelimit, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_extW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)timelimit, (uint32_t)sizelimit, (void*)(uintptr_t)messagenumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timelimit;
    (void)sizelimit;
    (void)messagenumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchExtS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jlong timeout, jint sizelimit, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)timeout, (uint32_t)sizelimit, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timeout;
    (void)sizelimit;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchExtSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jlong timeout, jint sizelimit, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)timeout, (uint32_t)sizelimit, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timeout;
    (void)sizelimit;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchExtSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jlong timeout, jint sizelimit, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)timeout, (uint32_t)sizelimit, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)timeout;
    (void)sizelimit;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchInitPage(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jint scopeofsearch, jlong searchfilter, jlong attributelist, jint attributesonly, jlong servercontrols, jlong clientcontrols, jint pagetimelimit, jint totalsizelimit, jlong sortkeys) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_init_page");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (uint32_t)scopeofsearch, (void*)(uintptr_t)searchfilter, (void*)(uintptr_t)attributelist, (uint32_t)attributesonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)pagetimelimit, (uint32_t)totalsizelimit, (void*)(uintptr_t)sortkeys);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)scopeofsearch;
    (void)searchfilter;
    (void)attributelist;
    (void)attributesonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)pagetimelimit;
    (void)totalsizelimit;
    (void)sortkeys;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchInitPageA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jint scopeofsearch, jlong searchfilter, jlong attributelist, jint attributesonly, jlong servercontrols, jlong clientcontrols, jint pagetimelimit, jint totalsizelimit, jlong sortkeys) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_init_pageA");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (uint32_t)scopeofsearch, (void*)(uintptr_t)searchfilter, (void*)(uintptr_t)attributelist, (uint32_t)attributesonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)pagetimelimit, (uint32_t)totalsizelimit, (void*)(uintptr_t)sortkeys);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)scopeofsearch;
    (void)searchfilter;
    (void)attributelist;
    (void)attributesonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)pagetimelimit;
    (void)totalsizelimit;
    (void)sortkeys;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchInitPageW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jint scopeofsearch, jlong searchfilter, jlong attributelist, jint attributesonly, jlong servercontrols, jlong clientcontrols, jint pagetimelimit, jint totalsizelimit, jlong sortkeys) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_init_pageW");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (uint32_t)scopeofsearch, (void*)(uintptr_t)searchfilter, (void*)(uintptr_t)attributelist, (uint32_t)attributesonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)pagetimelimit, (uint32_t)totalsizelimit, (void*)(uintptr_t)sortkeys);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)scopeofsearch;
    (void)searchfilter;
    (void)attributelist;
    (void)attributesonly;
    (void)servercontrols;
    (void)clientcontrols;
    (void)pagetimelimit;
    (void)totalsizelimit;
    (void)sortkeys;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchSt(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong timeout, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_st");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)timeout, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)timeout;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchStA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong timeout, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_stA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)timeout, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)timeout;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSearchStW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong timeout, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_stW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)timeout, (void*)(uintptr_t)res);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)timeout;
    (void)res;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSetDbgFlags(JNIEnv* km_env, jclass km_clazz, jint newflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_dbg_flags");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)newflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)newflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSetDbgRoutine(JNIEnv* km_env, jclass km_clazz, jlong debugprintroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_dbg_routine");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)debugprintroutine);
    } else {
        errno = ENOSYS;
    }
#else
    (void)debugprintroutine;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSetOption(JNIEnv* km_env, jclass km_clazz, jlong ld, jint option, jlong invalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_option");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (int32_t)option, (void*)(uintptr_t)invalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)option;
    (void)invalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSetOptionW(JNIEnv* km_env, jclass km_clazz, jlong ld, jint option, jlong invalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_optionW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (int32_t)option, (void*)(uintptr_t)invalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)option;
    (void)invalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSimpleBind(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSimpleBindA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bindA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSimpleBindW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bindW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSimpleBindS(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSimpleBindSA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSimpleBindSW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSslinit(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber, jint secure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sslinit");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber, (int32_t)secure);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    (void)secure;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSslinitA(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber, jint secure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sslinitA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber, (int32_t)secure);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    (void)secure;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapSslinitW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber, jint secure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sslinitW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber, (int32_t)secure);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hostname;
    (void)portnumber;
    (void)secure;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapStartTlsSA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong serverreturnvalue, jlong result, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_start_tls_sA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)serverreturnvalue, (void*)(uintptr_t)result, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)serverreturnvalue;
    (void)result;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapStartTlsSW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong serverreturnvalue, jlong result, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_start_tls_sW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)serverreturnvalue, (void*)(uintptr_t)result, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)externalhandle;
    (void)serverreturnvalue;
    (void)result;
    (void)servercontrols;
    (void)clientcontrols;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapStartup(JNIEnv* km_env, jclass km_clazz, jlong version, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_startup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)version, (void*)(uintptr_t)instance);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)version;
    (void)instance;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapStopTlsS(JNIEnv* km_env, jclass km_clazz, jlong externalhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_stop_tls_s");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)externalhandle);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)externalhandle;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapUfn2dn(JNIEnv* km_env, jclass km_clazz, jlong ufn, jlong pdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_ufn2dn");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ufn, (void*)(uintptr_t)pdn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ufn;
    (void)pdn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapUfn2dnA(JNIEnv* km_env, jclass km_clazz, jlong ufn, jlong pdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_ufn2dnA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ufn, (void*)(uintptr_t)pdn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ufn;
    (void)pdn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapUfn2dnW(JNIEnv* km_env, jclass km_clazz, jlong ufn, jlong pdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_ufn2dnW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ufn, (void*)(uintptr_t)pdn);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ufn;
    (void)pdn;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapUnbind(JNIEnv* km_env, jclass km_clazz, jlong ld) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_unbind");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapUnbindS(JNIEnv* km_env, jclass km_clazz, jlong ld) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_unbind_s");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ld);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ld;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapValueFree(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_free");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapValueFreeA(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_freeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapValueFreeW(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_freeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssysWindowsWin32NetworkingLdapLdapValueFreeLen(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_free_len");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vals);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)vals;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

