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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpAddFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong addfilterinfo, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddFilterV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)addfilterinfo, (int32_t)forceflag) : 0;
#else
    (void)serveripaddress;
    (void)addfilterinfo;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpAddSecurityGroup(JNIEnv* km_env, jclass km_clazz, jlong pserver) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSecurityGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pserver) : 0;
#else
    (void)pserver;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpAddServer(JNIEnv* km_env, jclass km_clazz, jint flags, jlong idinfo, jlong newserver, jlong callbackfn, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddServer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)idinfo, (void*)(uintptr_t)newserver, (void*)(uintptr_t)callbackfn, (void*)(uintptr_t)callbackdata) : 0;
#else
    (void)flags;
    (void)idinfo;
    (void)newserver;
    (void)callbackfn;
    (void)callbackdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpAddSubnetElement(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong addelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSubnetElement");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)addelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpAddSubnetElementV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong addelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSubnetElementV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)addelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpAddSubnetElementV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong addelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAddSubnetElementV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)addelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)addelementinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpAuditLogGetParams(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong auditlogdir, jlong diskcheckinterval, jlong maxlogfilessize, jlong minspaceondisk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAuditLogGetParams");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)auditlogdir, (void*)(uintptr_t)diskcheckinterval, (void*)(uintptr_t)maxlogfilessize, (void*)(uintptr_t)minspaceondisk) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)auditlogdir;
    (void)diskcheckinterval;
    (void)maxlogfilessize;
    (void)minspaceondisk;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpAuditLogSetParams(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong auditlogdir, jint diskcheckinterval, jint maxlogfilessize, jint minspaceondisk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpAuditLogSetParams");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)auditlogdir, (uint32_t)diskcheckinterval, (uint32_t)maxlogfilessize, (uint32_t)minspaceondisk) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)auditlogdir;
    (void)diskcheckinterval;
    (void)maxlogfilessize;
    (void)minspaceondisk;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCApiCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCApiCleanup");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCApiInitialize(JNIEnv* km_env, jclass km_clazz, jlong version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCApiInitialize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)version) : 0;
#else
    (void)version;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateClass(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClass");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateClassV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClassV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateClientInfoV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClientInfoV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateClientInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateClientInfoVQ");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateOption(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateOption");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateOptionV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateOptionV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateOptionV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateOptionV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateSubnet(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateSubnet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpCreateSubnetVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpCreateSubnetVQ");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDeRegisterParamChange(JNIEnv* km_env, jclass km_clazz, jint flags, jlong reserved, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeRegisterParamChange");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)reserved, (void*)(uintptr_t)event) : 0;
#else
    (void)flags;
    (void)reserved;
    (void)event;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDeleteClass(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClass");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classname) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDeleteClassV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClassV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classname) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDeleteClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDeleteClientInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteClientInfoV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDeleteFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong deletefilterinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteFilterV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)deletefilterinfo) : 0;
#else
    (void)serveripaddress;
    (void)deletefilterinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDeleteServer(JNIEnv* km_env, jclass km_clazz, jint flags, jlong idinfo, jlong newserver, jlong callbackfn, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteServer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)idinfo, (void*)(uintptr_t)newserver, (void*)(uintptr_t)callbackfn, (void*)(uintptr_t)callbackdata) : 0;
#else
    (void)flags;
    (void)idinfo;
    (void)newserver;
    (void)callbackfn;
    (void)callbackdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDeleteSubnet(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteSubnet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (int32_t)forceflag) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDeleteSuperScopeV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong superscopename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDeleteSuperScopeV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)superscopename) : 0;
