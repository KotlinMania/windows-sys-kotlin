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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetAddColumnA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jlong pcolumndef, jlong pvdefault, jint cbdefault, jlong pcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAddColumnA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pcolumndef, (void*)(uintptr_t)pvdefault, (uint32_t)cbdefault, (void*)(uintptr_t)pcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetAddColumnW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jlong pcolumndef, jlong pvdefault, jint cbdefault, jlong pcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAddColumnW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pcolumndef, (void*)(uintptr_t)pvdefault, (uint32_t)cbdefault, (void*)(uintptr_t)pcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetAttachDatabase2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint cpgdatabasesizemax, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabase2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)cpgdatabasesizemax, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetAttachDatabase2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint cpgdatabasesizemax, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabase2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)cpgdatabasesizemax, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetAttachDatabaseA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabaseA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetAttachDatabaseW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabaseW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBackupA(JNIEnv* km_env, jclass km_clazz, jlong szbackuppath, jint grbit, jlong pfnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szbackuppath, (uint32_t)grbit, (void*)(uintptr_t)pfnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBackupInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szbackuppath, jint grbit, jlong pfnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupInstanceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szbackuppath, (uint32_t)grbit, (void*)(uintptr_t)pfnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBackupInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szbackuppath, jint grbit, jlong pfnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupInstanceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szbackuppath, (uint32_t)grbit, (void*)(uintptr_t)pfnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBackupW(JNIEnv* km_env, jclass km_clazz, jlong szbackuppath, jint grbit, jlong pfnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szbackuppath, (uint32_t)grbit, (void*)(uintptr_t)pfnstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBeginExternalBackup(JNIEnv* km_env, jclass km_clazz, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginExternalBackup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginExternalBackupInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBeginSessionA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong psesid, jlong szusername, jlong szpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginSessionA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)psesid, (void*)(uintptr_t)szusername, (void*)(uintptr_t)szpassword);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBeginSessionW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong psesid, jlong szusername, jlong szpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginSessionW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)psesid, (void*)(uintptr_t)szusername, (void*)(uintptr_t)szpassword);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBeginTransaction(JNIEnv* km_env, jclass km_clazz, jlong sesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBeginTransaction2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginTransaction2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetBeginTransaction3(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong trxid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginTransaction3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (int64_t)trxid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)trxid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCloseDatabase(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseDatabase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCloseFile(JNIEnv* km_env, jclass km_clazz, jlong hffile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hffile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hffile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCloseFileInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong hffile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseFileInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (uint64_t)hffile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)hffile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCloseTable(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseTable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCommitTransaction(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCommitTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCommitTransaction2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit, jint cmsecdurablecommit, jlong pcommitid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCommitTransaction2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)grbit, (uint32_t)cmsecdurablecommit, (void*)(uintptr_t)pcommitid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    (void)cmsecdurablecommit;
    (void)pcommitid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCompactA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasesrc, jlong szdatabasedest, jlong pfnstatus, jlong pconvert, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCompactA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasesrc, (void*)(uintptr_t)szdatabasedest, (void*)(uintptr_t)pfnstatus, (void*)(uintptr_t)pconvert, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCompactW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasesrc, jlong szdatabasedest, jlong pfnstatus, jlong pconvert, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCompactW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasesrc, (void*)(uintptr_t)szdatabasedest, (void*)(uintptr_t)pfnstatus, (void*)(uintptr_t)pconvert, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetComputeStats(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetComputeStats");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(JNIEnv* km_env, jclass km_clazz, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetConfigureProcessForCrashDump");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateDatabase2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint cpgdatabasesizemax, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabase2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)cpgdatabasesizemax, (void*)(uintptr_t)pdbid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateDatabase2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint cpgdatabasesizemax, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabase2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)cpgdatabasesizemax, (void*)(uintptr_t)pdbid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateDatabaseA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jlong szconnect, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabaseA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szconnect, (void*)(uintptr_t)pdbid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateDatabaseW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jlong szconnect, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabaseW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szconnect, (void*)(uintptr_t)pdbid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateIndex2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateIndex2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateIndex3A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex3A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateIndex3W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex3W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateIndex4A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex4A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateIndex4W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex4W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit, jlong szkey, jint cbkey, jint ldensity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndexA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit, (void*)(uintptr_t)szkey, (uint32_t)cbkey, (uint32_t)ldensity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit, jlong szkey, jint cbkey, jint ldensity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndexW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit, (void*)(uintptr_t)szkey, (uint32_t)cbkey, (uint32_t)ldensity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateInstance2A(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong szinstancename, jlong szdisplayname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstance2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)szinstancename, (void*)(uintptr_t)szdisplayname, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateInstance2W(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong szinstancename, jlong szdisplayname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstance2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)szinstancename, (void*)(uintptr_t)szdisplayname, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateInstanceA(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong szinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstanceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)szinstancename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)szinstancename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateInstanceW(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong szinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstanceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)szinstancename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)szinstancename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jint lpages, jint ldensity, jlong ptableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (uint32_t)lpages, (uint32_t)ldensity, (void*)(uintptr_t)ptableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex3A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex3W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex4A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex4W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndexA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndexW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetCreateTableW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jint lpages, jint ldensity, jlong ptableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (uint32_t)lpages, (uint32_t)ldensity, (void*)(uintptr_t)ptableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDefragment2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcpasses, jlong pcseconds, jlong callback, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (void*)(uintptr_t)callback, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDefragment2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcpasses, jlong pcseconds, jlong callback, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (void*)(uintptr_t)callback, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDefragment3A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasename, jlong sztablename, jlong pcpasses, jlong pcseconds, jlong callback, jlong pvcontext, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment3A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasename, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (void*)(uintptr_t)callback, (void*)(uintptr_t)pvcontext, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasename;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)pvcontext;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDefragment3W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasename, jlong sztablename, jlong pcpasses, jlong pcseconds, jlong callback, jlong pvcontext, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment3W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasename, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (void*)(uintptr_t)callback, (void*)(uintptr_t)pvcontext, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasename;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)pvcontext;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDefragmentA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcpasses, jlong pcseconds, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragmentA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDefragmentW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcpasses, jlong pcseconds, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragmentW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDelete(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDelete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDeleteColumn2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumn2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDeleteColumn2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumn2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDeleteColumnA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumnA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDeleteColumnW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumnW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDeleteIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteIndexA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDeleteIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteIndexW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDeleteTableA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteTableA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDeleteTableW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteTableW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDetachDatabase2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabase2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDetachDatabase2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabase2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDetachDatabaseA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabaseA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDetachDatabaseW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabaseW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDupCursor(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong ptableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDupCursor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)ptableid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)ptableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetDupSession(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong psesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDupSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)psesid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)psesid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetEnableMultiInstanceA(JNIEnv* km_env, jclass km_clazz, jlong psetsysparam, jint csetsysparam, jlong pcsetsucceed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEnableMultiInstanceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psetsysparam, (uint32_t)csetsysparam, (void*)(uintptr_t)pcsetsucceed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetEnableMultiInstanceW(JNIEnv* km_env, jclass km_clazz, jlong psetsysparam, jint csetsysparam, jlong pcsetsucceed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEnableMultiInstanceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psetsysparam, (uint32_t)csetsysparam, (void*)(uintptr_t)pcsetsucceed);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetEndExternalBackup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndExternalBackup");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetEndExternalBackupInstance(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndExternalBackupInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(JNIEnv* km_env, jclass km_clazz, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndExternalBackupInstance2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetEndSession(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetEnumerateColumns(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint cenumcolumnid, jlong rgenumcolumnid, jlong pcenumcolumn, jlong prgenumcolumn, jlong pfnrealloc, jlong pvrealloccontext, jint cbdatamost, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEnumerateColumns");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)cenumcolumnid, (void*)(uintptr_t)rgenumcolumnid, (void*)(uintptr_t)pcenumcolumn, (void*)(uintptr_t)prgenumcolumn, (void*)(uintptr_t)pfnrealloc, (void*)(uintptr_t)pvrealloccontext, (uint32_t)cbdatamost, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)cenumcolumnid;
    (void)rgenumcolumnid;
    (void)pcenumcolumn;
    (void)prgenumcolumn;
    (void)pfnrealloc;
    (void)pvrealloccontext;
    (void)cbdatamost;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetEscrowUpdate(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint columnid, jlong pv, jint cbmax, jlong pvold, jint cboldmax, jlong pcboldactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEscrowUpdate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)columnid, (void*)(uintptr_t)pv, (uint32_t)cbmax, (void*)(uintptr_t)pvold, (uint32_t)cboldmax, (void*)(uintptr_t)pcboldactual, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pv;
    (void)cbmax;
    (void)pvold;
    (void)cboldmax;
    (void)pcboldactual;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetExternalRestore2A(JNIEnv* km_env, jclass km_clazz, jlong szcheckpointfilepath, jlong szlogpath, jlong rgrstmap, jint crstfilemap, jlong szbackuplogpath, jlong ploginfo, jlong sztargetinstancename, jlong sztargetinstancelogpath, jlong sztargetinstancecheckpointpath, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestore2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szcheckpointfilepath, (void*)(uintptr_t)szlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstfilemap, (void*)(uintptr_t)szbackuplogpath, (void*)(uintptr_t)ploginfo, (void*)(uintptr_t)sztargetinstancename, (void*)(uintptr_t)sztargetinstancelogpath, (void*)(uintptr_t)sztargetinstancecheckpointpath, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)ploginfo;
    (void)sztargetinstancename;
    (void)sztargetinstancelogpath;
    (void)sztargetinstancecheckpointpath;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetExternalRestore2W(JNIEnv* km_env, jclass km_clazz, jlong szcheckpointfilepath, jlong szlogpath, jlong rgrstmap, jint crstfilemap, jlong szbackuplogpath, jlong ploginfo, jlong sztargetinstancename, jlong sztargetinstancelogpath, jlong sztargetinstancecheckpointpath, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestore2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szcheckpointfilepath, (void*)(uintptr_t)szlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstfilemap, (void*)(uintptr_t)szbackuplogpath, (void*)(uintptr_t)ploginfo, (void*)(uintptr_t)sztargetinstancename, (void*)(uintptr_t)sztargetinstancelogpath, (void*)(uintptr_t)sztargetinstancecheckpointpath, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)ploginfo;
    (void)sztargetinstancename;
    (void)sztargetinstancelogpath;
    (void)sztargetinstancecheckpointpath;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetExternalRestoreA(JNIEnv* km_env, jclass km_clazz, jlong szcheckpointfilepath, jlong szlogpath, jlong rgrstmap, jint crstfilemap, jlong szbackuplogpath, jint genlow, jint genhigh, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestoreA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szcheckpointfilepath, (void*)(uintptr_t)szlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstfilemap, (void*)(uintptr_t)szbackuplogpath, (int32_t)genlow, (int32_t)genhigh, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)genlow;
    (void)genhigh;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetExternalRestoreW(JNIEnv* km_env, jclass km_clazz, jlong szcheckpointfilepath, jlong szlogpath, jlong rgrstmap, jint crstfilemap, jlong szbackuplogpath, jint genlow, jint genhigh, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestoreW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szcheckpointfilepath, (void*)(uintptr_t)szlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstfilemap, (void*)(uintptr_t)szbackuplogpath, (int32_t)genlow, (int32_t)genhigh, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)genlow;
    (void)genhigh;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong pbbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetFreeBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pbbuf);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pbbuf;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetAttachInfoA(JNIEnv* km_env, jclass km_clazz, jlong szzdatabases, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szzdatabases, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzdatabases, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoInstanceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzdatabases, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzdatabases, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoInstanceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzdatabases, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetAttachInfoW(JNIEnv* km_env, jclass km_clazz, jlong wszzdatabases, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)wszzdatabases, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)wszzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetBookmark(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvbookmark, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetBookmark");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvbookmark, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetColumnInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcolumnnameorid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetColumnInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcolumnnameorid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetColumnInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pwcolumnnameorid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetColumnInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pwcolumnnameorid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pwcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetCurrentIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint cbindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetCurrentIndexA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)cbindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetCurrentIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint cbindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetCurrentIndexW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)cbindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetCursorInfo(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetCursorInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA(JNIEnv* km_env, jclass km_clazz, jlong szdatabasename, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseFileInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatabasename, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW(JNIEnv* km_env, jclass km_clazz, jlong szdatabasename, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseFileInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szdatabasename, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetDatabaseInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetDatabaseInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetErrorInfoW(JNIEnv* km_env, jclass km_clazz, jlong pvcontext, jlong pvresult, jint cbmax, jint infolevel, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetErrorInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvcontext, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvcontext;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetIndexInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong szindexname, jlong pvresult, jint cbresult, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetIndexInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pvresult, (uint32_t)cbresult, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetIndexInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong szindexname, jlong pvresult, jint cbresult, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetIndexInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pvresult, (uint32_t)cbresult, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetInstanceInfoA(JNIEnv* km_env, jclass km_clazz, jlong pcinstanceinfo, jlong painstanceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetInstanceInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetInstanceInfoW(JNIEnv* km_env, jclass km_clazz, jlong pcinstanceinfo, jlong painstanceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetInstanceInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetInstanceMiscInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetLS(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pls, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pls, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pls;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetLock(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetLogInfoA(JNIEnv* km_env, jclass km_clazz, jlong szzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzlogs, jint cbmax, jlong pcbactual, jlong ploginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstance2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual, (void*)(uintptr_t)ploginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong wszzlogs, jint cbmax, jlong pcbactual, jlong ploginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstance2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)wszzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual, (void*)(uintptr_t)ploginfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstanceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong wszzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstanceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)wszzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetLogInfoW(JNIEnv* km_env, jclass km_clazz, jlong szzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetObjectInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint objtyp, jlong szcontainername, jlong szobjectname, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetObjectInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)objtyp, (void*)(uintptr_t)szcontainername, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)objtyp;
    (void)szcontainername;
    (void)szobjectname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetObjectInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint objtyp, jlong szcontainername, jlong szobjectname, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetObjectInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)objtyp, (void*)(uintptr_t)szcontainername, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)objtyp;
    (void)szcontainername;
    (void)szobjectname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetRecordPosition(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong precpos, jint cbrecpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetRecordPosition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)precpos, (uint32_t)cbrecpos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    (void)cbrecpos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetRecordSize(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong precsize, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetRecordSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)precsize, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetRecordSize2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong precsize, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetRecordSize2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)precsize, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvsecondarykey, jint cbsecondarykeymax, jlong pcbsecondarykeyactual, jlong pvprimarybookmark, jint cbprimarybookmarkmax, jlong pcbprimarybookmarkactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSecondaryIndexBookmark");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvsecondarykey, (uint32_t)cbsecondarykeymax, (void*)(uintptr_t)pcbsecondarykeyactual, (void*)(uintptr_t)pvprimarybookmark, (uint32_t)cbprimarybookmarkmax, (void*)(uintptr_t)pcbprimarybookmarkactual, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvsecondarykey;
    (void)cbsecondarykeymax;
    (void)pcbsecondarykeyactual;
    (void)pvprimarybookmark;
    (void)cbprimarybookmarkmax;
    (void)pcbprimarybookmarkactual;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetSessionParameter(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint sesparamid, jlong pvparam, jint cbparammax, jlong pcbparamactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSessionParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)sesparamid, (void*)(uintptr_t)pvparam, (uint32_t)cbparammax, (void*)(uintptr_t)pcbparamactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparammax;
    (void)pcbparamactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetSystemParameterA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong sesid, jint paramid, jlong plparam, jlong szparam, jint cbmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSystemParameterA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (uint64_t)sesid, (uint32_t)paramid, (void*)(uintptr_t)plparam, (void*)(uintptr_t)szparam, (uint32_t)cbmax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetSystemParameterW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong sesid, jint paramid, jlong plparam, jlong szparam, jint cbmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSystemParameterW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (uint64_t)sesid, (uint32_t)paramid, (void*)(uintptr_t)plparam, (void*)(uintptr_t)szparam, (uint32_t)cbmax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetTableColumnInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableColumnInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetTableColumnInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableColumnInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetTableIndexInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jlong pvresult, jint cbresult, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableIndexInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pvresult, (uint32_t)cbresult, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetTableIndexInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jlong pvresult, jint cbresult, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableIndexInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pvresult, (uint32_t)cbresult, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetTableInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetTableInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetThreadStats(JNIEnv* km_env, jclass km_clazz, jlong pvresult, jint cbmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetThreadStats");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pvresult, (uint32_t)cbmax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pvresult;
    (void)cbmax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTruncateLogInfoInstanceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong wszzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTruncateLogInfoInstanceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)wszzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGetVersion(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong pwversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetVersion");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)pwversion);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)pwversion;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGotoBookmark(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvbookmark, jint cbbookmark) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGotoBookmark");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvbookmark, (uint32_t)cbbookmark);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGotoPosition(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong precpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGotoPosition");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)precpos);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvsecondarykey, jint cbsecondarykey, jlong pvprimarybookmark, jint cbprimarybookmark, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGotoSecondaryIndexBookmark");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvsecondarykey, (uint32_t)cbsecondarykey, (void*)(uintptr_t)pvprimarybookmark, (uint32_t)cbprimarybookmark, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvsecondarykey;
    (void)cbsecondarykey;
    (void)pvprimarybookmark;
    (void)cbprimarybookmark;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetGrowDatabase(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint cpg, jlong pcpgreal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGrowDatabase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)cpg, (void*)(uintptr_t)pcpgreal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)cpg;
    (void)pcpgreal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetIdle(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetIdle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetIndexRecordCount(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pcrec, jint crecmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetIndexRecordCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pcrec, (uint32_t)crecmax);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pcrec;
    (void)crecmax;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetInit(JNIEnv* km_env, jclass km_clazz, jlong pinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetInit2(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetInit3A(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong prstinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit3A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)prstinfo, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetInit3W(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong prstinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit3W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)prstinfo, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetIntersectIndexes(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong rgindexrange, jint cindexrange, jlong precordlist, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetIntersectIndexes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)rgindexrange, (uint32_t)cindexrange, (void*)(uintptr_t)precordlist, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)rgindexrange;
    (void)cindexrange;
    (void)precordlist;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetMakeKey(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvdata, jint cbdata, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetMakeKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetMove(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint crow, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetMove");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (int32_t)crow, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)crow;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotAbort(JNIEnv* km_env, jclass km_clazz, jlong snapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotAbort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotEnd(JNIEnv* km_env, jclass km_clazz, jlong snapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotEnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong pcinstanceinfo, jlong painstanceinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotFreezeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong pcinstanceinfo, jlong painstanceinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotFreezeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong pcinstanceinfo, jlong painstanceinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotGetFreezeInfoA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong pcinstanceinfo, jlong painstanceinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotGetFreezeInfoW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotPrepare(JNIEnv* km_env, jclass km_clazz, jlong psnapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotPrepare");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psnapid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psnapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotPrepareInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (uint64_t)instance, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotThaw(JNIEnv* km_env, jclass km_clazz, jlong snapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotThaw");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(JNIEnv* km_env, jclass km_clazz, jlong snapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotTruncateLog");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotTruncateLogInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)snapid, (uint64_t)instance, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenDatabaseA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jlong szconnect, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenDatabaseA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szconnect, (void*)(uintptr_t)pdbid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenDatabaseW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jlong szconnect, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenDatabaseW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szconnect, (void*)(uintptr_t)pdbid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenFileA(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong phffile, jlong pulfilesizelow, jlong pulfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)phffile, (void*)(uintptr_t)pulfilesizelow, (void*)(uintptr_t)pulfilesizehigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenFileInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szfilename, jlong phffile, jlong pulfilesizelow, jlong pulfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileInstanceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)phffile, (void*)(uintptr_t)pulfilesizelow, (void*)(uintptr_t)pulfilesizehigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenFileInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szfilename, jlong phffile, jlong pulfilesizelow, jlong pulfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileInstanceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)phffile, (void*)(uintptr_t)pulfilesizelow, (void*)(uintptr_t)pulfilesizehigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong phffile, jlong pulfilesizelow, jlong pulfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)phffile, (void*)(uintptr_t)pulfilesizelow, (void*)(uintptr_t)pulfilesizehigh);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenTableA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pvparameters, jint cbparameters, jint grbit, jlong ptableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTableA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pvparameters, (uint32_t)cbparameters, (uint32_t)grbit, (void*)(uintptr_t)ptableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenTableW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pvparameters, jint cbparameters, jint grbit, jlong ptableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTableW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pvparameters, (uint32_t)cbparameters, (uint32_t)grbit, (void*)(uintptr_t)ptableid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenTempTable(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong prgcolumndef, jint ccolumn, jint grbit, jlong ptableid, jlong prgcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTempTable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)prgcolumndef, (uint32_t)ccolumn, (uint32_t)grbit, (void*)(uintptr_t)ptableid, (void*)(uintptr_t)prgcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenTempTable2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong prgcolumndef, jint ccolumn, jint lcid, jint grbit, jlong ptableid, jlong prgcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTempTable2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)prgcolumndef, (uint32_t)ccolumn, (uint32_t)lcid, (uint32_t)grbit, (void*)(uintptr_t)ptableid, (void*)(uintptr_t)prgcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)lcid;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenTempTable3(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong prgcolumndef, jint ccolumn, jlong pidxunicode, jint grbit, jlong ptableid, jlong prgcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTempTable3");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)prgcolumndef, (uint32_t)ccolumn, (void*)(uintptr_t)pidxunicode, (uint32_t)grbit, (void*)(uintptr_t)ptableid, (void*)(uintptr_t)prgcolumnid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)pidxunicode;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenTemporaryTable(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong popentemporarytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTemporaryTable");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)popentemporarytable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)popentemporarytable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetOpenTemporaryTable2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong popentemporarytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTemporaryTable2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)popentemporarytable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)popentemporarytable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetPrepareUpdate(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint prep) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetPrepareUpdate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)prep);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)prep;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetPrereadIndexRanges(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong rgindexranges, jint cindexranges, jlong pcrangespreread, jlong rgcolumnidpreread, jint ccolumnidpreread, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetPrereadIndexRanges");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)rgindexranges, (uint32_t)cindexranges, (void*)(uintptr_t)pcrangespreread, (void*)(uintptr_t)rgcolumnidpreread, (uint32_t)ccolumnidpreread, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)rgindexranges;
    (void)cindexranges;
    (void)pcrangespreread;
    (void)rgcolumnidpreread;
    (void)ccolumnidpreread;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetPrereadKeys(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong rgpvkeys, jlong rgcbkeys, jint ckeys, jlong pckeyspreread, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetPrereadKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)rgpvkeys, (void*)(uintptr_t)rgcbkeys, (int32_t)ckeys, (void*)(uintptr_t)pckeyspreread, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)rgpvkeys;
    (void)rgcbkeys;
    (void)ckeys;
    (void)pckeyspreread;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetReadFile(JNIEnv* km_env, jclass km_clazz, jlong hffile, jlong pv, jint cb, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetReadFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)hffile, (void*)(uintptr_t)pv, (uint32_t)cb, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetReadFileInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong hffile, jlong pv, jint cb, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetReadFileInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (uint64_t)hffile, (void*)(uintptr_t)pv, (uint32_t)cb, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRegisterCallback(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint cbtyp, jlong pcallback, jlong pvcontext, jlong phcallbackid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRegisterCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)cbtyp, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)phcallbackid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)pcallback;
    (void)pvcontext;
    (void)phcallbackid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRenameColumnA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szname, jlong sznamenew, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameColumnA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szname, (void*)(uintptr_t)sznamenew, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRenameColumnW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szname, jlong sznamenew, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameColumnW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szname, (void*)(uintptr_t)sznamenew, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRenameTableA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong szname, jlong sznamenew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameTableA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)szname, (void*)(uintptr_t)sznamenew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRenameTableW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong szname, jlong sznamenew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameTableW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)szname, (void*)(uintptr_t)sznamenew);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetResetSessionContext(JNIEnv* km_env, jclass km_clazz, jlong sesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetResetSessionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetResetTableSequential(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetResetTableSequential");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetResizeDatabase(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint cpgtarget, jlong pcpgactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetResizeDatabase");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)cpgtarget, (void*)(uintptr_t)pcpgactual, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)cpgtarget;
    (void)pcpgactual;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRestore2A(JNIEnv* km_env, jclass km_clazz, jlong sz, jlong szdest, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestore2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sz, (void*)(uintptr_t)szdest, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRestore2W(JNIEnv* km_env, jclass km_clazz, jlong sz, jlong szdest, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestore2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sz, (void*)(uintptr_t)szdest, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRestoreA(JNIEnv* km_env, jclass km_clazz, jlong szsource, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szsource, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szsource;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRestoreInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong sz, jlong szdest, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreInstanceA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)sz, (void*)(uintptr_t)szdest, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRestoreInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong sz, jlong szdest, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreInstanceW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)sz, (void*)(uintptr_t)szdest, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRestoreW(JNIEnv* km_env, jclass km_clazz, jlong szsource, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)szsource, (void*)(uintptr_t)pfn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)szsource;
    (void)pfn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRetrieveColumn(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint columnid, jlong pvdata, jint cbdata, jlong pcbactual, jint grbit, jlong pretinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRetrieveColumn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)columnid, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (void*)(uintptr_t)pcbactual, (uint32_t)grbit, (void*)(uintptr_t)pretinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pvdata;
    (void)cbdata;
    (void)pcbactual;
    (void)grbit;
    (void)pretinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRetrieveColumns(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pretrievecolumn, jint cretrievecolumn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRetrieveColumns");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pretrievecolumn, (uint32_t)cretrievecolumn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pretrievecolumn;
    (void)cretrievecolumn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRetrieveKey(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvkey, jint cbmax, jlong pcbactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRetrieveKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvkey, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvkey;
    (void)cbmax;
    (void)pcbactual;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetRollback(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRollback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSeek(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSeek");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetColumn(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint columnid, jlong pvdata, jint cbdata, jint grbit, jlong psetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)columnid, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)grbit, (void*)(uintptr_t)psetinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    (void)psetinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong szcolumnname, jlong pvdata, jint cbdata, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumnDefaultValueA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong szcolumnname, jlong pvdata, jint cbdata, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumnDefaultValueW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetColumns(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong psetcolumn, jint csetcolumn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumns");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)psetcolumn, (uint32_t)csetcolumn);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)psetcolumn;
    (void)csetcolumn;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetCurrentIndex2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex2A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetCurrentIndex2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex2W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetCurrentIndex3A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit, jint itagsequence) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex3A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit, (uint32_t)itagsequence);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetCurrentIndex3W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit, jint itagsequence) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex3W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit, (uint32_t)itagsequence);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetCurrentIndex4A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jlong pindexid, jint grbit, jint itagsequence) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex4A");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pindexid, (uint32_t)grbit, (uint32_t)itagsequence);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetCurrentIndex4W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jlong pindexid, jint grbit, jint itagsequence) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex4W");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pindexid, (uint32_t)grbit, (uint32_t)itagsequence);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetCurrentIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndexA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetCurrentIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndexW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetCursorFilter(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong rgcolumnfilters, jint ccolumnfilters, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCursorFilter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)rgcolumnfilters, (uint32_t)ccolumnfilters, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)rgcolumnfilters;
    (void)ccolumnfilters;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetDatabaseSizeA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasename, jint cpg, jlong pcpgreal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetDatabaseSizeA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasename, (uint32_t)cpg, (void*)(uintptr_t)pcpgreal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetDatabaseSizeW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasename, jint cpg, jlong pcpgreal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetDatabaseSizeW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasename, (uint32_t)cpg, (void*)(uintptr_t)pcpgreal);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetIndexRange(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableidsrc, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetIndexRange");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableidsrc, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableidsrc;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetLS(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong ls, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetLS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint64_t)ls, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)ls;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetSessionContext(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong ulcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSessionContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)ulcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)ulcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetSessionParameter(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint sesparamid, jlong pvparam, jint cbparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSessionParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint32_t)sesparamid, (void*)(uintptr_t)pvparam, (uint32_t)cbparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetSystemParameterA(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong sesid, jint paramid, jlong lparam, jlong szparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSystemParameterA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance, (uint64_t)sesid, (uint32_t)paramid, (uint64_t)lparam, (void*)(uintptr_t)szparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetSystemParameterW(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong sesid, jint paramid, jlong lparam, jlong szparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSystemParameterW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pinstance, (uint64_t)sesid, (uint32_t)paramid, (uint64_t)lparam, (void*)(uintptr_t)szparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetSetTableSequential(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetTableSequential");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetStopBackup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopBackup");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetStopBackupInstance(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopBackupInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetStopService(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopService");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetStopServiceInstance(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopServiceInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetStopServiceInstance2(JNIEnv* km_env, jclass km_clazz, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopServiceInstance2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetTerm(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTerm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetTerm2(JNIEnv* km_env, jclass km_clazz, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTerm2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetTruncateLog(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTruncateLog");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetTruncateLogInstance(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTruncateLogInstance");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)instance);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)instance;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetUnregisterCallback(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint cbtyp, jlong hcallbackid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetUnregisterCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)cbtyp, (uint64_t)hcallbackid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)hcallbackid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetUpdate(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvbookmark, jint cbbookmark, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetUpdate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvbookmark, (uint32_t)cbbookmark, (void*)(uintptr_t)pcbactual);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssysWindowsWin32StorageJetJetUpdate2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvbookmark, jint cbbookmark, jlong pcbactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetUpdate2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvbookmark, (uint32_t)cbbookmark, (void*)(uintptr_t)pcbactual, (uint32_t)grbit);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    (void)grbit;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

