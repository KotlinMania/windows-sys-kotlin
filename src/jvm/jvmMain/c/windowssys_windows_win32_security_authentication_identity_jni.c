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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AcceptSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong pinput, jint fcontextreq, jint targetdatarep, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcceptSecurityContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput, (uint32_t)fcontextreq, (uint32_t)targetdatarep, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AcquireCredentialsHandleA(JNIEnv* km_env, jclass km_clazz, jlong pszprincipal, jlong pszpackage, jint fcredentialuse, jlong pvlogonid, jlong pauthdata, jlong pgetkeyfn, jlong pvgetkeyargument, jlong phcredential, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireCredentialsHandleA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprincipal, (void*)(uintptr_t)pszpackage, (uint32_t)fcredentialuse, (void*)(uintptr_t)pvlogonid, (void*)(uintptr_t)pauthdata, (void*)(uintptr_t)pgetkeyfn, (void*)(uintptr_t)pvgetkeyargument, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AcquireCredentialsHandleW(JNIEnv* km_env, jclass km_clazz, jlong pszprincipal, jlong pszpackage, jint fcredentialuse, jlong pvlogonid, jlong pauthdata, jlong pgetkeyfn, jlong pvgetkeyargument, jlong phcredential, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireCredentialsHandleW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszprincipal, (void*)(uintptr_t)pszpackage, (uint32_t)fcredentialuse, (void*)(uintptr_t)pvlogonid, (void*)(uintptr_t)pauthdata, (void*)(uintptr_t)pgetkeyfn, (void*)(uintptr_t)pvgetkeyargument, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AddCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong hcredentials, jlong pszprincipal, jlong pszpackage, jint fcredentialuse, jlong pauthdata, jlong pgetkeyfn, jlong pvgetkeyargument, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddCredentialsA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcredentials, (void*)(uintptr_t)pszprincipal, (void*)(uintptr_t)pszpackage, (uint32_t)fcredentialuse, (void*)(uintptr_t)pauthdata, (void*)(uintptr_t)pgetkeyfn, (void*)(uintptr_t)pvgetkeyargument, (void*)(uintptr_t)ptsexpiry) : -1;
#else
    (void)hcredentials;
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AddCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong hcredentials, jlong pszprincipal, jlong pszpackage, jint fcredentialuse, jlong pauthdata, jlong pgetkeyfn, jlong pvgetkeyargument, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddCredentialsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcredentials, (void*)(uintptr_t)pszprincipal, (void*)(uintptr_t)pszpackage, (uint32_t)fcredentialuse, (void*)(uintptr_t)pauthdata, (void*)(uintptr_t)pgetkeyfn, (void*)(uintptr_t)pvgetkeyargument, (void*)(uintptr_t)ptsexpiry) : -1;
#else
    (void)hcredentials;
    (void)pszprincipal;
    (void)pszpackage;
    (void)fcredentialuse;
    (void)pauthdata;
    (void)pgetkeyfn;
    (void)pvgetkeyargument;
    (void)ptsexpiry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AddSecurityPackageA(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSecurityPackageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)poptions) : -1;
#else
    (void)pszpackagename;
    (void)poptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AddSecurityPackageW(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSecurityPackageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)poptions) : -1;
#else
    (void)pszpackagename;
    (void)poptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1ApplyControlToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pinput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyControlToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput) : -1;