#else
    (void)serveripaddress;
    (void)superscopename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDsCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDsCleanup");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpDsInit(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpDsInit");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumClasses(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong resumehandle, jint preferredmaximum, jlong classinfoarray, jlong nread, jlong ntotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumClasses");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)classinfoarray, (void*)(uintptr_t)nread, (void*)(uintptr_t)ntotal) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)classinfoarray;
    (void)nread;
    (void)ntotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumClassesV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong resumehandle, jint preferredmaximum, jlong classinfoarray, jlong nread, jlong ntotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumClassesV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)classinfoarray, (void*)(uintptr_t)nread, (void*)(uintptr_t)ntotal) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)classinfoarray;
    (void)nread;
    (void)ntotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jint listtype, jlong enumfilterinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumFilterV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (int32_t)listtype, (void*)(uintptr_t)enumfilterinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)listtype;
    (void)enumfilterinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong scopeinfo, jlong resumehandle, jint preferredmaximum, jlong optionvalues, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionValues");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)optionvalues, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal) : 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)optionvalues;
    (void)optionsread;
    (void)optionstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumOptionValuesV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong scopeinfo, jlong resumehandle, jint preferredmaximum, jlong optionvalues, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionValuesV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)optionvalues, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumOptionValuesV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong scopeinfo, jlong resumehandle, jint preferredmaximum, jlong optionvalues, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionValuesV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)optionvalues, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumOptions(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jlong options, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptions");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)options, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)options;
    (void)optionsread;
    (void)optionstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumOptionsV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong resumehandle, jint preferredmaximum, jlong options, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionsV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)options, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumOptionsV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong resumehandle, jint preferredmaximum, jlong options, jlong optionsread, jlong optionstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumOptionsV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)options, (void*)(uintptr_t)optionsread, (void*)(uintptr_t)optionstotal) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumServers(JNIEnv* km_env, jclass km_clazz, jint flags, jlong idinfo, jlong servers, jlong callbackfn, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumServers");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)idinfo, (void*)(uintptr_t)servers, (void*)(uintptr_t)callbackfn, (void*)(uintptr_t)callbackdata) : 0;
#else
    (void)flags;
    (void)idinfo;
    (void)servers;
    (void)callbackfn;
    (void)callbackdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnetClients(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClients");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnetClientsFilterStatusInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsFilterStatusInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnetClientsV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnetClientsV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnetClientsVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetClientsVQ");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnetElements(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint enumelementtype, jlong resumehandle, jint preferredmaximum, jlong enumelementinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetElements");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (int32_t)enumelementtype, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enumelementinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnetElementsV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint enumelementtype, jlong resumehandle, jint preferredmaximum, jlong enumelementinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetElementsV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (int32_t)enumelementtype, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enumelementinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnetElementsV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint enumelementtype, jlong resumehandle, jint preferredmaximum, jlong enumelementinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetElementsV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (int32_t)enumelementtype, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enumelementinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)enumelementtype;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnets(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jlong enuminfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnets");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enuminfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpEnumSubnetsV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jlong enuminfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpEnumSubnetsV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enuminfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetAllOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong scopeinfo, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptionValues");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)values) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetAllOptionValuesV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong scopeinfo, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptionValuesV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)values) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetAllOptions(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong optionstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptions");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)optionstruct) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionstruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetAllOptionsV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong optionstruct) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetAllOptionsV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)optionstruct) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionstruct;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetClassInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong partialclassinfo, jlong filledclassinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClassInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)partialclassinfo, (void*)(uintptr_t)filledclassinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)partialclassinfo;
    (void)filledclassinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetClientInfoV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfoV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetClientInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfoV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetClientInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientInfoVQ");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetClientOptions(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint clientipaddress, jint clientsubnetmask, jlong clientoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetClientOptions");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)clientipaddress, (uint32_t)clientsubnetmask, (void*)(uintptr_t)clientoptions) : 0;
#else
    (void)serveripaddress;
    (void)clientipaddress;
    (void)clientsubnetmask;
    (void)clientoptions;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong globalfilterinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetFilterV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)globalfilterinfo) : 0;
#else
    (void)serveripaddress;
    (void)globalfilterinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetMibInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong mibinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetMibInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)mibinfo) : 0;
