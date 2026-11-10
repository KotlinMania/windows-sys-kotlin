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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1addLogContainer(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pcbcontainer, jlong pwszcontainerpath, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddLogContainer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pcbcontainer, (void*)(uintptr_t)pwszcontainerpath, (void*)(uintptr_t)preserved) : -1;
#else
    (void)hlog;
    (void)pcbcontainer;
    (void)pwszcontainerpath;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1addLogContainerSet(JNIEnv* km_env, jclass km_clazz, jlong hlog, jshort ccontainer, jlong pcbcontainer, jlong rgwszcontainerpath, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddLogContainerSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (uint16_t)ccontainer, (void*)(uintptr_t)pcbcontainer, (void*)(uintptr_t)rgwszcontainerpath, (void*)(uintptr_t)preserved) : -1;
#else
    (void)hlog;
    (void)ccontainer;
    (void)pcbcontainer;
    (void)rgwszcontainerpath;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1addUsersToEncryptedFile(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong pencryptioncertificates) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddUsersToEncryptedFile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)pencryptioncertificates) : 0;
#else
    (void)lpfilename;
    (void)pencryptioncertificates;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1advanceLogBase(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jlong plsnbase, jint fflags, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AdvanceLogBase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (void*)(uintptr_t)plsnbase, (uint32_t)fflags, (void*)(uintptr_t)poverlapped) : -1;
#else
    (void)pvmarshal;
    (void)plsnbase;
    (void)fflags;
    (void)poverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1alignReservedLog(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jint creservedrecords, jlong rgcbreservation, jlong pcbalignreservation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AlignReservedLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (uint32_t)creservedrecords, (void*)(uintptr_t)rgcbreservation, (void*)(uintptr_t)pcbalignreservation) : -1;
#else
    (void)pvmarshal;
    (void)creservedrecords;
    (void)rgcbreservation;
    (void)pcbalignreservation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1allocReservedLog(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jint creservedrecords, jlong pcbadjustment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AllocReservedLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (uint32_t)creservedrecords, (void*)(uintptr_t)pcbadjustment) : -1;
#else
    (void)pvmarshal;
    (void)creservedrecords;
    (void)pcbadjustment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1areFileApisANSI(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreFileApisANSI");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1areShortNamesEnabled(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong enabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AreShortNamesEnabled");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)enabled) : -1;
#else
    (void)handle;
    (void)enabled;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1backupRead(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint nnumberofbytestoread, jlong lpnumberofbytesread, jint babort, jint bprocesssecurity, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupRead");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofbytestoread, (void*)(uintptr_t)lpnumberofbytesread, (int32_t)babort, (int32_t)bprocesssecurity, (void*)(uintptr_t)lpcontext) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)lpnumberofbytesread;
    (void)babort;
    (void)bprocesssecurity;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1backupSeek(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint dwlowbytestoseek, jint dwhighbytestoseek, jlong lpdwlowbyteseeked, jlong lpdwhighbyteseeked, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupSeek");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)dwlowbytestoseek, (uint32_t)dwhighbytestoseek, (void*)(uintptr_t)lpdwlowbyteseeked, (void*)(uintptr_t)lpdwhighbyteseeked, (void*)(uintptr_t)lpcontext) : -1;
#else
    (void)hfile;
    (void)dwlowbytestoseek;
    (void)dwhighbytestoseek;
    (void)lpdwlowbyteseeked;
    (void)lpdwhighbyteseeked;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1backupWrite(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint nnumberofbytestowrite, jlong lpnumberofbyteswritten, jint babort, jint bprocesssecurity, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofbytestowrite, (void*)(uintptr_t)lpnumberofbyteswritten, (int32_t)babort, (int32_t)bprocesssecurity, (void*)(uintptr_t)lpcontext) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestowrite;
    (void)lpnumberofbyteswritten;
    (void)babort;
    (void)bprocesssecurity;
    (void)lpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1buildIoRingRegisterBuffers(JNIEnv* km_env, jclass km_clazz, jlong ioring, jint count, jlong buffers, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildIoRingRegisterBuffers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ioring, (uint32_t)count, (void*)(uintptr_t)buffers, (uint64_t)userdata) : -1;
#else
    (void)ioring;
    (void)count;
    (void)buffers;
    (void)userdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1buildIoRingRegisterFileHandles(JNIEnv* km_env, jclass km_clazz, jlong ioring, jint count, jlong handles, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BuildIoRingRegisterFileHandles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ioring, (uint32_t)count, (void*)(uintptr_t)handles, (uint64_t)userdata) : -1;
#else
    (void)ioring;
    (void)count;
    (void)handles;
    (void)userdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1checkNameLegalDOS8Dot3A(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpoemname, jint oemnamesize, jlong pbnamecontainsspaces, jlong pbnamelegal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckNameLegalDOS8Dot3A");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpoemname, (uint32_t)oemnamesize, (void*)(uintptr_t)pbnamecontainsspaces, (void*)(uintptr_t)pbnamelegal) : -1;
#else
    (void)lpname;
    (void)lpoemname;
    (void)oemnamesize;
    (void)pbnamecontainsspaces;
    (void)pbnamelegal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1checkNameLegalDOS8Dot3W(JNIEnv* km_env, jclass km_clazz, jlong lpname, jlong lpoemname, jint oemnamesize, jlong pbnamecontainsspaces, jlong pbnamelegal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckNameLegalDOS8Dot3W");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpname, (void*)(uintptr_t)lpoemname, (uint32_t)oemnamesize, (void*)(uintptr_t)pbnamecontainsspaces, (void*)(uintptr_t)pbnamelegal) : -1;
#else
    (void)lpname;
    (void)lpoemname;
    (void)oemnamesize;
    (void)pbnamecontainsspaces;
    (void)pbnamelegal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1closeAndResetLogFile(JNIEnv* km_env, jclass km_clazz, jlong hlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseAndResetLogFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog) : -1;
#else
    (void)hlog;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1closeEncryptedFileRaw(JNIEnv* km_env, jclass km_clazz, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseEncryptedFileRaw");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pvcontext);
#else
    (void)pvcontext;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1closeIoRing(JNIEnv* km_env, jclass km_clazz, jlong ioring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseIoRing");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ioring) : -1;
#else
    (void)ioring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1commitComplete(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommitComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1commitEnlistment(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommitEnlistment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1commitTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommitTransaction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionhandle) : -1;
#else
    (void)transactionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1commitTransactionAsync(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CommitTransactionAsync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionhandle) : -1;
#else
    (void)transactionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1compareFileTime(JNIEnv* km_env, jclass km_clazz, jlong lpfiletime1, jlong lpfiletime2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompareFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiletime1, (void*)(uintptr_t)lpfiletime2) : -1;
#else
    (void)lpfiletime1;
    (void)lpfiletime2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1copyFile2(JNIEnv* km_env, jclass km_clazz, jlong pwszexistingfilename, jlong pwsznewfilename, jlong pextendedparameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFile2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszexistingfilename, (void*)(uintptr_t)pwsznewfilename, (void*)(uintptr_t)pextendedparameters) : -1;
#else
    (void)pwszexistingfilename;
    (void)pwsznewfilename;
    (void)pextendedparameters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1copyFileA(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jint bfailifexists) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (int32_t)bfailifexists) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)bfailifexists;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1copyFileExA(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jlong lpprogressroutine, jlong lpdata, jlong pbcancel, jint dwcopyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (void*)(uintptr_t)lpprogressroutine, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)pbcancel, (uint32_t)dwcopyflags) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)pbcancel;
    (void)dwcopyflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1copyFileExW(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jlong lpprogressroutine, jlong lpdata, jlong pbcancel, jint dwcopyflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (void*)(uintptr_t)lpprogressroutine, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)pbcancel, (uint32_t)dwcopyflags) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)pbcancel;
    (void)dwcopyflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1copyFileFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jint bfailifexists) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileFromAppW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (int32_t)bfailifexists) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)bfailifexists;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1copyFileTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jlong lpprogressroutine, jlong lpdata, jlong pbcancel, jint dwcopyflags, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileTransactedA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (void*)(uintptr_t)lpprogressroutine, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)pbcancel, (uint32_t)dwcopyflags, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)pbcancel;
    (void)dwcopyflags;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1copyFileTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jlong lpprogressroutine, jlong lpdata, jlong pbcancel, jint dwcopyflags, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileTransactedW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (void*)(uintptr_t)lpprogressroutine, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)pbcancel, (uint32_t)dwcopyflags, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)pbcancel;
    (void)dwcopyflags;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1copyFileW(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jint bfailifexists) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (int32_t)bfailifexists) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)bfailifexists;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1copyLZFile(JNIEnv* km_env, jclass km_clazz, jint hfsource, jint hfdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CopyLZFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfsource, (int32_t)hfdest) : -1;
#else
    (void)hfsource;
    (void)hfdest;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (void*)(uintptr_t)lpsecurityattributes) : -1;
#else
    (void)lppathname;
    (void)lpsecurityattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createDirectoryExA(JNIEnv* km_env, jclass km_clazz, jlong lptemplatedirectory, jlong lpnewdirectory, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptemplatedirectory, (void*)(uintptr_t)lpnewdirectory, (void*)(uintptr_t)lpsecurityattributes) : -1;
#else
    (void)lptemplatedirectory;
    (void)lpnewdirectory;
    (void)lpsecurityattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createDirectoryExW(JNIEnv* km_env, jclass km_clazz, jlong lptemplatedirectory, jlong lpnewdirectory, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptemplatedirectory, (void*)(uintptr_t)lpnewdirectory, (void*)(uintptr_t)lpsecurityattributes) : -1;
#else
    (void)lptemplatedirectory;
    (void)lpnewdirectory;
    (void)lpsecurityattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createDirectoryFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryFromAppW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (void*)(uintptr_t)lpsecurityattributes) : -1;
#else
    (void)lppathname;
    (void)lpsecurityattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createDirectoryTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lptemplatedirectory, jlong lpnewdirectory, jlong lpsecurityattributes, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryTransactedA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptemplatedirectory, (void*)(uintptr_t)lpnewdirectory, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lptemplatedirectory;
    (void)lpnewdirectory;
    (void)lpsecurityattributes;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createDirectoryTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lptemplatedirectory, jlong lpnewdirectory, jlong lpsecurityattributes, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryTransactedW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptemplatedirectory, (void*)(uintptr_t)lpnewdirectory, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lptemplatedirectory;
    (void)lpnewdirectory;
    (void)lpsecurityattributes;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (void*)(uintptr_t)lpsecurityattributes) : -1;
#else
    (void)lppathname;
    (void)lpsecurityattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createEnlistment(JNIEnv* km_env, jclass km_clazz, jlong lpenlistmentattributes, jlong resourcemanagerhandle, jlong transactionhandle, jint notificationmask, jint createoptions, jlong enlistmentkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEnlistment");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpenlistmentattributes, (void*)(uintptr_t)resourcemanagerhandle, (void*)(uintptr_t)transactionhandle, (uint32_t)notificationmask, (uint32_t)createoptions, (void*)(uintptr_t)enlistmentkey) : NULL;
#else
    (void)lpenlistmentattributes;
    (void)resourcemanagerhandle;
    (void)transactionhandle;
    (void)notificationmask;
    (void)createoptions;
    (void)enlistmentkey;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createFile2(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwdesiredaccess, jint dwsharemode, jint dwcreationdisposition, jlong pcreateexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFile2");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (uint32_t)dwcreationdisposition, (void*)(uintptr_t)pcreateexparams) : NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationdisposition;
    (void)pcreateexparams;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createFile2FromAppW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwdesiredaccess, jint dwsharemode, jint dwcreationdisposition, jlong pcreateexparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFile2FromAppW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (uint32_t)dwcreationdisposition, (void*)(uintptr_t)pcreateexparams) : NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwcreationdisposition;
    (void)pcreateexparams;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createFileA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwdesiredaccess, jint dwsharemode, jlong lpsecurityattributes, jint dwcreationdisposition, jint dwflagsandattributes, jlong htemplatefile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)dwcreationdisposition, (uint32_t)dwflagsandattributes, (void*)(uintptr_t)htemplatefile) : NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createFileFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwdesiredaccess, jint dwsharemode, jlong lpsecurityattributes, jint dwcreationdisposition, jint dwflagsandattributes, jlong htemplatefile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileFromAppW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)dwcreationdisposition, (uint32_t)dwflagsandattributes, (void*)(uintptr_t)htemplatefile) : NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createFileTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwdesiredaccess, jint dwsharemode, jlong lpsecurityattributes, jint dwcreationdisposition, jint dwflagsandattributes, jlong htemplatefile, jlong htransaction, jlong pusminiversion, jlong lpextendedparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileTransactedA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)dwcreationdisposition, (uint32_t)dwflagsandattributes, (void*)(uintptr_t)htemplatefile, (void*)(uintptr_t)htransaction, (void*)(uintptr_t)pusminiversion, (void*)(uintptr_t)lpextendedparameter) : NULL;
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
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createFileTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwdesiredaccess, jint dwsharemode, jlong lpsecurityattributes, jint dwcreationdisposition, jint dwflagsandattributes, jlong htemplatefile, jlong htransaction, jlong pusminiversion, jlong lpextendedparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileTransactedW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)dwcreationdisposition, (uint32_t)dwflagsandattributes, (void*)(uintptr_t)htemplatefile, (void*)(uintptr_t)htransaction, (void*)(uintptr_t)pusminiversion, (void*)(uintptr_t)lpextendedparameter) : NULL;
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
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createFileW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwdesiredaccess, jint dwsharemode, jlong lpsecurityattributes, jint dwcreationdisposition, jint dwflagsandattributes, jlong htemplatefile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)dwcreationdisposition, (uint32_t)dwflagsandattributes, (void*)(uintptr_t)htemplatefile) : NULL;
#else
    (void)lpfilename;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwcreationdisposition;
    (void)dwflagsandattributes;
    (void)htemplatefile;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createHardLinkA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpexistingfilename, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHardLinkA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpsecurityattributes) : -1;
#else
    (void)lpfilename;
    (void)lpexistingfilename;
    (void)lpsecurityattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createHardLinkTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpexistingfilename, jlong lpsecurityattributes, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHardLinkTransactedA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpfilename;
    (void)lpexistingfilename;
    (void)lpsecurityattributes;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createHardLinkTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpexistingfilename, jlong lpsecurityattributes, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHardLinkTransactedW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpfilename;
    (void)lpexistingfilename;
    (void)lpsecurityattributes;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createHardLinkW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpexistingfilename, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateHardLinkW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpsecurityattributes) : -1;
