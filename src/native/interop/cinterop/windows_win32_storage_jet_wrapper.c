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

int32_t windowssysWindowsWin32StorageJetJetAddColumnA(uint64_t sesid, uint64_t tableid, void* szcolumnname, void* pcolumndef, void* pvdefault, uint32_t cbdefault, void* pcolumnid) {
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

int32_t windowssysWindowsWin32StorageJetJetAddColumnW(uint64_t sesid, uint64_t tableid, void* szcolumnname, void* pcolumndef, void* pvdefault, uint32_t cbdefault, void* pcolumnid) {
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

int32_t windowssysWindowsWin32StorageJetJetAttachDatabase2A(uint64_t sesid, void* szfilename, uint32_t cpgdatabasesizemax, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetAttachDatabase2W(uint64_t sesid, void* szfilename, uint32_t cpgdatabasesizemax, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetAttachDatabaseA(uint64_t sesid, void* szfilename, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetAttachDatabaseW(uint64_t sesid, void* szfilename, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetBackupA(void* szbackuppath, uint32_t grbit, void* pfnstatus) {
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

int32_t windowssysWindowsWin32StorageJetJetBackupInstanceA(uint64_t instance, void* szbackuppath, uint32_t grbit, void* pfnstatus) {
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

int32_t windowssysWindowsWin32StorageJetJetBackupInstanceW(uint64_t instance, void* szbackuppath, uint32_t grbit, void* pfnstatus) {
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

int32_t windowssysWindowsWin32StorageJetJetBackupW(void* szbackuppath, uint32_t grbit, void* pfnstatus) {
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

int32_t windowssysWindowsWin32StorageJetJetBeginExternalBackup(uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(uint64_t instance, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetBeginSessionA(uint64_t instance, void* psesid, void* szusername, void* szpassword) {
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

int32_t windowssysWindowsWin32StorageJetJetBeginSessionW(uint64_t instance, void* psesid, void* szusername, void* szpassword) {
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

int32_t windowssysWindowsWin32StorageJetJetBeginTransaction(uint64_t sesid) {
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

int32_t windowssysWindowsWin32StorageJetJetBeginTransaction2(uint64_t sesid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetBeginTransaction3(uint64_t sesid, int64_t trxid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCloseDatabase(uint64_t sesid, uint32_t dbid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCloseFile(uint64_t hffile) {
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

int32_t windowssysWindowsWin32StorageJetJetCloseFileInstance(uint64_t instance, uint64_t hffile) {
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

int32_t windowssysWindowsWin32StorageJetJetCloseTable(uint64_t sesid, uint64_t tableid) {
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

int32_t windowssysWindowsWin32StorageJetJetCommitTransaction(uint64_t sesid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCommitTransaction2(uint64_t sesid, uint32_t grbit, uint32_t cmsecdurablecommit, void* pcommitid) {
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

int32_t windowssysWindowsWin32StorageJetJetCompactA(uint64_t sesid, void* szdatabasesrc, void* szdatabasedest, void* pfnstatus, void* pconvert, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCompactW(uint64_t sesid, void* szdatabasesrc, void* szdatabasedest, void* pfnstatus, void* pconvert, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetComputeStats(uint64_t sesid, uint64_t tableid) {
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

int32_t windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateDatabase2A(uint64_t sesid, void* szfilename, uint32_t cpgdatabasesizemax, void* pdbid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateDatabase2W(uint64_t sesid, void* szfilename, uint32_t cpgdatabasesizemax, void* pdbid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateDatabaseA(uint64_t sesid, void* szfilename, void* szconnect, void* pdbid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateDatabaseW(uint64_t sesid, void* szfilename, void* szconnect, void* pdbid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateIndex2A(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateIndex2W(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateIndex3A(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateIndex3W(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateIndex4A(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateIndex4W(uint64_t sesid, uint64_t tableid, void* pindexcreate, uint32_t cindexcreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateIndexA(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit, void* szkey, uint32_t cbkey, uint32_t ldensity) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateIndexW(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit, void* szkey, uint32_t cbkey, uint32_t ldensity) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateInstance2A(void* pinstance, void* szinstancename, void* szdisplayname, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateInstance2W(void* pinstance, void* szinstancename, void* szdisplayname, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateInstanceA(void* pinstance, void* szinstancename) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateInstanceW(void* pinstance, void* szinstancename) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableA(uint64_t sesid, uint32_t dbid, void* sztablename, uint32_t lpages, uint32_t ldensity, void* ptableid) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW(uint64_t sesid, uint32_t dbid, void* ptablecreate) {
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

int32_t windowssysWindowsWin32StorageJetJetCreateTableW(uint64_t sesid, uint32_t dbid, void* sztablename, uint32_t lpages, uint32_t ldensity, void* ptableid) {
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

int32_t windowssysWindowsWin32StorageJetJetDefragment2A(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcpasses, void* pcseconds, void* callback, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDefragment2W(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcpasses, void* pcseconds, void* callback, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDefragment3A(uint64_t sesid, void* szdatabasename, void* sztablename, void* pcpasses, void* pcseconds, void* callback, void* pvcontext, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDefragment3W(uint64_t sesid, void* szdatabasename, void* sztablename, void* pcpasses, void* pcseconds, void* callback, void* pvcontext, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDefragmentA(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcpasses, void* pcseconds, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDefragmentW(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcpasses, void* pcseconds, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDelete(uint64_t sesid, uint64_t tableid) {
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

int32_t windowssysWindowsWin32StorageJetJetDeleteColumn2A(uint64_t sesid, uint64_t tableid, void* szcolumnname, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDeleteColumn2W(uint64_t sesid, uint64_t tableid, void* szcolumnname, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDeleteColumnA(uint64_t sesid, uint64_t tableid, void* szcolumnname) {
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

int32_t windowssysWindowsWin32StorageJetJetDeleteColumnW(uint64_t sesid, uint64_t tableid, void* szcolumnname) {
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

int32_t windowssysWindowsWin32StorageJetJetDeleteIndexA(uint64_t sesid, uint64_t tableid, void* szindexname) {
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

int32_t windowssysWindowsWin32StorageJetJetDeleteIndexW(uint64_t sesid, uint64_t tableid, void* szindexname) {
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

int32_t windowssysWindowsWin32StorageJetJetDeleteTableA(uint64_t sesid, uint32_t dbid, void* sztablename) {
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

int32_t windowssysWindowsWin32StorageJetJetDeleteTableW(uint64_t sesid, uint32_t dbid, void* sztablename) {
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

int32_t windowssysWindowsWin32StorageJetJetDetachDatabase2A(uint64_t sesid, void* szfilename, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDetachDatabase2W(uint64_t sesid, void* szfilename, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDetachDatabaseA(uint64_t sesid, void* szfilename) {
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

int32_t windowssysWindowsWin32StorageJetJetDetachDatabaseW(uint64_t sesid, void* szfilename) {
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

int32_t windowssysWindowsWin32StorageJetJetDupCursor(uint64_t sesid, uint64_t tableid, void* ptableid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetDupSession(uint64_t sesid, void* psesid) {
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

int32_t windowssysWindowsWin32StorageJetJetEnableMultiInstanceA(void* psetsysparam, uint32_t csetsysparam, void* pcsetsucceed) {
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

int32_t windowssysWindowsWin32StorageJetJetEnableMultiInstanceW(void* psetsysparam, uint32_t csetsysparam, void* pcsetsucceed) {
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

int32_t windowssysWindowsWin32StorageJetJetEndExternalBackup(void) {
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

int32_t windowssysWindowsWin32StorageJetJetEndExternalBackupInstance(uint64_t instance) {
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

int32_t windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(uint64_t instance, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetEndSession(uint64_t sesid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetEnumerateColumns(uint64_t sesid, uint64_t tableid, uint32_t cenumcolumnid, void* rgenumcolumnid, void* pcenumcolumn, void* prgenumcolumn, void* pfnrealloc, void* pvrealloccontext, uint32_t cbdatamost, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetEscrowUpdate(uint64_t sesid, uint64_t tableid, uint32_t columnid, void* pv, uint32_t cbmax, void* pvold, uint32_t cboldmax, void* pcboldactual, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetExternalRestore2A(void* szcheckpointfilepath, void* szlogpath, void* rgrstmap, int32_t crstfilemap, void* szbackuplogpath, void* ploginfo, void* sztargetinstancename, void* sztargetinstancelogpath, void* sztargetinstancecheckpointpath, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetExternalRestore2W(void* szcheckpointfilepath, void* szlogpath, void* rgrstmap, int32_t crstfilemap, void* szbackuplogpath, void* ploginfo, void* sztargetinstancename, void* sztargetinstancelogpath, void* sztargetinstancecheckpointpath, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetExternalRestoreA(void* szcheckpointfilepath, void* szlogpath, void* rgrstmap, int32_t crstfilemap, void* szbackuplogpath, int32_t genlow, int32_t genhigh, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetExternalRestoreW(void* szcheckpointfilepath, void* szlogpath, void* rgrstmap, int32_t crstfilemap, void* szbackuplogpath, int32_t genlow, int32_t genhigh, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetFreeBuffer(void* pbbuf) {
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

int32_t windowssysWindowsWin32StorageJetJetGetAttachInfoA(void* szzdatabases, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA(uint64_t instance, void* szzdatabases, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW(uint64_t instance, void* szzdatabases, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetAttachInfoW(void* wszzdatabases, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetBookmark(uint64_t sesid, uint64_t tableid, void* pvbookmark, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetColumnInfoA(uint64_t sesid, uint32_t dbid, void* sztablename, void* pcolumnnameorid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetColumnInfoW(uint64_t sesid, uint32_t dbid, void* sztablename, void* pwcolumnnameorid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetCurrentIndexA(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t cbindexname) {
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

int32_t windowssysWindowsWin32StorageJetJetGetCurrentIndexW(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t cbindexname) {
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

int32_t windowssysWindowsWin32StorageJetJetGetCursorInfo(uint64_t sesid, uint64_t tableid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA(void* szdatabasename, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW(void* szdatabasename, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetDatabaseInfoA(uint64_t sesid, uint32_t dbid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetDatabaseInfoW(uint64_t sesid, uint32_t dbid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetErrorInfoW(void* pvcontext, void* pvresult, uint32_t cbmax, uint32_t infolevel, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetGetIndexInfoA(uint64_t sesid, uint32_t dbid, void* sztablename, void* szindexname, void* pvresult, uint32_t cbresult, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetIndexInfoW(uint64_t sesid, uint32_t dbid, void* sztablename, void* szindexname, void* pvresult, uint32_t cbresult, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetInstanceInfoA(void* pcinstanceinfo, void* painstanceinfo) {
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

int32_t windowssysWindowsWin32StorageJetJetGetInstanceInfoW(void* pcinstanceinfo, void* painstanceinfo) {
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

int32_t windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo(uint64_t instance, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetLS(uint64_t sesid, uint64_t tableid, void* pls, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetGetLock(uint64_t sesid, uint64_t tableid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetGetLogInfoA(void* szzlogs, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A(uint64_t instance, void* szzlogs, uint32_t cbmax, void* pcbactual, void* ploginfo) {
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

int32_t windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W(uint64_t instance, void* wszzlogs, uint32_t cbmax, void* pcbactual, void* ploginfo) {
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

int32_t windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA(uint64_t instance, void* szzlogs, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW(uint64_t instance, void* wszzlogs, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetLogInfoW(void* szzlogs, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetObjectInfoA(uint64_t sesid, uint32_t dbid, uint32_t objtyp, void* szcontainername, void* szobjectname, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetObjectInfoW(uint64_t sesid, uint32_t dbid, uint32_t objtyp, void* szcontainername, void* szobjectname, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetRecordPosition(uint64_t sesid, uint64_t tableid, void* precpos, uint32_t cbrecpos) {
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

int32_t windowssysWindowsWin32StorageJetJetGetRecordSize(uint64_t sesid, uint64_t tableid, void* precsize, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetGetRecordSize2(uint64_t sesid, uint64_t tableid, void* precsize, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark(uint64_t sesid, uint64_t tableid, void* pvsecondarykey, uint32_t cbsecondarykeymax, void* pcbsecondarykeyactual, void* pvprimarybookmark, uint32_t cbprimarybookmarkmax, void* pcbprimarybookmarkactual, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetGetSessionParameter(uint64_t sesid, uint32_t sesparamid, void* pvparam, uint32_t cbparammax, void* pcbparamactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetSystemParameterA(uint64_t instance, uint64_t sesid, uint32_t paramid, void* plparam, void* szparam, uint32_t cbmax) {
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

int32_t windowssysWindowsWin32StorageJetJetGetSystemParameterW(uint64_t instance, uint64_t sesid, uint32_t paramid, void* plparam, void* szparam, uint32_t cbmax) {
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

int32_t windowssysWindowsWin32StorageJetJetGetTableColumnInfoA(uint64_t sesid, uint64_t tableid, void* szcolumnname, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetTableColumnInfoW(uint64_t sesid, uint64_t tableid, void* szcolumnname, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetTableIndexInfoA(uint64_t sesid, uint64_t tableid, void* szindexname, void* pvresult, uint32_t cbresult, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetTableIndexInfoW(uint64_t sesid, uint64_t tableid, void* szindexname, void* pvresult, uint32_t cbresult, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetTableInfoA(uint64_t sesid, uint64_t tableid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetTableInfoW(uint64_t sesid, uint64_t tableid, void* pvresult, uint32_t cbmax, uint32_t infolevel) {
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

int32_t windowssysWindowsWin32StorageJetJetGetThreadStats(void* pvresult, uint32_t cbmax) {
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

int32_t windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA(uint64_t instance, void* szzlogs, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW(uint64_t instance, void* wszzlogs, uint32_t cbmax, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetGetVersion(uint64_t sesid, void* pwversion) {
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

int32_t windowssysWindowsWin32StorageJetJetGotoBookmark(uint64_t sesid, uint64_t tableid, void* pvbookmark, uint32_t cbbookmark) {
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

int32_t windowssysWindowsWin32StorageJetJetGotoPosition(uint64_t sesid, uint64_t tableid, void* precpos) {
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

int32_t windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark(uint64_t sesid, uint64_t tableid, void* pvsecondarykey, uint32_t cbsecondarykey, void* pvprimarybookmark, uint32_t cbprimarybookmark, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetGrowDatabase(uint64_t sesid, uint32_t dbid, uint32_t cpg, void* pcpgreal) {
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

int32_t windowssysWindowsWin32StorageJetJetIdle(uint64_t sesid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetIndexRecordCount(uint64_t sesid, uint64_t tableid, void* pcrec, uint32_t crecmax) {
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

int32_t windowssysWindowsWin32StorageJetJetInit(void* pinstance) {
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

int32_t windowssysWindowsWin32StorageJetJetInit2(void* pinstance, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetInit3A(void* pinstance, void* prstinfo, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetInit3W(void* pinstance, void* prstinfo, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetIntersectIndexes(uint64_t sesid, void* rgindexrange, uint32_t cindexrange, void* precordlist, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetMakeKey(uint64_t sesid, uint64_t tableid, void* pvdata, uint32_t cbdata, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetMove(uint64_t sesid, uint64_t tableid, int32_t crow, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotAbort(uint64_t snapid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotEnd(uint64_t snapid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA(uint64_t snapid, void* pcinstanceinfo, void* painstanceinfo, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW(uint64_t snapid, void* pcinstanceinfo, void* painstanceinfo, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA(uint64_t snapid, void* pcinstanceinfo, void* painstanceinfo, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW(uint64_t snapid, void* pcinstanceinfo, void* painstanceinfo, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotPrepare(void* psnapid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(uint64_t snapid, uint64_t instance, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotThaw(uint64_t snapid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(uint64_t snapid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(uint64_t snapid, uint64_t instance, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenDatabaseA(uint64_t sesid, void* szfilename, void* szconnect, void* pdbid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenDatabaseW(uint64_t sesid, void* szfilename, void* szconnect, void* pdbid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenFileA(void* szfilename, void* phffile, void* pulfilesizelow, void* pulfilesizehigh) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenFileInstanceA(uint64_t instance, void* szfilename, void* phffile, void* pulfilesizelow, void* pulfilesizehigh) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenFileInstanceW(uint64_t instance, void* szfilename, void* phffile, void* pulfilesizelow, void* pulfilesizehigh) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenFileW(void* szfilename, void* phffile, void* pulfilesizelow, void* pulfilesizehigh) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenTableA(uint64_t sesid, uint32_t dbid, void* sztablename, void* pvparameters, uint32_t cbparameters, uint32_t grbit, void* ptableid) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenTableW(uint64_t sesid, uint32_t dbid, void* sztablename, void* pvparameters, uint32_t cbparameters, uint32_t grbit, void* ptableid) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenTempTable(uint64_t sesid, void* prgcolumndef, uint32_t ccolumn, uint32_t grbit, void* ptableid, void* prgcolumnid) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenTempTable2(uint64_t sesid, void* prgcolumndef, uint32_t ccolumn, uint32_t lcid, uint32_t grbit, void* ptableid, void* prgcolumnid) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenTempTable3(uint64_t sesid, void* prgcolumndef, uint32_t ccolumn, void* pidxunicode, uint32_t grbit, void* ptableid, void* prgcolumnid) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenTemporaryTable(uint64_t sesid, void* popentemporarytable) {
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

int32_t windowssysWindowsWin32StorageJetJetOpenTemporaryTable2(uint64_t sesid, void* popentemporarytable) {
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

int32_t windowssysWindowsWin32StorageJetJetPrepareUpdate(uint64_t sesid, uint64_t tableid, uint32_t prep) {
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

int32_t windowssysWindowsWin32StorageJetJetPrereadIndexRanges(uint64_t sesid, uint64_t tableid, void* rgindexranges, uint32_t cindexranges, void* pcrangespreread, void* rgcolumnidpreread, uint32_t ccolumnidpreread, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetPrereadKeys(uint64_t sesid, uint64_t tableid, void* rgpvkeys, void* rgcbkeys, int32_t ckeys, void* pckeyspreread, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetReadFile(uint64_t hffile, void* pv, uint32_t cb, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetReadFileInstance(uint64_t instance, uint64_t hffile, void* pv, uint32_t cb, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetRegisterCallback(uint64_t sesid, uint64_t tableid, uint32_t cbtyp, void* pcallback, void* pvcontext, void* phcallbackid) {
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

int32_t windowssysWindowsWin32StorageJetJetRenameColumnA(uint64_t sesid, uint64_t tableid, void* szname, void* sznamenew, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetRenameColumnW(uint64_t sesid, uint64_t tableid, void* szname, void* sznamenew, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetRenameTableA(uint64_t sesid, uint32_t dbid, void* szname, void* sznamenew) {
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

int32_t windowssysWindowsWin32StorageJetJetRenameTableW(uint64_t sesid, uint32_t dbid, void* szname, void* sznamenew) {
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

int32_t windowssysWindowsWin32StorageJetJetResetSessionContext(uint64_t sesid) {
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

int32_t windowssysWindowsWin32StorageJetJetResetTableSequential(uint64_t sesid, uint64_t tableid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetResizeDatabase(uint64_t sesid, uint32_t dbid, uint32_t cpgtarget, void* pcpgactual, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetRestore2A(void* sz, void* szdest, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetRestore2W(void* sz, void* szdest, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetRestoreA(void* szsource, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetRestoreInstanceA(uint64_t instance, void* sz, void* szdest, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetRestoreInstanceW(uint64_t instance, void* sz, void* szdest, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetRestoreW(void* szsource, void* pfn) {
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

int32_t windowssysWindowsWin32StorageJetJetRetrieveColumn(uint64_t sesid, uint64_t tableid, uint32_t columnid, void* pvdata, uint32_t cbdata, void* pcbactual, uint32_t grbit, void* pretinfo) {
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

int32_t windowssysWindowsWin32StorageJetJetRetrieveColumns(uint64_t sesid, uint64_t tableid, void* pretrievecolumn, uint32_t cretrievecolumn) {
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

int32_t windowssysWindowsWin32StorageJetJetRetrieveKey(uint64_t sesid, uint64_t tableid, void* pvkey, uint32_t cbmax, void* pcbactual, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetRollback(uint64_t sesid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetSeek(uint64_t sesid, uint64_t tableid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetSetColumn(uint64_t sesid, uint64_t tableid, uint32_t columnid, void* pvdata, uint32_t cbdata, uint32_t grbit, void* psetinfo) {
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

int32_t windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA(uint64_t sesid, uint32_t dbid, void* sztablename, void* szcolumnname, void* pvdata, uint32_t cbdata, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW(uint64_t sesid, uint32_t dbid, void* sztablename, void* szcolumnname, void* pvdata, uint32_t cbdata, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetSetColumns(uint64_t sesid, uint64_t tableid, void* psetcolumn, uint32_t csetcolumn) {
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

int32_t windowssysWindowsWin32StorageJetJetSetCurrentIndex2A(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetSetCurrentIndex2W(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetSetCurrentIndex3A(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit, uint32_t itagsequence) {
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

int32_t windowssysWindowsWin32StorageJetJetSetCurrentIndex3W(uint64_t sesid, uint64_t tableid, void* szindexname, uint32_t grbit, uint32_t itagsequence) {
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

int32_t windowssysWindowsWin32StorageJetJetSetCurrentIndex4A(uint64_t sesid, uint64_t tableid, void* szindexname, void* pindexid, uint32_t grbit, uint32_t itagsequence) {
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

int32_t windowssysWindowsWin32StorageJetJetSetCurrentIndex4W(uint64_t sesid, uint64_t tableid, void* szindexname, void* pindexid, uint32_t grbit, uint32_t itagsequence) {
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

int32_t windowssysWindowsWin32StorageJetJetSetCurrentIndexA(uint64_t sesid, uint64_t tableid, void* szindexname) {
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

int32_t windowssysWindowsWin32StorageJetJetSetCurrentIndexW(uint64_t sesid, uint64_t tableid, void* szindexname) {
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

int32_t windowssysWindowsWin32StorageJetJetSetCursorFilter(uint64_t sesid, uint64_t tableid, void* rgcolumnfilters, uint32_t ccolumnfilters, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetSetDatabaseSizeA(uint64_t sesid, void* szdatabasename, uint32_t cpg, void* pcpgreal) {
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

int32_t windowssysWindowsWin32StorageJetJetSetDatabaseSizeW(uint64_t sesid, void* szdatabasename, uint32_t cpg, void* pcpgreal) {
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

int32_t windowssysWindowsWin32StorageJetJetSetIndexRange(uint64_t sesid, uint64_t tableidsrc, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetSetLS(uint64_t sesid, uint64_t tableid, uint64_t ls, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetSetSessionContext(uint64_t sesid, uint64_t ulcontext) {
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

int32_t windowssysWindowsWin32StorageJetJetSetSessionParameter(uint64_t sesid, uint32_t sesparamid, void* pvparam, uint32_t cbparam) {
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

int32_t windowssysWindowsWin32StorageJetJetSetSystemParameterA(void* pinstance, uint64_t sesid, uint32_t paramid, uint64_t lparam, void* szparam) {
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

int32_t windowssysWindowsWin32StorageJetJetSetSystemParameterW(void* pinstance, uint64_t sesid, uint32_t paramid, uint64_t lparam, void* szparam) {
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

int32_t windowssysWindowsWin32StorageJetJetSetTableSequential(uint64_t sesid, uint64_t tableid, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetStopBackup(void) {
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

int32_t windowssysWindowsWin32StorageJetJetStopBackupInstance(uint64_t instance) {
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

int32_t windowssysWindowsWin32StorageJetJetStopService(void) {
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

int32_t windowssysWindowsWin32StorageJetJetStopServiceInstance(uint64_t instance) {
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

int32_t windowssysWindowsWin32StorageJetJetStopServiceInstance2(uint64_t instance, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetTerm(uint64_t instance) {
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

int32_t windowssysWindowsWin32StorageJetJetTerm2(uint64_t instance, uint32_t grbit) {
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

int32_t windowssysWindowsWin32StorageJetJetTruncateLog(void) {
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

int32_t windowssysWindowsWin32StorageJetJetTruncateLogInstance(uint64_t instance) {
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

int32_t windowssysWindowsWin32StorageJetJetUnregisterCallback(uint64_t sesid, uint64_t tableid, uint32_t cbtyp, uint64_t hcallbackid) {
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

int32_t windowssysWindowsWin32StorageJetJetUpdate(uint64_t sesid, uint64_t tableid, void* pvbookmark, uint32_t cbbookmark, void* pcbactual) {
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

int32_t windowssysWindowsWin32StorageJetJetUpdate2(uint64_t sesid, uint64_t tableid, void* pvbookmark, uint32_t cbbookmark, void* pcbactual, uint32_t grbit) {
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

