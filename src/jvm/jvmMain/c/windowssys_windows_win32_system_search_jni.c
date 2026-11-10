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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1oDBCGetTryWaitValue(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ODBCGetTryWaitValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1oDBCSetTryWaitValue(JNIEnv* km_env, jclass km_clazz, jint dwvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ODBCSetTryWaitValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwvalue) : -1;
#else
    (void)dwvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLAllocConnect(JNIEnv* km_env, jclass km_clazz, jlong environmenthandle, jlong connectionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocConnect");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)environmenthandle, (void*)(uintptr_t)connectionhandle) : -1;
#else
    (void)environmenthandle;
    (void)connectionhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLAllocEnv(JNIEnv* km_env, jclass km_clazz, jlong environmenthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocEnv");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)environmenthandle) : -1;
#else
    (void)environmenthandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLAllocHandle(JNIEnv* km_env, jclass km_clazz, jshort handletype, jlong inputhandle, jlong outputhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocHandle");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)handletype, (void*)(uintptr_t)inputhandle, (void*)(uintptr_t)outputhandle) : -1;
#else
    (void)handletype;
    (void)inputhandle;
    (void)outputhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLAllocHandleStd(JNIEnv* km_env, jclass km_clazz, jshort fhandletype, jlong hinput, jlong phoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocHandleStd");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)fhandletype, (void*)(uintptr_t)hinput, (void*)(uintptr_t)phoutput) : -1;
#else
    (void)fhandletype;
    (void)hinput;
    (void)phoutput;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLAllocStmt(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jlong statementhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocStmt");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (void*)(uintptr_t)statementhandle) : -1;
#else
    (void)connectionhandle;
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLBindCol(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort columnnumber, jshort targettype, jlong targetvalue, jlong bufferlength, jlong strlen_or_ind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBindCol");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)columnnumber, (int16_t)targettype, (void*)(uintptr_t)targetvalue, (int64_t)bufferlength, (void*)(uintptr_t)strlen_or_ind) : -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)targettype;
    (void)targetvalue;
    (void)bufferlength;
    (void)strlen_or_ind;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLBindParam(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort parameternumber, jshort valuetype, jshort parametertype, jlong lengthprecision, jshort parameterscale, jlong parametervalue, jlong strlen_or_ind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, uint64_t, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBindParam");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)parameternumber, (int16_t)valuetype, (int16_t)parametertype, (uint64_t)lengthprecision, (int16_t)parameterscale, (void*)(uintptr_t)parametervalue, (void*)(uintptr_t)strlen_or_ind) : -1;
#else
    (void)statementhandle;
    (void)parameternumber;
    (void)valuetype;
    (void)parametertype;
    (void)lengthprecision;
    (void)parameterscale;
    (void)parametervalue;
    (void)strlen_or_ind;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLBindParameter(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort ipar, jshort fparamtype, jshort fctype, jshort fsqltype, jlong cbcoldef, jshort ibscale, jlong rgbvalue, jlong cbvaluemax, jlong pcbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, int16_t, uint64_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBindParameter");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)ipar, (int16_t)fparamtype, (int16_t)fctype, (int16_t)fsqltype, (uint64_t)cbcoldef, (int16_t)ibscale, (void*)(uintptr_t)rgbvalue, (int64_t)cbvaluemax, (void*)(uintptr_t)pcbvalue) : -1;
#else
    (void)hstmt;
    (void)ipar;
    (void)fparamtype;
    (void)fctype;
    (void)fsqltype;
    (void)cbcoldef;
    (void)ibscale;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLBrowseConnect(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong szconnstrin, jshort cchconnstrin, jlong szconnstrout, jshort cchconnstroutmax, jlong pcchconnstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBrowseConnect");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (void*)(uintptr_t)szconnstrin, (int16_t)cchconnstrin, (void*)(uintptr_t)szconnstrout, (int16_t)cchconnstroutmax, (void*)(uintptr_t)pcchconnstrout) : -1;
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLBrowseConnectA(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong szconnstrin, jshort cbconnstrin, jlong szconnstrout, jshort cbconnstroutmax, jlong pcbconnstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBrowseConnectA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (void*)(uintptr_t)szconnstrin, (int16_t)cbconnstrin, (void*)(uintptr_t)szconnstrout, (int16_t)cbconnstroutmax, (void*)(uintptr_t)pcbconnstrout) : -1;
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cbconnstrin;
    (void)szconnstrout;
    (void)cbconnstroutmax;
    (void)pcbconnstrout;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLBrowseConnectW(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong szconnstrin, jshort cchconnstrin, jlong szconnstrout, jshort cchconnstroutmax, jlong pcchconnstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBrowseConnectW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (void*)(uintptr_t)szconnstrin, (int16_t)cchconnstrin, (void*)(uintptr_t)szconnstrout, (int16_t)cchconnstroutmax, (void*)(uintptr_t)pcchconnstrout) : -1;
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLBulkOperations(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort operation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBulkOperations");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (int16_t)operation) : -1;
#else
    (void)statementhandle;
    (void)operation;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLCancel(JNIEnv* km_env, jclass km_clazz, jlong statementhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCancel");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle) : -1;
#else
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLCancelHandle(JNIEnv* km_env, jclass km_clazz, jshort handletype, jlong inputhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCancelHandle");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)handletype, (void*)(uintptr_t)inputhandle) : -1;
#else
    (void)handletype;
    (void)inputhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLCloseCursor(JNIEnv* km_env, jclass km_clazz, jlong statementhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCloseCursor");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle) : -1;
#else
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLCloseEnumServers(JNIEnv* km_env, jclass km_clazz, jlong henumhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCloseEnumServers");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henumhandle) : -1;
#else
    (void)henumhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColAttribute(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort columnnumber, jshort fieldidentifier, jlong characterattribute, jshort bufferlength, jlong stringlength, jlong numericattribute) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttribute");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)columnnumber, (uint16_t)fieldidentifier, (void*)(uintptr_t)characterattribute, (int16_t)bufferlength, (void*)(uintptr_t)stringlength, (void*)(uintptr_t)numericattribute) : -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)fieldidentifier;
    (void)characterattribute;
    (void)bufferlength;
    (void)stringlength;
    (void)numericattribute;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColAttributeA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort icol, jshort ifield, jlong pcharattr, jshort cbcharattrmax, jlong pcbcharattr, jlong pnumattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributeA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (int16_t)icol, (int16_t)ifield, (void*)(uintptr_t)pcharattr, (int16_t)cbcharattrmax, (void*)(uintptr_t)pcbcharattr, (void*)(uintptr_t)pnumattr) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)ifield;
    (void)pcharattr;
    (void)cbcharattrmax;
    (void)pcbcharattr;
    (void)pnumattr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColAttributeW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort icol, jshort ifield, jlong pcharattr, jshort cbdescmax, jlong pcbcharattr, jlong pnumattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributeW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)icol, (uint16_t)ifield, (void*)(uintptr_t)pcharattr, (int16_t)cbdescmax, (void*)(uintptr_t)pcbcharattr, (void*)(uintptr_t)pnumattr) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)ifield;
    (void)pcharattr;
    (void)cbdescmax;
    (void)pcbcharattr;
    (void)pnumattr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColAttributes(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort icol, jshort fdesctype, jlong rgbdesc, jshort cbdescmax, jlong pcbdesc, jlong pfdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributes");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)icol, (uint16_t)fdesctype, (void*)(uintptr_t)rgbdesc, (int16_t)cbdescmax, (void*)(uintptr_t)pcbdesc, (void*)(uintptr_t)pfdesc) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColAttributesA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort icol, jshort fdesctype, jlong rgbdesc, jshort cbdescmax, jlong pcbdesc, jlong pfdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributesA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)icol, (uint16_t)fdesctype, (void*)(uintptr_t)rgbdesc, (int16_t)cbdescmax, (void*)(uintptr_t)pcbdesc, (void*)(uintptr_t)pfdesc) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColAttributesW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort icol, jshort fdesctype, jlong rgbdesc, jshort cbdescmax, jlong pcbdesc, jlong pfdesc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributesW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)icol, (uint16_t)fdesctype, (void*)(uintptr_t)rgbdesc, (int16_t)cbdescmax, (void*)(uintptr_t)pcbdesc, (void*)(uintptr_t)pfdesc) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColumnPrivileges(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename, jlong szcolumnname, jshort cchcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnPrivileges");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename, (void*)(uintptr_t)szcolumnname, (int16_t)cchcolumnname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)szcolumnname;
    (void)cchcolumnname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColumnPrivilegesA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cbcatalogname, jlong szschemaname, jshort cbschemaname, jlong sztablename, jshort cbtablename, jlong szcolumnname, jshort cbcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnPrivilegesA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cbcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cbschemaname, (void*)(uintptr_t)sztablename, (int16_t)cbtablename, (void*)(uintptr_t)szcolumnname, (int16_t)cbcolumnname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)szcolumnname;
    (void)cbcolumnname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColumnPrivilegesW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename, jlong szcolumnname, jshort cchcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnPrivilegesW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename, (void*)(uintptr_t)szcolumnname, (int16_t)cchcolumnname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)szcolumnname;
    (void)cchcolumnname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColumns(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong catalogname, jshort namelength1, jlong schemaname, jshort namelength2, jlong tablename, jshort namelength3, jlong columnname, jshort namelength4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumns");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)catalogname, (int16_t)namelength1, (void*)(uintptr_t)schemaname, (int16_t)namelength2, (void*)(uintptr_t)tablename, (int16_t)namelength3, (void*)(uintptr_t)columnname, (int16_t)namelength4) : -1;
#else
    (void)statementhandle;
    (void)catalogname;
    (void)namelength1;
    (void)schemaname;
    (void)namelength2;
    (void)tablename;
    (void)namelength3;
    (void)columnname;
    (void)namelength4;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColumnsA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cbcatalogname, jlong szschemaname, jshort cbschemaname, jlong sztablename, jshort cbtablename, jlong szcolumnname, jshort cbcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnsA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cbcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cbschemaname, (void*)(uintptr_t)sztablename, (int16_t)cbtablename, (void*)(uintptr_t)szcolumnname, (int16_t)cbcolumnname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)szcolumnname;
    (void)cbcolumnname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLColumnsW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename, jlong szcolumnname, jshort cchcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnsW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename, (void*)(uintptr_t)szcolumnname, (int16_t)cchcolumnname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)szcolumnname;
    (void)cchcolumnname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLCompleteAsync(JNIEnv* km_env, jclass km_clazz, jshort handletype, jlong handle, jlong asyncretcodeptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCompleteAsync");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)handletype, (void*)(uintptr_t)handle, (void*)(uintptr_t)asyncretcodeptr) : -1;
#else
    (void)handletype;
    (void)handle;
    (void)asyncretcodeptr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLConnect(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jlong servername, jshort namelength1, jlong username, jshort namelength2, jlong authentication, jshort namelength3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLConnect");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (void*)(uintptr_t)servername, (int16_t)namelength1, (void*)(uintptr_t)username, (int16_t)namelength2, (void*)(uintptr_t)authentication, (int16_t)namelength3) : -1;
#else
    (void)connectionhandle;
    (void)servername;
    (void)namelength1;
    (void)username;
    (void)namelength2;
    (void)authentication;
    (void)namelength3;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLConnectA(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong szdsn, jshort cbdsn, jlong szuid, jshort cbuid, jlong szauthstr, jshort cbauthstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLConnectA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (void*)(uintptr_t)szdsn, (int16_t)cbdsn, (void*)(uintptr_t)szuid, (int16_t)cbuid, (void*)(uintptr_t)szauthstr, (int16_t)cbauthstr) : -1;
#else
    (void)hdbc;
    (void)szdsn;
    (void)cbdsn;
    (void)szuid;
    (void)cbuid;
    (void)szauthstr;
    (void)cbauthstr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLConnectW(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong szdsn, jshort cchdsn, jlong szuid, jshort cchuid, jlong szauthstr, jshort cchauthstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLConnectW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (void*)(uintptr_t)szdsn, (int16_t)cchdsn, (void*)(uintptr_t)szuid, (int16_t)cchuid, (void*)(uintptr_t)szauthstr, (int16_t)cchauthstr) : -1;
#else
    (void)hdbc;
    (void)szdsn;
    (void)cchdsn;
    (void)szuid;
    (void)cchuid;
    (void)szauthstr;
    (void)cchauthstr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLCopyDesc(JNIEnv* km_env, jclass km_clazz, jlong sourcedeschandle, jlong targetdeschandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCopyDesc");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcedeschandle, (void*)(uintptr_t)targetdeschandle) : -1;
#else
    (void)sourcedeschandle;
    (void)targetdeschandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDataSources(JNIEnv* km_env, jclass km_clazz, jlong environmenthandle, jshort direction, jlong servername, jshort bufferlength1, jlong namelength1ptr, jlong description, jshort bufferlength2, jlong namelength2ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDataSources");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)environmenthandle, (uint16_t)direction, (void*)(uintptr_t)servername, (int16_t)bufferlength1, (void*)(uintptr_t)namelength1ptr, (void*)(uintptr_t)description, (int16_t)bufferlength2, (void*)(uintptr_t)namelength2ptr) : -1;
#else
    (void)environmenthandle;
    (void)direction;
    (void)servername;
    (void)bufferlength1;
    (void)namelength1ptr;
    (void)description;
    (void)bufferlength2;
    (void)namelength2ptr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDataSourcesA(JNIEnv* km_env, jclass km_clazz, jlong henv, jshort fdirection, jlong szdsn, jshort cbdsnmax, jlong pcbdsn, jlong szdescription, jshort cbdescriptionmax, jlong pcbdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDataSourcesA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henv, (uint16_t)fdirection, (void*)(uintptr_t)szdsn, (int16_t)cbdsnmax, (void*)(uintptr_t)pcbdsn, (void*)(uintptr_t)szdescription, (int16_t)cbdescriptionmax, (void*)(uintptr_t)pcbdescription) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdsn;
    (void)cbdsnmax;
    (void)pcbdsn;
    (void)szdescription;
    (void)cbdescriptionmax;
    (void)pcbdescription;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDataSourcesW(JNIEnv* km_env, jclass km_clazz, jlong henv, jshort fdirection, jlong szdsn, jshort cchdsnmax, jlong pcchdsn, jlong wszdescription, jshort cchdescriptionmax, jlong pcchdescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDataSourcesW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henv, (uint16_t)fdirection, (void*)(uintptr_t)szdsn, (int16_t)cchdsnmax, (void*)(uintptr_t)pcchdsn, (void*)(uintptr_t)wszdescription, (int16_t)cchdescriptionmax, (void*)(uintptr_t)pcchdescription) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdsn;
    (void)cchdsnmax;
    (void)pcchdsn;
    (void)wszdescription;
    (void)cchdescriptionmax;
    (void)pcchdescription;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDescribeCol(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort columnnumber, jlong columnname, jshort bufferlength, jlong namelength, jlong datatype, jlong columnsize, jlong decimaldigits, jlong nullable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDescribeCol");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)columnnumber, (void*)(uintptr_t)columnname, (int16_t)bufferlength, (void*)(uintptr_t)namelength, (void*)(uintptr_t)datatype, (void*)(uintptr_t)columnsize, (void*)(uintptr_t)decimaldigits, (void*)(uintptr_t)nullable) : -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)columnname;
    (void)bufferlength;
    (void)namelength;
    (void)datatype;
    (void)columnsize;
    (void)decimaldigits;
    (void)nullable;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDescribeColA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort icol, jlong szcolname, jshort cbcolnamemax, jlong pcbcolname, jlong pfsqltype, jlong pcbcoldef, jlong pibscale, jlong pfnullable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDescribeColA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)icol, (void*)(uintptr_t)szcolname, (int16_t)cbcolnamemax, (void*)(uintptr_t)pcbcolname, (void*)(uintptr_t)pfsqltype, (void*)(uintptr_t)pcbcoldef, (void*)(uintptr_t)pibscale, (void*)(uintptr_t)pfnullable) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)szcolname;
    (void)cbcolnamemax;
    (void)pcbcolname;
    (void)pfsqltype;
    (void)pcbcoldef;
    (void)pibscale;
    (void)pfnullable;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDescribeColW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort icol, jlong szcolname, jshort cchcolnamemax, jlong pcchcolname, jlong pfsqltype, jlong pcbcoldef, jlong pibscale, jlong pfnullable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDescribeColW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)icol, (void*)(uintptr_t)szcolname, (int16_t)cchcolnamemax, (void*)(uintptr_t)pcchcolname, (void*)(uintptr_t)pfsqltype, (void*)(uintptr_t)pcbcoldef, (void*)(uintptr_t)pibscale, (void*)(uintptr_t)pfnullable) : -1;
#else
    (void)hstmt;
    (void)icol;
    (void)szcolname;
    (void)cchcolnamemax;
    (void)pcchcolname;
    (void)pfsqltype;
    (void)pcbcoldef;
    (void)pibscale;
    (void)pfnullable;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDescribeParam(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort ipar, jlong pfsqltype, jlong pcbparamdef, jlong pibscale, jlong pfnullable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDescribeParam");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)ipar, (void*)(uintptr_t)pfsqltype, (void*)(uintptr_t)pcbparamdef, (void*)(uintptr_t)pibscale, (void*)(uintptr_t)pfnullable) : -1;
#else
    (void)hstmt;
    (void)ipar;
    (void)pfsqltype;
    (void)pcbparamdef;
    (void)pibscale;
    (void)pfnullable;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDisconnect(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDisconnect");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle) : -1;
#else
    (void)connectionhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDriverConnect(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong hwnd, jlong szconnstrin, jshort cchconnstrin, jlong szconnstrout, jshort cchconnstroutmax, jlong pcchconnstrout, jshort fdrivercompletion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int64_t, void*, int16_t, void*, int16_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriverConnect");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (int64_t)hwnd, (void*)(uintptr_t)szconnstrin, (int16_t)cchconnstrin, (void*)(uintptr_t)szconnstrout, (int16_t)cchconnstroutmax, (void*)(uintptr_t)pcchconnstrout, (uint16_t)fdrivercompletion) : -1;
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    (void)fdrivercompletion;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDriverConnectA(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong hwnd, jlong szconnstrin, jshort cbconnstrin, jlong szconnstrout, jshort cbconnstroutmax, jlong pcbconnstrout, jshort fdrivercompletion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int64_t, void*, int16_t, void*, int16_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriverConnectA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (int64_t)hwnd, (void*)(uintptr_t)szconnstrin, (int16_t)cbconnstrin, (void*)(uintptr_t)szconnstrout, (int16_t)cbconnstroutmax, (void*)(uintptr_t)pcbconnstrout, (uint16_t)fdrivercompletion) : -1;
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cbconnstrin;
    (void)szconnstrout;
    (void)cbconnstroutmax;
    (void)pcbconnstrout;
    (void)fdrivercompletion;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDriverConnectW(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong hwnd, jlong szconnstrin, jshort cchconnstrin, jlong szconnstrout, jshort cchconnstroutmax, jlong pcchconnstrout, jshort fdrivercompletion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int64_t, void*, int16_t, void*, int16_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriverConnectW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (int64_t)hwnd, (void*)(uintptr_t)szconnstrin, (int16_t)cchconnstrin, (void*)(uintptr_t)szconnstrout, (int16_t)cchconnstroutmax, (void*)(uintptr_t)pcchconnstrout, (uint16_t)fdrivercompletion) : -1;
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    (void)fdrivercompletion;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDrivers(JNIEnv* km_env, jclass km_clazz, jlong henv, jshort fdirection, jlong szdriverdesc, jshort cchdriverdescmax, jlong pcchdriverdesc, jlong szdriverattributes, jshort cchdrvrattrmax, jlong pcchdrvrattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDrivers");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henv, (uint16_t)fdirection, (void*)(uintptr_t)szdriverdesc, (int16_t)cchdriverdescmax, (void*)(uintptr_t)pcchdriverdesc, (void*)(uintptr_t)szdriverattributes, (int16_t)cchdrvrattrmax, (void*)(uintptr_t)pcchdrvrattr) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cchdriverdescmax;
    (void)pcchdriverdesc;
    (void)szdriverattributes;
    (void)cchdrvrattrmax;
    (void)pcchdrvrattr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDriversA(JNIEnv* km_env, jclass km_clazz, jlong henv, jshort fdirection, jlong szdriverdesc, jshort cbdriverdescmax, jlong pcbdriverdesc, jlong szdriverattributes, jshort cbdrvrattrmax, jlong pcbdrvrattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriversA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henv, (uint16_t)fdirection, (void*)(uintptr_t)szdriverdesc, (int16_t)cbdriverdescmax, (void*)(uintptr_t)pcbdriverdesc, (void*)(uintptr_t)szdriverattributes, (int16_t)cbdrvrattrmax, (void*)(uintptr_t)pcbdrvrattr) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cbdriverdescmax;
    (void)pcbdriverdesc;
    (void)szdriverattributes;
    (void)cbdrvrattrmax;
    (void)pcbdrvrattr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLDriversW(JNIEnv* km_env, jclass km_clazz, jlong henv, jshort fdirection, jlong szdriverdesc, jshort cchdriverdescmax, jlong pcchdriverdesc, jlong szdriverattributes, jshort cchdrvrattrmax, jlong pcchdrvrattr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriversW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henv, (uint16_t)fdirection, (void*)(uintptr_t)szdriverdesc, (int16_t)cchdriverdescmax, (void*)(uintptr_t)pcchdriverdesc, (void*)(uintptr_t)szdriverattributes, (int16_t)cchdrvrattrmax, (void*)(uintptr_t)pcchdrvrattr) : -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cchdriverdescmax;
    (void)pcchdriverdesc;
    (void)szdriverattributes;
    (void)cchdrvrattrmax;
    (void)pcchdrvrattr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLEndTran(JNIEnv* km_env, jclass km_clazz, jshort handletype, jlong handle, jshort completiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLEndTran");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)handletype, (void*)(uintptr_t)handle, (int16_t)completiontype) : -1;
#else
    (void)handletype;
    (void)handle;
    (void)completiontype;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLError(JNIEnv* km_env, jclass km_clazz, jlong environmenthandle, jlong connectionhandle, jlong statementhandle, jlong sqlstate, jlong nativeerror, jlong messagetext, jshort bufferlength, jlong textlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLError");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)environmenthandle, (void*)(uintptr_t)connectionhandle, (void*)(uintptr_t)statementhandle, (void*)(uintptr_t)sqlstate, (void*)(uintptr_t)nativeerror, (void*)(uintptr_t)messagetext, (int16_t)bufferlength, (void*)(uintptr_t)textlength) : -1;
#else
    (void)environmenthandle;
    (void)connectionhandle;
    (void)statementhandle;
    (void)sqlstate;
    (void)nativeerror;
    (void)messagetext;
    (void)bufferlength;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLErrorA(JNIEnv* km_env, jclass km_clazz, jlong henv, jlong hdbc, jlong hstmt, jlong szsqlstate, jlong pfnativeerror, jlong szerrormsg, jshort cberrormsgmax, jlong pcberrormsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLErrorA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henv, (void*)(uintptr_t)hdbc, (void*)(uintptr_t)hstmt, (void*)(uintptr_t)szsqlstate, (void*)(uintptr_t)pfnativeerror, (void*)(uintptr_t)szerrormsg, (int16_t)cberrormsgmax, (void*)(uintptr_t)pcberrormsg) : -1;
#else
    (void)henv;
    (void)hdbc;
    (void)hstmt;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)cberrormsgmax;
    (void)pcberrormsg;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLErrorW(JNIEnv* km_env, jclass km_clazz, jlong henv, jlong hdbc, jlong hstmt, jlong wszsqlstate, jlong pfnativeerror, jlong wszerrormsg, jshort ccherrormsgmax, jlong pccherrormsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLErrorW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henv, (void*)(uintptr_t)hdbc, (void*)(uintptr_t)hstmt, (void*)(uintptr_t)wszsqlstate, (void*)(uintptr_t)pfnativeerror, (void*)(uintptr_t)wszerrormsg, (int16_t)ccherrormsgmax, (void*)(uintptr_t)pccherrormsg) : -1;
#else
    (void)henv;
    (void)hdbc;
    (void)hstmt;
    (void)wszsqlstate;
    (void)pfnativeerror;
    (void)wszerrormsg;
    (void)ccherrormsgmax;
    (void)pccherrormsg;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLExecDirect(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong statementtext, jint textlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExecDirect");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)statementtext, (int32_t)textlength) : -1;
#else
    (void)statementhandle;
    (void)statementtext;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLExecDirectA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szsqlstr, jint cbsqlstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExecDirectA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szsqlstr, (int32_t)cbsqlstr) : -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cbsqlstr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLExecDirectW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szsqlstr, jint textlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExecDirectW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szsqlstr, (int32_t)textlength) : -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLExecute(JNIEnv* km_env, jclass km_clazz, jlong statementhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExecute");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle) : -1;
#else
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLExtendedFetch(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort ffetchtype, jlong irow, jlong pcrow, jlong rgfrowstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExtendedFetch");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)ffetchtype, (int64_t)irow, (void*)(uintptr_t)pcrow, (void*)(uintptr_t)rgfrowstatus) : -1;
#else
    (void)hstmt;
    (void)ffetchtype;
    (void)irow;
    (void)pcrow;
    (void)rgfrowstatus;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLFetch(JNIEnv* km_env, jclass km_clazz, jlong statementhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFetch");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle) : -1;
#else
    (void)statementhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLFetchScroll(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort fetchorientation, jlong fetchoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFetchScroll");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (int16_t)fetchorientation, (int64_t)fetchoffset) : -1;
#else
    (void)statementhandle;
    (void)fetchorientation;
    (void)fetchoffset;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLForeignKeys(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szpkcatalogname, jshort cchpkcatalogname, jlong szpkschemaname, jshort cchpkschemaname, jlong szpktablename, jshort cchpktablename, jlong szfkcatalogname, jshort cchfkcatalogname, jlong szfkschemaname, jshort cchfkschemaname, jlong szfktablename, jshort cchfktablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLForeignKeys");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szpkcatalogname, (int16_t)cchpkcatalogname, (void*)(uintptr_t)szpkschemaname, (int16_t)cchpkschemaname, (void*)(uintptr_t)szpktablename, (int16_t)cchpktablename, (void*)(uintptr_t)szfkcatalogname, (int16_t)cchfkcatalogname, (void*)(uintptr_t)szfkschemaname, (int16_t)cchfkschemaname, (void*)(uintptr_t)szfktablename, (int16_t)cchfktablename) : -1;
#else
    (void)hstmt;
    (void)szpkcatalogname;
    (void)cchpkcatalogname;
    (void)szpkschemaname;
    (void)cchpkschemaname;
    (void)szpktablename;
    (void)cchpktablename;
    (void)szfkcatalogname;
    (void)cchfkcatalogname;
    (void)szfkschemaname;
    (void)cchfkschemaname;
    (void)szfktablename;
    (void)cchfktablename;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLForeignKeysA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szpkcatalogname, jshort cbpkcatalogname, jlong szpkschemaname, jshort cbpkschemaname, jlong szpktablename, jshort cbpktablename, jlong szfkcatalogname, jshort cbfkcatalogname, jlong szfkschemaname, jshort cbfkschemaname, jlong szfktablename, jshort cbfktablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLForeignKeysA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szpkcatalogname, (int16_t)cbpkcatalogname, (void*)(uintptr_t)szpkschemaname, (int16_t)cbpkschemaname, (void*)(uintptr_t)szpktablename, (int16_t)cbpktablename, (void*)(uintptr_t)szfkcatalogname, (int16_t)cbfkcatalogname, (void*)(uintptr_t)szfkschemaname, (int16_t)cbfkschemaname, (void*)(uintptr_t)szfktablename, (int16_t)cbfktablename) : -1;
#else
    (void)hstmt;
    (void)szpkcatalogname;
    (void)cbpkcatalogname;
    (void)szpkschemaname;
    (void)cbpkschemaname;
    (void)szpktablename;
    (void)cbpktablename;
    (void)szfkcatalogname;
    (void)cbfkcatalogname;
    (void)szfkschemaname;
    (void)cbfkschemaname;
    (void)szfktablename;
    (void)cbfktablename;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLForeignKeysW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szpkcatalogname, jshort cchpkcatalogname, jlong szpkschemaname, jshort cchpkschemaname, jlong szpktablename, jshort cchpktablename, jlong szfkcatalogname, jshort cchfkcatalogname, jlong szfkschemaname, jshort cchfkschemaname, jlong szfktablename, jshort cchfktablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLForeignKeysW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szpkcatalogname, (int16_t)cchpkcatalogname, (void*)(uintptr_t)szpkschemaname, (int16_t)cchpkschemaname, (void*)(uintptr_t)szpktablename, (int16_t)cchpktablename, (void*)(uintptr_t)szfkcatalogname, (int16_t)cchfkcatalogname, (void*)(uintptr_t)szfkschemaname, (int16_t)cchfkschemaname, (void*)(uintptr_t)szfktablename, (int16_t)cchfktablename) : -1;
#else
    (void)hstmt;
    (void)szpkcatalogname;
    (void)cchpkcatalogname;
    (void)szpkschemaname;
    (void)cchpkschemaname;
    (void)szpktablename;
    (void)cchpktablename;
    (void)szfkcatalogname;
    (void)cchfkcatalogname;
    (void)szfkschemaname;
    (void)cchfkschemaname;
    (void)szfktablename;
    (void)cchfktablename;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLFreeConnect(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFreeConnect");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle) : -1;
#else
    (void)connectionhandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLFreeEnv(JNIEnv* km_env, jclass km_clazz, jlong environmenthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFreeEnv");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)environmenthandle) : -1;
#else
    (void)environmenthandle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLFreeHandle(JNIEnv* km_env, jclass km_clazz, jshort handletype, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFreeHandle");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)handletype, (void*)(uintptr_t)handle) : -1;
#else
    (void)handletype;
    (void)handle;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLFreeStmt(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort option) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFreeStmt");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)option) : -1;
#else
    (void)statementhandle;
    (void)option;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetConnectAttr(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jint attribute, jlong value, jint bufferlength, jlong stringlengthptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectAttr");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (int32_t)attribute, (void*)(uintptr_t)value, (int32_t)bufferlength, (void*)(uintptr_t)stringlengthptr) : -1;
#else
    (void)connectionhandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlengthptr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetConnectAttrA(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jint fattribute, jlong rgbvalue, jint cbvaluemax, jlong pcbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectAttrA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (int32_t)fattribute, (void*)(uintptr_t)rgbvalue, (int32_t)cbvaluemax, (void*)(uintptr_t)pcbvalue) : -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetConnectAttrW(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jint fattribute, jlong rgbvalue, jint cbvaluemax, jlong pcbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectAttrW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (int32_t)fattribute, (void*)(uintptr_t)rgbvalue, (int32_t)cbvaluemax, (void*)(uintptr_t)pcbvalue) : -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetConnectOption(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jshort option, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectOption");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (uint16_t)option, (void*)(uintptr_t)value) : -1;
#else
    (void)connectionhandle;
    (void)option;
    (void)value;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetConnectOptionA(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jshort foption, jlong pvparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectOptionA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (uint16_t)foption, (void*)(uintptr_t)pvparam) : -1;
#else
    (void)hdbc;
    (void)foption;
    (void)pvparam;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetConnectOptionW(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jshort foption, jlong pvparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectOptionW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (uint16_t)foption, (void*)(uintptr_t)pvparam) : -1;
#else
    (void)hdbc;
    (void)foption;
    (void)pvparam;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetCursorName(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong cursorname, jshort bufferlength, jlong namelengthptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetCursorName");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)cursorname, (int16_t)bufferlength, (void*)(uintptr_t)namelengthptr) : -1;
#else
    (void)statementhandle;
    (void)cursorname;
    (void)bufferlength;
    (void)namelengthptr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetCursorNameA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcursor, jshort cbcursormax, jlong pcbcursor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetCursorNameA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcursor, (int16_t)cbcursormax, (void*)(uintptr_t)pcbcursor) : -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cbcursormax;
    (void)pcbcursor;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetCursorNameW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcursor, jshort cchcursormax, jlong pcchcursor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetCursorNameW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcursor, (int16_t)cchcursormax, (void*)(uintptr_t)pcchcursor) : -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cchcursormax;
    (void)pcchcursor;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetData(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort columnnumber, jshort targettype, jlong targetvalue, jlong bufferlength, jlong strlen_or_indptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetData");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)columnnumber, (int16_t)targettype, (void*)(uintptr_t)targetvalue, (int64_t)bufferlength, (void*)(uintptr_t)strlen_or_indptr) : -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)targettype;
    (void)targetvalue;
    (void)bufferlength;
    (void)strlen_or_indptr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDescField(JNIEnv* km_env, jclass km_clazz, jlong descriptorhandle, jshort recnumber, jshort fieldidentifier, jlong value, jint bufferlength, jlong stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescField");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)descriptorhandle, (int16_t)recnumber, (int16_t)fieldidentifier, (void*)(uintptr_t)value, (int32_t)bufferlength, (void*)(uintptr_t)stringlength) : -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDescFieldA(JNIEnv* km_env, jclass km_clazz, jlong hdesc, jshort irecord, jshort ifield, jlong rgbvalue, jint cbbufferlength, jlong stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescFieldA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdesc, (int16_t)irecord, (int16_t)ifield, (void*)(uintptr_t)rgbvalue, (int32_t)cbbufferlength, (void*)(uintptr_t)stringlength) : -1;
#else
    (void)hdesc;
    (void)irecord;
    (void)ifield;
    (void)rgbvalue;
    (void)cbbufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDescFieldW(JNIEnv* km_env, jclass km_clazz, jlong hdesc, jshort irecord, jshort ifield, jlong rgbvalue, jint cbbufferlength, jlong stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescFieldW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdesc, (int16_t)irecord, (int16_t)ifield, (void*)(uintptr_t)rgbvalue, (int32_t)cbbufferlength, (void*)(uintptr_t)stringlength) : -1;
#else
    (void)hdesc;
    (void)irecord;
    (void)ifield;
    (void)rgbvalue;
    (void)cbbufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDescRec(JNIEnv* km_env, jclass km_clazz, jlong descriptorhandle, jshort recnumber, jlong name, jshort bufferlength, jlong stringlengthptr, jlong typeptr, jlong subtypeptr, jlong lengthptr, jlong precisionptr, jlong scaleptr, jlong nullableptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, void*, int16_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescRec");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)descriptorhandle, (int16_t)recnumber, (void*)(uintptr_t)name, (int16_t)bufferlength, (void*)(uintptr_t)stringlengthptr, (void*)(uintptr_t)typeptr, (void*)(uintptr_t)subtypeptr, (void*)(uintptr_t)lengthptr, (void*)(uintptr_t)precisionptr, (void*)(uintptr_t)scaleptr, (void*)(uintptr_t)nullableptr) : -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)name;
    (void)bufferlength;
    (void)stringlengthptr;
    (void)typeptr;
    (void)subtypeptr;
    (void)lengthptr;
    (void)precisionptr;
    (void)scaleptr;
    (void)nullableptr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDescRecA(JNIEnv* km_env, jclass km_clazz, jlong hdesc, jshort irecord, jlong szname, jshort cbnamemax, jlong pcbname, jlong pftype, jlong pfsubtype, jlong plength, jlong pprecision, jlong pscale, jlong pnullable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, void*, int16_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescRecA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdesc, (int16_t)irecord, (void*)(uintptr_t)szname, (int16_t)cbnamemax, (void*)(uintptr_t)pcbname, (void*)(uintptr_t)pftype, (void*)(uintptr_t)pfsubtype, (void*)(uintptr_t)plength, (void*)(uintptr_t)pprecision, (void*)(uintptr_t)pscale, (void*)(uintptr_t)pnullable) : -1;
#else
    (void)hdesc;
    (void)irecord;
    (void)szname;
    (void)cbnamemax;
    (void)pcbname;
    (void)pftype;
    (void)pfsubtype;
    (void)plength;
    (void)pprecision;
    (void)pscale;
    (void)pnullable;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDescRecW(JNIEnv* km_env, jclass km_clazz, jlong hdesc, jshort irecord, jlong szname, jshort cchnamemax, jlong pcchname, jlong pftype, jlong pfsubtype, jlong plength, jlong pprecision, jlong pscale, jlong pnullable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, void*, int16_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescRecW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdesc, (int16_t)irecord, (void*)(uintptr_t)szname, (int16_t)cchnamemax, (void*)(uintptr_t)pcchname, (void*)(uintptr_t)pftype, (void*)(uintptr_t)pfsubtype, (void*)(uintptr_t)plength, (void*)(uintptr_t)pprecision, (void*)(uintptr_t)pscale, (void*)(uintptr_t)pnullable) : -1;
#else
    (void)hdesc;
    (void)irecord;
    (void)szname;
    (void)cchnamemax;
    (void)pcchname;
    (void)pftype;
    (void)pfsubtype;
    (void)plength;
    (void)pprecision;
    (void)pscale;
    (void)pnullable;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDiagField(JNIEnv* km_env, jclass km_clazz, jshort handletype, jlong handle, jshort recnumber, jshort diagidentifier, jlong diaginfo, jshort bufferlength, jlong stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagField");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)handletype, (void*)(uintptr_t)handle, (int16_t)recnumber, (int16_t)diagidentifier, (void*)(uintptr_t)diaginfo, (int16_t)bufferlength, (void*)(uintptr_t)stringlength) : -1;
#else
    (void)handletype;
    (void)handle;
    (void)recnumber;
    (void)diagidentifier;
    (void)diaginfo;
    (void)bufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDiagFieldA(JNIEnv* km_env, jclass km_clazz, jshort fhandletype, jlong handle, jshort irecord, jshort fdiagfield, jlong rgbdiaginfo, jshort cbdiaginfomax, jlong pcbdiaginfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagFieldA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)fhandletype, (void*)(uintptr_t)handle, (int16_t)irecord, (int16_t)fdiagfield, (void*)(uintptr_t)rgbdiaginfo, (int16_t)cbdiaginfomax, (void*)(uintptr_t)pcbdiaginfo) : -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)fdiagfield;
    (void)rgbdiaginfo;
    (void)cbdiaginfomax;
    (void)pcbdiaginfo;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDiagFieldW(JNIEnv* km_env, jclass km_clazz, jshort fhandletype, jlong handle, jshort irecord, jshort fdiagfield, jlong rgbdiaginfo, jshort cbbufferlength, jlong pcbstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagFieldW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)fhandletype, (void*)(uintptr_t)handle, (int16_t)irecord, (int16_t)fdiagfield, (void*)(uintptr_t)rgbdiaginfo, (int16_t)cbbufferlength, (void*)(uintptr_t)pcbstringlength) : -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)fdiagfield;
    (void)rgbdiaginfo;
    (void)cbbufferlength;
    (void)pcbstringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDiagRec(JNIEnv* km_env, jclass km_clazz, jshort handletype, jlong handle, jshort recnumber, jlong sqlstate, jlong nativeerror, jlong messagetext, jshort bufferlength, jlong textlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagRec");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)handletype, (void*)(uintptr_t)handle, (int16_t)recnumber, (void*)(uintptr_t)sqlstate, (void*)(uintptr_t)nativeerror, (void*)(uintptr_t)messagetext, (int16_t)bufferlength, (void*)(uintptr_t)textlength) : -1;
#else
    (void)handletype;
    (void)handle;
    (void)recnumber;
    (void)sqlstate;
    (void)nativeerror;
    (void)messagetext;
    (void)bufferlength;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDiagRecA(JNIEnv* km_env, jclass km_clazz, jshort fhandletype, jlong handle, jshort irecord, jlong szsqlstate, jlong pfnativeerror, jlong szerrormsg, jshort cberrormsgmax, jlong pcberrormsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagRecA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)fhandletype, (void*)(uintptr_t)handle, (int16_t)irecord, (void*)(uintptr_t)szsqlstate, (void*)(uintptr_t)pfnativeerror, (void*)(uintptr_t)szerrormsg, (int16_t)cberrormsgmax, (void*)(uintptr_t)pcberrormsg) : -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)cberrormsgmax;
    (void)pcberrormsg;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetDiagRecW(JNIEnv* km_env, jclass km_clazz, jshort fhandletype, jlong handle, jshort irecord, jlong szsqlstate, jlong pfnativeerror, jlong szerrormsg, jshort ccherrormsgmax, jlong pccherrormsg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagRecW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int16_t)fhandletype, (void*)(uintptr_t)handle, (int16_t)irecord, (void*)(uintptr_t)szsqlstate, (void*)(uintptr_t)pfnativeerror, (void*)(uintptr_t)szerrormsg, (int16_t)ccherrormsgmax, (void*)(uintptr_t)pccherrormsg) : -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)ccherrormsgmax;
    (void)pccherrormsg;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetEnvAttr(JNIEnv* km_env, jclass km_clazz, jlong environmenthandle, jint attribute, jlong value, jint bufferlength, jlong stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetEnvAttr");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)environmenthandle, (int32_t)attribute, (void*)(uintptr_t)value, (int32_t)bufferlength, (void*)(uintptr_t)stringlength) : -1;
#else
    (void)environmenthandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetFunctions(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jshort functionid, jlong supported) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetFunctions");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (uint16_t)functionid, (void*)(uintptr_t)supported) : -1;
#else
    (void)connectionhandle;
    (void)functionid;
    (void)supported;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetInfo(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jshort infotype, jlong infovalue, jshort bufferlength, jlong stringlengthptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetInfo");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (uint16_t)infotype, (void*)(uintptr_t)infovalue, (int16_t)bufferlength, (void*)(uintptr_t)stringlengthptr) : -1;
#else
    (void)connectionhandle;
    (void)infotype;
    (void)infovalue;
    (void)bufferlength;
    (void)stringlengthptr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetInfoA(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jshort finfotype, jlong rgbinfovalue, jshort cbinfovaluemax, jlong pcbinfovalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetInfoA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (uint16_t)finfotype, (void*)(uintptr_t)rgbinfovalue, (int16_t)cbinfovaluemax, (void*)(uintptr_t)pcbinfovalue) : -1;
#else
    (void)hdbc;
    (void)finfotype;
    (void)rgbinfovalue;
    (void)cbinfovaluemax;
    (void)pcbinfovalue;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetInfoW(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jshort finfotype, jlong rgbinfovalue, jshort cbinfovaluemax, jlong pcbinfovalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetInfoW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (uint16_t)finfotype, (void*)(uintptr_t)rgbinfovalue, (int16_t)cbinfovaluemax, (void*)(uintptr_t)pcbinfovalue) : -1;
#else
    (void)hdbc;
    (void)finfotype;
    (void)rgbinfovalue;
    (void)cbinfovaluemax;
    (void)pcbinfovalue;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetNextEnumeration(JNIEnv* km_env, jclass km_clazz, jlong henumhandle, jlong prgenumdata, jlong pienumlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetNextEnumeration");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)henumhandle, (void*)(uintptr_t)prgenumdata, (void*)(uintptr_t)pienumlength) : -1;
#else
    (void)henumhandle;
    (void)prgenumdata;
    (void)pienumlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetStmtAttr(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jint attribute, jlong value, jint bufferlength, jlong stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetStmtAttr");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (int32_t)attribute, (void*)(uintptr_t)value, (int32_t)bufferlength, (void*)(uintptr_t)stringlength) : -1;
#else
    (void)statementhandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetStmtAttrA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jint fattribute, jlong rgbvalue, jint cbvaluemax, jlong pcbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetStmtAttrA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (int32_t)fattribute, (void*)(uintptr_t)rgbvalue, (int32_t)cbvaluemax, (void*)(uintptr_t)pcbvalue) : -1;
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetStmtAttrW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jint fattribute, jlong rgbvalue, jint cbvaluemax, jlong pcbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetStmtAttrW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (int32_t)fattribute, (void*)(uintptr_t)rgbvalue, (int32_t)cbvaluemax, (void*)(uintptr_t)pcbvalue) : -1;
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetStmtOption(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort option, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetStmtOption");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)option, (void*)(uintptr_t)value) : -1;
#else
    (void)statementhandle;
    (void)option;
    (void)value;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetTypeInfo(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort datatype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetTypeInfo");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (int16_t)datatype) : -1;
#else
    (void)statementhandle;
    (void)datatype;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetTypeInfoA(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort datatype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetTypeInfoA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (int16_t)datatype) : -1;
#else
    (void)statementhandle;
    (void)datatype;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLGetTypeInfoW(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort datatype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetTypeInfoW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (int16_t)datatype) : -1;
#else
    (void)statementhandle;
    (void)datatype;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLInitEnumServers(JNIEnv* km_env, jclass km_clazz, jlong pwchservername, jlong pwchinstancename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLInitEnumServers");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwchservername, (void*)(uintptr_t)pwchinstancename) : NULL;
#else
    (void)pwchservername;
    (void)pwchinstancename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLLinkedCatalogsA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jshort param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLLinkedCatalogsA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int16_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLLinkedCatalogsW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jshort param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLLinkedCatalogsW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int16_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLLinkedServers(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLLinkedServers");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLMoreResults(JNIEnv* km_env, jclass km_clazz, jlong hstmt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLMoreResults");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt) : -1;
#else
    (void)hstmt;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLNativeSql(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong szsqlstrin, jint cchsqlstrin, jlong szsqlstr, jint cchsqlstrmax, jlong pcbsqlstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNativeSql");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (void*)(uintptr_t)szsqlstrin, (int32_t)cchsqlstrin, (void*)(uintptr_t)szsqlstr, (int32_t)cchsqlstrmax, (void*)(uintptr_t)pcbsqlstr) : -1;
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cchsqlstrin;
    (void)szsqlstr;
    (void)cchsqlstrmax;
    (void)pcbsqlstr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLNativeSqlA(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong szsqlstrin, jint cbsqlstrin, jlong szsqlstr, jint cbsqlstrmax, jlong pcbsqlstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNativeSqlA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (void*)(uintptr_t)szsqlstrin, (int32_t)cbsqlstrin, (void*)(uintptr_t)szsqlstr, (int32_t)cbsqlstrmax, (void*)(uintptr_t)pcbsqlstr) : -1;
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cbsqlstrin;
    (void)szsqlstr;
    (void)cbsqlstrmax;
    (void)pcbsqlstr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLNativeSqlW(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jlong szsqlstrin, jint cchsqlstrin, jlong szsqlstr, jint cchsqlstrmax, jlong pcchsqlstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNativeSqlW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (void*)(uintptr_t)szsqlstrin, (int32_t)cchsqlstrin, (void*)(uintptr_t)szsqlstr, (int32_t)cchsqlstrmax, (void*)(uintptr_t)pcchsqlstr) : -1;
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cchsqlstrin;
    (void)szsqlstr;
    (void)cchsqlstrmax;
    (void)pcchsqlstr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLNumParams(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong pcpar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNumParams");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)pcpar) : -1;
#else
    (void)hstmt;
    (void)pcpar;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLNumResultCols(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong columncount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNumResultCols");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)columncount) : -1;
#else
    (void)statementhandle;
    (void)columncount;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLParamData(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLParamData");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)value) : -1;
#else
    (void)statementhandle;
    (void)value;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLParamOptions(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong crow, jlong pirow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLParamOptions");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint64_t)crow, (void*)(uintptr_t)pirow) : -1;
#else
    (void)hstmt;
    (void)crow;
    (void)pirow;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLPrepare(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong statementtext, jint textlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrepare");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)statementtext, (int32_t)textlength) : -1;
#else
    (void)statementhandle;
    (void)statementtext;
    (void)textlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLPrepareA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szsqlstr, jint cbsqlstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrepareA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szsqlstr, (int32_t)cbsqlstr) : -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cbsqlstr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLPrepareW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szsqlstr, jint cchsqlstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrepareW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szsqlstr, (int32_t)cchsqlstr) : -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cchsqlstr;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLPrimaryKeys(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrimaryKeys");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLPrimaryKeysA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cbcatalogname, jlong szschemaname, jshort cbschemaname, jlong sztablename, jshort cbtablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrimaryKeysA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cbcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cbschemaname, (void*)(uintptr_t)sztablename, (int16_t)cbtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLPrimaryKeysW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrimaryKeysW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLProcedureColumns(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong szprocname, jshort cchprocname, jlong szcolumnname, jshort cchcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProcedureColumns");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)szprocname, (int16_t)cchprocname, (void*)(uintptr_t)szcolumnname, (int16_t)cchcolumnname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    (void)szcolumnname;
    (void)cchcolumnname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLProcedureColumnsA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cbcatalogname, jlong szschemaname, jshort cbschemaname, jlong szprocname, jshort cbprocname, jlong szcolumnname, jshort cbcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProcedureColumnsA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cbcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cbschemaname, (void*)(uintptr_t)szprocname, (int16_t)cbprocname, (void*)(uintptr_t)szcolumnname, (int16_t)cbcolumnname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)szprocname;
    (void)cbprocname;
    (void)szcolumnname;
    (void)cbcolumnname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLProcedureColumnsW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong szprocname, jshort cchprocname, jlong szcolumnname, jshort cchcolumnname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProcedureColumnsW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)szprocname, (int16_t)cchprocname, (void*)(uintptr_t)szcolumnname, (int16_t)cchcolumnname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    (void)szcolumnname;
    (void)cchcolumnname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLProcedures(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong szprocname, jshort cchprocname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProcedures");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)szprocname, (int16_t)cchprocname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLProceduresA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cbcatalogname, jlong szschemaname, jshort cbschemaname, jlong szprocname, jshort cbprocname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProceduresA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cbcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cbschemaname, (void*)(uintptr_t)szprocname, (int16_t)cbprocname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)szprocname;
    (void)cbprocname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLProceduresW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong szprocname, jshort cchprocname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProceduresW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)szprocname, (int16_t)cchprocname) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLPutData(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong data, jlong strlen_or_ind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPutData");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)data, (int64_t)strlen_or_ind) : -1;
#else
    (void)statementhandle;
    (void)data;
    (void)strlen_or_ind;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLRowCount(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong rowcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLRowCount");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)rowcount) : -1;
#else
    (void)statementhandle;
    (void)rowcount;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetConnectAttr(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jint attribute, jlong value, jint stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectAttr");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (int32_t)attribute, (void*)(uintptr_t)value, (int32_t)stringlength) : -1;
#else
    (void)connectionhandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetConnectAttrA(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jint fattribute, jlong rgbvalue, jint cbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectAttrA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (int32_t)fattribute, (void*)(uintptr_t)rgbvalue, (int32_t)cbvalue) : -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvalue;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetConnectAttrW(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jint fattribute, jlong rgbvalue, jint cbvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectAttrW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (int32_t)fattribute, (void*)(uintptr_t)rgbvalue, (int32_t)cbvalue) : -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvalue;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetConnectOption(JNIEnv* km_env, jclass km_clazz, jlong connectionhandle, jshort option, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectOption");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)connectionhandle, (uint16_t)option, (uint64_t)value) : -1;
#else
    (void)connectionhandle;
    (void)option;
    (void)value;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetConnectOptionA(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jshort foption, jlong vparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectOptionA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (uint16_t)foption, (uint64_t)vparam) : -1;
#else
    (void)hdbc;
    (void)foption;
    (void)vparam;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetConnectOptionW(JNIEnv* km_env, jclass km_clazz, jlong hdbc, jshort foption, jlong vparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectOptionW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdbc, (uint16_t)foption, (uint64_t)vparam) : -1;
#else
    (void)hdbc;
    (void)foption;
    (void)vparam;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetCursorName(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong cursorname, jshort namelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetCursorName");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)cursorname, (int16_t)namelength) : -1;
#else
    (void)statementhandle;
    (void)cursorname;
    (void)namelength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetCursorNameA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcursor, jshort cbcursor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetCursorNameA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcursor, (int16_t)cbcursor) : -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cbcursor;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetCursorNameW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcursor, jshort cchcursor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetCursorNameW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcursor, (int16_t)cchcursor) : -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cchcursor;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetDescField(JNIEnv* km_env, jclass km_clazz, jlong descriptorhandle, jshort recnumber, jshort fieldidentifier, jlong value, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetDescField");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)descriptorhandle, (int16_t)recnumber, (int16_t)fieldidentifier, (void*)(uintptr_t)value, (int32_t)bufferlength) : -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetDescFieldW(JNIEnv* km_env, jclass km_clazz, jlong descriptorhandle, jshort recnumber, jshort fieldidentifier, jlong value, jint bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetDescFieldW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)descriptorhandle, (int16_t)recnumber, (int16_t)fieldidentifier, (void*)(uintptr_t)value, (int32_t)bufferlength) : -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetDescRec(JNIEnv* km_env, jclass km_clazz, jlong descriptorhandle, jshort recnumber, jshort type, jshort subtype, jlong length, jshort precision, jshort scale, jlong data, jlong stringlength, jlong indicator) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, int16_t, int64_t, int16_t, int16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetDescRec");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)descriptorhandle, (int16_t)recnumber, (int16_t)type, (int16_t)subtype, (int64_t)length, (int16_t)precision, (int16_t)scale, (void*)(uintptr_t)data, (void*)(uintptr_t)stringlength, (void*)(uintptr_t)indicator) : -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)type;
    (void)subtype;
    (void)length;
    (void)precision;
    (void)scale;
    (void)data;
    (void)stringlength;
    (void)indicator;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetEnvAttr(JNIEnv* km_env, jclass km_clazz, jlong environmenthandle, jint attribute, jlong value, jint stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetEnvAttr");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)environmenthandle, (int32_t)attribute, (void*)(uintptr_t)value, (int32_t)stringlength) : -1;
#else
    (void)environmenthandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetParam(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort parameternumber, jshort valuetype, jshort parametertype, jlong lengthprecision, jshort parameterscale, jlong parametervalue, jlong strlen_or_ind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, uint64_t, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetParam");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)parameternumber, (int16_t)valuetype, (int16_t)parametertype, (uint64_t)lengthprecision, (int16_t)parameterscale, (void*)(uintptr_t)parametervalue, (void*)(uintptr_t)strlen_or_ind) : -1;
#else
    (void)statementhandle;
    (void)parameternumber;
    (void)valuetype;
    (void)parametertype;
    (void)lengthprecision;
    (void)parameterscale;
    (void)parametervalue;
    (void)strlen_or_ind;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetPos(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong irow, jshort foption, jshort flock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint64_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetPos");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint64_t)irow, (uint16_t)foption, (uint16_t)flock) : -1;
#else
    (void)hstmt;
    (void)irow;
    (void)foption;
    (void)flock;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetScrollOptions(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort fconcurrency, jlong crowkeyset, jshort crowrowset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetScrollOptions");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)fconcurrency, (int64_t)crowkeyset, (uint16_t)crowrowset) : -1;
#else
    (void)hstmt;
    (void)fconcurrency;
    (void)crowkeyset;
    (void)crowrowset;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetStmtAttr(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jint attribute, jlong value, jint stringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetStmtAttr");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (int32_t)attribute, (void*)(uintptr_t)value, (int32_t)stringlength) : -1;
#else
    (void)statementhandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetStmtAttrW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jint fattribute, jlong rgbvalue, jint cbvaluemax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetStmtAttrW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (int32_t)fattribute, (void*)(uintptr_t)rgbvalue, (int32_t)cbvaluemax) : -1;
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSetStmtOption(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort option, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetStmtOption");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)option, (uint64_t)value) : -1;
#else
    (void)statementhandle;
    (void)option;
    (void)value;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSpecialColumns(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jshort identifiertype, jlong catalogname, jshort namelength1, jlong schemaname, jshort namelength2, jlong tablename, jshort namelength3, jshort scope, jshort nullable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSpecialColumns");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (uint16_t)identifiertype, (void*)(uintptr_t)catalogname, (int16_t)namelength1, (void*)(uintptr_t)schemaname, (int16_t)namelength2, (void*)(uintptr_t)tablename, (int16_t)namelength3, (uint16_t)scope, (uint16_t)nullable) : -1;
#else
    (void)statementhandle;
    (void)identifiertype;
    (void)catalogname;
    (void)namelength1;
    (void)schemaname;
    (void)namelength2;
    (void)tablename;
    (void)namelength3;
    (void)scope;
    (void)nullable;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSpecialColumnsA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort fcoltype, jlong szcatalogname, jshort cbcatalogname, jlong szschemaname, jshort cbschemaname, jlong sztablename, jshort cbtablename, jshort fscope, jshort fnullable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSpecialColumnsA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)fcoltype, (void*)(uintptr_t)szcatalogname, (int16_t)cbcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cbschemaname, (void*)(uintptr_t)sztablename, (int16_t)cbtablename, (uint16_t)fscope, (uint16_t)fnullable) : -1;
#else
    (void)hstmt;
    (void)fcoltype;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)fscope;
    (void)fnullable;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLSpecialColumnsW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jshort fcoltype, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename, jshort fscope, jshort fnullable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSpecialColumnsW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (uint16_t)fcoltype, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename, (uint16_t)fscope, (uint16_t)fnullable) : -1;
#else
    (void)hstmt;
    (void)fcoltype;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)fscope;
    (void)fnullable;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLStatistics(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong catalogname, jshort namelength1, jlong schemaname, jshort namelength2, jlong tablename, jshort namelength3, jshort unique, jshort reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLStatistics");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)catalogname, (int16_t)namelength1, (void*)(uintptr_t)schemaname, (int16_t)namelength2, (void*)(uintptr_t)tablename, (int16_t)namelength3, (uint16_t)unique, (uint16_t)reserved) : -1;
#else
    (void)statementhandle;
    (void)catalogname;
    (void)namelength1;
    (void)schemaname;
    (void)namelength2;
    (void)tablename;
    (void)namelength3;
    (void)unique;
    (void)reserved;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLStatisticsA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cbcatalogname, jlong szschemaname, jshort cbschemaname, jlong sztablename, jshort cbtablename, jshort funique, jshort faccuracy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLStatisticsA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cbcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cbschemaname, (void*)(uintptr_t)sztablename, (int16_t)cbtablename, (uint16_t)funique, (uint16_t)faccuracy) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)funique;
    (void)faccuracy;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLStatisticsW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename, jshort funique, jshort faccuracy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLStatisticsW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename, (uint16_t)funique, (uint16_t)faccuracy) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)funique;
    (void)faccuracy;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLTablePrivileges(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablePrivileges");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLTablePrivilegesA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cbcatalogname, jlong szschemaname, jshort cbschemaname, jlong sztablename, jshort cbtablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablePrivilegesA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cbcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cbschemaname, (void*)(uintptr_t)sztablename, (int16_t)cbtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLTablePrivilegesW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablePrivilegesW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLTables(JNIEnv* km_env, jclass km_clazz, jlong statementhandle, jlong catalogname, jshort namelength1, jlong schemaname, jshort namelength2, jlong tablename, jshort namelength3, jlong tabletype, jshort namelength4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTables");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)statementhandle, (void*)(uintptr_t)catalogname, (int16_t)namelength1, (void*)(uintptr_t)schemaname, (int16_t)namelength2, (void*)(uintptr_t)tablename, (int16_t)namelength3, (void*)(uintptr_t)tabletype, (int16_t)namelength4) : -1;
#else
    (void)statementhandle;
    (void)catalogname;
    (void)namelength1;
    (void)schemaname;
    (void)namelength2;
    (void)tablename;
    (void)namelength3;
    (void)tabletype;
    (void)namelength4;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLTablesA(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cbcatalogname, jlong szschemaname, jshort cbschemaname, jlong sztablename, jshort cbtablename, jlong sztabletype, jshort cbtabletype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablesA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cbcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cbschemaname, (void*)(uintptr_t)sztablename, (int16_t)cbtablename, (void*)(uintptr_t)sztabletype, (int16_t)cbtabletype) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    (void)sztabletype;
    (void)cbtabletype;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLTablesW(JNIEnv* km_env, jclass km_clazz, jlong hstmt, jlong szcatalogname, jshort cchcatalogname, jlong szschemaname, jshort cchschemaname, jlong sztablename, jshort cchtablename, jlong sztabletype, jshort cchtabletype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablesW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hstmt, (void*)(uintptr_t)szcatalogname, (int16_t)cchcatalogname, (void*)(uintptr_t)szschemaname, (int16_t)cchschemaname, (void*)(uintptr_t)sztablename, (int16_t)cchtablename, (void*)(uintptr_t)sztabletype, (int16_t)cchtabletype) : -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    (void)sztabletype;
    (void)cchtabletype;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1sQLTransact(JNIEnv* km_env, jclass km_clazz, jlong environmenthandle, jlong connectionhandle, jshort completiontype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTransact");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)environmenthandle, (void*)(uintptr_t)connectionhandle, (uint16_t)completiontype) : -1;
#else
    (void)environmenthandle;
    (void)connectionhandle;
    (void)completiontype;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpBatch(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_batch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpBind(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jint param5, jint param6, jint param7) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_bind");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2, (int32_t)param3, (void*)(uintptr_t)param4, (int32_t)param5, (int32_t)param6, (int32_t)param7) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpColfmt(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jbyte param2, jint param3, jint param4, jlong param5, jint param6, jint param7) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, uint8_t, int32_t, int32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_colfmt");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (uint8_t)param2, (int32_t)param3, (int32_t)param4, (void*)(uintptr_t)param5, (int32_t)param6, (int32_t)param7) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpCollen(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_collen");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (int32_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpColptr(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_colptr");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (int32_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpColumns(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_columns");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpControl(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_control");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (void*)(uintptr_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpDone(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_done");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpExec(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_exec");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpGetcolfmt(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jlong param3, jint param4, jlong param5) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_getcolfmt");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (int32_t)param2, (void*)(uintptr_t)param3, (int32_t)param4, (void*)(uintptr_t)param5) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpInitA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_initA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (int32_t)param4) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpInitW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_initW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1, (void*)(uintptr_t)param2, (void*)(uintptr_t)param3, (int32_t)param4) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpMoretext(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jlong param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_moretext");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (void*)(uintptr_t)param2) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpReadfmtA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_readfmtA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpReadfmtW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_readfmtW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpSendrow(JNIEnv* km_env, jclass km_clazz, jlong param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_sendrow");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0) : -1;
#else
    (void)param0;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpSetcolfmt(JNIEnv* km_env, jclass km_clazz, jlong param0, jint param1, jint param2, jlong param3, jint param4) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_setcolfmt");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (int32_t)param1, (int32_t)param2, (void*)(uintptr_t)param3, (int32_t)param4) : -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpWritefmtA(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_writefmtA");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1bcpWritefmtW(JNIEnv* km_env, jclass km_clazz, jlong param0, jlong param1) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_writefmtW");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)param0, (void*)(uintptr_t)param1) : -1;
#else
    (void)param0;
    (void)param1;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1dbprtypeA(JNIEnv* km_env, jclass km_clazz, jint param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "dbprtypeA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_search_WindowsWin32SystemSearchJniBridge_windowssys_1windows_1win32_1system_1search_1dbprtypeW(JNIEnv* km_env, jclass km_clazz, jint param0) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "dbprtypeW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)param0) : NULL;
#else
    (void)param0;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

