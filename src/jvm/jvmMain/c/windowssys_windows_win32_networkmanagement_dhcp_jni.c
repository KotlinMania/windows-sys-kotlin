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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpAddFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong addfilterinfo, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddFilterV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)addfilterinfo, (int32_t)forceflag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)addfilterinfo;
    (void)forceflag;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpAddSecurityGroup(JNIEnv* km_env, jclass km_clazz, jlong pserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSecurityGroup");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pserver);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pserver;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpAddServer(JNIEnv* km_env, jclass km_clazz, jint flags, jlong idinfo, jlong newserver, jlong callbackfn, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddServer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)idinfo, (void*)(uintptr_t)newserver, (void*)(uintptr_t)callbackfn, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)idinfo;
    (void)newserver;
    (void)callbackfn;
    (void)callbackdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpAddSubnetElement(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong addelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSubnetElement");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)addelementinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpAddSubnetElementV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong addelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSubnetElementV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)addelementinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpAddSubnetElementV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong addelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSubnetElementV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)addelementinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpAuditLogGetParams(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong auditlogdir, jlong diskcheckinterval, jlong maxlogfilessize, jlong minspaceondisk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAuditLogGetParams");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)auditlogdir, (void*)(uintptr_t)diskcheckinterval, (void*)(uintptr_t)maxlogfilessize, (void*)(uintptr_t)minspaceondisk);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)auditlogdir;
    (void)diskcheckinterval;
    (void)maxlogfilessize;
    (void)minspaceondisk;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpAuditLogSetParams(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong auditlogdir, jint diskcheckinterval, jint maxlogfilessize, jint minspaceondisk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAuditLogSetParams");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)auditlogdir, (uint32_t)diskcheckinterval, (uint32_t)maxlogfilessize, (uint32_t)minspaceondisk);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)auditlogdir;
    (void)diskcheckinterval;
    (void)maxlogfilessize;
    (void)minspaceondisk;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCApiCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCApiCleanup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCApiInitialize(JNIEnv* km_env, jclass km_clazz, jlong version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCApiInitialize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)version);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)version;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateClass(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClass");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateClassV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClassV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateClientInfoV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClientInfoV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateClientInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClientInfoVQ");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateOption(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateOption");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)optioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateOptionV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateOptionV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateOptionV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateOptionV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateSubnet(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateSubnet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpCreateSubnetVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateSubnetVQ");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDeRegisterParamChange(JNIEnv* km_env, jclass km_clazz, jint flags, jlong reserved, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeRegisterParamChange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)reserved, (void*)(uintptr_t)event);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)reserved;
    (void)event;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDeleteClass(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClass");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDeleteClassV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClassV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDeleteClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDeleteClientInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClientInfoV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDeleteFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong deletefilterinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteFilterV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)deletefilterinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)deletefilterinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDeleteServer(JNIEnv* km_env, jclass km_clazz, jint flags, jlong idinfo, jlong newserver, jlong callbackfn, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteServer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)idinfo, (void*)(uintptr_t)newserver, (void*)(uintptr_t)callbackfn, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)idinfo;
    (void)newserver;
    (void)callbackfn;
    (void)callbackdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDeleteSubnet(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteSubnet");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (int32_t)forceflag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)forceflag;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDeleteSuperScopeV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong superscopename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteSuperScopeV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)superscopename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)superscopename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDsCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDsCleanup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpDsInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDsInit");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumClasses(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong resumehandle, jint preferredmaximum, jlong classinfoarray, jlong nread, jlong ntotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumClasses");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)classinfoarray, (void*)(uintptr_t)nread, (void*)(uintptr_t)ntotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)classinfoarray;
    (void)nread;
    (void)ntotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumClassesV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong resumehandle, jint preferredmaximum, jlong classinfoarray, jlong nread, jlong ntotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumClassesV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)classinfoarray, (void*)(uintptr_t)nread, (void*)(uintptr_t)ntotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)classinfoarray;
    (void)nread;
    (void)ntotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jint listtype, jlong enumfilterinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumFilterV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (int32_t)listtype, (void*)(uintptr_t)enumfilterinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)listtype;
    (void)enumfilterinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong scopeinfo, jlong resumehandle, jint preferredmaximum, jlong optionvalues, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionValues");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)optionvalues, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumOptionValuesV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong scopeinfo, jlong resumehandle, jint preferredmaximum, jlong optionvalues, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionValuesV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)optionvalues, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumOptionValuesV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong scopeinfo, jlong resumehandle, jint preferredmaximum, jlong optionvalues, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionValuesV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)optionvalues, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumOptions(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jlong options, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptions");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)options, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumOptionsV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong resumehandle, jint preferredmaximum, jlong options, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionsV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)options, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumOptionsV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong resumehandle, jint preferredmaximum, jlong options, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionsV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)options, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumServers(JNIEnv* km_env, jclass km_clazz, jint flags, jlong idinfo, jlong servers, jlong callbackfn, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumServers");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)idinfo, (void*)(uintptr_t)servers, (void*)(uintptr_t)callbackfn, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)idinfo;
    (void)servers;
    (void)callbackfn;
    (void)callbackdata;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnetClients(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClients");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnetClientsFilterStatusInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsFilterStatusInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnetClientsV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnetClientsV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnetClientsVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsVQ");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnetElements(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint enumelementtype, jlong resumehandle, jint preferredmaximum, jlong enumelementinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetElements");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (int32_t)enumelementtype, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enumelementinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnetElementsV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint enumelementtype, jlong resumehandle, jint preferredmaximum, jlong enumelementinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetElementsV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (int32_t)enumelementtype, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enumelementinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnetElementsV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint enumelementtype, jlong resumehandle, jint preferredmaximum, jlong enumelementinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetElementsV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (int32_t)enumelementtype, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enumelementinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnets(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jlong enuminfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnets");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enuminfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpEnumSubnetsV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jlong enuminfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetsV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enuminfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetAllOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong scopeinfo, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptionValues");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)values);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetAllOptionValuesV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong scopeinfo, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptionValuesV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)values);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetAllOptions(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong optionstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptions");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)optionstruct);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionstruct;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetAllOptionsV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong optionstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptionsV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)optionstruct);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionstruct;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetClassInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong partialclassinfo, jlong filledclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClassInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)partialclassinfo, (void*)(uintptr_t)filledclassinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)partialclassinfo;
    (void)filledclassinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetClientInfoV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfoV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetClientInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfoV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetClientInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfoVQ");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetClientOptions(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint clientipaddress, jint clientsubnetmask, jlong clientoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientOptions");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)clientipaddress, (uint32_t)clientsubnetmask, (void*)(uintptr_t)clientoptions);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientipaddress;
    (void)clientsubnetmask;
    (void)clientoptions;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong globalfilterinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetFilterV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)globalfilterinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)globalfilterinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetMibInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong mibinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetMibInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)mibinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)mibinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetMibInfoV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong mibinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetMibInfoV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)mibinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)mibinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetMibInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong mibinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetMibInfoV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)mibinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)mibinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetOptionInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)optioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetOptionInfoV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionInfoV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetOptionInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionInfoV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetOptionValueV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionValueV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetOptionValueV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionValueV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetOriginalSubnetMask(JNIEnv* km_env, jclass km_clazz, jlong sadaptername, jlong dwsubnetmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOriginalSubnetMask");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sadaptername, (void*)(uintptr_t)dwsubnetmask);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sadaptername;
    (void)dwsubnetmask;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetServerBindingInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong bindelementsinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetServerBindingInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)bindelementsinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementsinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetServerBindingInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong bindelementsinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetServerBindingInfoV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)bindelementsinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementsinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetServerSpecificStrings(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong serverspecificstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetServerSpecificStrings");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)serverspecificstrings);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)serverspecificstrings;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetSubnetDelayOffer(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong timedelayinmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSubnetDelayOffer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)timedelayinmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)timedelayinmilliseconds;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetSubnetInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSubnetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetSubnetInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSubnetInfoVQ");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetSuperScopeInfoV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong superscopetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSuperScopeInfoV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)superscopetable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)superscopetable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetThreadOptions(JNIEnv* km_env, jclass km_clazz, jlong pflags, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetThreadOptions");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pflags, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)pflags;
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpGetVersion(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong majorversion, jlong minorversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetVersion");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)majorversion, (void*)(uintptr_t)minorversion);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)majorversion;
    (void)minorversion;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprAddV4PolicyCondition(JNIEnv* km_env, jclass km_clazz, jlong policy, jint parentexpr, jint type, jint optionid, jint suboptionid, jlong vendorname, jint arg_6_operator, jlong value, jint valuelength, jlong conditionindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, uint32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyCondition");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policy, (uint32_t)parentexpr, (int32_t)type, (uint32_t)optionid, (uint32_t)suboptionid, (void*)(uintptr_t)vendorname, (int32_t)arg_6_operator, (void*)(uintptr_t)value, (uint32_t)valuelength, (void*)(uintptr_t)conditionindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)policy;
    (void)parentexpr;
    (void)type;
    (void)optionid;
    (void)suboptionid;
    (void)vendorname;
    (void)arg_6_operator;
    (void)value;
    (void)valuelength;
    (void)conditionindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprAddV4PolicyExpr(JNIEnv* km_env, jclass km_clazz, jlong policy, jint parentexpr, jint arg_2_operator, jlong exprindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyExpr");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policy, (uint32_t)parentexpr, (int32_t)arg_2_operator, (void*)(uintptr_t)exprindex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)policy;
    (void)parentexpr;
    (void)arg_2_operator;
    (void)exprindex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprAddV4PolicyRange(JNIEnv* km_env, jclass km_clazz, jlong policy, jlong range) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyRange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policy, (void*)(uintptr_t)range);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)policy;
    (void)range;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprCreateV4Policy(JNIEnv* km_env, jclass km_clazz, jlong policyname, jint fglobalpolicy, jint subnet, jint processingorder, jint rootoperator, jlong description, jint enabled, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprCreateV4Policy");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policyname, (int32_t)fglobalpolicy, (uint32_t)subnet, (uint32_t)processingorder, (int32_t)rootoperator, (void*)(uintptr_t)description, (int32_t)enabled, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)policyname;
    (void)fglobalpolicy;
    (void)subnet;
    (void)processingorder;
    (void)rootoperator;
    (void)description;
    (void)enabled;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprCreateV4PolicyEx(JNIEnv* km_env, jclass km_clazz, jlong policyname, jint fglobalpolicy, jint subnet, jint processingorder, jint rootoperator, jlong description, jint enabled, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprCreateV4PolicyEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policyname, (int32_t)fglobalpolicy, (uint32_t)subnet, (uint32_t)processingorder, (int32_t)rootoperator, (void*)(uintptr_t)description, (int32_t)enabled, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)policyname;
    (void)fglobalpolicy;
    (void)subnet;
    (void)processingorder;
    (void)rootoperator;
    (void)description;
    (void)enabled;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprFindV4DhcpProperty(JNIEnv* km_env, jclass km_clazz, jlong propertyarray, jint id, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFindV4DhcpProperty");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propertyarray, (int32_t)id, (int32_t)type);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)propertyarray;
    (void)id;
    (void)type;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprFreeV4DhcpProperty(JNIEnv* km_env, jclass km_clazz, jlong property) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4DhcpProperty");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)property);
    } else {
        errno = ENOSYS;
    }
#else
    (void)property;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprFreeV4DhcpPropertyArray(JNIEnv* km_env, jclass km_clazz, jlong propertyarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4DhcpPropertyArray");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)propertyarray);
    } else {
        errno = ENOSYS;
    }
#else
    (void)propertyarray;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprFreeV4Policy(JNIEnv* km_env, jclass km_clazz, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4Policy");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
    }
#else
    (void)policy;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprFreeV4PolicyArray(JNIEnv* km_env, jclass km_clazz, jlong policyarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyArray");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)policyarray);
    } else {
        errno = ENOSYS;
    }
#else
    (void)policyarray;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprFreeV4PolicyEx(JNIEnv* km_env, jclass km_clazz, jlong policyex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)policyex);
    } else {
        errno = ENOSYS;
    }
#else
    (void)policyex;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprFreeV4PolicyExArray(JNIEnv* km_env, jclass km_clazz, jlong policyexarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyExArray");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)policyexarray);
    } else {
        errno = ENOSYS;
    }
#else
    (void)policyexarray;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprIsV4PolicySingleUC(JNIEnv* km_env, jclass km_clazz, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicySingleUC");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprIsV4PolicyValid(JNIEnv* km_env, jclass km_clazz, jlong ppolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicyValid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppolicy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ppolicy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprIsV4PolicyWellFormed(JNIEnv* km_env, jclass km_clazz, jlong ppolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicyWellFormed");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ppolicy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ppolicy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprModifyV4PolicyExpr(JNIEnv* km_env, jclass km_clazz, jlong policy, jint arg_1_operator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprModifyV4PolicyExpr");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policy, (int32_t)arg_1_operator);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)policy;
    (void)arg_1_operator;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpHlprResetV4PolicyExpr(JNIEnv* km_env, jclass km_clazz, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprResetV4PolicyExpr");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpModifyClass(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpModifyClass");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpModifyClassV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpModifyClassV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveDNSRegistrations(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveDNSRegistrations");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveOption(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOption");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)optionid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveOptionV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveOptionV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong scopeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)scopeinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveOptionValueV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionValueV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveOptionValueV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionValueV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveSubnetElement(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong removeelementinfo, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveSubnetElement");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)removeelementinfo, (int32_t)forceflag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveSubnetElementV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong removeelementinfo, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveSubnetElementV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)removeelementinfo, (int32_t)forceflag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRemoveSubnetElementV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong removeelementinfo, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveSubnetElementV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)removeelementinfo, (int32_t)forceflag);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpRpcFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong bufferpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRpcFreeMemory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bufferpointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bufferpointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpScanDatabase(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint fixflag, jlong scanlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpScanDatabase");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (uint32_t)fixflag, (void*)(uintptr_t)scanlist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)fixflag;
    (void)scanlist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerAuditlogParamsFree(JNIEnv* km_env, jclass km_clazz, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerAuditlogParamsFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)configinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)configinfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerBackupDatabase(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerBackupDatabase");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)path;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerGetConfig(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfig");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)configinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)configinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerGetConfigV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfigV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)configinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)configinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerGetConfigV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong scopeinfo, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfigV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)configinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)configinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerGetConfigVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfigVQ");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)configinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)configinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerQueryAttribute(JNIEnv* km_env, jclass km_clazz, jlong serveripaddr, jint dwreserved, jint dhcpattribid, jlong pdhcpattrib) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerQueryAttribute");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddr, (uint32_t)dwreserved, (uint32_t)dhcpattribid, (void*)(uintptr_t)pdhcpattrib);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddr;
    (void)dwreserved;
    (void)dhcpattribid;
    (void)pdhcpattrib;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerQueryAttributes(JNIEnv* km_env, jclass km_clazz, jlong serveripaddr, jint dwreserved, jint dwattribcount, jlong pdhcpattribs, jlong pdhcpattribarr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerQueryAttributes");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddr, (uint32_t)dwreserved, (uint32_t)dwattribcount, (void*)(uintptr_t)pdhcpattribs, (void*)(uintptr_t)pdhcpattribarr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddr;
    (void)dwreserved;
    (void)dwattribcount;
    (void)pdhcpattribs;
    (void)pdhcpattribarr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerQueryDnsRegCredentials(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint unamesize, jlong uname, jint domainsize, jlong domain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerQueryDnsRegCredentials");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)unamesize, (void*)(uintptr_t)uname, (uint32_t)domainsize, (void*)(uintptr_t)domain);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)unamesize;
    (void)uname;
    (void)domainsize;
    (void)domain;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerRedoAuthorization(JNIEnv* km_env, jclass km_clazz, jlong serveripaddr, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerRedoAuthorization");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddr, (uint32_t)dwreserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddr;
    (void)dwreserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerRestoreDatabase(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerRestoreDatabase");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)path);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)path;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerSetConfig(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldstoset, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfig");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldstoset, (void*)(uintptr_t)configinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerSetConfigV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldstoset, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfigV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldstoset, (void*)(uintptr_t)configinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerSetConfigV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong scopeinfo, jint fieldstoset, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfigV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)scopeinfo, (uint32_t)fieldstoset, (void*)(uintptr_t)configinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)fieldstoset;
    (void)configinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerSetConfigVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldstoset, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfigVQ");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldstoset, (void*)(uintptr_t)configinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerSetDnsRegCredentials(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong uname, jlong domain, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetDnsRegCredentials");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)uname, (void*)(uintptr_t)domain, (void*)(uintptr_t)passwd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)uname;
    (void)domain;
    (void)passwd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpServerSetDnsRegCredentialsV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong uname, jlong domain, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetDnsRegCredentialsV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)uname, (void*)(uintptr_t)domain, (void*)(uintptr_t)passwd);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)uname;
    (void)domain;
    (void)passwd;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetClientInfoV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfoV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetClientInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfoV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetClientInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfoVQ");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong globalfilterinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetFilterV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)globalfilterinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)globalfilterinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetOptionInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)optioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetOptionInfoV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionInfoV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetOptionInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionInfoV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetOptionValueV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValueV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetOptionValueV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValueV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong scopeinfo, jlong optionvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValues");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalues);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)optionvalues;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetOptionValuesV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValuesV5");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalues);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalues;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetServerBindingInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong bindelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetServerBindingInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)bindelementinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetServerBindingInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong bindelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetServerBindingInfoV6");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)bindelementinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetSubnetDelayOffer(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jshort timedelayinmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSubnetDelayOffer");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (uint16_t)timedelayinmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)timedelayinmilliseconds;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetSubnetInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSubnetInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetSubnetInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSubnetInfoVQ");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetSuperScopeV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong superscopename, jint changeexisting) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSuperScopeV4");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)superscopename, (int32_t)changeexisting);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)superscopename;
    (void)changeexisting;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpSetThreadOptions(JNIEnv* km_env, jclass km_clazz, jint flags, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetThreadOptions");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)reserved;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpUndoRequestParams(JNIEnv* km_env, jclass km_clazz, jint flags, jlong reserved, jlong adaptername, jlong requestidstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpUndoRequestParams");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)reserved, (void*)(uintptr_t)adaptername, (void*)(uintptr_t)requestidstr);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)flags;
    (void)reserved;
    (void)adaptername;
    (void)requestidstr;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4AddPolicyRange(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong policyname, jlong range) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4AddPolicyRange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)range);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)policyname;
    (void)range;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4CreateClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreateClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4CreateClientInfoEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreateClientInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4CreatePolicy(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong ppolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreatePolicy");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)ppolicy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)ppolicy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4CreatePolicyEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong policyex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreatePolicyEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)policyex);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)policyex;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4DeletePolicy(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fglobalpolicy, jint subnetaddress, jlong policyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4DeletePolicy");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4EnumPolicies(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jint fglobalpolicy, jint subnetaddress, jlong enuminfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumPolicies");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)enuminfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4EnumPoliciesEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jint globalpolicy, jint subnetaddress, jlong enuminfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumPoliciesEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (int32_t)globalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)enuminfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4EnumSubnetClients(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumSubnetClients");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4EnumSubnetClientsEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumSubnetClientsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4EnumSubnetReservations(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong enumelementinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumSubnetReservations");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enumelementinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverAddScopeToRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverAddScopeToRelationship");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationship);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)prelationship;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverCreateRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverCreateRelationship");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationship);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)prelationship;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverDeleteRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationshipname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverDeleteRelationship");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationshipname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)prelationshipname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverDeleteScopeFromRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverDeleteScopeFromRelationship");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationship);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)prelationship;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverEnumRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jlong prelationship, jlong relationshipread, jlong relationshiptotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverEnumRelationship");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)prelationship, (void*)(uintptr_t)relationshipread, (void*)(uintptr_t)relationshiptotal);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)prelationship;
    (void)relationshipread;
    (void)relationshiptotal;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverGetAddressStatus(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong pstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetAddressStatus");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)pstatus);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)pstatus;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverGetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverGetRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationshipname, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetRelationship");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationshipname, (void*)(uintptr_t)prelationship);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)prelationshipname;
    (void)prelationship;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverGetScopeRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint scopeid, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetScopeRelationship");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)scopeid, (void*)(uintptr_t)prelationship);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)prelationship;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverGetScopeStatistics(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint scopeid, jlong pstats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetScopeStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)scopeid, (void*)(uintptr_t)pstats);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)pstats;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverGetSystemTime(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong ptime, jlong pmaxalloweddeltatime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetSystemTime");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)ptime, (void*)(uintptr_t)pmaxalloweddeltatime);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)ptime;
    (void)pmaxalloweddeltatime;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverSetRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverSetRelationship");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)prelationship);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)prelationship;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4FailoverTriggerAddrAllocation(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong pfailrelname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverTriggerAddrAllocation");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)pfailrelname);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)pfailrelname;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4GetAllOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong scopeinfo, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetAllOptionValues");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)values);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4GetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4GetClientInfoEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetClientInfoEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4GetFreeIPAddress(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint scopeid, jint startip, jint endip, jint numfreeaddrreq, jlong ipaddrlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetFreeIPAddress");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)scopeid, (uint32_t)startip, (uint32_t)endip, (uint32_t)numfreeaddrreq, (void*)(uintptr_t)ipaddrlist);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)startip;
    (void)endip;
    (void)numfreeaddrreq;
    (void)ipaddrlist;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4GetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong policyname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetOptionValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)policyname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4GetPolicy(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fglobalpolicy, jint subnetaddress, jlong policyname, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetPolicy");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4GetPolicyEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint globalpolicy, jint subnetaddress, jlong policyname, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetPolicyEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)globalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4QueryPolicyEnforcement(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fglobalpolicy, jint subnetaddress, jlong enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4QueryPolicyEnforcement");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)enabled);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enabled;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4RemoveOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong policyname, jlong vendorname, jlong scopeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4RemoveOptionValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)policyname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4RemovePolicyRange(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong policyname, jlong range) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4RemovePolicyRange");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)range);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)policyname;
    (void)range;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4SetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong policyname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetOptionValue");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)policyname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4SetOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong policyname, jlong vendorname, jlong scopeinfo, jlong optionvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetOptionValues");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)policyname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalues);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)flags;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalues;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4SetPolicy(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldsmodified, jint fglobalpolicy, jint subnetaddress, jlong policyname, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetPolicy");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldsmodified, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)fieldsmodified;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4SetPolicyEnforcement(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fglobalpolicy, jint subnetaddress, jint enable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetPolicyEnforcement");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (int32_t)enable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV4SetPolicyEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldsmodified, jint globalpolicy, jint subnetaddress, jlong policyname, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetPolicyEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldsmodified, (int32_t)globalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)policy);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)fieldsmodified;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV6CreateClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV6CreateClientInfo");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)clientinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpV6GetStatelessStatistics(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong statelessstats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV6GetStatelessStatistics");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)statelessstats);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)serveripaddress;
    (void)statelessstats;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpv6CApiCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6CApiCleanup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpv6CApiInitialize(JNIEnv* km_env, jclass km_clazz, jlong version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6CApiInitialize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)version);
    } else {
        errno = ENOSYS;
    }