#else
    (void)serveripaddress;
    (void)mibinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetMibInfoV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong mibinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetMibInfoV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)mibinfo) : 0;
#else
    (void)serveripaddress;
    (void)mibinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetMibInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong mibinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetMibInfoV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)mibinfo) : 0;
#else
    (void)serveripaddress;
    (void)mibinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetOptionInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetOptionInfoV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionInfoV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetOptionInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionInfoV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetOptionValueV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionValueV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetOptionValueV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOptionValueV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetOriginalSubnetMask(JNIEnv* km_env, jclass km_clazz, jlong sadaptername, jlong dwsubnetmask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetOriginalSubnetMask");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sadaptername, (void*)(uintptr_t)dwsubnetmask) : 0;
#else
    (void)sadaptername;
    (void)dwsubnetmask;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetServerBindingInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong bindelementsinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetServerBindingInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)bindelementsinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementsinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetServerBindingInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong bindelementsinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetServerBindingInfoV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)bindelementsinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementsinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetServerSpecificStrings(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong serverspecificstrings) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetServerSpecificStrings");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)serverspecificstrings) : 0;
#else
    (void)serveripaddress;
    (void)serverspecificstrings;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetSubnetDelayOffer(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong timedelayinmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSubnetDelayOffer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)timedelayinmilliseconds) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)timedelayinmilliseconds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetSubnetInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSubnetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetSubnetInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSubnetInfoVQ");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetSuperScopeInfoV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong superscopetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetSuperScopeInfoV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)superscopetable) : 0;
#else
    (void)serveripaddress;
    (void)superscopetable;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetThreadOptions(JNIEnv* km_env, jclass km_clazz, jlong pflags, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetThreadOptions");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pflags, (void*)(uintptr_t)reserved) : 0;
#else
    (void)pflags;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpGetVersion(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong majorversion, jlong minorversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpGetVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)majorversion, (void*)(uintptr_t)minorversion) : 0;
#else
    (void)serveripaddress;
    (void)majorversion;
    (void)minorversion;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprAddV4PolicyCondition(JNIEnv* km_env, jclass km_clazz, jlong policy, jint parentexpr, jint type, jint optionid, jint suboptionid, jlong vendorname, jint arg_6_operator, jlong value, jint valuelength, jlong conditionindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, uint32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyCondition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)policy, (uint32_t)parentexpr, (int32_t)type, (uint32_t)optionid, (uint32_t)suboptionid, (void*)(uintptr_t)vendorname, (int32_t)arg_6_operator, (void*)(uintptr_t)value, (uint32_t)valuelength, (void*)(uintptr_t)conditionindex) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprAddV4PolicyExpr(JNIEnv* km_env, jclass km_clazz, jlong policy, jint parentexpr, jint arg_2_operator, jlong exprindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyExpr");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)policy, (uint32_t)parentexpr, (int32_t)arg_2_operator, (void*)(uintptr_t)exprindex) : 0;
#else
    (void)policy;
    (void)parentexpr;
    (void)arg_2_operator;
    (void)exprindex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprAddV4PolicyRange(JNIEnv* km_env, jclass km_clazz, jlong policy, jlong range) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprAddV4PolicyRange");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)policy, (void*)(uintptr_t)range) : 0;
#else
    (void)policy;
    (void)range;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprCreateV4Policy(JNIEnv* km_env, jclass km_clazz, jlong policyname, jint fglobalpolicy, jint subnet, jint processingorder, jint rootoperator, jlong description, jint enabled, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprCreateV4Policy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)policyname, (int32_t)fglobalpolicy, (uint32_t)subnet, (uint32_t)processingorder, (int32_t)rootoperator, (void*)(uintptr_t)description, (int32_t)enabled, (void*)(uintptr_t)policy) : 0;
