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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetAddColumnA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jlong pcolumndef, jlong pvdefault, jint cbdefault, jlong pcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAddColumnA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pcolumndef, (void*)(uintptr_t)pvdefault, (uint32_t)cbdefault, (void*)(uintptr_t)pcolumnid) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetAddColumnW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jlong pcolumndef, jlong pvdefault, jint cbdefault, jlong pcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAddColumnW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pcolumndef, (void*)(uintptr_t)pvdefault, (uint32_t)cbdefault, (void*)(uintptr_t)pcolumnid) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetAttachDatabase2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint cpgdatabasesizemax, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabase2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)cpgdatabasesizemax, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetAttachDatabase2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint cpgdatabasesizemax, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabase2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)cpgdatabasesizemax, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetAttachDatabaseA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabaseA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetAttachDatabaseW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabaseW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBackupA(JNIEnv* km_env, jclass km_clazz, jlong szbackuppath, jint grbit, jlong pfnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szbackuppath, (uint32_t)grbit, (void*)(uintptr_t)pfnstatus) : -1;
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBackupInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szbackuppath, jint grbit, jlong pfnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupInstanceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szbackuppath, (uint32_t)grbit, (void*)(uintptr_t)pfnstatus) : -1;
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBackupInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szbackuppath, jint grbit, jlong pfnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupInstanceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szbackuppath, (uint32_t)grbit, (void*)(uintptr_t)pfnstatus) : -1;
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBackupW(JNIEnv* km_env, jclass km_clazz, jlong szbackuppath, jint grbit, jlong pfnstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szbackuppath, (uint32_t)grbit, (void*)(uintptr_t)pfnstatus) : -1;
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBeginExternalBackup(JNIEnv* km_env, jclass km_clazz, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginExternalBackup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)grbit) : -1;
#else
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBeginExternalBackupInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginExternalBackupInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (uint32_t)grbit) : -1;
#else
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBeginSessionA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong psesid, jlong szusername, jlong szpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginSessionA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)psesid, (void*)(uintptr_t)szusername, (void*)(uintptr_t)szpassword) : -1;
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBeginSessionW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong psesid, jlong szusername, jlong szpassword) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginSessionW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)psesid, (void*)(uintptr_t)szusername, (void*)(uintptr_t)szpassword) : -1;
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBeginTransaction(JNIEnv* km_env, jclass km_clazz, jlong sesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginTransaction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid) : -1;
#else
    (void)sesid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBeginTransaction2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginTransaction2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetBeginTransaction3(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong trxid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginTransaction3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (int64_t)trxid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)trxid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCloseDatabase(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseDatabase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCloseFile(JNIEnv* km_env, jclass km_clazz, jlong hffile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hffile) : -1;
#else
    (void)hffile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCloseFileInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong hffile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseFileInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (uint64_t)hffile) : -1;
#else
    (void)instance;
    (void)hffile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCloseTable(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseTable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid) : -1;
#else
    (void)sesid;
    (void)tableid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCommitTransaction(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCommitTransaction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCommitTransaction2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit, jint cmsecdurablecommit, jlong pcommitid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCommitTransaction2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)grbit, (uint32_t)cmsecdurablecommit, (void*)(uintptr_t)pcommitid) : -1;
