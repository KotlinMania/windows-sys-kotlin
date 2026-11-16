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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheck(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong clienttoken, jint desiredaccess, jlong genericmapping, jlong privilegeset, jlong privilegesetlength, jlong grantedaccess, jlong accessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheck");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)privilegeset, (void*)(uintptr_t)privilegesetlength, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)genericmapping;
    (void)privilegeset;
    (void)privilegesetlength;
    (void)grantedaccess;
    (void)accessstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jint desiredaccess, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatus, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckAndAuditAlarmA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jint desiredaccess, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatus, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckAndAuditAlarmW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckByType(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong principalselfsid, jlong clienttoken, jint desiredaccess, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jlong privilegeset, jlong privilegesetlength, jlong grantedaccess, jlong accessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)principalselfsid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)privilegeset, (void*)(uintptr_t)privilegesetlength, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)principalselfsid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)privilegeset;
    (void)privilegesetlength;
    (void)grantedaccess;
    (void)accessstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatus, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeAndAuditAlarmA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatus, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeAndAuditAlarmW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckByTypeResultList(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong principalselfsid, jlong clienttoken, jint desiredaccess, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jlong privilegeset, jlong privilegesetlength, jlong grantedaccesslist, jlong accessstatuslist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)principalselfsid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)privilegeset, (void*)(uintptr_t)privilegesetlength, (void*)(uintptr_t)grantedaccesslist, (void*)(uintptr_t)accessstatuslist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)principalselfsid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)privilegeset;
    (void)privilegesetlength;
    (void)grantedaccesslist;
    (void)accessstatuslist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatuslist, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatuslist, (void*)(uintptr_t)pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatuslist;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatuslist, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmByHandleA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatuslist, (void*)(uintptr_t)pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatuslist;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccesslist, jlong accessstatuslist, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmByHandleW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccesslist, (void*)(uintptr_t)accessstatuslist, (void*)(uintptr_t)pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccesslist;
    (void)accessstatuslist;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccesslist, jlong accessstatuslist, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccesslist, (void*)(uintptr_t)accessstatuslist, (void*)(uintptr_t)pfgenerateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccesslist;
    (void)accessstatuslist;
    (void)pfgenerateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAccessAllowedAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessAllowedAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)accessmask, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAccessAllowedAceEx(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessAllowedAceEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAccessAllowedObjectAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong objecttypeguid, jlong inheritedobjecttypeguid, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessAllowedObjectAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)objecttypeguid, (void*)(uintptr_t)inheritedobjecttypeguid, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAccessDeniedAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessDeniedAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)accessmask, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAccessDeniedAceEx(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessDeniedAceEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAccessDeniedObjectAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong objecttypeguid, jlong inheritedobjecttypeguid, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessDeniedObjectAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)objecttypeguid, (void*)(uintptr_t)inheritedobjecttypeguid, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint dwstartingaceindex, jlong pacelist, jint nacelistlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)dwstartingaceindex, (void*)(uintptr_t)pacelist, (uint32_t)nacelistlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)dwstartingaceindex;
    (void)pacelist;
    (void)nacelistlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAuditAccessAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint dwaccessmask, jlong psid, jint bauditsuccess, jint bauditfailure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAuditAccessAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)dwaccessmask, (void*)(uintptr_t)psid, (int32_t)bauditsuccess, (int32_t)bauditfailure);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)dwaccessmask;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAuditAccessAceEx(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint dwaccessmask, jlong psid, jint bauditsuccess, jint bauditfailure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAuditAccessAceEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)dwaccessmask, (void*)(uintptr_t)psid, (int32_t)bauditsuccess, (int32_t)bauditfailure);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)dwaccessmask;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddAuditAccessObjectAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong objecttypeguid, jlong inheritedobjecttypeguid, jlong psid, jint bauditsuccess, jint bauditfailure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAuditAccessObjectAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)objecttypeguid, (void*)(uintptr_t)inheritedobjecttypeguid, (void*)(uintptr_t)psid, (int32_t)bauditsuccess, (int32_t)bauditfailure);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddConditionalAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jbyte acetype, jint accessmask, jlong psid, jlong conditionstr, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddConditionalAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint8_t)acetype, (uint32_t)accessmask, (void*)(uintptr_t)psid, (void*)(uintptr_t)conditionstr, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)acetype;
    (void)accessmask;
    (void)psid;
    (void)conditionstr;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddMandatoryAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint mandatorypolicy, jlong plabelsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddMandatoryAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)mandatorypolicy, (void*)(uintptr_t)plabelsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)mandatorypolicy;
    (void)plabelsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddResourceAttributeAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong psid, jlong pattributeinfo, jlong preturnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddResourceAttributeAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)psid, (void*)(uintptr_t)pattributeinfo, (void*)(uintptr_t)preturnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    (void)pattributeinfo;
    (void)preturnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAddScopedPolicyIDAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddScopedPolicyIDAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAdjustTokenGroups(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint resettodefault, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustTokenGroups");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)resettodefault, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAdjustTokenPrivileges(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint disableallprivileges, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustTokenPrivileges");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)disableallprivileges, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAllocateAndInitializeSid(JNIEnv* km_env, jclass km_clazz, jlong pidentifierauthority, jbyte nsubauthoritycount, jint nsubauthority0, jint nsubauthority1, jint nsubauthority2, jint nsubauthority3, jint nsubauthority4, jint nsubauthority5, jint nsubauthority6, jint nsubauthority7, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateAndInitializeSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pidentifierauthority, (uint8_t)nsubauthoritycount, (uint32_t)nsubauthority0, (uint32_t)nsubauthority1, (uint32_t)nsubauthority2, (uint32_t)nsubauthority3, (uint32_t)nsubauthority4, (uint32_t)nsubauthority5, (uint32_t)nsubauthority6, (uint32_t)nsubauthority7, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pidentifierauthority;
    (void)nsubauthoritycount;
    (void)nsubauthority0;
    (void)nsubauthority1;
    (void)nsubauthority2;
    (void)nsubauthority3;
    (void)nsubauthority4;
    (void)nsubauthority5;
    (void)nsubauthority6;
    (void)nsubauthority7;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAllocateLocallyUniqueId(JNIEnv* km_env, jclass km_clazz, jlong luid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateLocallyUniqueId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)luid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)luid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAreAllAccessesGranted(JNIEnv* km_env, jclass km_clazz, jint grantedaccess, jint desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreAllAccessesGranted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)grantedaccess, (uint32_t)desiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)grantedaccess;
    (void)desiredaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityAreAnyAccessesGranted(JNIEnv* km_env, jclass km_clazz, jint grantedaccess, jint desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreAnyAccessesGranted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)grantedaccess, (uint32_t)desiredaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)grantedaccess;
    (void)desiredaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityCheckTokenCapability(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong capabilitysidtocheck, jlong hascapability) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckTokenCapability");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)capabilitysidtocheck, (void*)(uintptr_t)hascapability);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)capabilitysidtocheck;
    (void)hascapability;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityCheckTokenMembership(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong sidtocheck, jlong ismember) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckTokenMembership");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)sidtocheck, (void*)(uintptr_t)ismember);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)sidtocheck;
    (void)ismember;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityCheckTokenMembershipEx(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong sidtocheck, jint flags, jlong ismember) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckTokenMembershipEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)sidtocheck, (uint32_t)flags, (void*)(uintptr_t)ismember);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)sidtocheck;
    (void)flags;
    (void)ismember;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong parentdescriptor, jlong currentsecuritydescriptor, jlong newsecuritydescriptor, jlong objecttype, jboolean isdirectoryobject, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertToAutoInheritPrivateObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)parentdescriptor, (void*)(uintptr_t)currentsecuritydescriptor, (void*)(uintptr_t)newsecuritydescriptor, (void*)(uintptr_t)objecttype, (bool)isdirectoryobject, (void*)(uintptr_t)genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)parentdescriptor;
    (void)currentsecuritydescriptor;
    (void)newsecuritydescriptor;
    (void)objecttype;
    (void)isdirectoryobject;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityCopySid(JNIEnv* km_env, jclass km_clazz, jint ndestinationsidlength, jlong pdestinationsid, jlong psourcesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopySid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ndestinationsidlength, (void*)(uintptr_t)pdestinationsid, (void*)(uintptr_t)psourcesid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ndestinationsidlength;
    (void)pdestinationsid;
    (void)psourcesid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityCreatePrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong parentdescriptor, jlong creatordescriptor, jlong newdescriptor, jint isdirectoryobject, jlong token, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)parentdescriptor, (void*)(uintptr_t)creatordescriptor, (void*)(uintptr_t)newdescriptor, (int32_t)isdirectoryobject, (void*)(uintptr_t)token, (void*)(uintptr_t)genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)parentdescriptor;
    (void)creatordescriptor;
    (void)newdescriptor;
    (void)isdirectoryobject;
    (void)token;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(JNIEnv* km_env, jclass km_clazz, jlong parentdescriptor, jlong creatordescriptor, jlong newdescriptor, jlong objecttype, jint iscontainerobject, jint autoinheritflags, jlong token, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateObjectSecurityEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)parentdescriptor, (void*)(uintptr_t)creatordescriptor, (void*)(uintptr_t)newdescriptor, (void*)(uintptr_t)objecttype, (int32_t)iscontainerobject, (uint32_t)autoinheritflags, (void*)(uintptr_t)token, (void*)(uintptr_t)genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)parentdescriptor;
    (void)creatordescriptor;
    (void)newdescriptor;
    (void)objecttype;
    (void)iscontainerobject;
    (void)autoinheritflags;
    (void)token;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(JNIEnv* km_env, jclass km_clazz, jlong parentdescriptor, jlong creatordescriptor, jlong newdescriptor, jlong objecttypes, jint guidcount, jint iscontainerobject, jint autoinheritflags, jlong token, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateObjectSecurityWithMultipleInheritance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)parentdescriptor, (void*)(uintptr_t)creatordescriptor, (void*)(uintptr_t)newdescriptor, (void*)(uintptr_t)objecttypes, (uint32_t)guidcount, (int32_t)iscontainerobject, (uint32_t)autoinheritflags, (void*)(uintptr_t)token, (void*)(uintptr_t)genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)parentdescriptor;
    (void)creatordescriptor;
    (void)newdescriptor;
    (void)objecttypes;
    (void)guidcount;
    (void)iscontainerobject;
    (void)autoinheritflags;
    (void)token;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityCreateRestrictedToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint flags, jint disablesidcount, jlong sidstodisable, jint deleteprivilegecount, jlong privilegestodelete, jint restrictedsidcount, jlong sidstorestrict, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRestrictedToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)flags, (uint32_t)disablesidcount, (void*)(uintptr_t)sidstodisable, (uint32_t)deleteprivilegecount, (void*)(uintptr_t)privilegestodelete, (uint32_t)restrictedsidcount, (void*)(uintptr_t)sidstorestrict, (void*)(uintptr_t)newtokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)disablesidcount;
    (void)sidstodisable;
    (void)deleteprivilegecount;
    (void)privilegestodelete;
    (void)restrictedsidcount;
    (void)sidstorestrict;
    (void)newtokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityCreateWellKnownSid(JNIEnv* km_env, jclass km_clazz, jint wellknownsidtype, jlong domainsid, jlong psid, jlong cbsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWellKnownSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)wellknownsidtype, (void*)(uintptr_t)domainsid, (void*)(uintptr_t)psid, (void*)(uintptr_t)cbsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wellknownsidtype;
    (void)domainsid;
    (void)psid;
    (void)cbsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityDeleteAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwaceindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwaceindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwaceindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(JNIEnv* km_env, jclass km_clazz, jlong capname, jlong capabilitygroupsids, jlong capabilitygroupsidcount, jlong capabilitysids, jlong capabilitysidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-base-l1-2-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeriveCapabilitySidsFromName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)capname, (void*)(uintptr_t)capabilitygroupsids, (void*)(uintptr_t)capabilitygroupsidcount, (void*)(uintptr_t)capabilitysids, (void*)(uintptr_t)capabilitysidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)capname;
    (void)capabilitygroupsids;
    (void)capabilitygroupsidcount;
    (void)capabilitysids;
    (void)capabilitysidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong objectdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyPrivateObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objectdescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectdescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityDuplicateToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint impersonationlevel, jlong duplicatetokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (int32_t)impersonationlevel, (void*)(uintptr_t)duplicatetokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)existingtokenhandle;
    (void)impersonationlevel;
    (void)duplicatetokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityDuplicateTokenEx(JNIEnv* km_env, jclass km_clazz, jlong hexistingtoken, jint dwdesiredaccess, jlong lptokenattributes, jint impersonationlevel, jint tokentype, jlong phnewtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateTokenEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hexistingtoken, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lptokenattributes, (int32_t)impersonationlevel, (int32_t)tokentype, (void*)(uintptr_t)phnewtoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hexistingtoken;
    (void)dwdesiredaccess;
    (void)lptokenattributes;
    (void)impersonationlevel;
    (void)tokentype;
    (void)phnewtoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityEqualDomainSid(JNIEnv* km_env, jclass km_clazz, jlong psid1, jlong psid2, jlong pfequal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualDomainSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid1, (void*)(uintptr_t)psid2, (void*)(uintptr_t)pfequal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid1;
    (void)psid2;
    (void)pfequal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityEqualPrefixSid(JNIEnv* km_env, jclass km_clazz, jlong psid1, jlong psid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualPrefixSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid1, (void*)(uintptr_t)psid2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid1;
    (void)psid2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityEqualSid(JNIEnv* km_env, jclass km_clazz, jlong psid1, jlong psid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid1, (void*)(uintptr_t)psid2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid1;
    (void)psid2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityFindFirstFreeAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong pace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFreeAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)pace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)pace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityFreeSid(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeSid");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)psid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwaceindex, jlong pace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwaceindex, (void*)(uintptr_t)pace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)dwaceindex;
    (void)pace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetAclInformation(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong paclinformation, jint naclinformationlength, jint dwaclinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAclInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)paclinformation, (uint32_t)naclinformationlength, (int32_t)dwaclinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)paclinformation;
    (void)naclinformationlength;
    (void)dwaclinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetAppContainerAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint startingaceindex, jlong appcontainerace, jlong appcontaineraceindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppContainerAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)startingaceindex, (void*)(uintptr_t)appcontainerace, (void*)(uintptr_t)appcontaineraceindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)acl;
    (void)startingaceindex;
    (void)appcontainerace;
    (void)appcontaineraceindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetCachedSigningLevel(JNIEnv* km_env, jclass km_clazz, jlong file, jlong flags, jlong signinglevel, jlong thumbprint, jlong thumbprintsize, jlong thumbprintalgorithm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCachedSigningLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)flags, (void*)(uintptr_t)signinglevel, (void*)(uintptr_t)thumbprint, (void*)(uintptr_t)thumbprintsize, (void*)(uintptr_t)thumbprintalgorithm);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)file;
    (void)flags;
    (void)signinglevel;
    (void)thumbprint;
    (void)thumbprintsize;
    (void)thumbprintalgorithm;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetFileSecurityA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint requestedinformation, jlong psecuritydescriptor, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSecurityA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)requestedinformation, (void*)(uintptr_t)psecuritydescriptor, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetFileSecurityW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint requestedinformation, jlong psecuritydescriptor, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSecurityW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)requestedinformation, (void*)(uintptr_t)psecuritydescriptor, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetKernelObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong handle, jint requestedinformation, jlong psecuritydescriptor, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKernelObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)requestedinformation, (void*)(uintptr_t)psecuritydescriptor, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetLengthSid(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLengthSid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetPrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong objectdescriptor, jint securityinformation, jlong resultantdescriptor, jint descriptorlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objectdescriptor, (uint32_t)securityinformation, (void*)(uintptr_t)resultantdescriptor, (uint32_t)descriptorlength, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectdescriptor;
    (void)securityinformation;
    (void)resultantdescriptor;
    (void)descriptorlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSecurityDescriptorControl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong pcontrol, jlong lpdwrevision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)pcontrol, (void*)(uintptr_t)lpdwrevision);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)pcontrol;
    (void)lpdwrevision;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSecurityDescriptorDacl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong lpbdaclpresent, jlong pdacl, jlong lpbdacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorDacl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)lpbdaclpresent, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)lpbdacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)lpbdaclpresent;
    (void)pdacl;
    (void)lpbdacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSecurityDescriptorGroup(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong pgroup, jlong lpbgroupdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)lpbgroupdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)pgroup;
    (void)lpbgroupdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSecurityDescriptorLength(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorLength");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)psecuritydescriptor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSecurityDescriptorOwner(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong powner, jlong lpbownerdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorOwner");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)powner, (void*)(uintptr_t)lpbownerdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)powner;
    (void)lpbownerdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong rmcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorRMControl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)rmcontrol);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)securitydescriptor;
    (void)rmcontrol;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSecurityDescriptorSacl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong lpbsaclpresent, jlong psacl, jlong lpbsacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorSacl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)lpbsaclpresent, (void*)(uintptr_t)psacl, (void*)(uintptr_t)lpbsacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)lpbsaclpresent;
    (void)psacl;
    (void)lpbsacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSidIdentifierAuthority(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidIdentifierAuthority");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)psid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSidLengthRequired(JNIEnv* km_env, jclass km_clazz, jbyte nsubauthoritycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidLengthRequired");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)nsubauthoritycount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)nsubauthoritycount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSidSubAuthority(JNIEnv* km_env, jclass km_clazz, jlong psid, jint nsubauthority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidSubAuthority");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid, (uint32_t)nsubauthority);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)psid;
    (void)nsubauthority;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetSidSubAuthorityCount(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidSubAuthorityCount");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)psid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetTokenInformation(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTokenInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetUserObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong psirequested, jlong psid, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)psirequested, (void*)(uintptr_t)psid, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)psirequested;
    (void)psid;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityGetWindowsAccountDomainSid(JNIEnv* km_env, jclass km_clazz, jlong psid, jlong pdomainsid, jlong cbdomainsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowsAccountDomainSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid, (void*)(uintptr_t)pdomainsid, (void*)(uintptr_t)cbdomainsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid;
    (void)pdomainsid;
    (void)cbdomainsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityImpersonateAnonymousToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateAnonymousToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityImpersonateLoggedOnUser(JNIEnv* km_env, jclass km_clazz, jlong htoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateLoggedOnUser");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityImpersonateSelf(JNIEnv* km_env, jclass km_clazz, jint impersonationlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateSelf");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)impersonationlevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)impersonationlevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityInitializeAcl(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint nacllength, jint dwaclrevision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeAcl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)nacllength, (uint32_t)dwaclrevision);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)nacllength;
    (void)dwaclrevision;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityInitializeSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jint dwrevision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSecurityDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (uint32_t)dwrevision);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)dwrevision;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityInitializeSid(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong pidentifierauthority, jbyte nsubauthoritycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)pidentifierauthority, (uint8_t)nsubauthoritycount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sid;
    (void)pidentifierauthority;
    (void)nsubauthoritycount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityIsTokenRestricted(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsTokenRestricted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityIsValidAcl(JNIEnv* km_env, jclass km_clazz, jlong pacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidAcl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityIsValidSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidSecurityDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityIsValidSid(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityIsWellKnownSid(JNIEnv* km_env, jclass km_clazz, jlong psid, jint wellknownsidtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWellKnownSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psid, (int32_t)wellknownsidtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psid;
    (void)wellknownsidtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLogonUserA(JNIEnv* km_env, jclass km_clazz, jlong lpszusername, jlong lpszdomain, jlong lpszpassword, jint dwlogontype, jint dwlogonprovider, jlong phtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszpassword, (uint32_t)dwlogontype, (uint32_t)dwlogonprovider, (void*)(uintptr_t)phtoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLogonUserExA(JNIEnv* km_env, jclass km_clazz, jlong lpszusername, jlong lpszdomain, jlong lpszpassword, jint dwlogontype, jint dwlogonprovider, jlong phtoken, jlong pplogonsid, jlong ppprofilebuffer, jlong pdwprofilelength, jlong pquotalimits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszpassword, (uint32_t)dwlogontype, (uint32_t)dwlogonprovider, (void*)(uintptr_t)phtoken, (void*)(uintptr_t)pplogonsid, (void*)(uintptr_t)ppprofilebuffer, (void*)(uintptr_t)pdwprofilelength, (void*)(uintptr_t)pquotalimits);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    (void)pplogonsid;
    (void)ppprofilebuffer;
    (void)pdwprofilelength;
    (void)pquotalimits;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLogonUserExW(JNIEnv* km_env, jclass km_clazz, jlong lpszusername, jlong lpszdomain, jlong lpszpassword, jint dwlogontype, jint dwlogonprovider, jlong phtoken, jlong pplogonsid, jlong ppprofilebuffer, jlong pdwprofilelength, jlong pquotalimits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszpassword, (uint32_t)dwlogontype, (uint32_t)dwlogonprovider, (void*)(uintptr_t)phtoken, (void*)(uintptr_t)pplogonsid, (void*)(uintptr_t)ppprofilebuffer, (void*)(uintptr_t)pdwprofilelength, (void*)(uintptr_t)pquotalimits);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    (void)pplogonsid;
    (void)ppprofilebuffer;
    (void)pdwprofilelength;
    (void)pquotalimits;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLogonUserW(JNIEnv* km_env, jclass km_clazz, jlong lpszusername, jlong lpszdomain, jlong lpszpassword, jint dwlogontype, jint dwlogonprovider, jlong phtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszpassword, (uint32_t)dwlogontype, (uint32_t)dwlogonprovider, (void*)(uintptr_t)phtoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupAccountNameA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpaccountname, jlong sid, jlong cbsid, jlong referenceddomainname, jlong cchreferenceddomainname, jlong peuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpaccountname, (void*)(uintptr_t)sid, (void*)(uintptr_t)cbsid, (void*)(uintptr_t)referenceddomainname, (void*)(uintptr_t)cchreferenceddomainname, (void*)(uintptr_t)peuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpaccountname;
    (void)sid;
    (void)cbsid;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupAccountNameW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpaccountname, jlong sid, jlong cbsid, jlong referenceddomainname, jlong cchreferenceddomainname, jlong peuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpaccountname, (void*)(uintptr_t)sid, (void*)(uintptr_t)cbsid, (void*)(uintptr_t)referenceddomainname, (void*)(uintptr_t)cchreferenceddomainname, (void*)(uintptr_t)peuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpaccountname;
    (void)sid;
    (void)cbsid;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupAccountSidA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong sid, jlong name, jlong cchname, jlong referenceddomainname, jlong cchreferenceddomainname, jlong peuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountSidA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)sid, (void*)(uintptr_t)name, (void*)(uintptr_t)cchname, (void*)(uintptr_t)referenceddomainname, (void*)(uintptr_t)cchreferenceddomainname, (void*)(uintptr_t)peuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)sid;
    (void)name;
    (void)cchname;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupAccountSidW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong sid, jlong name, jlong cchname, jlong referenceddomainname, jlong cchreferenceddomainname, jlong peuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountSidW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)sid, (void*)(uintptr_t)name, (void*)(uintptr_t)cchname, (void*)(uintptr_t)referenceddomainname, (void*)(uintptr_t)cchreferenceddomainname, (void*)(uintptr_t)peuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)sid;
    (void)name;
    (void)cchname;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpname, jlong lpdisplayname, jlong cchdisplayname, jlong lplanguageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeDisplayNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)cchdisplayname, (void*)(uintptr_t)lplanguageid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpdisplayname;
    (void)cchdisplayname;
    (void)lplanguageid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpname, jlong lpdisplayname, jlong cchdisplayname, jlong lplanguageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeDisplayNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)cchdisplayname, (void*)(uintptr_t)lplanguageid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpdisplayname;
    (void)cchdisplayname;
    (void)lplanguageid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupPrivilegeNameA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpluid, jlong lpname, jlong cchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpluid, (void*)(uintptr_t)lpname, (void*)(uintptr_t)cchname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpluid;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupPrivilegeNameW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpluid, jlong lpname, jlong cchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpluid, (void*)(uintptr_t)lpname, (void*)(uintptr_t)cchname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpluid;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupPrivilegeValueA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpname, jlong lpluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeValueA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpluid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpluid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityLookupPrivilegeValueW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpname, jlong lpluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeValueW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpluid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpluid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityMakeAbsoluteSD(JNIEnv* km_env, jclass km_clazz, jlong pselfrelativesecuritydescriptor, jlong pabsolutesecuritydescriptor, jlong lpdwabsolutesecuritydescriptorsize, jlong pdacl, jlong lpdwdaclsize, jlong psacl, jlong lpdwsaclsize, jlong powner, jlong lpdwownersize, jlong pprimarygroup, jlong lpdwprimarygroupsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeAbsoluteSD");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pselfrelativesecuritydescriptor, (void*)(uintptr_t)pabsolutesecuritydescriptor, (void*)(uintptr_t)lpdwabsolutesecuritydescriptorsize, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)lpdwdaclsize, (void*)(uintptr_t)psacl, (void*)(uintptr_t)lpdwsaclsize, (void*)(uintptr_t)powner, (void*)(uintptr_t)lpdwownersize, (void*)(uintptr_t)pprimarygroup, (void*)(uintptr_t)lpdwprimarygroupsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pselfrelativesecuritydescriptor;
    (void)pabsolutesecuritydescriptor;
    (void)lpdwabsolutesecuritydescriptorsize;
    (void)pdacl;
    (void)lpdwdaclsize;
    (void)psacl;
    (void)lpdwsaclsize;
    (void)powner;
    (void)lpdwownersize;
    (void)pprimarygroup;
    (void)lpdwprimarygroupsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityMakeSelfRelativeSD(JNIEnv* km_env, jclass km_clazz, jlong pabsolutesecuritydescriptor, jlong pselfrelativesecuritydescriptor, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSelfRelativeSD");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pabsolutesecuritydescriptor, (void*)(uintptr_t)pselfrelativesecuritydescriptor, (void*)(uintptr_t)lpdwbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pabsolutesecuritydescriptor;
    (void)pselfrelativesecuritydescriptor;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityMapGenericMask(JNIEnv* km_env, jclass km_clazz, jlong accessmask, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapGenericMask");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)accessmask, (void*)(uintptr_t)genericmapping);
    } else {
        errno = ENOSYS;
    }
#else
    (void)accessmask;
    (void)genericmapping;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityObjectCloseAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jint generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectCloseAuditAlarmA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (int32_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityObjectCloseAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jint generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectCloseAuditAlarmW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (int32_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jint generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectDeleteAuditAlarmA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (int32_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jint generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectDeleteAuditAlarmW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (int32_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityObjectOpenAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong psecuritydescriptor, jlong clienttoken, jint desiredaccess, jint grantedaccess, jlong privileges, jint objectcreation, jint accessgranted, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectOpenAuditAlarmA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)grantedaccess, (void*)(uintptr_t)privileges, (int32_t)objectcreation, (int32_t)accessgranted, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)psecuritydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityObjectOpenAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong psecuritydescriptor, jlong clienttoken, jint desiredaccess, jint grantedaccess, jlong privileges, jint objectcreation, jint accessgranted, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectOpenAuditAlarmW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)grantedaccess, (void*)(uintptr_t)privileges, (int32_t)objectcreation, (int32_t)accessgranted, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)psecuritydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jint desiredaccess, jlong privileges, jint accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectPrivilegeAuditAlarmA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)privileges, (int32_t)accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jint desiredaccess, jlong privileges, jint accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectPrivilegeAuditAlarmW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)privileges, (int32_t)accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityPrivilegeCheck(JNIEnv* km_env, jclass km_clazz, jlong clienttoken, jlong requiredprivileges, jlong pfresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivilegeCheck");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clienttoken, (void*)(uintptr_t)requiredprivileges, (void*)(uintptr_t)pfresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)pfresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong servicename, jlong clienttoken, jlong privileges, jint accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivilegedServiceAuditAlarmA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)servicename, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)privileges, (int32_t)accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong servicename, jlong clienttoken, jlong privileges, jint accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivilegedServiceAuditAlarmW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)servicename, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)privileges, (int32_t)accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityQuerySecurityAccessMask(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityAccessMask");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)desiredaccess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)securityinformation;
    (void)desiredaccess;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityRevertToSelf(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevertToSelf");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong unicodestring, jlong sid, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlConvertSidToUnicodeString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)unicodestring, (void*)(uintptr_t)sid, (bool)allocatedestinationstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unicodestring;
    (void)sid;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jint securitydescriptorlength, jlong newsecuritydescriptor, jlong newsecuritydescriptorlength, jboolean checkonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNormalizeSecurityDescriptor");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (uint32_t)securitydescriptorlength, (void*)(uintptr_t)newsecuritydescriptor, (void*)(uintptr_t)newsecuritydescriptorlength, (bool)checkonly);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)securitydescriptor;
    (void)securitydescriptorlength;
    (void)newsecuritydescriptor;
    (void)newsecuritydescriptorlength;
    (void)checkonly;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetAclInformation(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong paclinformation, jint naclinformationlength, jint dwaclinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAclInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)paclinformation, (uint32_t)naclinformationlength, (int32_t)dwaclinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pacl;
    (void)paclinformation;
    (void)naclinformationlength;
    (void)dwaclinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetCachedSigningLevel(JNIEnv* km_env, jclass km_clazz, jlong sourcefiles, jint sourcefilecount, jint flags, jlong targetfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCachedSigningLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcefiles, (uint32_t)sourcefilecount, (uint32_t)flags, (void*)(uintptr_t)targetfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcefiles;
    (void)sourcefilecount;
    (void)flags;
    (void)targetfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetFileSecurityA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileSecurityA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetFileSecurityW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileSecurityW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpfilename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetKernelObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetKernelObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetPrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong modificationdescriptor, jlong objectssecuritydescriptor, jlong genericmapping, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPrivateObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)modificationdescriptor, (void*)(uintptr_t)objectssecuritydescriptor, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)genericmapping;
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong modificationdescriptor, jlong objectssecuritydescriptor, jint autoinheritflags, jlong genericmapping, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPrivateObjectSecurityEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)modificationdescriptor, (void*)(uintptr_t)objectssecuritydescriptor, (uint32_t)autoinheritflags, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)autoinheritflags;
    (void)genericmapping;
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetSecurityAccessMask(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityAccessMask");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)desiredaccess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)securityinformation;
    (void)desiredaccess;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetSecurityDescriptorControl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jshort controlbitsofinterest, jshort controlbitstoset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (uint16_t)controlbitsofinterest, (uint16_t)controlbitstoset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)controlbitsofinterest;
    (void)controlbitstoset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetSecurityDescriptorDacl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jint bdaclpresent, jlong pdacl, jint bdacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorDacl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (int32_t)bdaclpresent, (void*)(uintptr_t)pdacl, (int32_t)bdacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)bdaclpresent;
    (void)pdacl;
    (void)bdacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetSecurityDescriptorGroup(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong pgroup, jint bgroupdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)pgroup, (int32_t)bgroupdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)pgroup;
    (void)bgroupdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetSecurityDescriptorOwner(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong powner, jint bownerdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorOwner");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)powner, (int32_t)bownerdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)powner;
    (void)bownerdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong rmcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorRMControl");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)rmcontrol);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)securitydescriptor;
    (void)rmcontrol;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetSecurityDescriptorSacl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jint bsaclpresent, jlong psacl, jint bsacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorSacl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (int32_t)bsaclpresent, (void*)(uintptr_t)psacl, (int32_t)bsacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)bsaclpresent;
    (void)psacl;
    (void)bsacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetTokenInformation(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTokenInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssysWindowsWin32SecuritySetUserObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong psirequested, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)psirequested, (void*)(uintptr_t)psid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hobj;
    (void)psirequested;
    (void)psid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