#else
    (void)phcontext;
    (void)pinput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditComputeEffectivePolicyBySid(JNIEnv* km_env, jclass km_clazz, jlong psid, jlong psubcategoryguids, jint dwpolicycount, jlong ppauditpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditComputeEffectivePolicyBySid");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid, (void*)(uintptr_t)psubcategoryguids, (uint32_t)dwpolicycount, (void*)(uintptr_t)ppauditpolicy) : false;
#else
    (void)psid;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditComputeEffectivePolicyByToken(JNIEnv* km_env, jclass km_clazz, jlong htokenhandle, jlong psubcategoryguids, jint dwpolicycount, jlong ppauditpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditComputeEffectivePolicyByToken");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htokenhandle, (void*)(uintptr_t)psubcategoryguids, (uint32_t)dwpolicycount, (void*)(uintptr_t)ppauditpolicy) : false;
#else
    (void)htokenhandle;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditEnumerateCategories(JNIEnv* km_env, jclass km_clazz, jlong ppauditcategoriesarray, jlong pdwcountreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditEnumerateCategories");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppauditcategoriesarray, (void*)(uintptr_t)pdwcountreturned) : false;
#else
    (void)ppauditcategoriesarray;
    (void)pdwcountreturned;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditEnumeratePerUserPolicy(JNIEnv* km_env, jclass km_clazz, jlong ppauditsidarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditEnumeratePerUserPolicy");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppauditsidarray) : false;
#else
    (void)ppauditsidarray;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditEnumerateSubCategories(JNIEnv* km_env, jclass km_clazz, jlong pauditcategoryguid, jboolean bretrieveallsubcategories, jlong ppauditsubcategoriesarray, jlong pdwcountreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditEnumerateSubCategories");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauditcategoryguid, (bool)bretrieveallsubcategories, (void*)(uintptr_t)ppauditsubcategoriesarray, (void*)(uintptr_t)pdwcountreturned) : false;
#else
    (void)pauditcategoryguid;
    (void)bretrieveallsubcategories;
    (void)ppauditsubcategoriesarray;
    (void)pdwcountreturned;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditFree(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)buffer);
#else
    (void)buffer;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditLookupCategoryGuidFromCategoryId(JNIEnv* km_env, jclass km_clazz, jint auditcategoryid, jlong pauditcategoryguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryGuidFromCategoryId");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)auditcategoryid, (void*)(uintptr_t)pauditcategoryguid) : false;
#else
    (void)auditcategoryid;
    (void)pauditcategoryguid;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditLookupCategoryIdFromCategoryGuid(JNIEnv* km_env, jclass km_clazz, jlong pauditcategoryguid, jlong pauditcategoryid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryIdFromCategoryGuid");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauditcategoryguid, (void*)(uintptr_t)pauditcategoryid) : false;
#else
    (void)pauditcategoryguid;
    (void)pauditcategoryid;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditLookupCategoryNameA(JNIEnv* km_env, jclass km_clazz, jlong pauditcategoryguid, jlong ppszcategoryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryNameA");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauditcategoryguid, (void*)(uintptr_t)ppszcategoryname) : false;
#else
    (void)pauditcategoryguid;
    (void)ppszcategoryname;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditLookupCategoryNameW(JNIEnv* km_env, jclass km_clazz, jlong pauditcategoryguid, jlong ppszcategoryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupCategoryNameW");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauditcategoryguid, (void*)(uintptr_t)ppszcategoryname) : false;
#else
    (void)pauditcategoryguid;
    (void)ppszcategoryname;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditLookupSubCategoryNameA(JNIEnv* km_env, jclass km_clazz, jlong pauditsubcategoryguid, jlong ppszsubcategoryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupSubCategoryNameA");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauditsubcategoryguid, (void*)(uintptr_t)ppszsubcategoryname) : false;
#else
    (void)pauditsubcategoryguid;
    (void)ppszsubcategoryname;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditLookupSubCategoryNameW(JNIEnv* km_env, jclass km_clazz, jlong pauditsubcategoryguid, jlong ppszsubcategoryname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditLookupSubCategoryNameW");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauditsubcategoryguid, (void*)(uintptr_t)ppszsubcategoryname) : false;
#else
    (void)pauditsubcategoryguid;
    (void)ppszsubcategoryname;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditQueryGlobalSaclA(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong acl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQueryGlobalSaclA");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)acl) : false;
#else
    (void)objecttypename;
    (void)acl;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditQueryGlobalSaclW(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong acl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQueryGlobalSaclW");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)acl) : false;
#else
    (void)objecttypename;
    (void)acl;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditQueryPerUserPolicy(JNIEnv* km_env, jclass km_clazz, jlong psid, jlong psubcategoryguids, jint dwpolicycount, jlong ppauditpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQueryPerUserPolicy");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid, (void*)(uintptr_t)psubcategoryguids, (uint32_t)dwpolicycount, (void*)(uintptr_t)ppauditpolicy) : false;
#else
    (void)psid;
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditQuerySecurity(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQuerySecurity");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)ppsecuritydescriptor) : false;
#else
    (void)securityinformation;
    (void)ppsecuritydescriptor;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditQuerySystemPolicy(JNIEnv* km_env, jclass km_clazz, jlong psubcategoryguids, jint dwpolicycount, jlong ppauditpolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditQuerySystemPolicy");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psubcategoryguids, (uint32_t)dwpolicycount, (void*)(uintptr_t)ppauditpolicy) : false;
#else
    (void)psubcategoryguids;
    (void)dwpolicycount;
    (void)ppauditpolicy;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditSetGlobalSaclA(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong acl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetGlobalSaclA");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)acl) : false;
#else
    (void)objecttypename;
    (void)acl;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditSetGlobalSaclW(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong acl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetGlobalSaclW");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)acl) : false;
#else
    (void)objecttypename;
    (void)acl;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditSetPerUserPolicy(JNIEnv* km_env, jclass km_clazz, jlong psid, jlong pauditpolicy, jint dwpolicycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetPerUserPolicy");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid, (void*)(uintptr_t)pauditpolicy, (uint32_t)dwpolicycount) : false;
#else
    (void)psid;
    (void)pauditpolicy;
    (void)dwpolicycount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditSetSecurity(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetSecurity");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor) : false;
#else
    (void)securityinformation;
    (void)psecuritydescriptor;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1AuditSetSystemPolicy(JNIEnv* km_env, jclass km_clazz, jlong pauditpolicy, jint dwpolicycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuditSetSystemPolicy");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauditpolicy, (uint32_t)dwpolicycount) : false;
#else
    (void)pauditpolicy;
    (void)dwpolicycount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1ChangeAccountPasswordA(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong pszdomainname, jlong pszaccountname, jlong pszoldpassword, jlong psznewpassword, jboolean bimpersonating, jint dwreserved, jlong poutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeAccountPasswordA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pszaccountname, (void*)(uintptr_t)pszoldpassword, (void*)(uintptr_t)psznewpassword, (bool)bimpersonating, (uint32_t)dwreserved, (void*)(uintptr_t)poutput) : -1;
#else
    (void)pszpackagename;
    (void)pszdomainname;
    (void)pszaccountname;
    (void)pszoldpassword;
    (void)psznewpassword;
    (void)bimpersonating;
    (void)dwreserved;
    (void)poutput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1ChangeAccountPasswordW(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong pszdomainname, jlong pszaccountname, jlong pszoldpassword, jlong psznewpassword, jboolean bimpersonating, jint dwreserved, jlong poutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeAccountPasswordW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pszaccountname, (void*)(uintptr_t)pszoldpassword, (void*)(uintptr_t)psznewpassword, (bool)bimpersonating, (uint32_t)dwreserved, (void*)(uintptr_t)poutput) : -1;
#else
    (void)pszpackagename;
    (void)pszdomainname;
    (void)pszaccountname;
    (void)pszoldpassword;
    (void)psznewpassword;
    (void)bimpersonating;
    (void)dwreserved;
    (void)poutput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1CompleteAuthToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong ptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompleteAuthToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)ptoken) : -1;
#else
    (void)phcontext;
    (void)ptoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1CredMarshalTargetInfo(JNIEnv* km_env, jclass km_clazz, jlong intargetinfo, jlong buffer, jlong buffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredMarshalTargetInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)intargetinfo, (void*)(uintptr_t)buffer, (void*)(uintptr_t)buffersize) : -1;
#else
    (void)intargetinfo;
    (void)buffer;
    (void)buffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1CredUnmarshalTargetInfo(JNIEnv* km_env, jclass km_clazz, jlong buffer, jint buffersize, jlong rettargetinfo, jlong retactualsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CredUnmarshalTargetInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer, (uint32_t)buffersize, (void*)(uintptr_t)rettargetinfo, (void*)(uintptr_t)retactualsize) : -1;
#else
    (void)buffer;
    (void)buffersize;
    (void)rettargetinfo;
    (void)retactualsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1DecryptMessage(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pmessage, jint messageseqno, jlong pfqop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecryptMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno, (void*)(uintptr_t)pfqop) : -1;
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1DeleteSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSecurityContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext) : -1;
#else
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1DeleteSecurityPackageA(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSecurityPackageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackagename) : -1;
#else
    (void)pszpackagename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1DeleteSecurityPackageW(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSecurityPackageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackagename) : -1;
#else
    (void)pszpackagename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1EncryptMessage(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fqop, jlong pmessage, jint messageseqno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncryptMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fqop, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno) : -1;
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1EnumerateSecurityPackagesA(JNIEnv* km_env, jclass km_clazz, jlong pcpackages, jlong pppackageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateSecurityPackagesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcpackages, (void*)(uintptr_t)pppackageinfo) : -1;
#else
    (void)pcpackages;
    (void)pppackageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1EnumerateSecurityPackagesW(JNIEnv* km_env, jclass km_clazz, jlong pcpackages, jlong pppackageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateSecurityPackagesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcpackages, (void*)(uintptr_t)pppackageinfo) : -1;
#else
    (void)pcpackages;
    (void)pppackageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1ExportSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fflags, jlong ppackedcontext, jlong ptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportSecurityContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fflags, (void*)(uintptr_t)ppackedcontext, (void*)(uintptr_t)ptoken) : -1;
#else
    (void)phcontext;
    (void)fflags;
    (void)ppackedcontext;
    (void)ptoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1FreeContextBuffer(JNIEnv* km_env, jclass km_clazz, jlong pvcontextbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeContextBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvcontextbuffer) : -1;
#else
    (void)pvcontextbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1FreeCredentialsHandle(JNIEnv* km_env, jclass km_clazz, jlong phcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeCredentialsHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential) : -1;
#else
    (void)phcredential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1GetComputerObjectNameA(JNIEnv* km_env, jclass km_clazz, jint nameformat, jlong lpnamebuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerObjectNameA");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nameformat, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)nsize) : false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1GetComputerObjectNameW(JNIEnv* km_env, jclass km_clazz, jint nameformat, jlong lpnamebuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetComputerObjectNameW");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nameformat, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)nsize) : false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1GetUserNameExA(JNIEnv* km_env, jclass km_clazz, jint nameformat, jlong lpnamebuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameExA");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nameformat, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)nsize) : false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1GetUserNameExW(JNIEnv* km_env, jclass km_clazz, jint nameformat, jlong lpnamebuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserNameExW");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)nameformat, (void*)(uintptr_t)lpnamebuffer, (void*)(uintptr_t)nsize) : false;
#else
    (void)nameformat;
    (void)lpnamebuffer;
    (void)nsize;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1ImpersonateSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateSecurityContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext) : -1;
#else
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1ImportSecurityContextA(JNIEnv* km_env, jclass km_clazz, jlong pszpackage, jlong ppackedcontext, jlong token, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportSecurityContextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackage, (void*)(uintptr_t)ppackedcontext, (void*)(uintptr_t)token, (void*)(uintptr_t)phcontext) : -1;
#else
    (void)pszpackage;
    (void)ppackedcontext;
    (void)token;
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1ImportSecurityContextW(JNIEnv* km_env, jclass km_clazz, jlong pszpackage, jlong ppackedcontext, jlong token, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImportSecurityContextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackage, (void*)(uintptr_t)ppackedcontext, (void*)(uintptr_t)token, (void*)(uintptr_t)phcontext) : -1;
#else
    (void)pszpackage;
    (void)ppackedcontext;
    (void)token;
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1InitSecurityInterfaceA(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitSecurityInterfaceA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1InitSecurityInterfaceW(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitSecurityInterfaceW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1InitializeSecurityContextA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSecurityContextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1InitializeSecurityContextW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSecurityContextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaAddAccountRights(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong accountsid, jlong userrights, jint countofrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaAddAccountRights");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)accountsid, (void*)(uintptr_t)userrights, (uint32_t)countofrights) : -1;
#else
    (void)policyhandle;
    (void)accountsid;
    (void)userrights;
    (void)countofrights;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaCallAuthenticationPackage(JNIEnv* km_env, jclass km_clazz, jlong lsahandle, jint authenticationpackage, jlong protocolsubmitbuffer, jint submitbufferlength, jlong protocolreturnbuffer, jlong returnbufferlength, jlong protocolstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaCallAuthenticationPackage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lsahandle, (uint32_t)authenticationpackage, (void*)(uintptr_t)protocolsubmitbuffer, (uint32_t)submitbufferlength, (void*)(uintptr_t)protocolreturnbuffer, (void*)(uintptr_t)returnbufferlength, (void*)(uintptr_t)protocolstatus) : -1;
#else
    (void)lsahandle;
    (void)authenticationpackage;
    (void)protocolsubmitbuffer;
    (void)submitbufferlength;
    (void)protocolreturnbuffer;
    (void)returnbufferlength;
    (void)protocolstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaClose(JNIEnv* km_env, jclass km_clazz, jlong objecthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)objecthandle) : -1;
#else
    (void)objecthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaConnectUntrusted(JNIEnv* km_env, jclass km_clazz, jlong lsahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaConnectUntrusted");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lsahandle) : -1;
#else
    (void)lsahandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaCreateTrustedDomainEx(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomaininformation, jlong authenticationinformation, jint desiredaccess, jlong trusteddomainhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaCreateTrustedDomainEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomaininformation, (void*)(uintptr_t)authenticationinformation, (uint32_t)desiredaccess, (void*)(uintptr_t)trusteddomainhandle) : -1;
#else
    (void)policyhandle;
    (void)trusteddomaininformation;
    (void)authenticationinformation;
    (void)desiredaccess;
    (void)trusteddomainhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaDeleteTrustedDomain(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaDeleteTrustedDomain");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainsid) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaDeregisterLogonProcess(JNIEnv* km_env, jclass km_clazz, jlong lsahandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaDeregisterLogonProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lsahandle) : -1;
#else
    (void)lsahandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaEnumerateAccountRights(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong accountsid, jlong userrights, jlong countofrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateAccountRights");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)accountsid, (void*)(uintptr_t)userrights, (void*)(uintptr_t)countofrights) : -1;
#else
    (void)policyhandle;
    (void)accountsid;
    (void)userrights;
    (void)countofrights;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaEnumerateAccountsWithUserRight(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong userright, jlong buffer, jlong countreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateAccountsWithUserRight");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)userright, (void*)(uintptr_t)buffer, (void*)(uintptr_t)countreturned) : -1;
#else
    (void)policyhandle;
    (void)userright;
    (void)buffer;
    (void)countreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaEnumerateLogonSessions(JNIEnv* km_env, jclass km_clazz, jlong logonsessioncount, jlong logonsessionlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateLogonSessions");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)logonsessioncount, (void*)(uintptr_t)logonsessionlist) : -1;
#else
    (void)logonsessioncount;
    (void)logonsessionlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaEnumerateTrustedDomains(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong enumerationcontext, jlong buffer, jint preferedmaximumlength, jlong countreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateTrustedDomains");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)enumerationcontext, (void*)(uintptr_t)buffer, (uint32_t)preferedmaximumlength, (void*)(uintptr_t)countreturned) : -1;
#else
    (void)policyhandle;
    (void)enumerationcontext;
    (void)buffer;
    (void)preferedmaximumlength;
    (void)countreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaEnumerateTrustedDomainsEx(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong enumerationcontext, jlong buffer, jint preferedmaximumlength, jlong countreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaEnumerateTrustedDomainsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)enumerationcontext, (void*)(uintptr_t)buffer, (uint32_t)preferedmaximumlength, (void*)(uintptr_t)countreturned) : -1;
#else
    (void)policyhandle;
    (void)enumerationcontext;
    (void)buffer;
    (void)preferedmaximumlength;
    (void)countreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaFreeMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer) : -1;
#else
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaFreeReturnBuffer(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaFreeReturnBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)buffer) : -1;
#else
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaGetAppliedCAPIDs(JNIEnv* km_env, jclass km_clazz, jlong systemname, jlong capids, jlong capidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaGetAppliedCAPIDs");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)systemname, (void*)(uintptr_t)capids, (void*)(uintptr_t)capidcount) : -1;
#else
    (void)systemname;
    (void)capids;
    (void)capidcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaGetLogonSessionData(JNIEnv* km_env, jclass km_clazz, jlong logonid, jlong pplogonsessiondata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaGetLogonSessionData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)logonid, (void*)(uintptr_t)pplogonsessiondata) : -1;
#else
    (void)logonid;
    (void)pplogonsessiondata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaLookupAuthenticationPackage(JNIEnv* km_env, jclass km_clazz, jlong lsahandle, jlong packagename, jlong authenticationpackage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupAuthenticationPackage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lsahandle, (void*)(uintptr_t)packagename, (void*)(uintptr_t)authenticationpackage) : -1;
#else
    (void)lsahandle;
    (void)packagename;
    (void)authenticationpackage;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaLookupNames(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint count, jlong names, jlong referenceddomains, jlong sids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupNames");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (uint32_t)count, (void*)(uintptr_t)names, (void*)(uintptr_t)referenceddomains, (void*)(uintptr_t)sids) : -1;
#else
    (void)policyhandle;
    (void)count;
    (void)names;
    (void)referenceddomains;
    (void)sids;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaLookupNames2(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint flags, jint count, jlong names, jlong referenceddomains, jlong sids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupNames2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (uint32_t)flags, (uint32_t)count, (void*)(uintptr_t)names, (void*)(uintptr_t)referenceddomains, (void*)(uintptr_t)sids) : -1;
#else
    (void)policyhandle;
    (void)flags;
    (void)count;
    (void)names;
    (void)referenceddomains;
    (void)sids;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaLookupSids(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint count, jlong sids, jlong referenceddomains, jlong names) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupSids");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (uint32_t)count, (void*)(uintptr_t)sids, (void*)(uintptr_t)referenceddomains, (void*)(uintptr_t)names) : -1;
#else
    (void)policyhandle;
    (void)count;
    (void)sids;
    (void)referenceddomains;
    (void)names;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaLookupSids2(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint lookupoptions, jint count, jlong sids, jlong referenceddomains, jlong names) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaLookupSids2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (uint32_t)lookupoptions, (uint32_t)count, (void*)(uintptr_t)sids, (void*)(uintptr_t)referenceddomains, (void*)(uintptr_t)names) : -1;
#else
    (void)policyhandle;
    (void)lookupoptions;
    (void)count;
    (void)sids;
    (void)referenceddomains;
    (void)names;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaNtStatusToWinError(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaNtStatusToWinError");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)status) : 0;
#else
    (void)status;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaOpenPolicy(JNIEnv* km_env, jclass km_clazz, jlong systemname, jlong objectattributes, jint desiredaccess, jlong policyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaOpenPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)systemname, (void*)(uintptr_t)objectattributes, (uint32_t)desiredaccess, (void*)(uintptr_t)policyhandle) : -1;
#else
    (void)systemname;
    (void)objectattributes;
    (void)desiredaccess;
    (void)policyhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaOpenTrustedDomainByName(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint desiredaccess, jlong trusteddomainhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaOpenTrustedDomainByName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (uint32_t)desiredaccess, (void*)(uintptr_t)trusteddomainhandle) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)desiredaccess;
    (void)trusteddomainhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaQueryCAPs(JNIEnv* km_env, jclass km_clazz, jlong capids, jint capidcount, jlong caps, jlong capcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryCAPs");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)capids, (uint32_t)capidcount, (void*)(uintptr_t)caps, (void*)(uintptr_t)capcount) : -1;
#else
    (void)capids;
    (void)capidcount;
    (void)caps;
    (void)capcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaQueryDomainInformationPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryDomainInformationPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (int32_t)informationclass, (void*)(uintptr_t)buffer) : -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaQueryForestTrustInformation(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jlong foresttrustinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryForestTrustInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (void*)(uintptr_t)foresttrustinfo) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)foresttrustinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaQueryForestTrustInformation2(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint highestrecordtype, jlong foresttrustinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryForestTrustInformation2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (int32_t)highestrecordtype, (void*)(uintptr_t)foresttrustinfo) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)highestrecordtype;
    (void)foresttrustinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaQueryInformationPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryInformationPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (int32_t)informationclass, (void*)(uintptr_t)buffer) : -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaQueryTrustedDomainInfo(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainsid, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryTrustedDomainInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainsid, (int32_t)informationclass, (void*)(uintptr_t)buffer) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaQueryTrustedDomainInfoByName(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaQueryTrustedDomainInfoByName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (int32_t)informationclass, (void*)(uintptr_t)buffer) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaRegisterLogonProcess(JNIEnv* km_env, jclass km_clazz, jlong logonprocessname, jlong lsahandle, jlong securitymode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRegisterLogonProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)logonprocessname, (void*)(uintptr_t)lsahandle, (void*)(uintptr_t)securitymode) : -1;
#else
    (void)logonprocessname;
    (void)lsahandle;
    (void)securitymode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaRegisterPolicyChangeNotification(JNIEnv* km_env, jclass km_clazz, jint informationclass, jlong notificationeventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRegisterPolicyChangeNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)informationclass, (void*)(uintptr_t)notificationeventhandle) : -1;
#else
    (void)informationclass;
    (void)notificationeventhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaRemoveAccountRights(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong accountsid, jboolean allrights, jlong userrights, jint countofrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRemoveAccountRights");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)accountsid, (bool)allrights, (void*)(uintptr_t)userrights, (uint32_t)countofrights) : -1;
#else
    (void)policyhandle;
    (void)accountsid;
    (void)allrights;
    (void)userrights;
    (void)countofrights;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaRetrievePrivateData(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong keyname, jlong privatedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaRetrievePrivateData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)keyname, (void*)(uintptr_t)privatedata) : -1;
#else
    (void)policyhandle;
    (void)keyname;
    (void)privatedata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaSetCAPs(JNIEnv* km_env, jclass km_clazz, jlong capdns, jint capdncount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetCAPs");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)capdns, (uint32_t)capdncount, (uint32_t)flags) : -1;
#else
    (void)capdns;
    (void)capdncount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaSetDomainInformationPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetDomainInformationPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (int32_t)informationclass, (void*)(uintptr_t)buffer) : -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaSetForestTrustInformation(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jlong foresttrustinfo, jboolean checkonly, jlong collisioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetForestTrustInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (void*)(uintptr_t)foresttrustinfo, (bool)checkonly, (void*)(uintptr_t)collisioninfo) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)foresttrustinfo;
    (void)checkonly;
    (void)collisioninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaSetForestTrustInformation2(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint highestrecordtype, jlong foresttrustinfo, jboolean checkonly, jlong collisioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetForestTrustInformation2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (int32_t)highestrecordtype, (void*)(uintptr_t)foresttrustinfo, (bool)checkonly, (void*)(uintptr_t)collisioninfo) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)highestrecordtype;
    (void)foresttrustinfo;
    (void)checkonly;
    (void)collisioninfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaSetInformationPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetInformationPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (int32_t)informationclass, (void*)(uintptr_t)buffer) : -1;
#else
    (void)policyhandle;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaSetTrustedDomainInfoByName(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainname, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetTrustedDomainInfoByName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainname, (int32_t)informationclass, (void*)(uintptr_t)buffer) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainname;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaSetTrustedDomainInformation(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong trusteddomainsid, jint informationclass, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaSetTrustedDomainInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)trusteddomainsid, (int32_t)informationclass, (void*)(uintptr_t)buffer) : -1;
#else
    (void)policyhandle;
    (void)trusteddomainsid;
    (void)informationclass;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaStorePrivateData(JNIEnv* km_env, jclass km_clazz, jlong policyhandle, jlong keyname, jlong privatedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaStorePrivateData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)policyhandle, (void*)(uintptr_t)keyname, (void*)(uintptr_t)privatedata) : -1;
#else
    (void)policyhandle;
    (void)keyname;
    (void)privatedata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1LsaUnregisterPolicyChangeNotification(JNIEnv* km_env, jclass km_clazz, jint informationclass, jlong notificationeventhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsaUnregisterPolicyChangeNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)informationclass, (void*)(uintptr_t)notificationeventhandle) : -1;
#else
    (void)informationclass;
    (void)notificationeventhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1MakeSignature(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fqop, jlong pmessage, jint messageseqno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSignature");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fqop, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno) : -1;
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QueryContextAttributesA(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QueryContextAttributesExA(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QueryContextAttributesExW(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QueryContextAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryContextAttributesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QueryCredentialsAttributesA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QueryCredentialsAttributesExA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QueryCredentialsAttributesExW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QueryCredentialsAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryCredentialsAttributesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QuerySecurityContextToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityContextToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)token) : -1;
#else
    (void)phcontext;
    (void)token;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QuerySecurityPackageInfoA(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong pppackageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityPackageInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)pppackageinfo) : -1;
#else
    (void)pszpackagename;
    (void)pppackageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1QuerySecurityPackageInfoW(JNIEnv* km_env, jclass km_clazz, jlong pszpackagename, jlong pppackageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityPackageInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)pppackageinfo) : -1;
#else
    (void)pszpackagename;
    (void)pppackageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1RevertSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevertSecurityContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext) : -1;
#else
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1RtlDecryptMemory(JNIEnv* km_env, jclass km_clazz, jlong memory, jint memorysize, jint optionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemFunction041");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)memory, (uint32_t)memorysize, (uint32_t)optionflags) : -1;
#else
    (void)memory;
    (void)memorysize;
    (void)optionflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1RtlEncryptMemory(JNIEnv* km_env, jclass km_clazz, jlong memory, jint memorysize, jint optionflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemFunction040");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)memory, (uint32_t)memorysize, (uint32_t)optionflags) : -1;
#else
    (void)memory;
    (void)memorysize;
    (void)optionflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1RtlGenRandom(JNIEnv* km_env, jclass km_clazz, jlong randombuffer, jint randombufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SystemFunction036");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)randombuffer, (uint32_t)randombufferlength) : false;
#else
    (void)randombuffer;
    (void)randombufferlength;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLAcquireGenuineTicket(JNIEnv* km_env, jclass km_clazz, jlong ppticketblob, jlong pcbticketblob, jlong pwsztemplateid, jlong pwszserverurl, jlong pwszclienttoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLAcquireGenuineTicket");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppticketblob, (void*)(uintptr_t)pcbticketblob, (void*)(uintptr_t)pwsztemplateid, (void*)(uintptr_t)pwszserverurl, (void*)(uintptr_t)pwszclienttoken) : -1;
#else
    (void)ppticketblob;
    (void)pcbticketblob;
    (void)pwsztemplateid;
    (void)pwszserverurl;
    (void)pwszclienttoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLActivateProduct(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jint cbappspecificdata, jlong pvappspecificdata, jlong pactivationinfo, jlong pwszproxyserver, jshort wproxyport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLActivateProduct");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (uint32_t)cbappspecificdata, (void*)(uintptr_t)pvappspecificdata, (void*)(uintptr_t)pactivationinfo, (void*)(uintptr_t)pwszproxyserver, (uint16_t)wproxyport) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)cbappspecificdata;
    (void)pvappspecificdata;
    (void)pactivationinfo;
    (void)pwszproxyserver;
    (void)wproxyport;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLClose(JNIEnv* km_env, jclass km_clazz, jlong hslc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc) : -1;
#else
    (void)hslc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLConsumeRight(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pappid, jlong pproductskuid, jlong pwszrightname, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLConsumeRight");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pappid, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pwszrightname, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)hslc;
    (void)pappid;
    (void)pproductskuid;
    (void)pwszrightname;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLDepositOfflineConfirmationId(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pwszinstallationid, jlong pwszconfirmationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLDepositOfflineConfirmationId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pwszinstallationid, (void*)(uintptr_t)pwszconfirmationid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pwszinstallationid;
    (void)pwszconfirmationid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLDepositOfflineConfirmationIdEx(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pactivationinfo, jlong pwszinstallationid, jlong pwszconfirmationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLDepositOfflineConfirmationIdEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pactivationinfo, (void*)(uintptr_t)pwszinstallationid, (void*)(uintptr_t)pwszconfirmationid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pactivationinfo;
    (void)pwszinstallationid;
    (void)pwszconfirmationid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLFireEvent(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszeventid, jlong papplicationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLFireEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszeventid, (void*)(uintptr_t)papplicationid) : -1;
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGenerateOfflineInstallationId(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong ppwszinstallationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGenerateOfflineInstallationId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)ppwszinstallationid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)ppwszinstallationid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGenerateOfflineInstallationIdEx(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pactivationinfo, jlong ppwszinstallationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGenerateOfflineInstallationIdEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pactivationinfo, (void*)(uintptr_t)ppwszinstallationid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pactivationinfo;
    (void)ppwszinstallationid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetApplicationInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong papplicationid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetApplicationInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)papplicationid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue) : -1;
#else
    (void)hslc;
    (void)papplicationid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetGenuineInformation(JNIEnv* km_env, jclass km_clazz, jlong pqueryid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetGenuineInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pqueryid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue) : -1;
#else
    (void)pqueryid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetInstalledProductKeyIds(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pnproductkeyids, jlong ppproductkeyids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetInstalledProductKeyIds");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pnproductkeyids, (void*)(uintptr_t)ppproductkeyids) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pnproductkeyids;
    (void)ppproductkeyids;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetLicense(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong plicensefileid, jlong pcblicensefile, jlong ppblicensefile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicense");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)plicensefileid, (void*)(uintptr_t)pcblicensefile, (void*)(uintptr_t)ppblicensefile) : -1;
#else
    (void)hslc;
    (void)plicensefileid;
    (void)pcblicensefile;
    (void)ppblicensefile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetLicenseFileId(JNIEnv* km_env, jclass km_clazz, jlong hslc, jint cblicenseblob, jlong pblicenseblob, jlong plicensefileid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicenseFileId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (uint32_t)cblicenseblob, (void*)(uintptr_t)pblicenseblob, (void*)(uintptr_t)plicensefileid) : -1;
#else
    (void)hslc;
    (void)cblicenseblob;
    (void)pblicenseblob;
    (void)plicensefileid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetLicenseInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong psllicenseid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicenseInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)psllicenseid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue) : -1;
#else
    (void)hslc;
    (void)psllicenseid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetLicensingStatusInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pappid, jlong pproductskuid, jlong pwszrightname, jlong pnstatuscount, jlong pplicensingstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetLicensingStatusInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pappid, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pwszrightname, (void*)(uintptr_t)pnstatuscount, (void*)(uintptr_t)pplicensingstatus) : -1;
#else
    (void)hslc;
    (void)pappid;
    (void)pproductskuid;
    (void)pwszrightname;
    (void)pnstatuscount;
    (void)pplicensingstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetPKeyId(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszpkeyalgorithm, jlong pwszpkeystring, jint cbpkeyspecificdata, jlong pbpkeyspecificdata, jlong ppkeyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPKeyId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszpkeyalgorithm, (void*)(uintptr_t)pwszpkeystring, (uint32_t)cbpkeyspecificdata, (void*)(uintptr_t)pbpkeyspecificdata, (void*)(uintptr_t)ppkeyid) : -1;
#else
    (void)hslc;
    (void)pwszpkeyalgorithm;
    (void)pwszpkeystring;
    (void)cbpkeyspecificdata;
    (void)pbpkeyspecificdata;
    (void)ppkeyid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetPKeyInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong ppkeyid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPKeyInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)ppkeyid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue) : -1;
#else
    (void)hslc;
    (void)ppkeyid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetPolicyInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPolicyInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue) : -1;
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetPolicyInformationDWORD(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszvaluename, jlong pdwvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetPolicyInformationDWORD");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pdwvalue) : -1;
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pdwvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetProductSkuInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetProductSkuInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetReferralInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jint ereferraltype, jlong pskuorappid, jlong pwszvaluename, jlong ppwszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetReferralInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (int32_t)ereferraltype, (void*)(uintptr_t)pskuorappid, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)ppwszvalue) : -1;
#else
    (void)hslc;
    (void)ereferraltype;
    (void)pskuorappid;
    (void)pwszvaluename;
    (void)ppwszvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetSLIDList(JNIEnv* km_env, jclass km_clazz, jlong hslc, jint equeryidtype, jlong pqueryid, jint ereturnidtype, jlong pnreturnids, jlong ppreturnids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetSLIDList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (int32_t)equeryidtype, (void*)(uintptr_t)pqueryid, (int32_t)ereturnidtype, (void*)(uintptr_t)pnreturnids, (void*)(uintptr_t)ppreturnids) : -1;
#else
    (void)hslc;
    (void)equeryidtype;
    (void)pqueryid;
    (void)ereturnidtype;
    (void)pnreturnids;
    (void)ppreturnids;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetServerStatus(JNIEnv* km_env, jclass km_clazz, jlong pwszserverurl, jlong pwszacquisitiontype, jlong pwszproxyserver, jshort wproxyport, jlong phrstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slcext.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetServerStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszserverurl, (void*)(uintptr_t)pwszacquisitiontype, (void*)(uintptr_t)pwszproxyserver, (uint16_t)wproxyport, (void*)(uintptr_t)phrstatus) : -1;
#else
    (void)pwszserverurl;
    (void)pwszacquisitiontype;
    (void)pwszproxyserver;
    (void)wproxyport;
    (void)phrstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetServiceInformation(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetServiceInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue) : -1;
#else
    (void)hslc;
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetWindowsInformation(JNIEnv* km_env, jclass km_clazz, jlong pwszvaluename, jlong pedatatype, jlong pcbvalue, jlong ppbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetWindowsInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pedatatype, (void*)(uintptr_t)pcbvalue, (void*)(uintptr_t)ppbvalue) : -1;
#else
    (void)pwszvaluename;
    (void)pedatatype;
    (void)pcbvalue;
    (void)ppbvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLGetWindowsInformationDWORD(JNIEnv* km_env, jclass km_clazz, jlong pwszvaluename, jlong pdwvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLGetWindowsInformationDWORD");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszvaluename, (void*)(uintptr_t)pdwvalue) : -1;
#else
    (void)pwszvaluename;
    (void)pdwvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLInstallLicense(JNIEnv* km_env, jclass km_clazz, jlong hslc, jint cblicenseblob, jlong pblicenseblob, jlong plicensefileid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLInstallLicense");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (uint32_t)cblicenseblob, (void*)(uintptr_t)pblicenseblob, (void*)(uintptr_t)plicensefileid) : -1;
#else
    (void)hslc;
    (void)cblicenseblob;
    (void)pblicenseblob;
    (void)plicensefileid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLInstallProofOfPurchase(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszpkeyalgorithm, jlong pwszpkeystring, jint cbpkeyspecificdata, jlong pbpkeyspecificdata, jlong ppkeyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLInstallProofOfPurchase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszpkeyalgorithm, (void*)(uintptr_t)pwszpkeystring, (uint32_t)cbpkeyspecificdata, (void*)(uintptr_t)pbpkeyspecificdata, (void*)(uintptr_t)ppkeyid) : -1;
#else
    (void)hslc;
    (void)pwszpkeyalgorithm;
    (void)pwszpkeystring;
    (void)cbpkeyspecificdata;
    (void)pbpkeyspecificdata;
    (void)ppkeyid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLIsGenuineLocal(JNIEnv* km_env, jclass km_clazz, jlong pappid, jlong pgenuinestate, jlong puioptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slwga.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLIsGenuineLocal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pappid, (void*)(uintptr_t)pgenuinestate, (void*)(uintptr_t)puioptions) : -1;
#else
    (void)pappid;
    (void)pgenuinestate;
    (void)puioptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLOpen(JNIEnv* km_env, jclass km_clazz, jlong phslc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLOpen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phslc) : -1;
#else
    (void)phslc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLQueryLicenseValueFromApp(JNIEnv* km_env, jclass km_clazz, jlong valuename, jlong valuetype, jlong databuffer, jint datasize, jlong resultdatasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-slapi-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLQueryLicenseValueFromApp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)valuename, (void*)(uintptr_t)valuetype, (void*)(uintptr_t)databuffer, (uint32_t)datasize, (void*)(uintptr_t)resultdatasize) : -1;
#else
    (void)valuename;
    (void)valuetype;
    (void)databuffer;
    (void)datasize;
    (void)resultdatasize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLRegisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszeventid, jlong papplicationid, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLRegisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszeventid, (void*)(uintptr_t)papplicationid, (void*)(uintptr_t)hevent) : -1;
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLSetCurrentProductKey(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pproductskuid, jlong pproductkeyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLSetCurrentProductKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pproductskuid, (void*)(uintptr_t)pproductkeyid) : -1;
#else
    (void)hslc;
    (void)pproductskuid;
    (void)pproductkeyid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLSetGenuineInformation(JNIEnv* km_env, jclass km_clazz, jlong pqueryid, jlong pwszvaluename, jint edatatype, jint cbvalue, jlong pbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLSetGenuineInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pqueryid, (void*)(uintptr_t)pwszvaluename, (uint32_t)edatatype, (uint32_t)cbvalue, (void*)(uintptr_t)pbvalue) : -1;
#else
    (void)pqueryid;
    (void)pwszvaluename;
    (void)edatatype;
    (void)cbvalue;
    (void)pbvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLUninstallLicense(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong plicensefileid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLUninstallLicense");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)plicensefileid) : -1;
#else
    (void)hslc;
    (void)plicensefileid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLUninstallProofOfPurchase(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong ppkeyid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLUninstallProofOfPurchase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)ppkeyid) : -1;
#else
    (void)hslc;
    (void)ppkeyid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SLUnregisterEvent(JNIEnv* km_env, jclass km_clazz, jlong hslc, jlong pwszeventid, jlong papplicationid, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("slc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SLUnregisterEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hslc, (void*)(uintptr_t)pwszeventid, (void*)(uintptr_t)papplicationid, (void*)(uintptr_t)hevent) : -1;
#else
    (void)hslc;
    (void)pwszeventid;
    (void)papplicationid;
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslAcceptSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong pinput, jint fcontextreq, jint targetdatarep, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslAcceptSecurityContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput, (uint32_t)fcontextreq, (uint32_t)targetdatarep, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslEnumerateProfilesA(JNIEnv* km_env, jclass km_clazz, jlong profilelist, jlong profilecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslEnumerateProfilesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)profilelist, (void*)(uintptr_t)profilecount) : -1;
#else
    (void)profilelist;
    (void)profilecount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslEnumerateProfilesW(JNIEnv* km_env, jclass km_clazz, jlong profilelist, jlong profilecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslEnumerateProfilesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)profilelist, (void*)(uintptr_t)profilecount) : -1;
#else
    (void)profilelist;
    (void)profilecount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslGetContextOption(JNIEnv* km_env, jclass km_clazz, jlong contexthandle, jint option, jlong value, jint size, jlong needed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslGetContextOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)contexthandle, (uint32_t)option, (void*)(uintptr_t)value, (uint32_t)size, (void*)(uintptr_t)needed) : -1;
#else
    (void)contexthandle;
    (void)option;
    (void)value;
    (void)size;
    (void)needed;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslGetProfilePackageA(JNIEnv* km_env, jclass km_clazz, jlong profilename, jlong packageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslGetProfilePackageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)profilename, (void*)(uintptr_t)packageinfo) : -1;
#else
    (void)profilename;
    (void)packageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslGetProfilePackageW(JNIEnv* km_env, jclass km_clazz, jlong profilename, jlong packageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslGetProfilePackageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)profilename, (void*)(uintptr_t)packageinfo) : -1;
