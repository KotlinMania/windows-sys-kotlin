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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1addERExcludedApplicationA(JNIEnv* km_env, jclass km_clazz, jlong szapplication) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("faultrep.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddERExcludedApplicationA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)szapplication) : -1;
#else
    (void)szapplication;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1addERExcludedApplicationW(JNIEnv* km_env, jclass km_clazz, jlong wszapplication) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("faultrep.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddERExcludedApplicationW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)wszapplication) : -1;
#else
    (void)wszapplication;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1reportFault(JNIEnv* km_env, jclass km_clazz, jlong pep, jint dwopt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("faultrep.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReportFault");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pep, (uint32_t)dwopt) : -1;
#else
    (void)pep;
    (void)dwopt;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werAddExcludedApplication(JNIEnv* km_env, jclass km_clazz, jlong pwzexename, jint ballusers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerAddExcludedApplication");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzexename, (int32_t)ballusers) : -1;
#else
    (void)pwzexename;
    (void)ballusers;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werFreeString(JNIEnv* km_env, jclass km_clazz, jlong pwszstr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerFreeString");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)pwszstr);
#else
    (void)pwszstr;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werGetFlags(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerGetFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pdwflags) : -1;
#else
    (void)hprocess;
    (void)pdwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werRegisterAdditionalProcess(JNIEnv* km_env, jclass km_clazz, jint processid, jint captureextrainfoforthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterAdditionalProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)processid, (uint32_t)captureextrainfoforthreadid) : -1;
#else
    (void)processid;
    (void)captureextrainfoforthreadid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werRegisterAppLocalDump(JNIEnv* km_env, jclass km_clazz, jlong localappdatarelativepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterAppLocalDump");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)localappdatarelativepath) : -1;
#else
    (void)localappdatarelativepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werRegisterCustomMetadata(JNIEnv* km_env, jclass km_clazz, jlong key, jlong value) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterCustomMetadata");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)key, (void*)(uintptr_t)value) : -1;
#else
    (void)key;
    (void)value;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werRegisterExcludedMemoryBlock(JNIEnv* km_env, jclass km_clazz, jlong address, jint size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterExcludedMemoryBlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)address, (uint32_t)size) : -1;
#else
    (void)address;
    (void)size;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werRegisterFile(JNIEnv* km_env, jclass km_clazz, jlong pwzfile, jint regfiletype, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzfile, (int32_t)regfiletype, (uint32_t)dwflags) : -1;
#else
    (void)pwzfile;
    (void)regfiletype;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werRegisterMemoryBlock(JNIEnv* km_env, jclass km_clazz, jlong pvaddress, jint dwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterMemoryBlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvaddress, (uint32_t)dwsize) : -1;
#else
    (void)pvaddress;
    (void)dwsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werRegisterRuntimeExceptionModule(JNIEnv* km_env, jclass km_clazz, jlong pwszoutofprocesscallbackdll, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRegisterRuntimeExceptionModule");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszoutofprocesscallbackdll, (void*)(uintptr_t)pcontext) : -1;
#else
    (void)pwszoutofprocesscallbackdll;
    (void)pcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werRemoveExcludedApplication(JNIEnv* km_env, jclass km_clazz, jlong pwzexename, jint ballusers) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerRemoveExcludedApplication");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzexename, (int32_t)ballusers) : -1;
#else
    (void)pwzexename;
    (void)ballusers;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werReportAddDump(JNIEnv* km_env, jclass km_clazz, jlong hreporthandle, jlong hprocess, jlong hthread, jint dumptype, jlong pexceptionparam, jlong pdumpcustomoptions, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportAddDump");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreporthandle, (void*)(uintptr_t)hprocess, (void*)(uintptr_t)hthread, (int32_t)dumptype, (void*)(uintptr_t)pexceptionparam, (void*)(uintptr_t)pdumpcustomoptions, (uint32_t)dwflags) : -1;
#else
    (void)hreporthandle;
    (void)hprocess;
    (void)hthread;
    (void)dumptype;
    (void)pexceptionparam;
    (void)pdumpcustomoptions;
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werReportAddFile(JNIEnv* km_env, jclass km_clazz, jlong hreporthandle, jlong pwzpath, jint repfiletype, jint dwfileflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportAddFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreporthandle, (void*)(uintptr_t)pwzpath, (int32_t)repfiletype, (uint32_t)dwfileflags) : -1;
#else
    (void)hreporthandle;
    (void)pwzpath;
    (void)repfiletype;
    (void)dwfileflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werReportCloseHandle(JNIEnv* km_env, jclass km_clazz, jlong hreporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportCloseHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreporthandle) : -1;
#else
    (void)hreporthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werReportCreate(JNIEnv* km_env, jclass km_clazz, jlong pwzeventtype, jint reptype, jlong preportinformation, jlong phreporthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportCreate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzeventtype, (int32_t)reptype, (void*)(uintptr_t)preportinformation, (void*)(uintptr_t)phreporthandle) : -1;
#else
    (void)pwzeventtype;
    (void)reptype;
    (void)preportinformation;
    (void)phreporthandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werReportHang(JNIEnv* km_env, jclass km_clazz, jlong hwndhungapp, jlong pwzhungapplicationname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("faultrep.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportHang");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hwndhungapp, (void*)(uintptr_t)pwzhungapplicationname) : -1;
#else
    (void)hwndhungapp;
    (void)pwzhungapplicationname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werReportSetParameter(JNIEnv* km_env, jclass km_clazz, jlong hreporthandle, jint dwparamid, jlong pwzname, jlong pwzvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportSetParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreporthandle, (uint32_t)dwparamid, (void*)(uintptr_t)pwzname, (void*)(uintptr_t)pwzvalue) : -1;
#else
    (void)hreporthandle;
    (void)dwparamid;
    (void)pwzname;
    (void)pwzvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werReportSetUIOption(JNIEnv* km_env, jclass km_clazz, jlong hreporthandle, jint repuitypeid, jlong pwzvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportSetUIOption");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreporthandle, (int32_t)repuitypeid, (void*)(uintptr_t)pwzvalue) : -1;
#else
    (void)hreporthandle;
    (void)repuitypeid;
    (void)pwzvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werReportSubmit(JNIEnv* km_env, jclass km_clazz, jlong hreporthandle, jint consent, jint dwflags, jlong psubmitresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerReportSubmit");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreporthandle, (int32_t)consent, (uint32_t)dwflags, (void*)(uintptr_t)psubmitresult) : -1;
#else
    (void)hreporthandle;
    (void)consent;
    (void)dwflags;
    (void)psubmitresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werSetFlags(JNIEnv* km_env, jclass km_clazz, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerSetFlags");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwflags) : -1;
#else
    (void)dwflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreClose(JNIEnv* km_env, jclass km_clazz, jlong hreportstore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreClose");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)hreportstore);
#else
    (void)hreportstore;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreGetFirstReportKey(JNIEnv* km_env, jclass km_clazz, jlong hreportstore, jlong ppszreportkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreGetFirstReportKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreportstore, (void*)(uintptr_t)ppszreportkey) : -1;
#else
    (void)hreportstore;
    (void)ppszreportkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreGetNextReportKey(JNIEnv* km_env, jclass km_clazz, jlong hreportstore, jlong ppszreportkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreGetNextReportKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreportstore, (void*)(uintptr_t)ppszreportkey) : -1;
#else
    (void)hreportstore;
    (void)ppszreportkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreGetReportCount(JNIEnv* km_env, jclass km_clazz, jlong hreportstore, jlong pdwreportcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreGetReportCount");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreportstore, (void*)(uintptr_t)pdwreportcount) : -1;
#else
    (void)hreportstore;
    (void)pdwreportcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreGetSizeOnDisk(JNIEnv* km_env, jclass km_clazz, jlong hreportstore, jlong pqwsizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreGetSizeOnDisk");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreportstore, (void*)(uintptr_t)pqwsizeinbytes) : -1;
#else
    (void)hreportstore;
    (void)pqwsizeinbytes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreOpen(JNIEnv* km_env, jclass km_clazz, jint repstoretype, jlong phreportstore) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreOpen");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)repstoretype, (void*)(uintptr_t)phreportstore) : -1;
#else
    (void)repstoretype;
    (void)phreportstore;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStorePurge(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStorePurge");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreQueryReportMetadataV1(JNIEnv* km_env, jclass km_clazz, jlong hreportstore, jlong pszreportkey, jlong preportmetadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreQueryReportMetadataV1");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreportstore, (void*)(uintptr_t)pszreportkey, (void*)(uintptr_t)preportmetadata) : -1;
#else
    (void)hreportstore;
    (void)pszreportkey;
    (void)preportmetadata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreQueryReportMetadataV2(JNIEnv* km_env, jclass km_clazz, jlong hreportstore, jlong pszreportkey, jlong preportmetadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreQueryReportMetadataV2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreportstore, (void*)(uintptr_t)pszreportkey, (void*)(uintptr_t)preportmetadata) : -1;
#else
    (void)hreportstore;
    (void)pszreportkey;
    (void)preportmetadata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreQueryReportMetadataV3(JNIEnv* km_env, jclass km_clazz, jlong hreportstore, jlong pszreportkey, jlong preportmetadata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreQueryReportMetadataV3");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreportstore, (void*)(uintptr_t)pszreportkey, (void*)(uintptr_t)preportmetadata) : -1;
#else
    (void)hreportstore;
    (void)pszreportkey;
    (void)preportmetadata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werStoreUploadReport(JNIEnv* km_env, jclass km_clazz, jlong hreportstore, jlong pszreportkey, jint dwflags, jlong psubmitresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("wer.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerStoreUploadReport");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hreportstore, (void*)(uintptr_t)pszreportkey, (uint32_t)dwflags, (void*)(uintptr_t)psubmitresult) : -1;
#else
    (void)hreportstore;
    (void)pszreportkey;
    (void)dwflags;
    (void)psubmitresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werUnregisterAdditionalProcess(JNIEnv* km_env, jclass km_clazz, jint processid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterAdditionalProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)processid) : -1;
#else
    (void)processid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werUnregisterAppLocalDump(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterAppLocalDump");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werUnregisterCustomMetadata(JNIEnv* km_env, jclass km_clazz, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterCustomMetadata");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)key) : -1;
#else
    (void)key;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werUnregisterExcludedMemoryBlock(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterExcludedMemoryBlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)address) : -1;
#else
    (void)address;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werUnregisterFile(JNIEnv* km_env, jclass km_clazz, jlong pwzfilepath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwzfilepath) : -1;
#else
    (void)pwzfilepath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werUnregisterMemoryBlock(JNIEnv* km_env, jclass km_clazz, jlong pvaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterMemoryBlock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pvaddress) : -1;
#else
    (void)pvaddress;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_errorreporting_WindowsWin32SystemErrorreportingJniBridge_windowssys_1windows_1win32_1system_1errorreporting_1werUnregisterRuntimeExceptionModule(JNIEnv* km_env, jclass km_clazz, jlong pwszoutofprocesscallbackdll, jlong pcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WerUnregisterRuntimeExceptionModule");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pwszoutofprocesscallbackdll, (void*)(uintptr_t)pcontext) : -1;
#else
    (void)pwszoutofprocesscallbackdll;
    (void)pcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

