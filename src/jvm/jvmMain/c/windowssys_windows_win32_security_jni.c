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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheck(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong clienttoken, jint desiredaccess, jlong genericmapping, jlong privilegeset, jlong privilegesetlength, jlong grantedaccess, jlong accessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheck");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)privilegeset, (void*)(uintptr_t)privilegesetlength, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus) : -1;
#else
    (void)psecuritydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)genericmapping;
    (void)privilegeset;
    (void)privilegesetlength;
    (void)grantedaccess;
    (void)accessstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckAndAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jint desiredaccess, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatus, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckAndAuditAlarmA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)pfgenerateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckAndAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jint desiredaccess, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatus, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckAndAuditAlarmW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)pfgenerateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckByType(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong principalselfsid, jlong clienttoken, jint desiredaccess, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jlong privilegeset, jlong privilegesetlength, jlong grantedaccess, jlong accessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)principalselfsid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)privilegeset, (void*)(uintptr_t)privilegesetlength, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckByTypeAndAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatus, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeAndAuditAlarmA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)pfgenerateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckByTypeAndAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatus, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeAndAuditAlarmW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)pfgenerateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckByTypeResultList(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong principalselfsid, jlong clienttoken, jint desiredaccess, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jlong privilegeset, jlong privilegesetlength, jlong grantedaccesslist, jlong accessstatuslist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)principalselfsid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)privilegeset, (void*)(uintptr_t)privilegesetlength, (void*)(uintptr_t)grantedaccesslist, (void*)(uintptr_t)accessstatuslist) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckByTypeResultListAndAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatuslist, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatuslist, (void*)(uintptr_t)pfgenerateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckByTypeResultListAndAuditAlarmByHandleA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccess, jlong accessstatuslist, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmByHandleA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatuslist, (void*)(uintptr_t)pfgenerateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckByTypeResultListAndAuditAlarmByHandleW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccesslist, jlong accessstatuslist, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmByHandleW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccesslist, (void*)(uintptr_t)accessstatuslist, (void*)(uintptr_t)pfgenerateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AccessCheckByTypeResultListAndAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jint objectcreation, jlong grantedaccesslist, jlong accessstatuslist, jlong pfgenerateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (int32_t)objectcreation, (void*)(uintptr_t)grantedaccesslist, (void*)(uintptr_t)accessstatuslist, (void*)(uintptr_t)pfgenerateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAccessAllowedAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessAllowedAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)accessmask, (void*)(uintptr_t)psid) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)accessmask;
    (void)psid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAccessAllowedAceEx(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessAllowedAceEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)psid) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAccessAllowedObjectAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong objecttypeguid, jlong inheritedobjecttypeguid, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessAllowedObjectAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)objecttypeguid, (void*)(uintptr_t)inheritedobjecttypeguid, (void*)(uintptr_t)psid) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAccessDeniedAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessDeniedAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)accessmask, (void*)(uintptr_t)psid) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)accessmask;
    (void)psid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAccessDeniedAceEx(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessDeniedAceEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)psid) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAccessDeniedObjectAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong objecttypeguid, jlong inheritedobjecttypeguid, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessDeniedObjectAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)objecttypeguid, (void*)(uintptr_t)inheritedobjecttypeguid, (void*)(uintptr_t)psid) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint dwstartingaceindex, jlong pacelist, jint nacelistlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)dwstartingaceindex, (void*)(uintptr_t)pacelist, (uint32_t)nacelistlength) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)dwstartingaceindex;
    (void)pacelist;
    (void)nacelistlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAuditAccessAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint dwaccessmask, jlong psid, jint bauditsuccess, jint bauditfailure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAuditAccessAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)dwaccessmask, (void*)(uintptr_t)psid, (int32_t)bauditsuccess, (int32_t)bauditfailure) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)dwaccessmask;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAuditAccessAceEx(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint dwaccessmask, jlong psid, jint bauditsuccess, jint bauditfailure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAuditAccessAceEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)dwaccessmask, (void*)(uintptr_t)psid, (int32_t)bauditsuccess, (int32_t)bauditfailure) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)dwaccessmask;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddAuditAccessObjectAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong objecttypeguid, jlong inheritedobjecttypeguid, jlong psid, jint bauditsuccess, jint bauditfailure) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAuditAccessObjectAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)objecttypeguid, (void*)(uintptr_t)inheritedobjecttypeguid, (void*)(uintptr_t)psid, (int32_t)bauditsuccess, (int32_t)bauditfailure) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddConditionalAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jbyte acetype, jint accessmask, jlong psid, jlong conditionstr, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddConditionalAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint8_t)acetype, (uint32_t)accessmask, (void*)(uintptr_t)psid, (void*)(uintptr_t)conditionstr, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)acetype;
    (void)accessmask;
    (void)psid;
    (void)conditionstr;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddMandatoryAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint mandatorypolicy, jlong plabelsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddMandatoryAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)mandatorypolicy, (void*)(uintptr_t)plabelsid) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)mandatorypolicy;
    (void)plabelsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddResourceAttributeAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong psid, jlong pattributeinfo, jlong preturnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddResourceAttributeAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)psid, (void*)(uintptr_t)pattributeinfo, (void*)(uintptr_t)preturnlength) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    (void)pattributeinfo;
    (void)preturnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AddScopedPolicyIDAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwacerevision, jint aceflags, jint accessmask, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddScopedPolicyIDAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwacerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)psid) : -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AdjustTokenGroups(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint resettodefault, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustTokenGroups");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)resettodefault, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AdjustTokenPrivileges(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint disableallprivileges, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustTokenPrivileges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)disableallprivileges, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AllocateAndInitializeSid(JNIEnv* km_env, jclass km_clazz, jlong pidentifierauthority, jbyte nsubauthoritycount, jint nsubauthority0, jint nsubauthority1, jint nsubauthority2, jint nsubauthority3, jint nsubauthority4, jint nsubauthority5, jint nsubauthority6, jint nsubauthority7, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateAndInitializeSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pidentifierauthority, (uint8_t)nsubauthoritycount, (uint32_t)nsubauthority0, (uint32_t)nsubauthority1, (uint32_t)nsubauthority2, (uint32_t)nsubauthority3, (uint32_t)nsubauthority4, (uint32_t)nsubauthority5, (uint32_t)nsubauthority6, (uint32_t)nsubauthority7, (void*)(uintptr_t)psid) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AllocateLocallyUniqueId(JNIEnv* km_env, jclass km_clazz, jlong luid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateLocallyUniqueId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)luid) : -1;
#else
    (void)luid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AreAllAccessesGranted(JNIEnv* km_env, jclass km_clazz, jint grantedaccess, jint desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreAllAccessesGranted");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)grantedaccess, (uint32_t)desiredaccess) : -1;
#else
    (void)grantedaccess;
    (void)desiredaccess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1AreAnyAccessesGranted(JNIEnv* km_env, jclass km_clazz, jint grantedaccess, jint desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreAnyAccessesGranted");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)grantedaccess, (uint32_t)desiredaccess) : -1;
#else
    (void)grantedaccess;
    (void)desiredaccess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1CheckTokenCapability(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong capabilitysidtocheck, jlong hascapability) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckTokenCapability");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)capabilitysidtocheck, (void*)(uintptr_t)hascapability) : -1;
#else
    (void)tokenhandle;
    (void)capabilitysidtocheck;
    (void)hascapability;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1CheckTokenMembership(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong sidtocheck, jlong ismember) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckTokenMembership");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)sidtocheck, (void*)(uintptr_t)ismember) : -1;
#else
    (void)tokenhandle;
    (void)sidtocheck;
    (void)ismember;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1CheckTokenMembershipEx(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jlong sidtocheck, jint flags, jlong ismember) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckTokenMembershipEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (void*)(uintptr_t)sidtocheck, (uint32_t)flags, (void*)(uintptr_t)ismember) : -1;
#else
    (void)tokenhandle;
    (void)sidtocheck;
    (void)flags;
    (void)ismember;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ConvertToAutoInheritPrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong parentdescriptor, jlong currentsecuritydescriptor, jlong newsecuritydescriptor, jlong objecttype, jboolean isdirectoryobject, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertToAutoInheritPrivateObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)parentdescriptor, (void*)(uintptr_t)currentsecuritydescriptor, (void*)(uintptr_t)newsecuritydescriptor, (void*)(uintptr_t)objecttype, (bool)isdirectoryobject, (void*)(uintptr_t)genericmapping) : -1;