#else
    (void)policyname;
    (void)fglobalpolicy;
    (void)subnet;
    (void)processingorder;
    (void)rootoperator;
    (void)description;
    (void)enabled;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprCreateV4PolicyEx(JNIEnv* km_env, jclass km_clazz, jlong policyname, jint fglobalpolicy, jint subnet, jint processingorder, jint rootoperator, jlong description, jint enabled, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprCreateV4PolicyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)policyname, (int32_t)fglobalpolicy, (uint32_t)subnet, (uint32_t)processingorder, (int32_t)rootoperator, (void*)(uintptr_t)description, (int32_t)enabled, (void*)(uintptr_t)policy) : 0;
#else
    (void)policyname;
    (void)fglobalpolicy;
    (void)subnet;
    (void)processingorder;
    (void)rootoperator;
    (void)description;
    (void)enabled;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprFindV4DhcpProperty(JNIEnv* km_env, jclass km_clazz, jlong propertyarray, jint id, jint type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFindV4DhcpProperty");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propertyarray, (int32_t)id, (int32_t)type) : NULL;
#else
    (void)propertyarray;
    (void)id;
    (void)type;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprFreeV4DhcpProperty(JNIEnv* km_env, jclass km_clazz, jlong property) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4DhcpProperty");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)property);
#else
    (void)property;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprFreeV4DhcpPropertyArray(JNIEnv* km_env, jclass km_clazz, jlong propertyarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4DhcpPropertyArray");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)propertyarray);
#else
    (void)propertyarray;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprFreeV4Policy(JNIEnv* km_env, jclass km_clazz, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4Policy");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)policy);
#else
    (void)policy;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprFreeV4PolicyArray(JNIEnv* km_env, jclass km_clazz, jlong policyarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyArray");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)policyarray);
#else
    (void)policyarray;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprFreeV4PolicyEx(JNIEnv* km_env, jclass km_clazz, jlong policyex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)policyex);
#else
    (void)policyex;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprFreeV4PolicyExArray(JNIEnv* km_env, jclass km_clazz, jlong policyexarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprFreeV4PolicyExArray");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)policyexarray);
#else
    (void)policyexarray;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprIsV4PolicySingleUC(JNIEnv* km_env, jclass km_clazz, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicySingleUC");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)policy) : -1;
#else
    (void)policy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprIsV4PolicyValid(JNIEnv* km_env, jclass km_clazz, jlong ppolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicyValid");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppolicy) : 0;
#else
    (void)ppolicy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprIsV4PolicyWellFormed(JNIEnv* km_env, jclass km_clazz, jlong ppolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprIsV4PolicyWellFormed");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppolicy) : -1;
#else
    (void)ppolicy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprModifyV4PolicyExpr(JNIEnv* km_env, jclass km_clazz, jlong policy, jint arg_1_operator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprModifyV4PolicyExpr");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)policy, (int32_t)arg_1_operator) : 0;
#else
    (void)policy;
    (void)arg_1_operator;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpHlprResetV4PolicyExpr(JNIEnv* km_env, jclass km_clazz, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpHlprResetV4PolicyExpr");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)policy) : 0;
#else
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpModifyClass(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpModifyClass");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpModifyClassV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint reservedmustbezero, jlong classinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpModifyClassV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)reservedmustbezero, (void*)(uintptr_t)classinfo) : 0;
#else
    (void)serveripaddress;
    (void)reservedmustbezero;
    (void)classinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveDNSRegistrations(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveDNSRegistrations");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveOption(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOption");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveOptionV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveOptionV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong scopeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)scopeinfo) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveOptionValueV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionValueV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveOptionValueV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveOptionValueV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveSubnetElement(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong removeelementinfo, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveSubnetElement");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)removeelementinfo, (int32_t)forceflag) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveSubnetElementV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong removeelementinfo, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveSubnetElementV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)removeelementinfo, (int32_t)forceflag) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRemoveSubnetElementV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong removeelementinfo, jint forceflag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRemoveSubnetElementV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)removeelementinfo, (int32_t)forceflag) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)removeelementinfo;
    (void)forceflag;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpRpcFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong bufferpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpRpcFreeMemory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bufferpointer);
#else
    (void)bufferpointer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpScanDatabase(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jint fixflag, jlong scanlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpScanDatabase");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (uint32_t)fixflag, (void*)(uintptr_t)scanlist) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)fixflag;
    (void)scanlist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerAuditlogParamsFree(JNIEnv* km_env, jclass km_clazz, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerAuditlogParamsFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)configinfo);
#else
    (void)configinfo;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerBackupDatabase(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerBackupDatabase");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)path) : 0;
#else
    (void)serveripaddress;
    (void)path;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerGetConfig(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfig");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)configinfo) : 0;
#else
    (void)serveripaddress;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerGetConfigV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfigV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)configinfo) : 0;
#else
    (void)serveripaddress;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerGetConfigV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong scopeinfo, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfigV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)configinfo) : 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerGetConfigVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerGetConfigVQ");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)configinfo) : 0;
#else
    (void)serveripaddress;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerQueryAttribute(JNIEnv* km_env, jclass km_clazz, jlong serveripaddr, jint dwreserved, jint dhcpattribid, jlong pdhcpattrib) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerQueryAttribute");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddr, (uint32_t)dwreserved, (uint32_t)dhcpattribid, (void*)(uintptr_t)pdhcpattrib) : 0;
#else
    (void)serveripaddr;
    (void)dwreserved;
    (void)dhcpattribid;
    (void)pdhcpattrib;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerQueryAttributes(JNIEnv* km_env, jclass km_clazz, jlong serveripaddr, jint dwreserved, jint dwattribcount, jlong pdhcpattribs, jlong pdhcpattribarr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerQueryAttributes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddr, (uint32_t)dwreserved, (uint32_t)dwattribcount, (void*)(uintptr_t)pdhcpattribs, (void*)(uintptr_t)pdhcpattribarr) : 0;
#else
    (void)serveripaddr;
    (void)dwreserved;
    (void)dwattribcount;
    (void)pdhcpattribs;
    (void)pdhcpattribarr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerQueryDnsRegCredentials(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint unamesize, jlong uname, jint domainsize, jlong domain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerQueryDnsRegCredentials");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)unamesize, (void*)(uintptr_t)uname, (uint32_t)domainsize, (void*)(uintptr_t)domain) : 0;
#else
    (void)serveripaddress;
    (void)unamesize;
    (void)uname;
    (void)domainsize;
    (void)domain;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerRedoAuthorization(JNIEnv* km_env, jclass km_clazz, jlong serveripaddr, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerRedoAuthorization");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddr, (uint32_t)dwreserved) : 0;
#else
    (void)serveripaddr;
    (void)dwreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerRestoreDatabase(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong path) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerRestoreDatabase");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)path) : 0;
#else
    (void)serveripaddress;
    (void)path;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerSetConfig(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldstoset, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfig");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldstoset, (void*)(uintptr_t)configinfo) : 0;
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerSetConfigV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldstoset, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfigV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldstoset, (void*)(uintptr_t)configinfo) : 0;
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerSetConfigV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong scopeinfo, jint fieldstoset, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfigV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)scopeinfo, (uint32_t)fieldstoset, (void*)(uintptr_t)configinfo) : 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)fieldstoset;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerSetConfigVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldstoset, jlong configinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetConfigVQ");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldstoset, (void*)(uintptr_t)configinfo) : 0;
#else
    (void)serveripaddress;
    (void)fieldstoset;
    (void)configinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerSetDnsRegCredentials(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong uname, jlong domain, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetDnsRegCredentials");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)uname, (void*)(uintptr_t)domain, (void*)(uintptr_t)passwd) : 0;
#else
    (void)serveripaddress;
    (void)uname;
    (void)domain;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpServerSetDnsRegCredentialsV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong uname, jlong domain, jlong passwd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpServerSetDnsRegCredentialsV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)uname, (void*)(uintptr_t)domain, (void*)(uintptr_t)passwd) : 0;
#else
    (void)serveripaddress;
    (void)uname;
    (void)domain;
    (void)passwd;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetClientInfoV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfoV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetClientInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfoV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetClientInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetClientInfoVQ");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetFilterV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong globalfilterinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetFilterV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)globalfilterinfo) : 0;
#else
    (void)serveripaddress;
    (void)globalfilterinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetOptionInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetOptionInfoV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionInfoV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetOptionInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong optioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionInfoV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)optioninfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)optioninfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint optionid, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)optionid, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)optionid;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetOptionValueV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValueV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetOptionValueV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValueV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong scopeinfo, jlong optionvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValues");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalues) : 0;
