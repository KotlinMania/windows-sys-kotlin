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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupClose(JNIEnv* km_env, jclass km_clazz, jlong hbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc) : -1;
#else
    (void)hbc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupEnd(JNIEnv* km_env, jclass km_clazz, jlong hbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupEnd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc) : -1;
#else
    (void)hbc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupFree(JNIEnv* km_env, jclass km_clazz, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pv);
#else
    (void)pv;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupGetBackupLogsW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong ppwszzbackuplogfiles, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupGetBackupLogsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)ppwszzbackuplogfiles, (void*)(uintptr_t)pcbsize) : -1;
#else
    (void)hbc;
    (void)ppwszzbackuplogfiles;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupGetDatabaseNamesW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong ppwszzattachmentinformation, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupGetDatabaseNamesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)ppwszzattachmentinformation, (void*)(uintptr_t)pcbsize) : -1;
#else
    (void)hbc;
    (void)ppwszzattachmentinformation;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupGetDynamicFileListW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong ppwszzfilelist, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupGetDynamicFileListW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)ppwszzfilelist, (void*)(uintptr_t)pcbsize) : -1;
#else
    (void)hbc;
    (void)ppwszzfilelist;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupOpenFileW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong pwszattachmentname, jint cbreadhintsize, jlong plifilesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupOpenFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)pwszattachmentname, (uint32_t)cbreadhintsize, (void*)(uintptr_t)plifilesize) : -1;
#else
    (void)hbc;
    (void)pwszattachmentname;
    (void)cbreadhintsize;
    (void)plifilesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupPrepareW(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jint grbitjet, jint dwbackupflags, jlong phbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupPrepareW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszservername, (uint32_t)grbitjet, (uint32_t)dwbackupflags, (void*)(uintptr_t)phbc) : -1;
#else
    (void)pwszservername;
    (void)grbitjet;
    (void)dwbackupflags;
    (void)phbc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupRead(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong pvbuffer, jint cbbuffer, jlong pcbread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupRead");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)pvbuffer, (uint32_t)cbbuffer, (void*)(uintptr_t)pcbread) : -1;
#else
    (void)hbc;
    (void)pvbuffer;
    (void)cbbuffer;
    (void)pcbread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvBackupTruncateLogs(JNIEnv* km_env, jclass km_clazz, jlong hbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupTruncateLogs");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc) : -1;
#else
    (void)hbc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvIsServerOnlineW(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jlong pfserveronline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvIsServerOnlineW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszservername, (void*)(uintptr_t)pfserveronline) : -1;
#else
    (void)pwszservername;
    (void)pfserveronline;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvRestoreEnd(JNIEnv* km_env, jclass km_clazz, jlong hbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreEnd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc) : -1;
#else
    (void)hbc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvRestoreGetDatabaseLocationsW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong ppwszzdatabaselocationlist, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreGetDatabaseLocationsW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)ppwszzdatabaselocationlist, (void*)(uintptr_t)pcbsize) : -1;
#else
    (void)hbc;
    (void)ppwszzdatabaselocationlist;
    (void)pcbsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvRestorePrepareW(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jint dwrestoreflags, jlong phbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestorePrepareW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszservername, (uint32_t)dwrestoreflags, (void*)(uintptr_t)phbc) : -1;
#else
    (void)pwszservername;
    (void)dwrestoreflags;
    (void)phbc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvRestoreRegisterComplete(JNIEnv* km_env, jclass km_clazz, jlong hbc, jint hrrestorestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreRegisterComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc, (int32_t)hrrestorestate) : -1;
#else
    (void)hbc;
    (void)hrrestorestate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvRestoreRegisterThroughFile(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong pwszcheckpointfilepath, jlong pwszlogpath, jlong rgrstmap, jint crstmap, jlong pwszbackuplogpath, jint genlow, jint genhigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreRegisterThroughFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)pwszcheckpointfilepath, (void*)(uintptr_t)pwszlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstmap, (void*)(uintptr_t)pwszbackuplogpath, (uint32_t)genlow, (uint32_t)genhigh) : -1;