#else
    (void)sesid;
    (void)grbit;
    (void)cmsecdurablecommit;
    (void)pcommitid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCompactA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasesrc, jlong szdatabasedest, jlong pfnstatus, jlong pconvert, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCompactA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasesrc, (void*)(uintptr_t)szdatabasedest, (void*)(uintptr_t)pfnstatus, (void*)(uintptr_t)pconvert, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCompactW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasesrc, jlong szdatabasedest, jlong pfnstatus, jlong pconvert, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCompactW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasesrc, (void*)(uintptr_t)szdatabasedest, (void*)(uintptr_t)pfnstatus, (void*)(uintptr_t)pconvert, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetComputeStats(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetComputeStats");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid) : -1;
#else
    (void)sesid;
    (void)tableid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetConfigureProcessForCrashDump(JNIEnv* km_env, jclass km_clazz, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetConfigureProcessForCrashDump");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)grbit) : -1;
#else
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateDatabase2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint cpgdatabasesizemax, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabase2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)cpgdatabasesizemax, (void*)(uintptr_t)pdbid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateDatabase2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint cpgdatabasesizemax, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabase2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)cpgdatabasesizemax, (void*)(uintptr_t)pdbid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateDatabaseA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jlong szconnect, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabaseA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szconnect, (void*)(uintptr_t)pdbid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateDatabaseW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jlong szconnect, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabaseW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szconnect, (void*)(uintptr_t)pdbid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateIndex2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateIndex2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateIndex3A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex3A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateIndex3W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex3W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateIndex4A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex4A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateIndex4W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pindexcreate, jint cindexcreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex4W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pindexcreate, (uint32_t)cindexcreate) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit, jlong szkey, jint cbkey, jint ldensity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndexA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit, (void*)(uintptr_t)szkey, (uint32_t)cbkey, (uint32_t)ldensity) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit, jlong szkey, jint cbkey, jint ldensity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndexW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit, (void*)(uintptr_t)szkey, (uint32_t)cbkey, (uint32_t)ldensity) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateInstance2A(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong szinstancename, jlong szdisplayname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstance2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)szinstancename, (void*)(uintptr_t)szdisplayname, (uint32_t)grbit) : -1;
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateInstance2W(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong szinstancename, jlong szdisplayname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstance2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)szinstancename, (void*)(uintptr_t)szdisplayname, (uint32_t)grbit) : -1;
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateInstanceA(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong szinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstanceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)szinstancename) : -1;
#else
    (void)pinstance;
    (void)szinstancename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateInstanceW(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong szinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstanceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)szinstancename) : -1;
#else
    (void)pinstance;
    (void)szinstancename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jint lpages, jint ldensity, jlong ptableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (uint32_t)lpages, (uint32_t)ldensity, (void*)(uintptr_t)ptableid) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableColumnIndex2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableColumnIndex2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableColumnIndex3A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex3A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableColumnIndex3W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex3W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableColumnIndex4A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex4A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableColumnIndex4W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex4W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableColumnIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndexA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableColumnIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong ptablecreate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndexW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)ptablecreate) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetCreateTableW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jint lpages, jint ldensity, jlong ptableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (uint32_t)lpages, (uint32_t)ldensity, (void*)(uintptr_t)ptableid) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDefragment2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcpasses, jlong pcseconds, jlong callback, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (void*)(uintptr_t)callback, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDefragment2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcpasses, jlong pcseconds, jlong callback, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (void*)(uintptr_t)callback, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDefragment3A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasename, jlong sztablename, jlong pcpasses, jlong pcseconds, jlong callback, jlong pvcontext, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment3A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasename, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (void*)(uintptr_t)callback, (void*)(uintptr_t)pvcontext, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)pvcontext;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDefragment3W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasename, jlong sztablename, jlong pcpasses, jlong pcseconds, jlong callback, jlong pvcontext, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment3W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasename, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (void*)(uintptr_t)callback, (void*)(uintptr_t)pvcontext, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)pvcontext;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDefragmentA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcpasses, jlong pcseconds, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragmentA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDefragmentW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcpasses, jlong pcseconds, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragmentW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcpasses, (void*)(uintptr_t)pcseconds, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDelete(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDelete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid) : -1;
#else
    (void)sesid;
    (void)tableid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDeleteColumn2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumn2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDeleteColumn2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumn2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDeleteColumnA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumnA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDeleteColumnW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumnW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDeleteIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteIndexA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDeleteIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteIndexW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDeleteTableA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteTableA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDeleteTableW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteTableW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDetachDatabase2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabase2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDetachDatabase2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabase2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDetachDatabaseA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabaseA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename) : -1;
#else
    (void)sesid;
    (void)szfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDetachDatabaseW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabaseW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename) : -1;
