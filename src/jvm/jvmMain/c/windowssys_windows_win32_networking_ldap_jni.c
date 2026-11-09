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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1LdapGetLastError(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapGetLastError");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1LdapMapErrorToWin32(JNIEnv* km_env, jclass km_clazz, jint ldaperror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapMapErrorToWin32");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ldaperror) : 0;
#else
    (void)ldaperror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1LdapUTF8ToUnicode(JNIEnv* km_env, jclass km_clazz, jlong lpsrcstr, jint cchsrc, jlong lpdeststr, jint cchdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapUTF8ToUnicode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsrcstr, (int32_t)cchsrc, (void*)(uintptr_t)lpdeststr, (int32_t)cchdest) : -1;
#else
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1LdapUnicodeToUTF8(JNIEnv* km_env, jclass km_clazz, jlong lpsrcstr, jint cchsrc, jlong lpdeststr, jint cchdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LdapUnicodeToUTF8");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsrcstr, (int32_t)cchsrc, (void*)(uintptr_t)lpdeststr, (int32_t)cchdest) : -1;
#else
    (void)lpsrcstr;
    (void)cchsrc;
    (void)lpdeststr;
    (void)cchdest;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1alloc_1t(JNIEnv* km_env, jclass km_clazz, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_alloc_t");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)options) : NULL;
#else
    (void)options;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1bvdup(JNIEnv* km_env, jclass km_clazz, jlong pberval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_bvdup");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pberval) : NULL;
#else
    (void)pberval;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1bvecfree(JNIEnv* km_env, jclass km_clazz, jlong pberval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_bvecfree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pberval);
#else
    (void)pberval;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1bvfree(JNIEnv* km_env, jclass km_clazz, jlong bv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_bvfree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bv);
#else
    (void)bv;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1first_1element(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong plen, jlong ppopaque) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_first_element");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)plen, (void*)(uintptr_t)ppopaque) : 0;
#else
    (void)pberelement;
    (void)plen;
    (void)ppopaque;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1flatten(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong pberval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_flatten");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)pberval) : -1;
#else
    (void)pberelement;
    (void)pberval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1free(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jint fbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_free");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pberelement, (int32_t)fbuf);
#else
    (void)pberelement;
    (void)fbuf;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1init(JNIEnv* km_env, jclass km_clazz, jlong pberval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_init");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pberval) : NULL;
#else
    (void)pberval;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1next_1element(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong plen, jlong opaque) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_next_element");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)plen, (void*)(uintptr_t)opaque) : 0;
#else
    (void)pberelement;
    (void)plen;
    (void)opaque;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1peek_1tag(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong plen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_peek_tag");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)plen) : 0;
#else
    (void)pberelement;
    (void)plen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ber_1skip_1tag(JNIEnv* km_env, jclass km_clazz, jlong pberelement, jlong plen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ber_skip_tag");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pberelement, (void*)(uintptr_t)plen) : 0;
#else
    (void)pberelement;
    (void)plen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1cldap_1open(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "cldap_open");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1cldap_1openA(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "cldap_openA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1cldap_1openW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "cldap_openW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1abandon(JNIEnv* km_env, jclass km_clazz, jlong ld, jint msgid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_abandon");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (uint32_t)msgid) : 0;
#else
    (void)ld;
    (void)msgid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1addA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_addA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1addW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_addW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add_1ext(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add_1extA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_extA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add_1extW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_extW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add_1ext_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add_1ext_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add_1ext_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_ext_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1add_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attrs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_add_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attrs) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attrs;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1bind(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method) : 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1bindA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bindA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method) : 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1bindW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bindW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method) : 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1bind_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method) : 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1bind_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method) : 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1bind_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong cred, jint method) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_bind_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)cred, (uint32_t)method) : 0;
#else
    (void)ld;
    (void)dn;
    (void)cred;
    (void)method;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1check_1filterA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong searchfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_check_filterA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)searchfilter) : 0;
#else
    (void)ld;
    (void)searchfilter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1check_1filterW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong searchfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_check_filterW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)searchfilter) : 0;
#else
    (void)ld;
    (void)searchfilter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1cleanup(JNIEnv* km_env, jclass km_clazz, jlong hinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_cleanup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinstance) : 0;