#else
    (void)parentdescriptor;
    (void)currentsecuritydescriptor;
    (void)newsecuritydescriptor;
    (void)objecttype;
    (void)isdirectoryobject;
    (void)genericmapping;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1CopySid(JNIEnv* km_env, jclass km_clazz, jint ndestinationsidlength, jlong pdestinationsid, jlong psourcesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopySid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)ndestinationsidlength, (void*)(uintptr_t)pdestinationsid, (void*)(uintptr_t)psourcesid) : -1;
#else
    (void)ndestinationsidlength;
    (void)pdestinationsid;
    (void)psourcesid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1CreatePrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong parentdescriptor, jlong creatordescriptor, jlong newdescriptor, jint isdirectoryobject, jlong token, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)parentdescriptor, (void*)(uintptr_t)creatordescriptor, (void*)(uintptr_t)newdescriptor, (int32_t)isdirectoryobject, (void*)(uintptr_t)token, (void*)(uintptr_t)genericmapping) : -1;
#else
    (void)parentdescriptor;
    (void)creatordescriptor;
    (void)newdescriptor;
    (void)isdirectoryobject;
    (void)token;
    (void)genericmapping;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1CreatePrivateObjectSecurityEx(JNIEnv* km_env, jclass km_clazz, jlong parentdescriptor, jlong creatordescriptor, jlong newdescriptor, jlong objecttype, jint iscontainerobject, jint autoinheritflags, jlong token, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateObjectSecurityEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)parentdescriptor, (void*)(uintptr_t)creatordescriptor, (void*)(uintptr_t)newdescriptor, (void*)(uintptr_t)objecttype, (int32_t)iscontainerobject, (uint32_t)autoinheritflags, (void*)(uintptr_t)token, (void*)(uintptr_t)genericmapping) : -1;