#else
    (void)sesid;
    (void)szfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDupCursor(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong ptableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDupCursor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)ptableid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)ptableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetDupSession(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong psesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDupSession");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)psesid) : -1;
#else
    (void)sesid;
    (void)psesid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetEnableMultiInstanceA(JNIEnv* km_env, jclass km_clazz, jlong psetsysparam, jint csetsysparam, jlong pcsetsucceed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEnableMultiInstanceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psetsysparam, (uint32_t)csetsysparam, (void*)(uintptr_t)pcsetsucceed) : -1;
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetEnableMultiInstanceW(JNIEnv* km_env, jclass km_clazz, jlong psetsysparam, jint csetsysparam, jlong pcsetsucceed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEnableMultiInstanceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psetsysparam, (uint32_t)csetsysparam, (void*)(uintptr_t)pcsetsucceed) : -1;
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetEndExternalBackup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndExternalBackup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetEndExternalBackupInstance(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndExternalBackupInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetEndExternalBackupInstance2(JNIEnv* km_env, jclass km_clazz, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndExternalBackupInstance2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (uint32_t)grbit) : -1;
#else
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetEndSession(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndSession");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetEnumerateColumns(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint cenumcolumnid, jlong rgenumcolumnid, jlong pcenumcolumn, jlong prgenumcolumn, jlong pfnrealloc, jlong pvrealloccontext, jint cbdatamost, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEnumerateColumns");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)cenumcolumnid, (void*)(uintptr_t)rgenumcolumnid, (void*)(uintptr_t)pcenumcolumn, (void*)(uintptr_t)prgenumcolumn, (void*)(uintptr_t)pfnrealloc, (void*)(uintptr_t)pvrealloccontext, (uint32_t)cbdatamost, (uint32_t)grbit) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetEscrowUpdate(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint columnid, jlong pv, jint cbmax, jlong pvold, jint cboldmax, jlong pcboldactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEscrowUpdate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)columnid, (void*)(uintptr_t)pv, (uint32_t)cbmax, (void*)(uintptr_t)pvold, (uint32_t)cboldmax, (void*)(uintptr_t)pcboldactual, (uint32_t)grbit) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetExternalRestore2A(JNIEnv* km_env, jclass km_clazz, jlong szcheckpointfilepath, jlong szlogpath, jlong rgrstmap, jint crstfilemap, jlong szbackuplogpath, jlong ploginfo, jlong sztargetinstancename, jlong sztargetinstancelogpath, jlong sztargetinstancecheckpointpath, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestore2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcheckpointfilepath, (void*)(uintptr_t)szlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstfilemap, (void*)(uintptr_t)szbackuplogpath, (void*)(uintptr_t)ploginfo, (void*)(uintptr_t)sztargetinstancename, (void*)(uintptr_t)sztargetinstancelogpath, (void*)(uintptr_t)sztargetinstancecheckpointpath, (void*)(uintptr_t)pfn) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetExternalRestore2W(JNIEnv* km_env, jclass km_clazz, jlong szcheckpointfilepath, jlong szlogpath, jlong rgrstmap, jint crstfilemap, jlong szbackuplogpath, jlong ploginfo, jlong sztargetinstancename, jlong sztargetinstancelogpath, jlong sztargetinstancecheckpointpath, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestore2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcheckpointfilepath, (void*)(uintptr_t)szlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstfilemap, (void*)(uintptr_t)szbackuplogpath, (void*)(uintptr_t)ploginfo, (void*)(uintptr_t)sztargetinstancename, (void*)(uintptr_t)sztargetinstancelogpath, (void*)(uintptr_t)sztargetinstancecheckpointpath, (void*)(uintptr_t)pfn) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetExternalRestoreA(JNIEnv* km_env, jclass km_clazz, jlong szcheckpointfilepath, jlong szlogpath, jlong rgrstmap, jint crstfilemap, jlong szbackuplogpath, jint genlow, jint genhigh, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestoreA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcheckpointfilepath, (void*)(uintptr_t)szlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstfilemap, (void*)(uintptr_t)szbackuplogpath, (int32_t)genlow, (int32_t)genhigh, (void*)(uintptr_t)pfn) : -1;
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)genlow;
    (void)genhigh;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetExternalRestoreW(JNIEnv* km_env, jclass km_clazz, jlong szcheckpointfilepath, jlong szlogpath, jlong rgrstmap, jint crstfilemap, jlong szbackuplogpath, jint genlow, jint genhigh, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestoreW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szcheckpointfilepath, (void*)(uintptr_t)szlogpath, (void*)(uintptr_t)rgrstmap, (int32_t)crstfilemap, (void*)(uintptr_t)szbackuplogpath, (int32_t)genlow, (int32_t)genhigh, (void*)(uintptr_t)pfn) : -1;
#else
    (void)szcheckpointfilepath;
    (void)szlogpath;
    (void)rgrstmap;
    (void)crstfilemap;
    (void)szbackuplogpath;
    (void)genlow;
    (void)genhigh;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetFreeBuffer(JNIEnv* km_env, jclass km_clazz, jlong pbbuf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetFreeBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pbbuf) : -1;
