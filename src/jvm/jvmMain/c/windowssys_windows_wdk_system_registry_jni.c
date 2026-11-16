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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCommitRegistryTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)transactionhandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)transactionhandle;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtCreateKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jint titleindex, jlong arg4Class, jint createoptions, jlong disposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)titleindex, (void*)(uintptr_t)arg4Class, (uint32_t)createoptions, (void*)(uintptr_t)disposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)titleindex;
    (void)arg4Class;
    (void)createoptions;
    (void)disposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jint titleindex, jlong arg4Class, jint createoptions, jlong transactionhandle, jlong disposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateKeyTransacted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)titleindex, (void*)(uintptr_t)arg4Class, (uint32_t)createoptions, (void*)(uintptr_t)transactionhandle, (void*)(uintptr_t)disposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)titleindex;
    (void)arg4Class;
    (void)createoptions;
    (void)transactionhandle;
    (void)disposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jint desiredaccess, jlong objectattributes, jint createoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateRegistryTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)transactionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)createoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)createoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtDeleteKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtDeleteValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong valuename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)valuename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)valuename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtEnumerateKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint arg1Index, jint keyinformationclass, jlong keyinformation, jint length, jlong resultlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtEnumerateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)arg1Index, (int32_t)keyinformationclass, (void*)(uintptr_t)keyinformation, (uint32_t)length, (void*)(uintptr_t)resultlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)arg1Index;
    (void)keyinformationclass;
    (void)keyinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtEnumerateValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint arg1Index, jint keyvalueinformationclass, jlong keyvalueinformation, jint length, jlong resultlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtEnumerateValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)arg1Index, (int32_t)keyvalueinformationclass, (void*)(uintptr_t)keyvalueinformation, (uint32_t)length, (void*)(uintptr_t)resultlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)arg1Index;
    (void)keyvalueinformationclass;
    (void)keyvalueinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtFlushKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(JNIEnv* km_env, jclass km_clazz, jlong masterkeyhandle, jint count, jlong subordinateobjects, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint completionfilter, jboolean watchtree, jlong buffer, jint buffersize, jboolean asynchronous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, uint32_t, bool, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtNotifyChangeMultipleKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)masterkeyhandle, (uint32_t)count, (void*)(uintptr_t)subordinateobjects, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)completionfilter, (bool)watchtree, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (bool)asynchronous);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)masterkeyhandle;
    (void)count;
    (void)subordinateobjects;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)completionfilter;
    (void)watchtree;
    (void)buffer;
    (void)buffersize;
    (void)asynchronous;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtOpenKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtOpenKeyEx(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jint openoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenKeyEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)openoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)openoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jlong transactionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenKeyTransacted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)transactionhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)transactionhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jint openoptions, jlong transactionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenKeyTransactedEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)openoptions, (void*)(uintptr_t)transactionhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)openoptions;
    (void)transactionhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenRegistryTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)transactionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtQueryKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint keyinformationclass, jlong keyinformation, jint length, jlong resultlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (int32_t)keyinformationclass, (void*)(uintptr_t)keyinformation, (uint32_t)length, (void*)(uintptr_t)resultlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)keyinformationclass;
    (void)keyinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong valueentries, jint entrycount, jlong valuebuffer, jlong bufferlength, jlong requiredbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryMultipleValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)valueentries, (uint32_t)entrycount, (void*)(uintptr_t)valuebuffer, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)requiredbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)valueentries;
    (void)entrycount;
    (void)valuebuffer;
    (void)bufferlength;
    (void)requiredbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtQueryValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong valuename, jint keyvalueinformationclass, jlong keyvalueinformation, jint length, jlong resultlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)valuename, (int32_t)keyvalueinformationclass, (void*)(uintptr_t)keyvalueinformation, (uint32_t)length, (void*)(uintptr_t)resultlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)valuename;
    (void)keyvalueinformationclass;
    (void)keyvalueinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtRenameKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong newname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRenameKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)newname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)newname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtRestoreKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong filehandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRestoreKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)filehandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)filehandle;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtRollbackRegistryTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)transactionhandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)transactionhandle;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtSaveKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSaveKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)filehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtSaveKeyEx(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong filehandle, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSaveKeyEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)filehandle, (uint32_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)filehandle;
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtSetInformationKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint keysetinformationclass, jlong keysetinformation, jint keysetinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (int32_t)keysetinformationclass, (void*)(uintptr_t)keysetinformation, (uint32_t)keysetinformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)keysetinformationclass;
    (void)keysetinformation;
    (void)keysetinformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryNtSetValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong valuename, jint titleindex, jint type, jlong data, jint datasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)valuename, (uint32_t)titleindex, (uint32_t)type, (void*)(uintptr_t)data, (uint32_t)datasize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)valuename;
    (void)titleindex;
    (void)type;
    (void)data;
    (void)datasize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCommitRegistryTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)transactionhandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)transactionhandle;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwCreateKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jint titleindex, jlong arg4Class, jint createoptions, jlong disposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)titleindex, (void*)(uintptr_t)arg4Class, (uint32_t)createoptions, (void*)(uintptr_t)disposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)titleindex;
    (void)arg4Class;
    (void)createoptions;
    (void)disposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jint titleindex, jlong arg4Class, jint createoptions, jlong transactionhandle, jlong disposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateKeyTransacted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)titleindex, (void*)(uintptr_t)arg4Class, (uint32_t)createoptions, (void*)(uintptr_t)transactionhandle, (void*)(uintptr_t)disposition);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)titleindex;
    (void)arg4Class;
    (void)createoptions;
    (void)transactionhandle;
    (void)disposition;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jint desiredaccess, jlong objectattributes, jint createoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateRegistryTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)transactionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)createoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)createoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwDeleteKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwDeleteValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong valuename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)valuename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)valuename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwEnumerateKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint arg1Index, jint keyinformationclass, jlong keyinformation, jint length, jlong resultlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwEnumerateKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)arg1Index, (int32_t)keyinformationclass, (void*)(uintptr_t)keyinformation, (uint32_t)length, (void*)(uintptr_t)resultlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)arg1Index;
    (void)keyinformationclass;
    (void)keyinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwEnumerateValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint arg1Index, jint keyvalueinformationclass, jlong keyvalueinformation, jint length, jlong resultlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwEnumerateValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)arg1Index, (int32_t)keyvalueinformationclass, (void*)(uintptr_t)keyvalueinformation, (uint32_t)length, (void*)(uintptr_t)resultlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)arg1Index;
    (void)keyvalueinformationclass;
    (void)keyvalueinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwFlushKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(JNIEnv* km_env, jclass km_clazz, jlong masterkeyhandle, jint count, jlong subordinateobjects, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint completionfilter, jboolean watchtree, jlong buffer, jint buffersize, jboolean asynchronous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, uint32_t, bool, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwNotifyChangeMultipleKeys");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)masterkeyhandle, (uint32_t)count, (void*)(uintptr_t)subordinateobjects, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)completionfilter, (bool)watchtree, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (bool)asynchronous);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)masterkeyhandle;
    (void)count;
    (void)subordinateobjects;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)completionfilter;
    (void)watchtree;
    (void)buffer;
    (void)buffersize;
    (void)asynchronous;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwOpenKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwOpenKeyEx(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jint openoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenKeyEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)openoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)openoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jlong transactionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenKeyTransacted");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)transactionhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)transactionhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint desiredaccess, jlong objectattributes, jint openoptions, jlong transactionhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenKeyTransactedEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (uint32_t)openoptions, (void*)(uintptr_t)transactionhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)openoptions;
    (void)transactionhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenRegistryTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)transactionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)transactionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwQueryKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint keyinformationclass, jlong keyinformation, jint length, jlong resultlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (int32_t)keyinformationclass, (void*)(uintptr_t)keyinformation, (uint32_t)length, (void*)(uintptr_t)resultlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)keyinformationclass;
    (void)keyinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong valueentries, jint entrycount, jlong valuebuffer, jlong bufferlength, jlong requiredbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryMultipleValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)valueentries, (uint32_t)entrycount, (void*)(uintptr_t)valuebuffer, (void*)(uintptr_t)bufferlength, (void*)(uintptr_t)requiredbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)valueentries;
    (void)entrycount;
    (void)valuebuffer;
    (void)bufferlength;
    (void)requiredbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwQueryValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong valuename, jint keyvalueinformationclass, jlong keyvalueinformation, jint length, jlong resultlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)valuename, (int32_t)keyvalueinformationclass, (void*)(uintptr_t)keyvalueinformation, (uint32_t)length, (void*)(uintptr_t)resultlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)valuename;
    (void)keyvalueinformationclass;
    (void)keyvalueinformation;
    (void)length;
    (void)resultlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwRenameKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong newname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRenameKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)newname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)newname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwRestoreKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong filehandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRestoreKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)filehandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)filehandle;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(JNIEnv* km_env, jclass km_clazz, jlong transactionhandle, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwRollbackRegistryTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)transactionhandle, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)transactionhandle;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwSaveKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSaveKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)filehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwSaveKeyEx(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong filehandle, jint format) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSaveKeyEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)filehandle, (uint32_t)format);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)filehandle;
    (void)format;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwSetInformationKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jint keysetinformationclass, jlong keysetinformation, jint keysetinformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (int32_t)keysetinformationclass, (void*)(uintptr_t)keysetinformation, (uint32_t)keysetinformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)keysetinformationclass;
    (void)keysetinformation;
    (void)keysetinformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_system_registry_WindowsWdkSystemRegistryJniBridge_windowssysWindowsWdkSystemRegistryZwSetValueKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong valuename, jint titleindex, jint type, jlong data, jint datasize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetValueKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)valuename, (uint32_t)titleindex, (uint32_t)type, (void*)(uintptr_t)data, (uint32_t)datasize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
    (void)valuename;
    (void)titleindex;
    (void)type;
    (void)data;
    (void)datasize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