#else
    (void)hinstance;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1close_1extended_1op(JNIEnv* km_env, jclass km_clazz, jlong ld, jint messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_close_extended_op");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (uint32_t)messagenumber) : 0;
#else
    (void)ld;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compareA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compareA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compareW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compareW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare_1ext(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare_1extA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_extA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare_1extW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_extW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare_1ext_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare_1ext_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare_1ext_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value, jlong data, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_ext_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1compare_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong attr, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_compare_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)attr, (void*)(uintptr_t)value) : 0;
#else
    (void)ld;
    (void)dn;
    (void)attr;
    (void)value;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1conn_1from_1msg(JNIEnv* km_env, jclass km_clazz, jlong primaryconn, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_conn_from_msg");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)primaryconn, (void*)(uintptr_t)res) : NULL;
#else
    (void)primaryconn;
    (void)res;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1connect(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_connect");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)timeout) : 0;
#else
    (void)ld;
    (void)timeout;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1control_1free(JNIEnv* km_env, jclass km_clazz, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_control_free");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)control) : 0;
#else
    (void)control;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1control_1freeA(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_control_freeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)controls) : 0;
#else
    (void)controls;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1control_1freeW(JNIEnv* km_env, jclass km_clazz, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_control_freeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)control) : 0;
#else
    (void)control;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1controls_1free(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_controls_free");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)controls) : 0;
#else
    (void)controls;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1controls_1freeA(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_controls_freeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)controls) : 0;
#else
    (void)controls;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1controls_1freeW(JNIEnv* km_env, jclass km_clazz, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_controls_freeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)control) : 0;
#else
    (void)control;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1count_1entries(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_entries");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res) : 0;
#else
    (void)ld;
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1count_1references(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_references");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res) : 0;
#else
    (void)ld;
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1count_1values(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_values");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vals) : 0;
#else
    (void)vals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1count_1valuesA(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_valuesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vals) : 0;
#else
    (void)vals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1count_1valuesW(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_valuesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vals) : 0;
#else
    (void)vals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1count_1values_1len(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_count_values_len");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vals) : 0;
#else
    (void)vals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1create_1page_1control(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jint pagesize, jlong cookie, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_page_control");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (uint32_t)pagesize, (void*)(uintptr_t)cookie, (uint8_t)iscritical, (void*)(uintptr_t)control) : 0;
#else
    (void)externalhandle;
    (void)pagesize;
    (void)cookie;
    (void)iscritical;
    (void)control;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1create_1page_1controlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jint pagesize, jlong cookie, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_page_controlA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (uint32_t)pagesize, (void*)(uintptr_t)cookie, (uint8_t)iscritical, (void*)(uintptr_t)control) : 0;
#else
    (void)externalhandle;
    (void)pagesize;
    (void)cookie;
    (void)iscritical;
    (void)control;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1create_1page_1controlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jint pagesize, jlong cookie, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_page_controlW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (uint32_t)pagesize, (void*)(uintptr_t)cookie, (uint8_t)iscritical, (void*)(uintptr_t)control) : 0;
#else
    (void)externalhandle;
    (void)pagesize;
    (void)cookie;
    (void)iscritical;
    (void)control;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1create_1sort_1control(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_sort_control");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (uint8_t)iscritical, (void*)(uintptr_t)control) : 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)iscritical;
    (void)control;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1create_1sort_1controlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_sort_controlA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (uint8_t)iscritical, (void*)(uintptr_t)control) : 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)iscritical;
    (void)control;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1create_1sort_1controlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_sort_controlW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (uint8_t)iscritical, (void*)(uintptr_t)control) : 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)iscritical;
    (void)control;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1create_1vlv_1controlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong vlvinfo, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_vlv_controlA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)vlvinfo, (uint8_t)iscritical, (void*)(uintptr_t)control) : -1;
#else
    (void)externalhandle;
    (void)vlvinfo;
    (void)iscritical;
    (void)control;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1create_1vlv_1controlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong vlvinfo, jbyte iscritical, jlong control) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_create_vlv_controlW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)vlvinfo, (uint8_t)iscritical, (void*)(uintptr_t)control) : -1;
#else
    (void)externalhandle;
    (void)vlvinfo;
    (void)iscritical;
    (void)control;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn) : 0;
#else
    (void)ld;
    (void)dn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1deleteA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_deleteA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn) : 0;