#else
    (void)serveripaddress;
    (void)scopeinfo;
    (void)optionvalues;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetOptionValuesV5(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong classname, jlong vendorname, jlong scopeinfo, jlong optionvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetOptionValuesV5");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)classname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalues) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)classname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalues;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetServerBindingInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong bindelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetServerBindingInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)bindelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetServerBindingInfoV6(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong bindelementinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetServerBindingInfoV6");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)bindelementinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)bindelementinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetSubnetDelayOffer(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jshort timedelayinmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSubnetDelayOffer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (uint16_t)timedelayinmilliseconds) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)timedelayinmilliseconds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetSubnetInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSubnetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetSubnetInfoVQ(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong subnetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSubnetInfoVQ");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)subnetinfo) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)subnetinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetSuperScopeV4(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong superscopename, jint changeexisting) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetSuperScopeV4");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)superscopename, (int32_t)changeexisting) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)superscopename;
    (void)changeexisting;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpSetThreadOptions(JNIEnv* km_env, jclass km_clazz, jint flags, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpSetThreadOptions");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)reserved) : 0;
#else
    (void)flags;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpUndoRequestParams(JNIEnv* km_env, jclass km_clazz, jint flags, jlong reserved, jlong adaptername, jlong requestidstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpUndoRequestParams");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)reserved, (void*)(uintptr_t)adaptername, (void*)(uintptr_t)requestidstr) : 0;
#else
    (void)flags;
    (void)reserved;
    (void)adaptername;
    (void)requestidstr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4AddPolicyRange(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong policyname, jlong range) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4AddPolicyRange");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)range) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)policyname;
    (void)range;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4CreateClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreateClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4CreateClientInfoEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreateClientInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4CreatePolicy(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong ppolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreatePolicy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)ppolicy) : 0;
#else
    (void)serveripaddress;
    (void)ppolicy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4CreatePolicyEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong policyex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4CreatePolicyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)policyex) : 0;
