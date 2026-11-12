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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(JNIEnv* km_env, jclass km_clazz, jint flags, jlong hauthzclientcontext, jlong prequest, jlong hauditevent, jlong psecuritydescriptor, jlong optionalsecuritydescriptorarray, jint optionalsecuritydescriptorcount, jlong preply, jlong phaccesscheckresults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzAccessCheck");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)prequest, (void*)(uintptr_t)hauditevent, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)optionalsecuritydescriptorarray, (uint32_t)optionalsecuritydescriptorcount, (void*)(uintptr_t)preply, (void*)(uintptr_t)phaccesscheckresults);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)hauthzclientcontext;
    (void)prequest;
    (void)hauditevent;
    (void)psecuritydescriptor;
    (void)optionalsecuritydescriptorarray;
    (void)optionalsecuritydescriptorcount;
    (void)preply;
    (void)phaccesscheckresults;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jlong sids, jint sidcount, jlong restrictedsids, jint restrictedsidcount, jlong phnewauthzclientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzAddSidsToContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)sids, (uint32_t)sidcount, (void*)(uintptr_t)restrictedsids, (uint32_t)restrictedsidcount, (void*)(uintptr_t)phnewauthzclientcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hauthzclientcontext;
    (void)sids;
    (void)sidcount;
    (void)restrictedsids;
    (void)restrictedsidcount;
    (void)phnewauthzclientcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(JNIEnv* km_env, jclass km_clazz, jint flags, jlong haccesscheckresults, jlong prequest, jlong hauditevent, jlong preply) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzCachedAccessCheck");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)haccesscheckresults, (void*)(uintptr_t)prequest, (void*)(uintptr_t)hauditevent, (void*)(uintptr_t)preply);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)haccesscheckresults;
    (void)prequest;
    (void)hauditevent;
    (void)preply;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong buffer, jlong pdwcount, jlong pdwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzEnumerateSecurityEventSources");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pdwcount, (void*)(uintptr_t)pdwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)buffer;
    (void)pdwcount;
    (void)pdwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(JNIEnv* km_env, jclass km_clazz, jlong authzclientcontext, jlong prequest, jlong sacl, jint grantedaccess, jint accessgranted, jlong pbgenerateaudit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzEvaluateSacl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)authzclientcontext, (void*)(uintptr_t)prequest, (void*)(uintptr_t)sacl, (uint32_t)grantedaccess, (int32_t)accessgranted, (void*)(uintptr_t)pbgenerateaudit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)authzclientcontext;
    (void)prequest;
    (void)sacl;
    (void)grantedaccess;
    (void)accessgranted;
    (void)pbgenerateaudit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(JNIEnv* km_env, jclass km_clazz, jlong hauditevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeAuditEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hauditevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hauditevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeCentralAccessPolicyCache");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hauthzclientcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hauthzclientcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(JNIEnv* km_env, jclass km_clazz, jlong haccesscheckresults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)haccesscheckresults);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)haccesscheckresults;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(JNIEnv* km_env, jclass km_clazz, jlong hauthzresourcemanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeResourceManager");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hauthzresourcemanager);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hauthzresourcemanager;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jint infoclass, jint buffersize, jlong psizerequired, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzGetInformationFromContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (int32_t)infoclass, (uint32_t)buffersize, (void*)(uintptr_t)psizerequired, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hauthzclientcontext;
    (void)infoclass;
    (void)buffersize;
    (void)psizerequired;
    (void)buffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(JNIEnv* km_env, jclass km_clazz, jlong usercontext, jlong devicecontext, jlong phcompoundcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeCompoundContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)usercontext, (void*)(uintptr_t)devicecontext, (void*)(uintptr_t)phcompoundcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)usercontext;
    (void)devicecontext;
    (void)phcompoundcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(JNIEnv* km_env, jclass km_clazz, jint flags, jlong hauditeventtype, jlong szoperationtype, jlong szobjecttype, jlong szobjectname, jlong szadditionalinfo, jlong phauditevent, jint dwadditionalparametercount, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeObjectAccessAuditEvent");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount); break;
            case 1: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)flags;
    (void)hauditeventtype;
    (void)szoperationtype;
    (void)szobjecttype;
    (void)szobjectname;
    (void)szadditionalinfo;
    (void)phauditevent;
    (void)dwadditionalparametercount;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(JNIEnv* km_env, jclass km_clazz, jint flags, jlong hauditeventtype, jlong szoperationtype, jlong szobjecttype, jlong szobjectname, jlong szadditionalinfo, jlong szadditionalinfo2, jlong phauditevent, jint dwadditionalparametercount, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeObjectAccessAuditEvent2");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)szadditionalinfo2, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount); break;
            case 1: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)szadditionalinfo2, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)szadditionalinfo2, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)szadditionalinfo2, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauditeventtype, (void*)(uintptr_t)szoperationtype, (void*)(uintptr_t)szobjecttype, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)szadditionalinfo, (void*)(uintptr_t)szadditionalinfo2, (void*)(uintptr_t)phauditevent, (uint32_t)dwadditionalparametercount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)flags;
    (void)hauditeventtype;
    (void)szoperationtype;
    (void)szobjecttype;
    (void)szobjectname;
    (void)szadditionalinfo;
    (void)szadditionalinfo2;
    (void)phauditevent;
    (void)dwadditionalparametercount;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(JNIEnv* km_env, jclass km_clazz, jlong prpcinitinfo, jlong phauthzresourcemanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeRemoteResourceManager");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prpcinitinfo, (void*)(uintptr_t)phauthzresourcemanager);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prpcinitinfo;
    (void)phauthzresourcemanager;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(JNIEnv* km_env, jclass km_clazz, jint flags, jlong pfndynamicaccesscheck, jlong pfncomputedynamicgroups, jlong pfnfreedynamicgroups, jlong szresourcemanagername, jlong phauthzresourcemanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeResourceManager");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)pfndynamicaccesscheck, (void*)(uintptr_t)pfncomputedynamicgroups, (void*)(uintptr_t)pfnfreedynamicgroups, (void*)(uintptr_t)szresourcemanagername, (void*)(uintptr_t)phauthzresourcemanager);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)pfndynamicaccesscheck;
    (void)pfncomputedynamicgroups;
    (void)pfnfreedynamicgroups;
    (void)szresourcemanagername;
    (void)phauthzresourcemanager;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(JNIEnv* km_env, jclass km_clazz, jint flags, jlong pauthzinitinfo, jlong phauthzresourcemanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeResourceManagerEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)pauthzinitinfo, (void*)(uintptr_t)phauthzresourcemanager);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)pauthzinitinfo;
    (void)phauthzresourcemanager;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInstallSecurityEventSource");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pregistration);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pregistration;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jint claimclass, jlong pclaimoperations, jlong pclaims) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzModifyClaims");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (int32_t)claimclass, (void*)(uintptr_t)pclaimoperations, (void*)(uintptr_t)pclaims);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hauthzclientcontext;
    (void)claimclass;
    (void)pclaimoperations;
    (void)pclaims;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jlong poperations, jlong pattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzModifySecurityAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)poperations, (void*)(uintptr_t)pattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hauthzclientcontext;
    (void)poperations;
    (void)pattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzModifySids(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jint sidclass, jlong psidoperations, jlong psids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzModifySids");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (int32_t)sidclass, (void*)(uintptr_t)psidoperations, (void*)(uintptr_t)psids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hauthzclientcontext;
    (void)sidclass;
    (void)psidoperations;
    (void)psids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(JNIEnv* km_env, jclass km_clazz, jint flags, jlong hauthzclientcontext, jlong prequest, jlong hauditevent, jlong psecuritydescriptor, jlong optionalsecuritydescriptorarray, jint optionalsecuritydescriptorcount, jlong preply) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzOpenObjectAudit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)prequest, (void*)(uintptr_t)hauditevent, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)optionalsecuritydescriptorarray, (uint32_t)optionalsecuritydescriptorcount, (void*)(uintptr_t)preply);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)hauthzclientcontext;
    (void)prequest;
    (void)hauditevent;
    (void)psecuritydescriptor;
    (void)optionalsecuritydescriptorarray;
    (void)optionalsecuritydescriptorcount;
    (void)preply;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong phcapchangesubscription, jlong pfncapchangecallback, jlong pcallbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzRegisterCapChangeNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcapchangesubscription, (void*)(uintptr_t)pfncapchangecallback, (void*)(uintptr_t)pcallbackcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcapchangesubscription;
    (void)pfncapchangecallback;
    (void)pcallbackcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong szeventsourcename, jlong pheventprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzRegisterSecurityEventSource");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)szeventsourcename, (void*)(uintptr_t)pheventprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)szeventsourcename;
    (void)pheventprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong heventprovider, jint dwauditid, jlong pusersid, jint dwcount, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(uint32_t, void*, uint32_t, void*, uint32_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzReportSecurityEvent");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)heventprovider, (uint32_t)dwauditid, (void*)(uintptr_t)pusersid, (uint32_t)dwcount); break;
            case 1: km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)heventprovider, (uint32_t)dwauditid, (void*)(uintptr_t)pusersid, (uint32_t)dwcount, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)heventprovider, (uint32_t)dwauditid, (void*)(uintptr_t)pusersid, (uint32_t)dwcount, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)heventprovider, (uint32_t)dwauditid, (void*)(uintptr_t)pusersid, (uint32_t)dwcount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)heventprovider, (uint32_t)dwauditid, (void*)(uintptr_t)pusersid, (uint32_t)dwcount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwflags;
    (void)heventprovider;
    (void)dwauditid;
    (void)pusersid;
    (void)dwcount;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong heventprovider, jint dwauditid, jlong pusersid, jlong pparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzReportSecurityEventFromParams");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)heventprovider, (uint32_t)dwauditid, (void*)(uintptr_t)pusersid, (void*)(uintptr_t)pparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)heventprovider;
    (void)dwauditid;
    (void)pusersid;
    (void)pparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jlong pappcontainersid, jint capabilitycount, jlong pcapabilitysids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzSetAppContainerInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)pappcontainersid, (uint32_t)capabilitycount, (void*)(uintptr_t)pcapabilitysids);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hauthzclientcontext;
    (void)pappcontainersid;
    (void)capabilitycount;
    (void)pcapabilitysids;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong szeventsourcename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzUninstallSecurityEventSource");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)szeventsourcename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)szeventsourcename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hcapchangesubscription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzUnregisterCapChangeNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcapchangesubscription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcapchangesubscription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pheventprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzUnregisterSecurityEventSource");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pheventprovider);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)pheventprovider;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(JNIEnv* km_env, jclass km_clazz, jlong pexplicitaccess, jlong ptrusteename, jint accesspermissions, jint accessmode, jint inheritance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildExplicitAccessWithNameA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pexplicitaccess, (void*)(uintptr_t)ptrusteename, (uint32_t)accesspermissions, (int32_t)accessmode, (uint32_t)inheritance);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(JNIEnv* km_env, jclass km_clazz, jlong pexplicitaccess, jlong ptrusteename, jint accesspermissions, jint accessmode, jint inheritance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildExplicitAccessWithNameW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pexplicitaccess, (void*)(uintptr_t)ptrusteename, (uint32_t)accesspermissions, (int32_t)accessmode, (uint32_t)inheritance);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(JNIEnv* km_env, jclass km_clazz, jlong pexplicitaccess, jlong ptrusteename, jlong ptrustee, jint accesspermissions, jint accessmode, jint inheritance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateExplicitAccessWithNameA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pexplicitaccess, (void*)(uintptr_t)ptrusteename, (void*)(uintptr_t)ptrustee, (uint32_t)accesspermissions, (int32_t)accessmode, (uint32_t)inheritance);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)ptrustee;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(JNIEnv* km_env, jclass km_clazz, jlong pexplicitaccess, jlong ptrusteename, jlong ptrustee, jint accesspermissions, jint accessmode, jint inheritance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateExplicitAccessWithNameW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pexplicitaccess, (void*)(uintptr_t)ptrusteename, (void*)(uintptr_t)ptrustee, (uint32_t)accesspermissions, (int32_t)accessmode, (uint32_t)inheritance);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)ptrustee;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pimpersonatetrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateTrusteeA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pimpersonatetrustee);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)pimpersonatetrustee;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pimpersonatetrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateTrusteeW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pimpersonatetrustee);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)pimpersonatetrustee;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(JNIEnv* km_env, jclass km_clazz, jlong powner, jlong pgroup, jint ccountofaccessentries, jlong plistofaccessentries, jint ccountofauditentries, jlong plistofauditentries, jlong poldsd, jlong psizenewsd, jlong pnewsd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildSecurityDescriptorA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (uint32_t)ccountofaccessentries, (void*)(uintptr_t)plistofaccessentries, (uint32_t)ccountofauditentries, (void*)(uintptr_t)plistofauditentries, (void*)(uintptr_t)poldsd, (void*)(uintptr_t)psizenewsd, (void*)(uintptr_t)pnewsd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)powner;
    (void)pgroup;
    (void)ccountofaccessentries;
    (void)plistofaccessentries;
    (void)ccountofauditentries;
    (void)plistofauditentries;
    (void)poldsd;
    (void)psizenewsd;
    (void)pnewsd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(JNIEnv* km_env, jclass km_clazz, jlong powner, jlong pgroup, jint ccountofaccessentries, jlong plistofaccessentries, jint ccountofauditentries, jlong plistofauditentries, jlong poldsd, jlong psizenewsd, jlong pnewsd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildSecurityDescriptorW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (uint32_t)ccountofaccessentries, (void*)(uintptr_t)plistofaccessentries, (uint32_t)ccountofauditentries, (void*)(uintptr_t)plistofauditentries, (void*)(uintptr_t)poldsd, (void*)(uintptr_t)psizenewsd, (void*)(uintptr_t)pnewsd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)powner;
    (void)pgroup;
    (void)ccountofaccessentries;
    (void)plistofaccessentries;
    (void)ccountofauditentries;
    (void)plistofauditentries;
    (void)poldsd;
    (void)psizenewsd;
    (void)pnewsd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithNameA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pname);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)pname;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithNameW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pname);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)pname;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pobjname, jint objecttype, jlong objecttypename, jlong inheritedobjecttypename, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndNameA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pobjname, (int32_t)objecttype, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)inheritedobjecttypename, (void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)pobjname;
    (void)objecttype;
    (void)objecttypename;
    (void)inheritedobjecttypename;
    (void)name;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pobjname, jint objecttype, jlong objecttypename, jlong inheritedobjecttypename, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndNameW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pobjname, (int32_t)objecttype, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)inheritedobjecttypename, (void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)pobjname;
    (void)objecttype;
    (void)objecttypename;
    (void)inheritedobjecttypename;
    (void)name;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pobjsid, jlong pobjectguid, jlong pinheritedobjectguid, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndSidA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pobjsid, (void*)(uintptr_t)pobjectguid, (void*)(uintptr_t)pinheritedobjectguid, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)pobjsid;
    (void)pobjectguid;
    (void)pinheritedobjectguid;
    (void)psid;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pobjsid, jlong pobjectguid, jlong pinheritedobjectguid, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndSidW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pobjsid, (void*)(uintptr_t)pobjectguid, (void*)(uintptr_t)pinheritedobjectguid, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)pobjsid;
    (void)pobjectguid;
    (void)pinheritedobjectguid;
    (void)psid;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithSidA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)psid;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithSidW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptrustee;
    (void)psid;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jint requestedstringsdrevision, jint securityinformation, jlong stringsecuritydescriptor, jlong stringsecuritydescriptorlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSecurityDescriptorToStringSecurityDescriptorA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (uint32_t)requestedstringsdrevision, (uint32_t)securityinformation, (void*)(uintptr_t)stringsecuritydescriptor, (void*)(uintptr_t)stringsecuritydescriptorlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)requestedstringsdrevision;
    (void)securityinformation;
    (void)stringsecuritydescriptor;
    (void)stringsecuritydescriptorlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jint requestedstringsdrevision, jint securityinformation, jlong stringsecuritydescriptor, jlong stringsecuritydescriptorlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSecurityDescriptorToStringSecurityDescriptorW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (uint32_t)requestedstringsdrevision, (uint32_t)securityinformation, (void*)(uintptr_t)stringsecuritydescriptor, (void*)(uintptr_t)stringsecuritydescriptorlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)requestedstringsdrevision;
    (void)securityinformation;
    (void)stringsecuritydescriptor;
    (void)stringsecuritydescriptorlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong stringsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSidToStringSidA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)stringsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sid;
    (void)stringsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong stringsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSidToStringSidW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)stringsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sid;
    (void)stringsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(JNIEnv* km_env, jclass km_clazz, jlong stringsecuritydescriptor, jint stringsdrevision, jlong securitydescriptor, jlong securitydescriptorsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSecurityDescriptorToSecurityDescriptorA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringsecuritydescriptor, (uint32_t)stringsdrevision, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)securitydescriptorsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringsecuritydescriptor;
    (void)stringsdrevision;
    (void)securitydescriptor;
    (void)securitydescriptorsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(JNIEnv* km_env, jclass km_clazz, jlong stringsecuritydescriptor, jint stringsdrevision, jlong securitydescriptor, jlong securitydescriptorsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSecurityDescriptorToSecurityDescriptorW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringsecuritydescriptor, (uint32_t)stringsdrevision, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)securitydescriptorsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringsecuritydescriptor;
    (void)stringsdrevision;
    (void)securitydescriptor;
    (void)securitydescriptorsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(JNIEnv* km_env, jclass km_clazz, jlong stringsid, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSidToSidA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringsid, (void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringsid;
    (void)sid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(JNIEnv* km_env, jclass km_clazz, jlong stringsid, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSidToSidW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stringsid, (void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stringsid;
    (void)sid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(JNIEnv* km_env, jclass km_clazz, jlong pinheritarray, jshort acecnt, jlong pfnarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeInheritedFromArray");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinheritarray, (uint16_t)acecnt, (void*)(uintptr_t)pfnarray);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pinheritarray;
    (void)acecnt;
    (void)pfnarray;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong ptrustee, jlong psuccessfulauditedrights, jlong pfailedauditrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAuditedPermissionsFromAclA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)ptrustee, (void*)(uintptr_t)psuccessfulauditedrights, (void*)(uintptr_t)pfailedauditrights);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pacl;
    (void)ptrustee;
    (void)psuccessfulauditedrights;
    (void)pfailedauditrights;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong ptrustee, jlong psuccessfulauditedrights, jlong pfailedauditrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAuditedPermissionsFromAclW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)ptrustee, (void*)(uintptr_t)psuccessfulauditedrights, (void*)(uintptr_t)pfailedauditrights);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pacl;
    (void)ptrustee;
    (void)psuccessfulauditedrights;
    (void)pfailedauditrights;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong ptrustee, jlong paccessrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEffectiveRightsFromAclA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)ptrustee, (void*)(uintptr_t)paccessrights);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pacl;
    (void)ptrustee;
    (void)paccessrights;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong ptrustee, jlong paccessrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEffectiveRightsFromAclW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)ptrustee, (void*)(uintptr_t)paccessrights);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pacl;
    (void)ptrustee;
    (void)paccessrights;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong pccountofexplicitentries, jlong plistofexplicitentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExplicitEntriesFromAclA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)pccountofexplicitentries, (void*)(uintptr_t)plistofexplicitentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pacl;
    (void)pccountofexplicitentries;
    (void)plistofexplicitentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong pccountofexplicitentries, jlong plistofexplicitentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExplicitEntriesFromAclW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)pccountofexplicitentries, (void*)(uintptr_t)plistofexplicitentries);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pacl;
    (void)pccountofexplicitentries;
    (void)plistofexplicitentries;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jint container, jlong pobjectclassguids, jint guidcount, jlong pacl, jlong pfnarray, jlong pgenericmapping, jlong pinheritarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInheritanceSourceA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (int32_t)container, (void*)(uintptr_t)pobjectclassguids, (uint32_t)guidcount, (void*)(uintptr_t)pacl, (void*)(uintptr_t)pfnarray, (void*)(uintptr_t)pgenericmapping, (void*)(uintptr_t)pinheritarray);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)container;
    (void)pobjectclassguids;
    (void)guidcount;
    (void)pacl;
    (void)pfnarray;
    (void)pgenericmapping;
    (void)pinheritarray;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jint container, jlong pobjectclassguids, jint guidcount, jlong pacl, jlong pfnarray, jlong pgenericmapping, jlong pinheritarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInheritanceSourceW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (int32_t)container, (void*)(uintptr_t)pobjectclassguids, (uint32_t)guidcount, (void*)(uintptr_t)pacl, (void*)(uintptr_t)pfnarray, (void*)(uintptr_t)pgenericmapping, (void*)(uintptr_t)pinheritarray);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)container;
    (void)pobjectclassguids;
    (void)guidcount;
    (void)pacl;
    (void)pfnarray;
    (void)pgenericmapping;
    (void)pinheritarray;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeOperationA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeOperationW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong ppsidowner, jlong ppsidgroup, jlong ppdacl, jlong ppsacl, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedSecurityInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)ppsidowner, (void*)(uintptr_t)ppsidgroup, (void*)(uintptr_t)ppdacl, (void*)(uintptr_t)ppsacl, (void*)(uintptr_t)ppsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong ppsidowner, jlong ppsidgroup, jlong ppdacl, jlong ppsacl, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedSecurityInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)ppsidowner, (void*)(uintptr_t)ppsidgroup, (void*)(uintptr_t)ppdacl, (void*)(uintptr_t)ppsacl, (void*)(uintptr_t)ppsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(JNIEnv* km_env, jclass km_clazz, jlong handle, jint objecttype, jint securityinfo, jlong ppsidowner, jlong ppsidgroup, jlong ppdacl, jlong ppsacl, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)ppsidowner, (void*)(uintptr_t)ppsidgroup, (void*)(uintptr_t)ppdacl, (void*)(uintptr_t)ppsacl, (void*)(uintptr_t)ppsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeFormA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeFormW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeNameA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeNameW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeTypeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeTypeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptrustee);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptrustee;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(JNIEnv* km_env, jclass km_clazz, jlong ppowner, jlong ppgroup, jlong pccountofaccessentries, jlong pplistofaccessentries, jlong pccountofauditentries, jlong pplistofauditentries, jlong psd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupSecurityDescriptorPartsA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppowner, (void*)(uintptr_t)ppgroup, (void*)(uintptr_t)pccountofaccessentries, (void*)(uintptr_t)pplistofaccessentries, (void*)(uintptr_t)pccountofauditentries, (void*)(uintptr_t)pplistofauditentries, (void*)(uintptr_t)psd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppowner;
    (void)ppgroup;
    (void)pccountofaccessentries;
    (void)pplistofaccessentries;
    (void)pccountofauditentries;
    (void)pplistofauditentries;
    (void)psd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(JNIEnv* km_env, jclass km_clazz, jlong ppowner, jlong ppgroup, jlong pccountofaccessentries, jlong pplistofaccessentries, jlong pccountofauditentries, jlong pplistofauditentries, jlong psd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupSecurityDescriptorPartsW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppowner, (void*)(uintptr_t)ppgroup, (void*)(uintptr_t)pccountofaccessentries, (void*)(uintptr_t)pplistofaccessentries, (void*)(uintptr_t)pccountofauditentries, (void*)(uintptr_t)pplistofauditentries, (void*)(uintptr_t)psd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppowner;
    (void)ppgroup;
    (void)pccountofaccessentries;
    (void)pplistofaccessentries;
    (void)pccountofauditentries;
    (void)pplistofauditentries;
    (void)psd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(JNIEnv* km_env, jclass km_clazz, jint ccountofexplicitentries, jlong plistofexplicitentries, jlong oldacl, jlong newacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEntriesInAclA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ccountofexplicitentries, (void*)(uintptr_t)plistofexplicitentries, (void*)(uintptr_t)oldacl, (void*)(uintptr_t)newacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ccountofexplicitentries;
    (void)plistofexplicitentries;
    (void)oldacl;
    (void)newacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(JNIEnv* km_env, jclass km_clazz, jint ccountofexplicitentries, jlong plistofexplicitentries, jlong oldacl, jlong newacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEntriesInAclW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ccountofexplicitentries, (void*)(uintptr_t)plistofexplicitentries, (void*)(uintptr_t)oldacl, (void*)(uintptr_t)newacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ccountofexplicitentries;
    (void)plistofexplicitentries;
    (void)oldacl;
    (void)newacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong psidowner, jlong psidgroup, jlong pdacl, jlong psacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNamedSecurityInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)psidowner, (void*)(uintptr_t)psidgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong psidowner, jlong psidgroup, jlong pdacl, jlong psacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNamedSecurityInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)psidowner, (void*)(uintptr_t)psidgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(JNIEnv* km_env, jclass km_clazz, jlong handle, jint objecttype, jint securityinfo, jlong psidowner, jlong psidgroup, jlong pdacl, jlong psacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)psidowner, (void*)(uintptr_t)psidgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)handle;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong powner, jlong pgroup, jlong pdacl, jlong psacl, jint keepexplicit, jlong fnprogress, jint progressinvokesetting, jlong args) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeResetNamedSecurityInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl, (int32_t)keepexplicit, (void*)(uintptr_t)fnprogress, (int32_t)progressinvokesetting, (void*)(uintptr_t)args);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)keepexplicit;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong powner, jlong pgroup, jlong pdacl, jlong psacl, jint keepexplicit, jlong fnprogress, jint progressinvokesetting, jlong args) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeResetNamedSecurityInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl, (int32_t)keepexplicit, (void*)(uintptr_t)fnprogress, (int32_t)progressinvokesetting, (void*)(uintptr_t)args);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)keepexplicit;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong powner, jlong pgroup, jlong pdacl, jlong psacl, jint dwaction, jlong fnprogress, jint progressinvokesetting, jlong args) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeSetNamedSecurityInfoA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl, (uint32_t)dwaction, (void*)(uintptr_t)fnprogress, (int32_t)progressinvokesetting, (void*)(uintptr_t)args);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)dwaction;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong powner, jlong pgroup, jlong pdacl, jlong psacl, jint dwaction, jlong fnprogress, jint progressinvokesetting, jlong args) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeSetNamedSecurityInfoW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl, (uint32_t)dwaction, (void*)(uintptr_t)fnprogress, (int32_t)progressinvokesetting, (void*)(uintptr_t)args);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)powner;
    (void)pgroup;
    (void)pdacl;
    (void)psacl;
    (void)dwaction;
    (void)fnprogress;
    (void)progressinvokesetting;
    (void)args;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