#else
    (void)ld;
    (void)dn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1deleteW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_deleteW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn) : 0;
#else
    (void)ld;
    (void)dn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete_1ext(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete_1extA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_extA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete_1extW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_extW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete_1ext_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete_1ext_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete_1ext_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_ext_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn) : 0;
#else
    (void)ld;
    (void)dn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn) : 0;
#else
    (void)ld;
    (void)dn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1delete_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_delete_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn) : 0;
#else
    (void)ld;
    (void)dn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1dn2ufn(JNIEnv* km_env, jclass km_clazz, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_dn2ufn");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dn) : NULL;
#else
    (void)dn;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1dn2ufnA(JNIEnv* km_env, jclass km_clazz, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_dn2ufnA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dn) : NULL;
#else
    (void)dn;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1dn2ufnW(JNIEnv* km_env, jclass km_clazz, jlong dn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_dn2ufnW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dn) : NULL;
#else
    (void)dn;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1encode_1sort_1controlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jlong control, jboolean criticality) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_encode_sort_controlA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (void*)(uintptr_t)control, (bool)criticality) : 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)control;
    (void)criticality;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1encode_1sort_1controlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong sortkeys, jlong control, jboolean criticality) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_encode_sort_controlW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)sortkeys, (void*)(uintptr_t)control, (bool)criticality) : 0;
#else
    (void)externalhandle;
    (void)sortkeys;
    (void)control;
    (void)criticality;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1err2string(JNIEnv* km_env, jclass km_clazz, jint err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_err2string");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)err) : NULL;
#else
    (void)err;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1err2stringA(JNIEnv* km_env, jclass km_clazz, jint err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_err2stringA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)err) : NULL;
#else
    (void)err;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1err2stringW(JNIEnv* km_env, jclass km_clazz, jint err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_err2stringW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)err) : NULL;
#else
    (void)err;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1escape_1filter_1element(JNIEnv* km_env, jclass km_clazz, jlong sourcefilterelement, jint sourcelength, jlong destfilterelement, jint destlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_escape_filter_element");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcefilterelement, (uint32_t)sourcelength, (void*)(uintptr_t)destfilterelement, (uint32_t)destlength) : 0;
#else
    (void)sourcefilterelement;
    (void)sourcelength;
    (void)destfilterelement;
    (void)destlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1escape_1filter_1elementA(JNIEnv* km_env, jclass km_clazz, jlong sourcefilterelement, jint sourcelength, jlong destfilterelement, jint destlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_escape_filter_elementA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcefilterelement, (uint32_t)sourcelength, (void*)(uintptr_t)destfilterelement, (uint32_t)destlength) : 0;
#else
    (void)sourcefilterelement;
    (void)sourcelength;
    (void)destfilterelement;
    (void)destlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1escape_1filter_1elementW(JNIEnv* km_env, jclass km_clazz, jlong sourcefilterelement, jint sourcelength, jlong destfilterelement, jint destlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_escape_filter_elementW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcefilterelement, (uint32_t)sourcelength, (void*)(uintptr_t)destfilterelement, (uint32_t)destlength) : 0;
#else
    (void)sourcefilterelement;
    (void)sourcelength;
    (void)destfilterelement;
    (void)destlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1explode_1dn(JNIEnv* km_env, jclass km_clazz, jlong dn, jint notypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_explode_dn");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dn, (uint32_t)notypes) : NULL;
#else
    (void)dn;
    (void)notypes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1explode_1dnA(JNIEnv* km_env, jclass km_clazz, jlong dn, jint notypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_explode_dnA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dn, (uint32_t)notypes) : NULL;
#else
    (void)dn;
    (void)notypes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1explode_1dnW(JNIEnv* km_env, jclass km_clazz, jlong dn, jint notypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_explode_dnW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dn, (uint32_t)notypes) : NULL;
#else
    (void)dn;
    (void)notypes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1extended_1operation(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1extended_1operationA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operationA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1extended_1operationW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operationW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1extended_1operation_1sA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong returnedoid, jlong returneddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operation_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)returnedoid, (void*)(uintptr_t)returneddata) : 0;
#else
    (void)externalhandle;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)returnedoid;
    (void)returneddata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1extended_1operation_1sW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong oid, jlong data, jlong servercontrols, jlong clientcontrols, jlong returnedoid, jlong returneddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_extended_operation_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)oid, (void*)(uintptr_t)data, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)returnedoid, (void*)(uintptr_t)returneddata) : 0;