#else
    (void)lpfilename;
    (void)lpexistingfilename;
    (void)lpsecurityattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createLogContainerScanContext(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint cfromcontainer, jint ccontainers, jbyte escanmode, jlong pcxscan, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateLogContainerScanContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (uint32_t)cfromcontainer, (uint32_t)ccontainers, (uint8_t)escanmode, (void*)(uintptr_t)pcxscan, (void*)(uintptr_t)poverlapped) : -1;
#else
    (void)hlog;
    (void)cfromcontainer;
    (void)ccontainers;
    (void)escanmode;
    (void)pcxscan;
    (void)poverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createLogFile(JNIEnv* km_env, jclass km_clazz, jlong pszlogfilename, jint fdesiredaccess, jint dwsharemode, jlong psalogfile, jint fcreatedisposition, jint fflagsandattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateLogFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlogfilename, (uint32_t)fdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)psalogfile, (uint32_t)fcreatedisposition, (uint32_t)fflagsandattributes) : NULL;
#else
    (void)pszlogfilename;
    (void)fdesiredaccess;
    (void)dwsharemode;
    (void)psalogfile;
    (void)fcreatedisposition;
    (void)fflagsandattributes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createLogMarshallingArea(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pfnallocbuffer, jlong pfnfreebuffer, jlong pvblockalloccontext, jint cbmarshallingbuffer, jint cmaxwritebuffers, jint cmaxreadbuffers, jlong ppvmarshal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateLogMarshallingArea");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pfnallocbuffer, (void*)(uintptr_t)pfnfreebuffer, (void*)(uintptr_t)pvblockalloccontext, (uint32_t)cbmarshallingbuffer, (uint32_t)cmaxwritebuffers, (uint32_t)cmaxreadbuffers, (void*)(uintptr_t)ppvmarshal) : -1;
#else
    (void)hlog;
    (void)pfnallocbuffer;
    (void)pfnfreebuffer;
    (void)pvblockalloccontext;
    (void)cbmarshallingbuffer;
    (void)cmaxwritebuffers;
    (void)cmaxreadbuffers;
    (void)ppvmarshal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createResourceManager(JNIEnv* km_env, jclass km_clazz, jlong lpresourcemanagerattributes, jlong resourcemanagerid, jint createoptions, jlong tmhandle, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateResourceManager");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpresourcemanagerattributes, (void*)(uintptr_t)resourcemanagerid, (uint32_t)createoptions, (void*)(uintptr_t)tmhandle, (void*)(uintptr_t)description) : NULL;
#else
    (void)lpresourcemanagerattributes;
    (void)resourcemanagerid;
    (void)createoptions;
    (void)tmhandle;
    (void)description;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createSymbolicLinkA(JNIEnv* km_env, jclass km_clazz, jlong lpsymlinkfilename, jlong lptargetfilename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSymbolicLinkA");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsymlinkfilename, (void*)(uintptr_t)lptargetfilename, (uint32_t)dwflags) : false;
#else
    (void)lpsymlinkfilename;
    (void)lptargetfilename;
    (void)dwflags;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createSymbolicLinkTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpsymlinkfilename, jlong lptargetfilename, jint dwflags, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSymbolicLinkTransactedA");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsymlinkfilename, (void*)(uintptr_t)lptargetfilename, (uint32_t)dwflags, (void*)(uintptr_t)htransaction) : false;
#else
    (void)lpsymlinkfilename;
    (void)lptargetfilename;
    (void)dwflags;
    (void)htransaction;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createSymbolicLinkTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpsymlinkfilename, jlong lptargetfilename, jint dwflags, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSymbolicLinkTransactedW");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsymlinkfilename, (void*)(uintptr_t)lptargetfilename, (uint32_t)dwflags, (void*)(uintptr_t)htransaction) : false;
#else
    (void)lpsymlinkfilename;
    (void)lptargetfilename;
    (void)dwflags;
    (void)htransaction;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createSymbolicLinkW(JNIEnv* km_env, jclass km_clazz, jlong lpsymlinkfilename, jlong lptargetfilename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSymbolicLinkW");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsymlinkfilename, (void*)(uintptr_t)lptargetfilename, (uint32_t)dwflags) : false;
#else
    (void)lpsymlinkfilename;
    (void)lptargetfilename;
    (void)dwflags;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createTapePartition(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint dwpartitionmethod, jint dwcount, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTapePartition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)dwpartitionmethod, (uint32_t)dwcount, (uint32_t)dwsize) : 0;
#else
    (void)hdevice;
    (void)dwpartitionmethod;
    (void)dwcount;
    (void)dwsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createTransaction(JNIEnv* km_env, jclass km_clazz, jlong lptransactionattributes, jlong uow, jint createoptions, jint isolationlevel, jint isolationflags, jint timeout, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTransaction");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptransactionattributes, (void*)(uintptr_t)uow, (uint32_t)createoptions, (uint32_t)isolationlevel, (uint32_t)isolationflags, (uint32_t)timeout, (void*)(uintptr_t)description) : NULL;
#else
    (void)lptransactionattributes;
    (void)uow;
    (void)createoptions;
    (void)isolationlevel;
    (void)isolationflags;
    (void)timeout;
    (void)description;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1createTransactionManager(JNIEnv* km_env, jclass km_clazz, jlong lptransactionattributes, jlong logfilename, jint createoptions, jint commitstrength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTransactionManager");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptransactionattributes, (void*)(uintptr_t)logfilename, (uint32_t)createoptions, (uint32_t)commitstrength) : NULL;
#else
    (void)lptransactionattributes;
    (void)logfilename;
    (void)createoptions;
    (void)commitstrength;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1decryptFileA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecryptFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwreserved) : -1;
#else
    (void)lpfilename;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1decryptFileW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DecryptFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwreserved) : -1;
#else
    (void)lpfilename;
    (void)dwreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1defineDosDeviceA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpdevicename, jlong lptargetpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefineDosDeviceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpdevicename, (void*)(uintptr_t)lptargetpath) : -1;
#else
    (void)dwflags;
    (void)lpdevicename;
    (void)lptargetpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1defineDosDeviceW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpdevicename, jlong lptargetpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DefineDosDeviceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpdevicename, (void*)(uintptr_t)lptargetpath) : -1;
#else
    (void)dwflags;
    (void)lpdevicename;
    (void)lptargetpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteFileA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteFileFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileFromAppW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteFileTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileTransactedA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpfilename;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteFileTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileTransactedW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpfilename;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteFileW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteLogByHandle(JNIEnv* km_env, jclass km_clazz, jlong hlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteLogByHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog) : -1;
#else
    (void)hlog;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteLogFile(JNIEnv* km_env, jclass km_clazz, jlong pszlogfilename, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteLogFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlogfilename, (void*)(uintptr_t)pvreserved) : -1;
#else
    (void)pszlogfilename;
    (void)pvreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteLogMarshallingArea(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteLogMarshallingArea");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal) : -1;
#else
    (void)pvmarshal;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteVolumeMountPointA(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumemountpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteVolumeMountPointA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumemountpoint) : -1;
#else
    (void)lpszvolumemountpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deleteVolumeMountPointW(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumemountpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteVolumeMountPointW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumemountpoint) : -1;
#else
    (void)lpszvolumemountpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1deregisterManageableLogClient(JNIEnv* km_env, jclass km_clazz, jlong hlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeregisterManageableLogClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog) : -1;
#else
    (void)hlog;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1duplicateEncryptionInfoFile(JNIEnv* km_env, jclass km_clazz, jlong srcfilename, jlong dstfilename, jint dwcreationdistribution, jint dwattributes, jlong lpsecurityattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicateEncryptionInfoFile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)srcfilename, (void*)(uintptr_t)dstfilename, (uint32_t)dwcreationdistribution, (uint32_t)dwattributes, (void*)(uintptr_t)lpsecurityattributes) : 0;
#else
    (void)srcfilename;
    (void)dstfilename;
    (void)dwcreationdistribution;
    (void)dwattributes;
    (void)lpsecurityattributes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1encryptFileA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncryptFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1encryptFileW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncryptFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : -1;
#else
    (void)lpfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1encryptionDisable(JNIEnv* km_env, jclass km_clazz, jlong dirpath, jint disable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EncryptionDisable");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dirpath, (int32_t)disable) : -1;
#else
    (void)dirpath;
    (void)disable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1eraseTape(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint dwerasetype, jint bimmediate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EraseTape");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)dwerasetype, (int32_t)bimmediate) : 0;
#else
    (void)hdevice;
    (void)dwerasetype;
    (void)bimmediate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1fileEncryptionStatusA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileEncryptionStatusA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpstatus) : -1;
#else
    (void)lpfilename;
    (void)lpstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1fileEncryptionStatusW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileEncryptionStatusW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpstatus) : -1;
#else
    (void)lpfilename;
    (void)lpstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1fileTimeToLocalFileTime(JNIEnv* km_env, jclass km_clazz, jlong lpfiletime, jlong lplocalfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FileTimeToLocalFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfiletime, (void*)(uintptr_t)lplocalfiletime) : -1;
#else
    (void)lpfiletime;
    (void)lplocalfiletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findClose(JNIEnv* km_env, jclass km_clazz, jlong hfindfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindfile) : -1;
#else
    (void)hfindfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findCloseChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hchangehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindCloseChangeNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hchangehandle) : -1;
#else
    (void)hchangehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstChangeNotificationA(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jint bwatchsubtree, jint dwnotifyfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstChangeNotificationA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (int32_t)bwatchsubtree, (uint32_t)dwnotifyfilter) : NULL;
#else
    (void)lppathname;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstChangeNotificationW(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jint bwatchsubtree, jint dwnotifyfilter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstChangeNotificationW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (int32_t)bwatchsubtree, (uint32_t)dwnotifyfilter) : NULL;
#else
    (void)lppathname;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstFileA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpfindfiledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpfindfiledata) : NULL;
#else
    (void)lpfilename;
    (void)lpfindfiledata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstFileExA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfindfiledata, jint fsearchop, jlong lpsearchfilter, jint dwadditionalflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileExA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfindfiledata, (int32_t)fsearchop, (void*)(uintptr_t)lpsearchfilter, (uint32_t)dwadditionalflags) : NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstFileExFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfindfiledata, jint fsearchop, jlong lpsearchfilter, jint dwadditionalflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileExFromAppW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfindfiledata, (int32_t)fsearchop, (void*)(uintptr_t)lpsearchfilter, (uint32_t)dwadditionalflags) : NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstFileExW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfindfiledata, jint fsearchop, jlong lpsearchfilter, jint dwadditionalflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileExW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfindfiledata, (int32_t)fsearchop, (void*)(uintptr_t)lpsearchfilter, (uint32_t)dwadditionalflags) : NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstFileNameTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwflags, jlong stringlength, jlong linkname, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileNameTransactedW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwflags, (void*)(uintptr_t)stringlength, (void*)(uintptr_t)linkname, (void*)(uintptr_t)htransaction) : NULL;
#else
    (void)lpfilename;
    (void)dwflags;
    (void)stringlength;
    (void)linkname;
    (void)htransaction;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstFileNameW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwflags, jlong stringlength, jlong linkname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileNameW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwflags, (void*)(uintptr_t)stringlength, (void*)(uintptr_t)linkname) : NULL;
#else
    (void)lpfilename;
    (void)dwflags;
    (void)stringlength;
    (void)linkname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstFileTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfindfiledata, jint fsearchop, jlong lpsearchfilter, jint dwadditionalflags, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileTransactedA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfindfiledata, (int32_t)fsearchop, (void*)(uintptr_t)lpsearchfilter, (uint32_t)dwadditionalflags, (void*)(uintptr_t)htransaction) : NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    (void)htransaction;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstFileTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfindfiledata, jint fsearchop, jlong lpsearchfilter, jint dwadditionalflags, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileTransactedW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfindfiledata, (int32_t)fsearchop, (void*)(uintptr_t)lpsearchfilter, (uint32_t)dwadditionalflags, (void*)(uintptr_t)htransaction) : NULL;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfindfiledata;
    (void)fsearchop;
    (void)lpsearchfilter;
    (void)dwadditionalflags;
    (void)htransaction;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstFileW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpfindfiledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstFileW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpfindfiledata) : NULL;
#else
    (void)lpfilename;
    (void)lpfindfiledata;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstStreamTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint infolevel, jlong lpfindstreamdata, jint dwflags, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstStreamTransactedW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)infolevel, (void*)(uintptr_t)lpfindstreamdata, (uint32_t)dwflags, (void*)(uintptr_t)htransaction) : NULL;
#else
    (void)lpfilename;
    (void)infolevel;
    (void)lpfindstreamdata;
    (void)dwflags;
    (void)htransaction;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstStreamW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint infolevel, jlong lpfindstreamdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstStreamW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)infolevel, (void*)(uintptr_t)lpfindstreamdata, (uint32_t)dwflags) : NULL;
#else
    (void)lpfilename;
    (void)infolevel;
    (void)lpfindstreamdata;
    (void)dwflags;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstVolumeA(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumename, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstVolumeA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumename, (uint32_t)cchbufferlength) : NULL;
#else
    (void)lpszvolumename;
    (void)cchbufferlength;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstVolumeMountPointA(JNIEnv* km_env, jclass km_clazz, jlong lpszrootpathname, jlong lpszvolumemountpoint, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstVolumeMountPointA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszrootpathname, (void*)(uintptr_t)lpszvolumemountpoint, (uint32_t)cchbufferlength) : NULL;
#else
    (void)lpszrootpathname;
    (void)lpszvolumemountpoint;
    (void)cchbufferlength;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstVolumeMountPointW(JNIEnv* km_env, jclass km_clazz, jlong lpszrootpathname, jlong lpszvolumemountpoint, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstVolumeMountPointW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszrootpathname, (void*)(uintptr_t)lpszvolumemountpoint, (uint32_t)cchbufferlength) : NULL;
#else
    (void)lpszrootpathname;
    (void)lpszvolumemountpoint;
    (void)cchbufferlength;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findFirstVolumeW(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumename, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindFirstVolumeW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumename, (uint32_t)cchbufferlength) : NULL;
#else
    (void)lpszvolumename;
    (void)cchbufferlength;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findNextChangeNotification(JNIEnv* km_env, jclass km_clazz, jlong hchangehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextChangeNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hchangehandle) : -1;
#else
    (void)hchangehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findNextFileA(JNIEnv* km_env, jclass km_clazz, jlong hfindfile, jlong lpfindfiledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindfile, (void*)(uintptr_t)lpfindfiledata) : -1;