#else
    (void)parentdescriptor;
    (void)creatordescriptor;
    (void)newdescriptor;
    (void)objecttype;
    (void)iscontainerobject;
    (void)autoinheritflags;
    (void)token;
    (void)genericmapping;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1CreatePrivateObjectSecurityWithMultipleInheritance(JNIEnv* km_env, jclass km_clazz, jlong parentdescriptor, jlong creatordescriptor, jlong newdescriptor, jlong objecttypes, jint guidcount, jint iscontainerobject, jint autoinheritflags, jlong token, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateObjectSecurityWithMultipleInheritance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)parentdescriptor, (void*)(uintptr_t)creatordescriptor, (void*)(uintptr_t)newdescriptor, (void*)(uintptr_t)objecttypes, (uint32_t)guidcount, (int32_t)iscontainerobject, (uint32_t)autoinheritflags, (void*)(uintptr_t)token, (void*)(uintptr_t)genericmapping) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1CreateRestrictedToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint flags, jint disablesidcount, jlong sidstodisable, jint deleteprivilegecount, jlong privilegestodelete, jint restrictedsidcount, jlong sidstorestrict, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRestrictedToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)flags, (uint32_t)disablesidcount, (void*)(uintptr_t)sidstodisable, (uint32_t)deleteprivilegecount, (void*)(uintptr_t)privilegestodelete, (uint32_t)restrictedsidcount, (void*)(uintptr_t)sidstorestrict, (void*)(uintptr_t)newtokenhandle) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1CreateWellKnownSid(JNIEnv* km_env, jclass km_clazz, jint wellknownsidtype, jlong domainsid, jlong psid, jlong cbsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWellKnownSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)wellknownsidtype, (void*)(uintptr_t)domainsid, (void*)(uintptr_t)psid, (void*)(uintptr_t)cbsid) : -1;
#else
    (void)wellknownsidtype;
    (void)domainsid;
    (void)psid;
    (void)cbsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1DeleteAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwaceindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwaceindex) : -1;
#else
    (void)pacl;
    (void)dwaceindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1DeriveCapabilitySidsFromName(JNIEnv* km_env, jclass km_clazz, jlong capname, jlong capabilitygroupsids, jlong capabilitygroupsidcount, jlong capabilitysids, jlong capabilitysidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-base-l1-2-2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeriveCapabilitySidsFromName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)capname, (void*)(uintptr_t)capabilitygroupsids, (void*)(uintptr_t)capabilitygroupsidcount, (void*)(uintptr_t)capabilitysids, (void*)(uintptr_t)capabilitysidcount) : -1;
#else
    (void)capname;
    (void)capabilitygroupsids;
    (void)capabilitygroupsidcount;
    (void)capabilitysids;
    (void)capabilitysidcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1DestroyPrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong objectdescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyPrivateObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectdescriptor) : -1;
#else
    (void)objectdescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1DuplicateToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint impersonationlevel, jlong duplicatetokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (int32_t)impersonationlevel, (void*)(uintptr_t)duplicatetokenhandle) : -1;
#else
    (void)existingtokenhandle;
    (void)impersonationlevel;
    (void)duplicatetokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1DuplicateTokenEx(JNIEnv* km_env, jclass km_clazz, jlong hexistingtoken, jint dwdesiredaccess, jlong lptokenattributes, jint impersonationlevel, jint tokentype, jlong phnewtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateTokenEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hexistingtoken, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lptokenattributes, (int32_t)impersonationlevel, (int32_t)tokentype, (void*)(uintptr_t)phnewtoken) : -1;
