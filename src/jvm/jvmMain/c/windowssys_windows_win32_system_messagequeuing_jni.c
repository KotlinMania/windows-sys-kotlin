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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQADsPathToFormatName(JNIEnv* km_env, jclass km_clazz, jlong lpwcsadspath, jlong lpwcsformatname, jlong lpdwformatnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQADsPathToFormatName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcsadspath, (void*)(uintptr_t)lpwcsformatname, (void*)(uintptr_t)lpdwformatnamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcsadspath;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQBeginTransaction(JNIEnv* km_env, jclass km_clazz, jlong pptransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQBeginTransaction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pptransaction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pptransaction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQCloseCursor(JNIEnv* km_env, jclass km_clazz, jlong hcursor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQCloseCursor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hcursor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hcursor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQCloseQueue(JNIEnv* km_env, jclass km_clazz, jlong hqueue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQCloseQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hqueue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQCreateCursor(JNIEnv* km_env, jclass km_clazz, jlong hqueue, jlong phcursor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQCreateCursor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hqueue, (void*)(uintptr_t)phcursor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueue;
    (void)phcursor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQCreateQueue(JNIEnv* km_env, jclass km_clazz, jlong psecuritydescriptor, jlong pqueueprops, jlong lpwcsformatname, jlong lpdwformatnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQCreateQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)pqueueprops, (void*)(uintptr_t)lpwcsformatname, (void*)(uintptr_t)lpdwformatnamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)psecuritydescriptor;
    (void)pqueueprops;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQDeleteQueue(JNIEnv* km_env, jclass km_clazz, jlong lpwcsformatname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQDeleteQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcsformatname);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcsformatname;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQFreeMemory(JNIEnv* km_env, jclass km_clazz, jlong pvmemory) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQFreeMemory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)pvmemory);
    } else {
        errno = ENOSYS;
    }
#else
    (void)pvmemory;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQFreeSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong hsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQFreeSecurityContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)hsecuritycontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)hsecuritycontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQGetMachineProperties(JNIEnv* km_env, jclass km_clazz, jlong lpwcsmachinename, jlong pguidmachineid, jlong pqmprops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetMachineProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcsmachinename, (void*)(uintptr_t)pguidmachineid, (void*)(uintptr_t)pqmprops);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcsmachinename;
    (void)pguidmachineid;
    (void)pqmprops;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQGetOverlappedResult(JNIEnv* km_env, jclass km_clazz, jlong lpoverlapped) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetOverlappedResult");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpoverlapped);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpoverlapped;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQGetPrivateComputerInformation(JNIEnv* km_env, jclass km_clazz, jlong lpwcscomputername, jlong pprivateprops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetPrivateComputerInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcscomputername, (void*)(uintptr_t)pprivateprops);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcscomputername;
    (void)pprivateprops;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQGetQueueProperties(JNIEnv* km_env, jclass km_clazz, jlong lpwcsformatname, jlong pqueueprops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetQueueProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcsformatname, (void*)(uintptr_t)pqueueprops);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcsformatname;
    (void)pqueueprops;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQGetQueueSecurity(JNIEnv* km_env, jclass km_clazz, jlong lpwcsformatname, jint requestedinformation, jlong psecuritydescriptor, jint nlength, jlong lpnlengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetQueueSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcsformatname, (uint32_t)requestedinformation, (void*)(uintptr_t)psecuritydescriptor, (uint32_t)nlength, (void*)(uintptr_t)lpnlengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcsformatname;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)nlength;
    (void)lpnlengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong lpcertbuffer, jint dwcertbufferlength, jlong phsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcertbuffer, (uint32_t)dwcertbufferlength, (void*)(uintptr_t)phsecuritycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcertbuffer;
    (void)dwcertbufferlength;
    (void)phsecuritycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQGetSecurityContextEx(JNIEnv* km_env, jclass km_clazz, jlong lpcertbuffer, jint dwcertbufferlength, jlong phsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQGetSecurityContextEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpcertbuffer, (uint32_t)dwcertbufferlength, (void*)(uintptr_t)phsecuritycontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpcertbuffer;
    (void)dwcertbufferlength;
    (void)phsecuritycontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQHandleToFormatName(JNIEnv* km_env, jclass km_clazz, jlong hqueue, jlong lpwcsformatname, jlong lpdwformatnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQHandleToFormatName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hqueue, (void*)(uintptr_t)lpwcsformatname, (void*)(uintptr_t)lpdwformatnamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueue;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQInstanceToFormatName(JNIEnv* km_env, jclass km_clazz, jlong pguid, jlong lpwcsformatname, jlong lpdwformatnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQInstanceToFormatName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pguid, (void*)(uintptr_t)lpwcsformatname, (void*)(uintptr_t)lpdwformatnamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pguid;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQLocateBegin(JNIEnv* km_env, jclass km_clazz, jlong lpwcscontext, jlong prestriction, jlong pcolumns, jlong psort, jlong phenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQLocateBegin");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcscontext, (void*)(uintptr_t)prestriction, (void*)(uintptr_t)pcolumns, (void*)(uintptr_t)psort, (void*)(uintptr_t)phenum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcscontext;
    (void)prestriction;
    (void)pcolumns;
    (void)psort;
    (void)phenum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQLocateEnd(JNIEnv* km_env, jclass km_clazz, jlong henum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQLocateEnd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henum);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henum;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQLocateNext(JNIEnv* km_env, jclass km_clazz, jlong henum, jlong pcprops, jlong apropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQLocateNext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)henum, (void*)(uintptr_t)pcprops, (void*)(uintptr_t)apropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)henum;
    (void)pcprops;
    (void)apropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQMarkMessageRejected(JNIEnv* km_env, jclass km_clazz, jlong hqueue, jlong ulllookupid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQMarkMessageRejected");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)hqueue, (uint64_t)ulllookupid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueue;
    (void)ulllookupid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQMgmtAction(JNIEnv* km_env, jclass km_clazz, jlong pcomputername, jlong pobjectname, jlong paction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQMgmtAction");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcomputername, (void*)(uintptr_t)pobjectname, (void*)(uintptr_t)paction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcomputername;
    (void)pobjectname;
    (void)paction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQMgmtGetInfo(JNIEnv* km_env, jclass km_clazz, jlong pcomputername, jlong pobjectname, jlong pmgmtprops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQMgmtGetInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pcomputername, (void*)(uintptr_t)pobjectname, (void*)(uintptr_t)pmgmtprops);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pcomputername;
    (void)pobjectname;
    (void)pmgmtprops;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQMoveMessage(JNIEnv* km_env, jclass km_clazz, jlong hsourcequeue, jlong hdestinationqueue, jlong ulllookupid, jlong ptransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQMoveMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hsourcequeue, (int64_t)hdestinationqueue, (uint64_t)ulllookupid, (void*)(uintptr_t)ptransaction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsourcequeue;
    (void)hdestinationqueue;
    (void)ulllookupid;
    (void)ptransaction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQOpenQueue(JNIEnv* km_env, jclass km_clazz, jlong lpwcsformatname, jint dwaccess, jint dwsharemode, jlong phqueue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQOpenQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcsformatname, (uint32_t)dwaccess, (uint32_t)dwsharemode, (void*)(uintptr_t)phqueue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcsformatname;
    (void)dwaccess;
    (void)dwsharemode;
    (void)phqueue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQPathNameToFormatName(JNIEnv* km_env, jclass km_clazz, jlong lpwcspathname, jlong lpwcsformatname, jlong lpdwformatnamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQPathNameToFormatName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcspathname, (void*)(uintptr_t)lpwcsformatname, (void*)(uintptr_t)lpdwformatnamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcspathname;
    (void)lpwcsformatname;
    (void)lpdwformatnamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQPurgeQueue(JNIEnv* km_env, jclass km_clazz, jlong hqueue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQPurgeQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hqueue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hqueue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQReceiveMessage(JNIEnv* km_env, jclass km_clazz, jlong hsource, jint dwtimeout, jint dwaction, jlong pmessageprops, jlong lpoverlapped, jlong fnreceivecallback, jlong hcursor, jlong ptransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQReceiveMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hsource, (uint32_t)dwtimeout, (uint32_t)dwaction, (void*)(uintptr_t)pmessageprops, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)fnreceivecallback, (void*)(uintptr_t)hcursor, (void*)(uintptr_t)ptransaction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsource;
    (void)dwtimeout;
    (void)dwaction;
    (void)pmessageprops;
    (void)lpoverlapped;
    (void)fnreceivecallback;
    (void)hcursor;
    (void)ptransaction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQReceiveMessageByLookupId(JNIEnv* km_env, jclass km_clazz, jlong hsource, jlong ulllookupid, jint dwlookupaction, jlong pmessageprops, jlong lpoverlapped, jlong fnreceivecallback, jlong ptransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint64_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQReceiveMessageByLookupId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hsource, (uint64_t)ulllookupid, (uint32_t)dwlookupaction, (void*)(uintptr_t)pmessageprops, (void*)(uintptr_t)lpoverlapped, (void*)(uintptr_t)fnreceivecallback, (void*)(uintptr_t)ptransaction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hsource;
    (void)ulllookupid;
    (void)dwlookupaction;
    (void)pmessageprops;
    (void)lpoverlapped;
    (void)fnreceivecallback;
    (void)ptransaction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQRegisterCertificate(JNIEnv* km_env, jclass km_clazz, jint dwflags, jlong lpcertbuffer, jint dwcertbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQRegisterCertificate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)dwflags, (void*)(uintptr_t)lpcertbuffer, (uint32_t)dwcertbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dwflags;
    (void)lpcertbuffer;
    (void)dwcertbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQSendMessage(JNIEnv* km_env, jclass km_clazz, jlong hdestinationqueue, jlong pmessageprops, jlong ptransaction) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQSendMessage");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)hdestinationqueue, (void*)(uintptr_t)pmessageprops, (void*)(uintptr_t)ptransaction);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)hdestinationqueue;
    (void)pmessageprops;
    (void)ptransaction;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQSetQueueProperties(JNIEnv* km_env, jclass km_clazz, jlong lpwcsformatname, jlong pqueueprops) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQSetQueueProperties");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcsformatname, (void*)(uintptr_t)pqueueprops);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcsformatname;
    (void)pqueueprops;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_system_messagequeuing_WindowsWin32SystemMessagequeuingJniBridge_windowssysWindowsWin32SystemMessagequeuingMQSetQueueSecurity(JNIEnv* km_env, jclass km_clazz, jlong lpwcsformatname, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mqrt.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MQSetQueueSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lpwcsformatname, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)lpwcsformatname;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

