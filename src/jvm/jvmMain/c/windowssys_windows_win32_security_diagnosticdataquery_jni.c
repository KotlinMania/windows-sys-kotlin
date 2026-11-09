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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqCancelDiagnosticRecordOperation(JNIEnv* km_env, jclass km_clazz, jlong hsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqCancelDiagnosticRecordOperation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession) : -1;
#else
    (void)hsession;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqCloseSession(JNIEnv* km_env, jclass km_clazz, jlong hsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqCloseSession");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession) : -1;
#else
    (void)hsession;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqCreateSession(JNIEnv* km_env, jclass km_clazz, jint accesslevel, jlong hsession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqCreateSession");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)accesslevel, (void*)(uintptr_t)hsession) : -1;
#else
    (void)accesslevel;
    (void)hsession;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqExtractDiagnosticReport(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint reportstoretype, jlong reportkey, jlong destinationpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqExtractDiagnosticReport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)reportstoretype, (void*)(uintptr_t)reportkey, (void*)(uintptr_t)destinationpath) : -1;
#else
    (void)hsession;
    (void)reportstoretype;
    (void)reportkey;
    (void)destinationpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqFreeDiagnosticRecordLocaleTags(JNIEnv* km_env, jclass km_clazz, jlong htagdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordLocaleTags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htagdescription) : -1;
#else
    (void)htagdescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqFreeDiagnosticRecordPage(JNIEnv* km_env, jclass km_clazz, jlong hrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordPage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrecord) : -1;
#else
    (void)hrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqFreeDiagnosticRecordProducerCategories(JNIEnv* km_env, jclass km_clazz, jlong hcategorydescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordProducerCategories");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcategorydescription) : -1;
#else
    (void)hcategorydescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqFreeDiagnosticRecordProducers(JNIEnv* km_env, jclass km_clazz, jlong hproducerdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticRecordProducers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hproducerdescription) : -1;
#else
    (void)hproducerdescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqFreeDiagnosticReport(JNIEnv* km_env, jclass km_clazz, jlong hreport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqFreeDiagnosticReport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreport) : -1;
#else
    (void)hreport;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticDataAccessLevelAllowed(JNIEnv* km_env, jclass km_clazz, jlong accesslevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticDataAccessLevelAllowed");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)accesslevel) : -1;
#else
    (void)accesslevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordAtIndex(JNIEnv* km_env, jclass km_clazz, jlong hrecord, jint arg_1_index, jlong record) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordAtIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrecord, (uint32_t)arg_1_index, (void*)(uintptr_t)record) : -1;
#else
    (void)hrecord;
    (void)arg_1_index;
    (void)record;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordBinaryDistribution(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong producernames, jint producernamecount, jint topnbinaries, jlong binarystats, jlong statcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordBinaryDistribution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)producernames, (uint32_t)producernamecount, (uint32_t)topnbinaries, (void*)(uintptr_t)binarystats, (void*)(uintptr_t)statcount) : -1;
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)topnbinaries;
    (void)binarystats;
    (void)statcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordCategoryAtIndex(JNIEnv* km_env, jclass km_clazz, jlong hcategorydescription, jint arg_1_index, jlong categorydescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCategoryAtIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcategorydescription, (uint32_t)arg_1_index, (void*)(uintptr_t)categorydescription) : -1;
#else
    (void)hcategorydescription;
    (void)arg_1_index;
    (void)categorydescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordCategoryCount(JNIEnv* km_env, jclass km_clazz, jlong hcategorydescription, jlong categorydescriptioncount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCategoryCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hcategorydescription, (void*)(uintptr_t)categorydescriptioncount) : -1;
#else
    (void)hcategorydescription;
    (void)categorydescriptioncount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordCount(JNIEnv* km_env, jclass km_clazz, jlong hrecord, jlong recordcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hrecord, (void*)(uintptr_t)recordcount) : -1;
#else
    (void)hrecord;
    (void)recordcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordLocaleTagAtIndex(JNIEnv* km_env, jclass km_clazz, jlong htagdescription, jint arg_1_index, jlong tagdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTagAtIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htagdescription, (uint32_t)arg_1_index, (void*)(uintptr_t)tagdescription) : -1;
#else
    (void)htagdescription;
    (void)arg_1_index;
    (void)tagdescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordLocaleTagCount(JNIEnv* km_env, jclass km_clazz, jlong htagdescription, jlong tagdescriptioncount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTagCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)htagdescription, (void*)(uintptr_t)tagdescriptioncount) : -1;
#else
    (void)htagdescription;
    (void)tagdescriptioncount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordLocaleTags(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong locale, jlong htagdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordLocaleTags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)locale, (void*)(uintptr_t)htagdescription) : -1;
#else
    (void)hsession;
    (void)locale;
    (void)htagdescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordPage(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong searchcriteria, jint offset, jint pagerecordcount, jlong baserowid, jlong hrecord) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordPage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)searchcriteria, (uint32_t)offset, (uint32_t)pagerecordcount, (int64_t)baserowid, (void*)(uintptr_t)hrecord) : -1;