#else
    (void)hfindfile;
    (void)lpfindfiledata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findNextFileNameW(JNIEnv* km_env, jclass km_clazz, jlong hfindstream, jlong stringlength, jlong linkname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextFileNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindstream, (void*)(uintptr_t)stringlength, (void*)(uintptr_t)linkname) : -1;
#else
    (void)hfindstream;
    (void)stringlength;
    (void)linkname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findNextFileW(JNIEnv* km_env, jclass km_clazz, jlong hfindfile, jlong lpfindfiledata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindfile, (void*)(uintptr_t)lpfindfiledata) : -1;
#else
    (void)hfindfile;
    (void)lpfindfiledata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findNextStreamW(JNIEnv* km_env, jclass km_clazz, jlong hfindstream, jlong lpfindstreamdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextStreamW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindstream, (void*)(uintptr_t)lpfindstreamdata) : -1;
#else
    (void)hfindstream;
    (void)lpfindstreamdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findNextVolumeA(JNIEnv* km_env, jclass km_clazz, jlong hfindvolume, jlong lpszvolumename, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextVolumeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindvolume, (void*)(uintptr_t)lpszvolumename, (uint32_t)cchbufferlength) : -1;
#else
    (void)hfindvolume;
    (void)lpszvolumename;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findNextVolumeMountPointA(JNIEnv* km_env, jclass km_clazz, jlong hfindvolumemountpoint, jlong lpszvolumemountpoint, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextVolumeMountPointA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindvolumemountpoint, (void*)(uintptr_t)lpszvolumemountpoint, (uint32_t)cchbufferlength) : -1;
#else
    (void)hfindvolumemountpoint;
    (void)lpszvolumemountpoint;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findNextVolumeMountPointW(JNIEnv* km_env, jclass km_clazz, jlong hfindvolumemountpoint, jlong lpszvolumemountpoint, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextVolumeMountPointW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindvolumemountpoint, (void*)(uintptr_t)lpszvolumemountpoint, (uint32_t)cchbufferlength) : -1;
#else
    (void)hfindvolumemountpoint;
    (void)lpszvolumemountpoint;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findNextVolumeW(JNIEnv* km_env, jclass km_clazz, jlong hfindvolume, jlong lpszvolumename, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindNextVolumeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindvolume, (void*)(uintptr_t)lpszvolumename, (uint32_t)cchbufferlength) : -1;
#else
    (void)hfindvolume;
    (void)lpszvolumename;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findVolumeClose(JNIEnv* km_env, jclass km_clazz, jlong hfindvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindVolumeClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindvolume) : -1;
#else
    (void)hfindvolume;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1findVolumeMountPointClose(JNIEnv* km_env, jclass km_clazz, jlong hfindvolumemountpoint) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindVolumeMountPointClose");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfindvolumemountpoint) : -1;
#else
    (void)hfindvolumemountpoint;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1flushFileBuffers(JNIEnv* km_env, jclass km_clazz, jlong hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushFileBuffers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile) : -1;
#else
    (void)hfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1flushLogBuffers(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushLogBuffers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (void*)(uintptr_t)poverlapped) : -1;
#else
    (void)pvmarshal;
    (void)poverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1flushLogToLsn(JNIEnv* km_env, jclass km_clazz, jlong pvmarshalcontext, jlong plsnflush, jlong plsnlastflushed, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushLogToLsn");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshalcontext, (void*)(uintptr_t)plsnflush, (void*)(uintptr_t)plsnlastflushed, (void*)(uintptr_t)poverlapped) : -1;
#else
    (void)pvmarshalcontext;
    (void)plsnflush;
    (void)plsnlastflushed;
    (void)poverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1freeEncryptedFileMetadata(JNIEnv* km_env, jclass km_clazz, jlong pbmetadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeEncryptedFileMetadata");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pbmetadata);
#else
    (void)pbmetadata;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1freeEncryptionCertificateHashList(JNIEnv* km_env, jclass km_clazz, jlong pusers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeEncryptionCertificateHashList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pusers);
#else
    (void)pusers;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1freeReservedLog(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jint creservedrecords, jlong pcbadjustment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeReservedLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (uint32_t)creservedrecords, (void*)(uintptr_t)pcbadjustment) : -1;
#else
    (void)pvmarshal;
    (void)creservedrecords;
    (void)pcbadjustment;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getBinaryTypeA(JNIEnv* km_env, jclass km_clazz, jlong lpapplicationname, jlong lpbinarytype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBinaryTypeA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpapplicationname, (void*)(uintptr_t)lpbinarytype) : -1;
#else
    (void)lpapplicationname;
    (void)lpbinarytype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getBinaryTypeW(JNIEnv* km_env, jclass km_clazz, jlong lpapplicationname, jlong lpbinarytype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetBinaryTypeW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpapplicationname, (void*)(uintptr_t)lpbinarytype) : -1;
#else
    (void)lpapplicationname;
    (void)lpbinarytype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getCompressedFileSizeA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCompressedFileSizeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpfilesizehigh) : 0;
#else
    (void)lpfilename;
    (void)lpfilesizehigh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getCompressedFileSizeTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpfilesizehigh, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCompressedFileSizeTransactedA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpfilesizehigh, (void*)(uintptr_t)htransaction) : 0;
#else
    (void)lpfilename;
    (void)lpfilesizehigh;
    (void)htransaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getCompressedFileSizeTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpfilesizehigh, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCompressedFileSizeTransactedW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpfilesizehigh, (void*)(uintptr_t)htransaction) : 0;
#else
    (void)lpfilename;
    (void)lpfilesizehigh;
    (void)htransaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getCompressedFileSizeW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCompressedFileSizeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpfilesizehigh) : 0;
#else
    (void)lpfilename;
    (void)lpfilesizehigh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getCurrentClockTransactionManager(JNIEnv* km_env, jclass km_clazz, jlong transactionmanagerhandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentClockTransactionManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionmanagerhandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)transactionmanagerhandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getDiskFreeSpaceA(JNIEnv* km_env, jclass km_clazz, jlong lprootpathname, jlong lpsectorspercluster, jlong lpbytespersector, jlong lpnumberoffreeclusters, jlong lptotalnumberofclusters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskFreeSpaceA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprootpathname, (void*)(uintptr_t)lpsectorspercluster, (void*)(uintptr_t)lpbytespersector, (void*)(uintptr_t)lpnumberoffreeclusters, (void*)(uintptr_t)lptotalnumberofclusters) : -1;
#else
    (void)lprootpathname;
    (void)lpsectorspercluster;
    (void)lpbytespersector;
    (void)lpnumberoffreeclusters;
    (void)lptotalnumberofclusters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getDiskFreeSpaceExA(JNIEnv* km_env, jclass km_clazz, jlong lpdirectoryname, jlong lpfreebytesavailabletocaller, jlong lptotalnumberofbytes, jlong lptotalnumberoffreebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskFreeSpaceExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdirectoryname, (void*)(uintptr_t)lpfreebytesavailabletocaller, (void*)(uintptr_t)lptotalnumberofbytes, (void*)(uintptr_t)lptotalnumberoffreebytes) : -1;
#else
    (void)lpdirectoryname;
    (void)lpfreebytesavailabletocaller;
    (void)lptotalnumberofbytes;
    (void)lptotalnumberoffreebytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getDiskFreeSpaceExW(JNIEnv* km_env, jclass km_clazz, jlong lpdirectoryname, jlong lpfreebytesavailabletocaller, jlong lptotalnumberofbytes, jlong lptotalnumberoffreebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskFreeSpaceExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdirectoryname, (void*)(uintptr_t)lpfreebytesavailabletocaller, (void*)(uintptr_t)lptotalnumberofbytes, (void*)(uintptr_t)lptotalnumberoffreebytes) : -1;
#else
    (void)lpdirectoryname;
    (void)lpfreebytesavailabletocaller;
    (void)lptotalnumberofbytes;
    (void)lptotalnumberoffreebytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getDiskFreeSpaceW(JNIEnv* km_env, jclass km_clazz, jlong lprootpathname, jlong lpsectorspercluster, jlong lpbytespersector, jlong lpnumberoffreeclusters, jlong lptotalnumberofclusters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskFreeSpaceW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprootpathname, (void*)(uintptr_t)lpsectorspercluster, (void*)(uintptr_t)lpbytespersector, (void*)(uintptr_t)lpnumberoffreeclusters, (void*)(uintptr_t)lptotalnumberofclusters) : -1;
#else
    (void)lprootpathname;
    (void)lpsectorspercluster;
    (void)lpbytespersector;
    (void)lpnumberoffreeclusters;
    (void)lptotalnumberofclusters;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getDiskSpaceInformationA(JNIEnv* km_env, jclass km_clazz, jlong rootpath, jlong diskspaceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskSpaceInformationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpath, (void*)(uintptr_t)diskspaceinfo) : -1;
#else
    (void)rootpath;
    (void)diskspaceinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getDiskSpaceInformationW(JNIEnv* km_env, jclass km_clazz, jlong rootpath, jlong diskspaceinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDiskSpaceInformationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)rootpath, (void*)(uintptr_t)diskspaceinfo) : -1;
#else
    (void)rootpath;
    (void)diskspaceinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getDriveTypeA(JNIEnv* km_env, jclass km_clazz, jlong lprootpathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDriveTypeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprootpathname) : 0;
#else
    (void)lprootpathname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getDriveTypeW(JNIEnv* km_env, jclass km_clazz, jlong lprootpathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDriveTypeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprootpathname) : 0;
#else
    (void)lprootpathname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getEncryptedFileMetadata(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong pcbmetadata, jlong ppbmetadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEncryptedFileMetadata");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)pcbmetadata, (void*)(uintptr_t)ppbmetadata) : 0;
#else
    (void)lpfilename;
    (void)pcbmetadata;
    (void)ppbmetadata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getEnlistmentId(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong enlistmentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnlistmentId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)enlistmentid) : -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getEnlistmentRecoveryInformation(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jint buffersize, jlong buffer, jlong bufferused) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetEnlistmentRecoveryInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (uint32_t)buffersize, (void*)(uintptr_t)buffer, (void*)(uintptr_t)bufferused) : -1;
#else
    (void)enlistmenthandle;
    (void)buffersize;
    (void)buffer;
    (void)bufferused;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getExpandedNameA(JNIEnv* km_env, jclass km_clazz, jlong lpszsource, jlong lpszbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExpandedNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsource, (void*)(uintptr_t)lpszbuffer) : -1;
#else
    (void)lpszsource;
    (void)lpszbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getExpandedNameW(JNIEnv* km_env, jclass km_clazz, jlong lpszsource, jlong lpszbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExpandedNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszsource, (void*)(uintptr_t)lpszbuffer) : -1;
#else
    (void)lpszsource;
    (void)lpszbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileAttributesA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : 0;
#else
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileAttributesExA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfileinformation) : -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileAttributesExFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesExFromAppW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfileinformation) : -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileAttributesExW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfileinformation) : -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileAttributesTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfileinformation, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesTransactedA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfileinformation, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileAttributesTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint finfolevelid, jlong lpfileinformation, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesTransactedW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (int32_t)finfolevelid, (void*)(uintptr_t)lpfileinformation, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpfilename;
    (void)finfolevelid;
    (void)lpfileinformation;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileAttributesW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileAttributesW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename) : 0;
#else
    (void)lpfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileBandwidthReservation(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpperiodmilliseconds, jlong lpbytesperperiod, jlong pdiscardable, jlong lptransfersize, jlong lpnumoutstandingrequests) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileBandwidthReservation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpperiodmilliseconds, (void*)(uintptr_t)lpbytesperperiod, (void*)(uintptr_t)pdiscardable, (void*)(uintptr_t)lptransfersize, (void*)(uintptr_t)lpnumoutstandingrequests) : -1;
#else
    (void)hfile;
    (void)lpperiodmilliseconds;
    (void)lpbytesperperiod;
    (void)pdiscardable;
    (void)lptransfersize;
    (void)lpnumoutstandingrequests;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileInformationByHandle(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpfileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileInformationByHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpfileinformation) : -1;
#else
    (void)hfile;
    (void)lpfileinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileInformationByHandleEx(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint fileinformationclass, jlong lpfileinformation, jint dwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileInformationByHandleEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (int32_t)fileinformationclass, (void*)(uintptr_t)lpfileinformation, (uint32_t)dwbuffersize) : -1;
#else
    (void)hfile;
    (void)fileinformationclass;
    (void)lpfileinformation;
    (void)dwbuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileSize(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpfilesizehigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpfilesizehigh) : 0;
#else
    (void)hfile;
    (void)lpfilesizehigh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileSizeEx(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpfilesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileSizeEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpfilesize) : -1;
#else
    (void)hfile;
    (void)lpfilesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileTime(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpcreationtime, jlong lplastaccesstime, jlong lplastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpcreationtime, (void*)(uintptr_t)lplastaccesstime, (void*)(uintptr_t)lplastwritetime) : -1;
#else
    (void)hfile;
    (void)lpcreationtime;
    (void)lplastaccesstime;
    (void)lplastwritetime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileType(JNIEnv* km_env, jclass km_clazz, jlong hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileType");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile) : 0;
#else
    (void)hfile;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileVersionInfoA(JNIEnv* km_env, jclass km_clazz, jlong lptstrfilename, jint dwhandle, jint dwlen, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptstrfilename, (uint32_t)dwhandle, (uint32_t)dwlen, (void*)(uintptr_t)lpdata) : -1;
#else
    (void)lptstrfilename;
    (void)dwhandle;
    (void)dwlen;
    (void)lpdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileVersionInfoExA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpwstrfilename, jint dwhandle, jint dwlen, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpwstrfilename, (uint32_t)dwhandle, (uint32_t)dwlen, (void*)(uintptr_t)lpdata) : -1;
#else
    (void)dwflags;
    (void)lpwstrfilename;
    (void)dwhandle;
    (void)dwlen;
    (void)lpdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileVersionInfoExW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpwstrfilename, jint dwhandle, jint dwlen, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpwstrfilename, (uint32_t)dwhandle, (uint32_t)dwlen, (void*)(uintptr_t)lpdata) : -1;
#else
    (void)dwflags;
    (void)lpwstrfilename;
    (void)dwhandle;
    (void)dwlen;
    (void)lpdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileVersionInfoSizeA(JNIEnv* km_env, jclass km_clazz, jlong lptstrfilename, jlong lpdwhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoSizeA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptstrfilename, (void*)(uintptr_t)lpdwhandle) : 0;
