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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzAccessCheck(JNIEnv* km_env, jclass km_clazz, jint flags, jlong hauthzclientcontext, jlong prequest, jlong hauditevent, jlong psecuritydescriptor, jlong optionalsecuritydescriptorarray, jint optionalsecuritydescriptorcount, jlong preply, jlong phaccesscheckresults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzAccessCheck");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)prequest, (void*)(uintptr_t)hauditevent, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)optionalsecuritydescriptorarray, (uint32_t)optionalsecuritydescriptorcount, (void*)(uintptr_t)preply, (void*)(uintptr_t)phaccesscheckresults) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzAddSidsToContext(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jlong sids, jint sidcount, jlong restrictedsids, jint restrictedsidcount, jlong phnewauthzclientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzAddSidsToContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)sids, (uint32_t)sidcount, (void*)(uintptr_t)restrictedsids, (uint32_t)restrictedsidcount, (void*)(uintptr_t)phnewauthzclientcontext) : -1;
#else
    (void)hauthzclientcontext;
    (void)sids;
    (void)sidcount;
    (void)restrictedsids;
    (void)restrictedsidcount;
    (void)phnewauthzclientcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzCachedAccessCheck(JNIEnv* km_env, jclass km_clazz, jint flags, jlong haccesscheckresults, jlong prequest, jlong hauditevent, jlong preply) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzCachedAccessCheck");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)haccesscheckresults, (void*)(uintptr_t)prequest, (void*)(uintptr_t)hauditevent, (void*)(uintptr_t)preply) : -1;
#else
    (void)flags;
    (void)haccesscheckresults;
    (void)prequest;
    (void)hauditevent;
    (void)preply;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzEnumerateSecurityEventSources(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong buffer, jlong pdwcount, jlong pdwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzEnumerateSecurityEventSources");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)buffer, (void*)(uintptr_t)pdwcount, (void*)(uintptr_t)pdwlength) : -1;
#else
    (void)dwflags;
    (void)buffer;
    (void)pdwcount;
    (void)pdwlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzEvaluateSacl(JNIEnv* km_env, jclass km_clazz, jlong authzclientcontext, jlong prequest, jlong sacl, jint grantedaccess, jint accessgranted, jlong pbgenerateaudit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzEvaluateSacl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)authzclientcontext, (void*)(uintptr_t)prequest, (void*)(uintptr_t)sacl, (uint32_t)grantedaccess, (int32_t)accessgranted, (void*)(uintptr_t)pbgenerateaudit) : -1;
#else
    (void)authzclientcontext;
    (void)prequest;
    (void)sacl;
    (void)grantedaccess;
    (void)accessgranted;
    (void)pbgenerateaudit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzFreeAuditEvent(JNIEnv* km_env, jclass km_clazz, jlong hauditevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeAuditEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hauditevent) : -1;
#else
    (void)hauditevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzFreeCentralAccessPolicyCache(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeCentralAccessPolicyCache");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzFreeContext(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hauthzclientcontext) : -1;
#else
    (void)hauthzclientcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzFreeHandle(JNIEnv* km_env, jclass km_clazz, jlong haccesscheckresults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)haccesscheckresults) : -1;
#else
    (void)haccesscheckresults;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzFreeResourceManager(JNIEnv* km_env, jclass km_clazz, jlong hauthzresourcemanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzFreeResourceManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hauthzresourcemanager) : -1;
#else
    (void)hauthzresourcemanager;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzGetInformationFromContext(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jint infoclass, jint buffersize, jlong psizerequired, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzGetInformationFromContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (int32_t)infoclass, (uint32_t)buffersize, (void*)(uintptr_t)psizerequired, (void*)(uintptr_t)buffer) : -1;
#else
    (void)hauthzclientcontext;
    (void)infoclass;
    (void)buffersize;
    (void)psizerequired;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzInitializeCompoundContext(JNIEnv* km_env, jclass km_clazz, jlong usercontext, jlong devicecontext, jlong phcompoundcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeCompoundContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)usercontext, (void*)(uintptr_t)devicecontext, (void*)(uintptr_t)phcompoundcontext) : -1;