#else
    (void)externalhandle;
    (void)oid;
    (void)data;
    (void)servercontrols;
    (void)clientcontrols;
    (void)returnedoid;
    (void)returneddata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1first_1attribute(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_attribute");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr) : NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1first_1attributeA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_attributeA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr) : NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1first_1attributeW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_attributeW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr) : NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1first_1entry(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_entry");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res) : NULL;
#else
    (void)ld;
    (void)res;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1first_1reference(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_first_reference");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res) : NULL;
#else
    (void)ld;
    (void)res;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1free_1controls(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_free_controls");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)controls) : 0;
#else
    (void)controls;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1free_1controlsA(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_free_controlsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)controls) : 0;
#else
    (void)controls;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1free_1controlsW(JNIEnv* km_env, jclass km_clazz, jlong controls) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_free_controlsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)controls) : 0;
#else
    (void)controls;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1dn(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_dn");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry) : NULL;
#else
    (void)ld;
    (void)entry;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1dnA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_dnA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry) : NULL;
#else
    (void)ld;
    (void)entry;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1dnW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_dnW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry) : NULL;
#else
    (void)ld;
    (void)entry;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1next_1page(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong searchhandle, jint pagesize, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_next_page");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (int64_t)searchhandle, (uint32_t)pagesize, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)externalhandle;
    (void)searchhandle;
    (void)pagesize;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1next_1page_1s(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong searchhandle, jlong timeout, jint pagesize, jlong totalcount, jlong results) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_next_page_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (int64_t)searchhandle, (void*)(uintptr_t)timeout, (uint32_t)pagesize, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)results) : 0;
#else
    (void)externalhandle;
    (void)searchhandle;
    (void)timeout;
    (void)pagesize;
    (void)totalcount;
    (void)results;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1option(JNIEnv* km_env, jclass km_clazz, jlong ld, jint option, jlong outvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_option");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (int32_t)option, (void*)(uintptr_t)outvalue) : 0;
#else
    (void)ld;
    (void)option;
    (void)outvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1optionW(JNIEnv* km_env, jclass km_clazz, jlong ld, jint option, jlong outvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_optionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (int32_t)option, (void*)(uintptr_t)outvalue) : 0;
#else
    (void)ld;
    (void)option;
    (void)outvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1paged_1count(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong searchblock, jlong totalcount, jlong results) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_paged_count");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (int64_t)searchblock, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)results) : 0;
#else
    (void)externalhandle;
    (void)searchblock;
    (void)totalcount;
    (void)results;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1values(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)attr) : NULL;
#else
    (void)ld;
    (void)entry;
    (void)attr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1valuesA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_valuesA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)attr) : NULL;
#else
    (void)ld;
    (void)entry;
    (void)attr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1valuesW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_valuesW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)attr) : NULL;
#else
    (void)ld;
    (void)entry;
    (void)attr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1values_1len(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong message, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values_len");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)message, (void*)(uintptr_t)attr) : NULL;
#else
    (void)externalhandle;
    (void)message;
    (void)attr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1values_1lenA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong message, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values_lenA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)message, (void*)(uintptr_t)attr) : NULL;
#else
    (void)externalhandle;
    (void)message;
    (void)attr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1get_1values_1lenW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong message, jlong attr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_get_values_lenW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)message, (void*)(uintptr_t)attr) : NULL;
#else
    (void)externalhandle;
    (void)message;
    (void)attr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1init(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_init");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1initA(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_initA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1initW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_initW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1memfree(JNIEnv* km_env, jclass km_clazz, jlong block) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_memfree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)block);
#else
    (void)block;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1memfreeA(JNIEnv* km_env, jclass km_clazz, jlong block) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_memfreeA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)block);
#else
    (void)block;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1memfreeW(JNIEnv* km_env, jclass km_clazz, jlong block) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_memfreeW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)block);
#else
    (void)block;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modifyA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modifyA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modifyW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modifyW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify_1ext(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify_1extA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_extA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify_1extW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_extW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify_1ext_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify_1ext_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify_1ext_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_ext_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modify_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong mods) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modify_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)mods) : 0;