#else
    (void)serveripaddress;
    (void)policyex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4DeletePolicy(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fglobalpolicy, jint subnetaddress, jlong policyname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4DeletePolicy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname) : 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4EnumPolicies(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jint fglobalpolicy, jint subnetaddress, jlong enuminfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumPolicies");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)enuminfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4EnumPoliciesEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jint globalpolicy, jint subnetaddress, jlong enuminfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumPoliciesEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (int32_t)globalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)enuminfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)enuminfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4EnumSubnetClients(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumSubnetClients");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4EnumSubnetClientsEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong clientinfo, jlong clientsread, jlong clientstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumSubnetClientsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)clientinfo, (void*)(uintptr_t)clientsread, (void*)(uintptr_t)clientstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)clientinfo;
    (void)clientsread;
    (void)clientstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4EnumSubnetReservations(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong resumehandle, jint preferredmaximum, jlong enumelementinfo, jlong elementsread, jlong elementstotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4EnumSubnetReservations");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)enumelementinfo, (void*)(uintptr_t)elementsread, (void*)(uintptr_t)elementstotal) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)enumelementinfo;
    (void)elementsread;
    (void)elementstotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverAddScopeToRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverAddScopeToRelationship");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationship) : 0;
#else
    (void)serveripaddress;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverCreateRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverCreateRelationship");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationship) : 0;
#else
    (void)serveripaddress;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverDeleteRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationshipname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverDeleteRelationship");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationshipname) : 0;
#else
    (void)serveripaddress;
    (void)prelationshipname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverDeleteScopeFromRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverDeleteScopeFromRelationship");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationship) : 0;
#else
    (void)serveripaddress;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverEnumRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong resumehandle, jint preferredmaximum, jlong prelationship, jlong relationshipread, jlong relationshiptotal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverEnumRelationship");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)resumehandle, (uint32_t)preferredmaximum, (void*)(uintptr_t)prelationship, (void*)(uintptr_t)relationshipread, (void*)(uintptr_t)relationshiptotal) : 0;
#else
    (void)serveripaddress;
    (void)resumehandle;
    (void)preferredmaximum;
    (void)prelationship;
    (void)relationshipread;
    (void)relationshiptotal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverGetAddressStatus(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong pstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetAddressStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)pstatus) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)pstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverGetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverGetRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong prelationshipname, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetRelationship");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)prelationshipname, (void*)(uintptr_t)prelationship) : 0;
