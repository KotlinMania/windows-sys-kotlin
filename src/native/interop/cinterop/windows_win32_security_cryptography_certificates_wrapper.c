#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_cryptography_certificates_wrapper.h"
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

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupClose(void* hbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupClose");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupEnd(void* hbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupFree(void* pv) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(pv);
        return;
    }
    errno = ENOSYS;
#else
    (void)pv;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetBackupLogsW(void* hbc, void* ppwszzbackuplogfiles, void* pcbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupGetBackupLogsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc, ppwszzbackuplogfiles, pcbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    (void)ppwszzbackuplogfiles;
    (void)pcbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDatabaseNamesW(void* hbc, void* ppwszzattachmentinformation, void* pcbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupGetDatabaseNamesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc, ppwszzattachmentinformation, pcbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    (void)ppwszzattachmentinformation;
    (void)pcbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupGetDynamicFileListW(void* hbc, void* ppwszzfilelist, void* pcbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupGetDynamicFileListW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc, ppwszzfilelist, pcbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    (void)ppwszzfilelist;
    (void)pcbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupOpenFileW(void* hbc, void* pwszattachmentname, uint32_t cbreadhintsize, void* plifilesize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupOpenFileW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc, pwszattachmentname, cbreadhintsize, plifilesize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    (void)pwszattachmentname;
    (void)cbreadhintsize;
    (void)plifilesize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupPrepareW(void* pwszservername, uint32_t grbitjet, uint32_t dwbackupflags, void* phbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupPrepareW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszservername, grbitjet, dwbackupflags, phbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszservername;
    (void)grbitjet;
    (void)dwbackupflags;
    (void)phbc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupRead(void* hbc, void* pvbuffer, uint32_t cbbuffer, void* pcbread) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupRead");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc, pvbuffer, cbbuffer, pcbread);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    (void)pvbuffer;
    (void)cbbuffer;
    (void)pcbread;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvBackupTruncateLogs(void* hbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvBackupTruncateLogs");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvIsServerOnlineW(void* pwszservername, void* pfserveronline) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvIsServerOnlineW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszservername, pfserveronline);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszservername;
    (void)pfserveronline;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreEnd(void* hbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreEnd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreGetDatabaseLocationsW(void* hbc, void* ppwszzdatabaselocationlist, void* pcbsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreGetDatabaseLocationsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc, ppwszzdatabaselocationlist, pcbsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    (void)ppwszzdatabaselocationlist;
    (void)pcbsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestorePrepareW(void* pwszservername, uint32_t dwrestoreflags, void* phbc) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestorePrepareW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszservername, dwrestoreflags, phbc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszservername;
    (void)dwrestoreflags;
    (void)phbc;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterComplete(void* hbc, int32_t hrrestorestate) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreRegisterComplete");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc, hrrestorestate);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbc;
    (void)hrrestorestate;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterThroughFile(void* hbc, void* pwszcheckpointfilepath, void* pwszlogpath, void* rgrstmap, int32_t crstmap, void* pwszbackuplogpath, uint32_t genlow, uint32_t genhigh) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreRegisterThroughFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc, pwszcheckpointfilepath, pwszlogpath, rgrstmap, crstmap, pwszbackuplogpath, genlow, genhigh);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvRestoreRegisterW(void* hbc, void* pwszcheckpointfilepath, void* pwszlogpath, void* rgrstmap, int32_t crstmap, void* pwszbackuplogpath, uint32_t genlow, uint32_t genhigh) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvRestoreRegisterW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbc, pwszcheckpointfilepath, pwszlogpath, rgrstmap, crstmap, pwszbackuplogpath, genlow, genhigh);
    }
    errno = ENOSYS;
    return -1;
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
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_CertSrvServerControlW(void* pwszservername, uint32_t dwcontrolflags, void* pcbout, void* ppbout) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certadm.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CertSrvServerControlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwszservername, dwcontrolflags, pcbout, ppbout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pwszservername;
    (void)dwcontrolflags;
    (void)pcbout;
    (void)ppbout;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_PstAcquirePrivateKey(void* pcert) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstAcquirePrivateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcert);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcert;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetCertificateChain(void* pcert, void* ptrustedissuers, void* ppcertchaincontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetCertificateChain");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcert, ptrustedissuers, ppcertchaincontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcert;
    (void)ptrustedissuers;
    (void)ppcertchaincontext;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetCertificates(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, int32_t bisclient, void* pdwcertchaincontextcount, void* ppcertchaincontexts) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetCertificates");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptargetname, ccriteria, rgpcriteria, bisclient, pdwcertchaincontextcount, ppcertchaincontexts);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)bisclient;
    (void)pdwcertchaincontextcount;
    (void)ppcertchaincontexts;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchors(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, void* pptrustedissuers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetTrustAnchors");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptargetname, ccriteria, rgpcriteria, pptrustedissuers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)pptrustedissuers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetTrustAnchorsEx(void* ptargetname, uint32_t ccriteria, void* rgpcriteria, void* pcertcontext, void* pptrustedissuers) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetTrustAnchorsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptargetname, ccriteria, rgpcriteria, pcertcontext, pptrustedissuers);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptargetname;
    (void)ccriteria;
    (void)rgpcriteria;
    (void)pcertcontext;
    (void)pptrustedissuers;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_PstGetUserNameForCertificate(void* pcertcontext, void* username) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstGetUserNameForCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcertcontext, username);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcertcontext;
    (void)username;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_PstMapCertificate(void* pcert, void* ptokeninformationtype, void* pptokeninformation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstMapCertificate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcert, ptokeninformationtype, pptokeninformation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pcert;
    (void)ptokeninformationtype;
    (void)pptokeninformation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_cryptography_certificates_PstValidate(void* ptargetname, int32_t bisclient, void* prequestedissuancepolicy, void* phadditionalcertstore, void* pcert, void* pprovguid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("certpoleng.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PstValidate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ptargetname, bisclient, prequestedissuancepolicy, phadditionalcertstore, pcert, pprovguid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ptargetname;
    (void)bisclient;
    (void)prequestedissuancepolicy;
    (void)phadditionalcertstore;
    (void)pcert;
    (void)pprovguid;
    errno = ENOSYS;
    return -1;
#endif
}