#else
    (void)ld;
    (void)dn;
    (void)mods;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn2(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn2A(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn2W(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn2_1s(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn2_1sA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn2_1sW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname, jint deleteoldrdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn2_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname, (int32_t)deleteoldrdn) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    (void)deleteoldrdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdnA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdnA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdnW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdnW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn_1s(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn_1sA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1modrdn_1sW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jlong newdistinguishedname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_modrdn_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (void*)(uintptr_t)newdistinguishedname) : 0;
#else
    (void)externalhandle;
    (void)distinguishedname;
    (void)newdistinguishedname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1msgfree(JNIEnv* km_env, jclass km_clazz, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_msgfree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)res) : 0;
#else
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1next_1attribute(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_attribute");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr) : NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1next_1attributeA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_attributeA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr) : NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1next_1attributeW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_attributeW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry, (void*)(uintptr_t)ptr) : NULL;
#else
    (void)ld;
    (void)entry;
    (void)ptr;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1next_1entry(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_entry");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry) : NULL;
#else
    (void)ld;
    (void)entry;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1next_1reference(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_next_reference");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)entry) : NULL;
#else
    (void)ld;
    (void)entry;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1open(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_open");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1openA(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_openA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1openW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_openW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1extended_1resultA(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong resultoid, jlong resultdata, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_extended_resultA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)resultoid, (void*)(uintptr_t)resultdata, (bool)freeit) : 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)resultoid;
    (void)resultdata;
    (void)freeit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1extended_1resultW(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong resultoid, jlong resultdata, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_extended_resultW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)resultoid, (void*)(uintptr_t)resultdata, (bool)freeit) : 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)resultoid;
    (void)resultdata;
    (void)freeit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1page_1control(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong servercontrols, jlong totalcount, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_page_control");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)cookie) : 0;
#else
    (void)externalhandle;
    (void)servercontrols;
    (void)totalcount;
    (void)cookie;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1page_1controlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong servercontrols, jlong totalcount, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_page_controlA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)cookie) : 0;
#else
    (void)externalhandle;
    (void)servercontrols;
    (void)totalcount;
    (void)cookie;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1page_1controlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong servercontrols, jlong totalcount, jlong cookie) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_page_controlW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)totalcount, (void*)(uintptr_t)cookie) : 0;
#else
    (void)externalhandle;
    (void)servercontrols;
    (void)totalcount;
    (void)cookie;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1reference(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong referrals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_reference");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)referrals) : 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)referrals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1referenceA(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong referrals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_referenceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)referrals) : 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)referrals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1referenceW(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong referrals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_referenceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)referrals) : 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)referrals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1result(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong returncode, jlong matcheddns, jlong errormessage, jlong referrals, jlong servercontrols, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_result");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)returncode, (void*)(uintptr_t)matcheddns, (void*)(uintptr_t)errormessage, (void*)(uintptr_t)referrals, (void*)(uintptr_t)servercontrols, (bool)freeit) : 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)returncode;
    (void)matcheddns;
    (void)errormessage;
    (void)referrals;
    (void)servercontrols;
    (void)freeit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1resultA(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong returncode, jlong matcheddns, jlong errormessage, jlong referrals, jlong servercontrols, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_resultA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)returncode, (void*)(uintptr_t)matcheddns, (void*)(uintptr_t)errormessage, (void*)(uintptr_t)referrals, (void*)(uintptr_t)servercontrols, (bool)freeit) : 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)returncode;
    (void)matcheddns;
    (void)errormessage;
    (void)referrals;
    (void)servercontrols;
    (void)freeit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1resultW(JNIEnv* km_env, jclass km_clazz, jlong connection, jlong resultmessage, jlong returncode, jlong matcheddns, jlong errormessage, jlong referrals, jlong servercontrols, jboolean freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_resultW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connection, (void*)(uintptr_t)resultmessage, (void*)(uintptr_t)returncode, (void*)(uintptr_t)matcheddns, (void*)(uintptr_t)errormessage, (void*)(uintptr_t)referrals, (void*)(uintptr_t)servercontrols, (bool)freeit) : 0;