#else
    (void)hexistingtoken;
    (void)dwdesiredaccess;
    (void)lptokenattributes;
    (void)impersonationlevel;
    (void)tokentype;
    (void)phnewtoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1EqualDomainSid(JNIEnv* km_env, jclass km_clazz, jlong psid1, jlong psid2, jlong pfequal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualDomainSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid1, (void*)(uintptr_t)psid2, (void*)(uintptr_t)pfequal) : -1;
#else
    (void)psid1;
    (void)psid2;
    (void)pfequal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1EqualPrefixSid(JNIEnv* km_env, jclass km_clazz, jlong psid1, jlong psid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualPrefixSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid1, (void*)(uintptr_t)psid2) : -1;
#else
    (void)psid1;
    (void)psid2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1EqualSid(JNIEnv* km_env, jclass km_clazz, jlong psid1, jlong psid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid1, (void*)(uintptr_t)psid2) : -1;
#else
    (void)psid1;
    (void)psid2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1FindFirstFreeAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong pace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFreeAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)pace) : -1;
#else
    (void)pacl;
    (void)pace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1FreeSid(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeSid");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid) : NULL;
#else
    (void)psid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetAce(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint dwaceindex, jlong pace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)dwaceindex, (void*)(uintptr_t)pace) : -1;
#else
    (void)pacl;
    (void)dwaceindex;
    (void)pace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetAclInformation(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong paclinformation, jint naclinformationlength, jint dwaclinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAclInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)paclinformation, (uint32_t)naclinformationlength, (int32_t)dwaclinformationclass) : -1;
#else
    (void)pacl;
    (void)paclinformation;
    (void)naclinformationlength;
    (void)dwaclinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetAppContainerAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint startingaceindex, jlong appcontainerace, jlong appcontaineraceindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppContainerAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)startingaceindex, (void*)(uintptr_t)appcontainerace, (void*)(uintptr_t)appcontaineraceindex) : -1;
#else
    (void)acl;
    (void)startingaceindex;
    (void)appcontainerace;
    (void)appcontaineraceindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetCachedSigningLevel(JNIEnv* km_env, jclass km_clazz, jlong file, jlong flags, jlong signinglevel, jlong thumbprint, jlong thumbprintsize, jlong thumbprintalgorithm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCachedSigningLevel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)file, (void*)(uintptr_t)flags, (void*)(uintptr_t)signinglevel, (void*)(uintptr_t)thumbprint, (void*)(uintptr_t)thumbprintsize, (void*)(uintptr_t)thumbprintalgorithm) : -1;
#else
    (void)file;
    (void)flags;
    (void)signinglevel;
    (void)thumbprint;
    (void)thumbprintsize;
    (void)thumbprintalgorithm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetFileSecurityA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint requestedinformation, jlong psecuritydescriptor, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSecurityA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)requestedinformation, (void*)(uintptr_t)psecuritydescriptor, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded) : -1;
#else
    (void)lpfilename;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetFileSecurityW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint requestedinformation, jlong psecuritydescriptor, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSecurityW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)requestedinformation, (void*)(uintptr_t)psecuritydescriptor, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded) : -1;
#else
    (void)lpfilename;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetKernelObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong handle, jint requestedinformation, jlong psecuritydescriptor, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKernelObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)requestedinformation, (void*)(uintptr_t)psecuritydescriptor, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded) : -1;
#else
    (void)handle;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetLengthSid(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLengthSid");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid) : 0;
#else
    (void)psid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetPrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong objectdescriptor, jint securityinformation, jlong resultantdescriptor, jint descriptorlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectdescriptor, (uint32_t)securityinformation, (void*)(uintptr_t)resultantdescriptor, (uint32_t)descriptorlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)objectdescriptor;
    (void)securityinformation;
    (void)resultantdescriptor;
    (void)descriptorlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSecurityDescriptorControl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong pcontrol, jlong lpdwrevision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)pcontrol, (void*)(uintptr_t)lpdwrevision) : -1;
#else
    (void)psecuritydescriptor;
    (void)pcontrol;
    (void)lpdwrevision;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSecurityDescriptorDacl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong lpbdaclpresent, jlong pdacl, jlong lpbdacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorDacl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)lpbdaclpresent, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)lpbdacldefaulted) : -1;
#else
    (void)psecuritydescriptor;
    (void)lpbdaclpresent;
    (void)pdacl;
    (void)lpbdacldefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSecurityDescriptorGroup(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong pgroup, jlong lpbgroupdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorGroup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)pgroup, (void*)(uintptr_t)lpbgroupdefaulted) : -1;
