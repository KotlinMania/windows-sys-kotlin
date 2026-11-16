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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong pinput, jint fcontextreq, jint targetdatarep, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcceptSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput, (uint32_t)fcontextreq, (uint32_t)targetdatarep, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)phcontext;
    (void)pinput;
    (void)fcontextreq;
    (void)targetdatarep;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA(JNIEnv* km_env, jclass km_clazz, jlong pszprincipal, jlong pszpackage, jint fcredentialuse, jlong pvlogonid, jlong pauthdata, jlong pgetkeyfn, jlong pvgetkeyargument, jlong phcredential, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireCredentialsHandleA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprincipal, (void*)(uintptr_t)pszpackage, (uint32_t)fcredentialuse, (void*)(uintptr_t)pvlogonid, (void*)(uintptr_t)pauthdata, (void*)(uintptr_t)pgetkeyfn, (void*)(uintptr_t)pvgetkeyargument, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pvlogonid;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)phcredential;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW(JNIEnv* km_env, jclass km_clazz, jlong pszprincipal, jlong pszpackage, jint fcredentialuse, jlong pvlogonid, jlong pauthdata, jlong pgetkeyfn, jlong pvgetkeyargument, jlong phcredential, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireCredentialsHandleW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszprincipal, (void*)(uintptr_t)pszpackage, (uint32_t)fcredentialuse, (void*)(uintptr_t)pvlogonid, (void*)(uintptr_t)pauthdata, (void*)(uintptr_t)pgetkeyfn, (void*)(uintptr_t)pvgetkeyargument, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pvlogonid;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)phcredential;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong hcredentials, jlong pszprincipal, jlong pszpackage, jint fcredentialuse, jlong pauthdata, jlong pgetkeyfn, jlong pvgetkeyargument, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddCredentialsA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcredentials, (void*)(uintptr_t)pszprincipal, (void*)(uintptr_t)pszpackage, (uint32_t)fcredentialuse, (void*)(uintptr_t)pauthdata, (void*)(uintptr_t)pgetkeyfn, (void*)(uintptr_t)pvgetkeyargument, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcredentials;
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong hcredentials, jlong pszprincipal, jlong pszpackage, jint fcredentialuse, jlong pauthdata, jlong pgetkeyfn, jlong pvgetkeyargument, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddCredentialsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcredentials, (void*)(uintptr_t)pszprincipal, (void*)(uintptr_t)pszpackage, (uint32_t)fcredentialuse, (void*)(uintptr_t)pauthdata, (void*)(uintptr_t)pgetkeyfn, (void*)(uintptr_t)pvgetkeyargument, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcredentials;
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSecurityPackageA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)poptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackagename;
    (void)poptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSecurityPackageW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)poptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackagename;
    (void)poptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pinput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyControlToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)pinput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid(JNIEnv* km_env, jclass km_clazz, jlong psid, jlong psubcategoryguids, jint dwpolicycount, jlong ppauditpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditComputeEffectivePolicyBySid");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid, (void*)(uintptr_t)psubcategoryguids, (uint32_t)dwpolicycount, (void*)(uintptr_t)ppauditpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)psid;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken(JNIEnv* km_env, jclass km_clazz, jlong htokenhandle, jlong psubcategoryguids, jint dwpolicycount, jlong ppauditpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditComputeEffectivePolicyByToken");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htokenhandle, (void*)(uintptr_t)psubcategoryguids, (uint32_t)dwpolicycount, (void*)(uintptr_t)ppauditpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)htokenhandle;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories(JNIEnv* km_env, jclass km_clazz, jlong ppauditcategoriesarray, jlong pdwcountreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditEnumerateCategories");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppauditcategoriesarray, (void*)(uintptr_t)pdwcountreturned);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)ppauditcategoriesarray;
    (void)pdwcountreturned;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy(JNIEnv* km_env, jclass km_clazz, jlong ppauditsidarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditEnumeratePerUserPolicy");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppauditsidarray);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)ppauditsidarray;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories(JNIEnv* km_env, jclass km_clazz, jlong pauditcategoryguid, jboolean bretrieveallsubcategories, jlong ppauditsubcategoriesarray, jlong pdwcountreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditEnumerateSubCategories");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pauditcategoryguid, (bool)bretrieveallsubcategories, (void*)(uintptr_t)ppauditsubcategoriesarray, (void*)(uintptr_t)pdwcountreturned);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pauditcategoryguid;
    (void)bretrieveallsubcategories;
    (void)ppauditsubcategoriesarray;
    (void)pdwcountreturned;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditFree(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditFree");
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

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId(JNIEnv* km_env, jclass km_clazz, jint auditcategoryid, jlong pauditcategoryguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryGuidFromCategoryId");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)auditcategoryid, (void*)(uintptr_t)pauditcategoryguid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)auditcategoryid;
    (void)pauditcategoryguid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid(JNIEnv* km_env, jclass km_clazz, jlong pauditcategoryguid, jlong pauditcategoryid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryIdFromCategoryGuid");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pauditcategoryguid, (void*)(uintptr_t)pauditcategoryid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pauditcategoryguid;
    (void)pauditcategoryid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA(JNIEnv* km_env, jclass km_clazz, jlong pauditcategoryguid, jlong ppszcategoryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryNameA");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pauditcategoryguid, (void*)(uintptr_t)ppszcategoryname);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pauditcategoryguid;
    (void)ppszcategoryname;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW(JNIEnv* km_env, jclass km_clazz, jlong pauditcategoryguid, jlong ppszcategoryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryNameW");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pauditcategoryguid, (void*)(uintptr_t)ppszcategoryname);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pauditcategoryguid;
    (void)ppszcategoryname;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA(JNIEnv* km_env, jclass km_clazz, jlong pauditsubcategoryguid, jlong ppszsubcategoryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupSubCategoryNameA");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pauditsubcategoryguid, (void*)(uintptr_t)ppszsubcategoryname);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pauditsubcategoryguid;
    (void)ppszsubcategoryname;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW(JNIEnv* km_env, jclass km_clazz, jlong pauditsubcategoryguid, jlong ppszsubcategoryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupSubCategoryNameW");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pauditsubcategoryguid, (void*)(uintptr_t)ppszsubcategoryname);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pauditsubcategoryguid;
    (void)ppszsubcategoryname;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong acl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQueryGlobalSaclA");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)acl);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)objecttypename;
    (void)acl;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong acl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQueryGlobalSaclW");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)acl);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)objecttypename;
    (void)acl;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy(JNIEnv* km_env, jclass km_clazz, jlong psid, jlong psubcategoryguids, jint dwpolicycount, jlong ppauditpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQueryPerUserPolicy");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid, (void*)(uintptr_t)psubcategoryguids, (uint32_t)dwpolicycount, (void*)(uintptr_t)ppauditpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)psid;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQuerySecurity");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)ppsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy(JNIEnv* km_env, jclass km_clazz, jlong psubcategoryguids, jint dwpolicycount, jlong ppauditpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQuerySystemPolicy");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psubcategoryguids, (uint32_t)dwpolicycount, (void*)(uintptr_t)ppauditpolicy);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong acl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetGlobalSaclA");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)acl);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)objecttypename;
    (void)acl;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong acl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetGlobalSaclW");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)acl);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)objecttypename;
    (void)acl;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy(JNIEnv* km_env, jclass km_clazz, jlong psid, jlong pauditpolicy, jint dwpolicycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetPerUserPolicy");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid, (void*)(uintptr_t)pauditpolicy, (uint32_t)dwpolicycount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)psid;
    (void)pauditpolicy;
    (void)dwpolicycount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetSecurity");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy(JNIEnv* km_env, jclass km_clazz, jlong pauditpolicy, jint dwpolicycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetSystemPolicy");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pauditpolicy, (uint32_t)dwpolicycount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)pauditpolicy;
    (void)dwpolicycount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong pszdomainname, jlong pszaccountname, jlong pszoldpassword, jlong psznewpassword, jboolean bimpersonating, jint dwreserved, jlong poutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeAccountPasswordA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pszaccountname, (void*)(uintptr_t)pszoldpassword, (void*)(uintptr_t)psznewpassword, (bool)bimpersonating, (uint32_t)dwreserved, (void*)(uintptr_t)poutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackagename;
    (void)pszdomainname;
    (void)pszaccountname;
    (void)pszoldpassword;
    (void)psznewpassword;
    (void)bimpersonating;
    (void)dwreserved;
    (void)poutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong pszdomainname, jlong pszaccountname, jlong pszoldpassword, jlong psznewpassword, jboolean bimpersonating, jint dwreserved, jlong poutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeAccountPasswordW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pszaccountname, (void*)(uintptr_t)pszoldpassword, (void*)(uintptr_t)psznewpassword, (bool)bimpersonating, (uint32_t)dwreserved, (void*)(uintptr_t)poutput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackagename;
    (void)pszdomainname;
    (void)pszaccountname;
    (void)pszoldpassword;
    (void)psznewpassword;
    (void)bimpersonating;
    (void)dwreserved;
    (void)poutput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong ptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompleteAuthToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)ptoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)ptoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo(JNIEnv* km_env, jclass km_clazz, jlong intargetinfo, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredMarshalTargetInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)intargetinfo, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)intargetinfo;
    (void)buffer;
    (void)buffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo(JNIEnv* km_env, jclass km_clazz, jlong buffer, jint buffersize, jlong rettargetinfo, jlong retactualsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnmarshalTargetInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)rettargetinfo, (void*)(uintptr_t)retactualsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)buffer;
    (void)buffersize;
    (void)rettargetinfo;
    (void)retactualsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pmessage, jint messageseqno, jlong pfqop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecryptMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno, (void*)(uintptr_t)pfqop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSecurityPackageA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackagename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackagename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSecurityPackageW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackagename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackagename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fqop, jlong pmessage, jint messageseqno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncryptMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fqop, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA(JNIEnv* km_env, jclass km_clazz, jlong pcpackages, jlong pppackageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateSecurityPackagesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcpackages, (void*)(uintptr_t)pppackageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcpackages;
    (void)pppackageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW(JNIEnv* km_env, jclass km_clazz, jlong pcpackages, jlong pppackageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateSecurityPackagesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcpackages, (void*)(uintptr_t)pppackageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcpackages;
    (void)pppackageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fflags, jlong ppackedcontext, jlong ptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fflags, (void*)(uintptr_t)ppackedcontext, (void*)(uintptr_t)ptoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)fflags;
    (void)ppackedcontext;
    (void)ptoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer(JNIEnv* km_env, jclass km_clazz, jlong pvcontextbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeContextBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvcontextbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvcontextbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle(JNIEnv* km_env, jclass km_clazz, jlong phcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeCredentialsHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA(JNIEnv* km_env, jclass km_clazz, jint nameformat, jlong lpnamebuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerObjectNameA");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nameformat, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW(JNIEnv* km_env, jclass km_clazz, jint nameformat, jlong lpnamebuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerObjectNameW");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nameformat, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA(JNIEnv* km_env, jclass km_clazz, jint nameformat, jlong lpnamebuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameExA");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nameformat, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW(JNIEnv* km_env, jclass km_clazz, jint nameformat, jlong lpnamebuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameExW");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)nameformat, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA(JNIEnv* km_env, jclass km_clazz, jlong pszpackage, jlong ppackedcontext, jlong token, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportSecurityContextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackage, (void*)(uintptr_t)ppackedcontext, (void*)(uintptr_t)token, (void*)(uintptr_t)phcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackage;
    (void)ppackedcontext;
    (void)token;
    (void)phcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW(JNIEnv* km_env, jclass km_clazz, jlong pszpackage, jlong ppackedcontext, jlong token, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportSecurityContextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackage, (void*)(uintptr_t)ppackedcontext, (void*)(uintptr_t)token, (void*)(uintptr_t)phcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackage;
    (void)ppackedcontext;
    (void)token;
    (void)phcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitSecurityInterfaceA");
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

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitSecurityInterfaceW");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSecurityContextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSecurityContextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong accountsid, jlong userrights, jint countofrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaAddAccountRights");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)accountsid, (void*)(uintptr_t)userrights, (uint32_t)countofrights);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)accountsid;
    (void)userrights;
    (void)countofrights;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage(JNIEnv* km_env, jclass km_clazz, jlong lsahandle, jint authenticationpackage, jlong protocolsubmitbuffer, jint submitbufferlength, jlong protocolreturnbuffer, jlong returnbufferlength, jlong protocolstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaCallAuthenticationPackage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lsahandle, (uint32_t)authenticationpackage, (void*)(uintptr_t)protocolsubmitbuffer, (uint32_t)submitbufferlength, (void*)(uintptr_t)protocolreturnbuffer, (void*)(uintptr_t)returnbufferlength, (void*)(uintptr_t)protocolstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lsahandle;
    (void)authenticationpackage;
    (void)protocolsubmitbuffer;
    (void)submitbufferlength;
    (void)protocolreturnbuffer;
    (void)returnbufferlength;
    (void)protocolstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(JNIEnv* km_env, jclass km_clazz, jlong objecthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)objecthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objecthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted(JNIEnv* km_env, jclass km_clazz, jlong lsahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaConnectUntrusted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lsahandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lsahandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomaininformation, jlong authenticationinformation, jint desiredaccess, jlong trusteddomainhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaCreateTrustedDomainEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomaininformation, (void*)(uintptr_t)authenticationinformation, (uint32_t)desiredaccess, (void*)(uintptr_t)trusteddomainhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomaininformation;
    (void)authenticationinformation;
    (void)desiredaccess;
    (void)trusteddomainhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaDeleteTrustedDomain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess(JNIEnv* km_env, jclass km_clazz, jlong lsahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaDeregisterLogonProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lsahandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lsahandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong accountsid, jlong userrights, jlong countofrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateAccountRights");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)accountsid, (void*)(uintptr_t)userrights, (void*)(uintptr_t)countofrights);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)accountsid;
    (void)userrights;
    (void)countofrights;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong userright, jlong buffer, jlong countreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateAccountsWithUserRight");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)userright, (void*)(uintptr_t)buffer, (void*)(uintptr_t)countreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)userright;
    (void)buffer;
    (void)countreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions(JNIEnv* km_env, jclass km_clazz, jlong logonsessioncount, jlong logonsessionlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateLogonSessions");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)logonsessioncount, (void*)(uintptr_t)logonsessionlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)logonsessioncount;
    (void)logonsessionlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong enumerationcontext, jlong buffer, jint preferedmaximumlength, jlong countreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateTrustedDomains");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)enumerationcontext, (void*)(uintptr_t)buffer, (uint32_t)preferedmaximumlength, (void*)(uintptr_t)countreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)enumerationcontext;
    (void)buffer;
    (void)preferedmaximumlength;
    (void)countreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong enumerationcontext, jlong buffer, jint preferedmaximumlength, jlong countreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateTrustedDomainsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)enumerationcontext, (void*)(uintptr_t)buffer, (uint32_t)preferedmaximumlength, (void*)(uintptr_t)countreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)enumerationcontext;
    (void)buffer;
    (void)preferedmaximumlength;
    (void)countreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaFreeMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaFreeReturnBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs(JNIEnv* km_env, jclass km_clazz, jlong systemname, jlong capids, jlong capidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaGetAppliedCAPIDs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)systemname, (void*)(uintptr_t)capids, (void*)(uintptr_t)capidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)systemname;
    (void)capids;
    (void)capidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData(JNIEnv* km_env, jclass km_clazz, jlong logonid, jlong pplogonsessiondata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaGetLogonSessionData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)logonid, (void*)(uintptr_t)pplogonsessiondata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)logonid;
    (void)pplogonsessiondata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage(JNIEnv* km_env, jclass km_clazz, jlong lsahandle, jlong packagename, jlong authenticationpackage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupAuthenticationPackage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lsahandle, (void*)(uintptr_t)packagename, (void*)(uintptr_t)authenticationpackage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lsahandle;
    (void)packagename;
    (void)authenticationpackage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint count, jlong names, jlong referenceddomains, jlong sids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupNames");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (uint32_t)count, (void*)(uintptr_t)names, (void*)(uintptr_t)referenceddomains, (void*)(uintptr_t)sids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)count;
    (void)names;
    (void)referenceddomains;
    (void)sids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint flags, jint count, jlong names, jlong referenceddomains, jlong sids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupNames2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (uint32_t)flags, (uint32_t)count, (void*)(uintptr_t)names, (void*)(uintptr_t)referenceddomains, (void*)(uintptr_t)sids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)flags;
    (void)count;
    (void)names;
    (void)referenceddomains;
    (void)sids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint count, jlong sids, jlong referenceddomains, jlong names) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupSids");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (uint32_t)count, (void*)(uintptr_t)sids, (void*)(uintptr_t)referenceddomains, (void*)(uintptr_t)names);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)count;
    (void)sids;
    (void)referenceddomains;
    (void)names;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint lookupoptions, jint count, jlong sids, jlong referenceddomains, jlong names) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupSids2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (uint32_t)lookupoptions, (uint32_t)count, (void*)(uintptr_t)sids, (void*)(uintptr_t)referenceddomains, (void*)(uintptr_t)names);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)lookupoptions;
    (void)count;
    (void)sids;
    (void)referenceddomains;
    (void)names;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaNtStatusToWinError");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)status);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)status;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy(JNIEnv* km_env, jclass km_clazz, jlong systemname, jlong objectattributes, jint desiredaccess, jlong policyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaOpenPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)systemname, (void*)(uintptr_t)objectattributes, (uint32_t)desiredaccess, (void*)(uintptr_t)policyhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)systemname;
    (void)objectattributes;
    (void)desiredaccess;
    (void)policyhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint desiredaccess, jlong trusteddomainhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaOpenTrustedDomainByName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (uint32_t)desiredaccess, (void*)(uintptr_t)trusteddomainhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)desiredaccess;
    (void)trusteddomainhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs(JNIEnv* km_env, jclass km_clazz, jlong capids, jint capidcount, jlong caps, jlong capcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryCAPs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)capids, (uint32_t)capidcount, (void*)(uintptr_t)caps, (void*)(uintptr_t)capcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)capids;
    (void)capidcount;
    (void)caps;
    (void)capcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryDomainInformationPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (int32_t)informationclass, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jlong foresttrustinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryForestTrustInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (void*)(uintptr_t)foresttrustinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)foresttrustinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint highestrecordtype, jlong foresttrustinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryForestTrustInformation2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (int32_t)highestrecordtype, (void*)(uintptr_t)foresttrustinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)highestrecordtype;
    (void)foresttrustinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryInformationPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (int32_t)informationclass, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainsid, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryTrustedDomainInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainsid, (int32_t)informationclass, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryTrustedDomainInfoByName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (int32_t)informationclass, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess(JNIEnv* km_env, jclass km_clazz, jlong logonprocessname, jlong lsahandle, jlong securitymode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRegisterLogonProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)logonprocessname, (void*)(uintptr_t)lsahandle, (void*)(uintptr_t)securitymode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)logonprocessname;
    (void)lsahandle;
    (void)securitymode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification(JNIEnv* km_env, jclass km_clazz, jint informationclass, jlong notificationeventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRegisterPolicyChangeNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)informationclass, (void*)(uintptr_t)notificationeventhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)informationclass;
    (void)notificationeventhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong accountsid, jboolean allrights, jlong userrights, jint countofrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRemoveAccountRights");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)accountsid, (bool)allrights, (void*)(uintptr_t)userrights, (uint32_t)countofrights);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)accountsid;
    (void)allrights;
    (void)userrights;
    (void)countofrights;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong keyname, jlong privatedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRetrievePrivateData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)keyname, (void*)(uintptr_t)privatedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)keyname;
    (void)privatedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs(JNIEnv* km_env, jclass km_clazz, jlong capdns, jint capdncount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetCAPs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)capdns, (uint32_t)capdncount, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)capdns;
    (void)capdncount;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetDomainInformationPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (int32_t)informationclass, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jlong foresttrustinfo, jboolean checkonly, jlong collisioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetForestTrustInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (void*)(uintptr_t)foresttrustinfo, (bool)checkonly, (void*)(uintptr_t)collisioninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)foresttrustinfo;
    (void)checkonly;
    (void)collisioninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint highestrecordtype, jlong foresttrustinfo, jboolean checkonly, jlong collisioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetForestTrustInformation2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (int32_t)highestrecordtype, (void*)(uintptr_t)foresttrustinfo, (bool)checkonly, (void*)(uintptr_t)collisioninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)highestrecordtype;
    (void)foresttrustinfo;
    (void)checkonly;
    (void)collisioninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetInformationPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (int32_t)informationclass, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetTrustedDomainInfoByName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (int32_t)informationclass, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainsid, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetTrustedDomainInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainsid, (int32_t)informationclass, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    (void)informationclass;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong keyname, jlong privatedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaStorePrivateData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)keyname, (void*)(uintptr_t)privatedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyhandle;
    (void)keyname;
    (void)privatedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification(JNIEnv* km_env, jclass km_clazz, jint informationclass, jlong notificationeventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaUnregisterPolicyChangeNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)informationclass, (void*)(uintptr_t)notificationeventhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)informationclass;
    (void)notificationeventhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fqop, jlong pmessage, jint messageseqno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fqop, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityContextToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong pppackageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityPackageInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)pppackageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackagename;
    (void)pppackageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong pppackageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityPackageInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)pppackageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszpackagename;
    (void)pppackageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevertSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory(JNIEnv* km_env, jclass km_clazz, jlong memory, jint memorysize, jint optionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemFunction041");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)memory, (uint32_t)memorysize, (uint32_t)optionflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)memory;
    (void)memorysize;
    (void)optionflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory(JNIEnv* km_env, jclass km_clazz, jlong memory, jint memorysize, jint optionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemFunction040");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)memory, (uint32_t)memorysize, (uint32_t)optionflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)memory;
    (void)memorysize;
    (void)optionflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom(JNIEnv* km_env, jclass km_clazz, jlong randombuffer, jint randombufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemFunction036");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)randombuffer, (uint32_t)randombufferlength);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)randombuffer;
    (void)randombufferlength;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket(JNIEnv* km_env, jclass km_clazz, jlong ppticketblob, jlong pcbticketblob, jlong pwsztemplateid, jlong pwszserverurl, jlong pwszclienttoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLAcquireGenuineTicket");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppticketblob, (void*)(uintptr_t)pcbticketblob, (void*)(uintptr_t)pwsztemplateid, (void*)(uintptr_t)pwszserverurl, (void*)(uintptr_t)pwszclienttoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppticketblob;
    (void)pcbticketblob;
    (void)pwsztemplateid;
    (void)pwszserverurl;
    (void)pwszclienttoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jint cbappspecificdata, jlong pvappspecificdata, jlong pactivationinfo, jlong pwszproxyserver, jshort wproxyport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLActivateProduct");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (uint32_t)cbappspecificdata, (void*)(uintptr_t)pvappspecificdata, (void*)(uintptr_t)pactivationinfo, (void*)(uintptr_t)pwszproxyserver, (uint16_t)wproxyport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pproductskuid;
    (void)cbappspecificdata;
    (void)pvappspecificdata;
    (void)pactivationinfo;
    (void)pwszproxyserver;
    (void)wproxyport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLClose(JNIEnv* km_env, jclass km_clazz, jlong hslc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pappid, jlong pproductskuid, jlong pwszrightname, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLConsumeRight");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pappid, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pwszrightname, (void*)(uintptr_t)pvreserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pappid;
    (void)pproductskuid;
    (void)pwszrightname;
    (void)pvreserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pwszinstallationid, jlong pwszconfirmationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLDepositOfflineConfirmationId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pwszinstallationid, (void*)(uintptr_t)pwszconfirmationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pwszinstallationid;
    (void)pwszconfirmationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pactivationinfo, jlong pwszinstallationid, jlong pwszconfirmationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLDepositOfflineConfirmationIdEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pactivationinfo, (void*)(uintptr_t)pwszinstallationid, (void*)(uintptr_t)pwszconfirmationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pactivationinfo;
    (void)pwszinstallationid;
    (void)pwszconfirmationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszeventid, jlong papplicationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLFireEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszeventid, (void*)(uintptr_t)papplicationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong ppwszinstallationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGenerateOfflineInstallationId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)ppwszinstallationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pproductskuid;
    (void)ppwszinstallationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pactivationinfo, jlong ppwszinstallationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGenerateOfflineInstallationIdEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pactivationinfo, (void*)(uintptr_t)ppwszinstallationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pactivationinfo;
    (void)ppwszinstallationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong papplicationid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetApplicationInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)papplicationid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)papplicationid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation(JNIEnv* km_env, jclass km_clazz, jlong pqueryid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetGenuineInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pqueryid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pqueryid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pnproductkeyids, jlong ppproductkeyids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetInstalledProductKeyIds");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pnproductkeyids, (void*)(uintptr_t)ppproductkeyids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pnproductkeyids;
    (void)ppproductkeyids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong plicensefileid, jlong pcblicensefile, jlong ppblicensefile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)plicensefileid, (void*)(uintptr_t)pcblicensefile, (void*)(uintptr_t)ppblicensefile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)plicensefileid;
    (void)pcblicensefile;
    (void)ppblicensefile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId(JNIEnv* km_env, jclass km_clazz, jlong hslc, jint cblicenseblob, jlong pblicenseblob, jlong plicensefileid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicenseFileId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (uint32_t)cblicenseblob, (void*)(uintptr_t)pblicenseblob, (void*)(uintptr_t)plicensefileid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)cblicenseblob;
    (void)pblicenseblob;
    (void)plicensefileid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong psllicenseid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicenseInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)psllicenseid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)psllicenseid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pappid, jlong pproductskuid, jlong pwszrightname, jlong pnstatuscount, jlong pplicensingstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicensingStatusInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pappid, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pwszrightname, (void*)(uintptr_t)pnstatuscount, (void*)(uintptr_t)pplicensingstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pappid;
    (void)pproductskuid;
    (void)pwszrightname;
    (void)pnstatuscount;
    (void)pplicensingstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszpkeyalgorithm, jlong pwszpkeystring, jint cbpkeyspecificdata, jlong pbpkeyspecificdata, jlong ppkeyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPKeyId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszpkeyalgorithm, (void*)(uintptr_t)pwszpkeystring, (uint32_t)cbpkeyspecificdata, (void*)(uintptr_t)pbpkeyspecificdata, (void*)(uintptr_t)ppkeyid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pwszpkeyalgorithm;
    (void)pwszpkeystring;
    (void)cbpkeyspecificdata;
    (void)pbpkeyspecificdata;
    (void)ppkeyid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong ppkeyid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPKeyInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)ppkeyid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)ppkeyid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPolicyInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszvaluename, jlong pdwvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPolicyInformationDWORD");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pdwvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pdwvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetProductSkuInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jint ereferraltype, jlong pskuorappid, jlong pwszvaluename, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetReferralInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (int32_t)ereferraltype, (void*)(uintptr_t)pskuorappid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)ppwszvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)ereferraltype;
    (void)pskuorappid;
    (void)pwszvaluename;
    (void)ppwszvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList(JNIEnv* km_env, jclass km_clazz, jlong hslc, jint equeryidtype, jlong pqueryid, jint ereturnidtype, jlong pnreturnids, jlong ppreturnids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetSLIDList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (int32_t)equeryidtype, (void*)(uintptr_t)pqueryid, (int32_t)ereturnidtype, (void*)(uintptr_t)pnreturnids, (void*)(uintptr_t)ppreturnids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)equeryidtype;
    (void)pqueryid;
    (void)ereturnidtype;
    (void)pnreturnids;
    (void)ppreturnids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus(JNIEnv* km_env, jclass km_clazz, jlong pwszserverurl, jlong pwszacquisitiontype, jlong pwszproxyserver, jshort wproxyport, jlong phrstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetServerStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszserverurl, (void*)(uintptr_t)pwszacquisitiontype, (void*)(uintptr_t)pwszproxyserver, (uint16_t)wproxyport, (void*)(uintptr_t)phrstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszserverurl;
    (void)pwszacquisitiontype;
    (void)pwszproxyserver;
    (void)wproxyport;
    (void)phrstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetServiceInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation(JNIEnv* km_env, jclass km_clazz, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetWindowsInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD(JNIEnv* km_env, jclass km_clazz, jlong pwszvaluename, jlong pdwvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetWindowsInformationDWORD");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pdwvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszvaluename;
    (void)pdwvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense(JNIEnv* km_env, jclass km_clazz, jlong hslc, jint cblicenseblob, jlong pblicenseblob, jlong plicensefileid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLInstallLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (uint32_t)cblicenseblob, (void*)(uintptr_t)pblicenseblob, (void*)(uintptr_t)plicensefileid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)cblicenseblob;
    (void)pblicenseblob;
    (void)plicensefileid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszpkeyalgorithm, jlong pwszpkeystring, jint cbpkeyspecificdata, jlong pbpkeyspecificdata, jlong ppkeyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLInstallProofOfPurchase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszpkeyalgorithm, (void*)(uintptr_t)pwszpkeystring, (uint32_t)cbpkeyspecificdata, (void*)(uintptr_t)pbpkeyspecificdata, (void*)(uintptr_t)ppkeyid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pwszpkeyalgorithm;
    (void)pwszpkeystring;
    (void)cbpkeyspecificdata;
    (void)pbpkeyspecificdata;
    (void)ppkeyid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal(JNIEnv* km_env, jclass km_clazz, jlong pappid, jlong pgenuinestate, jlong puioptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slwga.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLIsGenuineLocal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pappid, (void*)(uintptr_t)pgenuinestate, (void*)(uintptr_t)puioptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pappid;
    (void)pgenuinestate;
    (void)puioptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLOpen(JNIEnv* km_env, jclass km_clazz, jlong phslc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLOpen");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phslc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phslc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp(JNIEnv* km_env, jclass km_clazz, jlong valuename, jlong valuetype, jlong databuffer, jint datasize, jlong resultdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-slapi-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLQueryLicenseValueFromApp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)valuename, (void*)(uintptr_t)valuetype, (void*)(uintptr_t)databuffer, (uint32_t)datasize, (void*)(uintptr_t)resultdatasize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)valuename;
    (void)valuetype;
    (void)databuffer;
    (void)datasize;
    (void)resultdatasize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszeventid, jlong papplicationid, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLRegisterEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszeventid, (void*)(uintptr_t)papplicationid, (void*)(uintptr_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pproductkeyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLSetCurrentProductKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pproductkeyid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pproductkeyid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation(JNIEnv* km_env, jclass km_clazz, jlong pqueryid, jlong pwszvaluename, jint edatatype, jint cbvalue, jlong pbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLSetGenuineInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pqueryid, (void*)(uintptr_t)pwszvaluename, (uint32_t)edatatype, (uint32_t)cbvalue, (void*)(uintptr_t)pbvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pqueryid;
    (void)pwszvaluename;
    (void)edatatype;
    (void)cbvalue;
    (void)pbvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong plicensefileid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLUninstallLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)plicensefileid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)plicensefileid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong ppkeyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLUninstallProofOfPurchase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)ppkeyid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)ppkeyid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszeventid, jlong papplicationid, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLUnregisterEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszeventid, (void*)(uintptr_t)papplicationid, (void*)(uintptr_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong pinput, jint fcontextreq, jint targetdatarep, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslAcceptSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput, (uint32_t)fcontextreq, (uint32_t)targetdatarep, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)phcontext;
    (void)pinput;
    (void)fcontextreq;
    (void)targetdatarep;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA(JNIEnv* km_env, jclass km_clazz, jlong profilelist, jlong profilecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslEnumerateProfilesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)profilelist, (void*)(uintptr_t)profilecount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilelist;
    (void)profilecount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW(JNIEnv* km_env, jclass km_clazz, jlong profilelist, jlong profilecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslEnumerateProfilesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)profilelist, (void*)(uintptr_t)profilecount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilelist;
    (void)profilecount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption(JNIEnv* km_env, jclass km_clazz, jlong contexthandle, jint option, jlong value, jint size, jlong needed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslGetContextOption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)contexthandle, (uint32_t)option, (void*)(uintptr_t)value, (uint32_t)size, (void*)(uintptr_t)needed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)contexthandle;
    (void)option;
    (void)value;
    (void)size;
    (void)needed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA(JNIEnv* km_env, jclass km_clazz, jlong profilename, jlong packageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslGetProfilePackageA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)profilename, (void*)(uintptr_t)packageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilename;
    (void)packageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW(JNIEnv* km_env, jclass km_clazz, jlong profilename, jlong packageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslGetProfilePackageW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)profilename, (void*)(uintptr_t)packageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)profilename;
    (void)packageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA(JNIEnv* km_env, jclass km_clazz, jlong pinput, jlong packageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslIdentifyPackageA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinput, (void*)(uintptr_t)packageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinput;
    (void)packageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW(JNIEnv* km_env, jclass km_clazz, jlong pinput, jlong packageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslIdentifyPackageW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinput, (void*)(uintptr_t)packageinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinput;
    (void)packageinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslInitializeSecurityContextA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslInitializeSecurityContextW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption(JNIEnv* km_env, jclass km_clazz, jlong contexthandle, jint option, jlong value, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslSetContextOption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)contexthandle, (uint32_t)option, (void*)(uintptr_t)value, (uint32_t)size);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)contexthandle;
    (void)option;
    (void)value;
    (void)size;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(JNIEnv* km_env, jclass km_clazz, jint asuser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sas.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendSAS");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)asuser);
    } else {
        errno = ENOSYS;
    }
#else
    (void)asuser;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetContextAttributesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetContextAttributesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCredentialsAttributesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCredentialsAttributesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate(JNIEnv* km_env, jclass km_clazz, jlong pbcertificate, jint cbcertificate, jint dwflags, jlong ppcertificate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslCrackCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbcertificate, (uint32_t)cbcertificate, (uint32_t)dwflags, (void*)(uintptr_t)ppcertificate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbcertificate;
    (void)cbcertificate;
    (void)dwflags;
    (void)ppcertificate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEmptyCacheA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psztargetname, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psztargetname;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEmptyCacheW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psztargetname, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psztargetname;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate(JNIEnv* km_env, jclass km_clazz, jlong pcertificate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslFreeCertificate");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pcertificate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pcertificate;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits(JNIEnv* km_env, jclass km_clazz, jlong prandomdata, jint crandomdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGenerateRandomBits");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prandomdata, (int32_t)crandomdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prandomdata;
    (void)crandomdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions(JNIEnv* km_env, jclass km_clazz, jlong clienthello, jint clienthellobytesize, jlong genericextensions, jbyte genericextensionscount, jlong bytestoread, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetExtensions");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clienthello, (uint32_t)clienthellobytesize, (void*)(uintptr_t)genericextensions, (uint8_t)genericextensionscount, (void*)(uintptr_t)bytestoread, (int32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clienthello;
    (void)clienthellobytesize;
    (void)genericextensions;
    (void)genericextensionscount;
    (void)bytestoread;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(JNIEnv* km_env, jclass km_clazz, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetMaximumKeySize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity(JNIEnv* km_env, jclass km_clazz, jlong clienthello, jint clienthellosize, jlong serveridentity, jlong serveridentitysize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetServerIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clienthello, (uint32_t)clienthellosize, (void*)(uintptr_t)serveridentity, (void*)(uintptr_t)serveridentitysize, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clienthello;
    (void)clienthellosize;
    (void)serveridentity;
    (void)serveridentitysize;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities(JNIEnv* km_env, jclass km_clazz, jlong authidentity1, jlong authidentity2, jlong samesupplieduser, jlong samesuppliedidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiCompareAuthIdentities");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authidentity1, (void*)(uintptr_t)authidentity2, (void*)(uintptr_t)samesupplieduser, (void*)(uintptr_t)samesuppliedidentity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authidentity1;
    (void)authidentity2;
    (void)samesupplieduser;
    (void)samesuppliedidentity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata, jlong authdatacopy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiCopyAuthIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authdata, (void*)(uintptr_t)authdatacopy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authdata;
    (void)authdatacopy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong encryptedauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiDecryptAuthIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)encryptedauthdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)encryptedauthdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx(JNIEnv* km_env, jclass km_clazz, jint options, jlong encryptedauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiDecryptAuthIdentityEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)options, (void*)(uintptr_t)encryptedauthdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)options;
    (void)encryptedauthdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings(JNIEnv* km_env, jclass km_clazz, jlong pauthidentity, jlong ppszusername, jlong ppszdomainname, jlong ppszpackedcredentialsstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncodeAuthIdentityAsStrings");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pauthidentity, (void*)(uintptr_t)ppszusername, (void*)(uintptr_t)ppszdomainname, (void*)(uintptr_t)ppszpackedcredentialsstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pauthidentity;
    (void)ppszusername;
    (void)ppszdomainname;
    (void)ppszpackedcredentialsstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong pszusername, jlong pszdomainname, jlong pszpackedcredentialsstring, jlong ppauthidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncodeStringsAsAuthIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pszpackedcredentialsstring, (void*)(uintptr_t)ppauthidentity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pszusername;
    (void)pszdomainname;
    (void)pszpackedcredentialsstring;
    (void)ppauthidentity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncryptAuthIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx(JNIEnv* km_env, jclass km_clazz, jint options, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncryptAuthIdentityEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)options, (void*)(uintptr_t)authdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)options;
    (void)authdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage(JNIEnv* km_env, jclass km_clazz, jlong authidentity, jlong pszpackagename, jlong ppnewauthidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiExcludePackage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authidentity, (void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)ppnewauthidentity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authidentity;
    (void)pszpackagename;
    (void)ppnewauthidentity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiFreeAuthIdentity");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)authdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)authdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong pszhostname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiGetTargetHostName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pszhostname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psztargetname;
    (void)pszhostname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted(JNIEnv* km_env, jclass km_clazz, jlong encryptedauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiIsAuthIdentityEncrypted");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)encryptedauthdata);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)encryptedauthdata;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(JNIEnv* km_env, jclass km_clazz, jint errororntstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiIsPromptingNeeded");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)errororntstatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)errororntstatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree(JNIEnv* km_env, jclass km_clazz, jlong databuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiLocalFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)databuffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)databuffer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authidentity, jlong authidentitylength, jlong authidentitybytearray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiMarshalAuthIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authidentity, (void*)(uintptr_t)authidentitylength, (void*)(uintptr_t)authidentitybytearray);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authidentity;
    (void)authidentitylength;
    (void)authidentitybytearray;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead(JNIEnv* km_env, jclass km_clazz, jlong authidentity, jlong psztargetname, jlong pcredmancredentialtype, jlong ppszcredmantargetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPrepareForCredRead");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authidentity, (void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcredmancredentialtype, (void*)(uintptr_t)ppszcredmantargetname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authidentity;
    (void)psztargetname;
    (void)pcredmancredentialtype;
    (void)ppszcredmantargetname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite(JNIEnv* km_env, jclass km_clazz, jlong authidentity, jlong psztargetname, jlong pcredmancredentialtype, jlong ppszcredmantargetname, jlong ppszcredmanusername, jlong ppcredentialblob, jlong pcredentialblobsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPrepareForCredWrite");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authidentity, (void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcredmancredentialtype, (void*)(uintptr_t)ppszcredmantargetname, (void*)(uintptr_t)ppszcredmanusername, (void*)(uintptr_t)ppcredentialblob, (void*)(uintptr_t)pcredentialblobsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authidentity;
    (void)psztargetname;
    (void)pcredmancredentialtype;
    (void)ppszcredmantargetname;
    (void)ppszcredmanusername;
    (void)ppcredentialblob;
    (void)pcredentialblobsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong puiinfo, jint dwautherror, jlong pszpackage, jlong pinputauthidentity, jlong ppauthidentity, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPromptForCredentialsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)puiinfo, (uint32_t)dwautherror, (void*)(uintptr_t)pszpackage, (void*)(uintptr_t)pinputauthidentity, (void*)(uintptr_t)ppauthidentity, (void*)(uintptr_t)pfsave, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psztargetname;
    (void)puiinfo;
    (void)dwautherror;
    (void)pszpackage;
    (void)pinputauthidentity;
    (void)ppauthidentity;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong puiinfo, jint dwautherror, jlong pszpackage, jlong pinputauthidentity, jlong ppauthidentity, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPromptForCredentialsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)puiinfo, (uint32_t)dwautherror, (void*)(uintptr_t)pszpackage, (void*)(uintptr_t)pinputauthidentity, (void*)(uintptr_t)ppauthidentity, (void*)(uintptr_t)pfsave, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psztargetname;
    (void)puiinfo;
    (void)dwautherror;
    (void)pszpackage;
    (void)pinputauthidentity;
    (void)ppauthidentity;
    (void)pfsave;
    (void)dwflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags(JNIEnv* km_env, jclass km_clazz, jlong pbindings, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiSetChannelBindingFlags");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbindings, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbindings;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity(JNIEnv* km_env, jclass km_clazz, jint authidentitylength, jlong authidentitybytearray, jlong ppauthidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiUnmarshalAuthIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)authidentitylength, (void*)(uintptr_t)authidentitybytearray, (void*)(uintptr_t)ppauthidentity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authidentitylength;
    (void)authidentitybytearray;
    (void)ppauthidentity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiValidateAuthIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiZeroAuthIdentity");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)authdata);
    } else {
        errno = ENOSYS;
    }