#else
    (void)profilename;
    (void)packageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslIdentifyPackageA(JNIEnv* km_env, jclass km_clazz, jlong pinput, jlong packageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslIdentifyPackageA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinput, (void*)(uintptr_t)packageinfo) : -1;
#else
    (void)pinput;
    (void)packageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslIdentifyPackageW(JNIEnv* km_env, jclass km_clazz, jlong pinput, jlong packageinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslIdentifyPackageW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinput, (void*)(uintptr_t)packageinfo) : -1;
#else
    (void)pinput;
    (void)packageinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslInitializeSecurityContextA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslInitializeSecurityContextA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslInitializeSecurityContextW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslInitializeSecurityContextW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SaslSetContextOption(JNIEnv* km_env, jclass km_clazz, jlong contexthandle, jint option, jlong value, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SaslSetContextOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)contexthandle, (uint32_t)option, (void*)(uintptr_t)value, (uint32_t)size) : -1;
#else
    (void)contexthandle;
    (void)option;
    (void)value;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SendSAS(JNIEnv* km_env, jclass km_clazz, jint asuser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sas.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SendSAS");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)asuser);
#else
    (void)asuser;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SetContextAttributesA(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetContextAttributesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SetContextAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetContextAttributesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SetCredentialsAttributesA(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCredentialsAttributesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SetCredentialsAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcredential, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCredentialsAttributesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcredential, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer) : -1;
#else
    (void)phcredential;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SslCrackCertificate(JNIEnv* km_env, jclass km_clazz, jlong pbcertificate, jint cbcertificate, jint dwflags, jlong ppcertificate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslCrackCertificate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbcertificate, (uint32_t)cbcertificate, (uint32_t)dwflags, (void*)(uintptr_t)ppcertificate) : -1;
#else
    (void)pbcertificate;
    (void)cbcertificate;
    (void)dwflags;
    (void)ppcertificate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SslEmptyCacheA(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEmptyCacheA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargetname, (uint32_t)dwflags) : -1;
#else
    (void)psztargetname;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SslEmptyCacheW(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslEmptyCacheW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargetname, (uint32_t)dwflags) : -1;
#else
    (void)psztargetname;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SslFreeCertificate(JNIEnv* km_env, jclass km_clazz, jlong pcertificate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslFreeCertificate");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pcertificate);
#else
    (void)pcertificate;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SslGenerateRandomBits(JNIEnv* km_env, jclass km_clazz, jlong prandomdata, jint crandomdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGenerateRandomBits");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prandomdata, (int32_t)crandomdata);
#else
    (void)prandomdata;
    (void)crandomdata;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SslGetExtensions(JNIEnv* km_env, jclass km_clazz, jlong clienthello, jint clienthellobytesize, jlong genericextensions, jbyte genericextensionscount, jlong bytestoread, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint8_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetExtensions");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clienthello, (uint32_t)clienthellobytesize, (void*)(uintptr_t)genericextensions, (uint8_t)genericextensionscount, (void*)(uintptr_t)bytestoread, (int32_t)flags) : -1;
#else
    (void)clienthello;
    (void)clienthellobytesize;
    (void)genericextensions;
    (void)genericextensionscount;
    (void)bytestoread;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SslGetMaximumKeySize(JNIEnv* km_env, jclass km_clazz, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetMaximumKeySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)reserved) : 0;
#else
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SslGetServerIdentity(JNIEnv* km_env, jclass km_clazz, jlong clienthello, jint clienthellosize, jlong serveridentity, jlong serveridentitysize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("schannel.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SslGetServerIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clienthello, (uint32_t)clienthellosize, (void*)(uintptr_t)serveridentity, (void*)(uintptr_t)serveridentitysize, (uint32_t)flags) : -1;
#else
    (void)clienthello;
    (void)clienthellosize;
    (void)serveridentity;
    (void)serveridentitysize;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiCompareAuthIdentities(JNIEnv* km_env, jclass km_clazz, jlong authidentity1, jlong authidentity2, jlong samesupplieduser, jlong samesuppliedidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiCompareAuthIdentities");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authidentity1, (void*)(uintptr_t)authidentity2, (void*)(uintptr_t)samesupplieduser, (void*)(uintptr_t)samesuppliedidentity) : -1;
#else
    (void)authidentity1;
    (void)authidentity2;
    (void)samesupplieduser;
    (void)samesuppliedidentity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiCopyAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata, jlong authdatacopy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiCopyAuthIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authdata, (void*)(uintptr_t)authdatacopy) : -1;
#else
    (void)authdata;
    (void)authdatacopy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiDecryptAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong encryptedauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiDecryptAuthIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)encryptedauthdata) : -1;
#else
    (void)encryptedauthdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiDecryptAuthIdentityEx(JNIEnv* km_env, jclass km_clazz, jint options, jlong encryptedauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiDecryptAuthIdentityEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)options, (void*)(uintptr_t)encryptedauthdata) : -1;
#else
    (void)options;
    (void)encryptedauthdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiEncodeAuthIdentityAsStrings(JNIEnv* km_env, jclass km_clazz, jlong pauthidentity, jlong ppszusername, jlong ppszdomainname, jlong ppszpackedcredentialsstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncodeAuthIdentityAsStrings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pauthidentity, (void*)(uintptr_t)ppszusername, (void*)(uintptr_t)ppszdomainname, (void*)(uintptr_t)ppszpackedcredentialsstring) : -1;
#else
    (void)pauthidentity;
    (void)ppszusername;
    (void)ppszdomainname;
    (void)ppszpackedcredentialsstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiEncodeStringsAsAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong pszusername, jlong pszdomainname, jlong pszpackedcredentialsstring, jlong ppauthidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncodeStringsAsAuthIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszusername, (void*)(uintptr_t)pszdomainname, (void*)(uintptr_t)pszpackedcredentialsstring, (void*)(uintptr_t)ppauthidentity) : -1;
#else
    (void)pszusername;
    (void)pszdomainname;
    (void)pszpackedcredentialsstring;
    (void)ppauthidentity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiEncryptAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncryptAuthIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authdata) : -1;
#else
    (void)authdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiEncryptAuthIdentityEx(JNIEnv* km_env, jclass km_clazz, jint options, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiEncryptAuthIdentityEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)options, (void*)(uintptr_t)authdata) : -1;
