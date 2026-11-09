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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1AssignProcessToJobObject(JNIEnv* km_env, jclass km_clazz, jlong hjob, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AssignProcessToJobObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hjob, (void*)(uintptr_t)hprocess) : -1;
#else
    (void)hjob;
    (void)hprocess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1CreateJobObjectA(JNIEnv* km_env, jclass km_clazz, jlong lpjobattributes, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateJobObjectA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpjobattributes, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)lpjobattributes;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1CreateJobObjectW(JNIEnv* km_env, jclass km_clazz, jlong lpjobattributes, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateJobObjectW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpjobattributes, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)lpjobattributes;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1CreateJobSet(JNIEnv* km_env, jclass km_clazz, jint numjob, jlong userjobset, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateJobSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)numjob, (void*)(uintptr_t)userjobset, (uint32_t)flags) : -1;
#else
    (void)numjob;
    (void)userjobset;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1FreeMemoryJobObject(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeMemoryJobObject");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)buffer);
#else
    (void)buffer;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1IsProcessInJob(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong jobhandle, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessInJob");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)jobhandle, (void*)(uintptr_t)result) : -1;
#else
    (void)processhandle;
    (void)jobhandle;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1OpenJobObjectA(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenJobObjectA");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1OpenJobObjectW(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenJobObjectW");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname) : NULL;
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1QueryInformationJobObject(JNIEnv* km_env, jclass km_clazz, jlong hjob, jint jobobjectinformationclass, jlong lpjobobjectinformation, jint cbjobobjectinformationlength, jlong lpreturnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryInformationJobObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hjob, (int32_t)jobobjectinformationclass, (void*)(uintptr_t)lpjobobjectinformation, (uint32_t)cbjobobjectinformationlength, (void*)(uintptr_t)lpreturnlength) : -1;
#else
    (void)hjob;
    (void)jobobjectinformationclass;
    (void)lpjobobjectinformation;
    (void)cbjobobjectinformationlength;
    (void)lpreturnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1QueryIoRateControlInformationJobObject(JNIEnv* km_env, jclass km_clazz, jlong hjob, jlong volumename, jlong infoblocks, jlong infoblockcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryIoRateControlInformationJobObject");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hjob, (void*)(uintptr_t)volumename, (void*)(uintptr_t)infoblocks, (void*)(uintptr_t)infoblockcount) : 0;
#else
    (void)hjob;
    (void)volumename;
    (void)infoblocks;
    (void)infoblockcount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1SetInformationJobObject(JNIEnv* km_env, jclass km_clazz, jlong hjob, jint jobobjectinformationclass, jlong lpjobobjectinformation, jint cbjobobjectinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetInformationJobObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hjob, (int32_t)jobobjectinformationclass, (void*)(uintptr_t)lpjobobjectinformation, (uint32_t)cbjobobjectinformationlength) : -1;
#else
    (void)hjob;
    (void)jobobjectinformationclass;
    (void)lpjobobjectinformation;
    (void)cbjobobjectinformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1SetIoRateControlInformationJobObject(JNIEnv* km_env, jclass km_clazz, jlong hjob, jlong ioratecontrolinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetIoRateControlInformationJobObject");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hjob, (void*)(uintptr_t)ioratecontrolinfo) : 0;
#else
    (void)hjob;
    (void)ioratecontrolinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1TerminateJobObject(JNIEnv* km_env, jclass km_clazz, jlong hjob, jint uexitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateJobObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hjob, (uint32_t)uexitcode) : -1;
#else
    (void)hjob;
    (void)uexitcode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_jobobjects_WindowsWin32SystemJobobjectsJniBridge_windowssys_1windows_1win32_1system_1jobobjects_1UserHandleGrantAccess(JNIEnv* km_env, jclass km_clazz, jlong huserhandle, jlong hjob, jint bgrant) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UserHandleGrantAccess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)huserhandle, (void*)(uintptr_t)hjob, (int32_t)bgrant) : -1;
#else
    (void)huserhandle;
    (void)hjob;
    (void)bgrant;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