#else
    (void)usercontext;
    (void)devicecontext;
    (void)phcompoundcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzInitializeObjectAccessAuditEvent(JNIEnv* km_env, jclass km_clazz, jint flags, jlong hauditeventtype, jlong szoperationtype, jlong szobjecttype, jlong szobjectname, jlong szadditionalinfo, jlong phauditevent, jint dwadditionalparametercount, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzInitializeObjectAccessAuditEvent2(JNIEnv* km_env, jclass km_clazz, jint flags, jlong hauditeventtype, jlong szoperationtype, jlong szobjecttype, jlong szobjectname, jlong szadditionalinfo, jlong szadditionalinfo2, jlong phauditevent, jint dwadditionalparametercount, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzInitializeRemoteResourceManager(JNIEnv* km_env, jclass km_clazz, jlong prpcinitinfo, jlong phauthzresourcemanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeRemoteResourceManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prpcinitinfo, (void*)(uintptr_t)phauthzresourcemanager) : -1;
#else
    (void)prpcinitinfo;
    (void)phauthzresourcemanager;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzInitializeResourceManager(JNIEnv* km_env, jclass km_clazz, jint flags, jlong pfndynamicaccesscheck, jlong pfncomputedynamicgroups, jlong pfnfreedynamicgroups, jlong szresourcemanagername, jlong phauthzresourcemanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeResourceManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)pfndynamicaccesscheck, (void*)(uintptr_t)pfncomputedynamicgroups, (void*)(uintptr_t)pfnfreedynamicgroups, (void*)(uintptr_t)szresourcemanagername, (void*)(uintptr_t)phauthzresourcemanager) : -1;
#else
    (void)flags;
    (void)pfndynamicaccesscheck;
    (void)pfncomputedynamicgroups;
    (void)pfnfreedynamicgroups;
    (void)szresourcemanagername;
    (void)phauthzresourcemanager;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzInitializeResourceManagerEx(JNIEnv* km_env, jclass km_clazz, jint flags, jlong pauthzinitinfo, jlong phauthzresourcemanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInitializeResourceManagerEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)pauthzinitinfo, (void*)(uintptr_t)phauthzresourcemanager) : -1;
#else
    (void)flags;
    (void)pauthzinitinfo;
    (void)phauthzresourcemanager;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzInstallSecurityEventSource(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pregistration) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzInstallSecurityEventSource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pregistration) : -1;
#else
    (void)dwflags;
    (void)pregistration;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzModifyClaims(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jint claimclass, jlong pclaimoperations, jlong pclaims) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzModifyClaims");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (int32_t)claimclass, (void*)(uintptr_t)pclaimoperations, (void*)(uintptr_t)pclaims) : -1;
#else
    (void)hauthzclientcontext;
    (void)claimclass;
    (void)pclaimoperations;
    (void)pclaims;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzModifySecurityAttributes(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jlong poperations, jlong pattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzModifySecurityAttributes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)poperations, (void*)(uintptr_t)pattributes) : -1;
#else
    (void)hauthzclientcontext;
    (void)poperations;
    (void)pattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzModifySids(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jint sidclass, jlong psidoperations, jlong psids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzModifySids");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (int32_t)sidclass, (void*)(uintptr_t)psidoperations, (void*)(uintptr_t)psids) : -1;
#else
    (void)hauthzclientcontext;
    (void)sidclass;
    (void)psidoperations;
    (void)psids;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzOpenObjectAudit(JNIEnv* km_env, jclass km_clazz, jint flags, jlong hauthzclientcontext, jlong prequest, jlong hauditevent, jlong psecuritydescriptor, jlong optionalsecuritydescriptorarray, jint optionalsecuritydescriptorcount, jlong preply) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzOpenObjectAudit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)prequest, (void*)(uintptr_t)hauditevent, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)optionalsecuritydescriptorarray, (uint32_t)optionalsecuritydescriptorcount, (void*)(uintptr_t)preply) : -1;