#else
    (void)options;
    (void)authdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiExcludePackage(JNIEnv* km_env, jclass km_clazz, jlong authidentity, jlong pszpackagename, jlong ppnewauthidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiExcludePackage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authidentity, (void*)(uintptr_t)pszpackagename, (void*)(uintptr_t)ppnewauthidentity) : -1;
#else
    (void)authidentity;
    (void)pszpackagename;
    (void)ppnewauthidentity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiFreeAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiFreeAuthIdentity");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)authdata);
#else
    (void)authdata;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiGetTargetHostName(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong pszhostname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiGetTargetHostName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pszhostname) : -1;
#else
    (void)psztargetname;
    (void)pszhostname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiIsAuthIdentityEncrypted(JNIEnv* km_env, jclass km_clazz, jlong encryptedauthdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiIsAuthIdentityEncrypted");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)encryptedauthdata) : false;
#else
    (void)encryptedauthdata;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiIsPromptingNeeded(JNIEnv* km_env, jclass km_clazz, jint errororntstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiIsPromptingNeeded");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)errororntstatus) : false;
#else
    (void)errororntstatus;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiLocalFree(JNIEnv* km_env, jclass km_clazz, jlong databuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiLocalFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)databuffer);
#else
    (void)databuffer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiMarshalAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authidentity, jlong authidentitylength, jlong authidentitybytearray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiMarshalAuthIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authidentity, (void*)(uintptr_t)authidentitylength, (void*)(uintptr_t)authidentitybytearray) : -1;