#else
    (void)pbbuf;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetAttachInfoA(JNIEnv* km_env, jclass km_clazz, jlong szzdatabases, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szzdatabases, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetAttachInfoInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzdatabases, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoInstanceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzdatabases, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetAttachInfoInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzdatabases, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoInstanceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzdatabases, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetAttachInfoW(JNIEnv* km_env, jclass km_clazz, jlong wszzdatabases, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)wszzdatabases, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)wszzdatabases;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetBookmark(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvbookmark, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetBookmark");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvbookmark, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetColumnInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pcolumnnameorid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetColumnInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pcolumnnameorid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetColumnInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pwcolumnnameorid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetColumnInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pwcolumnnameorid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pwcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetCurrentIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint cbindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetCurrentIndexA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)cbindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetCurrentIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint cbindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetCurrentIndexW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)cbindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetCursorInfo(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetCursorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetDatabaseFileInfoA(JNIEnv* km_env, jclass km_clazz, jlong szdatabasename, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseFileInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatabasename, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetDatabaseFileInfoW(JNIEnv* km_env, jclass km_clazz, jlong szdatabasename, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseFileInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szdatabasename, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetDatabaseInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetDatabaseInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetErrorInfoW(JNIEnv* km_env, jclass km_clazz, jlong pvcontext, jlong pvresult, jint cbmax, jint infolevel, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetErrorInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvcontext, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel, (uint32_t)grbit) : -1;
#else
    (void)pvcontext;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetIndexInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong szindexname, jlong pvresult, jint cbresult, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetIndexInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pvresult, (uint32_t)cbresult, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetIndexInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong szindexname, jlong pvresult, jint cbresult, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetIndexInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pvresult, (uint32_t)cbresult, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetInstanceInfoA(JNIEnv* km_env, jclass km_clazz, jlong pcinstanceinfo, jlong painstanceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetInstanceInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo) : -1;
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetInstanceInfoW(JNIEnv* km_env, jclass km_clazz, jlong pcinstanceinfo, jlong painstanceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetInstanceInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo) : -1;
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetInstanceMiscInfo(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetInstanceMiscInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)instance;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetLS(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pls, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLS");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pls, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pls;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetLock(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetLogInfoA(JNIEnv* km_env, jclass km_clazz, jlong szzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetLogInfoInstance2A(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzlogs, jint cbmax, jlong pcbactual, jlong ploginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstance2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual, (void*)(uintptr_t)ploginfo) : -1;
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetLogInfoInstance2W(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong wszzlogs, jint cbmax, jlong pcbactual, jlong ploginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstance2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)wszzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual, (void*)(uintptr_t)ploginfo) : -1;
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetLogInfoInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstanceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetLogInfoInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong wszzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstanceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)wszzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetLogInfoW(JNIEnv* km_env, jclass km_clazz, jlong szzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetObjectInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint objtyp, jlong szcontainername, jlong szobjectname, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetObjectInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)objtyp, (void*)(uintptr_t)szcontainername, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)objtyp;
    (void)szcontainername;
    (void)szobjectname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetObjectInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint objtyp, jlong szcontainername, jlong szobjectname, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetObjectInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)objtyp, (void*)(uintptr_t)szcontainername, (void*)(uintptr_t)szobjectname, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)objtyp;
    (void)szcontainername;
    (void)szobjectname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetRecordPosition(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong precpos, jint cbrecpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetRecordPosition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)precpos, (uint32_t)cbrecpos) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    (void)cbrecpos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetRecordSize(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong precsize, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetRecordSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)precsize, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetRecordSize2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong precsize, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetRecordSize2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)precsize, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetSecondaryIndexBookmark(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvsecondarykey, jint cbsecondarykeymax, jlong pcbsecondarykeyactual, jlong pvprimarybookmark, jint cbprimarybookmarkmax, jlong pcbprimarybookmarkactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSecondaryIndexBookmark");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvsecondarykey, (uint32_t)cbsecondarykeymax, (void*)(uintptr_t)pcbsecondarykeyactual, (void*)(uintptr_t)pvprimarybookmark, (uint32_t)cbprimarybookmarkmax, (void*)(uintptr_t)pcbprimarybookmarkactual, (uint32_t)grbit) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetSessionParameter(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint sesparamid, jlong pvparam, jint cbparammax, jlong pcbparamactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSessionParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)sesparamid, (void*)(uintptr_t)pvparam, (uint32_t)cbparammax, (void*)(uintptr_t)pcbparamactual) : -1;
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparammax;
    (void)pcbparamactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetSystemParameterA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong sesid, jint paramid, jlong plparam, jlong szparam, jint cbmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSystemParameterA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (uint64_t)sesid, (uint32_t)paramid, (void*)(uintptr_t)plparam, (void*)(uintptr_t)szparam, (uint32_t)cbmax) : -1;
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetSystemParameterW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong sesid, jint paramid, jlong plparam, jlong szparam, jint cbmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSystemParameterW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (uint64_t)sesid, (uint32_t)paramid, (void*)(uintptr_t)plparam, (void*)(uintptr_t)szparam, (uint32_t)cbmax) : -1;
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetTableColumnInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableColumnInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetTableColumnInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szcolumnname, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableColumnInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetTableIndexInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jlong pvresult, jint cbresult, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableIndexInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pvresult, (uint32_t)cbresult, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetTableIndexInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jlong pvresult, jint cbresult, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableIndexInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pvresult, (uint32_t)cbresult, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetTableInfoA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetTableInfoW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvresult, jint cbmax, jint infolevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvresult, (uint32_t)cbmax, (uint32_t)infolevel) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetThreadStats(JNIEnv* km_env, jclass km_clazz, jlong pvresult, jint cbmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetThreadStats");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvresult, (uint32_t)cbmax) : -1;
#else
    (void)pvresult;
    (void)cbmax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetTruncateLogInfoInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTruncateLogInfoInstanceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetTruncateLogInfoInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong wszzlogs, jint cbmax, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTruncateLogInfoInstanceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)wszzlogs, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGetVersion(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong pwversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetVersion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)pwversion) : -1;
