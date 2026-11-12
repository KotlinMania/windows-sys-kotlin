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

int32_t windowssysWindowsWin32SecurityAccessCheck(void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckByType(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultList(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccesslist, void* accessstatuslist) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose) {
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

int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose) {
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

int32_t windowssysWindowsWin32SecurityAddAccessAllowedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid) {
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

int32_t windowssysWindowsWin32SecurityAddAccessAllowedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid) {
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

int32_t windowssysWindowsWin32SecurityAddAccessAllowedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid) {
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

int32_t windowssysWindowsWin32SecurityAddAccessDeniedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid) {
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

int32_t windowssysWindowsWin32SecurityAddAccessDeniedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid) {
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

int32_t windowssysWindowsWin32SecurityAddAccessDeniedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid) {
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

int32_t windowssysWindowsWin32SecurityAddAce(void* pacl, uint32_t dwacerevision, uint32_t dwstartingaceindex, void* pacelist, uint32_t nacelistlength) {
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

int32_t windowssysWindowsWin32SecurityAddAuditAccessAce(void* pacl, uint32_t dwacerevision, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure) {
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

int32_t windowssysWindowsWin32SecurityAddAuditAccessAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure) {
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

int32_t windowssysWindowsWin32SecurityAddAuditAccessObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid, int32_t bauditsuccess, int32_t bauditfailure) {
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

int32_t windowssysWindowsWin32SecurityAddConditionalAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint8_t acetype, uint32_t accessmask, void* psid, void* conditionstr, void* returnlength) {
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

int32_t windowssysWindowsWin32SecurityAddMandatoryAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t mandatorypolicy, void* plabelsid) {
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

int32_t windowssysWindowsWin32SecurityAddResourceAttributeAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid, void* pattributeinfo, void* preturnlength) {
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

int32_t windowssysWindowsWin32SecurityAddScopedPolicyIDAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid) {
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

int32_t windowssysWindowsWin32SecurityAdjustTokenGroups(void* tokenhandle, int32_t resettodefault, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength) {
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

int32_t windowssysWindowsWin32SecurityAdjustTokenPrivileges(void* tokenhandle, int32_t disableallprivileges, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength) {
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

int32_t windowssysWindowsWin32SecurityAllocateAndInitializeSid(void* pidentifierauthority, uint8_t nsubauthoritycount, uint32_t nsubauthority0, uint32_t nsubauthority1, uint32_t nsubauthority2, uint32_t nsubauthority3, uint32_t nsubauthority4, uint32_t nsubauthority5, uint32_t nsubauthority6, uint32_t nsubauthority7, void* psid) {
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

int32_t windowssysWindowsWin32SecurityAllocateLocallyUniqueId(void* luid) {
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

int32_t windowssysWindowsWin32SecurityAreAllAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess) {
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

int32_t windowssysWindowsWin32SecurityAreAnyAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess) {
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

int32_t windowssysWindowsWin32SecurityCheckTokenCapability(void* tokenhandle, void* capabilitysidtocheck, void* hascapability) {
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

int32_t windowssysWindowsWin32SecurityCheckTokenMembership(void* tokenhandle, void* sidtocheck, void* ismember) {
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

int32_t windowssysWindowsWin32SecurityCheckTokenMembershipEx(void* tokenhandle, void* sidtocheck, uint32_t flags, void* ismember) {
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

int32_t windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(void* parentdescriptor, void* currentsecuritydescriptor, void* newsecuritydescriptor, void* objecttype, bool isdirectoryobject, void* genericmapping) {
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

int32_t windowssysWindowsWin32SecurityCopySid(uint32_t ndestinationsidlength, void* pdestinationsid, void* psourcesid) {
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

int32_t windowssysWindowsWin32SecurityCreatePrivateObjectSecurity(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, int32_t isdirectoryobject, void* token, void* genericmapping) {
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

int32_t windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttype, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping) {
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

int32_t windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttypes, uint32_t guidcount, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping) {
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

int32_t windowssysWindowsWin32SecurityCreateRestrictedToken(void* existingtokenhandle, uint32_t flags, uint32_t disablesidcount, void* sidstodisable, uint32_t deleteprivilegecount, void* privilegestodelete, uint32_t restrictedsidcount, void* sidstorestrict, void* newtokenhandle) {
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

int32_t windowssysWindowsWin32SecurityCreateWellKnownSid(int32_t wellknownsidtype, void* domainsid, void* psid, void* cbsid) {
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

int32_t windowssysWindowsWin32SecurityDeleteAce(void* pacl, uint32_t dwaceindex) {
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

int32_t windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(void* capname, void* capabilitygroupsids, void* capabilitygroupsidcount, void* capabilitysids, void* capabilitysidcount) {
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

int32_t windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(void* objectdescriptor) {
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

int32_t windowssysWindowsWin32SecurityDuplicateToken(void* existingtokenhandle, int32_t impersonationlevel, void* duplicatetokenhandle) {
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

int32_t windowssysWindowsWin32SecurityDuplicateTokenEx(void* hexistingtoken, uint32_t dwdesiredaccess, void* lptokenattributes, int32_t impersonationlevel, int32_t tokentype, void* phnewtoken) {
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

int32_t windowssysWindowsWin32SecurityEqualDomainSid(void* psid1, void* psid2, void* pfequal) {
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

int32_t windowssysWindowsWin32SecurityEqualPrefixSid(void* psid1, void* psid2) {
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

int32_t windowssysWindowsWin32SecurityEqualSid(void* psid1, void* psid2) {
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

int32_t windowssysWindowsWin32SecurityFindFirstFreeAce(void* pacl, void* pace) {
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

void* windowssysWindowsWin32SecurityFreeSid(void* psid) {
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

int32_t windowssysWindowsWin32SecurityGetAce(void* pacl, uint32_t dwaceindex, void* pace) {
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

int32_t windowssysWindowsWin32SecurityGetAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass) {
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

int32_t windowssysWindowsWin32SecurityGetAppContainerAce(void* acl, uint32_t startingaceindex, void* appcontainerace, void* appcontaineraceindex) {
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

int32_t windowssysWindowsWin32SecurityGetCachedSigningLevel(void* file, void* flags, void* signinglevel, void* thumbprint, void* thumbprintsize, void* thumbprintalgorithm) {
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

int32_t windowssysWindowsWin32SecurityGetFileSecurityA(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded) {
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

int32_t windowssysWindowsWin32SecurityGetFileSecurityW(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded) {
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

int32_t windowssysWindowsWin32SecurityGetKernelObjectSecurity(void* handle, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded) {
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

uint32_t windowssysWindowsWin32SecurityGetLengthSid(void* psid) {
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

int32_t windowssysWindowsWin32SecurityGetPrivateObjectSecurity(void* objectdescriptor, uint32_t securityinformation, void* resultantdescriptor, uint32_t descriptorlength, void* returnlength) {
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

int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorControl(void* psecuritydescriptor, void* pcontrol, void* lpdwrevision) {
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

int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorDacl(void* psecuritydescriptor, void* lpbdaclpresent, void* pdacl, void* lpbdacldefaulted) {
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

int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, void* lpbgroupdefaulted) {
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

uint32_t windowssysWindowsWin32SecurityGetSecurityDescriptorLength(void* psecuritydescriptor) {
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

int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, void* lpbownerdefaulted) {
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

uint32_t windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol) {
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

int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorSacl(void* psecuritydescriptor, void* lpbsaclpresent, void* psacl, void* lpbsacldefaulted) {
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

void* windowssysWindowsWin32SecurityGetSidIdentifierAuthority(void* psid) {
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

uint32_t windowssysWindowsWin32SecurityGetSidLengthRequired(uint8_t nsubauthoritycount) {
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

void* windowssysWindowsWin32SecurityGetSidSubAuthority(void* psid, uint32_t nsubauthority) {
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

void* windowssysWindowsWin32SecurityGetSidSubAuthorityCount(void* psid) {
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

int32_t windowssysWindowsWin32SecurityGetTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength, void* returnlength) {
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

int32_t windowssysWindowsWin32SecurityGetUserObjectSecurity(void* hobj, void* psirequested, void* psid, uint32_t nlength, void* lpnlengthneeded) {
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

int32_t windowssysWindowsWin32SecurityGetWindowsAccountDomainSid(void* psid, void* pdomainsid, void* cbdomainsid) {
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

int32_t windowssysWindowsWin32SecurityImpersonateAnonymousToken(void* threadhandle) {
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

int32_t windowssysWindowsWin32SecurityImpersonateLoggedOnUser(void* htoken) {
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

int32_t windowssysWindowsWin32SecurityImpersonateSelf(int32_t impersonationlevel) {
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

int32_t windowssysWindowsWin32SecurityInitializeAcl(void* pacl, uint32_t nacllength, uint32_t dwaclrevision) {
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

int32_t windowssysWindowsWin32SecurityInitializeSecurityDescriptor(void* psecuritydescriptor, uint32_t dwrevision) {
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

int32_t windowssysWindowsWin32SecurityInitializeSid(void* sid, void* pidentifierauthority, uint8_t nsubauthoritycount) {
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

int32_t windowssysWindowsWin32SecurityIsTokenRestricted(void* tokenhandle) {
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

int32_t windowssysWindowsWin32SecurityIsValidAcl(void* pacl) {
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

int32_t windowssysWindowsWin32SecurityIsValidSecurityDescriptor(void* psecuritydescriptor) {
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

int32_t windowssysWindowsWin32SecurityIsValidSid(void* psid) {
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

int32_t windowssysWindowsWin32SecurityIsWellKnownSid(void* psid, int32_t wellknownsidtype) {
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

int32_t windowssysWindowsWin32SecurityLogonUserA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken) {
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

int32_t windowssysWindowsWin32SecurityLogonUserExA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits) {
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

int32_t windowssysWindowsWin32SecurityLogonUserExW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits) {
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

int32_t windowssysWindowsWin32SecurityLogonUserW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken) {
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

int32_t windowssysWindowsWin32SecurityLookupAccountNameA(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse) {
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

int32_t windowssysWindowsWin32SecurityLookupAccountNameW(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse) {
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

int32_t windowssysWindowsWin32SecurityLookupAccountSidA(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse) {
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

int32_t windowssysWindowsWin32SecurityLookupAccountSidW(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse) {
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

int32_t windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid) {
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

int32_t windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid) {
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

int32_t windowssysWindowsWin32SecurityLookupPrivilegeNameA(void* lpsystemname, void* lpluid, void* lpname, void* cchname) {
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

int32_t windowssysWindowsWin32SecurityLookupPrivilegeNameW(void* lpsystemname, void* lpluid, void* lpname, void* cchname) {
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

int32_t windowssysWindowsWin32SecurityLookupPrivilegeValueA(void* lpsystemname, void* lpname, void* lpluid) {
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

int32_t windowssysWindowsWin32SecurityLookupPrivilegeValueW(void* lpsystemname, void* lpname, void* lpluid) {
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

int32_t windowssysWindowsWin32SecurityMakeAbsoluteSD(void* pselfrelativesecuritydescriptor, void* pabsolutesecuritydescriptor, void* lpdwabsolutesecuritydescriptorsize, void* pdacl, void* lpdwdaclsize, void* psacl, void* lpdwsaclsize, void* powner, void* lpdwownersize, void* pprimarygroup, void* lpdwprimarygroupsize) {
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

int32_t windowssysWindowsWin32SecurityMakeSelfRelativeSD(void* pabsolutesecuritydescriptor, void* pselfrelativesecuritydescriptor, void* lpdwbufferlength) {
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

void windowssysWindowsWin32SecurityMapGenericMask(void* accessmask, void* genericmapping) {
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

int32_t windowssysWindowsWin32SecurityObjectCloseAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose) {
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

int32_t windowssysWindowsWin32SecurityObjectCloseAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose) {
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

int32_t windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose) {
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

int32_t windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose) {
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

int32_t windowssysWindowsWin32SecurityObjectOpenAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose) {
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

int32_t windowssysWindowsWin32SecurityObjectOpenAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose) {
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

int32_t windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted) {
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

int32_t windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted) {
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

int32_t windowssysWindowsWin32SecurityPrivilegeCheck(void* clienttoken, void* requiredprivileges, void* pfresult) {
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

int32_t windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted) {
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

int32_t windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted) {
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

void windowssysWindowsWin32SecurityQuerySecurityAccessMask(uint32_t securityinformation, void* desiredaccess) {
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

int32_t windowssysWindowsWin32SecurityRevertToSelf(void) {
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

int32_t windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(void* unicodestring, void* sid, bool allocatedestinationstring) {
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

bool windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(void* securitydescriptor, uint32_t securitydescriptorlength, void* newsecuritydescriptor, void* newsecuritydescriptorlength, bool checkonly) {
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

int32_t windowssysWindowsWin32SecuritySetAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass) {
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

int32_t windowssysWindowsWin32SecuritySetCachedSigningLevel(void* sourcefiles, uint32_t sourcefilecount, uint32_t flags, void* targetfile) {
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

int32_t windowssysWindowsWin32SecuritySetFileSecurityA(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor) {
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

int32_t windowssysWindowsWin32SecuritySetFileSecurityW(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor) {
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

int32_t windowssysWindowsWin32SecuritySetKernelObjectSecurity(void* handle, uint32_t securityinformation, void* securitydescriptor) {
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

int32_t windowssysWindowsWin32SecuritySetPrivateObjectSecurity(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, void* genericmapping, void* token) {
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

int32_t windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, uint32_t autoinheritflags, void* genericmapping, void* token) {
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

void windowssysWindowsWin32SecuritySetSecurityAccessMask(uint32_t securityinformation, void* desiredaccess) {
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

int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorControl(void* psecuritydescriptor, uint16_t controlbitsofinterest, uint16_t controlbitstoset) {
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

int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorDacl(void* psecuritydescriptor, int32_t bdaclpresent, void* pdacl, int32_t bdacldefaulted) {
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

int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, int32_t bgroupdefaulted) {
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

int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, int32_t bownerdefaulted) {
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

uint32_t windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol) {
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

int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorSacl(void* psecuritydescriptor, int32_t bsaclpresent, void* psacl, int32_t bsacldefaulted) {
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

int32_t windowssysWindowsWin32SecuritySetTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength) {
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

int32_t windowssysWindowsWin32SecuritySetUserObjectSecurity(void* hobj, void* psirequested, void* psid) {
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