#else
    (void)serveripaddress;
    (void)prelationshipname;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverGetScopeRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint scopeid, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetScopeRelationship");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)scopeid, (void*)(uintptr_t)prelationship) : 0;
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverGetScopeStatistics(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint scopeid, jlong pstats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetScopeStatistics");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)scopeid, (void*)(uintptr_t)pstats) : 0;
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)pstats;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverGetSystemTime(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong ptime, jlong pmaxalloweddeltatime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverGetSystemTime");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)ptime, (void*)(uintptr_t)pmaxalloweddeltatime) : 0;
#else
    (void)serveripaddress;
    (void)ptime;
    (void)pmaxalloweddeltatime;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverSetRelationship(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong prelationship) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverSetRelationship");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)prelationship) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)prelationship;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4FailoverTriggerAddrAllocation(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong pfailrelname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4FailoverTriggerAddrAllocation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)pfailrelname) : 0;
#else
    (void)serveripaddress;
    (void)pfailrelname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4GetAllOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong scopeinfo, jlong values) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetAllOptionValues");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)values) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)scopeinfo;
    (void)values;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4GetClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4GetClientInfoEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong searchinfo, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetClientInfoEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)searchinfo, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)searchinfo;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4GetFreeIPAddress(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint scopeid, jint startip, jint endip, jint numfreeaddrreq, jlong ipaddrlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetFreeIPAddress");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)scopeid, (uint32_t)startip, (uint32_t)endip, (uint32_t)numfreeaddrreq, (void*)(uintptr_t)ipaddrlist) : 0;
#else
    (void)serveripaddress;
    (void)scopeid;
    (void)startip;
    (void)endip;
    (void)numfreeaddrreq;
    (void)ipaddrlist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4GetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong policyname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)policyname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4GetPolicy(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fglobalpolicy, jint subnetaddress, jlong policyname, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetPolicy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)policy) : 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4GetPolicyEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint globalpolicy, jint subnetaddress, jlong policyname, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4GetPolicyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)globalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)policy) : 0;
#else
    (void)serveripaddress;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4QueryPolicyEnforcement(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fglobalpolicy, jint subnetaddress, jlong enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4QueryPolicyEnforcement");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)enabled) : 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enabled;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4RemoveOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong policyname, jlong vendorname, jlong scopeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4RemoveOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)policyname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4RemovePolicyRange(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint subnetaddress, jlong policyname, jlong range) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4RemovePolicyRange");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)range) : 0;
#else
    (void)serveripaddress;
    (void)subnetaddress;
    (void)policyname;
    (void)range;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4SetOptionValue(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jint optionid, jlong policyname, jlong vendorname, jlong scopeinfo, jlong optionvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetOptionValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (uint32_t)optionid, (void*)(uintptr_t)policyname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalue) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)optionid;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4SetOptionValues(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint flags, jlong policyname, jlong vendorname, jlong scopeinfo, jlong optionvalues) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetOptionValues");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)flags, (void*)(uintptr_t)policyname, (void*)(uintptr_t)vendorname, (void*)(uintptr_t)scopeinfo, (void*)(uintptr_t)optionvalues) : 0;
