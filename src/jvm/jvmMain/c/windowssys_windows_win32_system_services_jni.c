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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesChangeServiceConfig2A(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwinfolevel, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfig2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesChangeServiceConfig2W(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwinfolevel, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfig2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesChangeServiceConfigA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwservicetype, jint dwstarttype, jint dwerrorcontrol, jlong lpbinarypathname, jlong lploadordergroup, jlong lpdwtagid, jlong lpdependencies, jlong lpservicestartname, jlong lppassword, jlong lpdisplayname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfigA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwservicetype, (uint32_t)dwstarttype, (uint32_t)dwerrorcontrol, (void*)(uintptr_t)lpbinarypathname, (void*)(uintptr_t)lploadordergroup, (void*)(uintptr_t)lpdwtagid, (void*)(uintptr_t)lpdependencies, (void*)(uintptr_t)lpservicestartname, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpdisplayname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwservicetype;
    (void)dwstarttype;
    (void)dwerrorcontrol;
    (void)lpbinarypathname;
    (void)lploadordergroup;
    (void)lpdwtagid;
    (void)lpdependencies;
    (void)lpservicestartname;
    (void)lppassword;
    (void)lpdisplayname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesChangeServiceConfigW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwservicetype, jint dwstarttype, jint dwerrorcontrol, jlong lpbinarypathname, jlong lploadordergroup, jlong lpdwtagid, jlong lpdependencies, jlong lpservicestartname, jlong lppassword, jlong lpdisplayname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfigW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwservicetype, (uint32_t)dwstarttype, (uint32_t)dwerrorcontrol, (void*)(uintptr_t)lpbinarypathname, (void*)(uintptr_t)lploadordergroup, (void*)(uintptr_t)lpdwtagid, (void*)(uintptr_t)lpdependencies, (void*)(uintptr_t)lpservicestartname, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpdisplayname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwservicetype;
    (void)dwstarttype;
    (void)dwerrorcontrol;
    (void)lpbinarypathname;
    (void)lploadordergroup;
    (void)lpdwtagid;
    (void)lpdependencies;
    (void)lpservicestartname;
    (void)lppassword;
    (void)lpdisplayname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesCloseServiceHandle(JNIEnv* km_env, jclass km_clazz, jlong hscobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseServiceHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesControlService(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwcontrol, jlong lpservicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ControlService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwcontrol, (void*)(uintptr_t)lpservicestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwcontrol;
    (void)lpservicestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesControlServiceExA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwcontrol, jint dwinfolevel, jlong pcontrolparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ControlServiceExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwcontrol, (uint32_t)dwinfolevel, (void*)(uintptr_t)pcontrolparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwcontrol;
    (void)dwinfolevel;
    (void)pcontrolparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesControlServiceExW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwcontrol, jint dwinfolevel, jlong pcontrolparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ControlServiceExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwcontrol, (uint32_t)dwinfolevel, (void*)(uintptr_t)pcontrolparams);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwcontrol;
    (void)dwinfolevel;
    (void)pcontrolparams;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesCreateServiceA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jlong lpdisplayname, jint dwdesiredaccess, jint dwservicetype, jint dwstarttype, jint dwerrorcontrol, jlong lpbinarypathname, jlong lploadordergroup, jlong lpdwtagid, jlong lpdependencies, jlong lpservicestartname, jlong lppassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateServiceA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpdisplayname, (uint32_t)dwdesiredaccess, (uint32_t)dwservicetype, (uint32_t)dwstarttype, (uint32_t)dwerrorcontrol, (void*)(uintptr_t)lpbinarypathname, (void*)(uintptr_t)lploadordergroup, (void*)(uintptr_t)lpdwtagid, (void*)(uintptr_t)lpdependencies, (void*)(uintptr_t)lpservicestartname, (void*)(uintptr_t)lppassword);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)dwdesiredaccess;
    (void)dwservicetype;
    (void)dwstarttype;
    (void)dwerrorcontrol;
    (void)lpbinarypathname;
    (void)lploadordergroup;
    (void)lpdwtagid;
    (void)lpdependencies;
    (void)lpservicestartname;
    (void)lppassword;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesCreateServiceW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jlong lpdisplayname, jint dwdesiredaccess, jint dwservicetype, jint dwstarttype, jint dwerrorcontrol, jlong lpbinarypathname, jlong lploadordergroup, jlong lpdwtagid, jlong lpdependencies, jlong lpservicestartname, jlong lppassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateServiceW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpdisplayname, (uint32_t)dwdesiredaccess, (uint32_t)dwservicetype, (uint32_t)dwstarttype, (uint32_t)dwerrorcontrol, (void*)(uintptr_t)lpbinarypathname, (void*)(uintptr_t)lploadordergroup, (void*)(uintptr_t)lpdwtagid, (void*)(uintptr_t)lpdependencies, (void*)(uintptr_t)lpservicestartname, (void*)(uintptr_t)lppassword);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)dwdesiredaccess;
    (void)dwservicetype;
    (void)dwstarttype;
    (void)dwerrorcontrol;
    (void)lpbinarypathname;
    (void)lploadordergroup;
    (void)lpdwtagid;
    (void)lpdependencies;
    (void)lpservicestartname;
    (void)lppassword;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesDeleteService(JNIEnv* km_env, jclass km_clazz, jlong hservice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteService");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesEnumDependentServicesA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDependentServicesA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesEnumDependentServicesW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDependentServicesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesEnumServicesStatusA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jint dwservicetype, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned, jlong lpresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (uint32_t)dwservicetype, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned, (void*)(uintptr_t)lpresumehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesEnumServicesStatusExA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jint infolevel, jint dwservicetype, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned, jlong lpresumehandle, jlong pszgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (int32_t)infolevel, (uint32_t)dwservicetype, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned, (void*)(uintptr_t)lpresumehandle, (void*)(uintptr_t)pszgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)infolevel;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    (void)pszgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesEnumServicesStatusExW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jint infolevel, jint dwservicetype, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned, jlong lpresumehandle, jlong pszgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (int32_t)infolevel, (uint32_t)dwservicetype, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned, (void*)(uintptr_t)lpresumehandle, (void*)(uintptr_t)pszgroupname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)infolevel;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    (void)pszgroupname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesEnumServicesStatusW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jint dwservicetype, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned, jlong lpresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (uint32_t)dwservicetype, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned, (void*)(uintptr_t)lpresumehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesGetServiceDirectory(JNIEnv* km_env, jclass km_clazz, jlong hservicestatus, jint edirectorytype, jlong lppathbuffer, jint cchpathbufferlength, jlong lpcchrequiredbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceDirectory");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservicestatus, (int32_t)edirectorytype, (void*)(uintptr_t)lppathbuffer, (uint32_t)cchpathbufferlength, (void*)(uintptr_t)lpcchrequiredbufferlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hservicestatus;
    (void)edirectorytype;
    (void)lppathbuffer;
    (void)cchpathbufferlength;
    (void)lpcchrequiredbufferlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesGetServiceDisplayNameA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jlong lpdisplayname, jlong lpcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceDisplayNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)lpcchbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)lpcchbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesGetServiceDisplayNameW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jlong lpdisplayname, jlong lpcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceDisplayNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)lpcchbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)lpcchbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesGetServiceKeyNameA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpdisplayname, jlong lpservicename, jlong lpcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceKeyNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpcchbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)lpdisplayname;
    (void)lpservicename;
    (void)lpcchbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesGetServiceKeyNameW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpdisplayname, jlong lpservicename, jlong lpcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceKeyNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpcchbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)lpdisplayname;
    (void)lpservicename;
    (void)lpcchbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesGetServiceRegistryStateKey(JNIEnv* km_env, jclass km_clazz, jlong servicestatushandle, jint statetype, jint accessmask, jlong servicestatekey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceRegistryStateKey");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servicestatushandle, (int32_t)statetype, (uint32_t)accessmask, (void*)(uintptr_t)servicestatekey);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servicestatushandle;
    (void)statetype;
    (void)accessmask;
    (void)servicestatekey;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesGetSharedServiceDirectory(JNIEnv* km_env, jclass km_clazz, jlong servicehandle, jint directorytype, jlong pathbuffer, jint pathbufferlength, jlong requiredbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-5.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSharedServiceDirectory");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servicehandle, (int32_t)directorytype, (void*)(uintptr_t)pathbuffer, (uint32_t)pathbufferlength, (void*)(uintptr_t)requiredbufferlength);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servicehandle;
    (void)directorytype;
    (void)pathbuffer;
    (void)pathbufferlength;
    (void)requiredbufferlength;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesGetSharedServiceRegistryStateKey(JNIEnv* km_env, jclass km_clazz, jlong servicehandle, jint statetype, jint accessmask, jlong servicestatekey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-5.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSharedServiceRegistryStateKey");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servicehandle, (int32_t)statetype, (uint32_t)accessmask, (void*)(uintptr_t)servicestatekey);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)servicehandle;
    (void)statetype;
    (void)accessmask;
    (void)servicestatekey;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesLockServiceDatabase(JNIEnv* km_env, jclass km_clazz, jlong hscmanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockServiceDatabase");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hscmanager;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesNotifyBootConfigStatus(JNIEnv* km_env, jclass km_clazz, jint bootacceptable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyBootConfigStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)bootacceptable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bootacceptable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnotifymask, jlong pnotifybuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyServiceStatusChangeA");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnotifymask, (void*)(uintptr_t)pnotifybuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hservice;
    (void)dwnotifymask;
    (void)pnotifybuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesNotifyServiceStatusChangeW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnotifymask, jlong pnotifybuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyServiceStatusChangeW");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnotifymask, (void*)(uintptr_t)pnotifybuffer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hservice;
    (void)dwnotifymask;
    (void)pnotifybuffer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesOpenSCManagerA(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpdatabasename, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSCManagerA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpdatabasename, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpmachinename;
    (void)lpdatabasename;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesOpenSCManagerW(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpdatabasename, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSCManagerW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpdatabasename, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpmachinename;
    (void)lpdatabasename;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesOpenServiceA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenServiceA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesOpenServiceW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenServiceW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceConfig2A(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwinfolevel, jlong lpbuffer, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfig2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceConfig2W(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwinfolevel, jlong lpbuffer, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfig2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceConfigA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jlong lpserviceconfig, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfigA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (void*)(uintptr_t)lpserviceconfig, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)lpserviceconfig;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceConfigW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jlong lpserviceconfig, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfigW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (void*)(uintptr_t)lpserviceconfig, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)lpserviceconfig;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceDynamicInformation(JNIEnv* km_env, jclass km_clazz, jlong hservicestatus, jint dwinfolevel, jlong ppdynamicinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceDynamicInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservicestatus, (uint32_t)dwinfolevel, (void*)(uintptr_t)ppdynamicinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservicestatus;
    (void)dwinfolevel;
    (void)ppdynamicinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceLockStatusA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lplockstatus, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceLockStatusA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lplockstatus, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)lplockstatus;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceLockStatusW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lplockstatus, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceLockStatusW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lplockstatus, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hscmanager;
    (void)lplockstatus;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwsecurityinformation, jlong lpsecuritydescriptor, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwsecurityinformation, (void*)(uintptr_t)lpsecuritydescriptor, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwsecurityinformation;
    (void)lpsecuritydescriptor;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceStatus(JNIEnv* km_env, jclass km_clazz, jlong hservice, jlong lpservicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (void*)(uintptr_t)lpservicestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)lpservicestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesQueryServiceStatusEx(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint infolevel, jlong lpbuffer, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceStatusEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (int32_t)infolevel, (void*)(uintptr_t)lpbuffer, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)infolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerA(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lphandlerproc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lphandlerproc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpservicename;
    (void)lphandlerproc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExA(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lphandlerproc, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lphandlerproc, (void*)(uintptr_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpservicename;
    (void)lphandlerproc;
    (void)lpcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerExW(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lphandlerproc, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lphandlerproc, (void*)(uintptr_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpservicename;
    (void)lphandlerproc;
    (void)lpcontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesRegisterServiceCtrlHandlerW(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lphandlerproc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lphandlerproc);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpservicename;
    (void)lphandlerproc;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesSetServiceBits(JNIEnv* km_env, jclass km_clazz, jlong hservicestatus, jint dwservicebits, jint bsetbitson, jint bupdateimmediately) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceBits");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservicestatus, (uint32_t)dwservicebits, (int32_t)bsetbitson, (int32_t)bupdateimmediately);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservicestatus;
    (void)dwservicebits;
    (void)bsetbitson;
    (void)bupdateimmediately;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesSetServiceObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwsecurityinformation, jlong lpsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwsecurityinformation, (void*)(uintptr_t)lpsecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwsecurityinformation;
    (void)lpsecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesSetServiceStatus(JNIEnv* km_env, jclass km_clazz, jlong hservicestatus, jlong lpservicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservicestatus, (void*)(uintptr_t)lpservicestatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservicestatus;
    (void)lpservicestatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesStartServiceA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnumserviceargs, jlong lpserviceargvectors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnumserviceargs, (void*)(uintptr_t)lpserviceargvectors);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwnumserviceargs;
    (void)lpserviceargvectors;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherA(JNIEnv* km_env, jclass km_clazz, jlong lpservicestarttable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceCtrlDispatcherA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicestarttable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpservicestarttable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesStartServiceCtrlDispatcherW(JNIEnv* km_env, jclass km_clazz, jlong lpservicestarttable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceCtrlDispatcherW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpservicestarttable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpservicestarttable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesStartServiceW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnumserviceargs, jlong lpserviceargvectors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnumserviceargs, (void*)(uintptr_t)lpserviceargvectors);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hservice;
    (void)dwnumserviceargs;
    (void)lpserviceargvectors;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesSubscribeServiceChangeNotifications(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint eeventtype, jlong pcallback, jlong pcallbackcontext, jlong psubscription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sechost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubscribeServiceChangeNotifications");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (int32_t)eeventtype, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pcallbackcontext, (void*)(uintptr_t)psubscription);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hservice;
    (void)eeventtype;
    (void)pcallback;
    (void)pcallbackcontext;
    (void)psubscription;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesUnlockServiceDatabase(JNIEnv* km_env, jclass km_clazz, jlong sclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockServiceDatabase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sclock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sclock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesUnsubscribeServiceChangeNotifications(JNIEnv* km_env, jclass km_clazz, jlong psubscription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sechost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnsubscribeServiceChangeNotifications");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)psubscription);
    } else {
        errno = ENOSYS;
    }
#else
    (void)psubscription;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssysWindowsWin32SystemServicesWaitServiceState(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnotify, jint dwtimeout, jlong hcancelevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitServiceState");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnotify, (uint32_t)dwtimeout, (void*)(uintptr_t)hcancelevent);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hservice;
    (void)dwnotify;
    (void)dwtimeout;
    (void)hcancelevent;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