#else
    (void)flags;
    (void)hauthzclientcontext;
    (void)prequest;
    (void)hauditevent;
    (void)psecuritydescriptor;
    (void)optionalsecuritydescriptorarray;
    (void)optionalsecuritydescriptorcount;
    (void)preply;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzRegisterCapChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong phcapchangesubscription, jlong pfncapchangecallback, jlong pcallbackcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzRegisterCapChangeNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcapchangesubscription, (void*)(uintptr_t)pfncapchangecallback, (void*)(uintptr_t)pcallbackcontext) : -1;
#else
    (void)phcapchangesubscription;
    (void)pfncapchangecallback;
    (void)pcallbackcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzRegisterSecurityEventSource(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong szeventsourcename, jlong pheventprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzRegisterSecurityEventSource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)szeventsourcename, (void*)(uintptr_t)pheventprovider) : -1;
#else
    (void)dwflags;
    (void)szeventsourcename;
    (void)pheventprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzReportSecurityEvent(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong heventprovider, jint dwauditid, jlong pusersid, jint dwcount, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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
    }
#else
    (void)dwflags;
    (void)heventprovider;
    (void)dwauditid;
    (void)pusersid;
    (void)dwcount;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzReportSecurityEventFromParams(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong heventprovider, jint dwauditid, jlong pusersid, jlong pparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzReportSecurityEventFromParams");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)heventprovider, (uint32_t)dwauditid, (void*)(uintptr_t)pusersid, (void*)(uintptr_t)pparams) : -1;
#else
    (void)dwflags;
    (void)heventprovider;
    (void)dwauditid;
    (void)pusersid;
    (void)pparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzSetAppContainerInformation(JNIEnv* km_env, jclass km_clazz, jlong hauthzclientcontext, jlong pappcontainersid, jint capabilitycount, jlong pcapabilitysids) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzSetAppContainerInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hauthzclientcontext, (void*)(uintptr_t)pappcontainersid, (uint32_t)capabilitycount, (void*)(uintptr_t)pcapabilitysids) : -1;
#else
    (void)hauthzclientcontext;
    (void)pappcontainersid;
    (void)capabilitycount;
    (void)pcapabilitysids;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzUninstallSecurityEventSource(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong szeventsourcename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzUninstallSecurityEventSource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)szeventsourcename) : -1;
#else
    (void)dwflags;
    (void)szeventsourcename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzUnregisterCapChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hcapchangesubscription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzUnregisterCapChangeNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcapchangesubscription) : -1;