#else
    (void)connection;
    (void)resultmessage;
    (void)returncode;
    (void)matcheddns;
    (void)errormessage;
    (void)referrals;
    (void)servercontrols;
    (void)freeit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1sort_1control(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong result, jlong attribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_sort_control");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)result, (void*)(uintptr_t)attribute) : 0;
#else
    (void)externalhandle;
    (void)control;
    (void)result;
    (void)attribute;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1sort_1controlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong result, jlong attribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_sort_controlA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)result, (void*)(uintptr_t)attribute) : 0;
#else
    (void)externalhandle;
    (void)control;
    (void)result;
    (void)attribute;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1sort_1controlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong result, jlong attribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_sort_controlW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)result, (void*)(uintptr_t)attribute) : 0;
#else
    (void)externalhandle;
    (void)control;
    (void)result;
    (void)attribute;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1vlv_1controlA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong targetpos, jlong listcount, jlong context, jlong errcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_vlv_controlA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)targetpos, (void*)(uintptr_t)listcount, (void*)(uintptr_t)context, (void*)(uintptr_t)errcode) : -1;
#else
    (void)externalhandle;
    (void)control;
    (void)targetpos;
    (void)listcount;
    (void)context;
    (void)errcode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1parse_1vlv_1controlW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong control, jlong targetpos, jlong listcount, jlong context, jlong errcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_parse_vlv_controlW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)control, (void*)(uintptr_t)targetpos, (void*)(uintptr_t)listcount, (void*)(uintptr_t)context, (void*)(uintptr_t)errcode) : -1;