#else
    (void)lptstrfilename;
    (void)lpdwhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileVersionInfoSizeExA(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpwstrfilename, jlong lpdwhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoSizeExA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpwstrfilename, (void*)(uintptr_t)lpdwhandle) : 0;
#else
    (void)dwflags;
    (void)lpwstrfilename;
    (void)lpdwhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileVersionInfoSizeExW(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpwstrfilename, jlong lpdwhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoSizeExW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpwstrfilename, (void*)(uintptr_t)lpdwhandle) : 0;
#else
    (void)dwflags;
    (void)lpwstrfilename;
    (void)lpdwhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileVersionInfoSizeW(JNIEnv* km_env, jclass km_clazz, jlong lptstrfilename, jlong lpdwhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoSizeW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptstrfilename, (void*)(uintptr_t)lpdwhandle) : 0;
#else
    (void)lptstrfilename;
    (void)lpdwhandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFileVersionInfoW(JNIEnv* km_env, jclass km_clazz, jlong lptstrfilename, jint dwhandle, jint dwlen, jlong lpdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFileVersionInfoW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lptstrfilename, (uint32_t)dwhandle, (uint32_t)dwlen, (void*)(uintptr_t)lpdata) : -1;
#else
    (void)lptstrfilename;
    (void)dwhandle;
    (void)dwlen;
    (void)lpdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFinalPathNameByHandleA(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpszfilepath, jint cchfilepath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFinalPathNameByHandleA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpszfilepath, (uint32_t)cchfilepath, (uint32_t)dwflags) : 0;
#else
    (void)hfile;
    (void)lpszfilepath;
    (void)cchfilepath;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFinalPathNameByHandleW(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpszfilepath, jint cchfilepath, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFinalPathNameByHandleW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpszfilepath, (uint32_t)cchfilepath, (uint32_t)dwflags) : 0;
#else
    (void)hfile;
    (void)lpszfilepath;
    (void)cchfilepath;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFullPathNameA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint nbufferlength, jlong lpbuffer, jlong lpfilepart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFullPathNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpfilepart) : 0;
#else
    (void)lpfilename;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFullPathNameTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint nbufferlength, jlong lpbuffer, jlong lpfilepart, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFullPathNameTransactedA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpfilepart, (void*)(uintptr_t)htransaction) : 0;
#else
    (void)lpfilename;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    (void)htransaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFullPathNameTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint nbufferlength, jlong lpbuffer, jlong lpfilepart, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFullPathNameTransactedW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpfilepart, (void*)(uintptr_t)htransaction) : 0;
#else
    (void)lpfilename;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    (void)htransaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getFullPathNameW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint nbufferlength, jlong lpbuffer, jlong lpfilepart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetFullPathNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpfilepart) : 0;
#else
    (void)lpfilename;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getIoRingInfo(JNIEnv* km_env, jclass km_clazz, jlong ioring, jlong info) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIoRingInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ioring, (void*)(uintptr_t)info) : -1;
#else
    (void)ioring;
    (void)info;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLogContainerName(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint cidlogicalcontainer, jlong pwstrcontainername, jint clencontainername, jlong pcactuallencontainername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogContainerName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (uint32_t)cidlogicalcontainer, (void*)(uintptr_t)pwstrcontainername, (uint32_t)clencontainername, (void*)(uintptr_t)pcactuallencontainername) : -1;
#else
    (void)hlog;
    (void)cidlogicalcontainer;
    (void)pwstrcontainername;
    (void)clencontainername;
    (void)pcactuallencontainername;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLogFileInformation(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pinfobuffer, jlong cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogFileInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pinfobuffer, (void*)(uintptr_t)cbbuffer) : -1;
#else
    (void)hlog;
    (void)pinfobuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLogIoStatistics(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pvstatsbuffer, jint cbstatsbuffer, jint estatsclass, jlong pcbstatswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogIoStatistics");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pvstatsbuffer, (uint32_t)cbstatsbuffer, (int32_t)estatsclass, (void*)(uintptr_t)pcbstatswritten) : -1;
#else
    (void)hlog;
    (void)pvstatsbuffer;
    (void)cbstatsbuffer;
    (void)estatsclass;
    (void)pcbstatswritten;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLogReservationInfo(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jlong pcbrecordnumber, jlong pcbuserreservation, jlong pcbcommitreservation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogReservationInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (void*)(uintptr_t)pcbrecordnumber, (void*)(uintptr_t)pcbuserreservation, (void*)(uintptr_t)pcbcommitreservation) : -1;
#else
    (void)pvmarshal;
    (void)pcbrecordnumber;
    (void)pcbuserreservation;
    (void)pcbcommitreservation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLogicalDriveStringsA(JNIEnv* km_env, jclass km_clazz, jint nbufferlength, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalDriveStringsA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLogicalDriveStringsW(JNIEnv* km_env, jclass km_clazz, jint nbufferlength, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalDriveStringsW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLogicalDrives(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLogicalDrives");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLongPathNameA(JNIEnv* km_env, jclass km_clazz, jlong lpszshortpath, jlong lpszlongpath, jint cchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLongPathNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszshortpath, (void*)(uintptr_t)lpszlongpath, (uint32_t)cchbuffer) : 0;
#else
    (void)lpszshortpath;
    (void)lpszlongpath;
    (void)cchbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLongPathNameTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpszshortpath, jlong lpszlongpath, jint cchbuffer, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLongPathNameTransactedA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszshortpath, (void*)(uintptr_t)lpszlongpath, (uint32_t)cchbuffer, (void*)(uintptr_t)htransaction) : 0;
#else
    (void)lpszshortpath;
    (void)lpszlongpath;
    (void)cchbuffer;
    (void)htransaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLongPathNameTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpszshortpath, jlong lpszlongpath, jint cchbuffer, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLongPathNameTransactedW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszshortpath, (void*)(uintptr_t)lpszlongpath, (uint32_t)cchbuffer, (void*)(uintptr_t)htransaction) : 0;
#else
    (void)lpszshortpath;
    (void)lpszlongpath;
    (void)cchbuffer;
    (void)htransaction;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getLongPathNameW(JNIEnv* km_env, jclass km_clazz, jlong lpszshortpath, jlong lpszlongpath, jint cchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetLongPathNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszshortpath, (void*)(uintptr_t)lpszlongpath, (uint32_t)cchbuffer) : 0;
#else
    (void)lpszshortpath;
    (void)lpszlongpath;
    (void)cchbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getNextLogArchiveExtent(JNIEnv* km_env, jclass km_clazz, jlong pvarchivecontext, jlong rgadextent, jint cdescriptors, jlong pcdescriptorsreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNextLogArchiveExtent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvarchivecontext, (void*)(uintptr_t)rgadextent, (uint32_t)cdescriptors, (void*)(uintptr_t)pcdescriptorsreturned) : -1;
#else
    (void)pvarchivecontext;
    (void)rgadextent;
    (void)cdescriptors;
    (void)pcdescriptorsreturned;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getNotificationResourceManager(JNIEnv* km_env, jclass km_clazz, jlong resourcemanagerhandle, jlong transactionnotification, jint notificationlength, jint dwmilliseconds, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNotificationResourceManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)resourcemanagerhandle, (void*)(uintptr_t)transactionnotification, (uint32_t)notificationlength, (uint32_t)dwmilliseconds, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)resourcemanagerhandle;
    (void)transactionnotification;
    (void)notificationlength;
    (void)dwmilliseconds;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getNotificationResourceManagerAsync(JNIEnv* km_env, jclass km_clazz, jlong resourcemanagerhandle, jlong transactionnotification, jint transactionnotificationlength, jlong returnlength, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNotificationResourceManagerAsync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)resourcemanagerhandle, (void*)(uintptr_t)transactionnotification, (uint32_t)transactionnotificationlength, (void*)(uintptr_t)returnlength, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)resourcemanagerhandle;
    (void)transactionnotification;
    (void)transactionnotificationlength;
    (void)returnlength;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getShortPathNameA(JNIEnv* km_env, jclass km_clazz, jlong lpszlongpath, jlong lpszshortpath, jint cchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetShortPathNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszlongpath, (void*)(uintptr_t)lpszshortpath, (uint32_t)cchbuffer) : 0;
#else
    (void)lpszlongpath;
    (void)lpszshortpath;
    (void)cchbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getShortPathNameW(JNIEnv* km_env, jclass km_clazz, jlong lpszlongpath, jlong lpszshortpath, jint cchbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetShortPathNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszlongpath, (void*)(uintptr_t)lpszshortpath, (uint32_t)cchbuffer) : 0;
#else
    (void)lpszlongpath;
    (void)lpszshortpath;
    (void)cchbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTapeParameters(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint dwoperation, jlong lpdwsize, jlong lptapeinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTapeParameters");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)dwoperation, (void*)(uintptr_t)lpdwsize, (void*)(uintptr_t)lptapeinformation) : 0;
#else
    (void)hdevice;
    (void)dwoperation;
    (void)lpdwsize;
    (void)lptapeinformation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTapePosition(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint dwpositiontype, jlong lpdwpartition, jlong lpdwoffsetlow, jlong lpdwoffsethigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTapePosition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)dwpositiontype, (void*)(uintptr_t)lpdwpartition, (void*)(uintptr_t)lpdwoffsetlow, (void*)(uintptr_t)lpdwoffsethigh) : 0;
#else
    (void)hdevice;
    (void)dwpositiontype;
    (void)lpdwpartition;
    (void)lpdwoffsetlow;
    (void)lpdwoffsethigh;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTapeStatus(JNIEnv* km_env, jclass km_clazz, jlong hdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTapeStatus");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice) : 0;
#else
    (void)hdevice;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTempFileNameA(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jlong lpprefixstring, jint uunique, jlong lptempfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempFileNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (void*)(uintptr_t)lpprefixstring, (uint32_t)uunique, (void*)(uintptr_t)lptempfilename) : 0;
#else
    (void)lppathname;
    (void)lpprefixstring;
    (void)uunique;
    (void)lptempfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTempFileNameW(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jlong lpprefixstring, jint uunique, jlong lptempfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempFileNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (void*)(uintptr_t)lpprefixstring, (uint32_t)uunique, (void*)(uintptr_t)lptempfilename) : 0;
#else
    (void)lppathname;
    (void)lpprefixstring;
    (void)uunique;
    (void)lptempfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTempPath2A(JNIEnv* km_env, jclass km_clazz, jint bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempPath2A");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)bufferlength, (void*)(uintptr_t)buffer) : 0;
#else
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTempPath2W(JNIEnv* km_env, jclass km_clazz, jint bufferlength, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempPath2W");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)bufferlength, (void*)(uintptr_t)buffer) : 0;
#else
    (void)bufferlength;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTempPathA(JNIEnv* km_env, jclass km_clazz, jint nbufferlength, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTempPathW(JNIEnv* km_env, jclass km_clazz, jint nbufferlength, jlong lpbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTempPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer) : 0;
#else
    (void)nbufferlength;
    (void)lpbuffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTransactionId(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jlong transactionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTransactionId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionhandle, (void*)(uintptr_t)transactionid) : -1;
#else
    (void)transactionhandle;
    (void)transactionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTransactionInformation(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jlong outcome, jlong isolationlevel, jlong isolationflags, jlong timeout, jint bufferlength, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTransactionInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionhandle, (void*)(uintptr_t)outcome, (void*)(uintptr_t)isolationlevel, (void*)(uintptr_t)isolationflags, (void*)(uintptr_t)timeout, (uint32_t)bufferlength, (void*)(uintptr_t)description) : -1;
#else
    (void)transactionhandle;
    (void)outcome;
    (void)isolationlevel;
    (void)isolationflags;
    (void)timeout;
    (void)bufferlength;
    (void)description;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getTransactionManagerId(JNIEnv* km_env, jclass km_clazz, jlong transactionmanagerhandle, jlong transactionmanagerid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetTransactionManagerId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionmanagerhandle, (void*)(uintptr_t)transactionmanagerid) : -1;
#else
    (void)transactionmanagerhandle;
    (void)transactionmanagerid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getVolumeInformationA(JNIEnv* km_env, jclass km_clazz, jlong lprootpathname, jlong lpvolumenamebuffer, jint nvolumenamesize, jlong lpvolumeserialnumber, jlong lpmaximumcomponentlength, jlong lpfilesystemflags, jlong lpfilesystemnamebuffer, jint nfilesystemnamesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeInformationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprootpathname, (void*)(uintptr_t)lpvolumenamebuffer, (uint32_t)nvolumenamesize, (void*)(uintptr_t)lpvolumeserialnumber, (void*)(uintptr_t)lpmaximumcomponentlength, (void*)(uintptr_t)lpfilesystemflags, (void*)(uintptr_t)lpfilesystemnamebuffer, (uint32_t)nfilesystemnamesize) : -1;
#else
    (void)lprootpathname;
    (void)lpvolumenamebuffer;
    (void)nvolumenamesize;
    (void)lpvolumeserialnumber;
    (void)lpmaximumcomponentlength;
    (void)lpfilesystemflags;
    (void)lpfilesystemnamebuffer;
    (void)nfilesystemnamesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getVolumeInformationByHandleW(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpvolumenamebuffer, jint nvolumenamesize, jlong lpvolumeserialnumber, jlong lpmaximumcomponentlength, jlong lpfilesystemflags, jlong lpfilesystemnamebuffer, jint nfilesystemnamesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeInformationByHandleW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpvolumenamebuffer, (uint32_t)nvolumenamesize, (void*)(uintptr_t)lpvolumeserialnumber, (void*)(uintptr_t)lpmaximumcomponentlength, (void*)(uintptr_t)lpfilesystemflags, (void*)(uintptr_t)lpfilesystemnamebuffer, (uint32_t)nfilesystemnamesize) : -1;
#else
    (void)hfile;
    (void)lpvolumenamebuffer;
    (void)nvolumenamesize;
    (void)lpvolumeserialnumber;
    (void)lpmaximumcomponentlength;
    (void)lpfilesystemflags;
    (void)lpfilesystemnamebuffer;
    (void)nfilesystemnamesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getVolumeInformationW(JNIEnv* km_env, jclass km_clazz, jlong lprootpathname, jlong lpvolumenamebuffer, jint nvolumenamesize, jlong lpvolumeserialnumber, jlong lpmaximumcomponentlength, jlong lpfilesystemflags, jlong lpfilesystemnamebuffer, jint nfilesystemnamesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeInformationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprootpathname, (void*)(uintptr_t)lpvolumenamebuffer, (uint32_t)nvolumenamesize, (void*)(uintptr_t)lpvolumeserialnumber, (void*)(uintptr_t)lpmaximumcomponentlength, (void*)(uintptr_t)lpfilesystemflags, (void*)(uintptr_t)lpfilesystemnamebuffer, (uint32_t)nfilesystemnamesize) : -1;
#else
    (void)lprootpathname;
    (void)lpvolumenamebuffer;
    (void)nvolumenamesize;
    (void)lpvolumeserialnumber;
    (void)lpmaximumcomponentlength;
    (void)lpfilesystemflags;
    (void)lpfilesystemnamebuffer;
    (void)nfilesystemnamesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getVolumeNameForVolumeMountPointA(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumemountpoint, jlong lpszvolumename, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeNameForVolumeMountPointA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumemountpoint, (void*)(uintptr_t)lpszvolumename, (uint32_t)cchbufferlength) : -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getVolumeNameForVolumeMountPointW(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumemountpoint, jlong lpszvolumename, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumeNameForVolumeMountPointW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumemountpoint, (void*)(uintptr_t)lpszvolumename, (uint32_t)cchbufferlength) : -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getVolumePathNameA(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong lpszvolumepathname, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumePathNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)lpszvolumepathname, (uint32_t)cchbufferlength) : -1;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getVolumePathNameW(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong lpszvolumepathname, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumePathNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)lpszvolumepathname, (uint32_t)cchbufferlength) : -1;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getVolumePathNamesForVolumeNameA(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumename, jlong lpszvolumepathnames, jint cchbufferlength, jlong lpcchreturnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumePathNamesForVolumeNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumename, (void*)(uintptr_t)lpszvolumepathnames, (uint32_t)cchbufferlength, (void*)(uintptr_t)lpcchreturnlength) : -1;
#else
    (void)lpszvolumename;
    (void)lpszvolumepathnames;
    (void)cchbufferlength;
    (void)lpcchreturnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1getVolumePathNamesForVolumeNameW(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumename, jlong lpszvolumepathnames, jint cchbufferlength, jlong lpcchreturnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVolumePathNamesForVolumeNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumename, (void*)(uintptr_t)lpszvolumepathnames, (uint32_t)cchbufferlength, (void*)(uintptr_t)lpcchreturnlength) : -1;
#else
    (void)lpszvolumename;
    (void)lpszvolumepathnames;
    (void)cchbufferlength;
    (void)lpcchreturnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1handleLogFull(JNIEnv* km_env, jclass km_clazz, jlong hlog) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HandleLogFull");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog) : -1;
#else
    (void)hlog;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1installLogPolicy(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong ppolicy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InstallLogPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)ppolicy) : -1;
#else
    (void)hlog;
    (void)ppolicy;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1isIoRingOpSupported(JNIEnv* km_env, jclass km_clazz, jlong ioring, jint op) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsIoRingOpSupported");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ioring, (int32_t)op) : -1;
#else
    (void)ioring;
    (void)op;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lZClose(JNIEnv* km_env, jclass km_clazz, jint hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZClose");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)hfile);
#else
    (void)hfile;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lZCopy(JNIEnv* km_env, jclass km_clazz, jint hfsource, jint hfdest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZCopy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfsource, (int32_t)hfdest) : -1;
#else
    (void)hfsource;
    (void)hfdest;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lZDone(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZDone");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lZInit(JNIEnv* km_env, jclass km_clazz, jint hfsource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZInit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfsource) : -1;
#else
    (void)hfsource;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lZOpenFileA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpreopenbuf, jshort wstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZOpenFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpreopenbuf, (uint16_t)wstyle) : -1;
#else
    (void)lpfilename;
    (void)lpreopenbuf;
    (void)wstyle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lZOpenFileW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpreopenbuf, jshort wstyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZOpenFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpreopenbuf, (uint16_t)wstyle) : -1;
#else
    (void)lpfilename;
    (void)lpreopenbuf;
    (void)wstyle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lZRead(JNIEnv* km_env, jclass km_clazz, jint hfile, jlong lpbuffer, jint cbread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZRead");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfile, (void*)(uintptr_t)lpbuffer, (int32_t)cbread) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)cbread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lZSeek(JNIEnv* km_env, jclass km_clazz, jint hfile, jint loffset, jint iorigin) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZSeek");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)hfile, (int32_t)loffset, (int32_t)iorigin) : -1;
