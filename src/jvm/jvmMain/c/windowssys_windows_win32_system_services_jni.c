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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1changeServiceConfig2A(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwinfolevel, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfig2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1changeServiceConfig2W(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwinfolevel, jlong lpinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfig2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpinfo) : -1;
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1changeServiceConfigA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwservicetype, jint dwstarttype, jint dwerrorcontrol, jlong lpbinarypathname, jlong lploadordergroup, jlong lpdwtagid, jlong lpdependencies, jlong lpservicestartname, jlong lppassword, jlong lpdisplayname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfigA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwservicetype, (uint32_t)dwstarttype, (uint32_t)dwerrorcontrol, (void*)(uintptr_t)lpbinarypathname, (void*)(uintptr_t)lploadordergroup, (void*)(uintptr_t)lpdwtagid, (void*)(uintptr_t)lpdependencies, (void*)(uintptr_t)lpservicestartname, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpdisplayname) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1changeServiceConfigW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwservicetype, jint dwstarttype, jint dwerrorcontrol, jlong lpbinarypathname, jlong lploadordergroup, jlong lpdwtagid, jlong lpdependencies, jlong lpservicestartname, jlong lppassword, jlong lpdisplayname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeServiceConfigW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwservicetype, (uint32_t)dwstarttype, (uint32_t)dwerrorcontrol, (void*)(uintptr_t)lpbinarypathname, (void*)(uintptr_t)lploadordergroup, (void*)(uintptr_t)lpdwtagid, (void*)(uintptr_t)lpdependencies, (void*)(uintptr_t)lpservicestartname, (void*)(uintptr_t)lppassword, (void*)(uintptr_t)lpdisplayname) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1closeServiceHandle(JNIEnv* km_env, jclass km_clazz, jlong hscobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseServiceHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscobject) : -1;
#else
    (void)hscobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1controlService(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwcontrol, jlong lpservicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ControlService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwcontrol, (void*)(uintptr_t)lpservicestatus) : -1;
#else
    (void)hservice;
    (void)dwcontrol;
    (void)lpservicestatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1controlServiceExA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwcontrol, jint dwinfolevel, jlong pcontrolparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ControlServiceExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwcontrol, (uint32_t)dwinfolevel, (void*)(uintptr_t)pcontrolparams) : -1;
#else
    (void)hservice;
    (void)dwcontrol;
    (void)dwinfolevel;
    (void)pcontrolparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1controlServiceExW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwcontrol, jint dwinfolevel, jlong pcontrolparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ControlServiceExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwcontrol, (uint32_t)dwinfolevel, (void*)(uintptr_t)pcontrolparams) : -1;
#else
    (void)hservice;
    (void)dwcontrol;
    (void)dwinfolevel;
    (void)pcontrolparams;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1createServiceA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jlong lpdisplayname, jint dwdesiredaccess, jint dwservicetype, jint dwstarttype, jint dwerrorcontrol, jlong lpbinarypathname, jlong lploadordergroup, jlong lpdwtagid, jlong lpdependencies, jlong lpservicestartname, jlong lppassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateServiceA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpdisplayname, (uint32_t)dwdesiredaccess, (uint32_t)dwservicetype, (uint32_t)dwstarttype, (uint32_t)dwerrorcontrol, (void*)(uintptr_t)lpbinarypathname, (void*)(uintptr_t)lploadordergroup, (void*)(uintptr_t)lpdwtagid, (void*)(uintptr_t)lpdependencies, (void*)(uintptr_t)lpservicestartname, (void*)(uintptr_t)lppassword) : NULL;
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
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1createServiceW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jlong lpdisplayname, jint dwdesiredaccess, jint dwservicetype, jint dwstarttype, jint dwerrorcontrol, jlong lpbinarypathname, jlong lploadordergroup, jlong lpdwtagid, jlong lpdependencies, jlong lpservicestartname, jlong lppassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateServiceW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpdisplayname, (uint32_t)dwdesiredaccess, (uint32_t)dwservicetype, (uint32_t)dwstarttype, (uint32_t)dwerrorcontrol, (void*)(uintptr_t)lpbinarypathname, (void*)(uintptr_t)lploadordergroup, (void*)(uintptr_t)lpdwtagid, (void*)(uintptr_t)lpdependencies, (void*)(uintptr_t)lpservicestartname, (void*)(uintptr_t)lppassword) : NULL;
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
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1deleteService(JNIEnv* km_env, jclass km_clazz, jlong hservice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice) : -1;
#else
    (void)hservice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1enumDependentServicesA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDependentServicesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned) : -1;
