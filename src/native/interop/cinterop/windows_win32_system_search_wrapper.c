#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_search_wrapper.h"
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

uint32_t windowssysWindowsWin32SystemSearchODBCGetTryWaitValue(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ODBCGetTryWaitValue");
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

int32_t windowssysWindowsWin32SystemSearchODBCSetTryWaitValue(uint32_t dwvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ODBCSetTryWaitValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)dwvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLAllocConnect(void* environmenthandle, void* connectionhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(environmenthandle, connectionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)environmenthandle;
    (void)connectionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLAllocEnv(void* environmenthandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocEnv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(environmenthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)environmenthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLAllocHandle(int16_t handletype, void* inputhandle, void* outputhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handletype, inputhandle, outputhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handletype;
    (void)inputhandle;
    (void)outputhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLAllocHandleStd(int16_t fhandletype, void* hinput, void* phoutput) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocHandleStd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fhandletype, hinput, phoutput);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fhandletype;
    (void)hinput;
    (void)phoutput;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLAllocStmt(void* connectionhandle, void* statementhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLAllocStmt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, statementhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)statementhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLBindCol(void* statementhandle, uint16_t columnnumber, int16_t targettype, void* targetvalue, int64_t bufferlength, void* strlenOrInd) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBindCol");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, columnnumber, targettype, targetvalue, bufferlength, strlenOrInd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)targettype;
    (void)targetvalue;
    (void)bufferlength;
    (void)strlenOrInd;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLBindParam(void* statementhandle, uint16_t parameternumber, int16_t valuetype, int16_t parametertype, uint64_t lengthprecision, int16_t parameterscale, void* parametervalue, void* strlenOrInd) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, uint64_t, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBindParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue, strlenOrInd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)parameternumber;
    (void)valuetype;
    (void)parametertype;
    (void)lengthprecision;
    (void)parameterscale;
    (void)parametervalue;
    (void)strlenOrInd;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLBindParameter(void* hstmt, uint16_t ipar, int16_t fparamtype, int16_t fctype, int16_t fsqltype, uint64_t cbcoldef, int16_t ibscale, void* rgbvalue, int64_t cbvaluemax, void* pcbvalue) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, int16_t, uint64_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBindParameter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, ipar, fparamtype, fctype, fsqltype, cbcoldef, ibscale, rgbvalue, cbvaluemax, pcbvalue);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLBrowseConnect(void* hdbc, void* szconnstrin, int16_t cchconnstrin, void* szconnstrout, int16_t cchconnstroutmax, void* pcchconnstrout) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBrowseConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLBrowseConnectA(void* hdbc, void* szconnstrin, int16_t cbconnstrin, void* szconnstrout, int16_t cbconnstroutmax, void* pcbconnstrout) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBrowseConnectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, szconnstrin, cbconnstrin, szconnstrout, cbconnstroutmax, pcbconnstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cbconnstrin;
    (void)szconnstrout;
    (void)cbconnstroutmax;
    (void)pcbconnstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLBrowseConnectW(void* hdbc, void* szconnstrin, int16_t cchconnstrin, void* szconnstrout, int16_t cchconnstroutmax, void* pcchconnstrout) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBrowseConnectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLBulkOperations(void* statementhandle, int16_t operation) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLBulkOperations");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, operation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)operation;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLCancel(void* statementhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCancel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLCancelHandle(int16_t handletype, void* inputhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCancelHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handletype, inputhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handletype;
    (void)inputhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLCloseCursor(void* statementhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCloseCursor");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLCloseEnumServers(void* henumhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCloseEnumServers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henumhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henumhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColAttribute(void* statementhandle, uint16_t columnnumber, uint16_t fieldidentifier, void* characterattribute, int16_t bufferlength, void* stringlength, void* numericattribute) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttribute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, columnnumber, fieldidentifier, characterattribute, bufferlength, stringlength, numericattribute);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)fieldidentifier;
    (void)characterattribute;
    (void)bufferlength;
    (void)stringlength;
    (void)numericattribute;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColAttributeA(void* hstmt, int16_t icol, int16_t ifield, void* pcharattr, int16_t cbcharattrmax, void* pcbcharattr, void* pnumattr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, icol, ifield, pcharattr, cbcharattrmax, pcbcharattr, pnumattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)icol;
    (void)ifield;
    (void)pcharattr;
    (void)cbcharattrmax;
    (void)pcbcharattr;
    (void)pnumattr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColAttributeW(void* hstmt, uint16_t icol, uint16_t ifield, void* pcharattr, int16_t cbdescmax, void* pcbcharattr, void* pnumattr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, icol, ifield, pcharattr, cbdescmax, pcbcharattr, pnumattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)icol;
    (void)ifield;
    (void)pcharattr;
    (void)cbdescmax;
    (void)pcbcharattr;
    (void)pnumattr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColAttributes(void* hstmt, uint16_t icol, uint16_t fdesctype, void* rgbdesc, int16_t cbdescmax, void* pcbdesc, void* pfdesc) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, icol, fdesctype, rgbdesc, cbdescmax, pcbdesc, pfdesc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColAttributesA(void* hstmt, uint16_t icol, uint16_t fdesctype, void* rgbdesc, int16_t cbdescmax, void* pcbdesc, void* pfdesc) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, icol, fdesctype, rgbdesc, cbdescmax, pcbdesc, pfdesc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColAttributesW(void* hstmt, uint16_t icol, uint16_t fdesctype, void* rgbdesc, int16_t cbdescmax, void* pcbdesc, void* pfdesc) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint16_t, void*, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColAttributesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, icol, fdesctype, rgbdesc, cbdescmax, pcbdesc, pfdesc);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)icol;
    (void)fdesctype;
    (void)rgbdesc;
    (void)cbdescmax;
    (void)pcbdesc;
    (void)pfdesc;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColumnPrivileges(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename, void* szcolumnname, int16_t cchcolumnname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnPrivileges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColumnPrivilegesA(void* hstmt, void* szcatalogname, int16_t cbcatalogname, void* szschemaname, int16_t cbschemaname, void* sztablename, int16_t cbtablename, void* szcolumnname, int16_t cbcolumnname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnPrivilegesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, szcolumnname, cbcolumnname);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColumnPrivilegesW(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename, void* szcolumnname, int16_t cchcolumnname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnPrivilegesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColumns(void* statementhandle, void* catalogname, int16_t namelength1, void* schemaname, int16_t namelength2, void* tablename, int16_t namelength3, void* columnname, int16_t namelength4) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, columnname, namelength4);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColumnsA(void* hstmt, void* szcatalogname, int16_t cbcatalogname, void* szschemaname, int16_t cbschemaname, void* sztablename, int16_t cbtablename, void* szcolumnname, int16_t cbcolumnname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, szcolumnname, cbcolumnname);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLColumnsW(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename, void* szcolumnname, int16_t cchcolumnname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLColumnsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, szcolumnname, cchcolumnname);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLCompleteAsync(int16_t handletype, void* handle, void* asyncretcodeptr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCompleteAsync");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handletype, handle, asyncretcodeptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handletype;
    (void)handle;
    (void)asyncretcodeptr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLConnect(void* connectionhandle, void* servername, int16_t namelength1, void* username, int16_t namelength2, void* authentication, int16_t namelength3) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, servername, namelength1, username, namelength2, authentication, namelength3);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)servername;
    (void)namelength1;
    (void)username;
    (void)namelength2;
    (void)authentication;
    (void)namelength3;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLConnectA(void* hdbc, void* szdsn, int16_t cbdsn, void* szuid, int16_t cbuid, void* szauthstr, int16_t cbauthstr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLConnectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, szdsn, cbdsn, szuid, cbuid, szauthstr, cbauthstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)szdsn;
    (void)cbdsn;
    (void)szuid;
    (void)cbuid;
    (void)szauthstr;
    (void)cbauthstr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLConnectW(void* hdbc, void* szdsn, int16_t cchdsn, void* szuid, int16_t cchuid, void* szauthstr, int16_t cchauthstr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLConnectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, szdsn, cchdsn, szuid, cchuid, szauthstr, cchauthstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)szdsn;
    (void)cchdsn;
    (void)szuid;
    (void)cchuid;
    (void)szauthstr;
    (void)cchauthstr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLCopyDesc(void* sourcedeschandle, void* targetdeschandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLCopyDesc");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcedeschandle, targetdeschandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcedeschandle;
    (void)targetdeschandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDataSources(void* environmenthandle, uint16_t direction, void* servername, int16_t bufferlength1, void* namelength1ptr, void* description, int16_t bufferlength2, void* namelength2ptr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDataSources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(environmenthandle, direction, servername, bufferlength1, namelength1ptr, description, bufferlength2, namelength2ptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)environmenthandle;
    (void)direction;
    (void)servername;
    (void)bufferlength1;
    (void)namelength1ptr;
    (void)description;
    (void)bufferlength2;
    (void)namelength2ptr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDataSourcesA(void* henv, uint16_t fdirection, void* szdsn, int16_t cbdsnmax, void* pcbdsn, void* szdescription, int16_t cbdescriptionmax, void* pcbdescription) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDataSourcesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, fdirection, szdsn, cbdsnmax, pcbdsn, szdescription, cbdescriptionmax, pcbdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdsn;
    (void)cbdsnmax;
    (void)pcbdsn;
    (void)szdescription;
    (void)cbdescriptionmax;
    (void)pcbdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDataSourcesW(void* henv, uint16_t fdirection, void* szdsn, int16_t cchdsnmax, void* pcchdsn, void* wszdescription, int16_t cchdescriptionmax, void* pcchdescription) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDataSourcesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, fdirection, szdsn, cchdsnmax, pcchdsn, wszdescription, cchdescriptionmax, pcchdescription);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdsn;
    (void)cchdsnmax;
    (void)pcchdsn;
    (void)wszdescription;
    (void)cchdescriptionmax;
    (void)pcchdescription;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDescribeCol(void* statementhandle, uint16_t columnnumber, void* columnname, int16_t bufferlength, void* namelength, void* datatype, void* columnsize, void* decimaldigits, void* nullable) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDescribeCol");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, columnnumber, columnname, bufferlength, namelength, datatype, columnsize, decimaldigits, nullable);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDescribeColA(void* hstmt, uint16_t icol, void* szcolname, int16_t cbcolnamemax, void* pcbcolname, void* pfsqltype, void* pcbcoldef, void* pibscale, void* pfnullable) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDescribeColA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, icol, szcolname, cbcolnamemax, pcbcolname, pfsqltype, pcbcoldef, pibscale, pfnullable);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDescribeColW(void* hstmt, uint16_t icol, void* szcolname, int16_t cchcolnamemax, void* pcchcolname, void* pfsqltype, void* pcbcoldef, void* pibscale, void* pfnullable) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDescribeColW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, icol, szcolname, cchcolnamemax, pcchcolname, pfsqltype, pcbcoldef, pibscale, pfnullable);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDescribeParam(void* hstmt, uint16_t ipar, void* pfsqltype, void* pcbparamdef, void* pibscale, void* pfnullable) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDescribeParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, ipar, pfsqltype, pcbparamdef, pibscale, pfnullable);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)ipar;
    (void)pfsqltype;
    (void)pcbparamdef;
    (void)pibscale;
    (void)pfnullable;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDisconnect(void* connectionhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDisconnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDriverConnect(void* hdbc, int64_t hwnd, void* szconnstrin, int16_t cchconnstrin, void* szconnstrout, int16_t cchconnstroutmax, void* pcchconnstrout, uint16_t fdrivercompletion) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int64_t, void*, int16_t, void*, int16_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriverConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, hwnd, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout, fdrivercompletion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    (void)fdrivercompletion;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDriverConnectA(void* hdbc, int64_t hwnd, void* szconnstrin, int16_t cbconnstrin, void* szconnstrout, int16_t cbconnstroutmax, void* pcbconnstrout, uint16_t fdrivercompletion) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int64_t, void*, int16_t, void*, int16_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriverConnectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, hwnd, szconnstrin, cbconnstrin, szconnstrout, cbconnstroutmax, pcbconnstrout, fdrivercompletion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cbconnstrin;
    (void)szconnstrout;
    (void)cbconnstroutmax;
    (void)pcbconnstrout;
    (void)fdrivercompletion;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDriverConnectW(void* hdbc, int64_t hwnd, void* szconnstrin, int16_t cchconnstrin, void* szconnstrout, int16_t cchconnstroutmax, void* pcchconnstrout, uint16_t fdrivercompletion) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int64_t, void*, int16_t, void*, int16_t, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriverConnectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, hwnd, szconnstrin, cchconnstrin, szconnstrout, cchconnstroutmax, pcchconnstrout, fdrivercompletion);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)hwnd;
    (void)szconnstrin;
    (void)cchconnstrin;
    (void)szconnstrout;
    (void)cchconnstroutmax;
    (void)pcchconnstrout;
    (void)fdrivercompletion;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDrivers(void* henv, uint16_t fdirection, void* szdriverdesc, int16_t cchdriverdescmax, void* pcchdriverdesc, void* szdriverattributes, int16_t cchdrvrattrmax, void* pcchdrvrattr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDrivers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, fdirection, szdriverdesc, cchdriverdescmax, pcchdriverdesc, szdriverattributes, cchdrvrattrmax, pcchdrvrattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cchdriverdescmax;
    (void)pcchdriverdesc;
    (void)szdriverattributes;
    (void)cchdrvrattrmax;
    (void)pcchdrvrattr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDriversA(void* henv, uint16_t fdirection, void* szdriverdesc, int16_t cbdriverdescmax, void* pcbdriverdesc, void* szdriverattributes, int16_t cbdrvrattrmax, void* pcbdrvrattr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriversA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, fdirection, szdriverdesc, cbdriverdescmax, pcbdriverdesc, szdriverattributes, cbdrvrattrmax, pcbdrvrattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cbdriverdescmax;
    (void)pcbdriverdesc;
    (void)szdriverattributes;
    (void)cbdrvrattrmax;
    (void)pcbdrvrattr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLDriversW(void* henv, uint16_t fdirection, void* szdriverdesc, int16_t cchdriverdescmax, void* pcchdriverdesc, void* szdriverattributes, int16_t cchdrvrattrmax, void* pcchdrvrattr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLDriversW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, fdirection, szdriverdesc, cchdriverdescmax, pcchdriverdesc, szdriverattributes, cchdrvrattrmax, pcchdrvrattr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)fdirection;
    (void)szdriverdesc;
    (void)cchdriverdescmax;
    (void)pcchdriverdesc;
    (void)szdriverattributes;
    (void)cchdrvrattrmax;
    (void)pcchdrvrattr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLEndTran(int16_t handletype, void* handle, int16_t completiontype) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLEndTran");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handletype, handle, completiontype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handletype;
    (void)handle;
    (void)completiontype;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLError(void* environmenthandle, void* connectionhandle, void* statementhandle, void* sqlstate, void* nativeerror, void* messagetext, int16_t bufferlength, void* textlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLError");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(environmenthandle, connectionhandle, statementhandle, sqlstate, nativeerror, messagetext, bufferlength, textlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)environmenthandle;
    (void)connectionhandle;
    (void)statementhandle;
    (void)sqlstate;
    (void)nativeerror;
    (void)messagetext;
    (void)bufferlength;
    (void)textlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLErrorA(void* henv, void* hdbc, void* hstmt, void* szsqlstate, void* pfnativeerror, void* szerrormsg, int16_t cberrormsgmax, void* pcberrormsg) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLErrorA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, hdbc, hstmt, szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax, pcberrormsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)hdbc;
    (void)hstmt;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)cberrormsgmax;
    (void)pcberrormsg;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLErrorW(void* henv, void* hdbc, void* hstmt, void* wszsqlstate, void* pfnativeerror, void* wszerrormsg, int16_t ccherrormsgmax, void* pccherrormsg) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLErrorW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henv, hdbc, hstmt, wszsqlstate, pfnativeerror, wszerrormsg, ccherrormsgmax, pccherrormsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henv;
    (void)hdbc;
    (void)hstmt;
    (void)wszsqlstate;
    (void)pfnativeerror;
    (void)wszerrormsg;
    (void)ccherrormsgmax;
    (void)pccherrormsg;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLExecDirect(void* statementhandle, void* statementtext, int32_t textlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExecDirect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, statementtext, textlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)statementtext;
    (void)textlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLExecDirectA(void* hstmt, void* szsqlstr, int32_t cbsqlstr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExecDirectA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szsqlstr, cbsqlstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cbsqlstr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLExecDirectW(void* hstmt, void* szsqlstr, int32_t textlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExecDirectW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szsqlstr, textlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)textlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLExecute(void* statementhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExecute");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLExtendedFetch(void* hstmt, uint16_t ffetchtype, int64_t irow, void* pcrow, void* rgfrowstatus) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLExtendedFetch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, ffetchtype, irow, pcrow, rgfrowstatus);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)ffetchtype;
    (void)irow;
    (void)pcrow;
    (void)rgfrowstatus;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLFetch(void* statementhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFetch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLFetchScroll(void* statementhandle, int16_t fetchorientation, int64_t fetchoffset) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFetchScroll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, fetchorientation, fetchoffset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)fetchorientation;
    (void)fetchoffset;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLForeignKeys(void* hstmt, void* szpkcatalogname, int16_t cchpkcatalogname, void* szpkschemaname, int16_t cchpkschemaname, void* szpktablename, int16_t cchpktablename, void* szfkcatalogname, int16_t cchfkcatalogname, void* szfkschemaname, int16_t cchfkschemaname, void* szfktablename, int16_t cchfktablename) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLForeignKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szpkcatalogname, cchpkcatalogname, szpkschemaname, cchpkschemaname, szpktablename, cchpktablename, szfkcatalogname, cchfkcatalogname, szfkschemaname, cchfkschemaname, szfktablename, cchfktablename);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLForeignKeysA(void* hstmt, void* szpkcatalogname, int16_t cbpkcatalogname, void* szpkschemaname, int16_t cbpkschemaname, void* szpktablename, int16_t cbpktablename, void* szfkcatalogname, int16_t cbfkcatalogname, void* szfkschemaname, int16_t cbfkschemaname, void* szfktablename, int16_t cbfktablename) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLForeignKeysA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szpkcatalogname, cbpkcatalogname, szpkschemaname, cbpkschemaname, szpktablename, cbpktablename, szfkcatalogname, cbfkcatalogname, szfkschemaname, cbfkschemaname, szfktablename, cbfktablename);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLForeignKeysW(void* hstmt, void* szpkcatalogname, int16_t cchpkcatalogname, void* szpkschemaname, int16_t cchpkschemaname, void* szpktablename, int16_t cchpktablename, void* szfkcatalogname, int16_t cchfkcatalogname, void* szfkschemaname, int16_t cchfkschemaname, void* szfktablename, int16_t cchfktablename) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLForeignKeysW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szpkcatalogname, cchpkcatalogname, szpkschemaname, cchpkschemaname, szpktablename, cchpktablename, szfkcatalogname, cchfkcatalogname, szfkschemaname, cchfkschemaname, szfktablename, cchfktablename);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLFreeConnect(void* connectionhandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFreeConnect");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLFreeEnv(void* environmenthandle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFreeEnv");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(environmenthandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)environmenthandle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLFreeHandle(int16_t handletype, void* handle) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFreeHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handletype, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handletype;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLFreeStmt(void* statementhandle, uint16_t option) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLFreeStmt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, option);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)option;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetConnectAttr(void* connectionhandle, int32_t attribute, void* value, int32_t bufferlength, void* stringlengthptr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, attribute, value, bufferlength, stringlengthptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlengthptr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetConnectAttrA(void* hdbc, int32_t fattribute, void* rgbvalue, int32_t cbvaluemax, void* pcbvalue) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectAttrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, fattribute, rgbvalue, cbvaluemax, pcbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetConnectAttrW(void* hdbc, int32_t fattribute, void* rgbvalue, int32_t cbvaluemax, void* pcbvalue) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectAttrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, fattribute, rgbvalue, cbvaluemax, pcbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetConnectOption(void* connectionhandle, uint16_t option, void* value) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, option, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetConnectOptionA(void* hdbc, uint16_t foption, void* pvparam) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectOptionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, foption, pvparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)foption;
    (void)pvparam;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetConnectOptionW(void* hdbc, uint16_t foption, void* pvparam) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetConnectOptionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, foption, pvparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)foption;
    (void)pvparam;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetCursorName(void* statementhandle, void* cursorname, int16_t bufferlength, void* namelengthptr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetCursorName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, cursorname, bufferlength, namelengthptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)cursorname;
    (void)bufferlength;
    (void)namelengthptr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetCursorNameA(void* hstmt, void* szcursor, int16_t cbcursormax, void* pcbcursor) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetCursorNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcursor, cbcursormax, pcbcursor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cbcursormax;
    (void)pcbcursor;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetCursorNameW(void* hstmt, void* szcursor, int16_t cchcursormax, void* pcchcursor) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetCursorNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcursor, cchcursormax, pcchcursor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cchcursormax;
    (void)pcchcursor;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetData(void* statementhandle, uint16_t columnnumber, int16_t targettype, void* targetvalue, int64_t bufferlength, void* strlenOrIndptr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, columnnumber, targettype, targetvalue, bufferlength, strlenOrIndptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)columnnumber;
    (void)targettype;
    (void)targetvalue;
    (void)bufferlength;
    (void)strlenOrIndptr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDescField(void* descriptorhandle, int16_t recnumber, int16_t fieldidentifier, void* value, int32_t bufferlength, void* stringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescField");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptorhandle, recnumber, fieldidentifier, value, bufferlength, stringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDescFieldA(void* hdesc, int16_t irecord, int16_t ifield, void* rgbvalue, int32_t cbbufferlength, void* stringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescFieldA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdesc, irecord, ifield, rgbvalue, cbbufferlength, stringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdesc;
    (void)irecord;
    (void)ifield;
    (void)rgbvalue;
    (void)cbbufferlength;
    (void)stringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDescFieldW(void* hdesc, int16_t irecord, int16_t ifield, void* rgbvalue, int32_t cbbufferlength, void* stringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescFieldW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdesc, irecord, ifield, rgbvalue, cbbufferlength, stringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdesc;
    (void)irecord;
    (void)ifield;
    (void)rgbvalue;
    (void)cbbufferlength;
    (void)stringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDescRec(void* descriptorhandle, int16_t recnumber, void* name, int16_t bufferlength, void* stringlengthptr, void* typeptr, void* subtypeptr, void* lengthptr, void* precisionptr, void* scaleptr, void* nullableptr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, void*, int16_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescRec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptorhandle, recnumber, name, bufferlength, stringlengthptr, typeptr, subtypeptr, lengthptr, precisionptr, scaleptr, nullableptr);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDescRecA(void* hdesc, int16_t irecord, void* szname, int16_t cbnamemax, void* pcbname, void* pftype, void* pfsubtype, void* plength, void* pprecision, void* pscale, void* pnullable) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, void*, int16_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescRecA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdesc, irecord, szname, cbnamemax, pcbname, pftype, pfsubtype, plength, pprecision, pscale, pnullable);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDescRecW(void* hdesc, int16_t irecord, void* szname, int16_t cchnamemax, void* pcchname, void* pftype, void* pfsubtype, void* plength, void* pprecision, void* pscale, void* pnullable) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, void*, int16_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDescRecW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdesc, irecord, szname, cchnamemax, pcchname, pftype, pfsubtype, plength, pprecision, pscale, pnullable);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDiagField(int16_t handletype, void* handle, int16_t recnumber, int16_t diagidentifier, void* diaginfo, int16_t bufferlength, void* stringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagField");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handletype, handle, recnumber, diagidentifier, diaginfo, bufferlength, stringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handletype;
    (void)handle;
    (void)recnumber;
    (void)diagidentifier;
    (void)diaginfo;
    (void)bufferlength;
    (void)stringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDiagFieldA(int16_t fhandletype, void* handle, int16_t irecord, int16_t fdiagfield, void* rgbdiaginfo, int16_t cbdiaginfomax, void* pcbdiaginfo) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagFieldA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fhandletype, handle, irecord, fdiagfield, rgbdiaginfo, cbdiaginfomax, pcbdiaginfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)fdiagfield;
    (void)rgbdiaginfo;
    (void)cbdiaginfomax;
    (void)pcbdiaginfo;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDiagFieldW(int16_t fhandletype, void* handle, int16_t irecord, int16_t fdiagfield, void* rgbdiaginfo, int16_t cbbufferlength, void* pcbstringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, int16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagFieldW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fhandletype, handle, irecord, fdiagfield, rgbdiaginfo, cbbufferlength, pcbstringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)fdiagfield;
    (void)rgbdiaginfo;
    (void)cbbufferlength;
    (void)pcbstringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDiagRec(int16_t handletype, void* handle, int16_t recnumber, void* sqlstate, void* nativeerror, void* messagetext, int16_t bufferlength, void* textlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagRec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(handletype, handle, recnumber, sqlstate, nativeerror, messagetext, bufferlength, textlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)handletype;
    (void)handle;
    (void)recnumber;
    (void)sqlstate;
    (void)nativeerror;
    (void)messagetext;
    (void)bufferlength;
    (void)textlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDiagRecA(int16_t fhandletype, void* handle, int16_t irecord, void* szsqlstate, void* pfnativeerror, void* szerrormsg, int16_t cberrormsgmax, void* pcberrormsg) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagRecA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fhandletype, handle, irecord, szsqlstate, pfnativeerror, szerrormsg, cberrormsgmax, pcberrormsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)cberrormsgmax;
    (void)pcberrormsg;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetDiagRecW(int16_t fhandletype, void* handle, int16_t irecord, void* szsqlstate, void* pfnativeerror, void* szerrormsg, int16_t ccherrormsgmax, void* pccherrormsg) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(int16_t, void*, int16_t, void*, void*, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetDiagRecW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fhandletype, handle, irecord, szsqlstate, pfnativeerror, szerrormsg, ccherrormsgmax, pccherrormsg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fhandletype;
    (void)handle;
    (void)irecord;
    (void)szsqlstate;
    (void)pfnativeerror;
    (void)szerrormsg;
    (void)ccherrormsgmax;
    (void)pccherrormsg;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetEnvAttr(void* environmenthandle, int32_t attribute, void* value, int32_t bufferlength, void* stringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetEnvAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(environmenthandle, attribute, value, bufferlength, stringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)environmenthandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetFunctions(void* connectionhandle, uint16_t functionid, void* supported) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetFunctions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, functionid, supported);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)functionid;
    (void)supported;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetInfo(void* connectionhandle, uint16_t infotype, void* infovalue, int16_t bufferlength, void* stringlengthptr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, infotype, infovalue, bufferlength, stringlengthptr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)infotype;
    (void)infovalue;
    (void)bufferlength;
    (void)stringlengthptr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetInfoA(void* hdbc, uint16_t finfotype, void* rgbinfovalue, int16_t cbinfovaluemax, void* pcbinfovalue) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, finfotype, rgbinfovalue, cbinfovaluemax, pcbinfovalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)finfotype;
    (void)rgbinfovalue;
    (void)cbinfovaluemax;
    (void)pcbinfovalue;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetInfoW(void* hdbc, uint16_t finfotype, void* rgbinfovalue, int16_t cbinfovaluemax, void* pcbinfovalue) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, finfotype, rgbinfovalue, cbinfovaluemax, pcbinfovalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)finfotype;
    (void)rgbinfovalue;
    (void)cbinfovaluemax;
    (void)pcbinfovalue;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetNextEnumeration(void* henumhandle, void* prgenumdata, void* pienumlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetNextEnumeration");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henumhandle, prgenumdata, pienumlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)henumhandle;
    (void)prgenumdata;
    (void)pienumlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetStmtAttr(void* statementhandle, int32_t attribute, void* value, int32_t bufferlength, void* stringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetStmtAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, attribute, value, bufferlength, stringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)attribute;
    (void)value;
    (void)bufferlength;
    (void)stringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetStmtAttrA(void* hstmt, int32_t fattribute, void* rgbvalue, int32_t cbvaluemax, void* pcbvalue) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetStmtAttrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, fattribute, rgbvalue, cbvaluemax, pcbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetStmtAttrW(void* hstmt, int32_t fattribute, void* rgbvalue, int32_t cbvaluemax, void* pcbvalue) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetStmtAttrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, fattribute, rgbvalue, cbvaluemax, pcbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    (void)pcbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetStmtOption(void* statementhandle, uint16_t option, void* value) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetStmtOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, option, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetTypeInfo(void* statementhandle, int16_t datatype) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetTypeInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, datatype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)datatype;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetTypeInfoA(void* statementhandle, int16_t datatype) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetTypeInfoA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, datatype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)datatype;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLGetTypeInfoW(void* statementhandle, int16_t datatype) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLGetTypeInfoW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, datatype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)datatype;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemSearchSQLInitEnumServers(void* pwchservername, void* pwchinstancename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLInitEnumServers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pwchservername, pwchinstancename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pwchservername;
    (void)pwchinstancename;
    errno = ENOSYS;
    return NULL;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLLinkedCatalogsA(void* param0, void* param1, int16_t param2) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLLinkedCatalogsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLLinkedCatalogsW(void* param0, void* param1, int16_t param2) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLLinkedCatalogsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLLinkedServers(void* param0) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLLinkedServers");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLMoreResults(void* hstmt) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLMoreResults");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLNativeSql(void* hdbc, void* szsqlstrin, int32_t cchsqlstrin, void* szsqlstr, int32_t cchsqlstrmax, void* pcbsqlstr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNativeSql");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, szsqlstrin, cchsqlstrin, szsqlstr, cchsqlstrmax, pcbsqlstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cchsqlstrin;
    (void)szsqlstr;
    (void)cchsqlstrmax;
    (void)pcbsqlstr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLNativeSqlA(void* hdbc, void* szsqlstrin, int32_t cbsqlstrin, void* szsqlstr, int32_t cbsqlstrmax, void* pcbsqlstr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNativeSqlA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, szsqlstrin, cbsqlstrin, szsqlstr, cbsqlstrmax, pcbsqlstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cbsqlstrin;
    (void)szsqlstr;
    (void)cbsqlstrmax;
    (void)pcbsqlstr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLNativeSqlW(void* hdbc, void* szsqlstrin, int32_t cchsqlstrin, void* szsqlstr, int32_t cchsqlstrmax, void* pcchsqlstr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNativeSqlW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, szsqlstrin, cchsqlstrin, szsqlstr, cchsqlstrmax, pcchsqlstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)szsqlstrin;
    (void)cchsqlstrin;
    (void)szsqlstr;
    (void)cchsqlstrmax;
    (void)pcchsqlstr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLNumParams(void* hstmt, void* pcpar) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNumParams");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, pcpar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)pcpar;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLNumResultCols(void* statementhandle, void* columncount) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLNumResultCols");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, columncount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)columncount;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLParamData(void* statementhandle, void* value) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLParamData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLParamOptions(void* hstmt, uint64_t crow, void* pirow) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLParamOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, crow, pirow);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)crow;
    (void)pirow;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLPrepare(void* statementhandle, void* statementtext, int32_t textlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrepare");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, statementtext, textlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)statementtext;
    (void)textlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLPrepareA(void* hstmt, void* szsqlstr, int32_t cbsqlstr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrepareA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szsqlstr, cbsqlstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cbsqlstr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLPrepareW(void* hstmt, void* szsqlstr, int32_t cchsqlstr) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrepareW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szsqlstr, cchsqlstr);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szsqlstr;
    (void)cchsqlstr;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLPrimaryKeys(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrimaryKeys");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLPrimaryKeysA(void* hstmt, void* szcatalogname, int16_t cbcatalogname, void* szschemaname, int16_t cbschemaname, void* sztablename, int16_t cbtablename) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrimaryKeysA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLPrimaryKeysW(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPrimaryKeysW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLProcedureColumns(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* szprocname, int16_t cchprocname, void* szcolumnname, int16_t cchcolumnname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProcedureColumns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname, szcolumnname, cchcolumnname);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLProcedureColumnsA(void* hstmt, void* szcatalogname, int16_t cbcatalogname, void* szschemaname, int16_t cbschemaname, void* szprocname, int16_t cbprocname, void* szcolumnname, int16_t cbcolumnname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProcedureColumnsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, szprocname, cbprocname, szcolumnname, cbcolumnname);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLProcedureColumnsW(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* szprocname, int16_t cchprocname, void* szcolumnname, int16_t cchcolumnname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProcedureColumnsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname, szcolumnname, cchcolumnname);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLProcedures(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* szprocname, int16_t cchprocname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProcedures");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLProceduresA(void* hstmt, void* szcatalogname, int16_t cbcatalogname, void* szschemaname, int16_t cbschemaname, void* szprocname, int16_t cbprocname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProceduresA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, szprocname, cbprocname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)szprocname;
    (void)cbprocname;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLProceduresW(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* szprocname, int16_t cchprocname) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLProceduresW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, szprocname, cchprocname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)szprocname;
    (void)cchprocname;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLPutData(void* statementhandle, void* data, int64_t strlenOrInd) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLPutData");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, data, strlenOrInd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)data;
    (void)strlenOrInd;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLRowCount(void* statementhandle, void* rowcount) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLRowCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, rowcount);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)rowcount;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetConnectAttr(void* connectionhandle, int32_t attribute, void* value, int32_t stringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, attribute, value, stringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetConnectAttrA(void* hdbc, int32_t fattribute, void* rgbvalue, int32_t cbvalue) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectAttrA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, fattribute, rgbvalue, cbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetConnectAttrW(void* hdbc, int32_t fattribute, void* rgbvalue, int32_t cbvalue) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectAttrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, fattribute, rgbvalue, cbvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetConnectOption(void* connectionhandle, uint16_t option, uint64_t value) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(connectionhandle, option, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)connectionhandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetConnectOptionA(void* hdbc, uint16_t foption, uint64_t vparam) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectOptionA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, foption, vparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)foption;
    (void)vparam;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetConnectOptionW(void* hdbc, uint16_t foption, uint64_t vparam) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetConnectOptionW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdbc, foption, vparam);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hdbc;
    (void)foption;
    (void)vparam;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetCursorName(void* statementhandle, void* cursorname, int16_t namelength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetCursorName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, cursorname, namelength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)cursorname;
    (void)namelength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetCursorNameA(void* hstmt, void* szcursor, int16_t cbcursor) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetCursorNameA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcursor, cbcursor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cbcursor;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetCursorNameW(void* hstmt, void* szcursor, int16_t cchcursor) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetCursorNameW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcursor, cchcursor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcursor;
    (void)cchcursor;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetDescField(void* descriptorhandle, int16_t recnumber, int16_t fieldidentifier, void* value, int32_t bufferlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetDescField");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptorhandle, recnumber, fieldidentifier, value, bufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetDescFieldW(void* descriptorhandle, int16_t recnumber, int16_t fieldidentifier, void* value, int32_t bufferlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetDescFieldW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptorhandle, recnumber, fieldidentifier, value, bufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)descriptorhandle;
    (void)recnumber;
    (void)fieldidentifier;
    (void)value;
    (void)bufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetDescRec(void* descriptorhandle, int16_t recnumber, int16_t type, int16_t subtype, int64_t length, int16_t precision, int16_t scale, void* data, void* stringlength, void* indicator) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t, int16_t, int16_t, int64_t, int16_t, int16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetDescRec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(descriptorhandle, recnumber, type, subtype, length, precision, scale, data, stringlength, indicator);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetEnvAttr(void* environmenthandle, int32_t attribute, void* value, int32_t stringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetEnvAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(environmenthandle, attribute, value, stringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)environmenthandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetParam(void* statementhandle, uint16_t parameternumber, int16_t valuetype, int16_t parametertype, uint64_t lengthprecision, int16_t parameterscale, void* parametervalue, void* strlenOrInd) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int16_t, int16_t, uint64_t, int16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetParam");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, parameternumber, valuetype, parametertype, lengthprecision, parameterscale, parametervalue, strlenOrInd);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)parameternumber;
    (void)valuetype;
    (void)parametertype;
    (void)lengthprecision;
    (void)parameterscale;
    (void)parametervalue;
    (void)strlenOrInd;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetPos(void* hstmt, uint64_t irow, uint16_t foption, uint16_t flock) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint64_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetPos");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, irow, foption, flock);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)irow;
    (void)foption;
    (void)flock;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetScrollOptions(void* hstmt, uint16_t fconcurrency, int64_t crowkeyset, uint16_t crowrowset) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, int64_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetScrollOptions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, fconcurrency, crowkeyset, crowrowset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)fconcurrency;
    (void)crowkeyset;
    (void)crowrowset;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetStmtAttr(void* statementhandle, int32_t attribute, void* value, int32_t stringlength) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetStmtAttr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, attribute, value, stringlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)attribute;
    (void)value;
    (void)stringlength;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetStmtAttrW(void* hstmt, int32_t fattribute, void* rgbvalue, int32_t cbvaluemax) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetStmtAttrW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, fattribute, rgbvalue, cbvaluemax);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)fattribute;
    (void)rgbvalue;
    (void)cbvaluemax;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSetStmtOption(void* statementhandle, uint16_t option, uint64_t value) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSetStmtOption");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, option, value);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)statementhandle;
    (void)option;
    (void)value;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSpecialColumns(void* statementhandle, uint16_t identifiertype, void* catalogname, int16_t namelength1, void* schemaname, int16_t namelength2, void* tablename, int16_t namelength3, uint16_t scope, uint16_t nullable) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSpecialColumns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, identifiertype, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, scope, nullable);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSpecialColumnsA(void* hstmt, uint16_t fcoltype, void* szcatalogname, int16_t cbcatalogname, void* szschemaname, int16_t cbschemaname, void* sztablename, int16_t cbtablename, uint16_t fscope, uint16_t fnullable) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSpecialColumnsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, fcoltype, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, fscope, fnullable);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLSpecialColumnsW(void* hstmt, uint16_t fcoltype, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename, uint16_t fscope, uint16_t fnullable) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLSpecialColumnsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, fcoltype, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, fscope, fnullable);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLStatistics(void* statementhandle, void* catalogname, int16_t namelength1, void* schemaname, int16_t namelength2, void* tablename, int16_t namelength3, uint16_t unique, uint16_t reserved) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLStatistics");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, unique, reserved);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLStatisticsA(void* hstmt, void* szcatalogname, int16_t cbcatalogname, void* szschemaname, int16_t cbschemaname, void* sztablename, int16_t cbtablename, uint16_t funique, uint16_t faccuracy) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLStatisticsA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, funique, faccuracy);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLStatisticsW(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename, uint16_t funique, uint16_t faccuracy) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, uint16_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLStatisticsW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, funique, faccuracy);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLTablePrivileges(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablePrivileges");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLTablePrivilegesA(void* hstmt, void* szcatalogname, int16_t cbcatalogname, void* szschemaname, int16_t cbschemaname, void* sztablename, int16_t cbtablename) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablePrivilegesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cbcatalogname;
    (void)szschemaname;
    (void)cbschemaname;
    (void)sztablename;
    (void)cbtablename;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLTablePrivilegesW(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablePrivilegesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hstmt;
    (void)szcatalogname;
    (void)cchcatalogname;
    (void)szschemaname;
    (void)cchschemaname;
    (void)sztablename;
    (void)cchtablename;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLTables(void* statementhandle, void* catalogname, int16_t namelength1, void* schemaname, int16_t namelength2, void* tablename, int16_t namelength3, void* tabletype, int16_t namelength4) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTables");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(statementhandle, catalogname, namelength1, schemaname, namelength2, tablename, namelength3, tabletype, namelength4);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLTablesA(void* hstmt, void* szcatalogname, int16_t cbcatalogname, void* szschemaname, int16_t cbschemaname, void* sztablename, int16_t cbtablename, void* sztabletype, int16_t cbtabletype) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cbcatalogname, szschemaname, cbschemaname, sztablename, cbtablename, sztabletype, cbtabletype);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLTablesW(void* hstmt, void* szcatalogname, int16_t cchcatalogname, void* szschemaname, int16_t cchschemaname, void* sztablename, int16_t cchtablename, void* sztabletype, int16_t cchtabletype) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int16_t, void*, int16_t, void*, int16_t, void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTablesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hstmt, szcatalogname, cchcatalogname, szschemaname, cchschemaname, sztablename, cchtablename, sztabletype, cchtabletype);
    }
    errno = ENOSYS;
    return -1;
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
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchSQLTransact(void* environmenthandle, void* connectionhandle, uint16_t completiontype) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbc32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SQLTransact");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(environmenthandle, connectionhandle, completiontype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)environmenthandle;
    (void)connectionhandle;
    (void)completiontype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemSearchBcpBatch(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_batch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpBind(void* param0, void* param1, int32_t param2, int32_t param3, void* param4, int32_t param5, int32_t param6, int32_t param7) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_bind");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpColfmt(void* param0, int32_t param1, uint8_t param2, int32_t param3, int32_t param4, void* param5, int32_t param6, int32_t param7) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, uint8_t, int32_t, int32_t, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_colfmt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5, param6, param7);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    (void)param6;
    (void)param7;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpCollen(void* param0, int32_t param1, int32_t param2) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_collen");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpColptr(void* param0, void* param1, int32_t param2) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_colptr");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpColumns(void* param0, int32_t param1) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_columns");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpControl(void* param0, int32_t param1, void* param2) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_control");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssysWindowsWin32SystemSearchBcpDone(void* param0) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_done");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpExec(void* param0, void* param1) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_exec");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpGetcolfmt(void* param0, int32_t param1, int32_t param2, void* param3, int32_t param4, void* param5) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_getcolfmt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4, param5);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    (void)param5;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpInitA(void* param0, void* param1, void* param2, void* param3, int32_t param4) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_initA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpInitW(void* param0, void* param1, void* param2, void* param3, int32_t param4) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_initW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpMoretext(void* param0, int32_t param1, void* param2) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_moretext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpReadfmtA(void* param0, void* param1) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_readfmtA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpReadfmtW(void* param0, void* param1) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_readfmtW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpSendrow(void* param0) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_sendrow");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpSetcolfmt(void* param0, int32_t param1, int32_t param2, void* param3, int32_t param4) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_setcolfmt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1, param2, param3, param4);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    (void)param2;
    (void)param3;
    (void)param4;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpWritefmtA(void* param0, void* param1) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_writefmtA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

int16_t windowssysWindowsWin32SystemSearchBcpWritefmtW(void* param0, void* param1) {
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "bcp_writefmtW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0, param1);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)param0;
    (void)param1;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssysWindowsWin32SystemSearchDbprtypeA(int32_t param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "dbprtypeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssysWindowsWin32SystemSearchDbprtypeW(int32_t param0) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("odbcbcp.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "dbprtypeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(param0);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)param0;
    errno = ENOSYS;
    return NULL;
#endif
}