#else
    (void)hsession;
    (void)searchcriteria;
    (void)offset;
    (void)pagerecordcount;
    (void)baserowid;
    (void)hrecord;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordPayload(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong rowid, jlong payload) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordPayload");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (int64_t)rowid, (void*)(uintptr_t)payload) : -1;
#else
    (void)hsession;
    (void)rowid;
    (void)payload;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordProducerAtIndex(JNIEnv* km_env, jclass km_clazz, jlong hproducerdescription, jint arg_1_index, jlong producerdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerAtIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hproducerdescription, (uint32_t)arg_1_index, (void*)(uintptr_t)producerdescription) : -1;
#else
    (void)hproducerdescription;
    (void)arg_1_index;
    (void)producerdescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordProducerCategories(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong producername, jlong hcategorydescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerCategories");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)producername, (void*)(uintptr_t)hcategorydescription) : -1;
#else
    (void)hsession;
    (void)producername;
    (void)hcategorydescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordProducerCount(JNIEnv* km_env, jclass km_clazz, jlong hproducerdescription, jlong producerdescriptioncount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducerCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hproducerdescription, (void*)(uintptr_t)producerdescriptioncount) : -1;
#else
    (void)hproducerdescription;
    (void)producerdescriptioncount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordProducers(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong hproducerdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordProducers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)hproducerdescription) : -1;
#else
    (void)hsession;
    (void)hproducerdescription;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordStats(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong searchcriteria, jlong recordcount, jlong minrowid, jlong maxrowid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordStats");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)searchcriteria, (void*)(uintptr_t)recordcount, (void*)(uintptr_t)minrowid, (void*)(uintptr_t)maxrowid) : -1;
#else
    (void)hsession;
    (void)searchcriteria;
    (void)recordcount;
    (void)minrowid;
    (void)maxrowid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordSummary(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong producernames, jint producernamecount, jlong generalstats) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordSummary");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)producernames, (uint32_t)producernamecount, (void*)(uintptr_t)generalstats) : -1;
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)generalstats;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticRecordTagDistribution(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong producernames, jint producernamecount, jlong tagstats, jlong statcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticRecordTagDistribution");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)producernames, (uint32_t)producernamecount, (void*)(uintptr_t)tagstats, (void*)(uintptr_t)statcount) : -1;
#else
    (void)hsession;
    (void)producernames;
    (void)producernamecount;
    (void)tagstats;
    (void)statcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticReport(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint reportstoretype, jlong hreport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)reportstoretype, (void*)(uintptr_t)hreport) : -1;
#else
    (void)hsession;
    (void)reportstoretype;
    (void)hreport;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticReportAtIndex(JNIEnv* km_env, jclass km_clazz, jlong hreport, jint arg_1_index, jlong report) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReportAtIndex");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreport, (uint32_t)arg_1_index, (void*)(uintptr_t)report) : -1;
#else
    (void)hreport;
    (void)arg_1_index;
    (void)report;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticReportCount(JNIEnv* km_env, jclass km_clazz, jlong hreport, jlong reportcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReportCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreport, (void*)(uintptr_t)reportcount) : -1;
#else
    (void)hreport;
    (void)reportcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetDiagnosticReportStoreReportCount(JNIEnv* km_env, jclass km_clazz, jlong hsession, jint reportstoretype, jlong reportcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetDiagnosticReportStoreReportCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (uint32_t)reportstoretype, (void*)(uintptr_t)reportcount) : -1;
#else
    (void)hsession;
    (void)reportstoretype;
    (void)reportcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetSessionAccessLevel(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong accesslevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetSessionAccessLevel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)accesslevel) : -1;
#else
    (void)hsession;
    (void)accesslevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqGetTranscriptConfiguration(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong currentconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqGetTranscriptConfiguration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)currentconfig) : -1;
#else
    (void)hsession;
    (void)currentconfig;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqIsDiagnosticRecordSampledIn(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong providergroup, jlong providerid, jlong providername, jlong eventid, jlong eventname, jlong eventversion, jlong eventkeywords, jlong issampledin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqIsDiagnosticRecordSampledIn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)providergroup, (void*)(uintptr_t)providerid, (void*)(uintptr_t)providername, (void*)(uintptr_t)eventid, (void*)(uintptr_t)eventname, (void*)(uintptr_t)eventversion, (void*)(uintptr_t)eventkeywords, (void*)(uintptr_t)issampledin) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_security_diagnosticdataquery_WindowsWin32SecurityDiagnosticdataqueryJniBridge_windowssys_1windows_1win32_1security_1diagnosticdataquery_1DdqSetTranscriptConfiguration(JNIEnv* km_env, jclass km_clazz, jlong hsession, jlong desiredconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("diagnosticdataquery.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DdqSetTranscriptConfiguration");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hsession, (void*)(uintptr_t)desiredconfig) : -1;
#else
    (void)hsession;
    (void)desiredconfig;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