#else
    (void)psecuritydescriptor;
    (void)pgroup;
    (void)lpbgroupdefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSecurityDescriptorLength(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorLength");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor) : 0;
#else
    (void)psecuritydescriptor;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSecurityDescriptorOwner(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong powner, jlong lpbownerdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorOwner");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)powner, (void*)(uintptr_t)lpbownerdefaulted) : -1;
#else
    (void)psecuritydescriptor;
    (void)powner;
    (void)lpbownerdefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSecurityDescriptorRMControl(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong rmcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorRMControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)rmcontrol) : 0;
#else
    (void)securitydescriptor;
    (void)rmcontrol;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSecurityDescriptorSacl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong lpbsaclpresent, jlong psacl, jlong lpbsacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorSacl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)lpbsaclpresent, (void*)(uintptr_t)psacl, (void*)(uintptr_t)lpbsacldefaulted) : -1;
#else
    (void)psecuritydescriptor;
    (void)lpbsaclpresent;
    (void)psacl;
    (void)lpbsacldefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSidIdentifierAuthority(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidIdentifierAuthority");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid) : NULL;
#else
    (void)psid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSidLengthRequired(JNIEnv* km_env, jclass km_clazz, jbyte nsubauthoritycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidLengthRequired");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint8_t)nsubauthoritycount) : 0;
#else
    (void)nsubauthoritycount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSidSubAuthority(JNIEnv* km_env, jclass km_clazz, jlong psid, jint nsubauthority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidSubAuthority");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid, (uint32_t)nsubauthority) : NULL;
#else
    (void)psid;
    (void)nsubauthority;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetSidSubAuthorityCount(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidSubAuthorityCount");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid) : NULL;
#else
    (void)psid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetTokenInformation(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTokenInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetUserObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong psirequested, jlong psid, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)psirequested, (void*)(uintptr_t)psid, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded) : -1;
#else
    (void)hobj;
    (void)psirequested;
    (void)psid;
    (void)nlength;
    (void)lpnlengthneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1GetWindowsAccountDomainSid(JNIEnv* km_env, jclass km_clazz, jlong psid, jlong pdomainsid, jlong cbdomainsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowsAccountDomainSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid, (void*)(uintptr_t)pdomainsid, (void*)(uintptr_t)cbdomainsid) : -1;
#else
    (void)psid;
    (void)pdomainsid;
    (void)cbdomainsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ImpersonateAnonymousToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateAnonymousToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle) : -1;
#else
    (void)threadhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ImpersonateLoggedOnUser(JNIEnv* km_env, jclass km_clazz, jlong htoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateLoggedOnUser");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htoken) : -1;
#else
    (void)htoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ImpersonateSelf(JNIEnv* km_env, jclass km_clazz, jint impersonationlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateSelf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)impersonationlevel) : -1;
#else
    (void)impersonationlevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1InitializeAcl(JNIEnv* km_env, jclass km_clazz, jlong pacl, jint nacllength, jint dwaclrevision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeAcl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (uint32_t)nacllength, (uint32_t)dwaclrevision) : -1;
#else
    (void)pacl;
    (void)nacllength;
    (void)dwaclrevision;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1InitializeSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jint dwrevision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (uint32_t)dwrevision) : -1;
#else
    (void)psecuritydescriptor;
    (void)dwrevision;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1InitializeSid(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong pidentifierauthority, jbyte nsubauthoritycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)pidentifierauthority, (uint8_t)nsubauthoritycount) : -1;
#else
    (void)sid;
    (void)pidentifierauthority;
    (void)nsubauthoritycount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1IsTokenRestricted(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsTokenRestricted");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1IsValidAcl(JNIEnv* km_env, jclass km_clazz, jlong pacl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidAcl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl) : -1;
#else
    (void)pacl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1IsValidSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor) : -1;
#else
    (void)psecuritydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1IsValidSid(JNIEnv* km_env, jclass km_clazz, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid) : -1;
#else
    (void)psid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1IsWellKnownSid(JNIEnv* km_env, jclass km_clazz, jlong psid, jint wellknownsidtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWellKnownSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psid, (int32_t)wellknownsidtype) : -1;
