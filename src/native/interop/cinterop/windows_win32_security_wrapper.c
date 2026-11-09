#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_wrapper.h"
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

int32_t windowssys_windows_win32_security_AccessCheck(void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, clienttoken, desiredaccess, genericmapping, privilegeset, privilegesetlength, grantedaccess, accessstatus);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckAndAuditAlarmA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess, genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckAndAuditAlarmW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, desiredaccess, genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckByType(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, principalselfsid, clienttoken, desiredaccess, objecttypelist, objecttypelistlength, genericmapping, privilegeset, privilegesetlength, grantedaccess, accessstatus);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeAndAuditAlarmA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeAndAuditAlarmW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatus, pfgenerateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckByTypeResultList(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccesslist, void* accessstatuslist) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, principalselfsid, clienttoken, desiredaccess, objecttypelist, objecttypelistlength, genericmapping, privilegeset, privilegesetlength, grantedaccesslist, accessstatuslist);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatuslist, pfgenerateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleA(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmByHandleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccess, accessstatuslist, pfgenerateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleW(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmByHandleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, clienttoken, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccesslist, accessstatuslist, pfgenerateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AccessCheckByTypeResultListAndAuditAlarmW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, securitydescriptor, principalselfsid, desiredaccess, audittype, flags, objecttypelist, objecttypelistlength, genericmapping, objectcreation, grantedaccesslist, accessstatuslist, pfgenerateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAccessAllowedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessAllowedAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, accessmask, psid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAccessAllowedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessAllowedAceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, psid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAccessAllowedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessAllowedObjectAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, objecttypeguid, inheritedobjecttypeguid, psid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAccessDeniedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessDeniedAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, accessmask, psid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAccessDeniedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessDeniedAceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, psid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAccessDeniedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAccessDeniedObjectAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, objecttypeguid, inheritedobjecttypeguid, psid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)objecttypeguid;
    (void)inheritedobjecttypeguid;
    (void)psid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAce(void* pacl, uint32_t dwacerevision, uint32_t dwstartingaceindex, void* pacelist, uint32_t nacelistlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, dwstartingaceindex, pacelist, nacelistlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)dwstartingaceindex;
    (void)pacelist;
    (void)nacelistlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAuditAccessAce(void* pacl, uint32_t dwacerevision, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAuditAccessAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, dwaccessmask, psid, bauditsuccess, bauditfailure);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)dwaccessmask;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAuditAccessAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAuditAccessAceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, dwaccessmask, psid, bauditsuccess, bauditfailure);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)dwaccessmask;
    (void)psid;
    (void)bauditsuccess;
    (void)bauditfailure;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddAuditAccessObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid, int32_t bauditsuccess, int32_t bauditfailure) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddAuditAccessObjectAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, objecttypeguid, inheritedobjecttypeguid, psid, bauditsuccess, bauditfailure);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddConditionalAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint8_t acetype, uint32_t accessmask, void* psid, void* conditionstr, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddConditionalAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, acetype, accessmask, psid, conditionstr, returnlength);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddMandatoryAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t mandatorypolicy, void* plabelsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddMandatoryAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, mandatorypolicy, plabelsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)mandatorypolicy;
    (void)plabelsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddResourceAttributeAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid, void* pattributeinfo, void* preturnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddResourceAttributeAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, psid, pattributeinfo, preturnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    (void)pattributeinfo;
    (void)preturnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AddScopedPolicyIDAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddScopedPolicyIDAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwacerevision, aceflags, accessmask, psid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwacerevision;
    (void)aceflags;
    (void)accessmask;
    (void)psid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AdjustTokenGroups(void* tokenhandle, int32_t resettodefault, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustTokenGroups");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, resettodefault, newstate, bufferlength, previousstate, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AdjustTokenPrivileges(void* tokenhandle, int32_t disableallprivileges, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdjustTokenPrivileges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, disableallprivileges, newstate, bufferlength, previousstate, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AllocateAndInitializeSid(void* pidentifierauthority, uint8_t nsubauthoritycount, uint32_t nsubauthority0, uint32_t nsubauthority1, uint32_t nsubauthority2, uint32_t nsubauthority3, uint32_t nsubauthority4, uint32_t nsubauthority5, uint32_t nsubauthority6, uint32_t nsubauthority7, void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateAndInitializeSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pidentifierauthority, nsubauthoritycount, nsubauthority0, nsubauthority1, nsubauthority2, nsubauthority3, nsubauthority4, nsubauthority5, nsubauthority6, nsubauthority7, psid);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AllocateLocallyUniqueId(void* luid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocateLocallyUniqueId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(luid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)luid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AreAllAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreAllAccessesGranted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(grantedaccess, desiredaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)grantedaccess;
    (void)desiredaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_AreAnyAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreAnyAccessesGranted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(grantedaccess, desiredaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)grantedaccess;
    (void)desiredaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_CheckTokenCapability(void* tokenhandle, void* capabilitysidtocheck, void* hascapability) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckTokenCapability");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, capabilitysidtocheck, hascapability);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)capabilitysidtocheck;
    (void)hascapability;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_CheckTokenMembership(void* tokenhandle, void* sidtocheck, void* ismember) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckTokenMembership");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, sidtocheck, ismember);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)sidtocheck;
    (void)ismember;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_CheckTokenMembershipEx(void* tokenhandle, void* sidtocheck, uint32_t flags, void* ismember) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckTokenMembershipEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, sidtocheck, flags, ismember);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)sidtocheck;
    (void)flags;
    (void)ismember;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ConvertToAutoInheritPrivateObjectSecurity(void* parentdescriptor, void* currentsecuritydescriptor, void* newsecuritydescriptor, void* objecttype, bool isdirectoryobject, void* genericmapping) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertToAutoInheritPrivateObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parentdescriptor, currentsecuritydescriptor, newsecuritydescriptor, objecttype, isdirectoryobject, genericmapping);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)parentdescriptor;
    (void)currentsecuritydescriptor;
    (void)newsecuritydescriptor;
    (void)objecttype;
    (void)isdirectoryobject;
    (void)genericmapping;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_CopySid(uint32_t ndestinationsidlength, void* pdestinationsid, void* psourcesid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopySid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ndestinationsidlength, pdestinationsid, psourcesid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ndestinationsidlength;
    (void)pdestinationsid;
    (void)psourcesid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_CreatePrivateObjectSecurity(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, int32_t isdirectoryobject, void* token, void* genericmapping) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parentdescriptor, creatordescriptor, newdescriptor, isdirectoryobject, token, genericmapping);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)parentdescriptor;
    (void)creatordescriptor;
    (void)newdescriptor;
    (void)isdirectoryobject;
    (void)token;
    (void)genericmapping;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_CreatePrivateObjectSecurityEx(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttype, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateObjectSecurityEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parentdescriptor, creatordescriptor, newdescriptor, objecttype, iscontainerobject, autoinheritflags, token, genericmapping);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_CreatePrivateObjectSecurityWithMultipleInheritance(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttypes, uint32_t guidcount, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateObjectSecurityWithMultipleInheritance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(parentdescriptor, creatordescriptor, newdescriptor, objecttypes, guidcount, iscontainerobject, autoinheritflags, token, genericmapping);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_CreateRestrictedToken(void* existingtokenhandle, uint32_t flags, uint32_t disablesidcount, void* sidstodisable, uint32_t deleteprivilegecount, void* privilegestodelete, uint32_t restrictedsidcount, void* sidstorestrict, void* newtokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRestrictedToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(existingtokenhandle, flags, disablesidcount, sidstodisable, deleteprivilegecount, privilegestodelete, restrictedsidcount, sidstorestrict, newtokenhandle);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_CreateWellKnownSid(int32_t wellknownsidtype, void* domainsid, void* psid, void* cbsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWellKnownSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wellknownsidtype, domainsid, psid, cbsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wellknownsidtype;
    (void)domainsid;
    (void)psid;
    (void)cbsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_DeleteAce(void* pacl, uint32_t dwaceindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwaceindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwaceindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_DeriveCapabilitySidsFromName(void* capname, void* capabilitygroupsids, void* capabilitygroupsidcount, void* capabilitysids, void* capabilitysidcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-security-base-l1-2-2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeriveCapabilitySidsFromName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(capname, capabilitygroupsids, capabilitygroupsidcount, capabilitysids, capabilitysidcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)capname;
    (void)capabilitygroupsids;
    (void)capabilitygroupsidcount;
    (void)capabilitysids;
    (void)capabilitysidcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_DestroyPrivateObjectSecurity(void* objectdescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyPrivateObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectdescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectdescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_DuplicateToken(void* existingtokenhandle, int32_t impersonationlevel, void* duplicatetokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(existingtokenhandle, impersonationlevel, duplicatetokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)existingtokenhandle;
    (void)impersonationlevel;
    (void)duplicatetokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_DuplicateTokenEx(void* hexistingtoken, uint32_t dwdesiredaccess, void* lptokenattributes, int32_t impersonationlevel, int32_t tokentype, void* phnewtoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateTokenEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hexistingtoken, dwdesiredaccess, lptokenattributes, impersonationlevel, tokentype, phnewtoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hexistingtoken;
    (void)dwdesiredaccess;
    (void)lptokenattributes;
    (void)impersonationlevel;
    (void)tokentype;
    (void)phnewtoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_EqualDomainSid(void* psid1, void* psid2, void* pfequal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualDomainSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid1, psid2, pfequal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psid1;
    (void)psid2;
    (void)pfequal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_EqualPrefixSid(void* psid1, void* psid2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualPrefixSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid1, psid2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psid1;
    (void)psid2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_EqualSid(void* psid1, void* psid2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EqualSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid1, psid2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psid1;
    (void)psid2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_FindFirstFreeAce(void* pacl, void* pace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFreeAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, pace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)pace;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_FreeSid(void* psid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_GetAce(void* pacl, uint32_t dwaceindex, void* pace) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, dwaceindex, pace);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)dwaceindex;
    (void)pace;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAclInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, paclinformation, naclinformationlength, dwaclinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)paclinformation;
    (void)naclinformationlength;
    (void)dwaclinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetAppContainerAce(void* acl, uint32_t startingaceindex, void* appcontainerace, void* appcontaineraceindex) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAppContainerAce");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(acl, startingaceindex, appcontainerace, appcontaineraceindex);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)acl;
    (void)startingaceindex;
    (void)appcontainerace;
    (void)appcontaineraceindex;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetCachedSigningLevel(void* file, void* flags, void* signinglevel, void* thumbprint, void* thumbprintsize, void* thumbprintalgorithm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCachedSigningLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(file, flags, signinglevel, thumbprint, thumbprintsize, thumbprintalgorithm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)file;
    (void)flags;
    (void)signinglevel;
    (void)thumbprint;
    (void)thumbprintsize;
    (void)thumbprintalgorithm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetFileSecurityA(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSecurityA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, requestedinformation, psecuritydescriptor, nlength, lpnlengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetFileSecurityW(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSecurityW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, requestedinformation, psecuritydescriptor, nlength, lpnlengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetKernelObjectSecurity(void* handle, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetKernelObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, requestedinformation, psecuritydescriptor, nlength, lpnlengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_security_GetLengthSid(void* psid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLengthSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_security_GetPrivateObjectSecurity(void* objectdescriptor, uint32_t securityinformation, void* resultantdescriptor, uint32_t descriptorlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPrivateObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objectdescriptor, securityinformation, resultantdescriptor, descriptorlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)objectdescriptor;
    (void)securityinformation;
    (void)resultantdescriptor;
    (void)descriptorlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetSecurityDescriptorControl(void* psecuritydescriptor, void* pcontrol, void* lpdwrevision) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, pcontrol, lpdwrevision);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)pcontrol;
    (void)lpdwrevision;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetSecurityDescriptorDacl(void* psecuritydescriptor, void* lpbdaclpresent, void* pdacl, void* lpbdacldefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorDacl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, lpbdaclpresent, pdacl, lpbdacldefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)lpbdaclpresent;
    (void)pdacl;
    (void)lpbdacldefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, void* lpbgroupdefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, pgroup, lpbgroupdefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)pgroup;
    (void)lpbgroupdefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_security_GetSecurityDescriptorLength(void* psecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorLength");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_security_GetSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, void* lpbownerdefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorOwner");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, powner, lpbownerdefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)powner;
    (void)lpbownerdefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_security_GetSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorRMControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, rmcontrol);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)securitydescriptor;
    (void)rmcontrol;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_security_GetSecurityDescriptorSacl(void* psecuritydescriptor, void* lpbsaclpresent, void* psacl, void* lpbsacldefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityDescriptorSacl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, lpbsaclpresent, psacl, lpbsacldefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)lpbsaclpresent;
    (void)psacl;
    (void)lpbsacldefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_security_GetSidIdentifierAuthority(void* psid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidIdentifierAuthority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psid;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_security_GetSidLengthRequired(uint8_t nsubauthoritycount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidLengthRequired");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nsubauthoritycount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nsubauthoritycount;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_security_GetSidSubAuthority(void* psid, uint32_t nsubauthority) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidSubAuthority");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid, nsubauthority);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psid;
    (void)nsubauthority;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_security_GetSidSubAuthorityCount(void* psid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSidSubAuthorityCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)psid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_security_GetTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTokenInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetUserObjectSecurity(void* hobj, void* psirequested, void* psid, uint32_t nlength, void* lpnlengthneeded) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUserObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, psirequested, psid, nlength, lpnlengthneeded);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)psirequested;
    (void)psid;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_GetWindowsAccountDomainSid(void* psid, void* pdomainsid, void* cbdomainsid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetWindowsAccountDomainSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid, pdomainsid, cbdomainsid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psid;
    (void)pdomainsid;
    (void)cbdomainsid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ImpersonateAnonymousToken(void* threadhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateAnonymousToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(threadhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)threadhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ImpersonateLoggedOnUser(void* htoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateLoggedOnUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ImpersonateSelf(int32_t impersonationlevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ImpersonateSelf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(impersonationlevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)impersonationlevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_InitializeAcl(void* pacl, uint32_t nacllength, uint32_t dwaclrevision) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeAcl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, nacllength, dwaclrevision);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)nacllength;
    (void)dwaclrevision;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_InitializeSecurityDescriptor(void* psecuritydescriptor, uint32_t dwrevision) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, dwrevision);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)dwrevision;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_InitializeSid(void* sid, void* pidentifierauthority, uint8_t nsubauthoritycount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sid, pidentifierauthority, nsubauthoritycount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sid;
    (void)pidentifierauthority;
    (void)nsubauthoritycount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_IsTokenRestricted(void* tokenhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsTokenRestricted");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_IsValidAcl(void* pacl) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidAcl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_IsValidSecurityDescriptor(void* psecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_IsValidSid(void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsValidSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_IsWellKnownSid(void* psid, int32_t wellknownsidtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWellKnownSid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psid, wellknownsidtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psid;
    (void)wellknownsidtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LogonUserA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszusername, lpszdomain, lpszpassword, dwlogontype, dwlogonprovider, phtoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LogonUserExA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszusername, lpszdomain, lpszpassword, dwlogontype, dwlogonprovider, phtoken, pplogonsid, ppprofilebuffer, pdwprofilelength, pquotalimits);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LogonUserExW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszusername, lpszdomain, lpszpassword, dwlogontype, dwlogonprovider, phtoken, pplogonsid, ppprofilebuffer, pdwprofilelength, pquotalimits);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LogonUserW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogonUserW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszusername, lpszdomain, lpszpassword, dwlogontype, dwlogonprovider, phtoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszusername;
    (void)lpszdomain;
    (void)lpszpassword;
    (void)dwlogontype;
    (void)dwlogonprovider;
    (void)phtoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupAccountNameA(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, lpaccountname, sid, cbsid, referenceddomainname, cchreferenceddomainname, peuse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)lpaccountname;
    (void)sid;
    (void)cbsid;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupAccountNameW(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, lpaccountname, sid, cbsid, referenceddomainname, cchreferenceddomainname, peuse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)lpaccountname;
    (void)sid;
    (void)cbsid;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupAccountSidA(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountSidA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, sid, name, cchname, referenceddomainname, cchreferenceddomainname, peuse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)sid;
    (void)name;
    (void)cchname;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupAccountSidW(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupAccountSidW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, sid, name, cchname, referenceddomainname, cchreferenceddomainname, peuse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)sid;
    (void)name;
    (void)cchname;
    (void)referenceddomainname;
    (void)cchreferenceddomainname;
    (void)peuse;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupPrivilegeDisplayNameA(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeDisplayNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, lpname, lpdisplayname, cchdisplayname, lplanguageid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpdisplayname;
    (void)cchdisplayname;
    (void)lplanguageid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupPrivilegeDisplayNameW(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeDisplayNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, lpname, lpdisplayname, cchdisplayname, lplanguageid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpdisplayname;
    (void)cchdisplayname;
    (void)lplanguageid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupPrivilegeNameA(void* lpsystemname, void* lpluid, void* lpname, void* cchname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, lpluid, lpname, cchname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)lpluid;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupPrivilegeNameW(void* lpsystemname, void* lpluid, void* lpname, void* cchname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, lpluid, lpname, cchname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)lpluid;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupPrivilegeValueA(void* lpsystemname, void* lpname, void* lpluid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, lpname, lpluid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpluid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_LookupPrivilegeValueW(void* lpsystemname, void* lpname, void* lpluid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LookupPrivilegeValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsystemname, lpname, lpluid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpsystemname;
    (void)lpname;
    (void)lpluid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_MakeAbsoluteSD(void* pselfrelativesecuritydescriptor, void* pabsolutesecuritydescriptor, void* lpdwabsolutesecuritydescriptorsize, void* pdacl, void* lpdwdaclsize, void* psacl, void* lpdwsaclsize, void* powner, void* lpdwownersize, void* pprimarygroup, void* lpdwprimarygroupsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeAbsoluteSD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pselfrelativesecuritydescriptor, pabsolutesecuritydescriptor, lpdwabsolutesecuritydescriptorsize, pdacl, lpdwdaclsize, psacl, lpdwsaclsize, powner, lpdwownersize, pprimarygroup, lpdwprimarygroupsize);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_MakeSelfRelativeSD(void* pabsolutesecuritydescriptor, void* pselfrelativesecuritydescriptor, void* lpdwbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSelfRelativeSD");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pabsolutesecuritydescriptor, pselfrelativesecuritydescriptor, lpdwbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pabsolutesecuritydescriptor;
    (void)pselfrelativesecuritydescriptor;
    (void)lpdwbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_MapGenericMask(void* accessmask, void* genericmapping) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapGenericMask");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(accessmask, genericmapping);
        return;
    }
    errno = ENOSYS;
#else
    (void)accessmask;
    (void)genericmapping;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_ObjectCloseAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectCloseAuditAlarmA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ObjectCloseAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectCloseAuditAlarmW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ObjectDeleteAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectDeleteAuditAlarmA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ObjectDeleteAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectDeleteAuditAlarmW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, generateonclose);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ObjectOpenAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectOpenAuditAlarmA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, psecuritydescriptor, clienttoken, desiredaccess, grantedaccess, privileges, objectcreation, accessgranted, generateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ObjectOpenAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectOpenAuditAlarmW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, objecttypename, objectname, psecuritydescriptor, clienttoken, desiredaccess, grantedaccess, privileges, objectcreation, accessgranted, generateonclose);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmA(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectPrivilegeAuditAlarmA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, clienttoken, desiredaccess, privileges, accessgranted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmW(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObjectPrivilegeAuditAlarmW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, handleid, clienttoken, desiredaccess, privileges, accessgranted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_PrivilegeCheck(void* clienttoken, void* requiredprivileges, void* pfresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivilegeCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clienttoken, requiredprivileges, pfresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)pfresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_PrivilegedServiceAuditAlarmA(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivilegedServiceAuditAlarmA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, servicename, clienttoken, privileges, accessgranted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_PrivilegedServiceAuditAlarmW(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrivilegedServiceAuditAlarmW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(subsystemname, servicename, clienttoken, privileges, accessgranted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_QuerySecurityAccessMask(uint32_t securityinformation, void* desiredaccess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityAccessMask");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(securityinformation, desiredaccess);
        return;
    }
    errno = ENOSYS;
#else
    (void)securityinformation;
    (void)desiredaccess;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_RevertToSelf(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RevertToSelf");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_RtlConvertSidToUnicodeString(void* unicodestring, void* sid, bool allocatedestinationstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlConvertSidToUnicodeString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(unicodestring, sid, allocatedestinationstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)unicodestring;
    (void)sid;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_security_RtlNormalizeSecurityDescriptor(void* securitydescriptor, uint32_t securitydescriptorlength, void* newsecuritydescriptor, void* newsecuritydescriptorlength, bool checkonly) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNormalizeSecurityDescriptor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, securitydescriptorlength, newsecuritydescriptor, newsecuritydescriptorlength, checkonly);
    }
    errno = ENOSYS;
    return false;
#else
    (void)securitydescriptor;
    (void)securitydescriptorlength;
    (void)newsecuritydescriptor;
    (void)newsecuritydescriptorlength;
    (void)checkonly;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_security_SetAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAclInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pacl, paclinformation, naclinformationlength, dwaclinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pacl;
    (void)paclinformation;
    (void)naclinformationlength;
    (void)dwaclinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetCachedSigningLevel(void* sourcefiles, uint32_t sourcefilecount, uint32_t flags, void* targetfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCachedSigningLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcefiles, sourcefilecount, flags, targetfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcefiles;
    (void)sourcefilecount;
    (void)flags;
    (void)targetfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetFileSecurityA(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileSecurityA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetFileSecurityW(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileSecurityW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetKernelObjectSecurity(void* handle, uint32_t securityinformation, void* securitydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetKernelObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, securityinformation, securitydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetPrivateObjectSecurity(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, void* genericmapping, void* token) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPrivateObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securityinformation, modificationdescriptor, objectssecuritydescriptor, genericmapping, token);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)genericmapping;
    (void)token;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetPrivateObjectSecurityEx(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, uint32_t autoinheritflags, void* genericmapping, void* token) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPrivateObjectSecurityEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securityinformation, modificationdescriptor, objectssecuritydescriptor, autoinheritflags, genericmapping, token);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)autoinheritflags;
    (void)genericmapping;
    (void)token;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_SetSecurityAccessMask(uint32_t securityinformation, void* desiredaccess) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityAccessMask");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(securityinformation, desiredaccess);
        return;
    }
    errno = ENOSYS;
#else
    (void)securityinformation;
    (void)desiredaccess;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_SetSecurityDescriptorControl(void* psecuritydescriptor, uint16_t controlbitsofinterest, uint16_t controlbitstoset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, controlbitsofinterest, controlbitstoset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)controlbitsofinterest;
    (void)controlbitstoset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetSecurityDescriptorDacl(void* psecuritydescriptor, int32_t bdaclpresent, void* pdacl, int32_t bdacldefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorDacl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, bdaclpresent, pdacl, bdacldefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)bdaclpresent;
    (void)pdacl;
    (void)bdacldefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, int32_t bgroupdefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, pgroup, bgroupdefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)pgroup;
    (void)bgroupdefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, int32_t bownerdefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorOwner");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, powner, bownerdefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)powner;
    (void)bownerdefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_security_SetSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorRMControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(securitydescriptor, rmcontrol);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)securitydescriptor;
    (void)rmcontrol;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_security_SetSecurityDescriptorSacl(void* psecuritydescriptor, int32_t bsaclpresent, void* psacl, int32_t bsacldefaulted) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSecurityDescriptorSacl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psecuritydescriptor, bsaclpresent, psacl, bsacldefaulted);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psecuritydescriptor;
    (void)bsaclpresent;
    (void)psacl;
    (void)bsacldefaulted;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTokenInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(tokenhandle, tokeninformationclass, tokeninformation, tokeninformationlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_SetUserObjectSecurity(void* hobj, void* psirequested, void* psid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserObjectSecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hobj, psirequested, psid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hobj;
    (void)psirequested;
    (void)psid;
    errno = ENOSYS;
    return -1;
#endif
}