#else
    (void)hcapchangesubscription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1authzUnregisterSecurityEventSource(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong pheventprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("authz.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AuthzUnregisterSecurityEventSource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)pheventprovider) : -1;
#else
    (void)dwflags;
    (void)pheventprovider;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildExplicitAccessWithNameA(JNIEnv* km_env, jclass km_clazz, jlong pexplicitaccess, jlong ptrusteename, jint accesspermissions, jint accessmode, jint inheritance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildExplicitAccessWithNameA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pexplicitaccess, (void*)(uintptr_t)ptrusteename, (uint32_t)accesspermissions, (int32_t)accessmode, (uint32_t)inheritance);
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildExplicitAccessWithNameW(JNIEnv* km_env, jclass km_clazz, jlong pexplicitaccess, jlong ptrusteename, jint accesspermissions, jint accessmode, jint inheritance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildExplicitAccessWithNameW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pexplicitaccess, (void*)(uintptr_t)ptrusteename, (uint32_t)accesspermissions, (int32_t)accessmode, (uint32_t)inheritance);
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildImpersonateExplicitAccessWithNameA(JNIEnv* km_env, jclass km_clazz, jlong pexplicitaccess, jlong ptrusteename, jlong ptrustee, jint accesspermissions, jint accessmode, jint inheritance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateExplicitAccessWithNameA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pexplicitaccess, (void*)(uintptr_t)ptrusteename, (void*)(uintptr_t)ptrustee, (uint32_t)accesspermissions, (int32_t)accessmode, (uint32_t)inheritance);
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)ptrustee;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildImpersonateExplicitAccessWithNameW(JNIEnv* km_env, jclass km_clazz, jlong pexplicitaccess, jlong ptrusteename, jlong ptrustee, jint accesspermissions, jint accessmode, jint inheritance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateExplicitAccessWithNameW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pexplicitaccess, (void*)(uintptr_t)ptrusteename, (void*)(uintptr_t)ptrustee, (uint32_t)accesspermissions, (int32_t)accessmode, (uint32_t)inheritance);
#else
    (void)pexplicitaccess;
    (void)ptrusteename;
    (void)ptrustee;
    (void)accesspermissions;
    (void)accessmode;
    (void)inheritance;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildImpersonateTrusteeA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pimpersonatetrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateTrusteeA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pimpersonatetrustee);
#else
    (void)ptrustee;
    (void)pimpersonatetrustee;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildImpersonateTrusteeW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pimpersonatetrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildImpersonateTrusteeW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pimpersonatetrustee);
#else
    (void)ptrustee;
    (void)pimpersonatetrustee;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildSecurityDescriptorA(JNIEnv* km_env, jclass km_clazz, jlong powner, jlong pgroup, jint ccountofaccessentries, jlong plistofaccessentries, jint ccountofauditentries, jlong plistofauditentries, jlong poldsd, jlong psizenewsd, jlong pnewsd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildSecurityDescriptorA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (uint32_t)ccountofaccessentries, (void*)(uintptr_t)plistofaccessentries, (uint32_t)ccountofauditentries, (void*)(uintptr_t)plistofauditentries, (void*)(uintptr_t)poldsd, (void*)(uintptr_t)psizenewsd, (void*)(uintptr_t)pnewsd) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildSecurityDescriptorW(JNIEnv* km_env, jclass km_clazz, jlong powner, jlong pgroup, jint ccountofaccessentries, jlong plistofaccessentries, jint ccountofauditentries, jlong plistofauditentries, jlong poldsd, jlong psizenewsd, jlong pnewsd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildSecurityDescriptorW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (uint32_t)ccountofaccessentries, (void*)(uintptr_t)plistofaccessentries, (uint32_t)ccountofauditentries, (void*)(uintptr_t)plistofauditentries, (void*)(uintptr_t)poldsd, (void*)(uintptr_t)psizenewsd, (void*)(uintptr_t)pnewsd) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildTrusteeWithNameA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithNameA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pname);
#else
    (void)ptrustee;
    (void)pname;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildTrusteeWithNameW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithNameW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pname);
#else
    (void)ptrustee;
    (void)pname;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildTrusteeWithObjectsAndNameA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pobjname, jint objecttype, jlong objecttypename, jlong inheritedobjecttypename, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndNameA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pobjname, (int32_t)objecttype, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)inheritedobjecttypename, (void*)(uintptr_t)name);
#else
    (void)ptrustee;
    (void)pobjname;
    (void)objecttype;
    (void)objecttypename;
    (void)inheritedobjecttypename;
    (void)name;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildTrusteeWithObjectsAndNameW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pobjname, jint objecttype, jlong objecttypename, jlong inheritedobjecttypename, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndNameW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pobjname, (int32_t)objecttype, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)inheritedobjecttypename, (void*)(uintptr_t)name);