#else
    (void)hbc;
    (void)pwszcheckpointfilepath;
    (void)pwszlogpath;
    (void)rgrstmap;
    (void)crstmap;
    (void)pwszbackuplogpath;
    (void)genlow;
    (void)genhigh;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvRestoreRegisterW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong pwszcheckpointfilepath, jlong pwszlogpath, jlong rgrstmap, jint crstmap, jlong pwszbackuplogpath, jint genlow, jint genhigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreRegisterW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)pwszcheckpointfilepath, (void*)(uintptr_t)pwszlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstmap, (void*)(uintptr_t)pwszbackuplogpath, (uint32_t)genlow, (uint32_t)genhigh) : -1;
#else
    (void)hbc;
    (void)pwszcheckpointfilepath;
    (void)pwszlogpath;
    (void)rgrstmap;
    (void)crstmap;
    (void)pwszbackuplogpath;
    (void)genlow;
    (void)genhigh;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1CertSrvServerControlW(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jint dwcontrolflags, jlong pcbout, jlong ppbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvServerControlW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszservername, (uint32_t)dwcontrolflags, (void*)(uintptr_t)pcbout, (void*)(uintptr_t)ppbout) : -1;
#else
    (void)pwszservername;
    (void)dwcontrolflags;
    (void)pcbout;
    (void)ppbout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1PstAcquirePrivateKey(JNIEnv* km_env, jclass km_clazz, jlong pcert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstAcquirePrivateKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcert) : -1;
#else
    (void)pcert;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1PstGetCertificateChain(JNIEnv* km_env, jclass km_clazz, jlong pcert, jlong ptrustedissuers, jlong ppcertchaincontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetCertificateChain");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcert, (void*)(uintptr_t)ptrustedissuers, (void*)(uintptr_t)ppcertchaincontext) : -1;
#else
    (void)pcert;
    (void)ptrustedissuers;
    (void)ppcertchaincontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1PstGetCertificates(JNIEnv* km_env, jclass km_clazz, jlong ptargetname, jint ccriteria, jlong rgpcriteria, jint bisclient, jlong pdwcertchaincontextcount, jlong ppcertchaincontexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetCertificates");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptargetname, (uint32_t)ccriteria, (void*)(uintptr_t)rgpcriteria, (int32_t)bisclient, (void*)(uintptr_t)pdwcertchaincontextcount, (void*)(uintptr_t)ppcertchaincontexts) : -1;
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)bisclient;
    (void)pdwcertchaincontextcount;
    (void)ppcertchaincontexts;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1PstGetTrustAnchors(JNIEnv* km_env, jclass km_clazz, jlong ptargetname, jint ccriteria, jlong rgpcriteria, jlong pptrustedissuers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetTrustAnchors");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptargetname, (uint32_t)ccriteria, (void*)(uintptr_t)rgpcriteria, (void*)(uintptr_t)pptrustedissuers) : -1;
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)pptrustedissuers;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1PstGetTrustAnchorsEx(JNIEnv* km_env, jclass km_clazz, jlong ptargetname, jint ccriteria, jlong rgpcriteria, jlong pcertcontext, jlong pptrustedissuers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetTrustAnchorsEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptargetname, (uint32_t)ccriteria, (void*)(uintptr_t)rgpcriteria, (void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)pptrustedissuers) : -1;
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)pcertcontext;
    (void)pptrustedissuers;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1PstGetUserNameForCertificate(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetUserNameForCertificate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)username) : -1;
#else
    (void)pcertcontext;
    (void)username;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1PstMapCertificate(JNIEnv* km_env, jclass km_clazz, jlong pcert, jlong ptokeninformationtype, jlong pptokeninformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstMapCertificate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcert, (void*)(uintptr_t)ptokeninformationtype, (void*)(uintptr_t)pptokeninformation) : -1;
#else
    (void)pcert;
    (void)ptokeninformationtype;
    (void)pptokeninformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssys_1windows_1win32_1security_1cryptography_1certificates_1PstValidate(JNIEnv* km_env, jclass km_clazz, jlong ptargetname, jint bisclient, jlong prequestedissuancepolicy, jlong phadditionalcertstore, jlong pcert, jlong pprovguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstValidate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ptargetname, (int32_t)bisclient, (void*)(uintptr_t)prequestedissuancepolicy, (void*)(uintptr_t)phadditionalcertstore, (void*)(uintptr_t)pcert, (void*)(uintptr_t)pprovguid) : -1;
#else
    (void)ptargetname;
    (void)bisclient;
    (void)prequestedissuancepolicy;
    (void)phadditionalcertstore;
    (void)pcert;
    (void)pprovguid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