#else
    (void)serveripaddress;
    (void)flags;
    (void)policyname;
    (void)vendorname;
    (void)scopeinfo;
    (void)optionvalues;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4SetPolicy(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldsmodified, jint fglobalpolicy, jint subnetaddress, jlong policyname, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetPolicy");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldsmodified, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)policy) : 0;
#else
    (void)serveripaddress;
    (void)fieldsmodified;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4SetPolicyEnforcement(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fglobalpolicy, jint subnetaddress, jint enable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetPolicyEnforcement");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (int32_t)fglobalpolicy, (uint32_t)subnetaddress, (int32_t)enable) : 0;
#else
    (void)serveripaddress;
    (void)fglobalpolicy;
    (void)subnetaddress;
    (void)enable;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV4SetPolicyEx(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jint fieldsmodified, jint globalpolicy, jint subnetaddress, jlong policyname, jlong policy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV4SetPolicyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (uint32_t)fieldsmodified, (int32_t)globalpolicy, (uint32_t)subnetaddress, (void*)(uintptr_t)policyname, (void*)(uintptr_t)policy) : 0;
#else
    (void)serveripaddress;
    (void)fieldsmodified;
    (void)globalpolicy;
    (void)subnetaddress;
    (void)policyname;
    (void)policy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV6CreateClientInfo(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong clientinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV6CreateClientInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)clientinfo) : 0;
#else
    (void)serveripaddress;
    (void)clientinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1DhcpV6GetStatelessStatistics(JNIEnv* km_env, jclass km_clazz, jlong serveripaddress, jlong statelessstats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpsapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DhcpV6GetStatelessStatistics");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serveripaddress, (void*)(uintptr_t)statelessstats) : 0;
#else
    (void)serveripaddress;
    (void)statelessstats;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1Dhcpv6CApiCleanup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6CApiCleanup");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1Dhcpv6CApiInitialize(JNIEnv* km_env, jclass km_clazz, jlong version) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6CApiInitialize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)version);
#else
    (void)version;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1Dhcpv6ReleasePrefix(JNIEnv* km_env, jclass km_clazz, jlong adaptername, jlong classid, jlong leaseinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6ReleasePrefix");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)adaptername, (void*)(uintptr_t)classid, (void*)(uintptr_t)leaseinfo) : 0;
#else
    (void)adaptername;
    (void)classid;
    (void)leaseinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1Dhcpv6RenewPrefix(JNIEnv* km_env, jclass km_clazz, jlong adaptername, jlong pclassid, jlong prefixleaseinfo, jlong pdwtimetowait, jint bvalidateprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6RenewPrefix");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)adaptername, (void*)(uintptr_t)pclassid, (void*)(uintptr_t)prefixleaseinfo, (void*)(uintptr_t)pdwtimetowait, (uint32_t)bvalidateprefix) : 0;
#else
    (void)adaptername;
    (void)pclassid;
    (void)prefixleaseinfo;
    (void)pdwtimetowait;
    (void)bvalidateprefix;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networkmanagement_dhcp_WindowsWin32NetworkmanagementDhcpJniBridge_windowssys_1windows_1win32_1networkmanagement_1dhcp_1Dhcpv6RequestPrefix(JNIEnv* km_env, jclass km_clazz, jlong adaptername, jlong pclassid, jlong prefixleaseinfo, jlong pdwtimetowait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dhcpcsvc6.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Dhcpv6RequestPrefix");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)adaptername, (void*)(uintptr_t)pclassid, (void*)(uintptr_t)prefixleaseinfo, (void*)(uintptr_t)pdwtimetowait) : 0;
#else
    (void)adaptername;
    (void)pclassid;
    (void)prefixleaseinfo;
    (void)pdwtimetowait;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

