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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fCIAddFile(JNIEnv* km_env, jclass km_clazz, jlong hfci, jlong pszsourcefile, jlong pszfilename, jint fexecute, jlong pfnfcignc, jlong pfnfcis, jlong pfnfcigoi, jshort typecompress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCIAddFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfci, (void*)(uintptr_t)pszsourcefile, (void*)(uintptr_t)pszfilename, (int32_t)fexecute, (void*)(uintptr_t)pfnfcignc, (void*)(uintptr_t)pfnfcis, (void*)(uintptr_t)pfnfcigoi, (uint16_t)typecompress) : -1;
#else
    (void)hfci;
    (void)pszsourcefile;
    (void)pszfilename;
    (void)fexecute;
    (void)pfnfcignc;
    (void)pfnfcis;
    (void)pfnfcigoi;
    (void)typecompress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fCICreate(JNIEnv* km_env, jclass km_clazz, jlong perf, jlong pfnfcifp, jlong pfna, jlong pfnf, jlong pfnopen, jlong pfnread, jlong pfnwrite, jlong pfnclose, jlong pfnseek, jlong pfndelete, jlong pfnfcigtf, jlong pccab, jlong pv) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCICreate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)perf, (void*)(uintptr_t)pfnfcifp, (void*)(uintptr_t)pfna, (void*)(uintptr_t)pfnf, (void*)(uintptr_t)pfnopen, (void*)(uintptr_t)pfnread, (void*)(uintptr_t)pfnwrite, (void*)(uintptr_t)pfnclose, (void*)(uintptr_t)pfnseek, (void*)(uintptr_t)pfndelete, (void*)(uintptr_t)pfnfcigtf, (void*)(uintptr_t)pccab, (void*)(uintptr_t)pv) : NULL;
#else
    (void)perf;
    (void)pfnfcifp;
    (void)pfna;
    (void)pfnf;
    (void)pfnopen;
    (void)pfnread;
    (void)pfnwrite;
    (void)pfnclose;
    (void)pfnseek;
    (void)pfndelete;
    (void)pfnfcigtf;
    (void)pccab;
    (void)pv;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fCIDestroy(JNIEnv* km_env, jclass km_clazz, jlong hfci) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCIDestroy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfci) : -1;
#else
    (void)hfci;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fCIFlushCabinet(JNIEnv* km_env, jclass km_clazz, jlong hfci, jint fgetnextcab, jlong pfnfcignc, jlong pfnfcis) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCIFlushCabinet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfci, (int32_t)fgetnextcab, (void*)(uintptr_t)pfnfcignc, (void*)(uintptr_t)pfnfcis) : -1;
#else
    (void)hfci;
    (void)fgetnextcab;
    (void)pfnfcignc;
    (void)pfnfcis;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fCIFlushFolder(JNIEnv* km_env, jclass km_clazz, jlong hfci, jlong pfnfcignc, jlong pfnfcis) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FCIFlushFolder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfci, (void*)(uintptr_t)pfnfcignc, (void*)(uintptr_t)pfnfcis) : -1;
#else
    (void)hfci;
    (void)pfnfcignc;
    (void)pfnfcis;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fDICopy(JNIEnv* km_env, jclass km_clazz, jlong hfdi, jlong pszcabinet, jlong pszcabpath, jint flags, jlong pfnfdin, jlong pfnfdid, jlong pvuser) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDICopy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfdi, (void*)(uintptr_t)pszcabinet, (void*)(uintptr_t)pszcabpath, (int32_t)flags, (void*)(uintptr_t)pfnfdin, (void*)(uintptr_t)pfnfdid, (void*)(uintptr_t)pvuser) : -1;
#else
    (void)hfdi;
    (void)pszcabinet;
    (void)pszcabpath;
    (void)flags;
    (void)pfnfdin;
    (void)pfnfdid;
    (void)pvuser;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fDICreate(JNIEnv* km_env, jclass km_clazz, jlong pfnalloc, jlong pfnfree, jlong pfnopen, jlong pfnread, jlong pfnwrite, jlong pfnclose, jlong pfnseek, jint cputype, jlong perf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDICreate");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfnalloc, (void*)(uintptr_t)pfnfree, (void*)(uintptr_t)pfnopen, (void*)(uintptr_t)pfnread, (void*)(uintptr_t)pfnwrite, (void*)(uintptr_t)pfnclose, (void*)(uintptr_t)pfnseek, (int32_t)cputype, (void*)(uintptr_t)perf) : NULL;
#else
    (void)pfnalloc;
    (void)pfnfree;
    (void)pfnopen;
    (void)pfnread;
    (void)pfnwrite;
    (void)pfnclose;
    (void)pfnseek;
    (void)cputype;
    (void)perf;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fDIDestroy(JNIEnv* km_env, jclass km_clazz, jlong hfdi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDIDestroy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfdi) : -1;
#else
    (void)hfdi;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fDIIsCabinet(JNIEnv* km_env, jclass km_clazz, jlong hfdi, jlong hf, jlong pfdici) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDIIsCabinet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfdi, (int64_t)hf, (void*)(uintptr_t)pfdici) : -1;
#else
    (void)hfdi;
    (void)hf;
    (void)pfdici;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_cabinets_WindowsWin32StorageCabinetsJniBridge_windowssys_1windows_1win32_1storage_1cabinets_1fDITruncateCabinet(JNIEnv* km_env, jclass km_clazz, jlong hfdi, jlong pszcabinetname, jshort ifoldertodelete) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("cabinet.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FDITruncateCabinet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfdi, (void*)(uintptr_t)pszcabinetname, (uint16_t)ifoldertodelete) : -1;
#else
    (void)hfdi;
    (void)pszcabinetname;
    (void)ifoldertodelete;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