#else
    (void)ptrustee;
    (void)pobjname;
    (void)objecttype;
    (void)objecttypename;
    (void)inheritedobjecttypename;
    (void)name;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildTrusteeWithObjectsAndSidA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pobjsid, jlong pobjectguid, jlong pinheritedobjectguid, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndSidA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pobjsid, (void*)(uintptr_t)pobjectguid, (void*)(uintptr_t)pinheritedobjectguid, (void*)(uintptr_t)psid);
#else
    (void)ptrustee;
    (void)pobjsid;
    (void)pobjectguid;
    (void)pinheritedobjectguid;
    (void)psid;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildTrusteeWithObjectsAndSidW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong pobjsid, jlong pobjectguid, jlong pinheritedobjectguid, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithObjectsAndSidW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)pobjsid, (void*)(uintptr_t)pobjectguid, (void*)(uintptr_t)pinheritedobjectguid, (void*)(uintptr_t)psid);
#else
    (void)ptrustee;
    (void)pobjsid;
    (void)pobjectguid;
    (void)pinheritedobjectguid;
    (void)psid;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildTrusteeWithSidA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithSidA");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)psid);
#else
    (void)ptrustee;
    (void)psid;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1buildTrusteeWithSidW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildTrusteeWithSidW");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ptrustee, (void*)(uintptr_t)psid);
#else
    (void)ptrustee;
    (void)psid;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1convertSecurityDescriptorToStringSecurityDescriptorA(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jint requestedstringsdrevision, jint securityinformation, jlong stringsecuritydescriptor, jlong stringsecuritydescriptorlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSecurityDescriptorToStringSecurityDescriptorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (uint32_t)requestedstringsdrevision, (uint32_t)securityinformation, (void*)(uintptr_t)stringsecuritydescriptor, (void*)(uintptr_t)stringsecuritydescriptorlen) : -1;
#else
    (void)securitydescriptor;
    (void)requestedstringsdrevision;
    (void)securityinformation;
    (void)stringsecuritydescriptor;
    (void)stringsecuritydescriptorlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1convertSecurityDescriptorToStringSecurityDescriptorW(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jint requestedstringsdrevision, jint securityinformation, jlong stringsecuritydescriptor, jlong stringsecuritydescriptorlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSecurityDescriptorToStringSecurityDescriptorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (uint32_t)requestedstringsdrevision, (uint32_t)securityinformation, (void*)(uintptr_t)stringsecuritydescriptor, (void*)(uintptr_t)stringsecuritydescriptorlen) : -1;
#else
    (void)securitydescriptor;
    (void)requestedstringsdrevision;
    (void)securityinformation;
    (void)stringsecuritydescriptor;
    (void)stringsecuritydescriptorlen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1convertSidToStringSidA(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong stringsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSidToStringSidA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)stringsid) : -1;
#else
    (void)sid;
    (void)stringsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1convertSidToStringSidW(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong stringsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertSidToStringSidW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)stringsid) : -1;
#else
    (void)sid;
    (void)stringsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1convertStringSecurityDescriptorToSecurityDescriptorA(JNIEnv* km_env, jclass km_clazz, jlong stringsecuritydescriptor, jint stringsdrevision, jlong securitydescriptor, jlong securitydescriptorsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSecurityDescriptorToSecurityDescriptorA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringsecuritydescriptor, (uint32_t)stringsdrevision, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)securitydescriptorsize) : -1;
#else
    (void)stringsecuritydescriptor;
    (void)stringsdrevision;
    (void)securitydescriptor;
    (void)securitydescriptorsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1convertStringSecurityDescriptorToSecurityDescriptorW(JNIEnv* km_env, jclass km_clazz, jlong stringsecuritydescriptor, jint stringsdrevision, jlong securitydescriptor, jlong securitydescriptorsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSecurityDescriptorToSecurityDescriptorW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringsecuritydescriptor, (uint32_t)stringsdrevision, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)securitydescriptorsize) : -1;
