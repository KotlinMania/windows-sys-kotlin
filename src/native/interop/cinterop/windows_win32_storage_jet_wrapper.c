#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_jet_wrapper.h"
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

int32_t windowssys_windows_win32_storage_jet_JetAddColumnA(uint64_t sesid, uint64_t tableid, void* szcolumnname, void* pcolumndef, void* pvdefault, uint32_t cbdefault, void* pcolumnid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAddColumnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szcolumnname, pcolumndef, pvdefault, cbdefault, pcolumnid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetAddColumnW(uint64_t sesid, uint64_t tableid, void* szcolumnname, void* pcolumndef, void* pvdefault, uint32_t cbdefault, void* pcolumnid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAddColumnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szcolumnname, pcolumndef, pvdefault, cbdefault, pcolumnid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pcolumndef;
    (void)pvdefault;
    (void)cbdefault;
    (void)pcolumnid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetAttachDatabase2A(uint64_t sesid, void* szfilename, uint32_t cpgdatabasesizemax, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabase2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetAttachDatabase2W(uint64_t sesid, void* szfilename, uint32_t cpgdatabasesizemax, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabase2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetAttachDatabaseA(uint64_t sesid, void* szfilename, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabaseA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetAttachDatabaseW(uint64_t sesid, void* szfilename, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetAttachDatabaseW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBackupA(void* szbackuppath, uint32_t grbit, void* pfnstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szbackuppath, grbit, pfnstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBackupInstanceA(uint64_t instance, void* szbackuppath, uint32_t grbit, void* pfnstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupInstanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, szbackuppath, grbit, pfnstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBackupInstanceW(uint64_t instance, void* szbackuppath, uint32_t grbit, void* pfnstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, szbackuppath, grbit, pfnstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBackupW(void* szbackuppath, uint32_t grbit, void* pfnstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBackupW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szbackuppath, grbit, pfnstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szbackuppath;
    (void)grbit;
    (void)pfnstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBeginExternalBackup(uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginExternalBackup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBeginExternalBackupInstance(uint64_t instance, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginExternalBackupInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBeginSessionA(uint64_t instance, void* psesid, void* szusername, void* szpassword) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginSessionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, psesid, szusername, szpassword);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBeginSessionW(uint64_t instance, void* psesid, void* szusername, void* szpassword) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginSessionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, psesid, szusername, szpassword);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)psesid;
    (void)szusername;
    (void)szpassword;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBeginTransaction(uint64_t sesid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBeginTransaction2(uint64_t sesid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginTransaction2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetBeginTransaction3(uint64_t sesid, int64_t trxid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetBeginTransaction3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, trxid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)trxid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCloseDatabase(uint64_t sesid, uint32_t dbid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCloseFile(uint64_t hffile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hffile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hffile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCloseFileInstance(uint64_t instance, uint64_t hffile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseFileInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, hffile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)hffile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCloseTable(uint64_t sesid, uint64_t tableid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCloseTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCommitTransaction(uint64_t sesid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCommitTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCommitTransaction2(uint64_t sesid, uint32_t grbit, uint32_t cmsecdurablecommit, void* pcommitid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCommitTransaction2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, grbit, cmsecdurablecommit, pcommitid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)grbit;
    (void)cmsecdurablecommit;
    (void)pcommitid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCompactA(uint64_t sesid, void* szdatabasesrc, void* szdatabasedest, void* pfnstatus, void* pconvert, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCompactA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szdatabasesrc, szdatabasedest, pfnstatus, pconvert, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCompactW(uint64_t sesid, void* szdatabasesrc, void* szdatabasedest, void* pfnstatus, void* pconvert, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCompactW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szdatabasesrc, szdatabasedest, pfnstatus, pconvert, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szdatabasesrc;
    (void)szdatabasedest;
    (void)pfnstatus;
    (void)pconvert;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetComputeStats(uint64_t sesid, uint64_t tableid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetComputeStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetConfigureProcessForCrashDump(uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetConfigureProcessForCrashDump");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateDatabase2A(uint64_t sesid, void* szfilename, uint32_t cpgdatabasesizemax, void* pdbid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabase2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, pdbid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateDatabase2W(uint64_t sesid, void* szfilename, uint32_t cpgdatabasesizemax, void* pdbid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabase2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, cpgdatabasesizemax, pdbid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)cpgdatabasesizemax;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateDatabaseA(uint64_t sesid, void* szfilename, void* szconnect, void* pdbid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabaseA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateDatabaseW(uint64_t sesid, void* szfilename, void* szconnect, void* pdbid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateDatabaseW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateIndex2A(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateIndex2W(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateIndex3A(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex3A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateIndex3W(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex3W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateIndex4A(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex4A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateIndex4W(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndex4W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pindexcreate, cindexcreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pindexcreate;
    (void)cindexcreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateIndexA(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit, void* szkey, uint32_t cbkey, uint32_t ldensity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, grbit, szkey, cbkey, ldensity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateIndexW(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit, void* szkey, uint32_t cbkey, uint32_t ldensity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, grbit, szkey, cbkey, ldensity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)szkey;
    (void)cbkey;
    (void)ldensity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateInstance2A(void* pinstance, void* szinstancename, void* szdisplayname, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstance2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance, szinstancename, szdisplayname, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateInstance2W(void* pinstance, void* szinstancename, void* szdisplayname, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstance2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance, szinstancename, szdisplayname, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    (void)szinstancename;
    (void)szdisplayname;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateInstanceA(void* pinstance, void* szinstancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance, szinstancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    (void)szinstancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateInstanceW(void* pinstance, void* szinstancename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance, szinstancename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    (void)szinstancename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableA(uint64_t sesid, uint32_t dbid, void* sztablename, uint32_t lpages, uint32_t ldensity, void* ptableid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, lpages, ldensity, ptableid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2A(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, ptablecreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2W(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, ptablecreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3A(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex3A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, ptablecreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3W(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex3W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, ptablecreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4A(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex4A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, ptablecreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4W(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndex4W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, ptablecreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexA(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, ptablecreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexW(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableColumnIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, ptablecreate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)ptablecreate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetCreateTableW(uint64_t sesid, uint32_t dbid, void* sztablename, uint32_t lpages, uint32_t ldensity, void* ptableid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetCreateTableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, lpages, ldensity, ptableid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)lpages;
    (void)ldensity;
    (void)ptableid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDefragment2A(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcpasses, void* pcseconds, void* callback, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, callback, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDefragment2W(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcpasses, void* pcseconds, void* callback, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, callback, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)callback;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDefragment3A(uint64_t sesid, void* szdatabasename, void* sztablename, void* pcpasses, void* pcseconds, void* callback, void* pvcontext, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment3A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szdatabasename, sztablename, pcpasses, pcseconds, callback, pvcontext, grbit);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDefragment3W(uint64_t sesid, void* szdatabasename, void* sztablename, void* pcpasses, void* pcseconds, void* callback, void* pvcontext, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragment3W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szdatabasename, sztablename, pcpasses, pcseconds, callback, pvcontext, grbit);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDefragmentA(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcpasses, void* pcseconds, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragmentA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDefragmentW(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcpasses, void* pcseconds, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDefragmentW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, pcpasses, pcseconds, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcpasses;
    (void)pcseconds;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDelete(uint64_t sesid, uint64_t tableid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDelete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDeleteColumn2A(uint64_t sesid, uint64_t tableid, void* szcolumnname, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumn2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szcolumnname, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDeleteColumn2W(uint64_t sesid, uint64_t tableid, void* szcolumnname, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumn2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szcolumnname, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDeleteColumnA(uint64_t sesid, uint64_t tableid, void* szcolumnname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szcolumnname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDeleteColumnW(uint64_t sesid, uint64_t tableid, void* szcolumnname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteColumnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szcolumnname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDeleteIndexA(uint64_t sesid, uint64_t tableid, void* szindexname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteIndexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDeleteIndexW(uint64_t sesid, uint64_t tableid, void* szindexname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDeleteTableA(uint64_t sesid, uint32_t dbid, void* sztablename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteTableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDeleteTableW(uint64_t sesid, uint32_t dbid, void* sztablename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDeleteTableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDetachDatabase2A(uint64_t sesid, void* szfilename, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabase2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDetachDatabase2W(uint64_t sesid, void* szfilename, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabase2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDetachDatabaseA(uint64_t sesid, void* szfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabaseA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDetachDatabaseW(uint64_t sesid, void* szfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDetachDatabaseW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDupCursor(uint64_t sesid, uint64_t tableid, void* ptableid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDupCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, ptableid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)ptableid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetDupSession(uint64_t sesid, void* psesid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetDupSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, psesid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)psesid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetEnableMultiInstanceA(void* psetsysparam, uint32_t csetsysparam, void* pcsetsucceed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEnableMultiInstanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psetsysparam, csetsysparam, pcsetsucceed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetEnableMultiInstanceW(void* psetsysparam, uint32_t csetsysparam, void* pcsetsucceed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEnableMultiInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psetsysparam, csetsysparam, pcsetsucceed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psetsysparam;
    (void)csetsysparam;
    (void)pcsetsucceed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetEndExternalBackup(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndExternalBackup");
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

int32_t windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance(uint64_t instance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndExternalBackupInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance2(uint64_t instance, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndExternalBackupInstance2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetEndSession(uint64_t sesid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEndSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetEnumerateColumns(uint64_t sesid, uint64_t tableid, uint32_t cenumcolumnid, void* rgenumcolumnid, void* pcenumcolumn, void* prgenumcolumn, void* pfnrealloc, void* pvrealloccontext, uint32_t cbdatamost, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEnumerateColumns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, cenumcolumnid, rgenumcolumnid, pcenumcolumn, prgenumcolumn, pfnrealloc, pvrealloccontext, cbdatamost, grbit);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetEscrowUpdate(uint64_t sesid, uint64_t tableid, uint32_t columnid, void* pv, uint32_t cbmax, void* pvold, uint32_t cboldmax, void* pcboldactual, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetEscrowUpdate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, columnid, pv, cbmax, pvold, cboldmax, pcboldactual, grbit);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetExternalRestore2A(void* szcheckpointfilepath, void* szlogpath, void* rgrstmap, int32_t crstfilemap, void* szbackuplogpath, void* ploginfo, void* sztargetinstancename, void* sztargetinstancelogpath, void* sztargetinstancecheckpointpath, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestore2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, pfn);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetExternalRestore2W(void* szcheckpointfilepath, void* szlogpath, void* rgrstmap, int32_t crstfilemap, void* szbackuplogpath, void* ploginfo, void* sztargetinstancename, void* sztargetinstancelogpath, void* sztargetinstancecheckpointpath, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestore2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, pfn);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetExternalRestoreA(void* szcheckpointfilepath, void* szlogpath, void* rgrstmap, int32_t crstfilemap, void* szbackuplogpath, int32_t genlow, int32_t genhigh, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestoreA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, genlow, genhigh, pfn);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetExternalRestoreW(void* szcheckpointfilepath, void* szlogpath, void* rgrstmap, int32_t crstfilemap, void* szbackuplogpath, int32_t genlow, int32_t genhigh, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetExternalRestoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap, szbackuplogpath, genlow, genhigh, pfn);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetFreeBuffer(void* pbbuf) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetFreeBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pbbuf);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pbbuf;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetAttachInfoA(void* szzdatabases, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szzdatabases, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceA(uint64_t instance, void* szzdatabases, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoInstanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, szzdatabases, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceW(uint64_t instance, void* szzdatabases, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, szzdatabases, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)szzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetAttachInfoW(void* wszzdatabases, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetAttachInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszzdatabases, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszzdatabases;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetBookmark(uint64_t sesid, uint64_t tableid, void* pvbookmark, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetBookmark");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvbookmark, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetColumnInfoA(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcolumnnameorid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetColumnInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, pcolumnnameorid, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetColumnInfoW(uint64_t sesid, uint32_t dbid, void* sztablename, void* pwcolumnnameorid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetColumnInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, pwcolumnnameorid, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pwcolumnnameorid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetCurrentIndexA(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t cbindexname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetCurrentIndexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, cbindexname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetCurrentIndexW(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t cbindexname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetCurrentIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, cbindexname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)cbindexname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetCursorInfo(uint64_t sesid, uint64_t tableid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetCursorInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoA(void* szdatabasename, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseFileInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatabasename, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoW(void* szdatabasename, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseFileInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szdatabasename, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szdatabasename;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetDatabaseInfoA(uint64_t sesid, uint32_t dbid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetDatabaseInfoW(uint64_t sesid, uint32_t dbid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetDatabaseInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetErrorInfoW(void* pvcontext, void* pvresult, uint32_t cbmax, uint32_t infolevel, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetErrorInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvcontext, pvresult, cbmax, infolevel, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvcontext;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetIndexInfoA(uint64_t sesid, uint32_t dbid, void* sztablename, void* szindexname, void* pvresult, uint32_t cbresult, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetIndexInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, szindexname, pvresult, cbresult, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetIndexInfoW(uint64_t sesid, uint32_t dbid, void* sztablename, void* szindexname, void* pvresult, uint32_t cbresult, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetIndexInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, szindexname, pvresult, cbresult, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetInstanceInfoA(void* pcinstanceinfo, void* painstanceinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetInstanceInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcinstanceinfo, painstanceinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetInstanceInfoW(void* pcinstanceinfo, void* painstanceinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetInstanceInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcinstanceinfo, painstanceinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetInstanceMiscInfo(uint64_t instance, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetInstanceMiscInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetLS(uint64_t sesid, uint64_t tableid, void* pls, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pls, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pls;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetLock(uint64_t sesid, uint64_t tableid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetLogInfoA(void* szzlogs, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szzlogs, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2A(uint64_t instance, void* szzlogs, uint32_t cbmax, void* pcbactual, void* ploginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstance2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, szzlogs, cbmax, pcbactual, ploginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2W(uint64_t instance, void* wszzlogs, uint32_t cbmax, void* pcbactual, void* ploginfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstance2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, wszzlogs, cbmax, pcbactual, ploginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    (void)ploginfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceA(uint64_t instance, void* szzlogs, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, szzlogs, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceW(uint64_t instance, void* wszzlogs, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, wszzlogs, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetLogInfoW(void* szzlogs, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetLogInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szzlogs, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetObjectInfoA(uint64_t sesid, uint32_t dbid, uint32_t objtyp, void* szcontainername, void* szobjectname, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetObjectInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, objtyp, szcontainername, szobjectname, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetObjectInfoW(uint64_t sesid, uint32_t dbid, uint32_t objtyp, void* szcontainername, void* szobjectname, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetObjectInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, objtyp, szcontainername, szobjectname, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetRecordPosition(uint64_t sesid, uint64_t tableid, void* precpos, uint32_t cbrecpos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetRecordPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, precpos, cbrecpos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    (void)cbrecpos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetRecordSize(uint64_t sesid, uint64_t tableid, void* precsize, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetRecordSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, precsize, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetRecordSize2(uint64_t sesid, uint64_t tableid, void* precsize, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetRecordSize2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, precsize, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precsize;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetSecondaryIndexBookmark(uint64_t sesid, uint64_t tableid, void* pvsecondarykey, uint32_t cbsecondarykeymax, void* pcbsecondarykeyactual, void* pvprimarybookmark, uint32_t cbprimarybookmarkmax, void* pcbprimarybookmarkactual, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSecondaryIndexBookmark");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvsecondarykey, cbsecondarykeymax, pcbsecondarykeyactual, pvprimarybookmark, cbprimarybookmarkmax, pcbprimarybookmarkactual, grbit);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetSessionParameter(uint64_t sesid, uint32_t sesparamid, void* pvparam, uint32_t cbparammax, void* pcbparamactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSessionParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, sesparamid, pvparam, cbparammax, pcbparamactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparammax;
    (void)pcbparamactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetSystemParameterA(uint64_t instance, uint64_t sesid, uint32_t paramid, void* plparam, void* szparam, uint32_t cbmax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSystemParameterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, sesid, paramid, plparam, szparam, cbmax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetSystemParameterW(uint64_t instance, uint64_t sesid, uint32_t paramid, void* plparam, void* szparam, uint32_t cbmax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetSystemParameterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, sesid, paramid, plparam, szparam, cbmax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)sesid;
    (void)paramid;
    (void)plparam;
    (void)szparam;
    (void)cbmax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetTableColumnInfoA(uint64_t sesid, uint64_t tableid, void* szcolumnname, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableColumnInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szcolumnname, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetTableColumnInfoW(uint64_t sesid, uint64_t tableid, void* szcolumnname, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableColumnInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szcolumnname, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szcolumnname;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetTableIndexInfoA(uint64_t sesid, uint64_t tableid, void* szindexname, void* pvresult, uint32_t cbresult, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableIndexInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, pvresult, cbresult, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetTableIndexInfoW(uint64_t sesid, uint64_t tableid, void* szindexname, void* pvresult, uint32_t cbresult, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableIndexInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, pvresult, cbresult, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pvresult;
    (void)cbresult;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetTableInfoA(uint64_t sesid, uint64_t tableid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetTableInfoW(uint64_t sesid, uint64_t tableid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTableInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvresult, cbmax, infolevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvresult;
    (void)cbmax;
    (void)infolevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetThreadStats(void* pvresult, uint32_t cbmax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetThreadStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvresult, cbmax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvresult;
    (void)cbmax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceA(uint64_t instance, void* szzlogs, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTruncateLogInfoInstanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, szzlogs, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)szzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceW(uint64_t instance, void* wszzlogs, uint32_t cbmax, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetTruncateLogInfoInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, wszzlogs, cbmax, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)wszzlogs;
    (void)cbmax;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGetVersion(uint64_t sesid, void* pwversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGetVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, pwversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)pwversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGotoBookmark(uint64_t sesid, uint64_t tableid, void* pvbookmark, uint32_t cbbookmark) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGotoBookmark");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvbookmark, cbbookmark);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGotoPosition(uint64_t sesid, uint64_t tableid, void* precpos) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGotoPosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, precpos);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)precpos;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGotoSecondaryIndexBookmark(uint64_t sesid, uint64_t tableid, void* pvsecondarykey, uint32_t cbsecondarykey, void* pvprimarybookmark, uint32_t cbprimarybookmark, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGotoSecondaryIndexBookmark");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvsecondarykey, cbsecondarykey, pvprimarybookmark, cbprimarybookmark, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvsecondarykey;
    (void)cbsecondarykey;
    (void)pvprimarybookmark;
    (void)cbprimarybookmark;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetGrowDatabase(uint64_t sesid, uint32_t dbid, uint32_t cpg, void* pcpgreal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetGrowDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, cpg, pcpgreal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)cpg;
    (void)pcpgreal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetIdle(uint64_t sesid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetIdle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetIndexRecordCount(uint64_t sesid, uint64_t tableid, void* pcrec, uint32_t crecmax) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetIndexRecordCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pcrec, crecmax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pcrec;
    (void)crecmax;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetInit(void* pinstance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetInit2(void* pinstance, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetInit3A(void* pinstance, void* prstinfo, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit3A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance, prstinfo, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetInit3W(void* pinstance, void* prstinfo, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetInit3W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance, prstinfo, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    (void)prstinfo;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetIntersectIndexes(uint64_t sesid, void* rgindexrange, uint32_t cindexrange, void* precordlist, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetIntersectIndexes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, rgindexrange, cindexrange, precordlist, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)rgindexrange;
    (void)cindexrange;
    (void)precordlist;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetMakeKey(uint64_t sesid, uint64_t tableid, void* pvdata, uint32_t cbdata, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetMakeKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvdata, cbdata, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetMove(uint64_t sesid, uint64_t tableid, int32_t crow, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetMove");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, crow, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)crow;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotAbort(uint64_t snapid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotAbort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotEnd(uint64_t snapid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeA(uint64_t snapid, void* pcinstanceinfo, void* painstanceinfo, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotFreezeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeW(uint64_t snapid, void* pcinstanceinfo, void* painstanceinfo, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotFreezeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoA(uint64_t snapid, void* pcinstanceinfo, void* painstanceinfo, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotGetFreezeInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoW(uint64_t snapid, void* pcinstanceinfo, void* painstanceinfo, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotGetFreezeInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, pcinstanceinfo, painstanceinfo, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)pcinstanceinfo;
    (void)painstanceinfo;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotPrepare(void* psnapid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotPrepare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(psnapid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)psnapid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotPrepareInstance(uint64_t snapid, uint64_t instance, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotPrepareInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, instance, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotThaw(uint64_t snapid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotThaw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLog(uint64_t snapid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotTruncateLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLogInstance(uint64_t snapid, uint64_t instance, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOSSnapshotTruncateLogInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(snapid, instance, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)snapid;
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenDatabaseA(uint64_t sesid, void* szfilename, void* szconnect, void* pdbid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenDatabaseA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenDatabaseW(uint64_t sesid, void* szfilename, void* szconnect, void* pdbid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenDatabaseW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szfilename, szconnect, pdbid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szfilename;
    (void)szconnect;
    (void)pdbid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenFileA(void* szfilename, void* phffile, void* pulfilesizelow, void* pulfilesizehigh) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, phffile, pulfilesizelow, pulfilesizehigh);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenFileInstanceA(uint64_t instance, void* szfilename, void* phffile, void* pulfilesizelow, void* pulfilesizehigh) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileInstanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, szfilename, phffile, pulfilesizelow, pulfilesizehigh);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenFileInstanceW(uint64_t instance, void* szfilename, void* phffile, void* pulfilesizelow, void* pulfilesizehigh) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, szfilename, phffile, pulfilesizelow, pulfilesizehigh);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenFileW(void* szfilename, void* phffile, void* pulfilesizelow, void* pulfilesizehigh) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szfilename, phffile, pulfilesizelow, pulfilesizehigh);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szfilename;
    (void)phffile;
    (void)pulfilesizelow;
    (void)pulfilesizehigh;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenTableA(uint64_t sesid, uint32_t dbid, void* sztablename, void* pvparameters, uint32_t cbparameters, uint32_t grbit, void* ptableid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, pvparameters, cbparameters, grbit, ptableid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenTableW(uint64_t sesid, uint32_t dbid, void* sztablename, void* pvparameters, uint32_t cbparameters, uint32_t grbit, void* ptableid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, pvparameters, cbparameters, grbit, ptableid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)pvparameters;
    (void)cbparameters;
    (void)grbit;
    (void)ptableid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenTempTable(uint64_t sesid, void* prgcolumndef, uint32_t ccolumn, uint32_t grbit, void* ptableid, void* prgcolumnid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTempTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, prgcolumndef, ccolumn, grbit, ptableid, prgcolumnid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenTempTable2(uint64_t sesid, void* prgcolumndef, uint32_t ccolumn, uint32_t lcid, uint32_t grbit, void* ptableid, void* prgcolumnid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTempTable2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, prgcolumndef, ccolumn, lcid, grbit, ptableid, prgcolumnid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)lcid;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenTempTable3(uint64_t sesid, void* prgcolumndef, uint32_t ccolumn, void* pidxunicode, uint32_t grbit, void* ptableid, void* prgcolumnid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTempTable3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, prgcolumndef, ccolumn, pidxunicode, grbit, ptableid, prgcolumnid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)prgcolumndef;
    (void)ccolumn;
    (void)pidxunicode;
    (void)grbit;
    (void)ptableid;
    (void)prgcolumnid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenTemporaryTable(uint64_t sesid, void* popentemporarytable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTemporaryTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, popentemporarytable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)popentemporarytable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetOpenTemporaryTable2(uint64_t sesid, void* popentemporarytable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetOpenTemporaryTable2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, popentemporarytable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)popentemporarytable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetPrepareUpdate(uint64_t sesid, uint64_t tableid, uint32_t prep) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetPrepareUpdate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, prep);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)prep;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetPrereadIndexRanges(uint64_t sesid, uint64_t tableid, void* rgindexranges, uint32_t cindexranges, void* pcrangespreread, void* rgcolumnidpreread, uint32_t ccolumnidpreread, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetPrereadIndexRanges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, rgindexranges, cindexranges, pcrangespreread, rgcolumnidpreread, ccolumnidpreread, grbit);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetPrereadKeys(uint64_t sesid, uint64_t tableid, void* rgpvkeys, void* rgcbkeys, int32_t ckeys, void* pckeyspreread, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetPrereadKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, rgpvkeys, rgcbkeys, ckeys, pckeyspreread, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)rgpvkeys;
    (void)rgcbkeys;
    (void)ckeys;
    (void)pckeyspreread;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetReadFile(uint64_t hffile, void* pv, uint32_t cb, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetReadFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hffile, pv, cb, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetReadFileInstance(uint64_t instance, uint64_t hffile, void* pv, uint32_t cb, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetReadFileInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, hffile, pv, cb, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)hffile;
    (void)pv;
    (void)cb;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRegisterCallback(uint64_t sesid, uint64_t tableid, uint32_t cbtyp, void* pcallback, void* pvcontext, void* phcallbackid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRegisterCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, cbtyp, pcallback, pvcontext, phcallbackid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)pcallback;
    (void)pvcontext;
    (void)phcallbackid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRenameColumnA(uint64_t sesid, uint64_t tableid, void* szname, void* sznamenew, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameColumnA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szname, sznamenew, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRenameColumnW(uint64_t sesid, uint64_t tableid, void* szname, void* sznamenew, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameColumnW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szname, sznamenew, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szname;
    (void)sznamenew;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRenameTableA(uint64_t sesid, uint32_t dbid, void* szname, void* sznamenew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameTableA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, szname, sznamenew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRenameTableW(uint64_t sesid, uint32_t dbid, void* szname, void* sznamenew) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRenameTableW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, szname, sznamenew);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)szname;
    (void)sznamenew;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetResetSessionContext(uint64_t sesid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetResetSessionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetResetTableSequential(uint64_t sesid, uint64_t tableid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetResetTableSequential");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetResizeDatabase(uint64_t sesid, uint32_t dbid, uint32_t cpgtarget, void* pcpgactual, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetResizeDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, cpgtarget, pcpgactual, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)cpgtarget;
    (void)pcpgactual;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRestore2A(void* sz, void* szdest, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestore2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sz, szdest, pfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRestore2W(void* sz, void* szdest, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestore2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sz, szdest, pfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRestoreA(void* szsource, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szsource, pfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szsource;
    (void)pfn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRestoreInstanceA(uint64_t instance, void* sz, void* szdest, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreInstanceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, sz, szdest, pfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRestoreInstanceW(uint64_t instance, void* sz, void* szdest, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreInstanceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, sz, szdest, pfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)sz;
    (void)szdest;
    (void)pfn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRestoreW(void* szsource, void* pfn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRestoreW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szsource, pfn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szsource;
    (void)pfn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRetrieveColumn(uint64_t sesid, uint64_t tableid, uint32_t columnid, void* pvdata, uint32_t cbdata, void* pcbactual, uint32_t grbit, void* pretinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRetrieveColumn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, columnid, pvdata, cbdata, pcbactual, grbit, pretinfo);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRetrieveColumns(uint64_t sesid, uint64_t tableid, void* pretrievecolumn, uint32_t cretrievecolumn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRetrieveColumns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pretrievecolumn, cretrievecolumn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pretrievecolumn;
    (void)cretrievecolumn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRetrieveKey(uint64_t sesid, uint64_t tableid, void* pvkey, uint32_t cbmax, void* pcbactual, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRetrieveKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvkey, cbmax, pcbactual, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvkey;
    (void)cbmax;
    (void)pcbactual;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetRollback(uint64_t sesid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetRollback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSeek(uint64_t sesid, uint64_t tableid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSeek");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetColumn(uint64_t sesid, uint64_t tableid, uint32_t columnid, void* pvdata, uint32_t cbdata, uint32_t grbit, void* psetinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, columnid, pvdata, cbdata, grbit, psetinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)columnid;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    (void)psetinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueA(uint64_t sesid, uint32_t dbid, void* sztablename, void* szcolumnname, void* pvdata, uint32_t cbdata, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumnDefaultValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, szcolumnname, pvdata, cbdata, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueW(uint64_t sesid, uint32_t dbid, void* sztablename, void* szcolumnname, void* pvdata, uint32_t cbdata, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumnDefaultValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, dbid, sztablename, szcolumnname, pvdata, cbdata, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)dbid;
    (void)sztablename;
    (void)szcolumnname;
    (void)pvdata;
    (void)cbdata;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetColumns(uint64_t sesid, uint64_t tableid, void* psetcolumn, uint32_t csetcolumn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetColumns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, psetcolumn, csetcolumn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)psetcolumn;
    (void)csetcolumn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetCurrentIndex2A(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetCurrentIndex2W(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetCurrentIndex3A(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit, uint32_t itagsequence) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex3A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, grbit, itagsequence);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetCurrentIndex3W(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit, uint32_t itagsequence) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex3W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, grbit, itagsequence);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetCurrentIndex4A(uint64_t sesid, uint64_t tableid, void* szindexname, void* pindexid, uint32_t grbit, uint32_t itagsequence) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex4A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, pindexid, grbit, itagsequence);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetCurrentIndex4W(uint64_t sesid, uint64_t tableid, void* szindexname, void* pindexid, uint32_t grbit, uint32_t itagsequence) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndex4W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname, pindexid, grbit, itagsequence);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    (void)pindexid;
    (void)grbit;
    (void)itagsequence;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetCurrentIndexA(uint64_t sesid, uint64_t tableid, void* szindexname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndexA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetCurrentIndexW(uint64_t sesid, uint64_t tableid, void* szindexname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCurrentIndexW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, szindexname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)szindexname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetCursorFilter(uint64_t sesid, uint64_t tableid, void* rgcolumnfilters, uint32_t ccolumnfilters, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetCursorFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, rgcolumnfilters, ccolumnfilters, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)rgcolumnfilters;
    (void)ccolumnfilters;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetDatabaseSizeA(uint64_t sesid, void* szdatabasename, uint32_t cpg, void* pcpgreal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetDatabaseSizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szdatabasename, cpg, pcpgreal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetDatabaseSizeW(uint64_t sesid, void* szdatabasename, uint32_t cpg, void* pcpgreal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetDatabaseSizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, szdatabasename, cpg, pcpgreal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)szdatabasename;
    (void)cpg;
    (void)pcpgreal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetIndexRange(uint64_t sesid, uint64_t tableidsrc, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetIndexRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableidsrc, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableidsrc;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetLS(uint64_t sesid, uint64_t tableid, uint64_t ls, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetLS");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, ls, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)ls;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetSessionContext(uint64_t sesid, uint64_t ulcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSessionContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, ulcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)ulcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetSessionParameter(uint64_t sesid, uint32_t sesparamid, void* pvparam, uint32_t cbparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSessionParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, sesparamid, pvparam, cbparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)sesparamid;
    (void)pvparam;
    (void)cbparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetSystemParameterA(void* pinstance, uint64_t sesid, uint32_t paramid, uint64_t lparam, void* szparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSystemParameterA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance, sesid, paramid, lparam, szparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetSystemParameterW(void* pinstance, uint64_t sesid, uint32_t paramid, uint64_t lparam, void* szparam) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetSystemParameterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinstance, sesid, paramid, lparam, szparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pinstance;
    (void)sesid;
    (void)paramid;
    (void)lparam;
    (void)szparam;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetSetTableSequential(uint64_t sesid, uint64_t tableid, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetSetTableSequential");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetStopBackup(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopBackup");
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

int32_t windowssys_windows_win32_storage_jet_JetStopBackupInstance(uint64_t instance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopBackupInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetStopService(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopService");
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

int32_t windowssys_windows_win32_storage_jet_JetStopServiceInstance(uint64_t instance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopServiceInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetStopServiceInstance2(uint64_t instance, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetStopServiceInstance2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetTerm(uint64_t instance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTerm");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetTerm2(uint64_t instance, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTerm2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetTruncateLog(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTruncateLog");
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

int32_t windowssys_windows_win32_storage_jet_JetTruncateLogInstance(uint64_t instance) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetTruncateLogInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(instance);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)instance;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetUnregisterCallback(uint64_t sesid, uint64_t tableid, uint32_t cbtyp, uint64_t hcallbackid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetUnregisterCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, cbtyp, hcallbackid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)cbtyp;
    (void)hcallbackid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetUpdate(uint64_t sesid, uint64_t tableid, void* pvbookmark, uint32_t cbbookmark, void* pcbactual) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetUpdate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvbookmark, cbbookmark, pcbactual);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_jet_JetUpdate2(uint64_t sesid, uint64_t tableid, void* pvbookmark, uint32_t cbbookmark, void* pcbactual, uint32_t grbit) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t, uint64_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("esent.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "JetUpdate2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sesid, tableid, pvbookmark, cbbookmark, pcbactual, grbit);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sesid;
    (void)tableid;
    (void)pvbookmark;
    (void)cbbookmark;
    (void)pcbactual;
    (void)grbit;
    errno = ENOSYS;
    return -1;
#endif
}