#else
    (void)authidentity;
    (void)authidentitylength;
    (void)authidentitybytearray;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiPrepareForCredRead(JNIEnv* km_env, jclass km_clazz, jlong authidentity, jlong psztargetname, jlong pcredmancredentialtype, jlong ppszcredmantargetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPrepareForCredRead");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authidentity, (void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcredmancredentialtype, (void*)(uintptr_t)ppszcredmantargetname) : -1;
#else
    (void)authidentity;
    (void)psztargetname;
    (void)pcredmancredentialtype;
    (void)ppszcredmantargetname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiPrepareForCredWrite(JNIEnv* km_env, jclass km_clazz, jlong authidentity, jlong psztargetname, jlong pcredmancredentialtype, jlong ppszcredmantargetname, jlong ppszcredmanusername, jlong ppcredentialblob, jlong pcredentialblobsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPrepareForCredWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authidentity, (void*)(uintptr_t)psztargetname, (void*)(uintptr_t)pcredmancredentialtype, (void*)(uintptr_t)ppszcredmantargetname, (void*)(uintptr_t)ppszcredmanusername, (void*)(uintptr_t)ppcredentialblob, (void*)(uintptr_t)pcredentialblobsize) : -1;
#else
    (void)authidentity;
    (void)psztargetname;
    (void)pcredmancredentialtype;
    (void)ppszcredmantargetname;
    (void)ppszcredmanusername;
    (void)ppcredentialblob;
    (void)pcredentialblobsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiPromptForCredentialsA(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong puiinfo, jint dwautherror, jlong pszpackage, jlong pinputauthidentity, jlong ppauthidentity, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPromptForCredentialsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)puiinfo, (uint32_t)dwautherror, (void*)(uintptr_t)pszpackage, (void*)(uintptr_t)pinputauthidentity, (void*)(uintptr_t)ppauthidentity, (void*)(uintptr_t)pfsave, (uint32_t)dwflags) : 0;
