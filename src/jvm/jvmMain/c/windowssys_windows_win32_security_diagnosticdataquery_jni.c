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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCancelDiagnosticRecordOperation(JNIEnv* km_env, jclass km_clazz, jlong hsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqCancelDiagnosticRecordOperation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCloseSession(JNIEnv* km_env, jclass km_clazz, jlong hsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqCloseSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqCreateSession(JNIEnv* km_env, jclass km_clazz, jint accesslevel, jlong hsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqCreateSession");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)accesslevel, (void*)(uintptr_t)hsession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)accesslevel;
    (void)hsession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqExtractDiagnosticReport(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint reportstoretype, jlong reportkey, jlong destinationpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqExtractDiagnosticReport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)reportstoretype, (void*)(uintptr_t)reportkey, (void*)(uintptr_t)destinationpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)reportstoretype;
    (void)reportkey;
    (void)destinationpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordLocaleTags(JNIEnv* km_env, jclass km_clazz, jlong htagdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordLocaleTags");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htagdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htagdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordPage(JNIEnv* km_env, jclass km_clazz, jlong hrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordPage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducerCategories(JNIEnv* km_env, jclass km_clazz, jlong hcategorydescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordProducerCategories");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcategorydescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcategorydescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticRecordProducers(JNIEnv* km_env, jclass km_clazz, jlong hproducerdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordProducers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hproducerdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hproducerdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqFreeDiagnosticReport(JNIEnv* km_env, jclass km_clazz, jlong hreport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticReport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hreport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hreport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticDataAccessLevelAllowed(JNIEnv* km_env, jclass km_clazz, jlong accesslevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticDataAccessLevelAllowed");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)accesslevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)accesslevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordAtIndex(JNIEnv* km_env, jclass km_clazz, jlong hrecord, jint arg1Index, jlong record) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordAtIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrecord, (uint32_t)arg1Index, (void*)(uintptr_t)record);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecord;
    (void)arg1Index;
    (void)record;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordBinaryDistribution(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong producernames, jint producernamecount, jint topnbinaries, jlong binarystats, jlong statcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordBinaryDistribution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)producernames, (uint32_t)producernamecount, (uint32_t)topnbinaries, (void*)(uintptr_t)binarystats, (void*)(uintptr_t)statcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)topnbinaries;
    (void)binarystats;
    (void)statcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryAtIndex(JNIEnv* km_env, jclass km_clazz, jlong hcategorydescription, jint arg1Index, jlong categorydescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCategoryAtIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcategorydescription, (uint32_t)arg1Index, (void*)(uintptr_t)categorydescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcategorydescription;
    (void)arg1Index;
    (void)categorydescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCategoryCount(JNIEnv* km_env, jclass km_clazz, jlong hcategorydescription, jlong categorydescriptioncount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCategoryCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcategorydescription, (void*)(uintptr_t)categorydescriptioncount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcategorydescription;
    (void)categorydescriptioncount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordCount(JNIEnv* km_env, jclass km_clazz, jlong hrecord, jlong recordcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hrecord, (void*)(uintptr_t)recordcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hrecord;
    (void)recordcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagAtIndex(JNIEnv* km_env, jclass km_clazz, jlong htagdescription, jint arg1Index, jlong tagdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTagAtIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htagdescription, (uint32_t)arg1Index, (void*)(uintptr_t)tagdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htagdescription;
    (void)arg1Index;
    (void)tagdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTagCount(JNIEnv* km_env, jclass km_clazz, jlong htagdescription, jlong tagdescriptioncount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTagCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htagdescription, (void*)(uintptr_t)tagdescriptioncount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htagdescription;
    (void)tagdescriptioncount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordLocaleTags(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong locale, jlong htagdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTags");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)locale, (void*)(uintptr_t)htagdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)locale;
    (void)htagdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPage(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong searchcriteria, jint offset, jint pagerecordcount, jlong baserowid, jlong hrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordPage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)searchcriteria, (uint32_t)offset, (uint32_t)pagerecordcount, (int64_t)baserowid, (void*)(uintptr_t)hrecord);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)searchcriteria;
    (void)offset;
    (void)pagerecordcount;
    (void)baserowid;
    (void)hrecord;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordPayload(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong rowid, jlong payload) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordPayload");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (int64_t)rowid, (void*)(uintptr_t)payload);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)rowid;
    (void)payload;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerAtIndex(JNIEnv* km_env, jclass km_clazz, jlong hproducerdescription, jint arg1Index, jlong producerdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerAtIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hproducerdescription, (uint32_t)arg1Index, (void*)(uintptr_t)producerdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hproducerdescription;
    (void)arg1Index;
    (void)producerdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCategories(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong producername, jlong hcategorydescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerCategories");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)producername, (void*)(uintptr_t)hcategorydescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)producername;
    (void)hcategorydescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducerCount(JNIEnv* km_env, jclass km_clazz, jlong hproducerdescription, jlong producerdescriptioncount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hproducerdescription, (void*)(uintptr_t)producerdescriptioncount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hproducerdescription;
    (void)producerdescriptioncount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordProducers(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong hproducerdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducers");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)hproducerdescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)hproducerdescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordStats(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong searchcriteria, jlong recordcount, jlong minrowid, jlong maxrowid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordStats");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)searchcriteria, (void*)(uintptr_t)recordcount, (void*)(uintptr_t)minrowid, (void*)(uintptr_t)maxrowid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)searchcriteria;
    (void)recordcount;
    (void)minrowid;
    (void)maxrowid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordSummary(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong producernames, jint producernamecount, jlong generalstats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordSummary");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)producernames, (uint32_t)producernamecount, (void*)(uintptr_t)generalstats);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)generalstats;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticRecordTagDistribution(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong producernames, jint producernamecount, jlong tagstats, jlong statcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordTagDistribution");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)producernames, (uint32_t)producernamecount, (void*)(uintptr_t)tagstats, (void*)(uintptr_t)statcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)tagstats;
    (void)statcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReport(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint reportstoretype, jlong hreport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReport");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)reportstoretype, (void*)(uintptr_t)hreport);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)reportstoretype;
    (void)hreport;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportAtIndex(JNIEnv* km_env, jclass km_clazz, jlong hreport, jint arg1Index, jlong report) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReportAtIndex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hreport, (uint32_t)arg1Index, (void*)(uintptr_t)report);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hreport;
    (void)arg1Index;
    (void)report;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportCount(JNIEnv* km_env, jclass km_clazz, jlong hreport, jlong reportcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReportCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hreport, (void*)(uintptr_t)reportcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hreport;
    (void)reportcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetDiagnosticReportStoreReportCount(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint reportstoretype, jlong reportcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReportStoreReportCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)reportstoretype, (void*)(uintptr_t)reportcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)reportstoretype;
    (void)reportcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetSessionAccessLevel(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong accesslevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetSessionAccessLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)accesslevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)accesslevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqGetTranscriptConfiguration(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong currentconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetTranscriptConfiguration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)currentconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)currentconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqIsDiagnosticRecordSampledIn(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong providergroup, jlong providerid, jlong providername, jlong eventid, jlong eventname, jlong eventversion, jlong eventkeywords, jlong issampledin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqIsDiagnosticRecordSampledIn");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)providergroup, (void*)(uintptr_t)providerid, (void*)(uintptr_t)providername, (void*)(uintptr_t)eventid, (void*)(uintptr_t)eventname, (void*)(uintptr_t)eventversion, (void*)(uintptr_t)eventkeywords, (void*)(uintptr_t)issampledin);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssysWindowsWin32SecurityDiagnosticdataqueryDdqSetTranscriptConfiguration(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong desiredconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqSetTranscriptConfiguration");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)desiredconfig);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsession;
    (void)desiredconfig;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