#else
    (void)sesid;
    (void)pwversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGotoBookmark(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvbookmark, jint cbbookmark) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGotoBookmark");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvbookmark, (uint32_t)cbbookmark) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGotoPosition(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong precpos) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGotoPosition");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)precpos) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGotoSecondaryIndexBookmark(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvsecondarykey, jint cbsecondarykey, jlong pvprimarybookmark, jint cbprimarybookmark, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGotoSecondaryIndexBookmark");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvsecondarykey, (uint32_t)cbsecondarykey, (void*)(uintptr_t)pvprimarybookmark, (uint32_t)cbprimarybookmark, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvsecondarykey;
    (void)cbsecondarykey;
    (void)pvprimarybookmark;
    (void)cbprimarybookmark;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetGrowDatabase(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint cpg, jlong pcpgreal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGrowDatabase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)cpg, (void*)(uintptr_t)pcpgreal) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)cpg;
    (void)pcpgreal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetIdle(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetIdle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetIndexRecordCount(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pcrec, jint crecmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetIndexRecordCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pcrec, (uint32_t)crecmax) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pcrec;
    (void)crecmax;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetInit(JNIEnv* km_env, jclass km_clazz, jlong pinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance) : -1;
#else
    (void)pinstance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetInit2(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance, (uint32_t)grbit) : -1;
#else
    (void)pinstance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetInit3A(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong prstinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit3A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)prstinfo, (uint32_t)grbit) : -1;
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetInit3W(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong prstinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit3W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance, (void*)(uintptr_t)prstinfo, (uint32_t)grbit) : -1;
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetIntersectIndexes(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong rgindexrange, jint cindexrange, jlong precordlist, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetIntersectIndexes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)rgindexrange, (uint32_t)cindexrange, (void*)(uintptr_t)precordlist, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)rgindexrange;
    (void)cindexrange;
    (void)precordlist;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetMakeKey(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvdata, jint cbdata, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetMakeKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetMove(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint crow, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetMove");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (int32_t)crow, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)crow;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotAbort(JNIEnv* km_env, jclass km_clazz, jlong snapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotAbort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotEnd(JNIEnv* km_env, jclass km_clazz, jlong snapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotEnd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotFreezeA(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong pcinstanceinfo, jlong painstanceinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotFreezeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotFreezeW(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong pcinstanceinfo, jlong painstanceinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotFreezeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotGetFreezeInfoA(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong pcinstanceinfo, jlong painstanceinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotGetFreezeInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotGetFreezeInfoW(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong pcinstanceinfo, jlong painstanceinfo, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotGetFreezeInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (void*)(uintptr_t)pcinstanceinfo, (void*)(uintptr_t)painstanceinfo, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotPrepare(JNIEnv* km_env, jclass km_clazz, jlong psnapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotPrepare");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psnapid, (uint32_t)grbit) : -1;
