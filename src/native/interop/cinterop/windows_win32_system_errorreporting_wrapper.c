#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_errorreporting_wrapper.h"
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

int32_t windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationA(void* szapplication) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("faultrep.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddERExcludedApplicationA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(szapplication);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)szapplication;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingAddERExcludedApplicationW(void* wszapplication) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("faultrep.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddERExcludedApplicationW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(wszapplication);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)wszapplication;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingReportFault(void* pep, uint32_t dwopt) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("faultrep.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportFault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pep, dwopt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pep;
    (void)dwopt;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerAddExcludedApplication(void* pwzexename, int32_t ballusers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerAddExcludedApplication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzexename, ballusers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzexename;
    (void)ballusers;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemErrorreportingWerFreeString(void* pwszstr) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerFreeString");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pwszstr);
        return;
    }
    errno = ENOSYS;
#else
    (void)pwszstr;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerGetFlags(void* hprocess, void* pdwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerGetFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, pdwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hprocess;
    (void)pdwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerRegisterAdditionalProcess(uint32_t processid, uint32_t captureextrainfoforthreadid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterAdditionalProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processid, captureextrainfoforthreadid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processid;
    (void)captureextrainfoforthreadid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerRegisterAppLocalDump(void* localappdatarelativepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterAppLocalDump");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(localappdatarelativepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)localappdatarelativepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerRegisterCustomMetadata(void* key, void* value) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterCustomMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)key;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerRegisterExcludedMemoryBlock(void* address, uint32_t size) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterExcludedMemoryBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address, size);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)address;
    (void)size;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerRegisterFile(void* pwzfile, int32_t regfiletype, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzfile, regfiletype, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzfile;
    (void)regfiletype;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerRegisterMemoryBlock(void* pvaddress, uint32_t dwsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterMemoryBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvaddress, dwsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvaddress;
    (void)dwsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerRegisterRuntimeExceptionModule(void* pwszoutofprocesscallbackdll, void* pcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterRuntimeExceptionModule");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszoutofprocesscallbackdll, pcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszoutofprocesscallbackdll;
    (void)pcontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerRemoveExcludedApplication(void* pwzexename, int32_t ballusers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRemoveExcludedApplication");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzexename, ballusers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzexename;
    (void)ballusers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerReportAddDump(void* hreporthandle, void* hprocess, void* hthread, int32_t dumptype, void* pexceptionparam, void* pdumpcustomoptions, uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportAddDump");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreporthandle, hprocess, hthread, dumptype, pexceptionparam, pdumpcustomoptions, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreporthandle;
    (void)hprocess;
    (void)hthread;
    (void)dumptype;
    (void)pexceptionparam;
    (void)pdumpcustomoptions;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerReportAddFile(void* hreporthandle, void* pwzpath, int32_t repfiletype, uint32_t dwfileflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportAddFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreporthandle, pwzpath, repfiletype, dwfileflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreporthandle;
    (void)pwzpath;
    (void)repfiletype;
    (void)dwfileflags;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerReportCloseHandle(void* hreporthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportCloseHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreporthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreporthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerReportCreate(void* pwzeventtype, int32_t reptype, void* preportinformation, void* phreporthandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzeventtype, reptype, preportinformation, phreporthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzeventtype;
    (void)reptype;
    (void)preportinformation;
    (void)phreporthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerReportHang(void* hwndhungapp, void* pwzhungapplicationname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("faultrep.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportHang");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hwndhungapp, pwzhungapplicationname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hwndhungapp;
    (void)pwzhungapplicationname;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerReportSetParameter(void* hreporthandle, uint32_t dwparamid, void* pwzname, void* pwzvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportSetParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreporthandle, dwparamid, pwzname, pwzvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreporthandle;
    (void)dwparamid;
    (void)pwzname;
    (void)pwzvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerReportSetUIOption(void* hreporthandle, int32_t repuitypeid, void* pwzvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportSetUIOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreporthandle, repuitypeid, pwzvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreporthandle;
    (void)repuitypeid;
    (void)pwzvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerReportSubmit(void* hreporthandle, int32_t consent, uint32_t dwflags, void* psubmitresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportSubmit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreporthandle, consent, dwflags, psubmitresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreporthandle;
    (void)consent;
    (void)dwflags;
    (void)psubmitresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerSetFlags(uint32_t dwflags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerSetFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssysWindowsWin32SystemErrorreportingWerStoreClose(void* hreportstore) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreClose");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(hreportstore);
        return;
    }
    errno = ENOSYS;
#else
    (void)hreportstore;
    errno = ENOSYS;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerStoreGetFirstReportKey(void* hreportstore, void* ppszreportkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreGetFirstReportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreportstore, ppszreportkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreportstore;
    (void)ppszreportkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerStoreGetNextReportKey(void* hreportstore, void* ppszreportkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreGetNextReportKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreportstore, ppszreportkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreportstore;
    (void)ppszreportkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerStoreGetReportCount(void* hreportstore, void* pdwreportcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreGetReportCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreportstore, pdwreportcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreportstore;
    (void)pdwreportcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerStoreGetSizeOnDisk(void* hreportstore, void* pqwsizeinbytes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreGetSizeOnDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreportstore, pqwsizeinbytes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreportstore;
    (void)pqwsizeinbytes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerStoreOpen(int32_t repstoretype, void* phreportstore) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreOpen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(repstoretype, phreportstore);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)repstoretype;
    (void)phreportstore;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerStorePurge(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStorePurge");
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

int32_t windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV1(void* hreportstore, void* pszreportkey, void* preportmetadata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreQueryReportMetadataV1");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreportstore, pszreportkey, preportmetadata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreportstore;
    (void)pszreportkey;
    (void)preportmetadata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV2(void* hreportstore, void* pszreportkey, void* preportmetadata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreQueryReportMetadataV2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreportstore, pszreportkey, preportmetadata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreportstore;
    (void)pszreportkey;
    (void)preportmetadata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerStoreQueryReportMetadataV3(void* hreportstore, void* pszreportkey, void* preportmetadata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreQueryReportMetadataV3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreportstore, pszreportkey, preportmetadata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreportstore;
    (void)pszreportkey;
    (void)preportmetadata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerStoreUploadReport(void* hreportstore, void* pszreportkey, uint32_t dwflags, void* psubmitresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreUploadReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreportstore, pszreportkey, dwflags, psubmitresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreportstore;
    (void)pszreportkey;
    (void)dwflags;
    (void)psubmitresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerUnregisterAdditionalProcess(uint32_t processid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterAdditionalProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)processid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerUnregisterAppLocalDump(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterAppLocalDump");
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

int32_t windowssysWindowsWin32SystemErrorreportingWerUnregisterCustomMetadata(void* key) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterCustomMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)key;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerUnregisterExcludedMemoryBlock(void* address) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterExcludedMemoryBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(address);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)address;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerUnregisterFile(void* pwzfilepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwzfilepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwzfilepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerUnregisterMemoryBlock(void* pvaddress) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterMemoryBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pvaddress);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pvaddress;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemErrorreportingWerUnregisterRuntimeExceptionModule(void* pwszoutofprocesscallbackdll, void* pcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterRuntimeExceptionModule");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszoutofprocesscallbackdll, pcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszoutofprocesscallbackdll;
    (void)pcontext;
    errno = ENOSYS;
    return -1;
#endif
}