#else
    (void)psztargetname;
    (void)puiinfo;
    (void)dwautherror;
    (void)pszpackage;
    (void)pinputauthidentity;
    (void)ppauthidentity;
    (void)pfsave;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiPromptForCredentialsW(JNIEnv* km_env, jclass km_clazz, jlong psztargetname, jlong puiinfo, jint dwautherror, jlong pszpackage, jlong pinputauthidentity, jlong ppauthidentity, jlong pfsave, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("credui.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiPromptForCredentialsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psztargetname, (void*)(uintptr_t)puiinfo, (uint32_t)dwautherror, (void*)(uintptr_t)pszpackage, (void*)(uintptr_t)pinputauthidentity, (void*)(uintptr_t)ppauthidentity, (void*)(uintptr_t)pfsave, (uint32_t)dwflags) : 0;
#else
    (void)psztargetname;
    (void)puiinfo;
    (void)dwautherror;
    (void)pszpackage;
    (void)pinputauthidentity;
    (void)ppauthidentity;
    (void)pfsave;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiSetChannelBindingFlags(JNIEnv* km_env, jclass km_clazz, jlong pbindings, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sspicli.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiSetChannelBindingFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbindings, (uint32_t)flags) : -1;
#else
    (void)pbindings;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiUnmarshalAuthIdentity(JNIEnv* km_env, jclass km_clazz, jint authidentitylength, jlong authidentitybytearray, jlong ppauthidentity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiUnmarshalAuthIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)authidentitylength, (void*)(uintptr_t)authidentitybytearray, (void*)(uintptr_t)ppauthidentity) : -1;
#else
    (void)authidentitylength;
    (void)authidentitybytearray;
    (void)ppauthidentity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiValidateAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiValidateAuthIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authdata) : -1;