#else
    (void)psid;
    (void)wellknownsidtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LogonUserA(JNIEnv* km_env, jclass km_clazz, jlong lpszusername, jlong lpszdomain, jlong lpszpassword, jint dwlogontype, jint dwlogonprovider, jlong phtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszpassword, (uint32_t)dwlogontype, (uint32_t)dwlogonprovider, (void*)(uintptr_t)phtoken) : -1;
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LogonUserExA(JNIEnv* km_env, jclass km_clazz, jlong lpszusername, jlong lpszdomain, jlong lpszpassword, jint dwlogontype, jint dwlogonprovider, jlong phtoken, jlong pplogonsid, jlong ppprofilebuffer, jlong pdwprofilelength, jlong pquotalimits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszpassword, (uint32_t)dwlogontype, (uint32_t)dwlogonprovider, (void*)(uintptr_t)phtoken, (void*)(uintptr_t)pplogonsid, (void*)(uintptr_t)ppprofilebuffer, (void*)(uintptr_t)pdwprofilelength, (void*)(uintptr_t)pquotalimits) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LogonUserExW(JNIEnv* km_env, jclass km_clazz, jlong lpszusername, jlong lpszdomain, jlong lpszpassword, jint dwlogontype, jint dwlogonprovider, jlong phtoken, jlong pplogonsid, jlong ppprofilebuffer, jlong pdwprofilelength, jlong pquotalimits) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszpassword, (uint32_t)dwlogontype, (uint32_t)dwlogonprovider, (void*)(uintptr_t)phtoken, (void*)(uintptr_t)pplogonsid, (void*)(uintptr_t)ppprofilebuffer, (void*)(uintptr_t)pdwprofilelength, (void*)(uintptr_t)pquotalimits) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LogonUserW(JNIEnv* km_env, jclass km_clazz, jlong lpszusername, jlong lpszdomain, jlong lpszpassword, jint dwlogontype, jint dwlogonprovider, jlong phtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszusername, (void*)(uintptr_t)lpszdomain, (void*)(uintptr_t)lpszpassword, (uint32_t)dwlogontype, (uint32_t)dwlogonprovider, (void*)(uintptr_t)phtoken) : -1;
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupAccountNameA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpaccountname, jlong sid, jlong cbsid, jlong referenceddomainname, jlong cchreferenceddomainname, jlong peuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpaccountname, (void*)(uintptr_t)sid, (void*)(uintptr_t)cbsid, (void*)(uintptr_t)referenceddomainname, (void*)(uintptr_t)cchreferenceddomainname, (void*)(uintptr_t)peuse) : -1;
#else
    (void)lpsystemname;
    (void)lpaccountname;
    (void)sid;
    (void)cbsid;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupAccountNameW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpaccountname, jlong sid, jlong cbsid, jlong referenceddomainname, jlong cchreferenceddomainname, jlong peuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpaccountname, (void*)(uintptr_t)sid, (void*)(uintptr_t)cbsid, (void*)(uintptr_t)referenceddomainname, (void*)(uintptr_t)cchreferenceddomainname, (void*)(uintptr_t)peuse) : -1;
#else
    (void)lpsystemname;
    (void)lpaccountname;
    (void)sid;
    (void)cbsid;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupAccountSidA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong sid, jlong name, jlong cchname, jlong referenceddomainname, jlong cchreferenceddomainname, jlong peuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountSidA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)sid, (void*)(uintptr_t)name, (void*)(uintptr_t)cchname, (void*)(uintptr_t)referenceddomainname, (void*)(uintptr_t)cchreferenceddomainname, (void*)(uintptr_t)peuse) : -1;
#else
    (void)lpsystemname;
    (void)sid;
    (void)name;
    (void)cchname;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupAccountSidW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong sid, jlong name, jlong cchname, jlong referenceddomainname, jlong cchreferenceddomainname, jlong peuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountSidW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)sid, (void*)(uintptr_t)name, (void*)(uintptr_t)cchname, (void*)(uintptr_t)referenceddomainname, (void*)(uintptr_t)cchreferenceddomainname, (void*)(uintptr_t)peuse) : -1;
#else
    (void)lpsystemname;
    (void)sid;
    (void)name;
    (void)cchname;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupPrivilegeDisplayNameA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpname, jlong lpdisplayname, jlong cchdisplayname, jlong lplanguageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeDisplayNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)cchdisplayname, (void*)(uintptr_t)lplanguageid) : -1;
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpdisplayname;
    (void)cchdisplayname;
    (void)lplanguageid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupPrivilegeDisplayNameW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpname, jlong lpdisplayname, jlong cchdisplayname, jlong lplanguageid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeDisplayNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)cchdisplayname, (void*)(uintptr_t)lplanguageid) : -1;
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpdisplayname;
    (void)cchdisplayname;
    (void)lplanguageid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupPrivilegeNameA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpluid, jlong lpname, jlong cchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpluid, (void*)(uintptr_t)lpname, (void*)(uintptr_t)cchname) : -1;
#else
    (void)lpsystemname;
    (void)lpluid;
    (void)lpname;
    (void)cchname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupPrivilegeNameW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpluid, jlong lpname, jlong cchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpluid, (void*)(uintptr_t)lpname, (void*)(uintptr_t)cchname) : -1;