#else
    (void)psnapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotPrepareInstance(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotPrepareInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (uint64_t)instance, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotThaw(JNIEnv* km_env, jclass km_clazz, jlong snapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotThaw");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotTruncateLog(JNIEnv* km_env, jclass km_clazz, jlong snapid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotTruncateLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOSSnapshotTruncateLogInstance(JNIEnv* km_env, jclass km_clazz, jlong snapid, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotTruncateLogInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)snapid, (uint64_t)instance, (uint32_t)grbit) : -1;
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenDatabaseA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jlong szconnect, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenDatabaseA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szconnect, (void*)(uintptr_t)pdbid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenDatabaseW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szfilename, jlong szconnect, jlong pdbid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenDatabaseW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szconnect, (void*)(uintptr_t)pdbid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenFileA(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong phffile, jlong pulfilesizelow, jlong pulfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)phffile, (void*)(uintptr_t)pulfilesizelow, (void*)(uintptr_t)pulfilesizehigh) : -1;
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenFileInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szfilename, jlong phffile, jlong pulfilesizelow, jlong pulfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileInstanceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)phffile, (void*)(uintptr_t)pulfilesizelow, (void*)(uintptr_t)pulfilesizehigh) : -1;
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenFileInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong szfilename, jlong phffile, jlong pulfilesizelow, jlong pulfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileInstanceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)phffile, (void*)(uintptr_t)pulfilesizelow, (void*)(uintptr_t)pulfilesizehigh) : -1;
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenFileW(JNIEnv* km_env, jclass km_clazz, jlong szfilename, jlong phffile, jlong pulfilesizelow, jlong pulfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szfilename, (void*)(uintptr_t)phffile, (void*)(uintptr_t)pulfilesizelow, (void*)(uintptr_t)pulfilesizehigh) : -1;
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenTableA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pvparameters, jint cbparameters, jint grbit, jlong ptableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTableA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pvparameters, (uint32_t)cbparameters, (uint32_t)grbit, (void*)(uintptr_t)ptableid) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenTableW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong pvparameters, jint cbparameters, jint grbit, jlong ptableid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTableW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)pvparameters, (uint32_t)cbparameters, (uint32_t)grbit, (void*)(uintptr_t)ptableid) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenTempTable(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong prgcolumndef, jint ccolumn, jint grbit, jlong ptableid, jlong prgcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTempTable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)prgcolumndef, (uint32_t)ccolumn, (uint32_t)grbit, (void*)(uintptr_t)ptableid, (void*)(uintptr_t)prgcolumnid) : -1;
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenTempTable2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong prgcolumndef, jint ccolumn, jint lcid, jint grbit, jlong ptableid, jlong prgcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTempTable2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)prgcolumndef, (uint32_t)ccolumn, (uint32_t)lcid, (uint32_t)grbit, (void*)(uintptr_t)ptableid, (void*)(uintptr_t)prgcolumnid) : -1;
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)lcid;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenTempTable3(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong prgcolumndef, jint ccolumn, jlong pidxunicode, jint grbit, jlong ptableid, jlong prgcolumnid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTempTable3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)prgcolumndef, (uint32_t)ccolumn, (void*)(uintptr_t)pidxunicode, (uint32_t)grbit, (void*)(uintptr_t)ptableid, (void*)(uintptr_t)prgcolumnid) : -1;
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)pidxunicode;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenTemporaryTable(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong popentemporarytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTemporaryTable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)popentemporarytable) : -1;
#else
    (void)sesid;
    (void)popentemporarytable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetOpenTemporaryTable2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong popentemporarytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTemporaryTable2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)popentemporarytable) : -1;