#else
    (void)hfile;
    (void)loffset;
    (void)iorigin;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lZStart(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LZStart");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1localFileTimeToFileTime(JNIEnv* km_env, jclass km_clazz, jlong lplocalfiletime, jlong lpfiletime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LocalFileTimeToFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lplocalfiletime, (void*)(uintptr_t)lpfiletime) : -1;
#else
    (void)lplocalfiletime;
    (void)lpfiletime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lockFile(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint dwfileoffsetlow, jint dwfileoffsethigh, jint nnumberofbytestolocklow, jint nnumberofbytestolockhigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)dwfileoffsetlow, (uint32_t)dwfileoffsethigh, (uint32_t)nnumberofbytestolocklow, (uint32_t)nnumberofbytestolockhigh) : -1;
#else
    (void)hfile;
    (void)dwfileoffsetlow;
    (void)dwfileoffsethigh;
    (void)nnumberofbytestolocklow;
    (void)nnumberofbytestolockhigh;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lockFileEx(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint dwflags, jint dwreserved, jint nnumberofbytestolocklow, jint nnumberofbytestolockhigh, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LockFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)dwflags, (uint32_t)dwreserved, (uint32_t)nnumberofbytestolocklow, (uint32_t)nnumberofbytestolockhigh, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hfile;
    (void)dwflags;
    (void)dwreserved;
    (void)nnumberofbytestolocklow;
    (void)nnumberofbytestolockhigh;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1logTailAdvanceFailure(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint dwreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LogTailAdvanceFailure");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (uint32_t)dwreason) : -1;
#else
    (void)hlog;
    (void)dwreason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lsnBlockOffset(JNIEnv* km_env, jclass km_clazz, jlong plsn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnBlockOffset");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plsn) : 0;
#else
    (void)plsn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lsnContainer(JNIEnv* km_env, jclass km_clazz, jlong plsn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnContainer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plsn) : 0;
#else
    (void)plsn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lsnEqual(JNIEnv* km_env, jclass km_clazz, jlong plsn1, jlong plsn2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnEqual");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plsn1, (void*)(uintptr_t)plsn2) : false;
#else
    (void)plsn1;
    (void)plsn2;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lsnGreater(JNIEnv* km_env, jclass km_clazz, jlong plsn1, jlong plsn2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnGreater");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plsn1, (void*)(uintptr_t)plsn2) : false;
#else
    (void)plsn1;
    (void)plsn2;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lsnInvalid(JNIEnv* km_env, jclass km_clazz, jlong plsn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnInvalid");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plsn) : false;
#else
    (void)plsn;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lsnLess(JNIEnv* km_env, jclass km_clazz, jlong plsn1, jlong plsn2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnLess");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plsn1, (void*)(uintptr_t)plsn2) : false;
#else
    (void)plsn1;
    (void)plsn2;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lsnNull(JNIEnv* km_env, jclass km_clazz, jlong plsn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnNull");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plsn) : false;
#else
    (void)plsn;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1lsnRecordSequence(JNIEnv* km_env, jclass km_clazz, jlong plsn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LsnRecordSequence");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plsn) : 0;
#else
    (void)plsn;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1moveFileA(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1moveFileExA(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileExA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (uint32_t)dwflags) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1moveFileExW(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (uint32_t)dwflags) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1moveFileFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileFromAppW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1moveFileTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jlong lpprogressroutine, jlong lpdata, jint dwflags, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileTransactedA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (void*)(uintptr_t)lpprogressroutine, (void*)(uintptr_t)lpdata, (uint32_t)dwflags, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)dwflags;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1moveFileTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jlong lpprogressroutine, jlong lpdata, jint dwflags, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileTransactedW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (void*)(uintptr_t)lpprogressroutine, (void*)(uintptr_t)lpdata, (uint32_t)dwflags, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)dwflags;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1moveFileW(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1moveFileWithProgressA(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jlong lpprogressroutine, jlong lpdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileWithProgressA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (void*)(uintptr_t)lpprogressroutine, (void*)(uintptr_t)lpdata, (uint32_t)dwflags) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1moveFileWithProgressW(JNIEnv* km_env, jclass km_clazz, jlong lpexistingfilename, jlong lpnewfilename, jlong lpprogressroutine, jlong lpdata, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveFileWithProgressW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpexistingfilename, (void*)(uintptr_t)lpnewfilename, (void*)(uintptr_t)lpprogressroutine, (void*)(uintptr_t)lpdata, (uint32_t)dwflags) : -1;
#else
    (void)lpexistingfilename;
    (void)lpnewfilename;
    (void)lpprogressroutine;
    (void)lpdata;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netConnectionEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong qualifier, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetConnectionEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)qualifier, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)qualifier;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netFileClose(JNIEnv* km_env, jclass km_clazz, jlong servername, jint fileid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetFileClose");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)fileid) : 0;
#else
    (void)servername;
    (void)fileid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netFileEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong basepath, jlong username, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetFileEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)basepath, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netFileGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jint fileid, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetFileGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)fileid, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)fileid;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netServerAliasAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerAliasAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netServerAliasDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerAliasDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netServerAliasEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resumehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetServerAliasEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resumehandle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resumehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netSessionDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong uncclientname, jlong username) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetSessionDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)uncclientname, (void*)(uintptr_t)username) : 0;
#else
    (void)servername;
    (void)uncclientname;
    (void)username;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netSessionEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong uncclientname, jlong username, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetSessionEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)uncclientname, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netSessionGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong uncclientname, jlong username, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetSessionGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)uncclientname, (void*)(uintptr_t)username, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)uncclientname;
    (void)username;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netShareAdd(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareAdd");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netShareCheck(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong device, jlong type) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareCheck");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)device, (void*)(uintptr_t)type) : 0;
#else
    (void)servername;
    (void)device;
    (void)type;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netShareDel(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong netname, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareDel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)netname, (uint32_t)reserved) : 0;
#else
    (void)servername;
    (void)netname;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netShareDelEx(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong buf) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareDelEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)buf) : 0;
#else
    (void)servername;
    (void)level;
    (void)buf;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netShareDelSticky(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong netname, jint reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareDelSticky");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)netname, (uint32_t)reserved) : 0;
#else
    (void)servername;
    (void)netname;
    (void)reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netShareEnum(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netShareEnumSticky(JNIEnv* km_env, jclass km_clazz, jlong servername, jint level, jlong bufptr, jint prefmaxlen, jlong entriesread, jlong totalentries, jlong resume_handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareEnumSticky");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (uint32_t)level, (void*)(uintptr_t)bufptr, (uint32_t)prefmaxlen, (void*)(uintptr_t)entriesread, (void*)(uintptr_t)totalentries, (void*)(uintptr_t)resume_handle) : 0;
#else
    (void)servername;
    (void)level;
    (void)bufptr;
    (void)prefmaxlen;
    (void)entriesread;
    (void)totalentries;
    (void)resume_handle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netShareGetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong netname, jint level, jlong bufptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareGetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)netname, (uint32_t)level, (void*)(uintptr_t)bufptr) : 0;
#else
    (void)servername;
    (void)netname;
    (void)level;
    (void)bufptr;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netShareSetInfo(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong netname, jint level, jlong buf, jlong parm_err) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetShareSetInfo");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)netname, (uint32_t)level, (void*)(uintptr_t)buf, (void*)(uintptr_t)parm_err) : 0;
#else
    (void)servername;
    (void)netname;
    (void)level;
    (void)buf;
    (void)parm_err;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1netStatisticsGet(JNIEnv* km_env, jclass km_clazz, jlong servername, jlong service, jint level, jint options, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("netapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NetStatisticsGet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servername, (void*)(uintptr_t)service, (uint32_t)level, (uint32_t)options, (void*)(uintptr_t)buffer) : 0;
#else
    (void)servername;
    (void)service;
    (void)level;
    (void)options;
    (void)buffer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1openEncryptedFileRawA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint ulflags, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEncryptedFileRawA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)ulflags, (void*)(uintptr_t)pvcontext) : 0;
#else
    (void)lpfilename;
    (void)ulflags;
    (void)pvcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1openEncryptedFileRawW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint ulflags, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEncryptedFileRawW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)ulflags, (void*)(uintptr_t)pvcontext) : 0;