#else
    (void)externalhandle;
    (void)control;
    (void)targetpos;
    (void)listcount;
    (void)context;
    (void)errcode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1perror(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong msg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_perror");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)msg);
#else
    (void)ld;
    (void)msg;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1rename_1ext(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1rename_1extA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_extA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1rename_1extW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_extW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)messagenumber) : 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    (void)messagenumber;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1rename_1ext_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1rename_1ext_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1rename_1ext_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong newrdn, jlong newparent, jint deleteoldrdn, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_rename_ext_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)newrdn, (void*)(uintptr_t)newparent, (int32_t)deleteoldrdn, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)ld;
    (void)dn;
    (void)newrdn;
    (void)newparent;
    (void)deleteoldrdn;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1result(JNIEnv* km_env, jclass km_clazz, jlong ld, jint msgid, jint all, jlong timeout, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_result");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (uint32_t)msgid, (uint32_t)all, (void*)(uintptr_t)timeout, (void*)(uintptr_t)res) : 0;
#else
    (void)ld;
    (void)msgid;
    (void)all;
    (void)timeout;
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1result2error(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong res, jint freeit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_result2error");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)res, (uint32_t)freeit) : 0;
#else
    (void)ld;
    (void)res;
    (void)freeit;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1sasl_1bindA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distname, jlong authmechanism, jlong cred, jlong serverctrls, jlong clientctrls, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bindA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distname, (void*)(uintptr_t)authmechanism, (void*)(uintptr_t)cred, (void*)(uintptr_t)serverctrls, (void*)(uintptr_t)clientctrls, (void*)(uintptr_t)messagenumber) : -1;
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)messagenumber;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1sasl_1bindW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distname, jlong authmechanism, jlong cred, jlong serverctrls, jlong clientctrls, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bindW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distname, (void*)(uintptr_t)authmechanism, (void*)(uintptr_t)cred, (void*)(uintptr_t)serverctrls, (void*)(uintptr_t)clientctrls, (void*)(uintptr_t)messagenumber) : -1;
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)messagenumber;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1sasl_1bind_1sA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distname, jlong authmechanism, jlong cred, jlong serverctrls, jlong clientctrls, jlong serverdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bind_sA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distname, (void*)(uintptr_t)authmechanism, (void*)(uintptr_t)cred, (void*)(uintptr_t)serverctrls, (void*)(uintptr_t)clientctrls, (void*)(uintptr_t)serverdata) : -1;
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)serverdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1sasl_1bind_1sW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distname, jlong authmechanism, jlong cred, jlong serverctrls, jlong clientctrls, jlong serverdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sasl_bind_sW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distname, (void*)(uintptr_t)authmechanism, (void*)(uintptr_t)cred, (void*)(uintptr_t)serverctrls, (void*)(uintptr_t)clientctrls, (void*)(uintptr_t)serverdata) : -1;
#else
    (void)externalhandle;
    (void)distname;
    (void)authmechanism;
    (void)cred;
    (void)serverctrls;
    (void)clientctrls;
    (void)serverdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly) : 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1searchA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_searchA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly) : 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1searchW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_searchW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly) : 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1abandon_1page(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong searchblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_abandon_page");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (int64_t)searchblock) : 0;
#else
    (void)externalhandle;
    (void)searchblock;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1ext(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jint timelimit, jint sizelimit, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)timelimit, (uint32_t)sizelimit, (void*)(uintptr_t)messagenumber) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1extA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jint timelimit, jint sizelimit, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_extA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)timelimit, (uint32_t)sizelimit, (void*)(uintptr_t)messagenumber) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1extW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jint timelimit, jint sizelimit, jlong messagenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_extW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)timelimit, (uint32_t)sizelimit, (void*)(uintptr_t)messagenumber) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1ext_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jlong timeout, jint sizelimit, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)timeout, (uint32_t)sizelimit, (void*)(uintptr_t)res) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1ext_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jlong timeout, jint sizelimit, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)timeout, (uint32_t)sizelimit, (void*)(uintptr_t)res) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1ext_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong servercontrols, jlong clientcontrols, jlong timeout, jint sizelimit, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_ext_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (void*)(uintptr_t)timeout, (uint32_t)sizelimit, (void*)(uintptr_t)res) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1init_1page(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jint scopeofsearch, jlong searchfilter, jlong attributelist, jint attributesonly, jlong servercontrols, jlong clientcontrols, jint pagetimelimit, jint totalsizelimit, jlong sortkeys) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_init_page");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (uint32_t)scopeofsearch, (void*)(uintptr_t)searchfilter, (void*)(uintptr_t)attributelist, (uint32_t)attributesonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)pagetimelimit, (uint32_t)totalsizelimit, (void*)(uintptr_t)sortkeys) : -1;
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
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1init_1pageA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jint scopeofsearch, jlong searchfilter, jlong attributelist, jint attributesonly, jlong servercontrols, jlong clientcontrols, jint pagetimelimit, jint totalsizelimit, jlong sortkeys) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_init_pageA");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (uint32_t)scopeofsearch, (void*)(uintptr_t)searchfilter, (void*)(uintptr_t)attributelist, (uint32_t)attributesonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)pagetimelimit, (uint32_t)totalsizelimit, (void*)(uintptr_t)sortkeys) : -1;
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
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1init_1pageW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong distinguishedname, jint scopeofsearch, jlong searchfilter, jlong attributelist, jint attributesonly, jlong servercontrols, jlong clientcontrols, jint pagetimelimit, jint totalsizelimit, jlong sortkeys) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_init_pageW");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)distinguishedname, (uint32_t)scopeofsearch, (void*)(uintptr_t)searchfilter, (void*)(uintptr_t)attributelist, (uint32_t)attributesonly, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols, (uint32_t)pagetimelimit, (uint32_t)totalsizelimit, (void*)(uintptr_t)sortkeys) : -1;
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
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)res) : 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)res) : 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)res) : 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1st(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong timeout, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_st");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)timeout, (void*)(uintptr_t)res) : 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)timeout;
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1stA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong timeout, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_stA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)timeout, (void*)(uintptr_t)res) : 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)timeout;
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1search_1stW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong base, jint scope, jlong filter, jlong attrs, jint attrsonly, jlong timeout, jlong res) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_search_stW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)base, (uint32_t)scope, (void*)(uintptr_t)filter, (void*)(uintptr_t)attrs, (uint32_t)attrsonly, (void*)(uintptr_t)timeout, (void*)(uintptr_t)res) : 0;
#else
    (void)ld;
    (void)base;
    (void)scope;
    (void)filter;
    (void)attrs;
    (void)attrsonly;
    (void)timeout;
    (void)res;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1set_1dbg_1flags(JNIEnv* km_env, jclass km_clazz, jint newflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_dbg_flags");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)newflags) : 0;
#else
    (void)newflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1set_1dbg_1routine(JNIEnv* km_env, jclass km_clazz, jlong debugprintroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_dbg_routine");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)debugprintroutine);
#else
    (void)debugprintroutine;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1set_1option(JNIEnv* km_env, jclass km_clazz, jlong ld, jint option, jlong invalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_option");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (int32_t)option, (void*)(uintptr_t)invalue) : 0;
#else
    (void)ld;
    (void)option;
    (void)invalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1set_1optionW(JNIEnv* km_env, jclass km_clazz, jlong ld, jint option, jlong invalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_set_optionW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (int32_t)option, (void*)(uintptr_t)invalue) : 0;
#else
    (void)ld;
    (void)option;
    (void)invalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1simple_1bind(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd) : 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1simple_1bindA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bindA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd) : 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1simple_1bindW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bindW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd) : 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1simple_1bind_1s(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd) : 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1simple_1bind_1sA(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd) : 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1simple_1bind_1sW(JNIEnv* km_env, jclass km_clazz, jlong ld, jlong dn, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_simple_bind_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld, (void*)(uintptr_t)dn, (void*)(uintptr_t)passwd) : 0;
#else
    (void)ld;
    (void)dn;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1sslinit(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber, jint secure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sslinit");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber, (int32_t)secure) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    (void)secure;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1sslinitA(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber, jint secure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sslinitA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber, (int32_t)secure) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    (void)secure;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1sslinitW(JNIEnv* km_env, jclass km_clazz, jlong hostname, jint portnumber, jint secure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_sslinitW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hostname, (uint32_t)portnumber, (int32_t)secure) : NULL;
#else
    (void)hostname;
    (void)portnumber;
    (void)secure;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1start_1tls_1sA(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong serverreturnvalue, jlong result, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_start_tls_sA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)serverreturnvalue, (void*)(uintptr_t)result, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)externalhandle;
    (void)serverreturnvalue;
    (void)result;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1start_1tls_1sW(JNIEnv* km_env, jclass km_clazz, jlong externalhandle, jlong serverreturnvalue, jlong result, jlong servercontrols, jlong clientcontrols) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_start_tls_sW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle, (void*)(uintptr_t)serverreturnvalue, (void*)(uintptr_t)result, (void*)(uintptr_t)servercontrols, (void*)(uintptr_t)clientcontrols) : 0;