#else
    (void)stringsecuritydescriptor;
    (void)stringsdrevision;
    (void)securitydescriptor;
    (void)securitydescriptorsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1convertStringSidToSidA(JNIEnv* km_env, jclass km_clazz, jlong stringsid, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSidToSidA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringsid, (void*)(uintptr_t)sid) : -1;
#else
    (void)stringsid;
    (void)sid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1convertStringSidToSidW(JNIEnv* km_env, jclass km_clazz, jlong stringsid, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertStringSidToSidW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)stringsid, (void*)(uintptr_t)sid) : -1;
#else
    (void)stringsid;
    (void)sid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1freeInheritedFromArray(JNIEnv* km_env, jclass km_clazz, jlong pinheritarray, jshort acecnt, jlong pfnarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeInheritedFromArray");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinheritarray, (uint16_t)acecnt, (void*)(uintptr_t)pfnarray) : 0;
#else
    (void)pinheritarray;
    (void)acecnt;
    (void)pfnarray;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getAuditedPermissionsFromAclA(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong ptrustee, jlong psuccessfulauditedrights, jlong pfailedauditrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAuditedPermissionsFromAclA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)ptrustee, (void*)(uintptr_t)psuccessfulauditedrights, (void*)(uintptr_t)pfailedauditrights) : 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)psuccessfulauditedrights;
    (void)pfailedauditrights;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getAuditedPermissionsFromAclW(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong ptrustee, jlong psuccessfulauditedrights, jlong pfailedauditrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAuditedPermissionsFromAclW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)ptrustee, (void*)(uintptr_t)psuccessfulauditedrights, (void*)(uintptr_t)pfailedauditrights) : 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)psuccessfulauditedrights;
    (void)pfailedauditrights;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getEffectiveRightsFromAclA(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong ptrustee, jlong paccessrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEffectiveRightsFromAclA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)ptrustee, (void*)(uintptr_t)paccessrights) : 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)paccessrights;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getEffectiveRightsFromAclW(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong ptrustee, jlong paccessrights) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEffectiveRightsFromAclW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)ptrustee, (void*)(uintptr_t)paccessrights) : 0;
#else
    (void)pacl;
    (void)ptrustee;
    (void)paccessrights;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getExplicitEntriesFromAclA(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong pccountofexplicitentries, jlong plistofexplicitentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExplicitEntriesFromAclA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)pccountofexplicitentries, (void*)(uintptr_t)plistofexplicitentries) : 0;
#else
    (void)pacl;
    (void)pccountofexplicitentries;
    (void)plistofexplicitentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getExplicitEntriesFromAclW(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong pccountofexplicitentries, jlong plistofexplicitentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExplicitEntriesFromAclW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)pccountofexplicitentries, (void*)(uintptr_t)plistofexplicitentries) : 0;
#else
    (void)pacl;
    (void)pccountofexplicitentries;
    (void)plistofexplicitentries;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getInheritanceSourceA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jint container, jlong pobjectclassguids, jint guidcount, jlong pacl, jlong pfnarray, jlong pgenericmapping, jlong pinheritarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInheritanceSourceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (int32_t)container, (void*)(uintptr_t)pobjectclassguids, (uint32_t)guidcount, (void*)(uintptr_t)pacl, (void*)(uintptr_t)pfnarray, (void*)(uintptr_t)pgenericmapping, (void*)(uintptr_t)pinheritarray) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getInheritanceSourceW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jint container, jlong pobjectclassguids, jint guidcount, jlong pacl, jlong pfnarray, jlong pgenericmapping, jlong pinheritarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetInheritanceSourceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (int32_t)container, (void*)(uintptr_t)pobjectclassguids, (uint32_t)guidcount, (void*)(uintptr_t)pacl, (void*)(uintptr_t)pfnarray, (void*)(uintptr_t)pgenericmapping, (void*)(uintptr_t)pinheritarray) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getMultipleTrusteeA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : NULL;
