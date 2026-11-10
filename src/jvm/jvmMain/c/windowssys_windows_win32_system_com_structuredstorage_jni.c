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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1clearPropVariantArray(JNIEnv* km_env, jclass km_clazz, jlong rgpropvar, jint cvars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClearPropVariantArray");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)rgpropvar, (uint32_t)cvars);
#else
    (void)rgpropvar;
    (void)cvars;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1coGetInstanceFromFile(JNIEnv* km_env, jclass km_clazz, jlong pserverinfo, jlong pclsid, jlong punkouter, jint dwclsctx, jint grfmode, jlong pwszname, jint dwcount, jlong presults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetInstanceFromFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pserverinfo, (void*)(uintptr_t)pclsid, (void*)(uintptr_t)punkouter, (uint32_t)dwclsctx, (uint32_t)grfmode, (void*)(uintptr_t)pwszname, (uint32_t)dwcount, (void*)(uintptr_t)presults) : -1;
#else
    (void)pserverinfo;
    (void)pclsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)grfmode;
    (void)pwszname;
    (void)dwcount;
    (void)presults;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1coGetInstanceFromIStorage(JNIEnv* km_env, jclass km_clazz, jlong pserverinfo, jlong pclsid, jlong punkouter, jint dwclsctx, jlong pstg, jint dwcount, jlong presults) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetInstanceFromIStorage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pserverinfo, (void*)(uintptr_t)pclsid, (void*)(uintptr_t)punkouter, (uint32_t)dwclsctx, (void*)(uintptr_t)pstg, (uint32_t)dwcount, (void*)(uintptr_t)presults) : -1;
#else
    (void)pserverinfo;
    (void)pclsid;
    (void)punkouter;
    (void)dwclsctx;
    (void)pstg;
    (void)dwcount;
    (void)presults;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1coGetInterfaceAndReleaseStream(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong iid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CoGetInterfaceAndReleaseStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)iid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)pstm;
    (void)iid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1createILockBytesOnHGlobal(JNIEnv* km_env, jclass km_clazz, jlong hglobal, jint fdeleteonrelease, jlong pplkbyt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateILockBytesOnHGlobal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hglobal, (int32_t)fdeleteonrelease, (void*)(uintptr_t)pplkbyt) : -1;