#else
    (void)version;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpv6ReleasePrefix(JNIEnv* km_env, jclass km_clazz, jlong adaptername, jlong classid, jlong leaseinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6ReleasePrefix");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)adaptername, (void*)(uintptr_t)classid, (void*)(uintptr_t)leaseinfo);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)adaptername;
    (void)classid;
    (void)leaseinfo;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpv6RenewPrefix(JNIEnv* km_env, jclass km_clazz, jlong adaptername, jlong pclassid, jlong prefixleaseinfo, jlong pdwtimetowait, jint bvalidateprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6RenewPrefix");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)adaptername, (void*)(uintptr_t)pclassid, (void*)(uintptr_t)prefixleaseinfo, (void*)(uintptr_t)pdwtimetowait, (uint32_t)bvalidateprefix);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)adaptername;
    (void)pclassid;
    (void)prefixleaseinfo;
    (void)pdwtimetowait;
    (void)bvalidateprefix;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1dhcpv6RequestPrefix(JNIEnv* km_env, jclass km_clazz, jlong adaptername, jlong pclassid, jlong prefixleaseinfo, jlong pdwtimetowait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6RequestPrefix");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)adaptername, (void*)(uintptr_t)pclassid, (void*)(uintptr_t)prefixleaseinfo, (void*)(uintptr_t)pdwtimetowait);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)adaptername;
    (void)pclassid;
    (void)prefixleaseinfo;
    (void)pdwtimetowait;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