#else
    (void)lpfilename;
    (void)ulflags;
    (void)pvcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1openEnlistment(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jlong resourcemanagerhandle, jlong enlistmentid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEnlistment");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (void*)(uintptr_t)resourcemanagerhandle, (void*)(uintptr_t)enlistmentid) : NULL;
#else
    (void)dwdesiredaccess;
    (void)resourcemanagerhandle;
    (void)enlistmentid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1openFile(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong lpreopenbuff, jint ustyle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpreopenbuff, (uint32_t)ustyle) : -1;
#else
    (void)lpfilename;
    (void)lpreopenbuff;
    (void)ustyle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1openFileById(JNIEnv* km_env, jclass km_clazz, jlong hvolumehint, jlong lpfileid, jint dwdesiredaccess, jint dwsharemode, jlong lpsecurityattributes, jint dwflagsandattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenFileById");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hvolumehint, (void*)(uintptr_t)lpfileid, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)lpsecurityattributes, (uint32_t)dwflagsandattributes) : NULL;
#else
    (void)hvolumehint;
    (void)lpfileid;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)lpsecurityattributes;
    (void)dwflagsandattributes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1openResourceManager(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jlong tmhandle, jlong resourcemanagerid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenResourceManager");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (void*)(uintptr_t)tmhandle, (void*)(uintptr_t)resourcemanagerid) : NULL;
#else
    (void)dwdesiredaccess;
    (void)tmhandle;
    (void)resourcemanagerid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1openTransaction(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jlong transactionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTransaction");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (void*)(uintptr_t)transactionid) : NULL;
#else
    (void)dwdesiredaccess;
    (void)transactionid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1openTransactionManager(JNIEnv* km_env, jclass km_clazz, jlong logfilename, jint desiredaccess, jint openoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTransactionManager");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)logfilename, (uint32_t)desiredaccess, (uint32_t)openoptions) : NULL;
#else
    (void)logfilename;
    (void)desiredaccess;
    (void)openoptions;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1openTransactionManagerById(JNIEnv* km_env, jclass km_clazz, jlong transactionmanagerid, jint desiredaccess, jint openoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenTransactionManagerById");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionmanagerid, (uint32_t)desiredaccess, (uint32_t)openoptions) : NULL;
#else
    (void)transactionmanagerid;
    (void)desiredaccess;
    (void)openoptions;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1popIoRingCompletion(JNIEnv* km_env, jclass km_clazz, jlong ioring, jlong cqe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PopIoRingCompletion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ioring, (void*)(uintptr_t)cqe) : -1;
#else
    (void)ioring;
    (void)cqe;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1prePrepareComplete(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrePrepareComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1prePrepareEnlistment(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrePrepareEnlistment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1prepareComplete(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrepareComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1prepareEnlistment(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrepareEnlistment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1prepareLogArchive(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pszbaselogfilename, jint clen, jlong plsnlow, jlong plsnhigh, jlong pcactuallength, jlong poffbaselogfiledata, jlong pcbbaselogfilelength, jlong plsnbase, jlong plsnlast, jlong plsncurrentarchivetail, jlong ppvarchivecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrepareLogArchive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pszbaselogfilename, (uint32_t)clen, (void*)(uintptr_t)plsnlow, (void*)(uintptr_t)plsnhigh, (void*)(uintptr_t)pcactuallength, (void*)(uintptr_t)poffbaselogfiledata, (void*)(uintptr_t)pcbbaselogfilelength, (void*)(uintptr_t)plsnbase, (void*)(uintptr_t)plsnlast, (void*)(uintptr_t)plsncurrentarchivetail, (void*)(uintptr_t)ppvarchivecontext) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1prepareTape(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint dwoperation, jint bimmediate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PrepareTape");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)dwoperation, (int32_t)bimmediate) : 0;
#else
    (void)hdevice;
    (void)dwoperation;
    (void)bimmediate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1queryDosDeviceA(JNIEnv* km_env, jclass km_clazz, jlong lpdevicename, jlong lptargetpath, jint ucchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDosDeviceA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdevicename, (void*)(uintptr_t)lptargetpath, (uint32_t)ucchmax) : 0;
#else
    (void)lpdevicename;
    (void)lptargetpath;
    (void)ucchmax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1queryDosDeviceW(JNIEnv* km_env, jclass km_clazz, jlong lpdevicename, jlong lptargetpath, jint ucchmax) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDosDeviceW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpdevicename, (void*)(uintptr_t)lptargetpath, (uint32_t)ucchmax) : 0;
#else
    (void)lpdevicename;
    (void)lptargetpath;
    (void)ucchmax;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1queryIoRingCapabilities(JNIEnv* km_env, jclass km_clazz, jlong capabilities) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryIoRingCapabilities");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)capabilities) : -1;
#else
    (void)capabilities;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1queryLogPolicy(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint epolicytype, jlong ppolicybuffer, jlong pcbpolicybuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryLogPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (int32_t)epolicytype, (void*)(uintptr_t)ppolicybuffer, (void*)(uintptr_t)pcbpolicybuffer) : -1;
#else
    (void)hlog;
    (void)epolicytype;
    (void)ppolicybuffer;
    (void)pcbpolicybuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1queryRecoveryAgentsOnEncryptedFile(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong precoveryagents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryRecoveryAgentsOnEncryptedFile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)precoveryagents) : 0;
#else
    (void)lpfilename;
    (void)precoveryagents;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1queryUsersOnEncryptedFile(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong pusers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryUsersOnEncryptedFile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)pusers) : 0;
#else
    (void)lpfilename;
    (void)pusers;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1reOpenFile(JNIEnv* km_env, jclass km_clazz, jlong horiginalfile, jint dwdesiredaccess, jint dwsharemode, jint dwflagsandattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReOpenFile");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)horiginalfile, (uint32_t)dwdesiredaccess, (uint32_t)dwsharemode, (uint32_t)dwflagsandattributes) : NULL;
#else
    (void)horiginalfile;
    (void)dwdesiredaccess;
    (void)dwsharemode;
    (void)dwflagsandattributes;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readDirectoryChangesExW(JNIEnv* km_env, jclass km_clazz, jlong hdirectory, jlong lpbuffer, jint nbufferlength, jint bwatchsubtree, jint dwnotifyfilter, jlong lpbytesreturned, jlong lpoverlapped, jlong lpcompletionroutine, jint readdirectorynotifyinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadDirectoryChangesExW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdirectory, (void*)(uintptr_t)lpbuffer, (uint32_t)nbufferlength, (int32_t)bwatchsubtree, (uint32_t)dwnotifyfilter, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine, (int32_t)readdirectorynotifyinformationclass) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readDirectoryChangesW(JNIEnv* km_env, jclass km_clazz, jlong hdirectory, jlong lpbuffer, jint nbufferlength, jint bwatchsubtree, jint dwnotifyfilter, jlong lpbytesreturned, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadDirectoryChangesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdirectory, (void*)(uintptr_t)lpbuffer, (uint32_t)nbufferlength, (int32_t)bwatchsubtree, (uint32_t)dwnotifyfilter, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
#else
    (void)hdirectory;
    (void)lpbuffer;
    (void)nbufferlength;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    (void)lpbytesreturned;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readEncryptedFileRaw(JNIEnv* km_env, jclass km_clazz, jlong pfexportcallback, jlong pvcallbackcontext, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadEncryptedFileRaw");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfexportcallback, (void*)(uintptr_t)pvcallbackcontext, (void*)(uintptr_t)pvcontext) : 0;
#else
    (void)pfexportcallback;
    (void)pvcallbackcontext;
    (void)pvcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readFile(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint nnumberofbytestoread, jlong lpnumberofbytesread, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofbytestoread, (void*)(uintptr_t)lpnumberofbytesread, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)lpnumberofbytesread;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readFileEx(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint nnumberofbytestoread, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofbytestoread, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestoread;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readFileScatter(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong asegmentarray, jint nnumberofbytestoread, jlong lpreserved, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadFileScatter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)asegmentarray, (uint32_t)nnumberofbytestoread, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hfile;
    (void)asegmentarray;
    (void)nnumberofbytestoread;
    (void)lpreserved;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readLogArchiveMetadata(JNIEnv* km_env, jclass km_clazz, jlong pvarchivecontext, jint cboffset, jint cbbytestoread, jlong pbreadbuffer, jlong pcbbytesread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadLogArchiveMetadata");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvarchivecontext, (uint32_t)cboffset, (uint32_t)cbbytestoread, (void*)(uintptr_t)pbreadbuffer, (void*)(uintptr_t)pcbbytesread) : -1;
#else
    (void)pvarchivecontext;
    (void)cboffset;
    (void)cbbytestoread;
    (void)pbreadbuffer;
    (void)pcbbytesread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readLogNotification(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pnotification, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadLogNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pnotification, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hlog;
    (void)pnotification;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readLogRecord(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jlong plsnfirst, jint econtextmode, jlong ppvreadbuffer, jlong pcbreadbuffer, jlong perecordtype, jlong plsnundonext, jlong plsnprevious, jlong ppvreadcontext, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadLogRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (void*)(uintptr_t)plsnfirst, (int32_t)econtextmode, (void*)(uintptr_t)ppvreadbuffer, (void*)(uintptr_t)pcbreadbuffer, (void*)(uintptr_t)perecordtype, (void*)(uintptr_t)plsnundonext, (void*)(uintptr_t)plsnprevious, (void*)(uintptr_t)ppvreadcontext, (void*)(uintptr_t)poverlapped) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readLogRestartArea(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jlong ppvrestartbuffer, jlong pcbrestartbuffer, jlong plsn, jlong ppvcontext, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadLogRestartArea");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (void*)(uintptr_t)ppvrestartbuffer, (void*)(uintptr_t)pcbrestartbuffer, (void*)(uintptr_t)plsn, (void*)(uintptr_t)ppvcontext, (void*)(uintptr_t)poverlapped) : -1;
#else
    (void)pvmarshal;
    (void)ppvrestartbuffer;
    (void)pcbrestartbuffer;
    (void)plsn;
    (void)ppvcontext;
    (void)poverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readNextLogRecord(JNIEnv* km_env, jclass km_clazz, jlong pvreadcontext, jlong ppvbuffer, jlong pcbbuffer, jlong perecordtype, jlong plsnuser, jlong plsnundonext, jlong plsnprevious, jlong plsnrecord, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadNextLogRecord");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvreadcontext, (void*)(uintptr_t)ppvbuffer, (void*)(uintptr_t)pcbbuffer, (void*)(uintptr_t)perecordtype, (void*)(uintptr_t)plsnuser, (void*)(uintptr_t)plsnundonext, (void*)(uintptr_t)plsnprevious, (void*)(uintptr_t)plsnrecord, (void*)(uintptr_t)poverlapped) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readOnlyEnlistment(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadOnlyEnlistment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1readPreviousLogRestartArea(JNIEnv* km_env, jclass km_clazz, jlong pvreadcontext, jlong ppvrestartbuffer, jlong pcbrestartbuffer, jlong plsnrestart, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReadPreviousLogRestartArea");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvreadcontext, (void*)(uintptr_t)ppvrestartbuffer, (void*)(uintptr_t)pcbrestartbuffer, (void*)(uintptr_t)plsnrestart, (void*)(uintptr_t)poverlapped) : -1;
#else
    (void)pvreadcontext;
    (void)ppvrestartbuffer;
    (void)pcbrestartbuffer;
    (void)plsnrestart;
    (void)poverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1recoverEnlistment(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong enlistmentkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecoverEnlistment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)enlistmentkey) : -1;
#else
    (void)enlistmenthandle;
    (void)enlistmentkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1recoverResourceManager(JNIEnv* km_env, jclass km_clazz, jlong resourcemanagerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecoverResourceManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)resourcemanagerhandle) : -1;
#else
    (void)resourcemanagerhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1recoverTransactionManager(JNIEnv* km_env, jclass km_clazz, jlong transactionmanagerhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RecoverTransactionManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionmanagerhandle) : -1;
#else
    (void)transactionmanagerhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1registerForLogWriteNotification(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint cbthreshold, jint fenable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterForLogWriteNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (uint32_t)cbthreshold, (int32_t)fenable) : -1;
#else
    (void)hlog;
    (void)cbthreshold;
    (void)fenable;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1registerManageableLogClient(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pcallbacks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterManageableLogClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pcallbacks) : -1;
#else
    (void)hlog;
    (void)pcallbacks;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1removeDirectoryA(JNIEnv* km_env, jclass km_clazz, jlong lppathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname) : -1;
#else
    (void)lppathname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1removeDirectoryFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lppathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryFromAppW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname) : -1;
#else
    (void)lppathname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1removeDirectoryTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryTransactedA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lppathname;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1removeDirectoryTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lppathname, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryTransactedW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lppathname;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1removeDirectoryW(JNIEnv* km_env, jclass km_clazz, jlong lppathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveDirectoryW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppathname) : -1;
#else
    (void)lppathname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1removeLogContainer(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pwszcontainerpath, jint fforce, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveLogContainer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pwszcontainerpath, (int32_t)fforce, (void*)(uintptr_t)preserved) : -1;
#else
    (void)hlog;
    (void)pwszcontainerpath;
    (void)fforce;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1removeLogContainerSet(JNIEnv* km_env, jclass km_clazz, jlong hlog, jshort ccontainer, jlong rgwszcontainerpath, jint fforce, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveLogContainerSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (uint16_t)ccontainer, (void*)(uintptr_t)rgwszcontainerpath, (int32_t)fforce, (void*)(uintptr_t)preserved) : -1;
#else
    (void)hlog;
    (void)ccontainer;
    (void)rgwszcontainerpath;
    (void)fforce;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1removeLogPolicy(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint epolicytype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveLogPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (int32_t)epolicytype) : -1;
#else
    (void)hlog;
    (void)epolicytype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1removeUsersFromEncryptedFile(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong phashes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveUsersFromEncryptedFile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)phashes) : 0;
#else
    (void)lpfilename;
    (void)phashes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1renameTransactionManager(JNIEnv* km_env, jclass km_clazz, jlong logfilename, jlong existingtransactionmanagerguid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RenameTransactionManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)logfilename, (void*)(uintptr_t)existingtransactionmanagerguid) : -1;
#else
    (void)logfilename;
    (void)existingtransactionmanagerguid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1replaceFileA(JNIEnv* km_env, jclass km_clazz, jlong lpreplacedfilename, jlong lpreplacementfilename, jlong lpbackupfilename, jint dwreplaceflags, jlong lpexclude, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplaceFileA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpreplacedfilename, (void*)(uintptr_t)lpreplacementfilename, (void*)(uintptr_t)lpbackupfilename, (uint32_t)dwreplaceflags, (void*)(uintptr_t)lpexclude, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)lpreplacedfilename;
    (void)lpreplacementfilename;
    (void)lpbackupfilename;
    (void)dwreplaceflags;
    (void)lpexclude;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1replaceFileFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lpreplacedfilename, jlong lpreplacementfilename, jlong lpbackupfilename, jint dwreplaceflags, jlong lpexclude, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplaceFileFromAppW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpreplacedfilename, (void*)(uintptr_t)lpreplacementfilename, (void*)(uintptr_t)lpbackupfilename, (uint32_t)dwreplaceflags, (void*)(uintptr_t)lpexclude, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)lpreplacedfilename;
    (void)lpreplacementfilename;
    (void)lpbackupfilename;
    (void)dwreplaceflags;
    (void)lpexclude;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1replaceFileW(JNIEnv* km_env, jclass km_clazz, jlong lpreplacedfilename, jlong lpreplacementfilename, jlong lpbackupfilename, jint dwreplaceflags, jlong lpexclude, jlong lpreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReplaceFileW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpreplacedfilename, (void*)(uintptr_t)lpreplacementfilename, (void*)(uintptr_t)lpbackupfilename, (uint32_t)dwreplaceflags, (void*)(uintptr_t)lpexclude, (void*)(uintptr_t)lpreserved) : -1;
#else
    (void)lpreplacedfilename;
    (void)lpreplacementfilename;
    (void)lpbackupfilename;
    (void)dwreplaceflags;
    (void)lpexclude;
    (void)lpreserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1reserveAndAppendLog(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jlong rgwriteentries, jint cwriteentries, jlong plsnundonext, jlong plsnprevious, jint creserverecords, jlong rgcbreservation, jint fflags, jlong plsn, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReserveAndAppendLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (void*)(uintptr_t)rgwriteentries, (uint32_t)cwriteentries, (void*)(uintptr_t)plsnundonext, (void*)(uintptr_t)plsnprevious, (uint32_t)creserverecords, (void*)(uintptr_t)rgcbreservation, (uint32_t)fflags, (void*)(uintptr_t)plsn, (void*)(uintptr_t)poverlapped) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1reserveAndAppendLogAligned(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jlong rgwriteentries, jint cwriteentries, jint cbentryalignment, jlong plsnundonext, jlong plsnprevious, jint creserverecords, jlong rgcbreservation, jint fflags, jlong plsn, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReserveAndAppendLogAligned");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (void*)(uintptr_t)rgwriteentries, (uint32_t)cwriteentries, (uint32_t)cbentryalignment, (void*)(uintptr_t)plsnundonext, (void*)(uintptr_t)plsnprevious, (uint32_t)creserverecords, (void*)(uintptr_t)rgcbreservation, (uint32_t)fflags, (void*)(uintptr_t)plsn, (void*)(uintptr_t)poverlapped) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1rollbackComplete(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollbackComplete");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1rollbackEnlistment(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollbackEnlistment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1rollbackTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollbackTransaction");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionhandle) : -1;
#else
    (void)transactionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1rollbackTransactionAsync(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollbackTransactionAsync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionhandle) : -1;
#else
    (void)transactionhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1rollforwardTransactionManager(JNIEnv* km_env, jclass km_clazz, jlong transactionmanagerhandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RollforwardTransactionManager");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionmanagerhandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)transactionmanagerhandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1scanLogContainers(JNIEnv* km_env, jclass km_clazz, jlong pcxscan, jbyte escanmode, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ScanLogContainers");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcxscan, (uint8_t)escanmode, (void*)(uintptr_t)preserved) : -1;
#else
    (void)pcxscan;
    (void)escanmode;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1searchPathA(JNIEnv* km_env, jclass km_clazz, jlong lppath, jlong lpfilename, jlong lpextension, jint nbufferlength, jlong lpbuffer, jlong lpfilepart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchPathA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppath, (void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpextension, (uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpfilepart) : 0;
#else
    (void)lppath;
    (void)lpfilename;
    (void)lpextension;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1searchPathW(JNIEnv* km_env, jclass km_clazz, jlong lppath, jlong lpfilename, jlong lpextension, jint nbufferlength, jlong lpbuffer, jlong lpfilepart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SearchPathW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lppath, (void*)(uintptr_t)lpfilename, (void*)(uintptr_t)lpextension, (uint32_t)nbufferlength, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)lpfilepart) : 0;
#else
    (void)lppath;
    (void)lpfilename;
    (void)lpextension;
    (void)nbufferlength;
    (void)lpbuffer;
    (void)lpfilepart;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setEncryptedFileMetadata(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jlong pboldmetadata, jlong pbnewmetadata, jlong pownerhash, jint dwoperation, jlong pcertificatesadded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEncryptedFileMetadata");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (void*)(uintptr_t)pboldmetadata, (void*)(uintptr_t)pbnewmetadata, (void*)(uintptr_t)pownerhash, (uint32_t)dwoperation, (void*)(uintptr_t)pcertificatesadded) : 0;
#else
    (void)lpfilename;
    (void)pboldmetadata;
    (void)pbnewmetadata;
    (void)pownerhash;
    (void)dwoperation;
    (void)pcertificatesadded;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setEndOfFile(JNIEnv* km_env, jclass km_clazz, jlong hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEndOfFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile) : -1;
#else
    (void)hfile;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setEndOfLog(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong plsnend, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEndOfLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)plsnend, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hlog;
    (void)plsnend;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setEnlistmentRecoveryInformation(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jint buffersize, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEnlistmentRecoveryInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (uint32_t)buffersize, (void*)(uintptr_t)buffer) : -1;
#else
    (void)enlistmenthandle;
    (void)buffersize;
    (void)buffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileApisToANSI(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileApisToANSI");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileApisToOEM(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileApisToOEM");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileAttributesA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwfileattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwfileattributes) : -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileAttributesFromAppW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwfileattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-file-fromapp-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesFromAppW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwfileattributes) : -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileAttributesTransactedA(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwfileattributes, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesTransactedA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwfileattributes, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileAttributesTransactedW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwfileattributes, jlong htransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesTransactedW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwfileattributes, (void*)(uintptr_t)htransaction) : -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    (void)htransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileAttributesW(JNIEnv* km_env, jclass km_clazz, jlong lpfilename, jint dwfileattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileAttributesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpfilename, (uint32_t)dwfileattributes) : -1;
#else
    (void)lpfilename;
    (void)dwfileattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileBandwidthReservation(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint nperiodmilliseconds, jint nbytesperperiod, jint bdiscardable, jlong lptransfersize, jlong lpnumoutstandingrequests) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileBandwidthReservation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)nperiodmilliseconds, (uint32_t)nbytesperperiod, (int32_t)bdiscardable, (void*)(uintptr_t)lptransfersize, (void*)(uintptr_t)lpnumoutstandingrequests) : -1;
#else
    (void)hfile;
    (void)nperiodmilliseconds;
    (void)nbytesperperiod;
    (void)bdiscardable;
    (void)lptransfersize;
    (void)lpnumoutstandingrequests;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileCompletionNotificationModes(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jbyte flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileCompletionNotificationModes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint8_t)flags) : -1;
#else
    (void)filehandle;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileInformationByHandle(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint fileinformationclass, jlong lpfileinformation, jint dwbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileInformationByHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (int32_t)fileinformationclass, (void*)(uintptr_t)lpfileinformation, (uint32_t)dwbuffersize) : -1;
#else
    (void)hfile;
    (void)fileinformationclass;
    (void)lpfileinformation;
    (void)dwbuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileIoOverlappedRange(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong overlappedrangestart, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileIoOverlappedRange");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)overlappedrangestart, (uint32_t)length) : -1;
#else
    (void)filehandle;
    (void)overlappedrangestart;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFilePointer(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint ldistancetomove, jlong lpdistancetomovehigh, jint dwmovemethod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFilePointer");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (int32_t)ldistancetomove, (void*)(uintptr_t)lpdistancetomovehigh, (uint32_t)dwmovemethod) : 0;
#else
    (void)hfile;
    (void)ldistancetomove;
    (void)lpdistancetomovehigh;
    (void)dwmovemethod;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFilePointerEx(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lidistancetomove, jlong lpnewfilepointer, jint dwmovemethod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFilePointerEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (int64_t)lidistancetomove, (void*)(uintptr_t)lpnewfilepointer, (uint32_t)dwmovemethod) : -1;
#else
    (void)hfile;
    (void)lidistancetomove;
    (void)lpnewfilepointer;
    (void)dwmovemethod;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileShortNameA(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpshortname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileShortNameA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpshortname) : -1;
#else
    (void)hfile;
    (void)lpshortname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileShortNameW(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpshortname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileShortNameW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpshortname) : -1;
#else
    (void)hfile;
    (void)lpshortname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileTime(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpcreationtime, jlong lplastaccesstime, jlong lplastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpcreationtime, (void*)(uintptr_t)lplastaccesstime, (void*)(uintptr_t)lplastwritetime) : -1;
#else
    (void)hfile;
    (void)lpcreationtime;
    (void)lplastaccesstime;
    (void)lplastwritetime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setFileValidData(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong validdatalength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetFileValidData");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (int64_t)validdatalength) : -1;
#else
    (void)hfile;
    (void)validdatalength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setIoRingCompletionEvent(JNIEnv* km_env, jclass km_clazz, jlong ioring, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIoRingCompletionEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ioring, (void*)(uintptr_t)hevent) : -1;
#else
    (void)ioring;
    (void)hevent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setLogArchiveMode(JNIEnv* km_env, jclass km_clazz, jlong hlog, jint emode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLogArchiveMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (int32_t)emode) : -1;
#else
    (void)hlog;
    (void)emode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setLogArchiveTail(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong plsnarchivetail, jlong preserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLogArchiveTail");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)plsnarchivetail, (void*)(uintptr_t)preserved) : -1;
#else
    (void)hlog;
    (void)plsnarchivetail;
    (void)preserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setLogFileSizeWithPolicy(JNIEnv* km_env, jclass km_clazz, jlong hlog, jlong pdesiredsize, jlong presultingsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetLogFileSizeWithPolicy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hlog, (void*)(uintptr_t)pdesiredsize, (void*)(uintptr_t)presultingsize) : -1;
#else
    (void)hlog;
    (void)pdesiredsize;
    (void)presultingsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setResourceManagerCompletionPort(JNIEnv* km_env, jclass km_clazz, jlong resourcemanagerhandle, jlong iocompletionporthandle, jlong completionkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetResourceManagerCompletionPort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)resourcemanagerhandle, (void*)(uintptr_t)iocompletionporthandle, (uint64_t)completionkey) : -1;
#else
    (void)resourcemanagerhandle;
    (void)iocompletionporthandle;
    (void)completionkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setSearchPathMode(JNIEnv* km_env, jclass km_clazz, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetSearchPathMode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags) : -1;
#else
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setTapeParameters(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint dwoperation, jlong lptapeinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTapeParameters");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)dwoperation, (void*)(uintptr_t)lptapeinformation) : 0;
#else
    (void)hdevice;
    (void)dwoperation;
    (void)lptapeinformation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setTapePosition(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint dwpositionmethod, jint dwpartition, jint dwoffsetlow, jint dwoffsethigh, jint bimmediate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTapePosition");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)dwpositionmethod, (uint32_t)dwpartition, (uint32_t)dwoffsetlow, (uint32_t)dwoffsethigh, (int32_t)bimmediate) : 0;
#else
    (void)hdevice;
    (void)dwpositionmethod;
    (void)dwpartition;
    (void)dwoffsetlow;
    (void)dwoffsethigh;
    (void)bimmediate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setTransactionInformation(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jint isolationlevel, jint isolationflags, jint timeout, jlong description) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTransactionInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)transactionhandle, (uint32_t)isolationlevel, (uint32_t)isolationflags, (uint32_t)timeout, (void*)(uintptr_t)description) : -1;
#else
    (void)transactionhandle;
    (void)isolationlevel;
    (void)isolationflags;
    (void)timeout;
    (void)description;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setUserFileEncryptionKey(JNIEnv* km_env, jclass km_clazz, jlong pencryptioncertificate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserFileEncryptionKey");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pencryptioncertificate) : 0;
#else
    (void)pencryptioncertificate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setUserFileEncryptionKeyEx(JNIEnv* km_env, jclass km_clazz, jlong pencryptioncertificate, jint dwcapabilities, jint dwflags, jlong pvreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUserFileEncryptionKeyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pencryptioncertificate, (uint32_t)dwcapabilities, (uint32_t)dwflags, (void*)(uintptr_t)pvreserved) : 0;
#else
    (void)pencryptioncertificate;
    (void)dwcapabilities;
    (void)dwflags;
    (void)pvreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setVolumeLabelA(JNIEnv* km_env, jclass km_clazz, jlong lprootpathname, jlong lpvolumename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVolumeLabelA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprootpathname, (void*)(uintptr_t)lpvolumename) : -1;
#else
    (void)lprootpathname;
    (void)lpvolumename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setVolumeLabelW(JNIEnv* km_env, jclass km_clazz, jlong lprootpathname, jlong lpvolumename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVolumeLabelW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lprootpathname, (void*)(uintptr_t)lpvolumename) : -1;
#else
    (void)lprootpathname;
    (void)lpvolumename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setVolumeMountPointA(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumemountpoint, jlong lpszvolumename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVolumeMountPointA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumemountpoint, (void*)(uintptr_t)lpszvolumename) : -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1setVolumeMountPointW(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumemountpoint, jlong lpszvolumename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVolumeMountPointW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumemountpoint, (void*)(uintptr_t)lpszvolumename) : -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1singlePhaseReject(JNIEnv* km_env, jclass km_clazz, jlong enlistmenthandle, jlong tmvirtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ktmw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SinglePhaseReject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)enlistmenthandle, (void*)(uintptr_t)tmvirtualclock) : -1;
#else
    (void)enlistmenthandle;
    (void)tmvirtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1submitIoRing(JNIEnv* km_env, jclass km_clazz, jlong ioring, jint waitoperations, jint milliseconds, jlong submittedentries) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-ioring-l1-1-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubmitIoRing");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ioring, (uint32_t)waitoperations, (uint32_t)milliseconds, (void*)(uintptr_t)submittedentries) : -1;
#else
    (void)ioring;
    (void)waitoperations;
    (void)milliseconds;
    (void)submittedentries;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1terminateLogArchive(JNIEnv* km_env, jclass km_clazz, jlong pvarchivecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateLogArchive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvarchivecontext) : -1;
#else
    (void)pvarchivecontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1terminateReadLog(JNIEnv* km_env, jclass km_clazz, jlong pvcursorcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateReadLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvcursorcontext) : -1;
#else
    (void)pvcursorcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1truncateLog(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jlong plsnend, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TruncateLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (void*)(uintptr_t)plsnend, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)pvmarshal;
    (void)plsnend;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1txfGetThreadMiniVersionForCreate(JNIEnv* km_env, jclass km_clazz, jlong miniversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfGetThreadMiniVersionForCreate");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)miniversion);
#else
    (void)miniversion;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1txfLogDestroyReadContext(JNIEnv* km_env, jclass km_clazz, jlong txflogcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfLogDestroyReadContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)txflogcontext) : -1;
#else
    (void)txflogcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1txfLogReadRecords(JNIEnv* km_env, jclass km_clazz, jlong txflogcontext, jint bufferlength, jlong buffer, jlong bytesused, jlong recordcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfLogReadRecords");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)txflogcontext, (uint32_t)bufferlength, (void*)(uintptr_t)buffer, (void*)(uintptr_t)bytesused, (void*)(uintptr_t)recordcount) : -1;
#else
    (void)txflogcontext;
    (void)bufferlength;
    (void)buffer;
    (void)bytesused;
    (void)recordcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1txfLogRecordGetFileName(JNIEnv* km_env, jclass km_clazz, jlong recordbuffer, jint recordbufferlengthinbytes, jlong namebuffer, jlong namebufferlengthinbytes, jlong txfid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfLogRecordGetFileName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)recordbuffer, (uint32_t)recordbufferlengthinbytes, (void*)(uintptr_t)namebuffer, (void*)(uintptr_t)namebufferlengthinbytes, (void*)(uintptr_t)txfid) : -1;
#else
    (void)recordbuffer;
    (void)recordbufferlengthinbytes;
    (void)namebuffer;
    (void)namebufferlengthinbytes;
    (void)txfid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1txfLogRecordGetGenericType(JNIEnv* km_env, jclass km_clazz, jlong recordbuffer, jint recordbufferlengthinbytes, jlong generictype, jlong virtualclock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfLogRecordGetGenericType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)recordbuffer, (uint32_t)recordbufferlengthinbytes, (void*)(uintptr_t)generictype, (void*)(uintptr_t)virtualclock) : -1;
#else
    (void)recordbuffer;
    (void)recordbufferlengthinbytes;
    (void)generictype;
    (void)virtualclock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1txfReadMetadataInfo(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong txffileid, jlong lastlsn, jlong transactionstate, jlong lockingtransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfReadMetadataInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)txffileid, (void*)(uintptr_t)lastlsn, (void*)(uintptr_t)transactionstate, (void*)(uintptr_t)lockingtransaction) : -1;
#else
    (void)filehandle;
    (void)txffileid;
    (void)lastlsn;
    (void)transactionstate;
    (void)lockingtransaction;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1txfSetThreadMiniVersionForCreate(JNIEnv* km_env, jclass km_clazz, jshort miniversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("txfw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TxfSetThreadMiniVersionForCreate");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint16_t)miniversion);
#else
    (void)miniversion;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1unlockFile(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint dwfileoffsetlow, jint dwfileoffsethigh, jint nnumberofbytestounlocklow, jint nnumberofbytestounlockhigh) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)dwfileoffsetlow, (uint32_t)dwfileoffsethigh, (uint32_t)nnumberofbytestounlocklow, (uint32_t)nnumberofbytestounlockhigh) : -1;
#else
    (void)hfile;
    (void)dwfileoffsetlow;
    (void)dwfileoffsethigh;
    (void)nnumberofbytestounlocklow;
    (void)nnumberofbytestounlockhigh;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1unlockFileEx(JNIEnv* km_env, jclass km_clazz, jlong hfile, jint dwreserved, jint nnumberofbytestounlocklow, jint nnumberofbytestounlockhigh, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnlockFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (uint32_t)dwreserved, (uint32_t)nnumberofbytestounlocklow, (uint32_t)nnumberofbytestounlockhigh, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hfile;
    (void)dwreserved;
    (void)nnumberofbytestounlocklow;
    (void)nnumberofbytestounlockhigh;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1validateLog(JNIEnv* km_env, jclass km_clazz, jlong pszlogfilename, jlong psalogfile, jlong pinfobuffer, jlong pcbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ValidateLog");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszlogfilename, (void*)(uintptr_t)psalogfile, (void*)(uintptr_t)pinfobuffer, (void*)(uintptr_t)pcbbuffer) : -1;
#else
    (void)pszlogfilename;
    (void)psalogfile;
    (void)pinfobuffer;
    (void)pcbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1verFindFileA(JNIEnv* km_env, jclass km_clazz, jint uflags, jlong szfilename, jlong szwindir, jlong szappdir, jlong szcurdir, jlong pucurdirlen, jlong szdestdir, jlong pudestdirlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerFindFileA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uflags, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szwindir, (void*)(uintptr_t)szappdir, (void*)(uintptr_t)szcurdir, (void*)(uintptr_t)pucurdirlen, (void*)(uintptr_t)szdestdir, (void*)(uintptr_t)pudestdirlen) : 0;
#else
    (void)uflags;
    (void)szfilename;
    (void)szwindir;
    (void)szappdir;
    (void)szcurdir;
    (void)pucurdirlen;
    (void)szdestdir;
    (void)pudestdirlen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1verFindFileW(JNIEnv* km_env, jclass km_clazz, jint uflags, jlong szfilename, jlong szwindir, jlong szappdir, jlong szcurdir, jlong pucurdirlen, jlong szdestdir, jlong pudestdirlen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerFindFileW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uflags, (void*)(uintptr_t)szfilename, (void*)(uintptr_t)szwindir, (void*)(uintptr_t)szappdir, (void*)(uintptr_t)szcurdir, (void*)(uintptr_t)pucurdirlen, (void*)(uintptr_t)szdestdir, (void*)(uintptr_t)pudestdirlen) : 0;
#else
    (void)uflags;
    (void)szfilename;
    (void)szwindir;
    (void)szappdir;
    (void)szcurdir;
    (void)pucurdirlen;
    (void)szdestdir;
    (void)pudestdirlen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1verInstallFileA(JNIEnv* km_env, jclass km_clazz, jint uflags, jlong szsrcfilename, jlong szdestfilename, jlong szsrcdir, jlong szdestdir, jlong szcurdir, jlong sztmpfile, jlong putmpfilelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerInstallFileA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uflags, (void*)(uintptr_t)szsrcfilename, (void*)(uintptr_t)szdestfilename, (void*)(uintptr_t)szsrcdir, (void*)(uintptr_t)szdestdir, (void*)(uintptr_t)szcurdir, (void*)(uintptr_t)sztmpfile, (void*)(uintptr_t)putmpfilelen) : 0;
#else
    (void)uflags;
    (void)szsrcfilename;
    (void)szdestfilename;
    (void)szsrcdir;
    (void)szdestdir;
    (void)szcurdir;
    (void)sztmpfile;
    (void)putmpfilelen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1verInstallFileW(JNIEnv* km_env, jclass km_clazz, jint uflags, jlong szsrcfilename, jlong szdestfilename, jlong szsrcdir, jlong szdestdir, jlong szcurdir, jlong sztmpfile, jlong putmpfilelen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerInstallFileW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)uflags, (void*)(uintptr_t)szsrcfilename, (void*)(uintptr_t)szdestfilename, (void*)(uintptr_t)szsrcdir, (void*)(uintptr_t)szdestdir, (void*)(uintptr_t)szcurdir, (void*)(uintptr_t)sztmpfile, (void*)(uintptr_t)putmpfilelen) : 0;
#else
    (void)uflags;
    (void)szsrcfilename;
    (void)szdestfilename;
    (void)szsrcdir;
    (void)szdestdir;
    (void)szcurdir;
    (void)sztmpfile;
    (void)putmpfilelen;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1verLanguageNameA(JNIEnv* km_env, jclass km_clazz, jint wlang, jlong szlang, jint cchlang) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerLanguageNameA");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wlang, (void*)(uintptr_t)szlang, (uint32_t)cchlang) : 0;
#else
    (void)wlang;
    (void)szlang;
    (void)cchlang;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1verLanguageNameW(JNIEnv* km_env, jclass km_clazz, jint wlang, jlong szlang, jint cchlang) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerLanguageNameW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)wlang, (void*)(uintptr_t)szlang, (uint32_t)cchlang) : 0;
#else
    (void)wlang;
    (void)szlang;
    (void)cchlang;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1verQueryValueA(JNIEnv* km_env, jclass km_clazz, jlong pblock, jlong lpsubblock, jlong lplpbuffer, jlong pulen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerQueryValueA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pblock, (void*)(uintptr_t)lpsubblock, (void*)(uintptr_t)lplpbuffer, (void*)(uintptr_t)pulen) : -1;
#else
    (void)pblock;
    (void)lpsubblock;
    (void)lplpbuffer;
    (void)pulen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1verQueryValueW(JNIEnv* km_env, jclass km_clazz, jlong pblock, jlong lpsubblock, jlong lplpbuffer, jlong pulen) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("version.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerQueryValueW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pblock, (void*)(uintptr_t)lpsubblock, (void*)(uintptr_t)lplpbuffer, (void*)(uintptr_t)pulen) : -1;
#else
    (void)pblock;
    (void)lpsubblock;
    (void)lplpbuffer;
    (void)pulen;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofEnumEntries(JNIEnv* km_env, jclass km_clazz, jlong volumename, jint provider, jlong enumproc, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofEnumEntries");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumename, (uint32_t)provider, (void*)(uintptr_t)enumproc, (void*)(uintptr_t)userdata) : -1;
#else
    (void)volumename;
    (void)provider;
    (void)enumproc;
    (void)userdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofFileEnumFiles(JNIEnv* km_env, jclass km_clazz, jlong volumename, jint algorithm, jlong enumproc, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofFileEnumFiles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumename, (uint32_t)algorithm, (void*)(uintptr_t)enumproc, (void*)(uintptr_t)userdata) : -1;
#else
    (void)volumename;
    (void)algorithm;
    (void)enumproc;
    (void)userdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofGetDriverVersion(JNIEnv* km_env, jclass km_clazz, jlong fileorvolumehandle, jint provider, jlong wofversion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofGetDriverVersion");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileorvolumehandle, (uint32_t)provider, (void*)(uintptr_t)wofversion) : -1;
#else
    (void)fileorvolumehandle;
    (void)provider;
    (void)wofversion;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofIsExternalFile(JNIEnv* km_env, jclass km_clazz, jlong filepath, jlong isexternalfile, jlong provider, jlong externalfileinfo, jlong bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofIsExternalFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filepath, (void*)(uintptr_t)isexternalfile, (void*)(uintptr_t)provider, (void*)(uintptr_t)externalfileinfo, (void*)(uintptr_t)bufferlength) : -1;
#else
    (void)filepath;
    (void)isexternalfile;
    (void)provider;
    (void)externalfileinfo;
    (void)bufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofSetFileDataLocation(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint provider, jlong externalfileinfo, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofSetFileDataLocation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)provider, (void*)(uintptr_t)externalfileinfo, (uint32_t)length) : -1;
#else
    (void)filehandle;
    (void)provider;
    (void)externalfileinfo;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofShouldCompressBinaries(JNIEnv* km_env, jclass km_clazz, jlong volume, jlong algorithm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofShouldCompressBinaries");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volume, (void*)(uintptr_t)algorithm) : -1;
#else
    (void)volume;
    (void)algorithm;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofWimAddEntry(JNIEnv* km_env, jclass km_clazz, jlong volumename, jlong wimpath, jint wimtype, jint wimindex, jlong datasourceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimAddEntry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumename, (void*)(uintptr_t)wimpath, (uint32_t)wimtype, (uint32_t)wimindex, (void*)(uintptr_t)datasourceid) : -1;
#else
    (void)volumename;
    (void)wimpath;
    (void)wimtype;
    (void)wimindex;
    (void)datasourceid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofWimEnumFiles(JNIEnv* km_env, jclass km_clazz, jlong volumename, jlong datasourceid, jlong enumproc, jlong userdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimEnumFiles");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumename, (int64_t)datasourceid, (void*)(uintptr_t)enumproc, (void*)(uintptr_t)userdata) : -1;
#else
    (void)volumename;
    (void)datasourceid;
    (void)enumproc;
    (void)userdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofWimRemoveEntry(JNIEnv* km_env, jclass km_clazz, jlong volumename, jlong datasourceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimRemoveEntry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumename, (int64_t)datasourceid) : -1;
#else
    (void)volumename;
    (void)datasourceid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofWimSuspendEntry(JNIEnv* km_env, jclass km_clazz, jlong volumename, jlong datasourceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimSuspendEntry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumename, (int64_t)datasourceid) : -1;
#else
    (void)volumename;
    (void)datasourceid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wofWimUpdateEntry(JNIEnv* km_env, jclass km_clazz, jlong volumename, jlong datasourceid, jlong newwimpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wofutil.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WofWimUpdateEntry");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumename, (int64_t)datasourceid, (void*)(uintptr_t)newwimpath) : -1;
#else
    (void)volumename;
    (void)datasourceid;
    (void)newwimpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wow64DisableWow64FsRedirection(JNIEnv* km_env, jclass km_clazz, jlong oldvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64DisableWow64FsRedirection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oldvalue) : -1;
#else
    (void)oldvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wow64EnableWow64FsRedirection(JNIEnv* km_env, jclass km_clazz, jboolean wow64fsenableredirection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64EnableWow64FsRedirection");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((bool)wow64fsenableredirection) : false;
#else
    (void)wow64fsenableredirection;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1wow64RevertWow64FsRedirection(JNIEnv* km_env, jclass km_clazz, jlong olvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64RevertWow64FsRedirection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)olvalue) : -1;
#else
    (void)olvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1writeEncryptedFileRaw(JNIEnv* km_env, jclass km_clazz, jlong pfimportcallback, jlong pvcallbackcontext, jlong pvcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteEncryptedFileRaw");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfimportcallback, (void*)(uintptr_t)pvcallbackcontext, (void*)(uintptr_t)pvcontext) : 0;
#else
    (void)pfimportcallback;
    (void)pvcallbackcontext;
    (void)pvcontext;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1writeFile(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint nnumberofbytestowrite, jlong lpnumberofbyteswritten, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofbytestowrite, (void*)(uintptr_t)lpnumberofbyteswritten, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestowrite;
    (void)lpnumberofbyteswritten;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1writeFileEx(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong lpbuffer, jint nnumberofbytestowrite, jlong lpoverlapped, jlong lpcompletionroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)lpbuffer, (uint32_t)nnumberofbytestowrite, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)lpcompletionroutine) : -1;
#else
    (void)hfile;
    (void)lpbuffer;
    (void)nnumberofbytestowrite;
    (void)lpoverlapped;
    (void)lpcompletionroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1writeFileGather(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong asegmentarray, jint nnumberofbytestowrite, jlong lpreserved, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteFileGather");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)asegmentarray, (uint32_t)nnumberofbytestowrite, (void*)(uintptr_t)lpreserved, (void*)(uintptr_t)lpoverlapped) : -1;
#else
    (void)hfile;
    (void)asegmentarray;
    (void)nnumberofbytestowrite;
    (void)lpreserved;
    (void)lpoverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1writeLogRestartArea(JNIEnv* km_env, jclass km_clazz, jlong pvmarshal, jlong pvrestartbuffer, jint cbrestartbuffer, jlong plsnbase, jint fflags, jlong pcbwritten, jlong plsnnext, jlong poverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clfsw32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteLogRestartArea");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvmarshal, (void*)(uintptr_t)pvrestartbuffer, (uint32_t)cbrestartbuffer, (void*)(uintptr_t)plsnbase, (uint32_t)fflags, (void*)(uintptr_t)pcbwritten, (void*)(uintptr_t)plsnnext, (void*)(uintptr_t)poverlapped) : -1;
#else
    (void)pvmarshal;
    (void)pvrestartbuffer;
    (void)cbrestartbuffer;
    (void)plsnbase;
    (void)fflags;
    (void)pcbwritten;
    (void)plsnnext;
    (void)poverlapped;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_storage_filesystem_WindowsWin32StorageFilesystemJniBridge_windowssys_1windows_1win32_1storage_1filesystem_1writeTapemark(JNIEnv* km_env, jclass km_clazz, jlong hdevice, jint dwtapemarktype, jint dwtapemarkcount, jint bimmediate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WriteTapemark");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hdevice, (uint32_t)dwtapemarktype, (uint32_t)dwtapemarkcount, (int32_t)bimmediate) : 0;
#else
    (void)hdevice;
    (void)dwtapemarktype;
    (void)dwtapemarkcount;
    (void)bimmediate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