#else
    (void)sesid;
    (void)popentemporarytable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetPrepareUpdate(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint prep) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetPrepareUpdate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)prep) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)prep;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetPrereadIndexRanges(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong rgindexranges, jint cindexranges, jlong pcrangespreread, jlong rgcolumnidpreread, jint ccolumnidpreread, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetPrereadIndexRanges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)rgindexranges, (uint32_t)cindexranges, (void*)(uintptr_t)pcrangespreread, (void*)(uintptr_t)rgcolumnidpreread, (uint32_t)ccolumnidpreread, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)rgindexranges;
    (void)cindexranges;
    (void)pcrangespreread;
    (void)rgcolumnidpreread;
    (void)ccolumnidpreread;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetPrereadKeys(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong rgpvkeys, jlong rgcbkeys, jint ckeys, jlong pckeyspreread, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetPrereadKeys");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)rgpvkeys, (void*)(uintptr_t)rgcbkeys, (int32_t)ckeys, (void*)(uintptr_t)pckeyspreread, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)rgpvkeys;
    (void)rgcbkeys;
    (void)ckeys;
    (void)pckeyspreread;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetReadFile(JNIEnv* km_env, jclass km_clazz, jlong hffile, jlong pv, jint cb, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetReadFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)hffile, (void*)(uintptr_t)pv, (uint32_t)cb, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetReadFileInstance(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong hffile, jlong pv, jint cb, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetReadFileInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (uint64_t)hffile, (void*)(uintptr_t)pv, (uint32_t)cb, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)instance;
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRegisterCallback(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint cbtyp, jlong pcallback, jlong pvcontext, jlong phcallbackid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRegisterCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)cbtyp, (void*)(uintptr_t)pcallback, (void*)(uintptr_t)pvcontext, (void*)(uintptr_t)phcallbackid) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)pcallback;
    (void)pvcontext;
    (void)phcallbackid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRenameColumnA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szname, jlong sznamenew, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameColumnA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szname, (void*)(uintptr_t)sznamenew, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRenameColumnW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szname, jlong sznamenew, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameColumnW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szname, (void*)(uintptr_t)sznamenew, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRenameTableA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong szname, jlong sznamenew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameTableA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)szname, (void*)(uintptr_t)sznamenew) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRenameTableW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong szname, jlong sznamenew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameTableW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)szname, (void*)(uintptr_t)sznamenew) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetResetSessionContext(JNIEnv* km_env, jclass km_clazz, jlong sesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetResetSessionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid) : -1;