#else
    (void)hservice;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1enumDependentServicesW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumDependentServicesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned) : -1;
#else
    (void)hservice;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1enumServicesStatusA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jint dwservicetype, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned, jlong lpresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (uint32_t)dwservicetype, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned, (void*)(uintptr_t)lpresumehandle) : -1;
#else
    (void)hscmanager;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1enumServicesStatusExA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jint infolevel, jint dwservicetype, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned, jlong lpresumehandle, jlong pszgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (int32_t)infolevel, (uint32_t)dwservicetype, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned, (void*)(uintptr_t)lpresumehandle, (void*)(uintptr_t)pszgroupname) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1enumServicesStatusExW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jint infolevel, jint dwservicetype, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned, jlong lpresumehandle, jlong pszgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (int32_t)infolevel, (uint32_t)dwservicetype, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned, (void*)(uintptr_t)lpresumehandle, (void*)(uintptr_t)pszgroupname) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1enumServicesStatusW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jint dwservicetype, jint dwservicestate, jlong lpservices, jint cbbufsize, jlong pcbbytesneeded, jlong lpservicesreturned, jlong lpresumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumServicesStatusW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (uint32_t)dwservicetype, (uint32_t)dwservicestate, (void*)(uintptr_t)lpservices, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded, (void*)(uintptr_t)lpservicesreturned, (void*)(uintptr_t)lpresumehandle) : -1;
#else
    (void)hscmanager;
    (void)dwservicetype;
    (void)dwservicestate;
    (void)lpservices;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    (void)lpservicesreturned;
    (void)lpresumehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1getServiceDirectory(JNIEnv* km_env, jclass km_clazz, jlong hservicestatus, jint edirectorytype, jlong lppathbuffer, jint cchpathbufferlength, jlong lpcchrequiredbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-4.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceDirectory");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservicestatus, (int32_t)edirectorytype, (void*)(uintptr_t)lppathbuffer, (uint32_t)cchpathbufferlength, (void*)(uintptr_t)lpcchrequiredbufferlength) : 0;
#else
    (void)hservicestatus;
    (void)edirectorytype;
    (void)lppathbuffer;
    (void)cchpathbufferlength;
    (void)lpcchrequiredbufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1getServiceDisplayNameA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jlong lpdisplayname, jlong lpcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceDisplayNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)lpcchbuffer) : -1;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)lpcchbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1getServiceDisplayNameW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jlong lpdisplayname, jlong lpcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceDisplayNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)lpcchbuffer) : -1;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)lpdisplayname;
    (void)lpcchbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1getServiceKeyNameA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpdisplayname, jlong lpservicename, jlong lpcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceKeyNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpcchbuffer) : -1;
#else
    (void)hscmanager;
    (void)lpdisplayname;
    (void)lpservicename;
    (void)lpcchbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1getServiceKeyNameW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpdisplayname, jlong lpservicename, jlong lpcchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceKeyNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpdisplayname, (void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lpcchbuffer) : -1;
#else
    (void)hscmanager;
    (void)lpdisplayname;
    (void)lpservicename;
    (void)lpcchbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1getServiceRegistryStateKey(JNIEnv* km_env, jclass km_clazz, jlong servicestatushandle, jint statetype, jint accessmask, jlong servicestatekey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-3.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetServiceRegistryStateKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servicestatushandle, (int32_t)statetype, (uint32_t)accessmask, (void*)(uintptr_t)servicestatekey) : 0;
#else
    (void)servicestatushandle;
    (void)statetype;
    (void)accessmask;
    (void)servicestatekey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1getSharedServiceDirectory(JNIEnv* km_env, jclass km_clazz, jlong servicehandle, jint directorytype, jlong pathbuffer, jint pathbufferlength, jlong requiredbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-5.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSharedServiceDirectory");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servicehandle, (int32_t)directorytype, (void*)(uintptr_t)pathbuffer, (uint32_t)pathbufferlength, (void*)(uintptr_t)requiredbufferlength) : 0;
#else
    (void)servicehandle;
    (void)directorytype;
    (void)pathbuffer;
    (void)pathbufferlength;
    (void)requiredbufferlength;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1getSharedServiceRegistryStateKey(JNIEnv* km_env, jclass km_clazz, jlong servicehandle, jint statetype, jint accessmask, jlong servicestatekey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-service-core-l1-1-5.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSharedServiceRegistryStateKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servicehandle, (int32_t)statetype, (uint32_t)accessmask, (void*)(uintptr_t)servicestatekey) : 0;
#else
    (void)servicehandle;
    (void)statetype;
    (void)accessmask;
    (void)servicestatekey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1lockServiceDatabase(JNIEnv* km_env, jclass km_clazz, jlong hscmanager) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockServiceDatabase");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager) : NULL;
#else
    (void)hscmanager;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1notifyBootConfigStatus(JNIEnv* km_env, jclass km_clazz, jint bootacceptable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyBootConfigStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)bootacceptable) : -1;