#else
    (void)ptrustee;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getMultipleTrusteeOperationA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeOperationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getMultipleTrusteeOperationW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeOperationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getMultipleTrusteeW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMultipleTrusteeW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : NULL;
#else
    (void)ptrustee;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getNamedSecurityInfoA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong ppsidowner, jlong ppsidgroup, jlong ppdacl, jlong ppsacl, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedSecurityInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)ppsidowner, (void*)(uintptr_t)ppsidgroup, (void*)(uintptr_t)ppdacl, (void*)(uintptr_t)ppsacl, (void*)(uintptr_t)ppsecuritydescriptor) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getNamedSecurityInfoW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong ppsidowner, jlong ppsidgroup, jlong ppdacl, jlong ppsacl, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNamedSecurityInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)ppsidowner, (void*)(uintptr_t)ppsidgroup, (void*)(uintptr_t)ppdacl, (void*)(uintptr_t)ppsacl, (void*)(uintptr_t)ppsecuritydescriptor) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getSecurityInfo(JNIEnv* km_env, jclass km_clazz, jlong handle, jint objecttype, jint securityinfo, jlong ppsidowner, jlong ppsidgroup, jlong ppdacl, jlong ppsacl, jlong ppsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)ppsidowner, (void*)(uintptr_t)ppsidgroup, (void*)(uintptr_t)ppdacl, (void*)(uintptr_t)ppsacl, (void*)(uintptr_t)ppsecuritydescriptor) : 0;
#else
    (void)handle;
    (void)objecttype;
    (void)securityinfo;
    (void)ppsidowner;
    (void)ppsidgroup;
    (void)ppdacl;
    (void)ppsacl;
    (void)ppsecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getTrusteeFormA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeFormA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getTrusteeFormW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeFormW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getTrusteeNameA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeNameA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : NULL;
#else
    (void)ptrustee;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getTrusteeNameW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeNameW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : NULL;
#else
    (void)ptrustee;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getTrusteeTypeA(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeTypeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1getTrusteeTypeW(JNIEnv* km_env, jclass km_clazz, jlong ptrustee) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTrusteeTypeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptrustee) : -1;
#else
    (void)ptrustee;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1lookupSecurityDescriptorPartsA(JNIEnv* km_env, jclass km_clazz, jlong ppowner, jlong ppgroup, jlong pccountofaccessentries, jlong pplistofaccessentries, jlong pccountofauditentries, jlong pplistofauditentries, jlong psd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupSecurityDescriptorPartsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppowner, (void*)(uintptr_t)ppgroup, (void*)(uintptr_t)pccountofaccessentries, (void*)(uintptr_t)pplistofaccessentries, (void*)(uintptr_t)pccountofauditentries, (void*)(uintptr_t)pplistofauditentries, (void*)(uintptr_t)psd) : 0;
#else
    (void)ppowner;
    (void)ppgroup;
    (void)pccountofaccessentries;
    (void)pplistofaccessentries;
    (void)pccountofauditentries;
    (void)pplistofauditentries;
    (void)psd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1lookupSecurityDescriptorPartsW(JNIEnv* km_env, jclass km_clazz, jlong ppowner, jlong ppgroup, jlong pccountofaccessentries, jlong pplistofaccessentries, jlong pccountofauditentries, jlong pplistofauditentries, jlong psd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupSecurityDescriptorPartsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppowner, (void*)(uintptr_t)ppgroup, (void*)(uintptr_t)pccountofaccessentries, (void*)(uintptr_t)pplistofaccessentries, (void*)(uintptr_t)pccountofauditentries, (void*)(uintptr_t)pplistofauditentries, (void*)(uintptr_t)psd) : 0;