#else
    (void)sesid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetResetTableSequential(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetResetTableSequential");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetResizeDatabase(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jint cpgtarget, jlong pcpgactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetResizeDatabase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (uint32_t)cpgtarget, (void*)(uintptr_t)pcpgactual, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)cpgtarget;
    (void)pcpgactual;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRestore2A(JNIEnv* km_env, jclass km_clazz, jlong sz, jlong szdest, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestore2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sz, (void*)(uintptr_t)szdest, (void*)(uintptr_t)pfn) : -1;
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRestore2W(JNIEnv* km_env, jclass km_clazz, jlong sz, jlong szdest, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestore2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sz, (void*)(uintptr_t)szdest, (void*)(uintptr_t)pfn) : -1;
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRestoreA(JNIEnv* km_env, jclass km_clazz, jlong szsource, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szsource, (void*)(uintptr_t)pfn) : -1;
#else
    (void)szsource;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRestoreInstanceA(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong sz, jlong szdest, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreInstanceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)sz, (void*)(uintptr_t)szdest, (void*)(uintptr_t)pfn) : -1;
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRestoreInstanceW(JNIEnv* km_env, jclass km_clazz, jlong instance, jlong sz, jlong szdest, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreInstanceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (void*)(uintptr_t)sz, (void*)(uintptr_t)szdest, (void*)(uintptr_t)pfn) : -1;
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRestoreW(JNIEnv* km_env, jclass km_clazz, jlong szsource, jlong pfn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szsource, (void*)(uintptr_t)pfn) : -1;
#else
    (void)szsource;
    (void)pfn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRetrieveColumn(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint columnid, jlong pvdata, jint cbdata, jlong pcbactual, jint grbit, jlong pretinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRetrieveColumn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)columnid, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (void*)(uintptr_t)pcbactual, (uint32_t)grbit, (void*)(uintptr_t)pretinfo) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pvdata;
    (void)cbdata;
    (void)pcbactual;
    (void)grbit;
    (void)pretinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRetrieveColumns(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pretrievecolumn, jint cretrievecolumn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRetrieveColumns");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pretrievecolumn, (uint32_t)cretrievecolumn) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pretrievecolumn;
    (void)cretrievecolumn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRetrieveKey(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvkey, jint cbmax, jlong pcbactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRetrieveKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvkey, (uint32_t)cbmax, (void*)(uintptr_t)pcbactual, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvkey;
    (void)cbmax;
    (void)pcbactual;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetRollback(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRollback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSeek(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSeek");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetColumn(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint columnid, jlong pvdata, jint cbdata, jint grbit, jlong psetinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)columnid, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)grbit, (void*)(uintptr_t)psetinfo) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    (void)psetinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetColumnDefaultValueA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong szcolumnname, jlong pvdata, jint cbdata, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumnDefaultValueA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetColumnDefaultValueW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint dbid, jlong sztablename, jlong szcolumnname, jlong pvdata, jint cbdata, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumnDefaultValueW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)dbid, (void*)(uintptr_t)sztablename, (void*)(uintptr_t)szcolumnname, (void*)(uintptr_t)pvdata, (uint32_t)cbdata, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetColumns(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong psetcolumn, jint csetcolumn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumns");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)psetcolumn, (uint32_t)csetcolumn) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)psetcolumn;
    (void)csetcolumn;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetCurrentIndex2A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex2A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetCurrentIndex2W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex2W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetCurrentIndex3A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit, jint itagsequence) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex3A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit, (uint32_t)itagsequence) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetCurrentIndex3W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jint grbit, jint itagsequence) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex3W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (uint32_t)grbit, (uint32_t)itagsequence) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetCurrentIndex4A(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jlong pindexid, jint grbit, jint itagsequence) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex4A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pindexid, (uint32_t)grbit, (uint32_t)itagsequence) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetCurrentIndex4W(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname, jlong pindexid, jint grbit, jint itagsequence) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex4W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname, (void*)(uintptr_t)pindexid, (uint32_t)grbit, (uint32_t)itagsequence) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetCurrentIndexA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndexA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetCurrentIndexW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong szindexname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndexW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)szindexname) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetCursorFilter(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong rgcolumnfilters, jint ccolumnfilters, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCursorFilter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)rgcolumnfilters, (uint32_t)ccolumnfilters, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)rgcolumnfilters;
    (void)ccolumnfilters;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetDatabaseSizeA(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasename, jint cpg, jlong pcpgreal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetDatabaseSizeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasename, (uint32_t)cpg, (void*)(uintptr_t)pcpgreal) : -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetDatabaseSizeW(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong szdatabasename, jint cpg, jlong pcpgreal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetDatabaseSizeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (void*)(uintptr_t)szdatabasename, (uint32_t)cpg, (void*)(uintptr_t)pcpgreal) : -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetIndexRange(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableidsrc, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetIndexRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableidsrc, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableidsrc;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetLS(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong ls, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetLS");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint64_t)ls, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)ls;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetSessionContext(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong ulcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSessionContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)ulcontext) : -1;
#else
    (void)sesid;
    (void)ulcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetSessionParameter(JNIEnv* km_env, jclass km_clazz, jlong sesid, jint sesparamid, jlong pvparam, jint cbparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSessionParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint32_t)sesparamid, (void*)(uintptr_t)pvparam, (uint32_t)cbparam) : -1;
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetSystemParameterA(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong sesid, jint paramid, jlong lparam, jlong szparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSystemParameterA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance, (uint64_t)sesid, (uint32_t)paramid, (uint64_t)lparam, (void*)(uintptr_t)szparam) : -1;
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetSystemParameterW(JNIEnv* km_env, jclass km_clazz, jlong pinstance, jlong sesid, jint paramid, jlong lparam, jlong szparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSystemParameterW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinstance, (uint64_t)sesid, (uint32_t)paramid, (uint64_t)lparam, (void*)(uintptr_t)szparam) : -1;
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetSetTableSequential(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetTableSequential");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetStopBackup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopBackup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetStopBackupInstance(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopBackupInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetStopService(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopService");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetStopServiceInstance(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopServiceInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetStopServiceInstance2(JNIEnv* km_env, jclass km_clazz, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopServiceInstance2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (uint32_t)grbit) : -1;
#else
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetTerm(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTerm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetTerm2(JNIEnv* km_env, jclass km_clazz, jlong instance, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTerm2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance, (uint32_t)grbit) : -1;
#else
    (void)instance;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetTruncateLog(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTruncateLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetTruncateLogInstance(JNIEnv* km_env, jclass km_clazz, jlong instance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTruncateLogInstance");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)instance) : -1;
#else
    (void)instance;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetUnregisterCallback(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jint cbtyp, jlong hcallbackid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetUnregisterCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (uint32_t)cbtyp, (uint64_t)hcallbackid) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)hcallbackid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetUpdate(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvbookmark, jint cbbookmark, jlong pcbactual) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetUpdate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvbookmark, (uint32_t)cbbookmark, (void*)(uintptr_t)pcbactual) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_jet_WindowsWin32StorageJetJniBridge_windowssys_1windows_1win32_1storage_1jet_1JetUpdate2(JNIEnv* km_env, jclass km_clazz, jlong sesid, jlong tableid, jlong pvbookmark, jint cbbookmark, jlong pcbactual, jint grbit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetUpdate2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint64_t)sesid, (uint64_t)tableid, (void*)(uintptr_t)pvbookmark, (uint32_t)cbbookmark, (void*)(uintptr_t)pcbactual, (uint32_t)grbit) : -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    (void)grbit;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

