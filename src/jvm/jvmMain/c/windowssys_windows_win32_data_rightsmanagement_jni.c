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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMAcquireAdvisories(JNIEnv* km_env, jclass km_clazz, jint hlicensestorage, jlong wszlicense, jlong wszurl, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAcquireAdvisories");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlicensestorage, (void*)(uintptr_t)wszlicense, (void*)(uintptr_t)wszurl, (void*)(uintptr_t)pvcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlicensestorage;
    (void)wszlicense;
    (void)wszurl;
    (void)pvcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMAcquireIssuanceLicenseTemplate(JNIEnv* km_env, jclass km_clazz, jint hclient, jint uflags, jlong pvreserved, jint ctemplates, jlong pwsztemplateids, jlong wszurl, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAcquireIssuanceLicenseTemplate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hclient, (uint32_t)uflags, (void*)(uintptr_t)pvreserved, (uint32_t)ctemplates, (void*)(uintptr_t)pwsztemplateids, (void*)(uintptr_t)wszurl, (void*)(uintptr_t)pvcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hclient;
    (void)uflags;
    (void)pvreserved;
    (void)ctemplates;
    (void)pwsztemplateids;
    (void)wszurl;
    (void)pvcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMAcquireLicense(JNIEnv* km_env, jclass km_clazz, jint hsession, jint uflags, jlong wszgroupidentitycredential, jlong wszrequestedrights, jlong wszcustomdata, jlong wszurl, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAcquireLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hsession, (uint32_t)uflags, (void*)(uintptr_t)wszgroupidentitycredential, (void*)(uintptr_t)wszrequestedrights, (void*)(uintptr_t)wszcustomdata, (void*)(uintptr_t)wszurl, (void*)(uintptr_t)pvcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)uflags;
    (void)wszgroupidentitycredential;
    (void)wszrequestedrights;
    (void)wszcustomdata;
    (void)wszurl;
    (void)pvcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMActivate(JNIEnv* km_env, jclass km_clazz, jint hclient, jint uflags, jint ulangid, jlong pactservinfo, jlong pvcontext, jlong hparentwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMActivate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hclient, (uint32_t)uflags, (uint32_t)ulangid, (void*)(uintptr_t)pactservinfo, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)hparentwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hclient;
    (void)uflags;
    (void)ulangid;
    (void)pactservinfo;
    (void)pvcontext;
    (void)hparentwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMAddLicense(JNIEnv* km_env, jclass km_clazz, jint hlicensestorage, jint uflags, jlong wszlicense) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAddLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlicensestorage, (uint32_t)uflags, (void*)(uintptr_t)wszlicense);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlicensestorage;
    (void)uflags;
    (void)wszlicense;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMAddRightWithUser(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint hright, jint huser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAddRightWithUser");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (uint32_t)hright, (uint32_t)huser);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)hright;
    (void)huser;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMAttest(JNIEnv* km_env, jclass km_clazz, jint henablingprincipal, jlong wszdata, jint etype, jlong pcattestedblob, jlong wszattestedblob) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMAttest");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henablingprincipal, (void*)(uintptr_t)wszdata, (int32_t)etype, (void*)(uintptr_t)pcattestedblob, (void*)(uintptr_t)wszattestedblob);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henablingprincipal;
    (void)wszdata;
    (void)etype;
    (void)pcattestedblob;
    (void)wszattestedblob;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCheckSecurity(JNIEnv* km_env, jclass km_clazz, jint henv, jint clevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCheckSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (uint32_t)clevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)clevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMClearAllRights(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMClearAllRights");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCloseEnvironmentHandle(JNIEnv* km_env, jclass km_clazz, jint henv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCloseEnvironmentHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCloseHandle(JNIEnv* km_env, jclass km_clazz, jint handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCloseHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMClosePubHandle(JNIEnv* km_env, jclass km_clazz, jint hpub) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMClosePubHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hpub);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpub;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCloseQueryHandle(JNIEnv* km_env, jclass km_clazz, jint hquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCloseQueryHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hquery);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hquery;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCloseSession(JNIEnv* km_env, jclass km_clazz, jint hsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCloseSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hsession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMConstructCertificateChain(JNIEnv* km_env, jclass km_clazz, jint ccertificates, jlong rgwszcertificates, jlong pcchain, jlong wszchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMConstructCertificateChain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ccertificates, (void*)(uintptr_t)rgwszcertificates, (void*)(uintptr_t)pcchain, (void*)(uintptr_t)wszchain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ccertificates;
    (void)rgwszcertificates;
    (void)pcchain;
    (void)wszchain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCreateBoundLicense(JNIEnv* km_env, jclass km_clazz, jint henv, jlong pparams, jlong wszlicensechain, jlong phboundlicense, jlong pherrorlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateBoundLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (void*)(uintptr_t)pparams, (void*)(uintptr_t)wszlicensechain, (void*)(uintptr_t)phboundlicense, (void*)(uintptr_t)pherrorlog);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)pparams;
    (void)wszlicensechain;
    (void)phboundlicense;
    (void)pherrorlog;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCreateClientSession(JNIEnv* km_env, jclass km_clazz, jlong pfncallback, jint ucallbackversion, jlong wszgroupidprovidertype, jlong wszgroupid, jlong phclient) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateClientSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfncallback, (uint32_t)ucallbackversion, (void*)(uintptr_t)wszgroupidprovidertype, (void*)(uintptr_t)wszgroupid, (void*)(uintptr_t)phclient);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfncallback;
    (void)ucallbackversion;
    (void)wszgroupidprovidertype;
    (void)wszgroupid;
    (void)phclient;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCreateEnablingBitsDecryptor(JNIEnv* km_env, jclass km_clazz, jint hboundlicense, jlong wszright, jint hauxlib, jlong wszauxplug, jlong phdecryptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateEnablingBitsDecryptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hboundlicense, (void*)(uintptr_t)wszright, (uint32_t)hauxlib, (void*)(uintptr_t)wszauxplug, (void*)(uintptr_t)phdecryptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hboundlicense;
    (void)wszright;
    (void)hauxlib;
    (void)wszauxplug;
    (void)phdecryptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCreateEnablingBitsEncryptor(JNIEnv* km_env, jclass km_clazz, jint hboundlicense, jlong wszright, jint hauxlib, jlong wszauxplug, jlong phencryptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateEnablingBitsEncryptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hboundlicense, (void*)(uintptr_t)wszright, (uint32_t)hauxlib, (void*)(uintptr_t)wszauxplug, (void*)(uintptr_t)phencryptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hboundlicense;
    (void)wszright;
    (void)hauxlib;
    (void)wszauxplug;
    (void)phencryptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCreateEnablingPrincipal(JNIEnv* km_env, jclass km_clazz, jint henv, jint hlibrary, jlong wszobject, jlong pidprincipal, jlong wszcredentials, jlong phenablingprincipal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateEnablingPrincipal");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (uint32_t)hlibrary, (void*)(uintptr_t)wszobject, (void*)(uintptr_t)pidprincipal, (void*)(uintptr_t)wszcredentials, (void*)(uintptr_t)phenablingprincipal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)hlibrary;
    (void)wszobject;
    (void)pidprincipal;
    (void)wszcredentials;
    (void)phenablingprincipal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCreateIssuanceLicense(JNIEnv* km_env, jclass km_clazz, jlong psttimefrom, jlong psttimeuntil, jlong wszreferralinfoname, jlong wszreferralinfourl, jint howner, jlong wszissuancelicense, jint hboundlicense, jlong phissuancelicense) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateIssuanceLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psttimefrom, (void*)(uintptr_t)psttimeuntil, (void*)(uintptr_t)wszreferralinfoname, (void*)(uintptr_t)wszreferralinfourl, (uint32_t)howner, (void*)(uintptr_t)wszissuancelicense, (uint32_t)hboundlicense, (void*)(uintptr_t)phissuancelicense);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psttimefrom;
    (void)psttimeuntil;
    (void)wszreferralinfoname;
    (void)wszreferralinfourl;
    (void)howner;
    (void)wszissuancelicense;
    (void)hboundlicense;
    (void)phissuancelicense;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCreateLicenseStorageSession(JNIEnv* km_env, jclass km_clazz, jint henv, jint hdefaultlibrary, jint hclient, jint uflags, jlong wszissuancelicense, jlong phlicensestorage) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateLicenseStorageSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (uint32_t)hdefaultlibrary, (uint32_t)hclient, (uint32_t)uflags, (void*)(uintptr_t)wszissuancelicense, (void*)(uintptr_t)phlicensestorage);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)hdefaultlibrary;
    (void)hclient;
    (void)uflags;
    (void)wszissuancelicense;
    (void)phlicensestorage;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCreateRight(JNIEnv* km_env, jclass km_clazz, jlong wszrightname, jlong pstfrom, jlong pstuntil, jint cextendedinfo, jlong pwszextendedinfoname, jlong pwszextendedinfovalue, jlong phright) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateRight");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszrightname, (void*)(uintptr_t)pstfrom, (void*)(uintptr_t)pstuntil, (uint32_t)cextendedinfo, (void*)(uintptr_t)pwszextendedinfoname, (void*)(uintptr_t)pwszextendedinfovalue, (void*)(uintptr_t)phright);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszrightname;
    (void)pstfrom;
    (void)pstuntil;
    (void)cextendedinfo;
    (void)pwszextendedinfoname;
    (void)pwszextendedinfovalue;
    (void)phright;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMCreateUser(JNIEnv* km_env, jclass km_clazz, jlong wszusername, jlong wszuserid, jlong wszuseridtype, jlong phuser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMCreateUser");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszusername, (void*)(uintptr_t)wszuserid, (void*)(uintptr_t)wszuseridtype, (void*)(uintptr_t)phuser);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszusername;
    (void)wszuserid;
    (void)wszuseridtype;
    (void)phuser;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMDecode(JNIEnv* km_env, jclass km_clazz, jlong wszalgid, jlong wszencodedstring, jlong pudecodeddatalen, jlong pbdecodeddata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDecode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszalgid, (void*)(uintptr_t)wszencodedstring, (void*)(uintptr_t)pudecodeddatalen, (void*)(uintptr_t)pbdecodeddata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszalgid;
    (void)wszencodedstring;
    (void)pudecodeddatalen;
    (void)pbdecodeddata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMDeconstructCertificateChain(JNIEnv* km_env, jclass km_clazz, jlong wszchain, jint iwhich, jlong pccert, jlong wszcert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDeconstructCertificateChain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszchain, (uint32_t)iwhich, (void*)(uintptr_t)pccert, (void*)(uintptr_t)wszcert);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszchain;
    (void)iwhich;
    (void)pccert;
    (void)wszcert;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMDecrypt(JNIEnv* km_env, jclass km_clazz, jint hcryptoprovider, jint iposition, jint cnuminbytes, jlong pbindata, jlong pcnumoutbytes, jlong pboutdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDecrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcryptoprovider, (uint32_t)iposition, (uint32_t)cnuminbytes, (void*)(uintptr_t)pbindata, (void*)(uintptr_t)pcnumoutbytes, (void*)(uintptr_t)pboutdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptoprovider;
    (void)iposition;
    (void)cnuminbytes;
    (void)pbindata;
    (void)pcnumoutbytes;
    (void)pboutdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMDeleteLicense(JNIEnv* km_env, jclass km_clazz, jint hsession, jlong wszlicenseid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDeleteLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hsession, (void*)(uintptr_t)wszlicenseid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)wszlicenseid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMDuplicateEnvironmentHandle(JNIEnv* km_env, jclass km_clazz, jint htocopy, jlong phcopy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDuplicateEnvironmentHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)htocopy, (void*)(uintptr_t)phcopy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htocopy;
    (void)phcopy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMDuplicateHandle(JNIEnv* km_env, jclass km_clazz, jint htocopy, jlong phcopy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDuplicateHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)htocopy, (void*)(uintptr_t)phcopy);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htocopy;
    (void)phcopy;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMDuplicatePubHandle(JNIEnv* km_env, jclass km_clazz, jint hpubin, jlong phpubout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDuplicatePubHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hpubin, (void*)(uintptr_t)phpubout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hpubin;
    (void)phpubout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMDuplicateSession(JNIEnv* km_env, jclass km_clazz, jint hsessionin, jlong phsessionout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMDuplicateSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hsessionin, (void*)(uintptr_t)phsessionout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsessionin;
    (void)phsessionout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMEncode(JNIEnv* km_env, jclass km_clazz, jlong wszalgid, jint udatalen, jlong pbdecodeddata, jlong puencodedstringlen, jlong wszencodedstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMEncode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszalgid, (uint32_t)udatalen, (void*)(uintptr_t)pbdecodeddata, (void*)(uintptr_t)puencodedstringlen, (void*)(uintptr_t)wszencodedstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszalgid;
    (void)udatalen;
    (void)pbdecodeddata;
    (void)puencodedstringlen;
    (void)wszencodedstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMEncrypt(JNIEnv* km_env, jclass km_clazz, jint hcryptoprovider, jint iposition, jint cnuminbytes, jlong pbindata, jlong pcnumoutbytes, jlong pboutdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMEncrypt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hcryptoprovider, (uint32_t)iposition, (uint32_t)cnuminbytes, (void*)(uintptr_t)pbindata, (void*)(uintptr_t)pcnumoutbytes, (void*)(uintptr_t)pboutdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcryptoprovider;
    (void)iposition;
    (void)cnuminbytes;
    (void)pbindata;
    (void)pcnumoutbytes;
    (void)pboutdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMEnumerateLicense(JNIEnv* km_env, jclass km_clazz, jint hsession, jint uflags, jint uindex, jlong pfsharedflag, jlong pucertificatedatalen, jlong wszcertificatedata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMEnumerateLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hsession, (uint32_t)uflags, (uint32_t)uindex, (void*)(uintptr_t)pfsharedflag, (void*)(uintptr_t)pucertificatedatalen, (void*)(uintptr_t)wszcertificatedata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)uflags;
    (void)uindex;
    (void)pfsharedflag;
    (void)pucertificatedatalen;
    (void)wszcertificatedata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetApplicationSpecificData(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint uindex, jlong punamelength, jlong wszname, jlong puvaluelength, jlong wszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetApplicationSpecificData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (uint32_t)uindex, (void*)(uintptr_t)punamelength, (void*)(uintptr_t)wszname, (void*)(uintptr_t)puvaluelength, (void*)(uintptr_t)wszvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)uindex;
    (void)punamelength;
    (void)wszname;
    (void)puvaluelength;
    (void)wszvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetBoundLicenseAttribute(JNIEnv* km_env, jclass km_clazz, jint hqueryroot, jlong wszattribute, jint iwhich, jlong peencoding, jlong pcbuffer, jlong pbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetBoundLicenseAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hqueryroot, (void*)(uintptr_t)wszattribute, (uint32_t)iwhich, (void*)(uintptr_t)peencoding, (void*)(uintptr_t)pcbuffer, (void*)(uintptr_t)pbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueryroot;
    (void)wszattribute;
    (void)iwhich;
    (void)peencoding;
    (void)pcbuffer;
    (void)pbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetBoundLicenseAttributeCount(JNIEnv* km_env, jclass km_clazz, jint hqueryroot, jlong wszattribute, jlong pcattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetBoundLicenseAttributeCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hqueryroot, (void*)(uintptr_t)wszattribute, (void*)(uintptr_t)pcattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueryroot;
    (void)wszattribute;
    (void)pcattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetBoundLicenseObject(JNIEnv* km_env, jclass km_clazz, jint hqueryroot, jlong wszsubobjecttype, jint iwhich, jlong phsubobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetBoundLicenseObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hqueryroot, (void*)(uintptr_t)wszsubobjecttype, (uint32_t)iwhich, (void*)(uintptr_t)phsubobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueryroot;
    (void)wszsubobjecttype;
    (void)iwhich;
    (void)phsubobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetBoundLicenseObjectCount(JNIEnv* km_env, jclass km_clazz, jint hqueryroot, jlong wszsubobjecttype, jlong pcsubobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetBoundLicenseObjectCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hqueryroot, (void*)(uintptr_t)wszsubobjecttype, (void*)(uintptr_t)pcsubobjects);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueryroot;
    (void)wszsubobjecttype;
    (void)pcsubobjects;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetCertificateChainCount(JNIEnv* km_env, jclass km_clazz, jlong wszchain, jlong pccertcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetCertificateChainCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszchain, (void*)(uintptr_t)pccertcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszchain;
    (void)pccertcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetClientVersion(JNIEnv* km_env, jclass km_clazz, jlong pdrmclientversioninfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetClientVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pdrmclientversioninfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pdrmclientversioninfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetEnvironmentInfo(JNIEnv* km_env, jclass km_clazz, jint handle, jlong wszattribute, jlong peencoding, jlong pcbuffer, jlong pbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetEnvironmentInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)handle, (void*)(uintptr_t)wszattribute, (void*)(uintptr_t)peencoding, (void*)(uintptr_t)pcbuffer, (void*)(uintptr_t)pbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)wszattribute;
    (void)peencoding;
    (void)pcbuffer;
    (void)pbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetInfo(JNIEnv* km_env, jclass km_clazz, jint handle, jlong wszattribute, jlong peencoding, jlong pcbuffer, jlong pbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)handle, (void*)(uintptr_t)wszattribute, (void*)(uintptr_t)peencoding, (void*)(uintptr_t)pcbuffer, (void*)(uintptr_t)pbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)wszattribute;
    (void)peencoding;
    (void)pcbuffer;
    (void)pbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetIntervalTime(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jlong pcdays) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetIntervalTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (void*)(uintptr_t)pcdays);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)pcdays;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetIssuanceLicenseInfo(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jlong psttimefrom, jlong psttimeuntil, jint uflags, jlong pudistributionpointnamelength, jlong wszdistributionpointname, jlong pudistributionpointurllength, jlong wszdistributionpointurl, jlong phowner, jlong pfofficial) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetIssuanceLicenseInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (void*)(uintptr_t)psttimefrom, (void*)(uintptr_t)psttimeuntil, (uint32_t)uflags, (void*)(uintptr_t)pudistributionpointnamelength, (void*)(uintptr_t)wszdistributionpointname, (void*)(uintptr_t)pudistributionpointurllength, (void*)(uintptr_t)wszdistributionpointurl, (void*)(uintptr_t)phowner, (void*)(uintptr_t)pfofficial);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)psttimefrom;
    (void)psttimeuntil;
    (void)uflags;
    (void)pudistributionpointnamelength;
    (void)wszdistributionpointname;
    (void)pudistributionpointurllength;
    (void)wszdistributionpointurl;
    (void)phowner;
    (void)pfofficial;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetIssuanceLicenseTemplate(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jlong puissuancelicensetemplatelength, jlong wszissuancelicensetemplate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetIssuanceLicenseTemplate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (void*)(uintptr_t)puissuancelicensetemplatelength, (void*)(uintptr_t)wszissuancelicensetemplate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)puissuancelicensetemplatelength;
    (void)wszissuancelicensetemplate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetMetaData(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jlong pucontentidlength, jlong wszcontentid, jlong pucontentidtypelength, jlong wszcontentidtype, jlong puskuidlength, jlong wszskuid, jlong puskuidtypelength, jlong wszskuidtype, jlong pucontenttypelength, jlong wszcontenttype, jlong pucontentnamelength, jlong wszcontentname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetMetaData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (void*)(uintptr_t)pucontentidlength, (void*)(uintptr_t)wszcontentid, (void*)(uintptr_t)pucontentidtypelength, (void*)(uintptr_t)wszcontentidtype, (void*)(uintptr_t)puskuidlength, (void*)(uintptr_t)wszskuid, (void*)(uintptr_t)puskuidtypelength, (void*)(uintptr_t)wszskuidtype, (void*)(uintptr_t)pucontenttypelength, (void*)(uintptr_t)wszcontenttype, (void*)(uintptr_t)pucontentnamelength, (void*)(uintptr_t)wszcontentname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)pucontentidlength;
    (void)wszcontentid;
    (void)pucontentidtypelength;
    (void)wszcontentidtype;
    (void)puskuidlength;
    (void)wszskuid;
    (void)puskuidtypelength;
    (void)wszskuidtype;
    (void)pucontenttypelength;
    (void)wszcontenttype;
    (void)pucontentnamelength;
    (void)wszcontentname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetNameAndDescription(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint uindex, jlong pulcid, jlong punamelength, jlong wszname, jlong pudescriptionlength, jlong wszdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetNameAndDescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (uint32_t)uindex, (void*)(uintptr_t)pulcid, (void*)(uintptr_t)punamelength, (void*)(uintptr_t)wszname, (void*)(uintptr_t)pudescriptionlength, (void*)(uintptr_t)wszdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)uindex;
    (void)pulcid;
    (void)punamelength;
    (void)wszname;
    (void)pudescriptionlength;
    (void)wszdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetOwnerLicense(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jlong puownerlicenselength, jlong wszownerlicense) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetOwnerLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (void*)(uintptr_t)puownerlicenselength, (void*)(uintptr_t)wszownerlicense);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)puownerlicenselength;
    (void)wszownerlicense;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetProcAddress(JNIEnv* km_env, jclass km_clazz, jint hlibrary, jlong wszprocname, jlong ppfnprocaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetProcAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hlibrary, (void*)(uintptr_t)wszprocname, (void*)(uintptr_t)ppfnprocaddress);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hlibrary;
    (void)wszprocname;
    (void)ppfnprocaddress;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetRevocationPoint(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jlong puidlength, jlong wszid, jlong puidtypelength, jlong wszidtype, jlong puurllength, jlong wszrl, jlong pstfrequency, jlong punamelength, jlong wszname, jlong pupublickeylength, jlong wszpublickey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetRevocationPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (void*)(uintptr_t)puidlength, (void*)(uintptr_t)wszid, (void*)(uintptr_t)puidtypelength, (void*)(uintptr_t)wszidtype, (void*)(uintptr_t)puurllength, (void*)(uintptr_t)wszrl, (void*)(uintptr_t)pstfrequency, (void*)(uintptr_t)punamelength, (void*)(uintptr_t)wszname, (void*)(uintptr_t)pupublickeylength, (void*)(uintptr_t)wszpublickey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)puidlength;
    (void)wszid;
    (void)puidtypelength;
    (void)wszidtype;
    (void)puurllength;
    (void)wszrl;
    (void)pstfrequency;
    (void)punamelength;
    (void)wszname;
    (void)pupublickeylength;
    (void)wszpublickey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetRightExtendedInfo(JNIEnv* km_env, jclass km_clazz, jint hright, jint uindex, jlong puextendedinfonamelength, jlong wszextendedinfoname, jlong puextendedinfovaluelength, jlong wszextendedinfovalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetRightExtendedInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hright, (uint32_t)uindex, (void*)(uintptr_t)puextendedinfonamelength, (void*)(uintptr_t)wszextendedinfoname, (void*)(uintptr_t)puextendedinfovaluelength, (void*)(uintptr_t)wszextendedinfovalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hright;
    (void)uindex;
    (void)puextendedinfonamelength;
    (void)wszextendedinfoname;
    (void)puextendedinfovaluelength;
    (void)wszextendedinfovalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetRightInfo(JNIEnv* km_env, jclass km_clazz, jint hright, jlong purightnamelength, jlong wszrightname, jlong pstfrom, jlong pstuntil) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetRightInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hright, (void*)(uintptr_t)purightnamelength, (void*)(uintptr_t)wszrightname, (void*)(uintptr_t)pstfrom, (void*)(uintptr_t)pstuntil);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hright;
    (void)purightnamelength;
    (void)wszrightname;
    (void)pstfrom;
    (void)pstuntil;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetSecurityProvider(JNIEnv* km_env, jclass km_clazz, jint uflags, jlong putypelen, jlong wsztype, jlong pupathlen, jlong wszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetSecurityProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)uflags, (void*)(uintptr_t)putypelen, (void*)(uintptr_t)wsztype, (void*)(uintptr_t)pupathlen, (void*)(uintptr_t)wszpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uflags;
    (void)putypelen;
    (void)wsztype;
    (void)pupathlen;
    (void)wszpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetServiceLocation(JNIEnv* km_env, jclass km_clazz, jint hclient, jint uservicetype, jint uservicelocation, jlong wszissuancelicense, jlong puserviceurllength, jlong wszserviceurl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetServiceLocation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hclient, (uint32_t)uservicetype, (uint32_t)uservicelocation, (void*)(uintptr_t)wszissuancelicense, (void*)(uintptr_t)puserviceurllength, (void*)(uintptr_t)wszserviceurl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hclient;
    (void)uservicetype;
    (void)uservicelocation;
    (void)wszissuancelicense;
    (void)puserviceurllength;
    (void)wszserviceurl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetSignedIssuanceLicense(JNIEnv* km_env, jclass km_clazz, jint henv, jint hissuancelicense, jint uflags, jlong pbsymkey, jint cbsymkey, jlong wszsymkeytype, jlong wszclientlicensorcertificate, jlong pfncallback, jlong wszurl, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetSignedIssuanceLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (uint32_t)hissuancelicense, (uint32_t)uflags, (void*)(uintptr_t)pbsymkey, (uint32_t)cbsymkey, (void*)(uintptr_t)wszsymkeytype, (void*)(uintptr_t)wszclientlicensorcertificate, (void*)(uintptr_t)pfncallback, (void*)(uintptr_t)wszurl, (void*)(uintptr_t)pvcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)hissuancelicense;
    (void)uflags;
    (void)pbsymkey;
    (void)cbsymkey;
    (void)wszsymkeytype;
    (void)wszclientlicensorcertificate;
    (void)pfncallback;
    (void)wszurl;
    (void)pvcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetSignedIssuanceLicenseEx(JNIEnv* km_env, jclass km_clazz, jint henv, jint hissuancelicense, jint uflags, jlong pbsymkey, jint cbsymkey, jlong wszsymkeytype, jlong pvreserved, jint henablingprincipal, jint hboundlicenseclc, jlong pfncallback, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetSignedIssuanceLicenseEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (uint32_t)hissuancelicense, (uint32_t)uflags, (void*)(uintptr_t)pbsymkey, (uint32_t)cbsymkey, (void*)(uintptr_t)wszsymkeytype, (void*)(uintptr_t)pvreserved, (uint32_t)henablingprincipal, (uint32_t)hboundlicenseclc, (void*)(uintptr_t)pfncallback, (void*)(uintptr_t)pvcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)hissuancelicense;
    (void)uflags;
    (void)pbsymkey;
    (void)cbsymkey;
    (void)wszsymkeytype;
    (void)pvreserved;
    (void)henablingprincipal;
    (void)hboundlicenseclc;
    (void)pfncallback;
    (void)pvcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetTime(JNIEnv* km_env, jclass km_clazz, jint henv, jint etimeridtype, jlong potimeobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (int32_t)etimeridtype, (void*)(uintptr_t)potimeobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)etimeridtype;
    (void)potimeobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetUnboundLicenseAttribute(JNIEnv* km_env, jclass km_clazz, jint hqueryroot, jlong wszattributetype, jint iwhich, jlong peencoding, jlong pcbuffer, jlong pbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUnboundLicenseAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hqueryroot, (void*)(uintptr_t)wszattributetype, (uint32_t)iwhich, (void*)(uintptr_t)peencoding, (void*)(uintptr_t)pcbuffer, (void*)(uintptr_t)pbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueryroot;
    (void)wszattributetype;
    (void)iwhich;
    (void)peencoding;
    (void)pcbuffer;
    (void)pbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetUnboundLicenseAttributeCount(JNIEnv* km_env, jclass km_clazz, jint hqueryroot, jlong wszattributetype, jlong pcattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUnboundLicenseAttributeCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hqueryroot, (void*)(uintptr_t)wszattributetype, (void*)(uintptr_t)pcattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueryroot;
    (void)wszattributetype;
    (void)pcattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetUnboundLicenseObject(JNIEnv* km_env, jclass km_clazz, jint hqueryroot, jlong wszsubobjecttype, jint iindex, jlong phsubquery) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUnboundLicenseObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hqueryroot, (void*)(uintptr_t)wszsubobjecttype, (uint32_t)iindex, (void*)(uintptr_t)phsubquery);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueryroot;
    (void)wszsubobjecttype;
    (void)iindex;
    (void)phsubquery;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetUnboundLicenseObjectCount(JNIEnv* km_env, jclass km_clazz, jint hqueryroot, jlong wszsubobjecttype, jlong pcsubobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUnboundLicenseObjectCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hqueryroot, (void*)(uintptr_t)wszsubobjecttype, (void*)(uintptr_t)pcsubobjects);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueryroot;
    (void)wszsubobjecttype;
    (void)pcsubobjects;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetUsagePolicy(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint uindex, jlong peusagepolicytype, jlong pfexclusion, jlong punamelength, jlong wszname, jlong puminversionlength, jlong wszminversion, jlong pumaxversionlength, jlong wszmaxversion, jlong pupublickeylength, jlong wszpublickey, jlong pudigestalgorithmlength, jlong wszdigestalgorithm, jlong pcbdigest, jlong pbdigest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUsagePolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (uint32_t)uindex, (void*)(uintptr_t)peusagepolicytype, (void*)(uintptr_t)pfexclusion, (void*)(uintptr_t)punamelength, (void*)(uintptr_t)wszname, (void*)(uintptr_t)puminversionlength, (void*)(uintptr_t)wszminversion, (void*)(uintptr_t)pumaxversionlength, (void*)(uintptr_t)wszmaxversion, (void*)(uintptr_t)pupublickeylength, (void*)(uintptr_t)wszpublickey, (void*)(uintptr_t)pudigestalgorithmlength, (void*)(uintptr_t)wszdigestalgorithm, (void*)(uintptr_t)pcbdigest, (void*)(uintptr_t)pbdigest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)uindex;
    (void)peusagepolicytype;
    (void)pfexclusion;
    (void)punamelength;
    (void)wszname;
    (void)puminversionlength;
    (void)wszminversion;
    (void)pumaxversionlength;
    (void)wszmaxversion;
    (void)pupublickeylength;
    (void)wszpublickey;
    (void)pudigestalgorithmlength;
    (void)wszdigestalgorithm;
    (void)pcbdigest;
    (void)pbdigest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetUserInfo(JNIEnv* km_env, jclass km_clazz, jint huser, jlong puusernamelength, jlong wszusername, jlong puuseridlength, jlong wszuserid, jlong puuseridtypelength, jlong wszuseridtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUserInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)huser, (void*)(uintptr_t)puusernamelength, (void*)(uintptr_t)wszusername, (void*)(uintptr_t)puuseridlength, (void*)(uintptr_t)wszuserid, (void*)(uintptr_t)puuseridtypelength, (void*)(uintptr_t)wszuseridtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)huser;
    (void)puusernamelength;
    (void)wszusername;
    (void)puuseridlength;
    (void)wszuserid;
    (void)puuseridtypelength;
    (void)wszuseridtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetUserRights(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint huser, jint uindex, jlong phright) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUserRights");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (uint32_t)huser, (uint32_t)uindex, (void*)(uintptr_t)phright);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)huser;
    (void)uindex;
    (void)phright;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMGetUsers(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint uindex, jlong phuser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMGetUsers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (uint32_t)uindex, (void*)(uintptr_t)phuser);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)uindex;
    (void)phuser;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMInitEnvironment(JNIEnv* km_env, jclass km_clazz, jint esecurityprovidertype, jint especification, jlong wszsecurityprovider, jlong wszmanifestcredentials, jlong wszmachinecredentials, jlong phenv, jlong phdefaultlibrary) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMInitEnvironment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)esecurityprovidertype, (int32_t)especification, (void*)(uintptr_t)wszsecurityprovider, (void*)(uintptr_t)wszmanifestcredentials, (void*)(uintptr_t)wszmachinecredentials, (void*)(uintptr_t)phenv, (void*)(uintptr_t)phdefaultlibrary);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)esecurityprovidertype;
    (void)especification;
    (void)wszsecurityprovider;
    (void)wszmanifestcredentials;
    (void)wszmachinecredentials;
    (void)phenv;
    (void)phdefaultlibrary;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMIsActivated(JNIEnv* km_env, jclass km_clazz, jint hclient, jint uflags, jlong pactservinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMIsActivated");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hclient, (uint32_t)uflags, (void*)(uintptr_t)pactservinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hclient;
    (void)uflags;
    (void)pactservinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMIsWindowProtected(JNIEnv* km_env, jclass km_clazz, jlong hwnd, jlong pfprotected) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMIsWindowProtected");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd, (void*)(uintptr_t)pfprotected);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hwnd;
    (void)pfprotected;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMLoadLibrary(JNIEnv* km_env, jclass km_clazz, jint henv, jint especification, jlong wszlibraryprovider, jlong wszcredentials, jlong phlibrary) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMLoadLibrary");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (int32_t)especification, (void*)(uintptr_t)wszlibraryprovider, (void*)(uintptr_t)wszcredentials, (void*)(uintptr_t)phlibrary);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)especification;
    (void)wszlibraryprovider;
    (void)wszcredentials;
    (void)phlibrary;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMParseUnboundLicense(JNIEnv* km_env, jclass km_clazz, jlong wszcertificate, jlong phqueryroot) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMParseUnboundLicense");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszcertificate, (void*)(uintptr_t)phqueryroot);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszcertificate;
    (void)phqueryroot;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMRegisterContent(JNIEnv* km_env, jclass km_clazz, jint fregister) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMRegisterContent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fregister);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fregister;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMRegisterProtectedWindow(JNIEnv* km_env, jclass km_clazz, jint henv, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMRegisterProtectedWindow");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)hwnd;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMRegisterRevocationList(JNIEnv* km_env, jclass km_clazz, jint henv, jlong wszrevocationlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMRegisterRevocationList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)henv, (void*)(uintptr_t)wszrevocationlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henv;
    (void)wszrevocationlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMRepair(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMRepair");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMSetApplicationSpecificData(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint fdelete, jlong wszname, jlong wszvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetApplicationSpecificData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (int32_t)fdelete, (void*)(uintptr_t)wszname, (void*)(uintptr_t)wszvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)fdelete;
    (void)wszname;
    (void)wszvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMSetGlobalOptions(JNIEnv* km_env, jclass km_clazz, jint eglobaloptions, jlong pvdata, jint dwlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetGlobalOptions");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)eglobaloptions, (void*)(uintptr_t)pvdata, (uint32_t)dwlen);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)eglobaloptions;
    (void)pvdata;
    (void)dwlen;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMSetIntervalTime(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint cdays) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetIntervalTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (uint32_t)cdays);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)cdays;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMSetMetaData(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jlong wszcontentid, jlong wszcontentidtype, jlong wszskuid, jlong wszskuidtype, jlong wszcontenttype, jlong wszcontentname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetMetaData");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (void*)(uintptr_t)wszcontentid, (void*)(uintptr_t)wszcontentidtype, (void*)(uintptr_t)wszskuid, (void*)(uintptr_t)wszskuidtype, (void*)(uintptr_t)wszcontenttype, (void*)(uintptr_t)wszcontentname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)wszcontentid;
    (void)wszcontentidtype;
    (void)wszskuid;
    (void)wszskuidtype;
    (void)wszcontenttype;
    (void)wszcontentname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMSetNameAndDescription(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint fdelete, jint lcid, jlong wszname, jlong wszdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetNameAndDescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (int32_t)fdelete, (uint32_t)lcid, (void*)(uintptr_t)wszname, (void*)(uintptr_t)wszdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)fdelete;
    (void)lcid;
    (void)wszname;
    (void)wszdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMSetRevocationPoint(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint fdelete, jlong wszid, jlong wszidtype, jlong wszurl, jlong pstfrequency, jlong wszname, jlong wszpublickey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetRevocationPoint");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (int32_t)fdelete, (void*)(uintptr_t)wszid, (void*)(uintptr_t)wszidtype, (void*)(uintptr_t)wszurl, (void*)(uintptr_t)pstfrequency, (void*)(uintptr_t)wszname, (void*)(uintptr_t)wszpublickey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)fdelete;
    (void)wszid;
    (void)wszidtype;
    (void)wszurl;
    (void)pstfrequency;
    (void)wszname;
    (void)wszpublickey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMSetUsagePolicy(JNIEnv* km_env, jclass km_clazz, jint hissuancelicense, jint eusagepolicytype, jint fdelete, jint fexclusion, jlong wszname, jlong wszminversion, jlong wszmaxversion, jlong wszpublickey, jlong wszdigestalgorithm, jlong pbdigest, jint cbdigest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, int32_t, int32_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMSetUsagePolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)hissuancelicense, (int32_t)eusagepolicytype, (int32_t)fdelete, (int32_t)fexclusion, (void*)(uintptr_t)wszname, (void*)(uintptr_t)wszminversion, (void*)(uintptr_t)wszmaxversion, (void*)(uintptr_t)wszpublickey, (void*)(uintptr_t)wszdigestalgorithm, (void*)(uintptr_t)pbdigest, (uint32_t)cbdigest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hissuancelicense;
    (void)eusagepolicytype;
    (void)fdelete;
    (void)fexclusion;
    (void)wszname;
    (void)wszminversion;
    (void)wszmaxversion;
    (void)wszpublickey;
    (void)wszdigestalgorithm;
    (void)pbdigest;
    (void)cbdigest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_data_rightsmanagement_WindowsWin32DataRightsmanagementJniBridge_windowssys_1windows_1win32_1data_1rightsmanagement_1dRMVerify(JNIEnv* km_env, jclass km_clazz, jlong wszdata, jlong pcattesteddata, jlong wszattesteddata, jlong petype, jlong pcprincipal, jlong wszprincipal, jlong pcmanifest, jlong wszmanifest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("msdrm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DRMVerify");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszdata, (void*)(uintptr_t)pcattesteddata, (void*)(uintptr_t)wszattesteddata, (void*)(uintptr_t)petype, (void*)(uintptr_t)pcprincipal, (void*)(uintptr_t)wszprincipal, (void*)(uintptr_t)pcmanifest, (void*)(uintptr_t)wszmanifest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszdata;
    (void)pcattesteddata;
    (void)wszattesteddata;
    (void)petype;
    (void)pcprincipal;
    (void)wszprincipal;
    (void)pcmanifest;
    (void)wszmanifest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