#else
    (void)bootacceptable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1notifyServiceStatusChangeA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnotifymask, jlong pnotifybuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyServiceStatusChangeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnotifymask, (void*)(uintptr_t)pnotifybuffer) : 0;
#else
    (void)hservice;
    (void)dwnotifymask;
    (void)pnotifybuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1notifyServiceStatusChangeW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnotifymask, jlong pnotifybuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NotifyServiceStatusChangeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnotifymask, (void*)(uintptr_t)pnotifybuffer) : 0;
#else
    (void)hservice;
    (void)dwnotifymask;
    (void)pnotifybuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1openSCManagerA(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpdatabasename, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSCManagerA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpdatabasename, (uint32_t)dwdesiredaccess) : NULL;
#else
    (void)lpmachinename;
    (void)lpdatabasename;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1openSCManagerW(JNIEnv* km_env, jclass km_clazz, jlong lpmachinename, jlong lpdatabasename, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSCManagerW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpmachinename, (void*)(uintptr_t)lpdatabasename, (uint32_t)dwdesiredaccess) : NULL;
#else
    (void)lpmachinename;
    (void)lpdatabasename;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1openServiceA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenServiceA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (uint32_t)dwdesiredaccess) : NULL;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1openServiceW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lpservicename, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenServiceW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lpservicename, (uint32_t)dwdesiredaccess) : NULL;
#else
    (void)hscmanager;
    (void)lpservicename;
    (void)dwdesiredaccess;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceConfig2A(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwinfolevel, jlong lpbuffer, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfig2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded) : -1;
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceConfig2W(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwinfolevel, jlong lpbuffer, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfig2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwinfolevel, (void*)(uintptr_t)lpbuffer, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded) : -1;
#else
    (void)hservice;
    (void)dwinfolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceConfigA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jlong lpserviceconfig, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfigA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (void*)(uintptr_t)lpserviceconfig, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded) : -1;
#else
    (void)hservice;
    (void)lpserviceconfig;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceConfigW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jlong lpserviceconfig, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceConfigW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (void*)(uintptr_t)lpserviceconfig, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded) : -1;
#else
    (void)hservice;
    (void)lpserviceconfig;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceDynamicInformation(JNIEnv* km_env, jclass km_clazz, jlong hservicestatus, jint dwinfolevel, jlong ppdynamicinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceDynamicInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservicestatus, (uint32_t)dwinfolevel, (void*)(uintptr_t)ppdynamicinfo) : -1;
#else
    (void)hservicestatus;
    (void)dwinfolevel;
    (void)ppdynamicinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceLockStatusA(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lplockstatus, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceLockStatusA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lplockstatus, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded) : -1;
#else
    (void)hscmanager;
    (void)lplockstatus;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceLockStatusW(JNIEnv* km_env, jclass km_clazz, jlong hscmanager, jlong lplockstatus, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceLockStatusW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hscmanager, (void*)(uintptr_t)lplockstatus, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded) : -1;
#else
    (void)hscmanager;
    (void)lplockstatus;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwsecurityinformation, jlong lpsecuritydescriptor, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwsecurityinformation, (void*)(uintptr_t)lpsecuritydescriptor, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded) : -1;
#else
    (void)hservice;
    (void)dwsecurityinformation;
    (void)lpsecuritydescriptor;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceStatus(JNIEnv* km_env, jclass km_clazz, jlong hservice, jlong lpservicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (void*)(uintptr_t)lpservicestatus) : -1;
#else
    (void)hservice;
    (void)lpservicestatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1queryServiceStatusEx(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint infolevel, jlong lpbuffer, jint cbbufsize, jlong pcbbytesneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryServiceStatusEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (int32_t)infolevel, (void*)(uintptr_t)lpbuffer, (uint32_t)cbbufsize, (void*)(uintptr_t)pcbbytesneeded) : -1;
