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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1acquireSRWLockExclusive(JNIEnv* km_env, jclass km_clazz, jlong srwlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireSRWLockExclusive");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1acquireSRWLockShared(JNIEnv* km_env, jclass km_clazz, jlong srwlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AcquireSRWLockShared");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1addIntegrityLabelToBoundaryDescriptor(JNIEnv* km_env, jclass km_clazz, jlong boundarydescriptor, jlong integritylabel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddIntegrityLabelToBoundaryDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)boundarydescriptor, (void*)(uintptr_t)integritylabel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boundarydescriptor;
    (void)integritylabel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1addSIDToBoundaryDescriptor(JNIEnv* km_env, jclass km_clazz, jlong boundarydescriptor, jlong requiredsid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddSIDToBoundaryDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)boundarydescriptor, (void*)(uintptr_t)requiredsid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)boundarydescriptor;
    (void)requiredsid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1attachThreadInput(JNIEnv* km_env, jclass km_clazz, jint idattach, jint idattachto, jint fattach) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AttachThreadInput");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)idattach, (uint32_t)idattachto, (int32_t)fattach);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)idattach;
    (void)idattachto;
    (void)fattach;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avQuerySystemResponsiveness(JNIEnv* km_env, jclass km_clazz, jlong avrthandle, jlong systemresponsivenessvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvQuerySystemResponsiveness");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)avrthandle, (void*)(uintptr_t)systemresponsivenessvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)avrthandle;
    (void)systemresponsivenessvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avRevertMmThreadCharacteristics(JNIEnv* km_env, jclass km_clazz, jlong avrthandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRevertMmThreadCharacteristics");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)avrthandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)avrthandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avRtCreateThreadOrderingGroup(JNIEnv* km_env, jclass km_clazz, jlong context, jlong period, jlong threadorderingguid, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtCreateThreadOrderingGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)period, (void*)(uintptr_t)threadorderingguid, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avRtCreateThreadOrderingGroupExA(JNIEnv* km_env, jclass km_clazz, jlong context, jlong period, jlong threadorderingguid, jlong timeout, jlong taskname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtCreateThreadOrderingGroupExA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)period, (void*)(uintptr_t)threadorderingguid, (void*)(uintptr_t)timeout, (void*)(uintptr_t)taskname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    (void)taskname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avRtCreateThreadOrderingGroupExW(JNIEnv* km_env, jclass km_clazz, jlong context, jlong period, jlong threadorderingguid, jlong timeout, jlong taskname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtCreateThreadOrderingGroupExW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)period, (void*)(uintptr_t)threadorderingguid, (void*)(uintptr_t)timeout, (void*)(uintptr_t)taskname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)period;
    (void)threadorderingguid;
    (void)timeout;
    (void)taskname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avRtDeleteThreadOrderingGroup(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtDeleteThreadOrderingGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avRtJoinThreadOrderingGroup(JNIEnv* km_env, jclass km_clazz, jlong context, jlong threadorderingguid, jint before) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtJoinThreadOrderingGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)threadorderingguid, (int32_t)before);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)threadorderingguid;
    (void)before;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avRtLeaveThreadOrderingGroup(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtLeaveThreadOrderingGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avRtWaitOnThreadOrderingGroup(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvRtWaitOnThreadOrderingGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avSetMmMaxThreadCharacteristicsA(JNIEnv* km_env, jclass km_clazz, jlong firsttask, jlong secondtask, jlong taskindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmMaxThreadCharacteristicsA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)firsttask, (void*)(uintptr_t)secondtask, (void*)(uintptr_t)taskindex);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)firsttask;
    (void)secondtask;
    (void)taskindex;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avSetMmMaxThreadCharacteristicsW(JNIEnv* km_env, jclass km_clazz, jlong firsttask, jlong secondtask, jlong taskindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmMaxThreadCharacteristicsW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)firsttask, (void*)(uintptr_t)secondtask, (void*)(uintptr_t)taskindex);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)firsttask;
    (void)secondtask;
    (void)taskindex;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avSetMmThreadCharacteristicsA(JNIEnv* km_env, jclass km_clazz, jlong taskname, jlong taskindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmThreadCharacteristicsA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)taskname, (void*)(uintptr_t)taskindex);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)taskname;
    (void)taskindex;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avSetMmThreadCharacteristicsW(JNIEnv* km_env, jclass km_clazz, jlong taskname, jlong taskindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmThreadCharacteristicsW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)taskname, (void*)(uintptr_t)taskindex);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)taskname;
    (void)taskindex;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1avSetMmThreadPriority(JNIEnv* km_env, jclass km_clazz, jlong avrthandle, jint priority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("avrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AvSetMmThreadPriority");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)avrthandle, (int32_t)priority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)avrthandle;
    (void)priority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1callbackMayRunLong(JNIEnv* km_env, jclass km_clazz, jlong pci) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CallbackMayRunLong");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)pci);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pci;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1cancelThreadpoolIo(JNIEnv* km_env, jclass km_clazz, jlong pio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelThreadpoolIo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pio);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pio;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1cancelTimerQueueTimer(JNIEnv* km_env, jclass km_clazz, jlong timerqueue, jlong timer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelTimerQueueTimer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerqueue, (void*)(uintptr_t)timer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    (void)timer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1cancelWaitableTimer(JNIEnv* km_env, jclass km_clazz, jlong htimer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelWaitableTimer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htimer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htimer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1changeTimerQueueTimer(JNIEnv* km_env, jclass km_clazz, jlong timerqueue, jlong timer, jint duetime, jint period) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeTimerQueueTimer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerqueue, (void*)(uintptr_t)timer, (uint32_t)duetime, (uint32_t)period);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    (void)timer;
    (void)duetime;
    (void)period;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1closePrivateNamespace(JNIEnv* km_env, jclass km_clazz, jlong handle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClosePrivateNamespace");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)handle;
    (void)flags;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1closeThreadpool(JNIEnv* km_env, jclass km_clazz, jlong ptpp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpool");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)ptpp);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptpp;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1closeThreadpoolCleanupGroup(JNIEnv* km_env, jclass km_clazz, jlong ptpcg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolCleanupGroup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)ptpcg);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptpcg;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1closeThreadpoolCleanupGroupMembers(JNIEnv* km_env, jclass km_clazz, jlong ptpcg, jint fcancelpendingcallbacks, jlong pvcleanupcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolCleanupGroupMembers");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)ptpcg, (int32_t)fcancelpendingcallbacks, (void*)(uintptr_t)pvcleanupcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptpcg;
    (void)fcancelpendingcallbacks;
    (void)pvcleanupcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1closeThreadpoolIo(JNIEnv* km_env, jclass km_clazz, jlong pio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolIo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pio);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pio;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1closeThreadpoolTimer(JNIEnv* km_env, jclass km_clazz, jlong pti) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolTimer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pti);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pti;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1closeThreadpoolWait(JNIEnv* km_env, jclass km_clazz, jlong pwa) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolWait");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pwa);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwa;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1closeThreadpoolWork(JNIEnv* km_env, jclass km_clazz, jlong pwk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseThreadpoolWork");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pwk);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwk;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1convertFiberToThread(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertFiberToThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1convertThreadToFiber(JNIEnv* km_env, jclass km_clazz, jlong lpparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertThreadToFiber");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpparameter);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpparameter;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1convertThreadToFiberEx(JNIEnv* km_env, jclass km_clazz, jlong lpparameter, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ConvertThreadToFiberEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpparameter, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpparameter;
    (void)dwflags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createBoundaryDescriptorA(JNIEnv* km_env, jclass km_clazz, jlong name, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBoundaryDescriptorA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)name;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createBoundaryDescriptorW(JNIEnv* km_env, jclass km_clazz, jlong name, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateBoundaryDescriptorW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)name;
    (void)flags;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createEventA(JNIEnv* km_env, jclass km_clazz, jlong lpeventattributes, jint bmanualreset, jint binitialstate, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEventA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpeventattributes, (int32_t)bmanualreset, (int32_t)binitialstate, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpeventattributes;
    (void)bmanualreset;
    (void)binitialstate;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createEventExA(JNIEnv* km_env, jclass km_clazz, jlong lpeventattributes, jlong lpname, jint dwflags, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEventExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpeventattributes, (void*)(uintptr_t)lpname, (uint32_t)dwflags, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpeventattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createEventExW(JNIEnv* km_env, jclass km_clazz, jlong lpeventattributes, jlong lpname, jint dwflags, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEventExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpeventattributes, (void*)(uintptr_t)lpname, (uint32_t)dwflags, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpeventattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createEventW(JNIEnv* km_env, jclass km_clazz, jlong lpeventattributes, jint bmanualreset, jint binitialstate, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateEventW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpeventattributes, (int32_t)bmanualreset, (int32_t)binitialstate, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpeventattributes;
    (void)bmanualreset;
    (void)binitialstate;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createFiber(JNIEnv* km_env, jclass km_clazz, jlong dwstacksize, jlong lpstartaddress, jlong lpparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFiber");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)dwstacksize, (void*)(uintptr_t)lpstartaddress, (void*)(uintptr_t)lpparameter);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createFiberEx(JNIEnv* km_env, jclass km_clazz, jlong dwstackcommitsize, jlong dwstackreservesize, jint dwflags, jlong lpstartaddress, jlong lpparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint64_t, uint64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateFiberEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)dwstackcommitsize, (uint64_t)dwstackreservesize, (uint32_t)dwflags, (void*)(uintptr_t)lpstartaddress, (void*)(uintptr_t)lpparameter);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwstackcommitsize;
    (void)dwstackreservesize;
    (void)dwflags;
    (void)lpstartaddress;
    (void)lpparameter;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createMutexA(JNIEnv* km_env, jclass km_clazz, jlong lpmutexattributes, jint binitialowner, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMutexA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmutexattributes, (int32_t)binitialowner, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpmutexattributes;
    (void)binitialowner;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createMutexExA(JNIEnv* km_env, jclass km_clazz, jlong lpmutexattributes, jlong lpname, jint dwflags, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMutexExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmutexattributes, (void*)(uintptr_t)lpname, (uint32_t)dwflags, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpmutexattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createMutexExW(JNIEnv* km_env, jclass km_clazz, jlong lpmutexattributes, jlong lpname, jint dwflags, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMutexExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmutexattributes, (void*)(uintptr_t)lpname, (uint32_t)dwflags, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpmutexattributes;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createMutexW(JNIEnv* km_env, jclass km_clazz, jlong lpmutexattributes, jint binitialowner, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateMutexW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpmutexattributes, (int32_t)binitialowner, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpmutexattributes;
    (void)binitialowner;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createPrivateNamespaceA(JNIEnv* km_env, jclass km_clazz, jlong lpprivatenamespaceattributes, jlong lpboundarydescriptor, jlong lpaliasprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateNamespaceA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpprivatenamespaceattributes, (void*)(uintptr_t)lpboundarydescriptor, (void*)(uintptr_t)lpaliasprefix);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpprivatenamespaceattributes;
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createPrivateNamespaceW(JNIEnv* km_env, jclass km_clazz, jlong lpprivatenamespaceattributes, jlong lpboundarydescriptor, jlong lpaliasprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePrivateNamespaceW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpprivatenamespaceattributes, (void*)(uintptr_t)lpboundarydescriptor, (void*)(uintptr_t)lpaliasprefix);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpprivatenamespaceattributes;
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createProcessA(JNIEnv* km_env, jclass km_clazz, jlong lpapplicationname, jlong lpcommandline, jlong lpprocessattributes, jlong lpthreadattributes, jint binherithandles, jint dwcreationflags, jlong lpenvironment, jlong lpcurrentdirectory, jlong lpstartupinfo, jlong lpprocessinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpapplicationname, (void*)(uintptr_t)lpcommandline, (void*)(uintptr_t)lpprocessattributes, (void*)(uintptr_t)lpthreadattributes, (int32_t)binherithandles, (uint32_t)dwcreationflags, (void*)(uintptr_t)lpenvironment, (void*)(uintptr_t)lpcurrentdirectory, (void*)(uintptr_t)lpstartupinfo, (void*)(uintptr_t)lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createProcessAsUserA(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpapplicationname, jlong lpcommandline, jlong lpprocessattributes, jlong lpthreadattributes, jint binherithandles, jint dwcreationflags, jlong lpenvironment, jlong lpcurrentdirectory, jlong lpstartupinfo, jlong lpprocessinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessAsUserA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpapplicationname, (void*)(uintptr_t)lpcommandline, (void*)(uintptr_t)lpprocessattributes, (void*)(uintptr_t)lpthreadattributes, (int32_t)binherithandles, (uint32_t)dwcreationflags, (void*)(uintptr_t)lpenvironment, (void*)(uintptr_t)lpcurrentdirectory, (void*)(uintptr_t)lpstartupinfo, (void*)(uintptr_t)lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htoken;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createProcessAsUserW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jlong lpapplicationname, jlong lpcommandline, jlong lpprocessattributes, jlong lpthreadattributes, jint binherithandles, jint dwcreationflags, jlong lpenvironment, jlong lpcurrentdirectory, jlong lpstartupinfo, jlong lpprocessinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessAsUserW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htoken, (void*)(uintptr_t)lpapplicationname, (void*)(uintptr_t)lpcommandline, (void*)(uintptr_t)lpprocessattributes, (void*)(uintptr_t)lpthreadattributes, (int32_t)binherithandles, (uint32_t)dwcreationflags, (void*)(uintptr_t)lpenvironment, (void*)(uintptr_t)lpcurrentdirectory, (void*)(uintptr_t)lpstartupinfo, (void*)(uintptr_t)lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htoken;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createProcessW(JNIEnv* km_env, jclass km_clazz, jlong lpapplicationname, jlong lpcommandline, jlong lpprocessattributes, jlong lpthreadattributes, jint binherithandles, jint dwcreationflags, jlong lpenvironment, jlong lpcurrentdirectory, jlong lpstartupinfo, jlong lpprocessinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpapplicationname, (void*)(uintptr_t)lpcommandline, (void*)(uintptr_t)lpprocessattributes, (void*)(uintptr_t)lpthreadattributes, (int32_t)binherithandles, (uint32_t)dwcreationflags, (void*)(uintptr_t)lpenvironment, (void*)(uintptr_t)lpcurrentdirectory, (void*)(uintptr_t)lpstartupinfo, (void*)(uintptr_t)lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)lpprocessattributes;
    (void)lpthreadattributes;
    (void)binherithandles;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createProcessWithLogonW(JNIEnv* km_env, jclass km_clazz, jlong lpusername, jlong lpdomain, jlong lppassword, jint dwlogonflags, jlong lpapplicationname, jlong lpcommandline, jint dwcreationflags, jlong lpenvironment, jlong lpcurrentdirectory, jlong lpstartupinfo, jlong lpprocessinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessWithLogonW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpusername, (void*)(uintptr_t)lpdomain, (void*)(uintptr_t)lppassword, (uint32_t)dwlogonflags, (void*)(uintptr_t)lpapplicationname, (void*)(uintptr_t)lpcommandline, (uint32_t)dwcreationflags, (void*)(uintptr_t)lpenvironment, (void*)(uintptr_t)lpcurrentdirectory, (void*)(uintptr_t)lpstartupinfo, (void*)(uintptr_t)lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpusername;
    (void)lpdomain;
    (void)lppassword;
    (void)dwlogonflags;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createProcessWithTokenW(JNIEnv* km_env, jclass km_clazz, jlong htoken, jint dwlogonflags, jlong lpapplicationname, jlong lpcommandline, jint dwcreationflags, jlong lpenvironment, jlong lpcurrentdirectory, jlong lpstartupinfo, jlong lpprocessinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateProcessWithTokenW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htoken, (uint32_t)dwlogonflags, (void*)(uintptr_t)lpapplicationname, (void*)(uintptr_t)lpcommandline, (uint32_t)dwcreationflags, (void*)(uintptr_t)lpenvironment, (void*)(uintptr_t)lpcurrentdirectory, (void*)(uintptr_t)lpstartupinfo, (void*)(uintptr_t)lpprocessinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htoken;
    (void)dwlogonflags;
    (void)lpapplicationname;
    (void)lpcommandline;
    (void)dwcreationflags;
    (void)lpenvironment;
    (void)lpcurrentdirectory;
    (void)lpstartupinfo;
    (void)lpprocessinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createRemoteThread(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpthreadattributes, jlong dwstacksize, jlong lpstartaddress, jlong lpparameter, jint dwcreationflags, jlong lpthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRemoteThread");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpthreadattributes, (uint64_t)dwstacksize, (void*)(uintptr_t)lpstartaddress, (void*)(uintptr_t)lpparameter, (uint32_t)dwcreationflags, (void*)(uintptr_t)lpthreadid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpthreadid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createRemoteThreadEx(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpthreadattributes, jlong dwstacksize, jlong lpstartaddress, jlong lpparameter, jint dwcreationflags, jlong lpattributelist, jlong lpthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateRemoteThreadEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpthreadattributes, (uint64_t)dwstacksize, (void*)(uintptr_t)lpstartaddress, (void*)(uintptr_t)lpparameter, (uint32_t)dwcreationflags, (void*)(uintptr_t)lpattributelist, (void*)(uintptr_t)lpthreadid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hprocess;
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpattributelist;
    (void)lpthreadid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createSemaphoreA(JNIEnv* km_env, jclass km_clazz, jlong lpsemaphoreattributes, jint linitialcount, jint lmaximumcount, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSemaphoreA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsemaphoreattributes, (int32_t)linitialcount, (int32_t)lmaximumcount, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createSemaphoreExA(JNIEnv* km_env, jclass km_clazz, jlong lpsemaphoreattributes, jint linitialcount, jint lmaximumcount, jlong lpname, jint dwflags, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSemaphoreExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsemaphoreattributes, (int32_t)linitialcount, (int32_t)lmaximumcount, (void*)(uintptr_t)lpname, (uint32_t)dwflags, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createSemaphoreExW(JNIEnv* km_env, jclass km_clazz, jlong lpsemaphoreattributes, jint linitialcount, jint lmaximumcount, jlong lpname, jint dwflags, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSemaphoreExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsemaphoreattributes, (int32_t)linitialcount, (int32_t)lmaximumcount, (void*)(uintptr_t)lpname, (uint32_t)dwflags, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createSemaphoreW(JNIEnv* km_env, jclass km_clazz, jlong lpsemaphoreattributes, jint linitialcount, jint lmaximumcount, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateSemaphoreW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpsemaphoreattributes, (int32_t)linitialcount, (int32_t)lmaximumcount, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpsemaphoreattributes;
    (void)linitialcount;
    (void)lmaximumcount;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createThread(JNIEnv* km_env, jclass km_clazz, jlong lpthreadattributes, jlong dwstacksize, jlong lpstartaddress, jlong lpparameter, jint dwcreationflags, jlong lpthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThread");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpthreadattributes, (uint64_t)dwstacksize, (void*)(uintptr_t)lpstartaddress, (void*)(uintptr_t)lpparameter, (uint32_t)dwcreationflags, (void*)(uintptr_t)lpthreadid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpthreadattributes;
    (void)dwstacksize;
    (void)lpstartaddress;
    (void)lpparameter;
    (void)dwcreationflags;
    (void)lpthreadid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createThreadpool(JNIEnv* km_env, jclass km_clazz, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createThreadpoolCleanupGroup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolCleanupGroup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createThreadpoolIo(JNIEnv* km_env, jclass km_clazz, jlong fl, jlong pfnio, jlong pv, jlong pcbe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolIo");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fl, (void*)(uintptr_t)pfnio, (void*)(uintptr_t)pv, (void*)(uintptr_t)pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fl;
    (void)pfnio;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createThreadpoolTimer(JNIEnv* km_env, jclass km_clazz, jlong pfnti, jlong pv, jlong pcbe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolTimer");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfnti, (void*)(uintptr_t)pv, (void*)(uintptr_t)pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfnti;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createThreadpoolWait(JNIEnv* km_env, jclass km_clazz, jlong pfnwa, jlong pv, jlong pcbe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolWait");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfnwa, (void*)(uintptr_t)pv, (void*)(uintptr_t)pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfnwa;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createThreadpoolWork(JNIEnv* km_env, jclass km_clazz, jlong pfnwk, jlong pv, jlong pcbe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateThreadpoolWork");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfnwk, (void*)(uintptr_t)pv, (void*)(uintptr_t)pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfnwk;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createTimerQueue(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTimerQueue");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createTimerQueueTimer(JNIEnv* km_env, jclass km_clazz, jlong phnewtimer, jlong timerqueue, jlong callback, jlong parameter, jint duetime, jint period, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateTimerQueueTimer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phnewtimer, (void*)(uintptr_t)timerqueue, (void*)(uintptr_t)callback, (void*)(uintptr_t)parameter, (uint32_t)duetime, (uint32_t)period, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phnewtimer;
    (void)timerqueue;
    (void)callback;
    (void)parameter;
    (void)duetime;
    (void)period;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createUmsCompletionList(JNIEnv* km_env, jclass km_clazz, jlong umscompletionlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUmsCompletionList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)umscompletionlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umscompletionlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createUmsThreadContext(JNIEnv* km_env, jclass km_clazz, jlong lpumsthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateUmsThreadContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpumsthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpumsthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createWaitableTimerA(JNIEnv* km_env, jclass km_clazz, jlong lptimerattributes, jint bmanualreset, jlong lptimername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWaitableTimerA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptimerattributes, (int32_t)bmanualreset, (void*)(uintptr_t)lptimername);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lptimerattributes;
    (void)bmanualreset;
    (void)lptimername;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createWaitableTimerExA(JNIEnv* km_env, jclass km_clazz, jlong lptimerattributes, jlong lptimername, jint dwflags, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWaitableTimerExA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptimerattributes, (void*)(uintptr_t)lptimername, (uint32_t)dwflags, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lptimerattributes;
    (void)lptimername;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createWaitableTimerExW(JNIEnv* km_env, jclass km_clazz, jlong lptimerattributes, jlong lptimername, jint dwflags, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWaitableTimerExW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptimerattributes, (void*)(uintptr_t)lptimername, (uint32_t)dwflags, (uint32_t)dwdesiredaccess);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lptimerattributes;
    (void)lptimername;
    (void)dwflags;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1createWaitableTimerW(JNIEnv* km_env, jclass km_clazz, jlong lptimerattributes, jint bmanualreset, jlong lptimername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateWaitableTimerW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lptimerattributes, (int32_t)bmanualreset, (void*)(uintptr_t)lptimername);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lptimerattributes;
    (void)bmanualreset;
    (void)lptimername;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteBoundaryDescriptor(JNIEnv* km_env, jclass km_clazz, jlong boundarydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteBoundaryDescriptor");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)boundarydescriptor);
    } else {
        errno = ENOSYS;
    }
#else
    (void)boundarydescriptor;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteCriticalSection(JNIEnv* km_env, jclass km_clazz, jlong lpcriticalsection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteCriticalSection");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpcriticalsection);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteFiber(JNIEnv* km_env, jclass km_clazz, jlong lpfiber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteFiber");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpfiber);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpfiber;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteProcThreadAttributeList(JNIEnv* km_env, jclass km_clazz, jlong lpattributelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteProcThreadAttributeList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpattributelist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpattributelist;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteSynchronizationBarrier(JNIEnv* km_env, jclass km_clazz, jlong lpbarrier) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSynchronizationBarrier");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbarrier);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpbarrier;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteTimerQueue(JNIEnv* km_env, jclass km_clazz, jlong timerqueue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteTimerQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerqueue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteTimerQueueEx(JNIEnv* km_env, jclass km_clazz, jlong timerqueue, jlong completionevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteTimerQueueEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerqueue, (void*)(uintptr_t)completionevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    (void)completionevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteTimerQueueTimer(JNIEnv* km_env, jclass km_clazz, jlong timerqueue, jlong timer, jlong completionevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteTimerQueueTimer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerqueue, (void*)(uintptr_t)timer, (void*)(uintptr_t)completionevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timerqueue;
    (void)timer;
    (void)completionevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteUmsCompletionList(JNIEnv* km_env, jclass km_clazz, jlong umscompletionlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUmsCompletionList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)umscompletionlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umscompletionlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1deleteUmsThreadContext(JNIEnv* km_env, jclass km_clazz, jlong umsthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteUmsThreadContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)umsthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umsthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1dequeueUmsCompletionListItems(JNIEnv* km_env, jclass km_clazz, jlong umscompletionlist, jint waittimeout, jlong umsthreadlist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DequeueUmsCompletionListItems");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)umscompletionlist, (uint32_t)waittimeout, (void*)(uintptr_t)umsthreadlist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umscompletionlist;
    (void)waittimeout;
    (void)umsthreadlist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1disassociateCurrentThreadFromCallback(JNIEnv* km_env, jclass km_clazz, jlong pci) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DisassociateCurrentThreadFromCallback");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pci);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1enterCriticalSection(JNIEnv* km_env, jclass km_clazz, jlong lpcriticalsection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnterCriticalSection");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpcriticalsection);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1enterSynchronizationBarrier(JNIEnv* km_env, jclass km_clazz, jlong lpbarrier, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnterSynchronizationBarrier");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbarrier, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpbarrier;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1enterUmsSchedulingMode(JNIEnv* km_env, jclass km_clazz, jlong schedulerstartupinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnterUmsSchedulingMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)schedulerstartupinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)schedulerstartupinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1executeUmsThread(JNIEnv* km_env, jclass km_clazz, jlong umsthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExecuteUmsThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)umsthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umsthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1exitProcess(JNIEnv* km_env, jclass km_clazz, jint uexitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExitProcess");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)uexitcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)uexitcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1exitThread(JNIEnv* km_env, jclass km_clazz, jint dwexitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExitThread");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)dwexitcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwexitcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1flsAlloc(JNIEnv* km_env, jclass km_clazz, jlong lpcallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlsAlloc");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcallback);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcallback;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1flsFree(JNIEnv* km_env, jclass km_clazz, jint dwflsindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlsFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflsindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflsindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1flsGetValue(JNIEnv* km_env, jclass km_clazz, jint dwflsindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlsGetValue");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflsindex);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwflsindex;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1flsSetValue(JNIEnv* km_env, jclass km_clazz, jint dwflsindex, jlong lpflsdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlsSetValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflsindex, (void*)(uintptr_t)lpflsdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflsindex;
    (void)lpflsdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1flushProcessWriteBuffers(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FlushProcessWriteBuffers");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr();
    } else {
        errno = ENOSYS;
    }
#else
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1freeLibraryWhenCallbackReturns(JNIEnv* km_env, jclass km_clazz, jlong pci, jlong mod) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeLibraryWhenCallbackReturns");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pci, (void*)(uintptr_t)mod);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)mod;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getActiveProcessorCount(JNIEnv* km_env, jclass km_clazz, jshort groupnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveProcessorCount");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)groupnumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)groupnumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getActiveProcessorGroupCount(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetActiveProcessorGroupCount");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getCurrentProcess(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcess");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getCurrentProcessId(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcessId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getCurrentProcessorNumber(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcessorNumber");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getCurrentProcessorNumberEx(JNIEnv* km_env, jclass km_clazz, jlong procnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentProcessorNumberEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)procnumber);
    } else {
        errno = ENOSYS;
    }
#else
    (void)procnumber;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getCurrentThread(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThread");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getCurrentThreadId(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThreadId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getCurrentThreadStackLimits(JNIEnv* km_env, jclass km_clazz, jlong lowlimit, jlong highlimit) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentThreadStackLimits");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lowlimit, (void*)(uintptr_t)highlimit);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lowlimit;
    (void)highlimit;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getCurrentUmsThread(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentUmsThread");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getExitCodeProcess(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpexitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExitCodeProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpexitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpexitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getExitCodeThread(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpexitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetExitCodeThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpexitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpexitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getGuiResources(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint uiflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetGuiResources");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint32_t)uiflags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)uiflags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getMachineTypeAttributes(JNIEnv* km_env, jclass km_clazz, jshort machine, jlong machinetypeattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMachineTypeAttributes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)machine, (void*)(uintptr_t)machinetypeattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)machine;
    (void)machinetypeattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getMaximumProcessorCount(JNIEnv* km_env, jclass km_clazz, jshort groupnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMaximumProcessorCount");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)groupnumber);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)groupnumber;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getMaximumProcessorGroupCount(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetMaximumProcessorGroupCount");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNextUmsListItem(JNIEnv* km_env, jclass km_clazz, jlong umscontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNextUmsListItem");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)umscontext);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)umscontext;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaAvailableMemoryNode(JNIEnv* km_env, jclass km_clazz, jbyte node, jlong availablebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaAvailableMemoryNode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)node, (void*)(uintptr_t)availablebytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)node;
    (void)availablebytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaAvailableMemoryNodeEx(JNIEnv* km_env, jclass km_clazz, jshort node, jlong availablebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaAvailableMemoryNodeEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)node, (void*)(uintptr_t)availablebytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)node;
    (void)availablebytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaHighestNodeNumber(JNIEnv* km_env, jclass km_clazz, jlong highestnodenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaHighestNodeNumber");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)highestnodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)highestnodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaNodeNumberFromHandle(JNIEnv* km_env, jclass km_clazz, jlong hfile, jlong nodenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaNodeNumberFromHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hfile, (void*)(uintptr_t)nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hfile;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaNodeProcessorMask(JNIEnv* km_env, jclass km_clazz, jbyte node, jlong processormask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaNodeProcessorMask");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)node, (void*)(uintptr_t)processormask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)node;
    (void)processormask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaNodeProcessorMask2(JNIEnv* km_env, jclass km_clazz, jshort nodenumber, jlong processormasks, jshort processormaskcount, jlong requiredmaskcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaNodeProcessorMask2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)nodenumber, (void*)(uintptr_t)processormasks, (uint16_t)processormaskcount, (void*)(uintptr_t)requiredmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)nodenumber;
    (void)processormasks;
    (void)processormaskcount;
    (void)requiredmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaNodeProcessorMaskEx(JNIEnv* km_env, jclass km_clazz, jshort node, jlong processormask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaNodeProcessorMaskEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)node, (void*)(uintptr_t)processormask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)node;
    (void)processormask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaProcessorNode(JNIEnv* km_env, jclass km_clazz, jbyte processor, jlong nodenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaProcessorNode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint8_t)processor, (void*)(uintptr_t)nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processor;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaProcessorNodeEx(JNIEnv* km_env, jclass km_clazz, jlong processor, jlong nodenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaProcessorNodeEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processor, (void*)(uintptr_t)nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processor;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaProximityNode(JNIEnv* km_env, jclass km_clazz, jint proximityid, jlong nodenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaProximityNode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)proximityid, (void*)(uintptr_t)nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proximityid;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getNumaProximityNodeEx(JNIEnv* km_env, jclass km_clazz, jint proximityid, jlong nodenumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNumaProximityNodeEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)proximityid, (void*)(uintptr_t)nodenumber);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)proximityid;
    (void)nodenumber;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getPriorityClass(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPriorityClass");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessAffinityMask(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpprocessaffinitymask, jlong lpsystemaffinitymask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessAffinityMask");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpprocessaffinitymask, (void*)(uintptr_t)lpsystemaffinitymask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpprocessaffinitymask;
    (void)lpsystemaffinitymask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessDEPPolicy(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpflags, jlong lppermanent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessDEPPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpflags, (void*)(uintptr_t)lppermanent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpflags;
    (void)lppermanent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessDefaultCpuSetMasks(JNIEnv* km_env, jclass km_clazz, jlong process, jlong cpusetmasks, jshort cpusetmaskcount, jlong requiredmaskcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessDefaultCpuSetMasks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)cpusetmasks, (uint16_t)cpusetmaskcount, (void*)(uintptr_t)requiredmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    (void)requiredmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessDefaultCpuSets(JNIEnv* km_env, jclass km_clazz, jlong process, jlong cpusetids, jint cpusetidcount, jlong requiredidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessDefaultCpuSets");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)cpusetids, (uint32_t)cpusetidcount, (void*)(uintptr_t)requiredidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)cpusetids;
    (void)cpusetidcount;
    (void)requiredidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessGroupAffinity(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong groupcount, jlong grouparray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessGroupAffinity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)groupcount, (void*)(uintptr_t)grouparray);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)groupcount;
    (void)grouparray;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessHandleCount(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pdwhandlecount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessHandleCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pdwhandlecount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)pdwhandlecount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessHandleFromHwnd(JNIEnv* km_env, jclass km_clazz, jlong hwnd) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("oleacc.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessHandleFromHwnd");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hwnd);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)hwnd;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessId(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)process;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessIdOfThread(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessIdOfThread");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)thread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessInformation(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint processinformationclass, jlong processinformation, jint processinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (int32_t)processinformationclass, (void*)(uintptr_t)processinformation, (uint32_t)processinformationsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessIoCounters(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpiocounters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessIoCounters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpiocounters);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpiocounters;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessMitigationPolicy(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint mitigationpolicy, jlong lpbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessMitigationPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (int32_t)mitigationpolicy, (void*)(uintptr_t)lpbuffer, (uint64_t)dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)mitigationpolicy;
    (void)lpbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessPriorityBoost(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pdisablepriorityboost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessPriorityBoost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pdisablepriorityboost);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)pdisablepriorityboost;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessShutdownParameters(JNIEnv* km_env, jclass km_clazz, jlong lpdwlevel, jlong lpdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessShutdownParameters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpdwlevel, (void*)(uintptr_t)lpdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpdwlevel;
    (void)lpdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessTimes(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpcreationtime, jlong lpexittime, jlong lpkerneltime, jlong lpusertime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessTimes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpcreationtime, (void*)(uintptr_t)lpexittime, (void*)(uintptr_t)lpkerneltime, (void*)(uintptr_t)lpusertime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpcreationtime;
    (void)lpexittime;
    (void)lpkerneltime;
    (void)lpusertime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessVersion(JNIEnv* km_env, jclass km_clazz, jint processid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessVersion");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)processid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)processid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getProcessWorkingSetSize(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpminimumworkingsetsize, jlong lpmaximumworkingsetsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessWorkingSetSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpminimumworkingsetsize, (void*)(uintptr_t)lpmaximumworkingsetsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpminimumworkingsetsize;
    (void)lpmaximumworkingsetsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getStartupInfoA(JNIEnv* km_env, jclass km_clazz, jlong lpstartupinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStartupInfoA");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpstartupinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpstartupinfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getStartupInfoW(JNIEnv* km_env, jclass km_clazz, jlong lpstartupinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStartupInfoW");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpstartupinfo);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpstartupinfo;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getSystemTimes(JNIEnv* km_env, jclass km_clazz, jlong lpidletime, jlong lpkerneltime, jlong lpusertime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSystemTimes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpidletime, (void*)(uintptr_t)lpkerneltime, (void*)(uintptr_t)lpusertime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpidletime;
    (void)lpkerneltime;
    (void)lpusertime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadDescription(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong ppszthreaddescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadDescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)ppszthreaddescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)ppszthreaddescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadGroupAffinity(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong groupaffinity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadGroupAffinity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)groupaffinity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)groupaffinity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadIOPendingFlag(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpioispending) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadIOPendingFlag");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpioispending);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpioispending;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadId(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)thread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadIdealProcessorEx(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpidealprocessor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadIdealProcessorEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpidealprocessor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpidealprocessor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadInformation(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint threadinformationclass, jlong threadinformation, jint threadinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (int32_t)threadinformationclass, (void*)(uintptr_t)threadinformation, (uint32_t)threadinformationsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadPriority(JNIEnv* km_env, jclass km_clazz, jlong hthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadPriority");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadPriorityBoost(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong pdisablepriorityboost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadPriorityBoost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)pdisablepriorityboost);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)pdisablepriorityboost;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadSelectedCpuSetMasks(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong cpusetmasks, jshort cpusetmaskcount, jlong requiredmaskcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadSelectedCpuSetMasks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (void*)(uintptr_t)cpusetmasks, (uint16_t)cpusetmaskcount, (void*)(uintptr_t)requiredmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    (void)requiredmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadSelectedCpuSets(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong cpusetids, jint cpusetidcount, jlong requiredidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadSelectedCpuSets");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (void*)(uintptr_t)cpusetids, (uint32_t)cpusetidcount, (void*)(uintptr_t)requiredidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)cpusetids;
    (void)cpusetidcount;
    (void)requiredidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getThreadTimes(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpcreationtime, jlong lpexittime, jlong lpkerneltime, jlong lpusertime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetThreadTimes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpcreationtime, (void*)(uintptr_t)lpexittime, (void*)(uintptr_t)lpkerneltime, (void*)(uintptr_t)lpusertime);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpcreationtime;
    (void)lpexittime;
    (void)lpkerneltime;
    (void)lpusertime;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getUmsCompletionListEvent(JNIEnv* km_env, jclass km_clazz, jlong umscompletionlist, jlong umscompletionevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUmsCompletionListEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)umscompletionlist, (void*)(uintptr_t)umscompletionevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umscompletionlist;
    (void)umscompletionevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1getUmsSystemThreadInformation(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jlong systemthreadinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetUmsSystemThreadInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadhandle, (void*)(uintptr_t)systemthreadinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    (void)systemthreadinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initOnceBeginInitialize(JNIEnv* km_env, jclass km_clazz, jlong lpinitonce, jint dwflags, jlong fpending, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitOnceBeginInitialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpinitonce, (uint32_t)dwflags, (void*)(uintptr_t)fpending, (void*)(uintptr_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpinitonce;
    (void)dwflags;
    (void)fpending;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initOnceComplete(JNIEnv* km_env, jclass km_clazz, jlong lpinitonce, jint dwflags, jlong lpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitOnceComplete");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpinitonce, (uint32_t)dwflags, (void*)(uintptr_t)lpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpinitonce;
    (void)dwflags;
    (void)lpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initOnceExecuteOnce(JNIEnv* km_env, jclass km_clazz, jlong initonce, jlong initfn, jlong parameter, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitOnceExecuteOnce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)initonce, (void*)(uintptr_t)initfn, (void*)(uintptr_t)parameter, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)initonce;
    (void)initfn;
    (void)parameter;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initOnceInitialize(JNIEnv* km_env, jclass km_clazz, jlong initonce) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitOnceInitialize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)initonce);
    } else {
        errno = ENOSYS;
    }
#else
    (void)initonce;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initializeConditionVariable(JNIEnv* km_env, jclass km_clazz, jlong conditionvariable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeConditionVariable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)conditionvariable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)conditionvariable;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initializeCriticalSection(JNIEnv* km_env, jclass km_clazz, jlong lpcriticalsection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeCriticalSection");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpcriticalsection);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initializeCriticalSectionAndSpinCount(JNIEnv* km_env, jclass km_clazz, jlong lpcriticalsection, jint dwspincount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeCriticalSectionAndSpinCount");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcriticalsection, (uint32_t)dwspincount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initializeCriticalSectionEx(JNIEnv* km_env, jclass km_clazz, jlong lpcriticalsection, jint dwspincount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeCriticalSectionEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcriticalsection, (uint32_t)dwspincount, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initializeProcThreadAttributeList(JNIEnv* km_env, jclass km_clazz, jlong lpattributelist, jint dwattributecount, jint dwflags, jlong lpsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeProcThreadAttributeList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpattributelist, (uint32_t)dwattributecount, (uint32_t)dwflags, (void*)(uintptr_t)lpsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpattributelist;
    (void)dwattributecount;
    (void)dwflags;
    (void)lpsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initializeSListHead(JNIEnv* km_env, jclass km_clazz, jlong listhead) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSListHead");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)listhead);
    } else {
        errno = ENOSYS;
    }
#else
    (void)listhead;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initializeSRWLock(JNIEnv* km_env, jclass km_clazz, jlong srwlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSRWLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1initializeSynchronizationBarrier(JNIEnv* km_env, jclass km_clazz, jlong lpbarrier, jint ltotalthreads, jint lspincount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeSynchronizationBarrier");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpbarrier, (int32_t)ltotalthreads, (int32_t)lspincount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpbarrier;
    (void)ltotalthreads;
    (void)lspincount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1interlockedFlushSList(JNIEnv* km_env, jclass km_clazz, jlong listhead) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InterlockedFlushSList");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1interlockedPopEntrySList(JNIEnv* km_env, jclass km_clazz, jlong listhead) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InterlockedPopEntrySList");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1interlockedPushEntrySList(JNIEnv* km_env, jclass km_clazz, jlong listhead, jlong listentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InterlockedPushEntrySList");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead, (void*)(uintptr_t)listentry);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)listhead;
    (void)listentry;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1interlockedPushListSListEx(JNIEnv* km_env, jclass km_clazz, jlong listhead, jlong list, jlong listend, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InterlockedPushListSListEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead, (void*)(uintptr_t)list, (void*)(uintptr_t)listend, (uint32_t)count);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)listhead;
    (void)list;
    (void)listend;
    (void)count;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1isImmersiveProcess(JNIEnv* km_env, jclass km_clazz, jlong hprocess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsImmersiveProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1isProcessCritical(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong critical) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessCritical");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)critical);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)critical;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1isProcessorFeaturePresent(JNIEnv* km_env, jclass km_clazz, jint processorfeature) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsProcessorFeaturePresent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)processorfeature);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processorfeature;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1isThreadAFiber(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThreadAFiber");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1isThreadpoolTimerSet(JNIEnv* km_env, jclass km_clazz, jlong pti) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsThreadpoolTimerSet");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)pti);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pti;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1isWow64Process(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong wow64process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWow64Process");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)wow64process);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)wow64process;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1isWow64Process2(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong pprocessmachine, jlong pnativemachine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsWow64Process2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)pprocessmachine, (void*)(uintptr_t)pnativemachine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)pprocessmachine;
    (void)pnativemachine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1leaveCriticalSection(JNIEnv* km_env, jclass km_clazz, jlong lpcriticalsection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LeaveCriticalSection");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpcriticalsection);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1leaveCriticalSectionWhenCallbackReturns(JNIEnv* km_env, jclass km_clazz, jlong pci, jlong pcs) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "LeaveCriticalSectionWhenCallbackReturns");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pci, (void*)(uintptr_t)pcs);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)pcs;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openEventA(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEventA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openEventW(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenEventW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openMutexW(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenMutexW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openPrivateNamespaceA(JNIEnv* km_env, jclass km_clazz, jlong lpboundarydescriptor, jlong lpaliasprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrivateNamespaceA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpboundarydescriptor, (void*)(uintptr_t)lpaliasprefix);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openPrivateNamespaceW(JNIEnv* km_env, jclass km_clazz, jlong lpboundarydescriptor, jlong lpaliasprefix) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPrivateNamespaceW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpboundarydescriptor, (void*)(uintptr_t)lpaliasprefix);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)lpboundarydescriptor;
    (void)lpaliasprefix;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openProcess(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jint dwprocessid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenProcess");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (uint32_t)dwprocessid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwprocessid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openProcessToken(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenProcessToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openSemaphoreW(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lpname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenSemaphoreW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lpname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lpname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openThread(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jint dwthreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThread");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (uint32_t)dwthreadid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)dwthreadid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openThreadToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint desiredaccess, jint openasself, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenThreadToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)desiredaccess, (int32_t)openasself, (void*)(uintptr_t)tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openWaitableTimerA(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lptimername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWaitableTimerA");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lptimername);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lptimername;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1openWaitableTimerW(JNIEnv* km_env, jclass km_clazz, jint dwdesiredaccess, jint binherithandle, jlong lptimername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenWaitableTimerW");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwdesiredaccess, (int32_t)binherithandle, (void*)(uintptr_t)lptimername);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwdesiredaccess;
    (void)binherithandle;
    (void)lptimername;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1pulseEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PulseEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1queryDepthSList(JNIEnv* km_env, jclass km_clazz, jlong listhead) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryDepthSList");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)listhead);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)listhead;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1queryFullProcessImageNameA(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint dwflags, jlong lpexename, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryFullProcessImageNameA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint32_t)dwflags, (void*)(uintptr_t)lpexename, (void*)(uintptr_t)lpdwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwflags;
    (void)lpexename;
    (void)lpdwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1queryFullProcessImageNameW(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint dwflags, jlong lpexename, jlong lpdwsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryFullProcessImageNameW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint32_t)dwflags, (void*)(uintptr_t)lpexename, (void*)(uintptr_t)lpdwsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwflags;
    (void)lpexename;
    (void)lpdwsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1queryProcessAffinityUpdateMode(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong lpdwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryProcessAffinityUpdateMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (void*)(uintptr_t)lpdwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)lpdwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1queryProtectedPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyguid, jlong policyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryProtectedPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policyguid, (void*)(uintptr_t)policyvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyguid;
    (void)policyvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1queryThreadpoolStackInformation(JNIEnv* km_env, jclass km_clazz, jlong ptpp, jlong ptpsi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryThreadpoolStackInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)ptpp, (void*)(uintptr_t)ptpsi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptpp;
    (void)ptpsi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1queryUmsThreadInformation(JNIEnv* km_env, jclass km_clazz, jlong umsthread, jint umsthreadinfoclass, jlong umsthreadinformation, jint umsthreadinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryUmsThreadInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)umsthread, (int32_t)umsthreadinfoclass, (void*)(uintptr_t)umsthreadinformation, (uint32_t)umsthreadinformationlength, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umsthread;
    (void)umsthreadinfoclass;
    (void)umsthreadinformation;
    (void)umsthreadinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1queueUserWorkItem(JNIEnv* km_env, jclass km_clazz, jlong function, jlong context, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueueUserWorkItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)function, (void*)(uintptr_t)context, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)function;
    (void)context;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1registerWaitForSingleObject(JNIEnv* km_env, jclass km_clazz, jlong phnewwaitobject, jlong hobject, jlong callback, jlong context, jint dwmilliseconds, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterWaitForSingleObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phnewwaitobject, (void*)(uintptr_t)hobject, (void*)(uintptr_t)callback, (void*)(uintptr_t)context, (uint32_t)dwmilliseconds, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phnewwaitobject;
    (void)hobject;
    (void)callback;
    (void)context;
    (void)dwmilliseconds;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1releaseMutex(JNIEnv* km_env, jclass km_clazz, jlong hmutex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseMutex");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hmutex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hmutex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1releaseMutexWhenCallbackReturns(JNIEnv* km_env, jclass km_clazz, jlong pci, jlong mut) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseMutexWhenCallbackReturns");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pci, (void*)(uintptr_t)mut);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)mut;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1releaseSRWLockExclusive(JNIEnv* km_env, jclass km_clazz, jlong srwlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSRWLockExclusive");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1releaseSRWLockShared(JNIEnv* km_env, jclass km_clazz, jlong srwlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSRWLockShared");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)srwlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1releaseSemaphore(JNIEnv* km_env, jclass km_clazz, jlong hsemaphore, jint lreleasecount, jlong lppreviouscount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSemaphore");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hsemaphore, (int32_t)lreleasecount, (void*)(uintptr_t)lppreviouscount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsemaphore;
    (void)lreleasecount;
    (void)lppreviouscount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1releaseSemaphoreWhenCallbackReturns(JNIEnv* km_env, jclass km_clazz, jlong pci, jlong sem, jint crel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleaseSemaphoreWhenCallbackReturns");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pci, (void*)(uintptr_t)sem, (uint32_t)crel);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)sem;
    (void)crel;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1resetEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1resumeThread(JNIEnv* km_env, jclass km_clazz, jlong hthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeThread");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqAddPeriodicCallback(JNIEnv* km_env, jclass km_clazz, jlong callback, jlong context, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqAddPeriodicCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callback, (void*)(uintptr_t)context, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callback;
    (void)context;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqAllocateSerialWorkQueue(JNIEnv* km_env, jclass km_clazz, jint workqueueidin, jlong workqueueidout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqAllocateSerialWorkQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueidin, (void*)(uintptr_t)workqueueidout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueidin;
    (void)workqueueidout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqAllocateWorkQueue(JNIEnv* km_env, jclass km_clazz, jint workqueuetype, jlong workqueueid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqAllocateWorkQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)workqueuetype, (void*)(uintptr_t)workqueueid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueuetype;
    (void)workqueueid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqBeginRegisterWorkQueueWithMMCSS(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jlong usageclass, jint dwtaskid, jint lpriority, jlong donecallback, jlong donestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqBeginRegisterWorkQueueWithMMCSS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (void*)(uintptr_t)usageclass, (uint32_t)dwtaskid, (int32_t)lpriority, (void*)(uintptr_t)donecallback, (void*)(uintptr_t)donestate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)usageclass;
    (void)dwtaskid;
    (void)lpriority;
    (void)donecallback;
    (void)donestate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqBeginUnregisterWorkQueueWithMMCSS(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jlong donecallback, jlong donestate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqBeginUnregisterWorkQueueWithMMCSS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (void*)(uintptr_t)donecallback, (void*)(uintptr_t)donestate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)donecallback;
    (void)donestate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqCancelDeadline(JNIEnv* km_env, jclass km_clazz, jlong prequest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqCancelDeadline");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prequest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)prequest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqCancelWorkItem(JNIEnv* km_env, jclass km_clazz, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqCancelWorkItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint64_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqCreateAsyncResult(JNIEnv* km_env, jclass km_clazz, jlong appobject, jlong callback, jlong appstate, jlong asyncresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqCreateAsyncResult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)appobject, (void*)(uintptr_t)callback, (void*)(uintptr_t)appstate, (void*)(uintptr_t)asyncresult);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)appobject;
    (void)callback;
    (void)appstate;
    (void)asyncresult;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqEndRegisterWorkQueueWithMMCSS(JNIEnv* km_env, jclass km_clazz, jlong result, jlong taskid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqEndRegisterWorkQueueWithMMCSS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)result, (void*)(uintptr_t)taskid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)result;
    (void)taskid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqGetWorkQueueMMCSSClass(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jlong usageclass, jlong usageclasslength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqGetWorkQueueMMCSSClass");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (void*)(uintptr_t)usageclass, (void*)(uintptr_t)usageclasslength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)usageclass;
    (void)usageclasslength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqGetWorkQueueMMCSSPriority(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jlong priority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqGetWorkQueueMMCSSPriority");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (void*)(uintptr_t)priority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)priority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqGetWorkQueueMMCSSTaskId(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jlong taskid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqGetWorkQueueMMCSSTaskId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (void*)(uintptr_t)taskid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)taskid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqInvokeCallback(JNIEnv* km_env, jclass km_clazz, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqInvokeCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqJoinWorkQueue(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jlong hfile, jlong out) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqJoinWorkQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (void*)(uintptr_t)hfile, (void*)(uintptr_t)out);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)hfile;
    (void)out;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqLockPlatform(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqLockPlatform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqLockSharedWorkQueue(JNIEnv* km_env, jclass km_clazz, jlong usageclass, jint basepriority, jlong taskid, jlong id) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqLockSharedWorkQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)usageclass, (int32_t)basepriority, (void*)(uintptr_t)taskid, (void*)(uintptr_t)id);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)usageclass;
    (void)basepriority;
    (void)taskid;
    (void)id;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqLockWorkQueue(JNIEnv* km_env, jclass km_clazz, jint workqueueid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqLockWorkQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqPutWaitingWorkItem(JNIEnv* km_env, jclass km_clazz, jlong hevent, jint lpriority, jlong result, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqPutWaitingWorkItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hevent, (int32_t)lpriority, (void*)(uintptr_t)result, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    (void)lpriority;
    (void)result;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqPutWorkItem(JNIEnv* km_env, jclass km_clazz, jint dwqueue, jint lpriority, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqPutWorkItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwqueue, (int32_t)lpriority, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwqueue;
    (void)lpriority;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqRegisterPlatformEvents(JNIEnv* km_env, jclass km_clazz, jlong platformevents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqRegisterPlatformEvents");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)platformevents);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)platformevents;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqRegisterPlatformWithMMCSS(JNIEnv* km_env, jclass km_clazz, jlong usageclass, jlong taskid, jint lpriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqRegisterPlatformWithMMCSS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)usageclass, (void*)(uintptr_t)taskid, (int32_t)lpriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)usageclass;
    (void)taskid;
    (void)lpriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqRemovePeriodicCallback(JNIEnv* km_env, jclass km_clazz, jint dwkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqRemovePeriodicCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwkey);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwkey;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqScheduleWorkItem(JNIEnv* km_env, jclass km_clazz, jlong result, jlong timeout, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqScheduleWorkItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)result, (int64_t)timeout, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)result;
    (void)timeout;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqSetDeadline(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jlong deadlineinhns, jlong prequest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqSetDeadline");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (int64_t)deadlineinhns, (void*)(uintptr_t)prequest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)deadlineinhns;
    (void)prequest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqSetDeadline2(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jlong deadlineinhns, jlong predeadlineinhns, jlong prequest) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqSetDeadline2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (int64_t)deadlineinhns, (int64_t)predeadlineinhns, (void*)(uintptr_t)prequest);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)deadlineinhns;
    (void)predeadlineinhns;
    (void)prequest;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqSetLongRunning(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jint enable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqSetLongRunning");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (int32_t)enable);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)enable;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqShutdown(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqShutdown");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqStartup(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqStartup");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqUnjoinWorkQueue(JNIEnv* km_env, jclass km_clazz, jint workqueueid, jlong hfile) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnjoinWorkQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid, (void*)(uintptr_t)hfile);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    (void)hfile;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqUnlockPlatform(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnlockPlatform");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqUnlockWorkQueue(JNIEnv* km_env, jclass km_clazz, jint workqueueid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnlockWorkQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)workqueueid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workqueueid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqUnregisterPlatformEvents(JNIEnv* km_env, jclass km_clazz, jlong platformevents) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnregisterPlatformEvents");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)platformevents);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)platformevents;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1rtwqUnregisterPlatformFromMMCSS(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("rtworkq.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtwqUnregisterPlatformFromMMCSS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setCriticalSectionSpinCount(JNIEnv* km_env, jclass km_clazz, jlong lpcriticalsection, jint dwspincount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetCriticalSectionSpinCount");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcriticalsection, (uint32_t)dwspincount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcriticalsection;
    (void)dwspincount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setEvent(JNIEnv* km_env, jclass km_clazz, jlong hevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setEventWhenCallbackReturns(JNIEnv* km_env, jclass km_clazz, jlong pci, jlong evt) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetEventWhenCallbackReturns");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pci, (void*)(uintptr_t)evt);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pci;
    (void)evt;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setPriorityClass(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint dwpriorityclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetPriorityClass");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint32_t)dwpriorityclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwpriorityclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessAffinityMask(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dwprocessaffinitymask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessAffinityMask");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)dwprocessaffinitymask);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwprocessaffinitymask;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessAffinityUpdateMode(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessAffinityUpdateMode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessDEPPolicy(JNIEnv* km_env, jclass km_clazz, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDEPPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessDefaultCpuSetMasks(JNIEnv* km_env, jclass km_clazz, jlong process, jlong cpusetmasks, jshort cpusetmaskcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDefaultCpuSetMasks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)cpusetmasks, (uint16_t)cpusetmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessDefaultCpuSets(JNIEnv* km_env, jclass km_clazz, jlong process, jlong cpusetids, jint cpusetidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDefaultCpuSets");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (void*)(uintptr_t)cpusetids, (uint32_t)cpusetidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)cpusetids;
    (void)cpusetidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessDynamicEHContinuationTargets(JNIEnv* km_env, jclass km_clazz, jlong process, jshort numberoftargets, jlong targets) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDynamicEHContinuationTargets");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (uint16_t)numberoftargets, (void*)(uintptr_t)targets);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)numberoftargets;
    (void)targets;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessDynamicEnforcedCetCompatibleRanges(JNIEnv* km_env, jclass km_clazz, jlong process, jshort numberofranges, jlong ranges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessDynamicEnforcedCetCompatibleRanges");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)process, (uint16_t)numberofranges, (void*)(uintptr_t)ranges);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)numberofranges;
    (void)ranges;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessInformation(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint processinformationclass, jlong processinformation, jint processinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (int32_t)processinformationclass, (void*)(uintptr_t)processinformation, (uint32_t)processinformationsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)processinformationclass;
    (void)processinformation;
    (void)processinformationsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessMitigationPolicy(JNIEnv* km_env, jclass km_clazz, jint mitigationpolicy, jlong lpbuffer, jlong dwlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessMitigationPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)mitigationpolicy, (void*)(uintptr_t)lpbuffer, (uint64_t)dwlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mitigationpolicy;
    (void)lpbuffer;
    (void)dwlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessPriorityBoost(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint bdisablepriorityboost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessPriorityBoost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (int32_t)bdisablepriorityboost);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)bdisablepriorityboost;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessRestrictionExemption(JNIEnv* km_env, jclass km_clazz, jint fenableexemption) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessRestrictionExemption");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fenableexemption);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fenableexemption;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessShutdownParameters(JNIEnv* km_env, jclass km_clazz, jint dwlevel, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessShutdownParameters");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwlevel, (uint32_t)dwflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwlevel;
    (void)dwflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProcessWorkingSetSize(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jlong dwminimumworkingsetsize, jlong dwmaximumworkingsetsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProcessWorkingSetSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint64_t)dwminimumworkingsetsize, (uint64_t)dwmaximumworkingsetsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)dwminimumworkingsetsize;
    (void)dwmaximumworkingsetsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setProtectedPolicy(JNIEnv* km_env, jclass km_clazz, jlong policyguid, jlong policyvalue, jlong oldpolicyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetProtectedPolicy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)policyguid, (uint64_t)policyvalue, (void*)(uintptr_t)oldpolicyvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)policyguid;
    (void)policyvalue;
    (void)oldpolicyvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadAffinityMask(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong dwthreadaffinitymask) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadAffinityMask");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (uint64_t)dwthreadaffinitymask);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    (void)dwthreadaffinitymask;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadDescription(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpthreaddescription) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadDescription");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpthreaddescription);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpthreaddescription;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadGroupAffinity(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong groupaffinity, jlong previousgroupaffinity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadGroupAffinity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)groupaffinity, (void*)(uintptr_t)previousgroupaffinity);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)groupaffinity;
    (void)previousgroupaffinity;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadIdealProcessor(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint dwidealprocessor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadIdealProcessor");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (uint32_t)dwidealprocessor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    (void)dwidealprocessor;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadIdealProcessorEx(JNIEnv* km_env, jclass km_clazz, jlong hthread, jlong lpidealprocessor, jlong lppreviousidealprocessor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadIdealProcessorEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (void*)(uintptr_t)lpidealprocessor, (void*)(uintptr_t)lppreviousidealprocessor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)lpidealprocessor;
    (void)lppreviousidealprocessor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadInformation(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint threadinformationclass, jlong threadinformation, jint threadinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (int32_t)threadinformationclass, (void*)(uintptr_t)threadinformation, (uint32_t)threadinformationsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)threadinformationclass;
    (void)threadinformation;
    (void)threadinformationsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadPriority(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint npriority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadPriority");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (int32_t)npriority);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)npriority;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadPriorityBoost(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint bdisablepriorityboost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadPriorityBoost");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (int32_t)bdisablepriorityboost);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)bdisablepriorityboost;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadSelectedCpuSetMasks(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong cpusetmasks, jshort cpusetmaskcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadSelectedCpuSetMasks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (void*)(uintptr_t)cpusetmasks, (uint16_t)cpusetmaskcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)cpusetmasks;
    (void)cpusetmaskcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadSelectedCpuSets(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong cpusetids, jint cpusetidcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadSelectedCpuSets");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (void*)(uintptr_t)cpusetids, (uint32_t)cpusetidcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)cpusetids;
    (void)cpusetidcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadStackGuarantee(JNIEnv* km_env, jclass km_clazz, jlong stacksizeinbytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadStackGuarantee");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)stacksizeinbytes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)stacksizeinbytes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadToken(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thread, (void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadpoolStackInformation(JNIEnv* km_env, jclass km_clazz, jlong ptpp, jlong ptpsi) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolStackInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)ptpp, (void*)(uintptr_t)ptpsi);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptpp;
    (void)ptpsi;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadpoolThreadMaximum(JNIEnv* km_env, jclass km_clazz, jlong ptpp, jint cthrdmost) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolThreadMaximum");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)ptpp, (uint32_t)cthrdmost);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ptpp;
    (void)cthrdmost;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadpoolThreadMinimum(JNIEnv* km_env, jclass km_clazz, jlong ptpp, jint cthrdmic) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolThreadMinimum");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)ptpp, (uint32_t)cthrdmic);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ptpp;
    (void)cthrdmic;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadpoolTimer(JNIEnv* km_env, jclass km_clazz, jlong pti, jlong pftduetime, jint msperiod, jint mswindowlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolTimer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pti, (void*)(uintptr_t)pftduetime, (uint32_t)msperiod, (uint32_t)mswindowlength);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pti;
    (void)pftduetime;
    (void)msperiod;
    (void)mswindowlength;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadpoolTimerEx(JNIEnv* km_env, jclass km_clazz, jlong pti, jlong pftduetime, jint msperiod, jint mswindowlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolTimerEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)pti, (void*)(uintptr_t)pftduetime, (uint32_t)msperiod, (uint32_t)mswindowlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pti;
    (void)pftduetime;
    (void)msperiod;
    (void)mswindowlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadpoolWait(JNIEnv* km_env, jclass km_clazz, jlong pwa, jlong h, jlong pfttimeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolWait");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pwa, (void*)(uintptr_t)h, (void*)(uintptr_t)pfttimeout);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwa;
    (void)h;
    (void)pfttimeout;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setThreadpoolWaitEx(JNIEnv* km_env, jclass km_clazz, jlong pwa, jlong h, jlong pfttimeout, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetThreadpoolWaitEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)pwa, (void*)(uintptr_t)h, (void*)(uintptr_t)pfttimeout, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pwa;
    (void)h;
    (void)pfttimeout;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setTimerQueueTimer(JNIEnv* km_env, jclass km_clazz, jlong timerqueue, jlong callback, jlong parameter, jint duetime, jint period, jint preferio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetTimerQueueTimer");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timerqueue, (void*)(uintptr_t)callback, (void*)(uintptr_t)parameter, (uint32_t)duetime, (uint32_t)period, (int32_t)preferio);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)timerqueue;
    (void)callback;
    (void)parameter;
    (void)duetime;
    (void)period;
    (void)preferio;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setUmsThreadInformation(JNIEnv* km_env, jclass km_clazz, jlong umsthread, jint umsthreadinfoclass, jlong umsthreadinformation, jint umsthreadinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetUmsThreadInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)umsthread, (int32_t)umsthreadinfoclass, (void*)(uintptr_t)umsthreadinformation, (uint32_t)umsthreadinformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)umsthread;
    (void)umsthreadinfoclass;
    (void)umsthreadinformation;
    (void)umsthreadinformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setWaitableTimer(JNIEnv* km_env, jclass km_clazz, jlong htimer, jlong lpduetime, jint lperiod, jlong pfncompletionroutine, jlong lpargtocompletionroutine, jint fresume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWaitableTimer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htimer, (void*)(uintptr_t)lpduetime, (int32_t)lperiod, (void*)(uintptr_t)pfncompletionroutine, (void*)(uintptr_t)lpargtocompletionroutine, (int32_t)fresume);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htimer;
    (void)lpduetime;
    (void)lperiod;
    (void)pfncompletionroutine;
    (void)lpargtocompletionroutine;
    (void)fresume;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1setWaitableTimerEx(JNIEnv* km_env, jclass km_clazz, jlong htimer, jlong lpduetime, jint lperiod, jlong pfncompletionroutine, jlong lpargtocompletionroutine, jlong wakecontext, jint tolerabledelay) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetWaitableTimerEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)htimer, (void*)(uintptr_t)lpduetime, (int32_t)lperiod, (void*)(uintptr_t)pfncompletionroutine, (void*)(uintptr_t)lpargtocompletionroutine, (void*)(uintptr_t)wakecontext, (uint32_t)tolerabledelay);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)htimer;
    (void)lpduetime;
    (void)lperiod;
    (void)pfncompletionroutine;
    (void)lpargtocompletionroutine;
    (void)wakecontext;
    (void)tolerabledelay;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1signalObjectAndWait(JNIEnv* km_env, jclass km_clazz, jlong hobjecttosignal, jlong hobjecttowaiton, jint dwmilliseconds, jint balertable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SignalObjectAndWait");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hobjecttosignal, (void*)(uintptr_t)hobjecttowaiton, (uint32_t)dwmilliseconds, (int32_t)balertable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hobjecttosignal;
    (void)hobjecttowaiton;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1sleep(JNIEnv* km_env, jclass km_clazz, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Sleep");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)dwmilliseconds);
    } else {
        errno = ENOSYS;
    }
#else
    (void)dwmilliseconds;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1sleepConditionVariableCS(JNIEnv* km_env, jclass km_clazz, jlong conditionvariable, jlong criticalsection, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SleepConditionVariableCS");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)conditionvariable, (void*)(uintptr_t)criticalsection, (uint32_t)dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)conditionvariable;
    (void)criticalsection;
    (void)dwmilliseconds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1sleepConditionVariableSRW(JNIEnv* km_env, jclass km_clazz, jlong conditionvariable, jlong srwlock, jint dwmilliseconds, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SleepConditionVariableSRW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)conditionvariable, (void*)(uintptr_t)srwlock, (uint32_t)dwmilliseconds, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)conditionvariable;
    (void)srwlock;
    (void)dwmilliseconds;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1sleepEx(JNIEnv* km_env, jclass km_clazz, jint dwmilliseconds, jint balertable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SleepEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwmilliseconds, (int32_t)balertable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1startThreadpoolIo(JNIEnv* km_env, jclass km_clazz, jlong pio) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "StartThreadpoolIo");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pio);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pio;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1submitThreadpoolWork(JNIEnv* km_env, jclass km_clazz, jlong pwk) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SubmitThreadpoolWork");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pwk);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwk;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1suspendThread(JNIEnv* km_env, jclass km_clazz, jlong hthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SuspendThread");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1switchToFiber(JNIEnv* km_env, jclass km_clazz, jlong lpfiber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwitchToFiber");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lpfiber);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lpfiber;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1switchToThread(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SwitchToThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1terminateProcess(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint uexitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateProcess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint32_t)uexitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hprocess;
    (void)uexitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1terminateThread(JNIEnv* km_env, jclass km_clazz, jlong hthread, jint dwexitcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TerminateThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread, (uint32_t)dwexitcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hthread;
    (void)dwexitcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1tlsAlloc(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TlsAlloc");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1tlsFree(JNIEnv* km_env, jclass km_clazz, jint dwtlsindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TlsFree");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtlsindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtlsindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1tlsGetValue(JNIEnv* km_env, jclass km_clazz, jint dwtlsindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TlsGetValue");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtlsindex);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)dwtlsindex;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1tlsSetValue(JNIEnv* km_env, jclass km_clazz, jint dwtlsindex, jlong lptlsvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TlsSetValue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwtlsindex, (void*)(uintptr_t)lptlsvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwtlsindex;
    (void)lptlsvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1tryAcquireSRWLockExclusive(JNIEnv* km_env, jclass km_clazz, jlong srwlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TryAcquireSRWLockExclusive");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)srwlock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1tryAcquireSRWLockShared(JNIEnv* km_env, jclass km_clazz, jlong srwlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TryAcquireSRWLockShared");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)srwlock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)srwlock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1tryEnterCriticalSection(JNIEnv* km_env, jclass km_clazz, jlong lpcriticalsection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TryEnterCriticalSection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcriticalsection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcriticalsection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1trySubmitThreadpoolCallback(JNIEnv* km_env, jclass km_clazz, jlong pfns, jlong pv, jlong pcbe) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TrySubmitThreadpoolCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfns, (void*)(uintptr_t)pv, (void*)(uintptr_t)pcbe);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfns;
    (void)pv;
    (void)pcbe;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1umsThreadYield(JNIEnv* km_env, jclass km_clazz, jlong schedulerparam) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UmsThreadYield");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)schedulerparam);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)schedulerparam;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1unregisterWait(JNIEnv* km_env, jclass km_clazz, jlong waithandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterWait");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)waithandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)waithandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1unregisterWaitEx(JNIEnv* km_env, jclass km_clazz, jlong waithandle, jlong completionevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterWaitEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)waithandle, (void*)(uintptr_t)completionevent);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)waithandle;
    (void)completionevent;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1updateProcThreadAttribute(JNIEnv* km_env, jclass km_clazz, jlong lpattributelist, jint dwflags, jlong attribute, jlong lpvalue, jlong cbsize, jlong lppreviousvalue, jlong lpreturnsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UpdateProcThreadAttribute");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpattributelist, (uint32_t)dwflags, (uint64_t)attribute, (void*)(uintptr_t)lpvalue, (uint64_t)cbsize, (void*)(uintptr_t)lppreviousvalue, (void*)(uintptr_t)lpreturnsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpattributelist;
    (void)dwflags;
    (void)attribute;
    (void)lpvalue;
    (void)cbsize;
    (void)lppreviousvalue;
    (void)lpreturnsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitForInputIdle(JNIEnv* km_env, jclass km_clazz, jlong hprocess, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("user32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForInputIdle");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hprocess, (uint32_t)dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hprocess;
    (void)dwmilliseconds;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitForMultipleObjects(JNIEnv* km_env, jclass km_clazz, jint ncount, jlong lphandles, jint bwaitall, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForMultipleObjects");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ncount, (void*)(uintptr_t)lphandles, (int32_t)bwaitall, (uint32_t)dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ncount;
    (void)lphandles;
    (void)bwaitall;
    (void)dwmilliseconds;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitForMultipleObjectsEx(JNIEnv* km_env, jclass km_clazz, jint ncount, jlong lphandles, jint bwaitall, jint dwmilliseconds, jint balertable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForMultipleObjectsEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)ncount, (void*)(uintptr_t)lphandles, (int32_t)bwaitall, (uint32_t)dwmilliseconds, (int32_t)balertable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)ncount;
    (void)lphandles;
    (void)bwaitall;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitForSingleObject(JNIEnv* km_env, jclass km_clazz, jlong hhandle, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForSingleObject");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hhandle, (uint32_t)dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hhandle;
    (void)dwmilliseconds;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitForSingleObjectEx(JNIEnv* km_env, jclass km_clazz, jlong hhandle, jint dwmilliseconds, jint balertable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForSingleObjectEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hhandle, (uint32_t)dwmilliseconds, (int32_t)balertable);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hhandle;
    (void)dwmilliseconds;
    (void)balertable;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitForThreadpoolIoCallbacks(JNIEnv* km_env, jclass km_clazz, jlong pio, jint fcancelpendingcallbacks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForThreadpoolIoCallbacks");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pio, (int32_t)fcancelpendingcallbacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pio;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitForThreadpoolTimerCallbacks(JNIEnv* km_env, jclass km_clazz, jlong pti, jint fcancelpendingcallbacks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForThreadpoolTimerCallbacks");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pti, (int32_t)fcancelpendingcallbacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pti;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitForThreadpoolWaitCallbacks(JNIEnv* km_env, jclass km_clazz, jlong pwa, jint fcancelpendingcallbacks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForThreadpoolWaitCallbacks");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pwa, (int32_t)fcancelpendingcallbacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwa;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitForThreadpoolWorkCallbacks(JNIEnv* km_env, jclass km_clazz, jlong pwk, jint fcancelpendingcallbacks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitForThreadpoolWorkCallbacks");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)pwk, (int32_t)fcancelpendingcallbacks);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pwk;
    (void)fcancelpendingcallbacks;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1waitOnAddress(JNIEnv* km_env, jclass km_clazz, jlong address, jlong compareaddress, jlong addresssize, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WaitOnAddress");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address, (void*)(uintptr_t)compareaddress, (uint64_t)addresssize, (uint32_t)dwmilliseconds);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)address;
    (void)compareaddress;
    (void)addresssize;
    (void)dwmilliseconds;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1wakeAllConditionVariable(JNIEnv* km_env, jclass km_clazz, jlong conditionvariable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WakeAllConditionVariable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)conditionvariable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)conditionvariable;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1wakeByAddressAll(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WakeByAddressAll");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
    }
#else
    (void)address;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1wakeByAddressSingle(JNIEnv* km_env, jclass km_clazz, jlong address) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-synch-l1-2-0.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WakeByAddressSingle");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)address);
    } else {
        errno = ENOSYS;
    }
#else
    (void)address;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1wakeConditionVariable(JNIEnv* km_env, jclass km_clazz, jlong conditionvariable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WakeConditionVariable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)conditionvariable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)conditionvariable;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1winExec(JNIEnv* km_env, jclass km_clazz, jlong lpcmdline, jint ucmdshow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "WinExec");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcmdline, (uint32_t)ucmdshow);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)lpcmdline;
    (void)ucmdshow;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jshort JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1wow64SetThreadDefaultGuestMachine(JNIEnv* km_env, jclass km_clazz, jshort machine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint16_t (__stdcall *km_fn_t)(uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-wow64-l1-1-1.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64SetThreadDefaultGuestMachine");
    }
    uint16_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)machine);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)machine;
    errno = ENOSYS;
    uint16_t km_res = 0;
#endif
    return (jshort)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_threading_WindowsWin32SystemThreadingJniBridge_windowssys_1windows_1win32_1system_1threading_1wow64SuspendThread(JNIEnv* km_env, jclass km_clazz, jlong hthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "Wow64SuspendThread");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hthread);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)hthread;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

