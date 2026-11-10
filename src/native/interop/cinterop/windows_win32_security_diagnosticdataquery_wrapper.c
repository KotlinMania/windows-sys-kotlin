#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_security_diagnosticdataquery_wrapper.h"
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

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqCancelDiagnosticRecordOperation(void* hsession) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqCancelDiagnosticRecordOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqCloseSession(void* hsession) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqCloseSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqCreateSession(int32_t accesslevel, void* hsession) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqCreateSession");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accesslevel, hsession);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)accesslevel;
    (void)hsession;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqExtractDiagnosticReport(void* hsession, uint32_t reportstoretype, void* reportkey, void* destinationpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqExtractDiagnosticReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, reportstoretype, reportkey, destinationpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)reportstoretype;
    (void)reportkey;
    (void)destinationpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordLocaleTags(void* htagdescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordLocaleTags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htagdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htagdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordPage(void* hrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordPage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducerCategories(void* hcategorydescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordProducerCategories");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcategorydescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcategorydescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticRecordProducers(void* hproducerdescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordProducers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hproducerdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hproducerdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqFreeDiagnosticReport(void* hreport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreport;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticDataAccessLevelAllowed(void* accesslevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticDataAccessLevelAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(accesslevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)accesslevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordAtIndex(void* hrecord, uint32_t arg_1_index, void* record) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordAtIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, arg_1_index, record);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrecord;
    (void)arg_1_index;
    (void)record;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordBinaryDistribution(void* hsession, void* producernames, uint32_t producernamecount, uint32_t topnbinaries, void* binarystats, void* statcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordBinaryDistribution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, producernames, producernamecount, topnbinaries, binarystats, statcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)topnbinaries;
    (void)binarystats;
    (void)statcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryAtIndex(void* hcategorydescription, uint32_t arg_1_index, void* categorydescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCategoryAtIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcategorydescription, arg_1_index, categorydescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcategorydescription;
    (void)arg_1_index;
    (void)categorydescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCategoryCount(void* hcategorydescription, void* categorydescriptioncount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCategoryCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcategorydescription, categorydescriptioncount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcategorydescription;
    (void)categorydescriptioncount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordCount(void* hrecord, void* recordcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrecord, recordcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hrecord;
    (void)recordcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagAtIndex(void* htagdescription, uint32_t arg_1_index, void* tagdescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTagAtIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htagdescription, arg_1_index, tagdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htagdescription;
    (void)arg_1_index;
    (void)tagdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTagCount(void* htagdescription, void* tagdescriptioncount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTagCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htagdescription, tagdescriptioncount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)htagdescription;
    (void)tagdescriptioncount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordLocaleTags(void* hsession, void* locale, void* htagdescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, locale, htagdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)locale;
    (void)htagdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPage(void* hsession, void* searchcriteria, uint32_t offset, uint32_t pagerecordcount, int64_t baserowid, void* hrecord) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordPage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, searchcriteria, offset, pagerecordcount, baserowid, hrecord);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)searchcriteria;
    (void)offset;
    (void)pagerecordcount;
    (void)baserowid;
    (void)hrecord;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordPayload(void* hsession, int64_t rowid, void* payload) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordPayload");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, rowid, payload);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)rowid;
    (void)payload;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerAtIndex(void* hproducerdescription, uint32_t arg_1_index, void* producerdescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerAtIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hproducerdescription, arg_1_index, producerdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hproducerdescription;
    (void)arg_1_index;
    (void)producerdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCategories(void* hsession, void* producername, void* hcategorydescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerCategories");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, producername, hcategorydescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)producername;
    (void)hcategorydescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducerCount(void* hproducerdescription, void* producerdescriptioncount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hproducerdescription, producerdescriptioncount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hproducerdescription;
    (void)producerdescriptioncount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordProducers(void* hsession, void* hproducerdescription) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, hproducerdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)hproducerdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordStats(void* hsession, void* searchcriteria, void* recordcount, void* minrowid, void* maxrowid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordStats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, searchcriteria, recordcount, minrowid, maxrowid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)searchcriteria;
    (void)recordcount;
    (void)minrowid;
    (void)maxrowid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordSummary(void* hsession, void* producernames, uint32_t producernamecount, void* generalstats) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordSummary");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, producernames, producernamecount, generalstats);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)generalstats;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticRecordTagDistribution(void* hsession, void* producernames, uint32_t producernamecount, void* tagstats, void* statcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordTagDistribution");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, producernames, producernamecount, tagstats, statcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)tagstats;
    (void)statcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReport(void* hsession, uint32_t reportstoretype, void* hreport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, reportstoretype, hreport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)reportstoretype;
    (void)hreport;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportAtIndex(void* hreport, uint32_t arg_1_index, void* report) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReportAtIndex");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreport, arg_1_index, report);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreport;
    (void)arg_1_index;
    (void)report;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportCount(void* hreport, void* reportcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReportCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hreport, reportcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hreport;
    (void)reportcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetDiagnosticReportStoreReportCount(void* hsession, uint32_t reportstoretype, void* reportcount) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReportStoreReportCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, reportstoretype, reportcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)reportstoretype;
    (void)reportcount;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetSessionAccessLevel(void* hsession, void* accesslevel) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetSessionAccessLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, accesslevel);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)accesslevel;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqGetTranscriptConfiguration(void* hsession, void* currentconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetTranscriptConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, currentconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)currentconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqIsDiagnosticRecordSampledIn(void* hsession, void* providergroup, void* providerid, void* providername, void* eventid, void* eventname, void* eventversion, void* eventkeywords, void* issampledin) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqIsDiagnosticRecordSampledIn");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, providergroup, providerid, providername, eventid, eventname, eventversion, eventkeywords, issampledin);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)providergroup;
    (void)providerid;
    (void)providername;
    (void)eventid;
    (void)eventname;
    (void)eventversion;
    (void)eventkeywords;
    (void)issampledin;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_security_diagnosticdataquery_ddqSetTranscriptConfiguration(void* hsession, void* desiredconfig) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqSetTranscriptConfiguration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hsession, desiredconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hsession;
    (void)desiredconfig;
    errno = ENOSYS;
    return -1;
#endif
}