#else
    (void)ppowner;
    (void)ppgroup;
    (void)pccountofaccessentries;
    (void)pplistofaccessentries;
    (void)pccountofauditentries;
    (void)pplistofauditentries;
    (void)psd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1setEntriesInAclA(JNIEnv* km_env, jclass km_clazz, jint ccountofexplicitentries, jlong plistofexplicitentries, jlong oldacl, jlong newacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEntriesInAclA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ccountofexplicitentries, (void*)(uintptr_t)plistofexplicitentries, (void*)(uintptr_t)oldacl, (void*)(uintptr_t)newacl) : 0;
#else
    (void)ccountofexplicitentries;
    (void)plistofexplicitentries;
    (void)oldacl;
    (void)newacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1setEntriesInAclW(JNIEnv* km_env, jclass km_clazz, jint ccountofexplicitentries, jlong plistofexplicitentries, jlong oldacl, jlong newacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEntriesInAclW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ccountofexplicitentries, (void*)(uintptr_t)plistofexplicitentries, (void*)(uintptr_t)oldacl, (void*)(uintptr_t)newacl) : 0;
#else
    (void)ccountofexplicitentries;
    (void)plistofexplicitentries;
    (void)oldacl;
    (void)newacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1setNamedSecurityInfoA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong psidowner, jlong psidgroup, jlong pdacl, jlong psacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNamedSecurityInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)psidowner, (void*)(uintptr_t)psidgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1setNamedSecurityInfoW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong psidowner, jlong psidgroup, jlong pdacl, jlong psacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetNamedSecurityInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)psidowner, (void*)(uintptr_t)psidgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl) : 0;
#else
    (void)pobjectname;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1setSecurityInfo(JNIEnv* km_env, jclass km_clazz, jlong handle, jint objecttype, jint securityinfo, jlong psidowner, jlong psidgroup, jlong pdacl, jlong psacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)psidowner, (void*)(uintptr_t)psidgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl) : 0;
#else
    (void)handle;
    (void)objecttype;
    (void)securityinfo;
    (void)psidowner;
    (void)psidgroup;
    (void)pdacl;
    (void)psacl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1treeResetNamedSecurityInfoA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong powner, jlong pgroup, jlong pdacl, jlong psacl, jint keepexplicit, jlong fnprogress, jint progressinvokesetting, jlong args) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeResetNamedSecurityInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl, (int32_t)keepexplicit, (void*)(uintptr_t)fnprogress, (int32_t)progressinvokesetting, (void*)(uintptr_t)args) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1treeResetNamedSecurityInfoW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong powner, jlong pgroup, jlong pdacl, jlong psacl, jint keepexplicit, jlong fnprogress, jint progressinvokesetting, jlong args) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeResetNamedSecurityInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl, (int32_t)keepexplicit, (void*)(uintptr_t)fnprogress, (int32_t)progressinvokesetting, (void*)(uintptr_t)args) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1treeSetNamedSecurityInfoA(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong powner, jlong pgroup, jlong pdacl, jlong psacl, jint dwaction, jlong fnprogress, jint progressinvokesetting, jlong args) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeSetNamedSecurityInfoA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl, (uint32_t)dwaction, (void*)(uintptr_t)fnprogress, (int32_t)progressinvokesetting, (void*)(uintptr_t)args) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_authorization_WindowsWin32SecurityAuthorizationJniBridge_windowssys_1windows_1win32_1security_1authorization_1treeSetNamedSecurityInfoW(JNIEnv* km_env, jclass km_clazz, jlong pobjectname, jint objecttype, jint securityinfo, jlong powner, jlong pgroup, jlong pdacl, jlong psacl, jint dwaction, jlong fnprogress, jint progressinvokesetting, jlong args) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*, void*, void*, uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TreeSetNamedSecurityInfoW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pobjectname, (int32_t)objecttype, (uint32_t)securityinfo, (void*)(uintptr_t)powner, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)psacl, (uint32_t)dwaction, (void*)(uintptr_t)fnprogress, (int32_t)progressinvokesetting, (void*)(uintptr_t)args) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

