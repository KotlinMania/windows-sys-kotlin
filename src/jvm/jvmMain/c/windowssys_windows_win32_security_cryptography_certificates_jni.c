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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupClose(JNIEnv* km_env, jclass km_clazz, jlong hbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupClose");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupEnd(JNIEnv* km_env, jclass km_clazz, jlong hbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupEnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupFree(JNIEnv* km_env, jclass km_clazz, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pv);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pv;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetBackupLogsW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong ppwszzbackuplogfiles, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupGetBackupLogsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)ppwszzbackuplogfiles, (void*)(uintptr_t)pcbsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    (void)ppwszzbackuplogfiles;
    (void)pcbsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDatabaseNamesW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong ppwszzattachmentinformation, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupGetDatabaseNamesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)ppwszzattachmentinformation, (void*)(uintptr_t)pcbsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    (void)ppwszzattachmentinformation;
    (void)pcbsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupGetDynamicFileListW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong ppwszzfilelist, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupGetDynamicFileListW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)ppwszzfilelist, (void*)(uintptr_t)pcbsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    (void)ppwszzfilelist;
    (void)pcbsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupOpenFileW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong pwszattachmentname, jint cbreadhintsize, jlong plifilesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupOpenFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)pwszattachmentname, (uint32_t)cbreadhintsize, (void*)(uintptr_t)plifilesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    (void)pwszattachmentname;
    (void)cbreadhintsize;
    (void)plifilesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupPrepareW(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jint grbitjet, jint dwbackupflags, jlong phbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupPrepareW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszservername, (uint32_t)grbitjet, (uint32_t)dwbackupflags, (void*)(uintptr_t)phbc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszservername;
    (void)grbitjet;
    (void)dwbackupflags;
    (void)phbc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupRead(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong pvbuffer, jint cbbuffer, jlong pcbread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupRead");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)pvbuffer, (uint32_t)cbbuffer, (void*)(uintptr_t)pcbread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    (void)pvbuffer;
    (void)cbbuffer;
    (void)pcbread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvBackupTruncateLogs(JNIEnv* km_env, jclass km_clazz, jlong hbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupTruncateLogs");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvIsServerOnlineW(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jlong pfserveronline) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvIsServerOnlineW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszservername, (void*)(uintptr_t)pfserveronline);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszservername;
    (void)pfserveronline;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreEnd(JNIEnv* km_env, jclass km_clazz, jlong hbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreEnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreGetDatabaseLocationsW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong ppwszzdatabaselocationlist, jlong pcbsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreGetDatabaseLocationsW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)ppwszzdatabaselocationlist, (void*)(uintptr_t)pcbsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    (void)ppwszzdatabaselocationlist;
    (void)pcbsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestorePrepareW(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jint dwrestoreflags, jlong phbc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestorePrepareW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszservername, (uint32_t)dwrestoreflags, (void*)(uintptr_t)phbc);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszservername;
    (void)dwrestoreflags;
    (void)phbc;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterComplete(JNIEnv* km_env, jclass km_clazz, jlong hbc, jint hrrestorestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreRegisterComplete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc, (int32_t)hrrestorestate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    (void)hrrestorestate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterThroughFile(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong pwszcheckpointfilepath, jlong pwszlogpath, jlong rgrstmap, jint crstmap, jlong pwszbackuplogpath, jint genlow, jint genhigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreRegisterThroughFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)pwszcheckpointfilepath, (void*)(uintptr_t)pwszlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstmap, (void*)(uintptr_t)pwszbackuplogpath, (uint32_t)genlow, (uint32_t)genhigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    (void)pwszcheckpointfilepath;
    (void)pwszlogpath;
    (void)rgrstmap;
    (void)crstmap;
    (void)pwszbackuplogpath;
    (void)genlow;
    (void)genhigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvRestoreRegisterW(JNIEnv* km_env, jclass km_clazz, jlong hbc, jlong pwszcheckpointfilepath, jlong pwszlogpath, jlong rgrstmap, jint crstmap, jlong pwszbackuplogpath, jint genlow, jint genhigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreRegisterW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hbc, (void*)(uintptr_t)pwszcheckpointfilepath, (void*)(uintptr_t)pwszlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstmap, (void*)(uintptr_t)pwszbackuplogpath, (uint32_t)genlow, (uint32_t)genhigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hbc;
    (void)pwszcheckpointfilepath;
    (void)pwszlogpath;
    (void)rgrstmap;
    (void)crstmap;
    (void)pwszbackuplogpath;
    (void)genlow;
    (void)genhigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesCertSrvServerControlW(JNIEnv* km_env, jclass km_clazz, jlong pwszservername, jint dwcontrolflags, jlong pcbout, jlong ppbout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvServerControlW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pwszservername, (uint32_t)dwcontrolflags, (void*)(uintptr_t)pcbout, (void*)(uintptr_t)ppbout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwszservername;
    (void)dwcontrolflags;
    (void)pcbout;
    (void)ppbout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesPstAcquirePrivateKey(JNIEnv* km_env, jclass km_clazz, jlong pcert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstAcquirePrivateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcert);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcert;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificateChain(JNIEnv* km_env, jclass km_clazz, jlong pcert, jlong ptrustedissuers, jlong ppcertchaincontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetCertificateChain");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcert, (void*)(uintptr_t)ptrustedissuers, (void*)(uintptr_t)ppcertchaincontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcert;
    (void)ptrustedissuers;
    (void)ppcertchaincontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesPstGetCertificates(JNIEnv* km_env, jclass km_clazz, jlong ptargetname, jint ccriteria, jlong rgpcriteria, jint bisclient, jlong pdwcertchaincontextcount, jlong ppcertchaincontexts) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetCertificates");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptargetname, (uint32_t)ccriteria, (void*)(uintptr_t)rgpcriteria, (int32_t)bisclient, (void*)(uintptr_t)pdwcertchaincontextcount, (void*)(uintptr_t)ppcertchaincontexts);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)bisclient;
    (void)pdwcertchaincontextcount;
    (void)ppcertchaincontexts;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchors(JNIEnv* km_env, jclass km_clazz, jlong ptargetname, jint ccriteria, jlong rgpcriteria, jlong pptrustedissuers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetTrustAnchors");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptargetname, (uint32_t)ccriteria, (void*)(uintptr_t)rgpcriteria, (void*)(uintptr_t)pptrustedissuers);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)pptrustedissuers;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesPstGetTrustAnchorsEx(JNIEnv* km_env, jclass km_clazz, jlong ptargetname, jint ccriteria, jlong rgpcriteria, jlong pcertcontext, jlong pptrustedissuers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetTrustAnchorsEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptargetname, (uint32_t)ccriteria, (void*)(uintptr_t)rgpcriteria, (void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)pptrustedissuers);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)pcertcontext;
    (void)pptrustedissuers;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesPstGetUserNameForCertificate(JNIEnv* km_env, jclass km_clazz, jlong pcertcontext, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetUserNameForCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcertcontext, (void*)(uintptr_t)username);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcertcontext;
    (void)username;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesPstMapCertificate(JNIEnv* km_env, jclass km_clazz, jlong pcert, jlong ptokeninformationtype, jlong pptokeninformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstMapCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcert, (void*)(uintptr_t)ptokeninformationtype, (void*)(uintptr_t)pptokeninformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcert;
    (void)ptokeninformationtype;
    (void)pptokeninformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_cryptography_certificates_WindowsWin32SecurityCryptographyCertificatesJniBridge_windowssysWindowsWin32SecurityCryptographyCertificatesPstValidate(JNIEnv* km_env, jclass km_clazz, jlong ptargetname, jint bisclient, jlong prequestedissuancepolicy, jlong phadditionalcertstore, jlong pcert, jlong pprovguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstValidate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ptargetname, (int32_t)bisclient, (void*)(uintptr_t)prequestedissuancepolicy, (void*)(uintptr_t)phadditionalcertstore, (void*)(uintptr_t)pcert, (void*)(uintptr_t)pprovguid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptargetname;
    (void)bisclient;
    (void)prequestedissuancepolicy;
    (void)phadditionalcertstore;
    (void)pcert;
    (void)pprovguid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