#else
    (void)authdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1SspiZeroAuthIdentity(JNIEnv* km_env, jclass km_clazz, jlong authdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiZeroAuthIdentity");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)authdata);
#else
    (void)authdata;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingDeleteAllBindings(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingDeleteAllBindings");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingDeleteBinding(JNIEnv* km_env, jclass km_clazz, jlong targeturl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingDeleteBinding");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targeturl) : -1;
#else
    (void)targeturl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingGenerateBinding(JNIEnv* km_env, jclass km_clazz, jint keytype, jlong targeturl, jint bindingtype, jlong tlsekm, jint tlsekmsize, jint extensionformat, jlong extensiondata, jlong tokenbinding, jlong tokenbindingsize, jlong resultdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t, void*, uint32_t, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateBinding");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)keytype, (void*)(uintptr_t)targeturl, (int32_t)bindingtype, (void*)(uintptr_t)tlsekm, (uint32_t)tlsekmsize, (int32_t)extensionformat, (void*)(uintptr_t)extensiondata, (void*)(uintptr_t)tokenbinding, (void*)(uintptr_t)tokenbindingsize, (void*)(uintptr_t)resultdata) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingGenerateID(JNIEnv* km_env, jclass km_clazz, jint keytype, jlong publickey, jint publickeysize, jlong resultdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)keytype, (void*)(uintptr_t)publickey, (uint32_t)publickeysize, (void*)(uintptr_t)resultdata) : -1;
#else
    (void)keytype;
    (void)publickey;
    (void)publickeysize;
    (void)resultdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingGenerateIDForUri(JNIEnv* km_env, jclass km_clazz, jint keytype, jlong targeturi, jlong resultdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateIDForUri");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)keytype, (void*)(uintptr_t)targeturi, (void*)(uintptr_t)resultdata) : -1;
#else
    (void)keytype;
    (void)targeturi;
    (void)resultdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingGenerateMessage(JNIEnv* km_env, jclass km_clazz, jlong tokenbindings, jlong tokenbindingssize, jint tokenbindingscount, jlong tokenbindingmessage, jlong tokenbindingmessagesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGenerateMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenbindings, (void*)(uintptr_t)tokenbindingssize, (uint32_t)tokenbindingscount, (void*)(uintptr_t)tokenbindingmessage, (void*)(uintptr_t)tokenbindingmessagesize) : -1;
#else
    (void)tokenbindings;
    (void)tokenbindingssize;
    (void)tokenbindingscount;
    (void)tokenbindingmessage;
    (void)tokenbindingmessagesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingGetHighestSupportedVersion(JNIEnv* km_env, jclass km_clazz, jlong majorversion, jlong minorversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGetHighestSupportedVersion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)majorversion, (void*)(uintptr_t)minorversion) : -1;
#else
    (void)majorversion;
    (void)minorversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingGetKeyTypesClient(JNIEnv* km_env, jclass km_clazz, jlong keytypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGetKeyTypesClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)keytypes) : -1;