#else
    (void)hglobal;
    (void)fdeleteonrelease;
    (void)pplkbyt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1createStreamOnHGlobal(JNIEnv* km_env, jclass km_clazz, jlong hglobal, jint fdeleteonrelease, jlong ppstm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateStreamOnHGlobal");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hglobal, (int32_t)fdeleteonrelease, (void*)(uintptr_t)ppstm) : -1;
#else
    (void)hglobal;
    (void)fdeleteonrelease;
    (void)ppstm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1fmtIdToPropStgName(JNIEnv* km_env, jclass km_clazz, jlong pfmtid, jlong oszname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FmtIdToPropStgName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfmtid, (void*)(uintptr_t)oszname) : -1;
#else
    (void)pfmtid;
    (void)oszname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1freePropVariantArray(JNIEnv* km_env, jclass km_clazz, jint cvariants, jlong rgvars) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreePropVariantArray");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cvariants, (void*)(uintptr_t)rgvars) : -1;
#else
    (void)cvariants;
    (void)rgvars;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1getConvertStg(JNIEnv* km_env, jclass km_clazz, jlong pstg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetConvertStg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstg) : -1;
#else
    (void)pstg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1getHGlobalFromILockBytes(JNIEnv* km_env, jclass km_clazz, jlong plkbyt, jlong phglobal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHGlobalFromILockBytes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plkbyt, (void*)(uintptr_t)phglobal) : -1;
#else
    (void)plkbyt;
    (void)phglobal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1getHGlobalFromStream(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong phglobal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetHGlobalFromStream");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)phglobal) : -1;
#else
    (void)pstm;
    (void)phglobal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromBooleanVector(JNIEnv* km_env, jclass km_clazz, jlong prgf, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromBooleanVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgf, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgf;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromBuffer(JNIEnv* km_env, jclass km_clazz, jlong pv, jint cb, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pv, (uint32_t)cb, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)pv;
    (void)cb;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromCLSID(JNIEnv* km_env, jclass km_clazz, jlong clsid, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromCLSID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clsid, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)clsid;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromDoubleVector(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromDoubleVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromFileTime(JNIEnv* km_env, jclass km_clazz, jlong pftin, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pftin, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)pftin;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromFileTimeVector(JNIEnv* km_env, jclass km_clazz, jlong prgft, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromFileTimeVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgft, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgft;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromGUIDAsString(JNIEnv* km_env, jclass km_clazz, jlong guid, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromGUIDAsString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guid, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)guid;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromInt16Vector(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromInt16Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromInt32Vector(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromInt32Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromInt64Vector(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromInt64Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromPropVariantVectorElem(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jint ielem, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromPropVariantVectorElem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (uint32_t)ielem, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)propvarin;
    (void)ielem;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromResource(JNIEnv* km_env, jclass km_clazz, jlong hinst, jint id, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromResource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hinst, (uint32_t)id, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)hinst;
    (void)id;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromStringAsVector(JNIEnv* km_env, jclass km_clazz, jlong psz, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromStringAsVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)psz, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)psz;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromStringVector(JNIEnv* km_env, jclass km_clazz, jlong prgsz, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromStringVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgsz, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgsz;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromUInt16Vector(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromUInt16Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromUInt32Vector(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromUInt32Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantFromUInt64Vector(JNIEnv* km_env, jclass km_clazz, jlong prgn, jint celems, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromUInt64Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prgn, (uint32_t)celems, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)prgn;
    (void)celems;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1initPropVariantVectorFromPropVariant(JNIEnv* km_env, jclass km_clazz, jlong propvarsingle, jlong ppropvarvector) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantVectorFromPropVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarsingle, (void*)(uintptr_t)ppropvarvector) : -1;
#else
    (void)propvarsingle;
    (void)ppropvarvector;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1oleConvertIStorageToOLESTREAM(JNIEnv* km_env, jclass km_clazz, jlong pstg, jlong lpolestream) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertIStorageToOLESTREAM");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstg, (void*)(uintptr_t)lpolestream) : -1;
#else
    (void)pstg;
    (void)lpolestream;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1oleConvertIStorageToOLESTREAMEx(JNIEnv* km_env, jclass km_clazz, jlong pstg, jshort cfformat, jint lwidth, jint lheight, jint dwsize, jlong pmedium, jlong polestm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, int32_t, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertIStorageToOLESTREAMEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstg, (uint16_t)cfformat, (int32_t)lwidth, (int32_t)lheight, (uint32_t)dwsize, (void*)(uintptr_t)pmedium, (void*)(uintptr_t)polestm) : -1;
#else
    (void)pstg;
    (void)cfformat;
    (void)lwidth;
    (void)lheight;
    (void)dwsize;
    (void)pmedium;
    (void)polestm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1oleConvertOLESTREAMToIStorage(JNIEnv* km_env, jclass km_clazz, jlong lpolestream, jlong pstg, jlong ptd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpolestream, (void*)(uintptr_t)pstg, (void*)(uintptr_t)ptd) : -1;
#else
    (void)lpolestream;
    (void)pstg;
    (void)ptd;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1oleConvertOLESTREAMToIStorageEx(JNIEnv* km_env, jclass km_clazz, jlong polestm, jlong pstg, jlong pcfformat, jlong plwwidth, jlong plheight, jlong pdwsize, jlong pmedium) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OleConvertOLESTREAMToIStorageEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)polestm, (void*)(uintptr_t)pstg, (void*)(uintptr_t)pcfformat, (void*)(uintptr_t)plwwidth, (void*)(uintptr_t)plheight, (void*)(uintptr_t)pdwsize, (void*)(uintptr_t)pmedium) : -1;
#else
    (void)polestm;
    (void)pstg;
    (void)pcfformat;
    (void)plwwidth;
    (void)plheight;
    (void)pdwsize;
    (void)pmedium;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propStgNameToFmtId(JNIEnv* km_env, jclass km_clazz, jlong oszname, jlong pfmtid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropStgNameToFmtId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oszname, (void*)(uintptr_t)pfmtid) : -1;
#else
    (void)oszname;
    (void)pfmtid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantChangeType(JNIEnv* km_env, jclass km_clazz, jlong ppropvardest, jlong propvarsrc, jint flags, jshort vt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantChangeType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropvardest, (void*)(uintptr_t)propvarsrc, (int32_t)flags, (uint16_t)vt) : -1;
#else
    (void)ppropvardest;
    (void)propvarsrc;
    (void)flags;
    (void)vt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantClear(JNIEnv* km_env, jclass km_clazz, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantClear");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvar) : -1;
#else
    (void)pvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantCompareEx(JNIEnv* km_env, jclass km_clazz, jlong propvar1, jlong propvar2, jint unit, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantCompareEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar1, (void*)(uintptr_t)propvar2, (int32_t)unit, (int32_t)flags) : -1;
#else
    (void)propvar1;
    (void)propvar2;
    (void)unit;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantCopy(JNIEnv* km_env, jclass km_clazz, jlong pvardest, jlong pvarsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantCopy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvardest, (void*)(uintptr_t)pvarsrc) : -1;
#else
    (void)pvardest;
    (void)pvarsrc;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetBooleanElem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong pfval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetBooleanElem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)pfval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pfval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetDoubleElem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetDoubleElem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetElementCount(JNIEnv* km_env, jclass km_clazz, jlong propvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetElementCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar) : 0;
#else
    (void)propvar;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetFileTimeElem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong pftval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetFileTimeElem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)pftval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pftval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetInt16Elem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetInt16Elem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetInt32Elem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetInt32Elem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetInt64Elem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetInt64Elem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetStringElem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong ppszval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetStringElem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)ppszval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)ppszval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetUInt16Elem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetUInt16Elem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetUInt32Elem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetUInt32Elem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantGetUInt64Elem(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint ielem, jlong pnval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetUInt64Elem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (uint32_t)ielem, (void*)(uintptr_t)pnval) : -1;
#else
    (void)propvar;
    (void)ielem;
    (void)pnval;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToBSTR(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pbstrout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBSTR");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pbstrout) : -1;
#else
    (void)propvar;
    (void)pbstrout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToBoolean(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong pfret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBoolean");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (void*)(uintptr_t)pfret) : -1;
#else
    (void)propvarin;
    (void)pfret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToBooleanVector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgf, jint crgf, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBooleanVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgf, (uint32_t)crgf, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgf;
    (void)crgf;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToBooleanVectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgf, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBooleanVectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgf, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgf;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToBooleanWithDefault(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jint fdefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBooleanWithDefault");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (int32_t)fdefault) : -1;
#else
    (void)propvarin;
    (void)fdefault;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToBuffer(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pv, jint cb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pv, (uint32_t)cb) : -1;
#else
    (void)propvar;
    (void)pv;
    (void)cb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToDouble(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong pdblret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToDouble");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (void*)(uintptr_t)pdblret) : -1;
#else
    (void)propvarin;
    (void)pdblret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToDoubleVector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToDoubleVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToDoubleVectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToDoubleVectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jdouble JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToDoubleWithDefault(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jdouble dbldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef double (__stdcall *km_fn_t)(void*, double);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToDoubleWithDefault");
    }
    double km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (double)dbldefault) : 0.0;
#else
    (void)propvarin;
    (void)dbldefault;
    double km_res = 0.0;
#endif
    return (jdouble)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToFileTime(JNIEnv* km_env, jclass km_clazz, jlong propvar, jint pstfout, jlong pftout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (int32_t)pstfout, (void*)(uintptr_t)pftout) : -1;
#else
    (void)propvar;
    (void)pstfout;
    (void)pftout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToFileTimeVector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgft, jint crgft, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToFileTimeVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgft, (uint32_t)crgft, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgft;
    (void)crgft;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToFileTimeVectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgft, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToFileTimeVectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgft, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgft;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToGUID(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToGUID");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pguid) : -1;
#else
    (void)propvar;
    (void)pguid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt16(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong piret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt16");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (void*)(uintptr_t)piret) : -1;
#else
    (void)propvarin;
    (void)piret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt16Vector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt16Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt16VectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt16VectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt16WithDefault(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jshort idefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int16_t (__stdcall *km_fn_t)(void*, int16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt16WithDefault");
    }
    int16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (int16_t)idefault) : -1;
#else
    (void)propvarin;
    (void)idefault;
    int16_t km_res = -1;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt32(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong plret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (void*)(uintptr_t)plret) : -1;
#else
    (void)propvarin;
    (void)plret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt32Vector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt32Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt32VectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt32VectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt32WithDefault(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jint ldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt32WithDefault");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (int32_t)ldefault) : -1;
#else
    (void)propvarin;
    (void)ldefault;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt64(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong pllret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (void*)(uintptr_t)pllret) : -1;
#else
    (void)propvarin;
    (void)pllret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt64Vector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt64Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt64VectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt64VectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToInt64WithDefault(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong lldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToInt64WithDefault");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (int64_t)lldefault) : -1;
#else
    (void)propvarin;
    (void)lldefault;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToString(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong psz, jint cch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)psz, (uint32_t)cch) : -1;
#else
    (void)propvar;
    (void)psz;
    (void)cch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToStringAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong ppszout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStringAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)ppszout) : -1;
#else
    (void)propvar;
    (void)ppszout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToStringVector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgsz, jint crgsz, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStringVector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgsz, (uint32_t)crgsz, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgsz;
    (void)crgsz;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToStringVectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgsz, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStringVectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgsz, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgsz;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToStringWithDefault(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong pszdefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToStringWithDefault");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (void*)(uintptr_t)pszdefault) : NULL;
#else
    (void)propvarin;
    (void)pszdefault;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt16(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong puiret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt16");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (void*)(uintptr_t)puiret) : -1;
#else
    (void)propvarin;
    (void)puiret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt16Vector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt16Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt16VectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt16VectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt16WithDefault(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jshort uidefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt16WithDefault");
    }
    uint16_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (uint16_t)uidefault) : 0;
#else
    (void)propvarin;
    (void)uidefault;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt32(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong pulret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (void*)(uintptr_t)pulret) : -1;
#else
    (void)propvarin;
    (void)pulret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt32Vector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt32Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt32VectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt32VectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt32WithDefault(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jint uldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt32WithDefault");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (uint32_t)uldefault) : 0;
#else
    (void)propvarin;
    (void)uldefault;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt64(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong pullret) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (void*)(uintptr_t)pullret) : -1;
#else
    (void)propvarin;
    (void)pullret;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt64Vector(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong prgn, jint crgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt64Vector");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)prgn, (uint32_t)crgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)prgn;
    (void)crgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt64VectorAlloc(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong pprgn, jlong pcelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt64VectorAlloc");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)pprgn, (void*)(uintptr_t)pcelem) : -1;
#else
    (void)propvar;
    (void)pprgn;
    (void)pcelem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToUInt64WithDefault(JNIEnv* km_env, jclass km_clazz, jlong propvarin, jlong ulldefault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToUInt64WithDefault");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvarin, (uint64_t)ulldefault) : 0;
#else
    (void)propvarin;
    (void)ulldefault;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToVariant(JNIEnv* km_env, jclass km_clazz, jlong ppropvar, jlong pvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropvar, (void*)(uintptr_t)pvar) : -1;
#else
    (void)ppropvar;
    (void)pvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1propVariantToWinRTPropertyValue(JNIEnv* km_env, jclass km_clazz, jlong propvar, jlong riid, jlong ppv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantToWinRTPropertyValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvar, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppv) : -1;
#else
    (void)propvar;
    (void)riid;
    (void)ppv;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1readClassStg(JNIEnv* km_env, jclass km_clazz, jlong pstg, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadClassStg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstg, (void*)(uintptr_t)pclsid) : -1;
#else
    (void)pstg;
    (void)pclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1readClassStm(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong pclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadClassStm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)pclsid) : -1;
#else
    (void)pstm;
    (void)pclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1readFmtUserTypeStg(JNIEnv* km_env, jclass km_clazz, jlong pstg, jlong pcf, jlong lplpszusertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadFmtUserTypeStg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstg, (void*)(uintptr_t)pcf, (void*)(uintptr_t)lplpszusertype) : -1;
#else
    (void)pstg;
    (void)pcf;
    (void)lplpszusertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1setConvertStg(JNIEnv* km_env, jclass km_clazz, jlong pstg, jint fconvert) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetConvertStg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstg, (int32_t)fconvert) : -1;
#else
    (void)pstg;
    (void)fconvert;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgConvertPropertyToVariant(JNIEnv* km_env, jclass km_clazz, jlong pprop, jshort codepage, jlong pvar, jlong pma) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgConvertPropertyToVariant");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprop, (uint16_t)codepage, (void*)(uintptr_t)pvar, (void*)(uintptr_t)pma) : false;
#else
    (void)pprop;
    (void)codepage;
    (void)pvar;
    (void)pma;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgConvertVariantToProperty(JNIEnv* km_env, jclass km_clazz, jlong pvar, jshort codepage, jlong pprop, jlong pcb, jint pid, jboolean freserved, jlong pcindirect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgConvertVariantToProperty");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvar, (uint16_t)codepage, (void*)(uintptr_t)pprop, (void*)(uintptr_t)pcb, (uint32_t)pid, (bool)freserved, (void*)(uintptr_t)pcindirect) : NULL;
#else
    (void)pvar;
    (void)codepage;
    (void)pprop;
    (void)pcb;
    (void)pid;
    (void)freserved;
    (void)pcindirect;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgCreateDocfile(JNIEnv* km_env, jclass km_clazz, jlong pwcsname, jint grfmode, jint reserved, jlong ppstgopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreateDocfile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwcsname, (uint32_t)grfmode, (uint32_t)reserved, (void*)(uintptr_t)ppstgopen) : -1;
#else
    (void)pwcsname;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgCreateDocfileOnILockBytes(JNIEnv* km_env, jclass km_clazz, jlong plkbyt, jint grfmode, jint reserved, jlong ppstgopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreateDocfileOnILockBytes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plkbyt, (uint32_t)grfmode, (uint32_t)reserved, (void*)(uintptr_t)ppstgopen) : -1;
#else
    (void)plkbyt;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgCreatePropSetStg(JNIEnv* km_env, jclass km_clazz, jlong pstorage, jint dwreserved, jlong pppropsetstg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreatePropSetStg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstorage, (uint32_t)dwreserved, (void*)(uintptr_t)pppropsetstg) : -1;
#else
    (void)pstorage;
    (void)dwreserved;
    (void)pppropsetstg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgCreatePropStg(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong fmtid, jlong pclsid, jint grfflags, jint dwreserved, jlong pppropstg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreatePropStg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)fmtid, (void*)(uintptr_t)pclsid, (uint32_t)grfflags, (uint32_t)dwreserved, (void*)(uintptr_t)pppropstg) : -1;
#else
    (void)punk;
    (void)fmtid;
    (void)pclsid;
    (void)grfflags;
    (void)dwreserved;
    (void)pppropstg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgCreateStorageEx(JNIEnv* km_env, jclass km_clazz, jlong pwcsname, jint grfmode, jint stgfmt, jint grfattrs, jlong pstgoptions, jlong psecuritydescriptor, jlong riid, jlong ppobjectopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgCreateStorageEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwcsname, (uint32_t)grfmode, (uint32_t)stgfmt, (uint32_t)grfattrs, (void*)(uintptr_t)pstgoptions, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppobjectopen) : -1;
#else
    (void)pwcsname;
    (void)grfmode;
    (void)stgfmt;
    (void)grfattrs;
    (void)pstgoptions;
    (void)psecuritydescriptor;
    (void)riid;
    (void)ppobjectopen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgDeserializePropVariant(JNIEnv* km_env, jclass km_clazz, jlong pprop, jint cbmax, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgDeserializePropVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprop, (uint32_t)cbmax, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)pprop;
    (void)cbmax;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgGetIFillLockBytesOnFile(JNIEnv* km_env, jclass km_clazz, jlong pwcsname, jlong ppflb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgGetIFillLockBytesOnFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwcsname, (void*)(uintptr_t)ppflb) : -1;
#else
    (void)pwcsname;
    (void)ppflb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgGetIFillLockBytesOnILockBytes(JNIEnv* km_env, jclass km_clazz, jlong pilb, jlong ppflb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgGetIFillLockBytesOnILockBytes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pilb, (void*)(uintptr_t)ppflb) : -1;
#else
    (void)pilb;
    (void)ppflb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgIsStorageFile(JNIEnv* km_env, jclass km_clazz, jlong pwcsname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgIsStorageFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwcsname) : -1;
#else
    (void)pwcsname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgIsStorageILockBytes(JNIEnv* km_env, jclass km_clazz, jlong plkbyt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgIsStorageILockBytes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plkbyt) : -1;
#else
    (void)plkbyt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgOpenAsyncDocfileOnIFillLockBytes(JNIEnv* km_env, jclass km_clazz, jlong pflb, jint grfmode, jint asyncflags, jlong ppstgopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenAsyncDocfileOnIFillLockBytes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pflb, (uint32_t)grfmode, (uint32_t)asyncflags, (void*)(uintptr_t)ppstgopen) : -1;
#else
    (void)pflb;
    (void)grfmode;
    (void)asyncflags;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgOpenLayoutDocfile(JNIEnv* km_env, jclass km_clazz, jlong pwcsdfname, jint grfmode, jint reserved, jlong ppstgopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("dflayout.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenLayoutDocfile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwcsdfname, (uint32_t)grfmode, (uint32_t)reserved, (void*)(uintptr_t)ppstgopen) : -1;
#else
    (void)pwcsdfname;
    (void)grfmode;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgOpenPropStg(JNIEnv* km_env, jclass km_clazz, jlong punk, jlong fmtid, jint grfflags, jint dwreserved, jlong pppropstg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenPropStg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punk, (void*)(uintptr_t)fmtid, (uint32_t)grfflags, (uint32_t)dwreserved, (void*)(uintptr_t)pppropstg) : -1;
#else
    (void)punk;
    (void)fmtid;
    (void)grfflags;
    (void)dwreserved;
    (void)pppropstg;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgOpenStorage(JNIEnv* km_env, jclass km_clazz, jlong pwcsname, jlong pstgpriority, jint grfmode, jlong snbexclude, jint reserved, jlong ppstgopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenStorage");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwcsname, (void*)(uintptr_t)pstgpriority, (uint32_t)grfmode, (void*)(uintptr_t)snbexclude, (uint32_t)reserved, (void*)(uintptr_t)ppstgopen) : -1;
#else
    (void)pwcsname;
    (void)pstgpriority;
    (void)grfmode;
    (void)snbexclude;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgOpenStorageEx(JNIEnv* km_env, jclass km_clazz, jlong pwcsname, jint grfmode, jint stgfmt, jint grfattrs, jlong pstgoptions, jlong psecuritydescriptor, jlong riid, jlong ppobjectopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenStorageEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwcsname, (uint32_t)grfmode, (uint32_t)stgfmt, (uint32_t)grfattrs, (void*)(uintptr_t)pstgoptions, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)riid, (void*)(uintptr_t)ppobjectopen) : -1;
#else
    (void)pwcsname;
    (void)grfmode;
    (void)stgfmt;
    (void)grfattrs;
    (void)pstgoptions;
    (void)psecuritydescriptor;
    (void)riid;
    (void)ppobjectopen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgOpenStorageOnILockBytes(JNIEnv* km_env, jclass km_clazz, jlong plkbyt, jlong pstgpriority, jint grfmode, jlong snbexclude, jint reserved, jlong ppstgopen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgOpenStorageOnILockBytes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plkbyt, (void*)(uintptr_t)pstgpriority, (uint32_t)grfmode, (void*)(uintptr_t)snbexclude, (uint32_t)reserved, (void*)(uintptr_t)ppstgopen) : -1;
#else
    (void)plkbyt;
    (void)pstgpriority;
    (void)grfmode;
    (void)snbexclude;
    (void)reserved;
    (void)ppstgopen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgPropertyLengthAsVariant(JNIEnv* km_env, jclass km_clazz, jlong pprop, jint cbprop, jshort codepage, jbyte breserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint16_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgPropertyLengthAsVariant");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprop, (uint32_t)cbprop, (uint16_t)codepage, (uint8_t)breserved) : 0;
#else
    (void)pprop;
    (void)cbprop;
    (void)codepage;
    (void)breserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgSerializePropVariant(JNIEnv* km_env, jclass km_clazz, jlong ppropvar, jlong ppprop, jlong pcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgSerializePropVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropvar, (void*)(uintptr_t)ppprop, (void*)(uintptr_t)pcb) : -1;
#else
    (void)ppropvar;
    (void)ppprop;
    (void)pcb;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1stgSetTimes(JNIEnv* km_env, jclass km_clazz, jlong lpszname, jlong pctime, jlong patime, jlong pmtime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StgSetTimes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszname, (void*)(uintptr_t)pctime, (void*)(uintptr_t)patime, (void*)(uintptr_t)pmtime) : -1;
#else
    (void)lpszname;
    (void)pctime;
    (void)patime;
    (void)pmtime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1variantToPropVariant(JNIEnv* km_env, jclass km_clazz, jlong pvar, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VariantToPropVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvar, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)pvar;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1winRTPropertyValueToPropVariant(JNIEnv* km_env, jclass km_clazz, jlong punkpropertyvalue, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("propsys.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinRTPropertyValueToPropVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)punkpropertyvalue, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)punkpropertyvalue;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1writeClassStg(JNIEnv* km_env, jclass km_clazz, jlong pstg, jlong rclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteClassStg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstg, (void*)(uintptr_t)rclsid) : -1;
#else
    (void)pstg;
    (void)rclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1writeClassStm(JNIEnv* km_env, jclass km_clazz, jlong pstm, jlong rclsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteClassStm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstm, (void*)(uintptr_t)rclsid) : -1;
#else
    (void)pstm;
    (void)rclsid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_com_structuredstorage_WindowsWin32SystemComStructuredstorageJniBridge_windowssys_1windows_1win32_1system_1com_1structuredstorage_1writeFmtUserTypeStg(JNIEnv* km_env, jclass km_clazz, jlong pstg, jshort cf, jlong lpszusertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ole32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteFmtUserTypeStg");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pstg, (uint16_t)cf, (void*)(uintptr_t)lpszusertype) : -1;
#else
    (void)pstg;
    (void)cf;
    (void)lpszusertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