#else
    (void)authdata;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingDeleteAllBindings");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding(JNIEnv* km_env, jclass km_clazz, jlong targeturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingDeleteBinding");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targeturl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targeturl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding(JNIEnv* km_env, jclass km_clazz, jint keytype, jlong targeturl, jint bindingtype, jlong tlsekm, jint tlsekmsize, jint extensionformat, jlong extensiondata, jlong tokenbinding, jlong tokenbindingsize, jlong resultdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateBinding");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)keytype, (void*)(uintptr_t)targeturl, (int32_t)bindingtype, (void*)(uintptr_t)tlsekm, (uint32_t)tlsekmsize, (int32_t)extensionformat, (void*)(uintptr_t)extensiondata, (void*)(uintptr_t)tokenbinding, (void*)(uintptr_t)tokenbindingsize, (void*)(uintptr_t)resultdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keytype;
    (void)targeturl;
    (void)bindingtype;
    (void)tlsekm;
    (void)tlsekmsize;
    (void)extensionformat;
    (void)extensiondata;
    (void)tokenbinding;
    (void)tokenbindingsize;
    (void)resultdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID(JNIEnv* km_env, jclass km_clazz, jint keytype, jlong publickey, jint publickeysize, jlong resultdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateID");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)keytype, (void*)(uintptr_t)publickey, (uint32_t)publickeysize, (void*)(uintptr_t)resultdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keytype;
    (void)publickey;
    (void)publickeysize;
    (void)resultdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri(JNIEnv* km_env, jclass km_clazz, jint keytype, jlong targeturi, jlong resultdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateIDForUri");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)keytype, (void*)(uintptr_t)targeturi, (void*)(uintptr_t)resultdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keytype;
    (void)targeturi;
    (void)resultdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage(JNIEnv* km_env, jclass km_clazz, jlong tokenbindings, jlong tokenbindingssize, jint tokenbindingscount, jlong tokenbindingmessage, jlong tokenbindingmessagesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenbindings, (void*)(uintptr_t)tokenbindingssize, (uint32_t)tokenbindingscount, (void*)(uintptr_t)tokenbindingmessage, (void*)(uintptr_t)tokenbindingmessagesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenbindings;
    (void)tokenbindingssize;
    (void)tokenbindingscount;
    (void)tokenbindingmessage;
    (void)tokenbindingmessagesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion(JNIEnv* km_env, jclass km_clazz, jlong majorversion, jlong minorversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGetHighestSupportedVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)majorversion, (void*)(uintptr_t)minorversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)majorversion;
    (void)minorversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient(JNIEnv* km_env, jclass km_clazz, jlong keytypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGetKeyTypesClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keytypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keytypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer(JNIEnv* km_env, jclass km_clazz, jlong keytypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGetKeyTypesServer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keytypes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keytypes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage(JNIEnv* km_env, jclass km_clazz, jlong tokenbindingmessage, jint tokenbindingmessagesize, jint keytype, jlong tlsekm, jint tlsekmsize, jlong resultlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingVerifyMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenbindingmessage, (uint32_t)tokenbindingmessagesize, (int32_t)keytype, (void*)(uintptr_t)tlsekm, (uint32_t)tlsekmsize, (void*)(uintptr_t)resultlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenbindingmessage;
    (void)tokenbindingmessagesize;
    (void)keytype;
    (void)tlsekm;
    (void)tlsekmsize;
    (void)resultlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA(JNIEnv* km_env, jclass km_clazz, jlong lpaccountname, jint accountnameformat, jint desirednameformat, jlong lptranslatedname, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateNameA");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpaccountname, (int32_t)accountnameformat, (int32_t)desirednameformat, (void*)(uintptr_t)lptranslatedname, (void*)(uintptr_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)lpaccountname;
    (void)accountnameformat;
    (void)desirednameformat;
    (void)lptranslatedname;
    (void)nsize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW(JNIEnv* km_env, jclass km_clazz, jlong lpaccountname, jint accountnameformat, jint desirednameformat, jlong lptranslatedname, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateNameW");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpaccountname, (int32_t)accountnameformat, (int32_t)desirednameformat, (void*)(uintptr_t)lptranslatedname, (void*)(uintptr_t)nsize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)lpaccountname;
    (void)accountnameformat;
    (void)desirednameformat;
    (void)lptranslatedname;
    (void)nsize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pmessage, jint messageseqno, jlong pfqop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifySignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno, (void*)(uintptr_t)pfqop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

