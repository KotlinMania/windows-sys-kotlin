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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntCancelTimer(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jlong currentstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCancelTimer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (void*)(uintptr_t)currentstate) : -1;
#else
    (void)timerhandle;
    (void)currentstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntCreateTimer(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jint desiredaccess, jlong objectattributes, jint timertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateTimer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (int32_t)timertype) : -1;
#else
    (void)timerhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)timertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntOpenEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eventhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntOpenProcess(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jlong objectattributes, jlong clientid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)clientid) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)clientid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntOpenTimer(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenTimer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)timerhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntQueryInformationProcess(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint processinformationclass, jlong processinformation, jint processinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (int32_t)processinformationclass, (void*)(uintptr_t)processinformation, (uint32_t)processinformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)processhandle;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntQueryInformationThread(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint threadinformationclass, jlong threadinformation, jint threadinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (int32_t)threadinformationclass, (void*)(uintptr_t)threadinformation, (uint32_t)threadinformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)threadhandle;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntSetInformationThread(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint threadinformationclass, jlong threadinformation, jint threadinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (int32_t)threadinformationclass, (void*)(uintptr_t)threadinformation, (uint32_t)threadinformationlength) : -1;
#else
    (void)threadhandle;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntSetTimer(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jlong duetime, jlong timerapcroutine, jlong timercontext, jboolean resumetimer, jint period, jlong previousstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetTimer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (void*)(uintptr_t)duetime, (void*)(uintptr_t)timerapcroutine, (void*)(uintptr_t)timercontext, (bool)resumetimer, (int32_t)period, (void*)(uintptr_t)previousstate) : -1;
#else
    (void)timerhandle;
    (void)duetime;
    (void)timerapcroutine;
    (void)timercontext;
    (void)resumetimer;
    (void)period;
    (void)previousstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntSetTimerEx(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jint timersetinformationclass, jlong timersetinformation, jint timersetinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetTimerEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (int32_t)timersetinformationclass, (void*)(uintptr_t)timersetinformation, (uint32_t)timersetinformationlength) : -1;
#else
    (void)timerhandle;
    (void)timersetinformationclass;
    (void)timersetinformation;
    (void)timersetinformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntTerminateProcess(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint exitstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtTerminateProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (int32_t)exitstatus) : -1;
#else
    (void)processhandle;
    (void)exitstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1ntWaitForSingleObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jboolean alertable, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtWaitForSingleObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (bool)alertable, (void*)(uintptr_t)timeout) : -1;
#else
    (void)handle;
    (void)alertable;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwCancelTimer(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jlong currentstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCancelTimer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (void*)(uintptr_t)currentstate) : -1;
#else
    (void)timerhandle;
    (void)currentstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwCreateTimer(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jint desiredaccess, jlong objectattributes, jint timertype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateTimer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (int32_t)timertype) : -1;
#else
    (void)timerhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)timertype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwOpenEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eventhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwOpenProcess(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jlong objectattributes, jlong clientid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)clientid) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)clientid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwOpenTimer(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenTimer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)timerhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwQueryInformationProcess(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint processinformationclass, jlong processinformation, jint processinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (int32_t)processinformationclass, (void*)(uintptr_t)processinformation, (uint32_t)processinformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)processhandle;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwQueryInformationThread(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint threadinformationclass, jlong threadinformation, jint threadinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (int32_t)threadinformationclass, (void*)(uintptr_t)threadinformation, (uint32_t)threadinformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)threadhandle;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwSetInformationThread(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint threadinformationclass, jlong threadinformation, jint threadinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (int32_t)threadinformationclass, (void*)(uintptr_t)threadinformation, (uint32_t)threadinformationlength) : -1;
#else
    (void)threadhandle;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwSetTimer(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jlong duetime, jlong timerapcroutine, jlong timercontext, jboolean resumetimer, jint period, jlong previousstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetTimer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (void*)(uintptr_t)duetime, (void*)(uintptr_t)timerapcroutine, (void*)(uintptr_t)timercontext, (bool)resumetimer, (int32_t)period, (void*)(uintptr_t)previousstate) : -1;
#else
    (void)timerhandle;
    (void)duetime;
    (void)timerapcroutine;
    (void)timercontext;
    (void)resumetimer;
    (void)period;
    (void)previousstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwSetTimerEx(JNIEnv* km_env, jclass km_clazz, jlong timerhandle, jint timersetinformationclass, jlong timersetinformation, jint timersetinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetTimerEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timerhandle, (int32_t)timersetinformationclass, (void*)(uintptr_t)timersetinformation, (uint32_t)timersetinformationlength) : -1;
#else
    (void)timerhandle;
    (void)timersetinformationclass;
    (void)timersetinformation;
    (void)timersetinformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwTerminateProcess(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint exitstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwTerminateProcess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (int32_t)exitstatus) : -1;
#else
    (void)processhandle;
    (void)exitstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_threading_WindowsWdkSystemThreadingJniBridge_windowssys_1windows_1wdk_1system_1threading_1zwWaitForSingleObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jboolean alertable, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwWaitForSingleObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (bool)alertable, (void*)(uintptr_t)timeout) : -1;
#else
    (void)handle;
    (void)alertable;
    (void)timeout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