#else
    (void)keytypes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingGetKeyTypesServer(JNIEnv* km_env, jclass km_clazz, jlong keytypes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingGetKeyTypesServer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)keytypes) : -1;
#else
    (void)keytypes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TokenBindingVerifyMessage(JNIEnv* km_env, jclass km_clazz, jlong tokenbindingmessage, jint tokenbindingmessagesize, jint keytype, jlong tlsekm, jint tlsekmsize, jlong resultlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("tokenbinding.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TokenBindingVerifyMessage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenbindingmessage, (uint32_t)tokenbindingmessagesize, (int32_t)keytype, (void*)(uintptr_t)tlsekm, (uint32_t)tlsekmsize, (void*)(uintptr_t)resultlist) : -1;
#else
    (void)tokenbindingmessage;
    (void)tokenbindingmessagesize;
    (void)keytype;
    (void)tlsekm;
    (void)tlsekmsize;
    (void)resultlist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TranslateNameA(JNIEnv* km_env, jclass km_clazz, jlong lpaccountname, jint accountnameformat, jint desirednameformat, jlong lptranslatedname, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateNameA");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaccountname, (int32_t)accountnameformat, (int32_t)desirednameformat, (void*)(uintptr_t)lptranslatedname, (void*)(uintptr_t)nsize) : false;
#else
    (void)lpaccountname;
    (void)accountnameformat;
    (void)desirednameformat;
    (void)lptranslatedname;
    (void)nsize;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1TranslateNameW(JNIEnv* km_env, jclass km_clazz, jlong lpaccountname, jint accountnameformat, jint desirednameformat, jlong lptranslatedname, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TranslateNameW");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpaccountname, (int32_t)accountnameformat, (int32_t)desirednameformat, (void*)(uintptr_t)lptranslatedname, (void*)(uintptr_t)nsize) : false;
#else
    (void)lpaccountname;
    (void)accountnameformat;
    (void)desirednameformat;
    (void)lptranslatedname;
    (void)nsize;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authentication_identity_WindowsWin32SecurityAuthenticationIdentityJniBridge_windowssys_1windows_1win32_1security_1authentication_1identity_1VerifySignature(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pmessage, jint messageseqno, jlong pfqop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifySignature");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno, (void*)(uintptr_t)pfqop) : -1;
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