#else
    (void)hservice;
    (void)infolevel;
    (void)lpbuffer;
    (void)cbbufsize;
    (void)pcbbytesneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1registerServiceCtrlHandlerA(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lphandlerproc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lphandlerproc) : NULL;
#else
    (void)lpservicename;
    (void)lphandlerproc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1registerServiceCtrlHandlerExA(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lphandlerproc, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lphandlerproc, (void*)(uintptr_t)lpcontext) : NULL;
#else
    (void)lpservicename;
    (void)lphandlerproc;
    (void)lpcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1registerServiceCtrlHandlerExW(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lphandlerproc, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lphandlerproc, (void*)(uintptr_t)lpcontext) : NULL;
#else
    (void)lpservicename;
    (void)lphandlerproc;
    (void)lpcontext;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1registerServiceCtrlHandlerW(JNIEnv* km_env, jclass km_clazz, jlong lpservicename, jlong lphandlerproc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterServiceCtrlHandlerW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicename, (void*)(uintptr_t)lphandlerproc) : NULL;
#else
    (void)lpservicename;
    (void)lphandlerproc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1setServiceBits(JNIEnv* km_env, jclass km_clazz, jlong hservicestatus, jint dwservicebits, jint bsetbitson, jint bupdateimmediately) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceBits");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservicestatus, (uint32_t)dwservicebits, (int32_t)bsetbitson, (int32_t)bupdateimmediately) : -1;
#else
    (void)hservicestatus;
    (void)dwservicebits;
    (void)bsetbitson;
    (void)bupdateimmediately;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1setServiceObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwsecurityinformation, jlong lpsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwsecurityinformation, (void*)(uintptr_t)lpsecuritydescriptor) : -1;
#else
    (void)hservice;
    (void)dwsecurityinformation;
    (void)lpsecuritydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1setServiceStatus(JNIEnv* km_env, jclass km_clazz, jlong hservicestatus, jlong lpservicestatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetServiceStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservicestatus, (void*)(uintptr_t)lpservicestatus) : -1;
#else
    (void)hservicestatus;
    (void)lpservicestatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1startServiceA(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnumserviceargs, jlong lpserviceargvectors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnumserviceargs, (void*)(uintptr_t)lpserviceargvectors) : -1;
#else
    (void)hservice;
    (void)dwnumserviceargs;
    (void)lpserviceargvectors;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1startServiceCtrlDispatcherA(JNIEnv* km_env, jclass km_clazz, jlong lpservicestarttable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceCtrlDispatcherA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicestarttable) : -1;
#else
    (void)lpservicestarttable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1startServiceCtrlDispatcherW(JNIEnv* km_env, jclass km_clazz, jlong lpservicestarttable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceCtrlDispatcherW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpservicestarttable) : -1;
#else
    (void)lpservicestarttable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1startServiceW(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnumserviceargs, jlong lpserviceargvectors) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartServiceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnumserviceargs, (void*)(uintptr_t)lpserviceargvectors) : -1;
#else
    (void)hservice;
    (void)dwnumserviceargs;
    (void)lpserviceargvectors;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1subscribeServiceChangeNotifications(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint eeventtype, jlong pcallback, jlong pcallbackcontext, jlong psubscription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sechost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubscribeServiceChangeNotifications");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (int32_t)eeventtype, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pcallbackcontext, (void*)(uintptr_t)psubscription) : 0;
#else
    (void)hservice;
    (void)eeventtype;
    (void)pcallback;
    (void)pcallbackcontext;
    (void)psubscription;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1unlockServiceDatabase(JNIEnv* km_env, jclass km_clazz, jlong sclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockServiceDatabase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sclock) : -1;
#else
    (void)sclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1unsubscribeServiceChangeNotifications(JNIEnv* km_env, jclass km_clazz, jlong psubscription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sechost.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnsubscribeServiceChangeNotifications");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)psubscription);
#else
    (void)psubscription;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_services_WindowsWin32SystemServicesJniBridge_windowssys_1windows_1win32_1system_1services_1waitServiceState(JNIEnv* km_env, jclass km_clazz, jlong hservice, jint dwnotify, jint dwtimeout, jlong hcancelevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitServiceState");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservice, (uint32_t)dwnotify, (uint32_t)dwtimeout, (void*)(uintptr_t)hcancelevent) : 0;
#else
    (void)hservice;
    (void)dwnotify;
    (void)dwtimeout;
    (void)hcancelevent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

