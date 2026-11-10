#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_filesystem_wrapper.h"
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

int32_t windowssys_windows_win32_storage_filesystem_addLogContainer(void* hlog, void* pcbcontainer, void* pwszcontainerpath, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddLogContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pcbcontainer, pwszcontainerpath, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)pcbcontainer;
    (void)pwszcontainerpath;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_addLogContainerSet(void* hlog, uint16_t ccontainer, void* pcbcontainer, void* rgwszcontainerpath, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddLogContainerSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, ccontainer, pcbcontainer, rgwszcontainerpath, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)ccontainer;
    (void)pcbcontainer;
    (void)rgwszcontainerpath;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_addUsersToEncryptedFile(void* lpfilename, void* pencryptioncertificates) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddUsersToEncryptedFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, pencryptioncertificates);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)pencryptioncertificates;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_advanceLogBase(void* pvmarshal, void* plsnbase, uint32_t fflags, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdvanceLogBase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, plsnbase, fflags, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)plsnbase;
    (void)fflags;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_alignReservedLog(void* pvmarshal, uint32_t creservedrecords, void* rgcbreservation, void* pcbalignreservation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AlignReservedLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, creservedrecords, rgcbreservation, pcbalignreservation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)creservedrecords;
    (void)rgcbreservation;
    (void)pcbalignreservation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_allocReservedLog(void* pvmarshal, uint32_t creservedrecords, void* pcbadjustment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocReservedLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, creservedrecords, pcbadjustment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)creservedrecords;
    (void)pcbadjustment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_areFileApisANSI(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreFileApisANSI");
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

int32_t windowssys_windows_win32_storage_filesystem_areShortNamesEnabled(void* handle, void* enabled) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreShortNamesEnabled");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handle, enabled);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handle;
    (void)enabled;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_backupRead(void* hfile, void* lpbuffer, uint32_t nnumberofbytestoread, void* lpnumberofbytesread, int32_t babort, int32_t bprocesssecurity, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, nnumberofbytestoread, lpnumberofbytesread, babort, bprocesssecurity, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)lpnumberofbytesread;
    (void)babort;
    (void)bprocesssecurity;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_backupSeek(void* hfile, uint32_t dwlowbytestoseek, uint32_t dwhighbytestoseek, void* lpdwlowbyteseeked, void* lpdwhighbyteseeked, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupSeek");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, dwlowbytestoseek, dwhighbytestoseek, lpdwlowbyteseeked, lpdwhighbyteseeked, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)dwlowbytestoseek;
    (void)dwhighbytestoseek;
    (void)lpdwlowbyteseeked;
    (void)lpdwhighbyteseeked;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_backupWrite(void* hfile, void* lpbuffer, uint32_t nnumberofbytestowrite, void* lpnumberofbyteswritten, int32_t babort, int32_t bprocesssecurity, void* lpcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupWrite");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, nnumberofbytestowrite, lpnumberofbyteswritten, babort, bprocesssecurity, lpcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestowrite;
    (void)lpnumberofbyteswritten;
    (void)babort;
    (void)bprocesssecurity;
    (void)lpcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_buildIoRingRegisterBuffers(void* ioring, uint32_t count, void* buffers, uint64_t userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildIoRingRegisterBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioring, count, buffers, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ioring;
    (void)count;
    (void)buffers;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_buildIoRingRegisterFileHandles(void* ioring, uint32_t count, void* handles, uint64_t userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildIoRingRegisterFileHandles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioring, count, handles, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ioring;
    (void)count;
    (void)handles;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3A(void* lpname, void* lpoemname, uint32_t oemnamesize, void* pbnamecontainsspaces, void* pbnamelegal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckNameLegalDOS8Dot3A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpoemname, oemnamesize, pbnamecontainsspaces, pbnamelegal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpname;
    (void)lpoemname;
    (void)oemnamesize;
    (void)pbnamecontainsspaces;
    (void)pbnamelegal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3W(void* lpname, void* lpoemname, uint32_t oemnamesize, void* pbnamecontainsspaces, void* pbnamelegal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckNameLegalDOS8Dot3W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpname, lpoemname, oemnamesize, pbnamecontainsspaces, pbnamelegal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpname;
    (void)lpoemname;
    (void)oemnamesize;
    (void)pbnamecontainsspaces;
    (void)pbnamelegal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_closeAndResetLogFile(void* hlog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseAndResetLogFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_filesystem_closeEncryptedFileRaw(void* pvcontext) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseEncryptedFileRaw");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pvcontext);
        return;
    }
    errno = ENOSYS;
#else
    (void)pvcontext;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_closeIoRing(void* ioring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseIoRing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ioring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_commitComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommitComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_commitEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommitEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_commitTransaction(void* transactionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommitTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_commitTransactionAsync(void* transactionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommitTransactionAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_compareFileTime(void* lpfiletime1, void* lpfiletime2) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiletime1, lpfiletime2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiletime1;
    (void)lpfiletime2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_copyFile2(void* pwszexistingfilename, void* pwsznewfilename, void* pextendedparameters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFile2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszexistingfilename, pwsznewfilename, pextendedparameters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszexistingfilename;
    (void)pwsznewfilename;
    (void)pextendedparameters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_copyFileA(void* lpexistingfilename, void* lpnewfilename, int32_t bfailifexists) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, bfailifexists);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)bfailifexists;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_copyFileExA(void* lpexistingfilename, void* lpnewfilename, void* lpprogressroutine, void* lpdata, void* pbcancel, uint32_t dwcopyflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, lpprogressroutine, lpdata, pbcancel, dwcopyflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)pbcancel;
    (void)dwcopyflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_copyFileExW(void* lpexistingfilename, void* lpnewfilename, void* lpprogressroutine, void* lpdata, void* pbcancel, uint32_t dwcopyflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, lpprogressroutine, lpdata, pbcancel, dwcopyflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)pbcancel;
    (void)dwcopyflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_copyFileFromAppW(void* lpexistingfilename, void* lpnewfilename, int32_t bfailifexists) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, bfailifexists);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)bfailifexists;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_copyFileTransactedA(void* lpexistingfilename, void* lpnewfilename, void* lpprogressroutine, void* lpdata, void* pbcancel, uint32_t dwcopyflags, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, lpprogressroutine, lpdata, pbcancel, dwcopyflags, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)pbcancel;
    (void)dwcopyflags;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_copyFileTransactedW(void* lpexistingfilename, void* lpnewfilename, void* lpprogressroutine, void* lpdata, void* pbcancel, uint32_t dwcopyflags, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, lpprogressroutine, lpdata, pbcancel, dwcopyflags, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)pbcancel;
    (void)dwcopyflags;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_copyFileW(void* lpexistingfilename, void* lpnewfilename, int32_t bfailifexists) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, bfailifexists);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)bfailifexists;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_copyLZFile(int32_t hfsource, int32_t hfdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyLZFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfsource, hfdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfsource;
    (void)hfdest;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createDirectoryA(void* lppathname, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, lpsecurityattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createDirectoryExA(void* lptemplatedirectory, void* lpnewdirectory, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptemplatedirectory, lpnewdirectory, lpsecurityattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptemplatedirectory;
    (void)lpnewdirectory;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createDirectoryExW(void* lptemplatedirectory, void* lpnewdirectory, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptemplatedirectory, lpnewdirectory, lpsecurityattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptemplatedirectory;
    (void)lpnewdirectory;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createDirectoryFromAppW(void* lppathname, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, lpsecurityattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createDirectoryTransactedA(void* lptemplatedirectory, void* lpnewdirectory, void* lpsecurityattributes, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptemplatedirectory, lpnewdirectory, lpsecurityattributes, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptemplatedirectory;
    (void)lpnewdirectory;
    (void)lpsecurityattributes;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createDirectoryTransactedW(void* lptemplatedirectory, void* lpnewdirectory, void* lpsecurityattributes, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptemplatedirectory, lpnewdirectory, lpsecurityattributes, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptemplatedirectory;
    (void)lpnewdirectory;
    (void)lpsecurityattributes;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createDirectoryW(void* lppathname, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, lpsecurityattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createEnlistment(void* lpenlistmentattributes, void* resourcemanagerhandle, void* transactionhandle, uint32_t notificationmask, uint32_t createoptions, void* enlistmentkey) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpenlistmentattributes, resourcemanagerhandle, transactionhandle, notificationmask, createoptions, enlistmentkey);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpenlistmentattributes;
    (void)resourcemanagerhandle;
    (void)transactionhandle;
    (void)notificationmask;
    (void)createoptions;
    (void)enlistmentkey;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createFile2(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationdisposition, void* pcreateexparams) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFile2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwdesiredaccess, dwsharemode, dwcreationdisposition, pcreateexparams);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationdisposition;
    (void)pcreateexparams;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createFile2FromAppW(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwcreationdisposition, void* pcreateexparams) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFile2FromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwdesiredaccess, dwsharemode, dwcreationdisposition, pcreateexparams);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationdisposition;
    (void)pcreateexparams;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createFileA(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwcreationdisposition, uint32_t dwflagsandattributes, void* htemplatefile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwdesiredaccess, dwsharemode, lpsecurityattributes, dwcreationdisposition, dwflagsandattributes, htemplatefile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createFileFromAppW(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwcreationdisposition, uint32_t dwflagsandattributes, void* htemplatefile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwdesiredaccess, dwsharemode, lpsecurityattributes, dwcreationdisposition, dwflagsandattributes, htemplatefile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createFileTransactedA(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwcreationdisposition, uint32_t dwflagsandattributes, void* htemplatefile, void* htransaction, void* pusminiversion, void* lpextendedparameter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwdesiredaccess, dwsharemode, lpsecurityattributes, dwcreationdisposition, dwflagsandattributes, htemplatefile, htransaction, pusminiversion, lpextendedparameter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    (void)htransaction;
    (void)pusminiversion;
    (void)lpextendedparameter;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createFileTransactedW(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwcreationdisposition, uint32_t dwflagsandattributes, void* htemplatefile, void* htransaction, void* pusminiversion, void* lpextendedparameter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwdesiredaccess, dwsharemode, lpsecurityattributes, dwcreationdisposition, dwflagsandattributes, htemplatefile, htransaction, pusminiversion, lpextendedparameter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    (void)htransaction;
    (void)pusminiversion;
    (void)lpextendedparameter;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createFileW(void* lpfilename, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwcreationdisposition, uint32_t dwflagsandattributes, void* htemplatefile) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwdesiredaccess, dwsharemode, lpsecurityattributes, dwcreationdisposition, dwflagsandattributes, htemplatefile);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createHardLinkA(void* lpfilename, void* lpexistingfilename, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHardLinkA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpexistingfilename, lpsecurityattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)lpexistingfilename;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createHardLinkTransactedA(void* lpfilename, void* lpexistingfilename, void* lpsecurityattributes, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHardLinkTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpexistingfilename, lpsecurityattributes, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)lpexistingfilename;
    (void)lpsecurityattributes;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createHardLinkTransactedW(void* lpfilename, void* lpexistingfilename, void* lpsecurityattributes, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHardLinkTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpexistingfilename, lpsecurityattributes, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)lpexistingfilename;
    (void)lpsecurityattributes;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createHardLinkW(void* lpfilename, void* lpexistingfilename, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHardLinkW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpexistingfilename, lpsecurityattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)lpexistingfilename;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createLogContainerScanContext(void* hlog, uint32_t cfromcontainer, uint32_t ccontainers, uint8_t escanmode, void* pcxscan, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateLogContainerScanContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, cfromcontainer, ccontainers, escanmode, pcxscan, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)cfromcontainer;
    (void)ccontainers;
    (void)escanmode;
    (void)pcxscan;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createLogFile(void* pszlogfilename, uint32_t fdesiredaccess, uint32_t dwsharemode, void* psalogfile, uint32_t fcreatedisposition, uint32_t fflagsandattributes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateLogFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlogfilename, fdesiredaccess, dwsharemode, psalogfile, fcreatedisposition, fflagsandattributes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszlogfilename;
    (void)fdesiredaccess;
    (void)dwsharemode;
    (void)psalogfile;
    (void)fcreatedisposition;
    (void)fflagsandattributes;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_createLogMarshallingArea(void* hlog, void* pfnallocbuffer, void* pfnfreebuffer, void* pvblockalloccontext, uint32_t cbmarshallingbuffer, uint32_t cmaxwritebuffers, uint32_t cmaxreadbuffers, void* ppvmarshal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateLogMarshallingArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pfnallocbuffer, pfnfreebuffer, pvblockalloccontext, cbmarshallingbuffer, cmaxwritebuffers, cmaxreadbuffers, ppvmarshal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)pfnallocbuffer;
    (void)pfnfreebuffer;
    (void)pvblockalloccontext;
    (void)cbmarshallingbuffer;
    (void)cmaxwritebuffers;
    (void)cmaxreadbuffers;
    (void)ppvmarshal;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createResourceManager(void* lpresourcemanagerattributes, void* resourcemanagerid, uint32_t createoptions, void* tmhandle, void* description) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpresourcemanagerattributes, resourcemanagerid, createoptions, tmhandle, description);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpresourcemanagerattributes;
    (void)resourcemanagerid;
    (void)createoptions;
    (void)tmhandle;
    (void)description;
    errno = ENOSYS;
    return NULL;
#endif
}

bool windowssys_windows_win32_storage_filesystem_createSymbolicLinkA(void* lpsymlinkfilename, void* lptargetfilename, uint32_t dwflags) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSymbolicLinkA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsymlinkfilename, lptargetfilename, dwflags);
    }
    errno = ENOSYS;
    return false;
#else
    (void)lpsymlinkfilename;
    (void)lptargetfilename;
    (void)dwflags;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedA(void* lpsymlinkfilename, void* lptargetfilename, uint32_t dwflags, void* htransaction) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSymbolicLinkTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsymlinkfilename, lptargetfilename, dwflags, htransaction);
    }
    errno = ENOSYS;
    return false;
#else
    (void)lpsymlinkfilename;
    (void)lptargetfilename;
    (void)dwflags;
    (void)htransaction;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedW(void* lpsymlinkfilename, void* lptargetfilename, uint32_t dwflags, void* htransaction) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSymbolicLinkTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsymlinkfilename, lptargetfilename, dwflags, htransaction);
    }
    errno = ENOSYS;
    return false;
#else
    (void)lpsymlinkfilename;
    (void)lptargetfilename;
    (void)dwflags;
    (void)htransaction;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_storage_filesystem_createSymbolicLinkW(void* lpsymlinkfilename, void* lptargetfilename, uint32_t dwflags) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSymbolicLinkW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsymlinkfilename, lptargetfilename, dwflags);
    }
    errno = ENOSYS;
    return false;
#else
    (void)lpsymlinkfilename;
    (void)lptargetfilename;
    (void)dwflags;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_createTapePartition(void* hdevice, uint32_t dwpartitionmethod, uint32_t dwcount, uint32_t dwsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTapePartition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, dwpartitionmethod, dwcount, dwsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)dwpartitionmethod;
    (void)dwcount;
    (void)dwsize;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createTransaction(void* lptransactionattributes, void* uow, uint32_t createoptions, uint32_t isolationlevel, uint32_t isolationflags, uint32_t timeout, void* description) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptransactionattributes, uow, createoptions, isolationlevel, isolationflags, timeout, description);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lptransactionattributes;
    (void)uow;
    (void)createoptions;
    (void)isolationlevel;
    (void)isolationflags;
    (void)timeout;
    (void)description;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_createTransactionManager(void* lptransactionattributes, void* logfilename, uint32_t createoptions, uint32_t commitstrength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptransactionattributes, logfilename, createoptions, commitstrength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lptransactionattributes;
    (void)logfilename;
    (void)createoptions;
    (void)commitstrength;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_decryptFileA(void* lpfilename, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecryptFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_decryptFileW(void* lpfilename, uint32_t dwreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecryptFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)dwreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_defineDosDeviceA(uint32_t dwflags, void* lpdevicename, void* lptargetpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefineDosDeviceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpdevicename, lptargetpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpdevicename;
    (void)lptargetpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_defineDosDeviceW(uint32_t dwflags, void* lpdevicename, void* lptargetpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefineDosDeviceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpdevicename, lptargetpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpdevicename;
    (void)lptargetpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteFileA(void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteFileFromAppW(void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteFileTransactedA(void* lpfilename, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteFileTransactedW(void* lpfilename, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteFileW(void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteLogByHandle(void* hlog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteLogByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteLogFile(void* pszlogfilename, void* pvreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteLogFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlogfilename, pvreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlogfilename;
    (void)pvreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteLogMarshallingArea(void* pvmarshal) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteLogMarshallingArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointA(void* lpszvolumemountpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteVolumeMountPointA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumemountpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszvolumemountpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointW(void* lpszvolumemountpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteVolumeMountPointW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumemountpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszvolumemountpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_deregisterManageableLogClient(void* hlog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeregisterManageableLogClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_duplicateEncryptionInfoFile(void* srcfilename, void* dstfilename, uint32_t dwcreationdistribution, uint32_t dwattributes, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateEncryptionInfoFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(srcfilename, dstfilename, dwcreationdistribution, dwattributes, lpsecurityattributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)srcfilename;
    (void)dstfilename;
    (void)dwcreationdistribution;
    (void)dwattributes;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_encryptFileA(void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncryptFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_encryptFileW(void* lpfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncryptFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_encryptionDisable(void* dirpath, int32_t disable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncryptionDisable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dirpath, disable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dirpath;
    (void)disable;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_eraseTape(void* hdevice, uint32_t dwerasetype, int32_t bimmediate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EraseTape");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, dwerasetype, bimmediate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)dwerasetype;
    (void)bimmediate;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_fileEncryptionStatusA(void* lpfilename, void* lpstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileEncryptionStatusA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)lpstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_fileEncryptionStatusW(void* lpfilename, void* lpstatus) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileEncryptionStatusW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)lpstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_fileTimeToLocalFileTime(void* lpfiletime, void* lplocalfiletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileTimeToLocalFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfiletime, lplocalfiletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfiletime;
    (void)lplocalfiletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findClose(void* hfindfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findCloseChangeNotification(void* hchangehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindCloseChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchangehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchangehandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationA(void* lppathname, int32_t bwatchsubtree, uint32_t dwnotifyfilter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstChangeNotificationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, bwatchsubtree, dwnotifyfilter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lppathname;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationW(void* lppathname, int32_t bwatchsubtree, uint32_t dwnotifyfilter) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstChangeNotificationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, bwatchsubtree, dwnotifyfilter);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lppathname;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstFileA(void* lpfilename, void* lpfindfiledata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpfindfiledata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)lpfindfiledata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstFileExA(void* lpfilename, int32_t finfolevelid, void* lpfindfiledata, int32_t fsearchop, void* lpsearchfilter, uint32_t dwadditionalflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstFileExFromAppW(void* lpfilename, int32_t finfolevelid, void* lpfindfiledata, int32_t fsearchop, void* lpsearchfilter, uint32_t dwadditionalflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileExFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstFileExW(void* lpfilename, int32_t finfolevelid, void* lpfindfiledata, int32_t fsearchop, void* lpsearchfilter, uint32_t dwadditionalflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstFileNameTransactedW(void* lpfilename, uint32_t dwflags, void* stringlength, void* linkname, void* htransaction) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileNameTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwflags, stringlength, linkname, htransaction);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwflags;
    (void)stringlength;
    (void)linkname;
    (void)htransaction;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstFileNameW(void* lpfilename, uint32_t dwflags, void* stringlength, void* linkname) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwflags, stringlength, linkname);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)dwflags;
    (void)stringlength;
    (void)linkname;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstFileTransactedA(void* lpfilename, int32_t finfolevelid, void* lpfindfiledata, int32_t fsearchop, void* lpsearchfilter, uint32_t dwadditionalflags, void* htransaction) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags, htransaction);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    (void)htransaction;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstFileTransactedW(void* lpfilename, int32_t finfolevelid, void* lpfindfiledata, int32_t fsearchop, void* lpsearchfilter, uint32_t dwadditionalflags, void* htransaction) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags, htransaction);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    (void)htransaction;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstFileW(void* lpfilename, void* lpfindfiledata) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpfindfiledata);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)lpfindfiledata;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstStreamTransactedW(void* lpfilename, int32_t infolevel, void* lpfindstreamdata, uint32_t dwflags, void* htransaction) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstStreamTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, infolevel, lpfindstreamdata, dwflags, htransaction);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)infolevel;
    (void)lpfindstreamdata;
    (void)dwflags;
    (void)htransaction;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstStreamW(void* lpfilename, int32_t infolevel, void* lpfindstreamdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, infolevel, lpfindstreamdata, dwflags);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpfilename;
    (void)infolevel;
    (void)lpfindstreamdata;
    (void)dwflags;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstVolumeA(void* lpszvolumename, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstVolumeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumename, cchbufferlength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszvolumename;
    (void)cchbufferlength;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointA(void* lpszrootpathname, void* lpszvolumemountpoint, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstVolumeMountPointA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszrootpathname, lpszvolumemountpoint, cchbufferlength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszrootpathname;
    (void)lpszvolumemountpoint;
    (void)cchbufferlength;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointW(void* lpszrootpathname, void* lpszvolumemountpoint, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstVolumeMountPointW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszrootpathname, lpszvolumemountpoint, cchbufferlength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszrootpathname;
    (void)lpszvolumemountpoint;
    (void)cchbufferlength;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_findFirstVolumeW(void* lpszvolumename, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstVolumeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumename, cchbufferlength);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lpszvolumename;
    (void)cchbufferlength;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findNextChangeNotification(void* hchangehandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextChangeNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchangehandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchangehandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findNextFileA(void* hfindfile, void* lpfindfiledata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindfile, lpfindfiledata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindfile;
    (void)lpfindfiledata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findNextFileNameW(void* hfindstream, void* stringlength, void* linkname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindstream, stringlength, linkname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindstream;
    (void)stringlength;
    (void)linkname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findNextFileW(void* hfindfile, void* lpfindfiledata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindfile, lpfindfiledata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindfile;
    (void)lpfindfiledata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findNextStreamW(void* hfindstream, void* lpfindstreamdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextStreamW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindstream, lpfindstreamdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindstream;
    (void)lpfindstreamdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findNextVolumeA(void* hfindvolume, void* lpszvolumename, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextVolumeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindvolume, lpszvolumename, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindvolume;
    (void)lpszvolumename;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointA(void* hfindvolumemountpoint, void* lpszvolumemountpoint, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextVolumeMountPointA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindvolumemountpoint, lpszvolumemountpoint, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindvolumemountpoint;
    (void)lpszvolumemountpoint;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointW(void* hfindvolumemountpoint, void* lpszvolumemountpoint, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextVolumeMountPointW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindvolumemountpoint, lpszvolumemountpoint, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindvolumemountpoint;
    (void)lpszvolumemountpoint;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findNextVolumeW(void* hfindvolume, void* lpszvolumename, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextVolumeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindvolume, lpszvolumename, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindvolume;
    (void)lpszvolumename;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findVolumeClose(void* hfindvolume) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindVolumeClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindvolume);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindvolume;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_findVolumeMountPointClose(void* hfindvolumemountpoint) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindVolumeMountPointClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfindvolumemountpoint);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfindvolumemountpoint;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_flushFileBuffers(void* hfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushFileBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_flushLogBuffers(void* pvmarshal, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushLogBuffers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_flushLogToLsn(void* pvmarshalcontext, void* plsnflush, void* plsnlastflushed, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushLogToLsn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshalcontext, plsnflush, plsnlastflushed, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshalcontext;
    (void)plsnflush;
    (void)plsnlastflushed;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_filesystem_freeEncryptedFileMetadata(void* pbmetadata) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeEncryptedFileMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pbmetadata);
        return;
    }
    errno = ENOSYS;
#else
    (void)pbmetadata;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_storage_filesystem_freeEncryptionCertificateHashList(void* pusers) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeEncryptionCertificateHashList");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pusers);
        return;
    }
    errno = ENOSYS;
#else
    (void)pusers;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_freeReservedLog(void* pvmarshal, uint32_t creservedrecords, void* pcbadjustment) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeReservedLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, creservedrecords, pcbadjustment);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)creservedrecords;
    (void)pcbadjustment;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getBinaryTypeA(void* lpapplicationname, void* lpbinarytype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBinaryTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpapplicationname, lpbinarytype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpapplicationname;
    (void)lpbinarytype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getBinaryTypeW(void* lpapplicationname, void* lpbinarytype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBinaryTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpapplicationname, lpbinarytype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpapplicationname;
    (void)lpbinarytype;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getCompressedFileSizeA(void* lpfilename, void* lpfilesizehigh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCompressedFileSizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpfilesizehigh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)lpfilesizehigh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedA(void* lpfilename, void* lpfilesizehigh, void* htransaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCompressedFileSizeTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpfilesizehigh, htransaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)lpfilesizehigh;
    (void)htransaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedW(void* lpfilename, void* lpfilesizehigh, void* htransaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCompressedFileSizeTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpfilesizehigh, htransaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)lpfilesizehigh;
    (void)htransaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getCompressedFileSizeW(void* lpfilename, void* lpfilesizehigh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCompressedFileSizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpfilesizehigh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)lpfilesizehigh;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getCurrentClockTransactionManager(void* transactionmanagerhandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentClockTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceA(void* lprootpathname, void* lpsectorspercluster, void* lpbytespersector, void* lpnumberoffreeclusters, void* lptotalnumberofclusters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskFreeSpaceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprootpathname, lpsectorspercluster, lpbytespersector, lpnumberoffreeclusters, lptotalnumberofclusters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprootpathname;
    (void)lpsectorspercluster;
    (void)lpbytespersector;
    (void)lpnumberoffreeclusters;
    (void)lptotalnumberofclusters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExA(void* lpdirectoryname, void* lpfreebytesavailabletocaller, void* lptotalnumberofbytes, void* lptotalnumberoffreebytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskFreeSpaceExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdirectoryname, lpfreebytesavailabletocaller, lptotalnumberofbytes, lptotalnumberoffreebytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdirectoryname;
    (void)lpfreebytesavailabletocaller;
    (void)lptotalnumberofbytes;
    (void)lptotalnumberoffreebytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExW(void* lpdirectoryname, void* lpfreebytesavailabletocaller, void* lptotalnumberofbytes, void* lptotalnumberoffreebytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskFreeSpaceExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdirectoryname, lpfreebytesavailabletocaller, lptotalnumberofbytes, lptotalnumberoffreebytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpdirectoryname;
    (void)lpfreebytesavailabletocaller;
    (void)lptotalnumberofbytes;
    (void)lptotalnumberoffreebytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceW(void* lprootpathname, void* lpsectorspercluster, void* lpbytespersector, void* lpnumberoffreeclusters, void* lptotalnumberofclusters) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskFreeSpaceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprootpathname, lpsectorspercluster, lpbytespersector, lpnumberoffreeclusters, lptotalnumberofclusters);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprootpathname;
    (void)lpsectorspercluster;
    (void)lpbytespersector;
    (void)lpnumberoffreeclusters;
    (void)lptotalnumberofclusters;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationA(void* rootpath, void* diskspaceinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskSpaceInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpath, diskspaceinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rootpath;
    (void)diskspaceinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationW(void* rootpath, void* diskspaceinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskSpaceInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(rootpath, diskspaceinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)rootpath;
    (void)diskspaceinfo;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getDriveTypeA(void* lprootpathname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDriveTypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprootpathname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lprootpathname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getDriveTypeW(void* lprootpathname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDriveTypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprootpathname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lprootpathname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getEncryptedFileMetadata(void* lpfilename, void* pcbmetadata, void* ppbmetadata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEncryptedFileMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, pcbmetadata, ppbmetadata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)pcbmetadata;
    (void)ppbmetadata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getEnlistmentId(void* enlistmenthandle, void* enlistmentid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnlistmentId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, enlistmentid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getEnlistmentRecoveryInformation(void* enlistmenthandle, uint32_t buffersize, void* buffer, void* bufferused) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnlistmentRecoveryInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, buffersize, buffer, bufferused);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getExpandedNameA(void* lpszsource, void* lpszbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExpandedNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsource, lpszbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsource;
    (void)lpszbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getExpandedNameW(void* lpszsource, void* lpszbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExpandedNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszsource, lpszbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszsource;
    (void)lpszbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFileAttributesA(void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileAttributesExA(void* lpfilename, int32_t finfolevelid, void* lpfileinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfileinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileAttributesExFromAppW(void* lpfilename, int32_t finfolevelid, void* lpfileinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesExFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfileinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileAttributesExW(void* lpfilename, int32_t finfolevelid, void* lpfileinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfileinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedA(void* lpfilename, int32_t finfolevelid, void* lpfileinformation, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfileinformation, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedW(void* lpfilename, int32_t finfolevelid, void* lpfileinformation, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, finfolevelid, lpfileinformation, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFileAttributesW(void* lpfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileBandwidthReservation(void* hfile, void* lpperiodmilliseconds, void* lpbytesperperiod, void* pdiscardable, void* lptransfersize, void* lpnumoutstandingrequests) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileBandwidthReservation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpperiodmilliseconds, lpbytesperperiod, pdiscardable, lptransfersize, lpnumoutstandingrequests);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpperiodmilliseconds;
    (void)lpbytesperperiod;
    (void)pdiscardable;
    (void)lptransfersize;
    (void)lpnumoutstandingrequests;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileInformationByHandle(void* hfile, void* lpfileinformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileInformationByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpfileinformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpfileinformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileInformationByHandleEx(void* hfile, int32_t fileinformationclass, void* lpfileinformation, uint32_t dwbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileInformationByHandleEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, fileinformationclass, lpfileinformation, dwbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)fileinformationclass;
    (void)lpfileinformation;
    (void)dwbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFileSize(void* hfile, void* lpfilesizehigh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpfilesizehigh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    (void)lpfilesizehigh;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileSizeEx(void* hfile, void* lpfilesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSizeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpfilesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpfilesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileTime(void* hfile, void* lpcreationtime, void* lplastaccesstime, void* lplastwritetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpcreationtime, lplastaccesstime, lplastwritetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpcreationtime;
    (void)lplastaccesstime;
    (void)lplastwritetime;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFileType(void* hfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileVersionInfoA(void* lptstrfilename, uint32_t dwhandle, uint32_t dwlen, void* lpdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptstrfilename, dwhandle, dwlen, lpdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptstrfilename;
    (void)dwhandle;
    (void)dwlen;
    (void)lpdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileVersionInfoExA(uint32_t dwflags, void* lpwstrfilename, uint32_t dwhandle, uint32_t dwlen, void* lpdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpwstrfilename, dwhandle, dwlen, lpdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpwstrfilename;
    (void)dwhandle;
    (void)dwlen;
    (void)lpdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileVersionInfoExW(uint32_t dwflags, void* lpwstrfilename, uint32_t dwhandle, uint32_t dwlen, void* lpdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpwstrfilename, dwhandle, dwlen, lpdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    (void)lpwstrfilename;
    (void)dwhandle;
    (void)dwlen;
    (void)lpdata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeA(void* lptstrfilename, void* lpdwhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoSizeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptstrfilename, lpdwhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lptstrfilename;
    (void)lpdwhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExA(uint32_t dwflags, void* lpwstrfilename, void* lpdwhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoSizeExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpwstrfilename, lpdwhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwflags;
    (void)lpwstrfilename;
    (void)lpdwhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExW(uint32_t dwflags, void* lpwstrfilename, void* lpdwhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoSizeExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags, lpwstrfilename, lpdwhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwflags;
    (void)lpwstrfilename;
    (void)lpdwhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeW(void* lptstrfilename, void* lpdwhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoSizeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptstrfilename, lpdwhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lptstrfilename;
    (void)lpdwhandle;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getFileVersionInfoW(void* lptstrfilename, uint32_t dwhandle, uint32_t dwlen, void* lpdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lptstrfilename, dwhandle, dwlen, lpdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lptstrfilename;
    (void)dwhandle;
    (void)dwlen;
    (void)lpdata;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleA(void* hfile, void* lpszfilepath, uint32_t cchfilepath, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFinalPathNameByHandleA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpszfilepath, cchfilepath, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    (void)lpszfilepath;
    (void)cchfilepath;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleW(void* hfile, void* lpszfilepath, uint32_t cchfilepath, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFinalPathNameByHandleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpszfilepath, cchfilepath, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    (void)lpszfilepath;
    (void)cchfilepath;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFullPathNameA(void* lpfilename, uint32_t nbufferlength, void* lpbuffer, void* lpfilepart) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFullPathNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, nbufferlength, lpbuffer, lpfilepart);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedA(void* lpfilename, uint32_t nbufferlength, void* lpbuffer, void* lpfilepart, void* htransaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFullPathNameTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, nbufferlength, lpbuffer, lpfilepart, htransaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    (void)htransaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedW(void* lpfilename, uint32_t nbufferlength, void* lpbuffer, void* lpfilepart, void* htransaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFullPathNameTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, nbufferlength, lpbuffer, lpfilepart, htransaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    (void)htransaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getFullPathNameW(void* lpfilename, uint32_t nbufferlength, void* lpbuffer, void* lpfilepart) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFullPathNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, nbufferlength, lpbuffer, lpfilepart);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getIoRingInfo(void* ioring, void* info) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIoRingInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioring, info);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ioring;
    (void)info;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getLogContainerName(void* hlog, uint32_t cidlogicalcontainer, void* pwstrcontainername, uint32_t clencontainername, void* pcactuallencontainername) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogContainerName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, cidlogicalcontainer, pwstrcontainername, clencontainername, pcactuallencontainername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)cidlogicalcontainer;
    (void)pwstrcontainername;
    (void)clencontainername;
    (void)pcactuallencontainername;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getLogFileInformation(void* hlog, void* pinfobuffer, void* cbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogFileInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pinfobuffer, cbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)pinfobuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getLogIoStatistics(void* hlog, void* pvstatsbuffer, uint32_t cbstatsbuffer, int32_t estatsclass, void* pcbstatswritten) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogIoStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pvstatsbuffer, cbstatsbuffer, estatsclass, pcbstatswritten);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)pvstatsbuffer;
    (void)cbstatsbuffer;
    (void)estatsclass;
    (void)pcbstatswritten;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getLogReservationInfo(void* pvmarshal, void* pcbrecordnumber, void* pcbuserreservation, void* pcbcommitreservation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogReservationInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, pcbrecordnumber, pcbuserreservation, pcbcommitreservation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)pcbrecordnumber;
    (void)pcbuserreservation;
    (void)pcbcommitreservation;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsA(uint32_t nbufferlength, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalDriveStringsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbufferlength, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsW(uint32_t nbufferlength, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalDriveStringsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbufferlength, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getLogicalDrives(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalDrives");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getLongPathNameA(void* lpszshortpath, void* lpszlongpath, uint32_t cchbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLongPathNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszshortpath, lpszlongpath, cchbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszshortpath;
    (void)lpszlongpath;
    (void)cchbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedA(void* lpszshortpath, void* lpszlongpath, uint32_t cchbuffer, void* htransaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLongPathNameTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszshortpath, lpszlongpath, cchbuffer, htransaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszshortpath;
    (void)lpszlongpath;
    (void)cchbuffer;
    (void)htransaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedW(void* lpszshortpath, void* lpszlongpath, uint32_t cchbuffer, void* htransaction) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLongPathNameTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszshortpath, lpszlongpath, cchbuffer, htransaction);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszshortpath;
    (void)lpszlongpath;
    (void)cchbuffer;
    (void)htransaction;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getLongPathNameW(void* lpszshortpath, void* lpszlongpath, uint32_t cchbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLongPathNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszshortpath, lpszlongpath, cchbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszshortpath;
    (void)lpszlongpath;
    (void)cchbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getNextLogArchiveExtent(void* pvarchivecontext, void* rgadextent, uint32_t cdescriptors, void* pcdescriptorsreturned) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNextLogArchiveExtent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarchivecontext, rgadextent, cdescriptors, pcdescriptorsreturned);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarchivecontext;
    (void)rgadextent;
    (void)cdescriptors;
    (void)pcdescriptorsreturned;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getNotificationResourceManager(void* resourcemanagerhandle, void* transactionnotification, uint32_t notificationlength, uint32_t dwmilliseconds, void* returnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNotificationResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, transactionnotification, notificationlength, dwmilliseconds, returnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)transactionnotification;
    (void)notificationlength;
    (void)dwmilliseconds;
    (void)returnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getNotificationResourceManagerAsync(void* resourcemanagerhandle, void* transactionnotification, uint32_t transactionnotificationlength, void* returnlength, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNotificationResourceManagerAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, transactionnotification, transactionnotificationlength, returnlength, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)transactionnotification;
    (void)transactionnotificationlength;
    (void)returnlength;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getShortPathNameA(void* lpszlongpath, void* lpszshortpath, uint32_t cchbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetShortPathNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszlongpath, lpszshortpath, cchbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszlongpath;
    (void)lpszshortpath;
    (void)cchbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getShortPathNameW(void* lpszlongpath, void* lpszshortpath, uint32_t cchbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetShortPathNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszlongpath, lpszshortpath, cchbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszlongpath;
    (void)lpszshortpath;
    (void)cchbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getTapeParameters(void* hdevice, uint32_t dwoperation, void* lpdwsize, void* lptapeinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTapeParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, dwoperation, lpdwsize, lptapeinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)dwoperation;
    (void)lpdwsize;
    (void)lptapeinformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getTapePosition(void* hdevice, uint32_t dwpositiontype, void* lpdwpartition, void* lpdwoffsetlow, void* lpdwoffsethigh) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTapePosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, dwpositiontype, lpdwpartition, lpdwoffsetlow, lpdwoffsethigh);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)dwpositiontype;
    (void)lpdwpartition;
    (void)lpdwoffsetlow;
    (void)lpdwoffsethigh;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getTapeStatus(void* hdevice) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTapeStatus");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getTempFileNameA(void* lppathname, void* lpprefixstring, uint32_t uunique, void* lptempfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempFileNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, lpprefixstring, uunique, lptempfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lppathname;
    (void)lpprefixstring;
    (void)uunique;
    (void)lptempfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getTempFileNameW(void* lppathname, void* lpprefixstring, uint32_t uunique, void* lptempfilename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempFileNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, lpprefixstring, uunique, lptempfilename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lppathname;
    (void)lpprefixstring;
    (void)uunique;
    (void)lptempfilename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getTempPath2A(uint32_t bufferlength, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempPath2A");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferlength, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getTempPath2W(uint32_t bufferlength, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempPath2W");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferlength, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getTempPathA(uint32_t nbufferlength, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbufferlength, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_getTempPathW(uint32_t nbufferlength, void* lpbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(nbufferlength, lpbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getTransactionId(void* transactionhandle, void* transactionid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTransactionId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, transactionid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)transactionid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getTransactionInformation(void* transactionhandle, void* outcome, void* isolationlevel, void* isolationflags, void* timeout, uint32_t bufferlength, void* description) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTransactionInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, outcome, isolationlevel, isolationflags, timeout, bufferlength, description);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)outcome;
    (void)isolationlevel;
    (void)isolationflags;
    (void)timeout;
    (void)bufferlength;
    (void)description;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getTransactionManagerId(void* transactionmanagerhandle, void* transactionmanagerid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTransactionManagerId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle, transactionmanagerid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    (void)transactionmanagerid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getVolumeInformationA(void* lprootpathname, void* lpvolumenamebuffer, uint32_t nvolumenamesize, void* lpvolumeserialnumber, void* lpmaximumcomponentlength, void* lpfilesystemflags, void* lpfilesystemnamebuffer, uint32_t nfilesystemnamesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeInformationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprootpathname, lpvolumenamebuffer, nvolumenamesize, lpvolumeserialnumber, lpmaximumcomponentlength, lpfilesystemflags, lpfilesystemnamebuffer, nfilesystemnamesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprootpathname;
    (void)lpvolumenamebuffer;
    (void)nvolumenamesize;
    (void)lpvolumeserialnumber;
    (void)lpmaximumcomponentlength;
    (void)lpfilesystemflags;
    (void)lpfilesystemnamebuffer;
    (void)nfilesystemnamesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getVolumeInformationByHandleW(void* hfile, void* lpvolumenamebuffer, uint32_t nvolumenamesize, void* lpvolumeserialnumber, void* lpmaximumcomponentlength, void* lpfilesystemflags, void* lpfilesystemnamebuffer, uint32_t nfilesystemnamesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeInformationByHandleW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpvolumenamebuffer, nvolumenamesize, lpvolumeserialnumber, lpmaximumcomponentlength, lpfilesystemflags, lpfilesystemnamebuffer, nfilesystemnamesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpvolumenamebuffer;
    (void)nvolumenamesize;
    (void)lpvolumeserialnumber;
    (void)lpmaximumcomponentlength;
    (void)lpfilesystemflags;
    (void)lpfilesystemnamebuffer;
    (void)nfilesystemnamesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getVolumeInformationW(void* lprootpathname, void* lpvolumenamebuffer, uint32_t nvolumenamesize, void* lpvolumeserialnumber, void* lpmaximumcomponentlength, void* lpfilesystemflags, void* lpfilesystemnamebuffer, uint32_t nfilesystemnamesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeInformationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprootpathname, lpvolumenamebuffer, nvolumenamesize, lpvolumeserialnumber, lpmaximumcomponentlength, lpfilesystemflags, lpfilesystemnamebuffer, nfilesystemnamesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprootpathname;
    (void)lpvolumenamebuffer;
    (void)nvolumenamesize;
    (void)lpvolumeserialnumber;
    (void)lpmaximumcomponentlength;
    (void)lpfilesystemflags;
    (void)lpfilesystemnamebuffer;
    (void)nfilesystemnamesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointA(void* lpszvolumemountpoint, void* lpszvolumename, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeNameForVolumeMountPointA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumemountpoint, lpszvolumename, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointW(void* lpszvolumemountpoint, void* lpszvolumename, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeNameForVolumeMountPointW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumemountpoint, lpszvolumename, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getVolumePathNameA(void* lpszfilename, void* lpszvolumepathname, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumePathNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, lpszvolumepathname, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getVolumePathNameW(void* lpszfilename, void* lpszvolumepathname, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumePathNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, lpszvolumepathname, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameA(void* lpszvolumename, void* lpszvolumepathnames, uint32_t cchbufferlength, void* lpcchreturnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumePathNamesForVolumeNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumename, lpszvolumepathnames, cchbufferlength, lpcchreturnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszvolumename;
    (void)lpszvolumepathnames;
    (void)cchbufferlength;
    (void)lpcchreturnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameW(void* lpszvolumename, void* lpszvolumepathnames, uint32_t cchbufferlength, void* lpcchreturnlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumePathNamesForVolumeNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumename, lpszvolumepathnames, cchbufferlength, lpcchreturnlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszvolumename;
    (void)lpszvolumepathnames;
    (void)cchbufferlength;
    (void)lpcchreturnlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_handleLogFull(void* hlog) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HandleLogFull");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_installLogPolicy(void* hlog, void* ppolicy) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallLogPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, ppolicy);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)ppolicy;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_isIoRingOpSupported(void* ioring, int32_t op) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsIoRingOpSupported");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioring, op);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ioring;
    (void)op;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_filesystem_lZClose(int32_t hfile) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZClose");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hfile);
        return;
    }
    errno = ENOSYS;
#else
    (void)hfile;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_lZCopy(int32_t hfsource, int32_t hfdest) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZCopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfsource, hfdest);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfsource;
    (void)hfdest;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_filesystem_lZDone(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZDone");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_lZInit(int32_t hfsource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZInit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfsource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfsource;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_lZOpenFileA(void* lpfilename, void* lpreopenbuf, uint16_t wstyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZOpenFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpreopenbuf, wstyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)lpreopenbuf;
    (void)wstyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_lZOpenFileW(void* lpfilename, void* lpreopenbuf, uint16_t wstyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZOpenFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpreopenbuf, wstyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)lpreopenbuf;
    (void)wstyle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_lZRead(int32_t hfile, void* lpbuffer, int32_t cbread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, cbread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)cbread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_lZSeek(int32_t hfile, int32_t loffset, int32_t iorigin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZSeek");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, loffset, iorigin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)loffset;
    (void)iorigin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_lZStart(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZStart");
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

int32_t windowssys_windows_win32_storage_filesystem_localFileTimeToFileTime(void* lplocalfiletime, void* lpfiletime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalFileTimeToFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lplocalfiletime, lpfiletime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lplocalfiletime;
    (void)lpfiletime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_lockFile(void* hfile, uint32_t dwfileoffsetlow, uint32_t dwfileoffsethigh, uint32_t nnumberofbytestolocklow, uint32_t nnumberofbytestolockhigh) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, dwfileoffsetlow, dwfileoffsethigh, nnumberofbytestolocklow, nnumberofbytestolockhigh);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)dwfileoffsetlow;
    (void)dwfileoffsethigh;
    (void)nnumberofbytestolocklow;
    (void)nnumberofbytestolockhigh;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_lockFileEx(void* hfile, uint32_t dwflags, uint32_t dwreserved, uint32_t nnumberofbytestolocklow, uint32_t nnumberofbytestolockhigh, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, dwflags, dwreserved, nnumberofbytestolocklow, nnumberofbytestolockhigh, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)dwflags;
    (void)dwreserved;
    (void)nnumberofbytestolocklow;
    (void)nnumberofbytestolockhigh;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_logTailAdvanceFailure(void* hlog, uint32_t dwreason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogTailAdvanceFailure");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, dwreason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)dwreason;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_lsnBlockOffset(void* plsn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnBlockOffset");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plsn;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_lsnContainer(void* plsn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plsn;
    errno = ENOSYS;
    return 0;
#endif
}

bool windowssys_windows_win32_storage_filesystem_lsnEqual(void* plsn1, void* plsn2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn1, plsn2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn1;
    (void)plsn2;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_storage_filesystem_lsnGreater(void* plsn1, void* plsn2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnGreater");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn1, plsn2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn1;
    (void)plsn2;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_storage_filesystem_lsnInvalid(void* plsn) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnInvalid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_storage_filesystem_lsnLess(void* plsn1, void* plsn2) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnLess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn1, plsn2);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn1;
    (void)plsn2;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_storage_filesystem_lsnNull(void* plsn) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnNull");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plsn;
    errno = ENOSYS;
    return false;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_lsnRecordSequence(void* plsn) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnRecordSequence");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plsn);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)plsn;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_moveFileA(void* lpexistingfilename, void* lpnewfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_moveFileExA(void* lpexistingfilename, void* lpnewfilename, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_moveFileExW(void* lpexistingfilename, void* lpnewfilename, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_moveFileFromAppW(void* lpexistingfilename, void* lpnewfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_moveFileTransactedA(void* lpexistingfilename, void* lpnewfilename, void* lpprogressroutine, void* lpdata, uint32_t dwflags, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, lpprogressroutine, lpdata, dwflags, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)dwflags;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_moveFileTransactedW(void* lpexistingfilename, void* lpnewfilename, void* lpprogressroutine, void* lpdata, uint32_t dwflags, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, lpprogressroutine, lpdata, dwflags, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)dwflags;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_moveFileW(void* lpexistingfilename, void* lpnewfilename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_moveFileWithProgressA(void* lpexistingfilename, void* lpnewfilename, void* lpprogressroutine, void* lpdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileWithProgressA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, lpprogressroutine, lpdata, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_moveFileWithProgressW(void* lpexistingfilename, void* lpnewfilename, void* lpprogressroutine, void* lpdata, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileWithProgressW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpexistingfilename, lpnewfilename, lpprogressroutine, lpdata, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netConnectionEnum(void* servername, void* qualifier, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resume_handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConnectionEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, qualifier, level, bufptr, prefmaxlen, entriesread, totalentries, resume_handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)qualifier;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netFileClose(void* servername, uint32_t fileid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetFileClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, fileid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)fileid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netFileEnum(void* servername, void* basepath, void* username, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resume_handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetFileEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, basepath, username, level, bufptr, prefmaxlen, entriesread, totalentries, resume_handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)basepath;
    (void)username;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netFileGetInfo(void* servername, uint32_t fileid, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetFileGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, fileid, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)fileid;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netServerAliasAdd(void* servername, uint32_t level, void* buf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerAliasAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netServerAliasDel(void* servername, uint32_t level, void* buf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerAliasDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netServerAliasEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resumehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerAliasEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resumehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netSessionDel(void* servername, void* uncclientname, void* username) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetSessionDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, uncclientname, username);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)uncclientname;
    (void)username;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netSessionEnum(void* servername, void* uncclientname, void* username, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resume_handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetSessionEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, uncclientname, username, level, bufptr, prefmaxlen, entriesread, totalentries, resume_handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)uncclientname;
    (void)username;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netSessionGetInfo(void* servername, void* uncclientname, void* username, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetSessionGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, uncclientname, username, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)uncclientname;
    (void)username;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netShareAdd(void* servername, uint32_t level, void* buf, void* parm_err) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareAdd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf, parm_err);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netShareCheck(void* servername, void* device, void* type) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareCheck");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, device, type);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)device;
    (void)type;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netShareDel(void* servername, void* netname, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareDel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, netname, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)netname;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netShareDelEx(void* servername, uint32_t level, void* buf) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareDelEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, buf);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netShareDelSticky(void* servername, void* netname, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareDelSticky");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, netname, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)netname;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netShareEnum(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resume_handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resume_handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netShareEnumSticky(void* servername, uint32_t level, void* bufptr, uint32_t prefmaxlen, void* entriesread, void* totalentries, void* resume_handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareEnumSticky");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, level, bufptr, prefmaxlen, entriesread, totalentries, resume_handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netShareGetInfo(void* servername, void* netname, uint32_t level, void* bufptr) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, netname, level, bufptr);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)netname;
    (void)level;
    (void)bufptr;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netShareSetInfo(void* servername, void* netname, uint32_t level, void* buf, void* parm_err) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareSetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, netname, level, buf, parm_err);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)netname;
    (void)level;
    (void)buf;
    (void)parm_err;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_netStatisticsGet(void* servername, void* service, uint32_t level, uint32_t options, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetStatisticsGet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(servername, service, level, options, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)servername;
    (void)service;
    (void)level;
    (void)options;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_openEncryptedFileRawA(void* lpfilename, uint32_t ulflags, void* pvcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEncryptedFileRawA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, ulflags, pvcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)ulflags;
    (void)pvcontext;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_openEncryptedFileRawW(void* lpfilename, uint32_t ulflags, void* pvcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEncryptedFileRawW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, ulflags, pvcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)ulflags;
    (void)pvcontext;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_storage_filesystem_openEnlistment(uint32_t dwdesiredaccess, void* resourcemanagerhandle, void* enlistmentid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, resourcemanagerhandle, enlistmentid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)resourcemanagerhandle;
    (void)enlistmentid;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_openFile(void* lpfilename, void* lpreopenbuff, uint32_t ustyle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, lpreopenbuff, ustyle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)lpreopenbuff;
    (void)ustyle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_storage_filesystem_openFileById(void* hvolumehint, void* lpfileid, uint32_t dwdesiredaccess, uint32_t dwsharemode, void* lpsecurityattributes, uint32_t dwflagsandattributes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFileById");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hvolumehint, lpfileid, dwdesiredaccess, dwsharemode, lpsecurityattributes, dwflagsandattributes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hvolumehint;
    (void)lpfileid;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwflagsandattributes;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_openResourceManager(uint32_t dwdesiredaccess, void* tmhandle, void* resourcemanagerid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, tmhandle, resourcemanagerid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)tmhandle;
    (void)resourcemanagerid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_openTransaction(uint32_t dwdesiredaccess, void* transactionid) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwdesiredaccess, transactionid);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)dwdesiredaccess;
    (void)transactionid;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_openTransactionManager(void* logfilename, uint32_t desiredaccess, uint32_t openoptions) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfilename, desiredaccess, openoptions);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)logfilename;
    (void)desiredaccess;
    (void)openoptions;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_storage_filesystem_openTransactionManagerById(void* transactionmanagerid, uint32_t desiredaccess, uint32_t openoptions) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTransactionManagerById");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerid, desiredaccess, openoptions);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)transactionmanagerid;
    (void)desiredaccess;
    (void)openoptions;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_popIoRingCompletion(void* ioring, void* cqe) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PopIoRingCompletion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioring, cqe);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ioring;
    (void)cqe;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_prePrepareComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrePrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_prePrepareEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrePrepareEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_prepareComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrepareComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_prepareEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrepareEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_prepareLogArchive(void* hlog, void* pszbaselogfilename, uint32_t clen, void* plsnlow, void* plsnhigh, void* pcactuallength, void* poffbaselogfiledata, void* pcbbaselogfilelength, void* plsnbase, void* plsnlast, void* plsncurrentarchivetail, void* ppvarchivecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrepareLogArchive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pszbaselogfilename, clen, plsnlow, plsnhigh, pcactuallength, poffbaselogfiledata, pcbbaselogfilelength, plsnbase, plsnlast, plsncurrentarchivetail, ppvarchivecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)pszbaselogfilename;
    (void)clen;
    (void)plsnlow;
    (void)plsnhigh;
    (void)pcactuallength;
    (void)poffbaselogfiledata;
    (void)pcbbaselogfilelength;
    (void)plsnbase;
    (void)plsnlast;
    (void)plsncurrentarchivetail;
    (void)ppvarchivecontext;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_prepareTape(void* hdevice, uint32_t dwoperation, int32_t bimmediate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrepareTape");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, dwoperation, bimmediate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)dwoperation;
    (void)bimmediate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_queryDosDeviceA(void* lpdevicename, void* lptargetpath, uint32_t ucchmax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDosDeviceA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdevicename, lptargetpath, ucchmax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpdevicename;
    (void)lptargetpath;
    (void)ucchmax;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_queryDosDeviceW(void* lpdevicename, void* lptargetpath, uint32_t ucchmax) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDosDeviceW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpdevicename, lptargetpath, ucchmax);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpdevicename;
    (void)lptargetpath;
    (void)ucchmax;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_queryIoRingCapabilities(void* capabilities) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryIoRingCapabilities");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(capabilities);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)capabilities;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_queryLogPolicy(void* hlog, int32_t epolicytype, void* ppolicybuffer, void* pcbpolicybuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryLogPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, epolicytype, ppolicybuffer, pcbpolicybuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)epolicytype;
    (void)ppolicybuffer;
    (void)pcbpolicybuffer;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_queryRecoveryAgentsOnEncryptedFile(void* lpfilename, void* precoveryagents) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryRecoveryAgentsOnEncryptedFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, precoveryagents);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)precoveryagents;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_queryUsersOnEncryptedFile(void* lpfilename, void* pusers) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryUsersOnEncryptedFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, pusers);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)pusers;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_storage_filesystem_reOpenFile(void* horiginalfile, uint32_t dwdesiredaccess, uint32_t dwsharemode, uint32_t dwflagsandattributes) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReOpenFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(horiginalfile, dwdesiredaccess, dwsharemode, dwflagsandattributes);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)horiginalfile;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwflagsandattributes;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readDirectoryChangesExW(void* hdirectory, void* lpbuffer, uint32_t nbufferlength, int32_t bwatchsubtree, uint32_t dwnotifyfilter, void* lpbytesreturned, void* lpoverlapped, void* lpcompletionroutine, int32_t readdirectorynotifyinformationclass) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadDirectoryChangesExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdirectory, lpbuffer, nbufferlength, bwatchsubtree, dwnotifyfilter, lpbytesreturned, lpoverlapped, lpcompletionroutine, readdirectorynotifyinformationclass);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdirectory;
    (void)lpbuffer;
    (void)nbufferlength;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    (void)lpbytesreturned;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    (void)readdirectorynotifyinformationclass;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readDirectoryChangesW(void* hdirectory, void* lpbuffer, uint32_t nbufferlength, int32_t bwatchsubtree, uint32_t dwnotifyfilter, void* lpbytesreturned, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadDirectoryChangesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdirectory, lpbuffer, nbufferlength, bwatchsubtree, dwnotifyfilter, lpbytesreturned, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdirectory;
    (void)lpbuffer;
    (void)nbufferlength;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    (void)lpbytesreturned;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_readEncryptedFileRaw(void* pfexportcallback, void* pvcallbackcontext, void* pvcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadEncryptedFileRaw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfexportcallback, pvcallbackcontext, pvcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pfexportcallback;
    (void)pvcallbackcontext;
    (void)pvcontext;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readFile(void* hfile, void* lpbuffer, uint32_t nnumberofbytestoread, void* lpnumberofbytesread, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, nnumberofbytestoread, lpnumberofbytesread, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)lpnumberofbytesread;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readFileEx(void* hfile, void* lpbuffer, uint32_t nnumberofbytestoread, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, nnumberofbytestoread, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readFileScatter(void* hfile, void* asegmentarray, uint32_t nnumberofbytestoread, void* lpreserved, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadFileScatter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, asegmentarray, nnumberofbytestoread, lpreserved, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)asegmentarray;
    (void)nnumberofbytestoread;
    (void)lpreserved;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readLogArchiveMetadata(void* pvarchivecontext, uint32_t cboffset, uint32_t cbbytestoread, void* pbreadbuffer, void* pcbbytesread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadLogArchiveMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarchivecontext, cboffset, cbbytestoread, pbreadbuffer, pcbbytesread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarchivecontext;
    (void)cboffset;
    (void)cbbytestoread;
    (void)pbreadbuffer;
    (void)pcbbytesread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readLogNotification(void* hlog, void* pnotification, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadLogNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pnotification, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)pnotification;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readLogRecord(void* pvmarshal, void* plsnfirst, int32_t econtextmode, void* ppvreadbuffer, void* pcbreadbuffer, void* perecordtype, void* plsnundonext, void* plsnprevious, void* ppvreadcontext, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadLogRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, plsnfirst, econtextmode, ppvreadbuffer, pcbreadbuffer, perecordtype, plsnundonext, plsnprevious, ppvreadcontext, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)plsnfirst;
    (void)econtextmode;
    (void)ppvreadbuffer;
    (void)pcbreadbuffer;
    (void)perecordtype;
    (void)plsnundonext;
    (void)plsnprevious;
    (void)ppvreadcontext;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readLogRestartArea(void* pvmarshal, void* ppvrestartbuffer, void* pcbrestartbuffer, void* plsn, void* ppvcontext, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadLogRestartArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, ppvrestartbuffer, pcbrestartbuffer, plsn, ppvcontext, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)ppvrestartbuffer;
    (void)pcbrestartbuffer;
    (void)plsn;
    (void)ppvcontext;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readNextLogRecord(void* pvreadcontext, void* ppvbuffer, void* pcbbuffer, void* perecordtype, void* plsnuser, void* plsnundonext, void* plsnprevious, void* plsnrecord, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadNextLogRecord");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvreadcontext, ppvbuffer, pcbbuffer, perecordtype, plsnuser, plsnundonext, plsnprevious, plsnrecord, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvreadcontext;
    (void)ppvbuffer;
    (void)pcbbuffer;
    (void)perecordtype;
    (void)plsnuser;
    (void)plsnundonext;
    (void)plsnprevious;
    (void)plsnrecord;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readOnlyEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadOnlyEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_readPreviousLogRestartArea(void* pvreadcontext, void* ppvrestartbuffer, void* pcbrestartbuffer, void* plsnrestart, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadPreviousLogRestartArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvreadcontext, ppvrestartbuffer, pcbrestartbuffer, plsnrestart, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvreadcontext;
    (void)ppvrestartbuffer;
    (void)pcbrestartbuffer;
    (void)plsnrestart;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_recoverEnlistment(void* enlistmenthandle, void* enlistmentkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecoverEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, enlistmentkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_recoverResourceManager(void* resourcemanagerhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecoverResourceManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_recoverTransactionManager(void* transactionmanagerhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecoverTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_registerForLogWriteNotification(void* hlog, uint32_t cbthreshold, int32_t fenable) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterForLogWriteNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, cbthreshold, fenable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)cbthreshold;
    (void)fenable;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_registerManageableLogClient(void* hlog, void* pcallbacks) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterManageableLogClient");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pcallbacks);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)pcallbacks;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_removeDirectoryA(void* lppathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_removeDirectoryFromAppW(void* lppathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedA(void* lppathname, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedW(void* lppathname, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_removeDirectoryW(void* lppathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lppathname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_removeLogContainer(void* hlog, void* pwszcontainerpath, int32_t fforce, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveLogContainer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pwszcontainerpath, fforce, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)pwszcontainerpath;
    (void)fforce;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_removeLogContainerSet(void* hlog, uint16_t ccontainer, void* rgwszcontainerpath, int32_t fforce, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveLogContainerSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, ccontainer, rgwszcontainerpath, fforce, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)ccontainer;
    (void)rgwszcontainerpath;
    (void)fforce;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_removeLogPolicy(void* hlog, int32_t epolicytype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveLogPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, epolicytype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)epolicytype;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_removeUsersFromEncryptedFile(void* lpfilename, void* phashes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveUsersFromEncryptedFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, phashes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)phashes;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_renameTransactionManager(void* logfilename, void* existingtransactionmanagerguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RenameTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(logfilename, existingtransactionmanagerguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)logfilename;
    (void)existingtransactionmanagerguid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_replaceFileA(void* lpreplacedfilename, void* lpreplacementfilename, void* lpbackupfilename, uint32_t dwreplaceflags, void* lpexclude, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplaceFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpreplacedfilename, lpreplacementfilename, lpbackupfilename, dwreplaceflags, lpexclude, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpreplacedfilename;
    (void)lpreplacementfilename;
    (void)lpbackupfilename;
    (void)dwreplaceflags;
    (void)lpexclude;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_replaceFileFromAppW(void* lpreplacedfilename, void* lpreplacementfilename, void* lpbackupfilename, uint32_t dwreplaceflags, void* lpexclude, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplaceFileFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpreplacedfilename, lpreplacementfilename, lpbackupfilename, dwreplaceflags, lpexclude, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpreplacedfilename;
    (void)lpreplacementfilename;
    (void)lpbackupfilename;
    (void)dwreplaceflags;
    (void)lpexclude;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_replaceFileW(void* lpreplacedfilename, void* lpreplacementfilename, void* lpbackupfilename, uint32_t dwreplaceflags, void* lpexclude, void* lpreserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplaceFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpreplacedfilename, lpreplacementfilename, lpbackupfilename, dwreplaceflags, lpexclude, lpreserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpreplacedfilename;
    (void)lpreplacementfilename;
    (void)lpbackupfilename;
    (void)dwreplaceflags;
    (void)lpexclude;
    (void)lpreserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_reserveAndAppendLog(void* pvmarshal, void* rgwriteentries, uint32_t cwriteentries, void* plsnundonext, void* plsnprevious, uint32_t creserverecords, void* rgcbreservation, uint32_t fflags, void* plsn, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReserveAndAppendLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, rgwriteentries, cwriteentries, plsnundonext, plsnprevious, creserverecords, rgcbreservation, fflags, plsn, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)rgwriteentries;
    (void)cwriteentries;
    (void)plsnundonext;
    (void)plsnprevious;
    (void)creserverecords;
    (void)rgcbreservation;
    (void)fflags;
    (void)plsn;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_reserveAndAppendLogAligned(void* pvmarshal, void* rgwriteentries, uint32_t cwriteentries, uint32_t cbentryalignment, void* plsnundonext, void* plsnprevious, uint32_t creserverecords, void* rgcbreservation, uint32_t fflags, void* plsn, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReserveAndAppendLogAligned");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, rgwriteentries, cwriteentries, cbentryalignment, plsnundonext, plsnprevious, creserverecords, rgcbreservation, fflags, plsn, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)rgwriteentries;
    (void)cwriteentries;
    (void)cbentryalignment;
    (void)plsnundonext;
    (void)plsnprevious;
    (void)creserverecords;
    (void)rgcbreservation;
    (void)fflags;
    (void)plsn;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_rollbackComplete(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollbackComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_rollbackEnlistment(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollbackEnlistment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_rollbackTransaction(void* transactionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollbackTransaction");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_rollbackTransactionAsync(void* transactionhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollbackTransactionAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_rollforwardTransactionManager(void* transactionmanagerhandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollforwardTransactionManager");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionmanagerhandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionmanagerhandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_scanLogContainers(void* pcxscan, uint8_t escanmode, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScanLogContainers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcxscan, escanmode, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcxscan;
    (void)escanmode;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_searchPathA(void* lppath, void* lpfilename, void* lpextension, uint32_t nbufferlength, void* lpbuffer, void* lpfilepart) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchPathA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppath, lpfilename, lpextension, nbufferlength, lpbuffer, lpfilepart);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lppath;
    (void)lpfilename;
    (void)lpextension;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_searchPathW(void* lppath, void* lpfilename, void* lpextension, uint32_t nbufferlength, void* lpbuffer, void* lpfilepart) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchPathW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lppath, lpfilename, lpextension, nbufferlength, lpbuffer, lpfilepart);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lppath;
    (void)lpfilename;
    (void)lpextension;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_setEncryptedFileMetadata(void* lpfilename, void* pboldmetadata, void* pbnewmetadata, void* pownerhash, uint32_t dwoperation, void* pcertificatesadded) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEncryptedFileMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, pboldmetadata, pbnewmetadata, pownerhash, dwoperation, pcertificatesadded);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfilename;
    (void)pboldmetadata;
    (void)pbnewmetadata;
    (void)pownerhash;
    (void)dwoperation;
    (void)pcertificatesadded;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setEndOfFile(void* hfile) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEndOfFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setEndOfLog(void* hlog, void* plsnend, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEndOfLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, plsnend, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)plsnend;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setEnlistmentRecoveryInformation(void* enlistmenthandle, uint32_t buffersize, void* buffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnlistmentRecoveryInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, buffersize, buffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)buffersize;
    (void)buffer;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_filesystem_setFileApisToANSI(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileApisToANSI");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_storage_filesystem_setFileApisToOEM(void) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileApisToOEM");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
        return;
    }
    errno = ENOSYS;
#else
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileAttributesA(void* lpfilename, uint32_t dwfileattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwfileattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileAttributesFromAppW(void* lpfilename, uint32_t dwfileattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesFromAppW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwfileattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedA(void* lpfilename, uint32_t dwfileattributes, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwfileattributes, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedW(void* lpfilename, uint32_t dwfileattributes, void* htransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwfileattributes, htransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    (void)htransaction;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileAttributesW(void* lpfilename, uint32_t dwfileattributes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfilename, dwfileattributes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileBandwidthReservation(void* hfile, uint32_t nperiodmilliseconds, uint32_t nbytesperperiod, int32_t bdiscardable, void* lptransfersize, void* lpnumoutstandingrequests) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileBandwidthReservation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, nperiodmilliseconds, nbytesperperiod, bdiscardable, lptransfersize, lpnumoutstandingrequests);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)nperiodmilliseconds;
    (void)nbytesperperiod;
    (void)bdiscardable;
    (void)lptransfersize;
    (void)lpnumoutstandingrequests;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileCompletionNotificationModes(void* filehandle, uint8_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileCompletionNotificationModes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileInformationByHandle(void* hfile, int32_t fileinformationclass, void* lpfileinformation, uint32_t dwbuffersize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileInformationByHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, fileinformationclass, lpfileinformation, dwbuffersize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)fileinformationclass;
    (void)lpfileinformation;
    (void)dwbuffersize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileIoOverlappedRange(void* filehandle, void* overlappedrangestart, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileIoOverlappedRange");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, overlappedrangestart, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)overlappedrangestart;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_setFilePointer(void* hfile, int32_t ldistancetomove, void* lpdistancetomovehigh, uint32_t dwmovemethod) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFilePointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, ldistancetomove, lpdistancetomovehigh, dwmovemethod);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hfile;
    (void)ldistancetomove;
    (void)lpdistancetomovehigh;
    (void)dwmovemethod;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFilePointerEx(void* hfile, int64_t lidistancetomove, void* lpnewfilepointer, uint32_t dwmovemethod) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFilePointerEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lidistancetomove, lpnewfilepointer, dwmovemethod);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lidistancetomove;
    (void)lpnewfilepointer;
    (void)dwmovemethod;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileShortNameA(void* hfile, void* lpshortname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileShortNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpshortname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpshortname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileShortNameW(void* hfile, void* lpshortname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileShortNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpshortname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpshortname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileTime(void* hfile, void* lpcreationtime, void* lplastaccesstime, void* lplastwritetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpcreationtime, lplastaccesstime, lplastwritetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpcreationtime;
    (void)lplastaccesstime;
    (void)lplastwritetime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setFileValidData(void* hfile, int64_t validdatalength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileValidData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, validdatalength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)validdatalength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setIoRingCompletionEvent(void* ioring, void* hevent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIoRingCompletionEvent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioring, hevent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ioring;
    (void)hevent;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setLogArchiveMode(void* hlog, int32_t emode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLogArchiveMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, emode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)emode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setLogArchiveTail(void* hlog, void* plsnarchivetail, void* preserved) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLogArchiveTail");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, plsnarchivetail, preserved);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)plsnarchivetail;
    (void)preserved;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setLogFileSizeWithPolicy(void* hlog, void* pdesiredsize, void* presultingsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLogFileSizeWithPolicy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hlog, pdesiredsize, presultingsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hlog;
    (void)pdesiredsize;
    (void)presultingsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setResourceManagerCompletionPort(void* resourcemanagerhandle, void* iocompletionporthandle, uint64_t completionkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetResourceManagerCompletionPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(resourcemanagerhandle, iocompletionporthandle, completionkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)resourcemanagerhandle;
    (void)iocompletionporthandle;
    (void)completionkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setSearchPathMode(uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSearchPathMode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_setTapeParameters(void* hdevice, uint32_t dwoperation, void* lptapeinformation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTapeParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, dwoperation, lptapeinformation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)dwoperation;
    (void)lptapeinformation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_setTapePosition(void* hdevice, uint32_t dwpositionmethod, uint32_t dwpartition, uint32_t dwoffsetlow, uint32_t dwoffsethigh, int32_t bimmediate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTapePosition");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, dwpositionmethod, dwpartition, dwoffsetlow, dwoffsethigh, bimmediate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)dwpositionmethod;
    (void)dwpartition;
    (void)dwoffsetlow;
    (void)dwoffsethigh;
    (void)bimmediate;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setTransactionInformation(void* transactionhandle, uint32_t isolationlevel, uint32_t isolationflags, uint32_t timeout, void* description) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTransactionInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(transactionhandle, isolationlevel, isolationflags, timeout, description);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)transactionhandle;
    (void)isolationlevel;
    (void)isolationflags;
    (void)timeout;
    (void)description;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKey(void* pencryptioncertificate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserFileEncryptionKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pencryptioncertificate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pencryptioncertificate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKeyEx(void* pencryptioncertificate, uint32_t dwcapabilities, uint32_t dwflags, void* pvreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserFileEncryptionKeyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pencryptioncertificate, dwcapabilities, dwflags, pvreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pencryptioncertificate;
    (void)dwcapabilities;
    (void)dwflags;
    (void)pvreserved;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setVolumeLabelA(void* lprootpathname, void* lpvolumename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVolumeLabelA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprootpathname, lpvolumename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprootpathname;
    (void)lpvolumename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setVolumeLabelW(void* lprootpathname, void* lpvolumename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVolumeLabelW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lprootpathname, lpvolumename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lprootpathname;
    (void)lpvolumename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setVolumeMountPointA(void* lpszvolumemountpoint, void* lpszvolumename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVolumeMountPointA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumemountpoint, lpszvolumename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_setVolumeMountPointW(void* lpszvolumemountpoint, void* lpszvolumename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVolumeMountPointW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumemountpoint, lpszvolumename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_singlePhaseReject(void* enlistmenthandle, void* tmvirtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SinglePhaseReject");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enlistmenthandle, tmvirtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_submitIoRing(void* ioring, uint32_t waitoperations, uint32_t milliseconds, void* submittedentries) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubmitIoRing");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ioring, waitoperations, milliseconds, submittedentries);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ioring;
    (void)waitoperations;
    (void)milliseconds;
    (void)submittedentries;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_terminateLogArchive(void* pvarchivecontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateLogArchive");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvarchivecontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvarchivecontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_terminateReadLog(void* pvcursorcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateReadLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvcursorcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvcursorcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_truncateLog(void* pvmarshal, void* plsnend, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TruncateLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, plsnend, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)plsnend;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_filesystem_txfGetThreadMiniVersionForCreate(void* miniversion) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfGetThreadMiniVersionForCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(miniversion);
        return;
    }
    errno = ENOSYS;
#else
    (void)miniversion;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_txfLogDestroyReadContext(void* txflogcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfLogDestroyReadContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(txflogcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)txflogcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_txfLogReadRecords(void* txflogcontext, uint32_t bufferlength, void* buffer, void* bytesused, void* recordcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfLogReadRecords");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(txflogcontext, bufferlength, buffer, bytesused, recordcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)txflogcontext;
    (void)bufferlength;
    (void)buffer;
    (void)bytesused;
    (void)recordcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_txfLogRecordGetFileName(void* recordbuffer, uint32_t recordbufferlengthinbytes, void* namebuffer, void* namebufferlengthinbytes, void* txfid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfLogRecordGetFileName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(recordbuffer, recordbufferlengthinbytes, namebuffer, namebufferlengthinbytes, txfid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)recordbuffer;
    (void)recordbufferlengthinbytes;
    (void)namebuffer;
    (void)namebufferlengthinbytes;
    (void)txfid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_txfLogRecordGetGenericType(void* recordbuffer, uint32_t recordbufferlengthinbytes, void* generictype, void* virtualclock) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfLogRecordGetGenericType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(recordbuffer, recordbufferlengthinbytes, generictype, virtualclock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)recordbuffer;
    (void)recordbufferlengthinbytes;
    (void)generictype;
    (void)virtualclock;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_txfReadMetadataInfo(void* filehandle, void* txffileid, void* lastlsn, void* transactionstate, void* lockingtransaction) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfReadMetadataInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, txffileid, lastlsn, transactionstate, lockingtransaction);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)txffileid;
    (void)lastlsn;
    (void)transactionstate;
    (void)lockingtransaction;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_filesystem_txfSetThreadMiniVersionForCreate(uint16_t miniversion) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfSetThreadMiniVersionForCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(miniversion);
        return;
    }
    errno = ENOSYS;
#else
    (void)miniversion;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_unlockFile(void* hfile, uint32_t dwfileoffsetlow, uint32_t dwfileoffsethigh, uint32_t nnumberofbytestounlocklow, uint32_t nnumberofbytestounlockhigh) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, dwfileoffsetlow, dwfileoffsethigh, nnumberofbytestounlocklow, nnumberofbytestounlockhigh);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)dwfileoffsetlow;
    (void)dwfileoffsethigh;
    (void)nnumberofbytestounlocklow;
    (void)nnumberofbytestounlockhigh;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_unlockFileEx(void* hfile, uint32_t dwreserved, uint32_t nnumberofbytestounlocklow, uint32_t nnumberofbytestounlockhigh, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, dwreserved, nnumberofbytestounlocklow, nnumberofbytestounlockhigh, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)dwreserved;
    (void)nnumberofbytestounlocklow;
    (void)nnumberofbytestounlockhigh;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_validateLog(void* pszlogfilename, void* psalogfile, void* pinfobuffer, void* pcbbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateLog");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszlogfilename, psalogfile, pinfobuffer, pcbbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszlogfilename;
    (void)psalogfile;
    (void)pinfobuffer;
    (void)pcbbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_verFindFileA(uint32_t uflags, void* szfilename, void* szwindir, void* szappdir, void* szcurdir, void* pucurdirlen, void* szdestdir, void* pudestdirlen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerFindFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uflags, szfilename, szwindir, szappdir, szcurdir, pucurdirlen, szdestdir, pudestdirlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uflags;
    (void)szfilename;
    (void)szwindir;
    (void)szappdir;
    (void)szcurdir;
    (void)pucurdirlen;
    (void)szdestdir;
    (void)pudestdirlen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_verFindFileW(uint32_t uflags, void* szfilename, void* szwindir, void* szappdir, void* szcurdir, void* pucurdirlen, void* szdestdir, void* pudestdirlen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerFindFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uflags, szfilename, szwindir, szappdir, szcurdir, pucurdirlen, szdestdir, pudestdirlen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uflags;
    (void)szfilename;
    (void)szwindir;
    (void)szappdir;
    (void)szcurdir;
    (void)pucurdirlen;
    (void)szdestdir;
    (void)pudestdirlen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_verInstallFileA(uint32_t uflags, void* szsrcfilename, void* szdestfilename, void* szsrcdir, void* szdestdir, void* szcurdir, void* sztmpfile, void* putmpfilelen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerInstallFileA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uflags, szsrcfilename, szdestfilename, szsrcdir, szdestdir, szcurdir, sztmpfile, putmpfilelen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uflags;
    (void)szsrcfilename;
    (void)szdestfilename;
    (void)szsrcdir;
    (void)szdestdir;
    (void)szcurdir;
    (void)sztmpfile;
    (void)putmpfilelen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_verInstallFileW(uint32_t uflags, void* szsrcfilename, void* szdestfilename, void* szsrcdir, void* szdestdir, void* szcurdir, void* sztmpfile, void* putmpfilelen) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerInstallFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(uflags, szsrcfilename, szdestfilename, szsrcdir, szdestdir, szcurdir, sztmpfile, putmpfilelen);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)uflags;
    (void)szsrcfilename;
    (void)szdestfilename;
    (void)szsrcdir;
    (void)szdestdir;
    (void)szcurdir;
    (void)sztmpfile;
    (void)putmpfilelen;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_verLanguageNameA(uint32_t wlang, void* szlang, uint32_t cchlang) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerLanguageNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wlang, szlang, cchlang);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)wlang;
    (void)szlang;
    (void)cchlang;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_verLanguageNameW(uint32_t wlang, void* szlang, uint32_t cchlang) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerLanguageNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wlang, szlang, cchlang);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)wlang;
    (void)szlang;
    (void)cchlang;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_verQueryValueA(void* pblock, void* lpsubblock, void* lplpbuffer, void* pulen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerQueryValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pblock, lpsubblock, lplpbuffer, pulen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pblock;
    (void)lpsubblock;
    (void)lplpbuffer;
    (void)pulen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_verQueryValueW(void* pblock, void* lpsubblock, void* lplpbuffer, void* pulen) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerQueryValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pblock, lpsubblock, lplpbuffer, pulen);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pblock;
    (void)lpsubblock;
    (void)lplpbuffer;
    (void)pulen;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofEnumEntries(void* volumename, uint32_t provider, void* enumproc, void* userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofEnumEntries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumename, provider, enumproc, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumename;
    (void)provider;
    (void)enumproc;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofFileEnumFiles(void* volumename, uint32_t algorithm, void* enumproc, void* userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofFileEnumFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumename, algorithm, enumproc, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumename;
    (void)algorithm;
    (void)enumproc;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofGetDriverVersion(void* fileorvolumehandle, uint32_t provider, void* wofversion) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofGetDriverVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fileorvolumehandle, provider, wofversion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fileorvolumehandle;
    (void)provider;
    (void)wofversion;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofIsExternalFile(void* filepath, void* isexternalfile, void* provider, void* externalfileinfo, void* bufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofIsExternalFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filepath, isexternalfile, provider, externalfileinfo, bufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filepath;
    (void)isexternalfile;
    (void)provider;
    (void)externalfileinfo;
    (void)bufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofSetFileDataLocation(void* filehandle, uint32_t provider, void* externalfileinfo, uint32_t length) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofSetFileDataLocation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filehandle, provider, externalfileinfo, length);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filehandle;
    (void)provider;
    (void)externalfileinfo;
    (void)length;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofShouldCompressBinaries(void* volume, void* algorithm) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofShouldCompressBinaries");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volume, algorithm);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volume;
    (void)algorithm;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofWimAddEntry(void* volumename, void* wimpath, uint32_t wimtype, uint32_t wimindex, void* datasourceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimAddEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumename, wimpath, wimtype, wimindex, datasourceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumename;
    (void)wimpath;
    (void)wimtype;
    (void)wimindex;
    (void)datasourceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofWimEnumFiles(void* volumename, int64_t datasourceid, void* enumproc, void* userdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimEnumFiles");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumename, datasourceid, enumproc, userdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumename;
    (void)datasourceid;
    (void)enumproc;
    (void)userdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofWimRemoveEntry(void* volumename, int64_t datasourceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimRemoveEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumename, datasourceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumename;
    (void)datasourceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofWimSuspendEntry(void* volumename, int64_t datasourceid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimSuspendEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumename, datasourceid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumename;
    (void)datasourceid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wofWimUpdateEntry(void* volumename, int64_t datasourceid, void* newwimpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimUpdateEntry");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(volumename, datasourceid, newwimpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)volumename;
    (void)datasourceid;
    (void)newwimpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wow64DisableWow64FsRedirection(void* oldvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64DisableWow64FsRedirection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(oldvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)oldvalue;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_storage_filesystem_wow64EnableWow64FsRedirection(bool wow64fsenableredirection) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64EnableWow64FsRedirection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wow64fsenableredirection);
    }
    errno = ENOSYS;
    return false;
#else
    (void)wow64fsenableredirection;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_wow64RevertWow64FsRedirection(void* olvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64RevertWow64FsRedirection");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(olvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)olvalue;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_writeEncryptedFileRaw(void* pfimportcallback, void* pvcallbackcontext, void* pvcontext) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteEncryptedFileRaw");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfimportcallback, pvcallbackcontext, pvcontext);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pfimportcallback;
    (void)pvcallbackcontext;
    (void)pvcontext;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_writeFile(void* hfile, void* lpbuffer, uint32_t nnumberofbytestowrite, void* lpnumberofbyteswritten, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, nnumberofbytestowrite, lpnumberofbyteswritten, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestowrite;
    (void)lpnumberofbyteswritten;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_writeFileEx(void* hfile, void* lpbuffer, uint32_t nnumberofbytestowrite, void* lpoverlapped, void* lpcompletionroutine) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteFileEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, lpbuffer, nnumberofbytestowrite, lpoverlapped, lpcompletionroutine);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestowrite;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_writeFileGather(void* hfile, void* asegmentarray, uint32_t nnumberofbytestowrite, void* lpreserved, void* lpoverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteFileGather");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hfile, asegmentarray, nnumberofbytestowrite, lpreserved, lpoverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hfile;
    (void)asegmentarray;
    (void)nnumberofbytestowrite;
    (void)lpreserved;
    (void)lpoverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_filesystem_writeLogRestartArea(void* pvmarshal, void* pvrestartbuffer, uint32_t cbrestartbuffer, void* plsnbase, uint32_t fflags, void* pcbwritten, void* plsnnext, void* poverlapped) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteLogRestartArea");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvmarshal, pvrestartbuffer, cbrestartbuffer, plsnbase, fflags, pcbwritten, plsnnext, poverlapped);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvmarshal;
    (void)pvrestartbuffer;
    (void)cbrestartbuffer;
    (void)plsnbase;
    (void)fflags;
    (void)pcbwritten;
    (void)plsnnext;
    (void)poverlapped;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_filesystem_writeTapemark(void* hdevice, uint32_t dwtapemarktype, uint32_t dwtapemarkcount, int32_t bimmediate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteTapemark");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdevice, dwtapemarktype, dwtapemarkcount, bimmediate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdevice;
    (void)dwtapemarktype;
    (void)dwtapemarkcount;
    (void)bimmediate;
    errno = ENOSYS;
    return 0;
#endif
}