#else
    (void)lpsystemname;
    (void)lpluid;
    (void)lpname;
    (void)cchname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupPrivilegeValueA(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpname, jlong lpluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeValueA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpluid) : -1;
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpluid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1LookupPrivilegeValueW(JNIEnv* km_env, jclass km_clazz, jlong lpsystemname, jlong lpname, jlong lpluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeValueW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsystemname, (void*)(uintptr_t)lpname, (void*)(uintptr_t)lpluid) : -1;
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpluid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1MakeAbsoluteSD(JNIEnv* km_env, jclass km_clazz, jlong pselfrelativesecuritydescriptor, jlong pabsolutesecuritydescriptor, jlong lpdwabsolutesecuritydescriptorsize, jlong pdacl, jlong lpdwdaclsize, jlong psacl, jlong lpdwsaclsize, jlong powner, jlong lpdwownersize, jlong pprimarygroup, jlong lpdwprimarygroupsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeAbsoluteSD");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pselfrelativesecuritydescriptor, (void*)(uintptr_t)pabsolutesecuritydescriptor, (void*)(uintptr_t)lpdwabsolutesecuritydescriptorsize, (void*)(uintptr_t)pdacl, (void*)(uintptr_t)lpdwdaclsize, (void*)(uintptr_t)psacl, (void*)(uintptr_t)lpdwsaclsize, (void*)(uintptr_t)powner, (void*)(uintptr_t)lpdwownersize, (void*)(uintptr_t)pprimarygroup, (void*)(uintptr_t)lpdwprimarygroupsize) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1MakeSelfRelativeSD(JNIEnv* km_env, jclass km_clazz, jlong pabsolutesecuritydescriptor, jlong pselfrelativesecuritydescriptor, jlong lpdwbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSelfRelativeSD");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pabsolutesecuritydescriptor, (void*)(uintptr_t)pselfrelativesecuritydescriptor, (void*)(uintptr_t)lpdwbufferlength) : -1;
#else
    (void)pabsolutesecuritydescriptor;
    (void)pselfrelativesecuritydescriptor;
    (void)lpdwbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1MapGenericMask(JNIEnv* km_env, jclass km_clazz, jlong accessmask, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapGenericMask");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)accessmask, (void*)(uintptr_t)genericmapping);
#else
    (void)accessmask;
    (void)genericmapping;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ObjectCloseAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jint generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectCloseAuditAlarmA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (int32_t)generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ObjectCloseAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jint generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectCloseAuditAlarmW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (int32_t)generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ObjectDeleteAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jint generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectDeleteAuditAlarmA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (int32_t)generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ObjectDeleteAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jint generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectDeleteAuditAlarmW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (int32_t)generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ObjectOpenAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong psecuritydescriptor, jlong clienttoken, jint desiredaccess, jint grantedaccess, jlong privileges, jint objectcreation, jint accessgranted, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectOpenAuditAlarmA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)grantedaccess, (void*)(uintptr_t)privileges, (int32_t)objectcreation, (int32_t)accessgranted, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ObjectOpenAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong psecuritydescriptor, jlong clienttoken, jint desiredaccess, jint grantedaccess, jlong privileges, jint objectcreation, jint accessgranted, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectOpenAuditAlarmW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)grantedaccess, (void*)(uintptr_t)privileges, (int32_t)objectcreation, (int32_t)accessgranted, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ObjectPrivilegeAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jint desiredaccess, jlong privileges, jint accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectPrivilegeAuditAlarmA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)privileges, (int32_t)accessgranted) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1ObjectPrivilegeAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jint desiredaccess, jlong privileges, jint accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectPrivilegeAuditAlarmW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)privileges, (int32_t)accessgranted) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1PrivilegeCheck(JNIEnv* km_env, jclass km_clazz, jlong clienttoken, jlong requiredprivileges, jlong pfresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivilegeCheck");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clienttoken, (void*)(uintptr_t)requiredprivileges, (void*)(uintptr_t)pfresult) : -1;
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)pfresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1PrivilegedServiceAuditAlarmA(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong servicename, jlong clienttoken, jlong privileges, jint accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivilegedServiceAuditAlarmA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)servicename, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)privileges, (int32_t)accessgranted) : -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1PrivilegedServiceAuditAlarmW(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong servicename, jlong clienttoken, jlong privileges, jint accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivilegedServiceAuditAlarmW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)servicename, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)privileges, (int32_t)accessgranted) : -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1QuerySecurityAccessMask(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityAccessMask");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)desiredaccess);
#else
    (void)securityinformation;
    (void)desiredaccess;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1RevertToSelf(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevertToSelf");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1RtlConvertSidToUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong unicodestring, jlong sid, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlConvertSidToUnicodeString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)unicodestring, (void*)(uintptr_t)sid, (bool)allocatedestinationstring) : -1;
#else
    (void)unicodestring;
    (void)sid;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1RtlNormalizeSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jint securitydescriptorlength, jlong newsecuritydescriptor, jlong newsecuritydescriptorlength, jboolean checkonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNormalizeSecurityDescriptor");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (uint32_t)securitydescriptorlength, (void*)(uintptr_t)newsecuritydescriptor, (void*)(uintptr_t)newsecuritydescriptorlength, (bool)checkonly) : false;
#else
    (void)securitydescriptor;
    (void)securitydescriptorlength;
    (void)newsecuritydescriptor;
    (void)newsecuritydescriptorlength;
    (void)checkonly;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetAclInformation(JNIEnv* km_env, jclass km_clazz, jlong pacl, jlong paclinformation, jint naclinformationlength, jint dwaclinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAclInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pacl, (void*)(uintptr_t)paclinformation, (uint32_t)naclinformationlength, (int32_t)dwaclinformationclass) : -1;
#else
    (void)pacl;
    (void)paclinformation;
    (void)naclinformationlength;
    (void)dwaclinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetCachedSigningLevel(JNIEnv* km_env, jclass km_clazz, jlong sourcefiles, jint sourcefilecount, jint flags, jlong targetfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCachedSigningLevel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcefiles, (uint32_t)sourcefilecount, (uint32_t)flags, (void*)(uintptr_t)targetfile) : -1;
#else
    (void)sourcefiles;
    (void)sourcefilecount;
    (void)flags;
    (void)targetfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetFileSecurityA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileSecurityA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor) : -1;
#else
    (void)lpfilename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetFileSecurityW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileSecurityW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor) : -1;