#else
    (void)externalhandle;
    (void)serverreturnvalue;
    (void)result;
    (void)servercontrols;
    (void)clientcontrols;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1startup(JNIEnv* km_env, jclass km_clazz, jlong version, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_startup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)version, (void*)(uintptr_t)instance) : 0;
#else
    (void)version;
    (void)instance;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1stop_1tls_1s(JNIEnv* km_env, jclass km_clazz, jlong externalhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_stop_tls_s");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)externalhandle) : false;
#else
    (void)externalhandle;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1ufn2dn(JNIEnv* km_env, jclass km_clazz, jlong ufn, jlong pdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_ufn2dn");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ufn, (void*)(uintptr_t)pdn) : 0;
#else
    (void)ufn;
    (void)pdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1ufn2dnA(JNIEnv* km_env, jclass km_clazz, jlong ufn, jlong pdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_ufn2dnA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ufn, (void*)(uintptr_t)pdn) : 0;
#else
    (void)ufn;
    (void)pdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1ufn2dnW(JNIEnv* km_env, jclass km_clazz, jlong ufn, jlong pdn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_ufn2dnW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ufn, (void*)(uintptr_t)pdn) : 0;
#else
    (void)ufn;
    (void)pdn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1unbind(JNIEnv* km_env, jclass km_clazz, jlong ld) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_unbind");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld) : 0;
#else
    (void)ld;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1unbind_1s(JNIEnv* km_env, jclass km_clazz, jlong ld) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_unbind_s");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ld) : 0;
#else
    (void)ld;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1value_1free(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_free");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vals) : 0;
#else
    (void)vals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1value_1freeA(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_freeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vals) : 0;
#else
    (void)vals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1value_1freeW(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_freeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vals) : 0;
#else
    (void)vals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_ldap_WindowsWin32NetworkingLdapJniBridge_windowssys_1windows_1win32_1networking_1ldap_1ldap_1value_1free_1len(JNIEnv* km_env, jclass km_clazz, jlong vals) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wldap32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ldap_value_free_len");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vals) : 0;
#else
    (void)vals;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