#else
    (void)lpfilename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetKernelObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetKernelObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetPrivateObjectSecurity(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong modificationdescriptor, jlong objectssecuritydescriptor, jlong genericmapping, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPrivateObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)modificationdescriptor, (void*)(uintptr_t)objectssecuritydescriptor, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)token) : -1;
#else
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)genericmapping;
    (void)token;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetPrivateObjectSecurityEx(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong modificationdescriptor, jlong objectssecuritydescriptor, jint autoinheritflags, jlong genericmapping, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPrivateObjectSecurityEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)modificationdescriptor, (void*)(uintptr_t)objectssecuritydescriptor, (uint32_t)autoinheritflags, (void*)(uintptr_t)genericmapping, (void*)(uintptr_t)token) : -1;
#else
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)autoinheritflags;
    (void)genericmapping;
    (void)token;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetSecurityAccessMask(JNIEnv* km_env, jclass km_clazz, jint securityinformation, jlong desiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityAccessMask");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)securityinformation, (void*)(uintptr_t)desiredaccess);
#else
    (void)securityinformation;
    (void)desiredaccess;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetSecurityDescriptorControl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jshort controlbitsofinterest, jshort controlbitstoset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (uint16_t)controlbitsofinterest, (uint16_t)controlbitstoset) : -1;
#else
    (void)psecuritydescriptor;
    (void)controlbitsofinterest;
    (void)controlbitstoset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetSecurityDescriptorDacl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jint bdaclpresent, jlong pdacl, jint bdacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorDacl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (int32_t)bdaclpresent, (void*)(uintptr_t)pdacl, (int32_t)bdacldefaulted) : -1;
#else
    (void)psecuritydescriptor;
    (void)bdaclpresent;
    (void)pdacl;
    (void)bdacldefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetSecurityDescriptorGroup(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong pgroup, jint bgroupdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorGroup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)pgroup, (int32_t)bgroupdefaulted) : -1;
#else
    (void)psecuritydescriptor;
    (void)pgroup;
    (void)bgroupdefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetSecurityDescriptorOwner(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong powner, jint bownerdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorOwner");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)powner, (int32_t)bownerdefaulted) : -1;
#else
    (void)psecuritydescriptor;
    (void)powner;
    (void)bownerdefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetSecurityDescriptorRMControl(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong rmcontrol) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorRMControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)rmcontrol) : 0;
#else
    (void)securitydescriptor;
    (void)rmcontrol;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetSecurityDescriptorSacl(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jint bsaclpresent, jlong psacl, jint bsacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorSacl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (int32_t)bsaclpresent, (void*)(uintptr_t)psacl, (int32_t)bsacldefaulted) : -1;
#else
    (void)psecuritydescriptor;
    (void)bsaclpresent;
    (void)psacl;
    (void)bsacldefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetTokenInformation(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTokenInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_WindowsWin32SecurityJniBridge_windowssys_1windows_1win32_1security_1SetUserObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong hobj, jlong psirequested, jlong psid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hobj, (void*)(uintptr_t)psirequested, (void*)(uintptr_t)psid) : -1;
#else
    (void)hobj;
    (void)psirequested;
    (void)psid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

