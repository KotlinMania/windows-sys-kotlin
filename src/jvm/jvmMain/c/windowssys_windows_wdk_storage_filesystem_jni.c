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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemApplyControlToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pinput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyControlToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)pinput;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcAsyncCopyRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer, jlong iostatus, jlong ioissuerthread, jlong asyncreadcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcAsyncCopyRead");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus, (int64_t)ioissuerthread, (void*)(uintptr_t)asyncreadcontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    (void)ioissuerthread;
    (void)asyncreadcontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcCanIWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint bytestowrite, jboolean wait, jbyte retrying) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, bool, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCanIWrite");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)bytestowrite, (bool)wait, (uint8_t)retrying);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)bytestowrite;
    (void)wait;
    (void)retrying;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcCoherencyFlushAndPurgeCache(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jlong fileoffset, jint length, jlong iostatus, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCoherencyFlushAndPurgeCache");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (void*)(uintptr_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)iostatus, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)iostatus;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcCopyRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyRead");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcCopyReadEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer, jlong iostatus, jlong ioissuerthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyReadEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus, (int64_t)ioissuerthread);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    (void)ioissuerthread;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcCopyWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyWrite");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcCopyWriteEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer, jlong ioissuerthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyWriteEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer, (int64_t)ioissuerthread);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)ioissuerthread;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcCopyWriteWontFlush(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyWriteWontFlush");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcDeferWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong postroutine, jlong context1, jlong context2, jint bytestowrite, jboolean retrying) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcDeferWrite");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)postroutine, (void*)(uintptr_t)context1, (void*)(uintptr_t)context2, (uint32_t)bytestowrite, (bool)retrying);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)postroutine;
    (void)context1;
    (void)context2;
    (void)bytestowrite;
    (void)retrying;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcErrorCallbackRoutine(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcErrorCallbackRoutine");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcFastCopyRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fileoffset, jint length, jint pagecount, jlong buffer, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcFastCopyRead");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)fileoffset, (uint32_t)length, (uint32_t)pagecount, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)pagecount;
    (void)buffer;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcFastCopyWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fileoffset, jint length, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcFastCopyWrite");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)buffer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcFlushCache(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jlong fileoffset, jint length, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcFlushCache");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (void*)(uintptr_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcGetDirtyPages(JNIEnv* km_env, jclass km_clazz, jlong loghandle, jlong dirtypageroutine, jlong context1, jlong context2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetDirtyPages");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)loghandle, (void*)(uintptr_t)dirtypageroutine, (void*)(uintptr_t)context1, (void*)(uintptr_t)context2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)loghandle;
    (void)dirtypageroutine;
    (void)context1;
    (void)context2;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromBcb(JNIEnv* km_env, jclass km_clazz, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFileObjectFromBcb");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bcb);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)bcb;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrs(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFileObjectFromSectionPtrs");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionobjectpointer);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)sectionobjectpointer;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcGetFileObjectFromSectionPtrsRef(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFileObjectFromSectionPtrsRef");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionobjectpointer);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)sectionobjectpointer;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcGetFlushedValidData(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jboolean bcblistheld) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFlushedValidData");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (bool)bcblistheld);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sectionobjectpointer;
    (void)bcblistheld;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcInitializeCacheMap(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesizes, jboolean pinaccess, jlong callbacks, jlong lazywritecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcInitializeCacheMap");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesizes, (bool)pinaccess, (void*)(uintptr_t)callbacks, (void*)(uintptr_t)lazywritecontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)filesizes;
    (void)pinaccess;
    (void)callbacks;
    (void)lazywritecontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcInitializeCacheMapEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesizes, jboolean pinaccess, jlong callbacks, jlong lazywritecontext, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcInitializeCacheMapEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesizes, (bool)pinaccess, (void*)(uintptr_t)callbacks, (void*)(uintptr_t)lazywritecontext, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)filesizes;
    (void)pinaccess;
    (void)callbacks;
    (void)lazywritecontext;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcIsCacheManagerCallbackNeeded(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcIsCacheManagerCallbackNeeded");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)status);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)status;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcIsThereDirtyData(JNIEnv* km_env, jclass km_clazz, jlong vpb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcIsThereDirtyData");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vpb);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)vpb;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcIsThereDirtyDataEx(JNIEnv* km_env, jclass km_clazz, jlong vpb, jlong numberofdirtypages) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcIsThereDirtyDataEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)vpb, (void*)(uintptr_t)numberofdirtypages);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)vpb;
    (void)numberofdirtypages;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcMapData(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint flags, jlong bcb, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMapData");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)flags, (void*)(uintptr_t)bcb, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    (void)buffer;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcMdlRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlRead");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcMdlReadComplete(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlReadComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)mdlchain);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)mdlchain;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcMdlWriteAbort(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlWriteAbort");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)mdlchain);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)mdlchain;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcMdlWriteComplete(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlWriteComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)mdlchain);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcPinMappedData(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint flags, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPinMappedData");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)flags, (void*)(uintptr_t)bcb);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcPinRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint flags, jlong bcb, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPinRead");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)flags, (void*)(uintptr_t)bcb, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    (void)buffer;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcPrepareMdlWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPrepareMdlWrite");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcPreparePinWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean zero, jint flags, jlong bcb, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPreparePinWrite");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)zero, (uint32_t)flags, (void*)(uintptr_t)bcb, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)zero;
    (void)flags;
    (void)bcb;
    (void)buffer;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcPurgeCacheSection(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jlong fileoffset, jint length, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPurgeCacheSection");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)flags;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcRemapBcb(JNIEnv* km_env, jclass km_clazz, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcRemapBcb");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bcb);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)bcb;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcRepinBcb(JNIEnv* km_env, jclass km_clazz, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcRepinBcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bcb);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bcb;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcScheduleReadAhead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcScheduleReadAhead");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcScheduleReadAheadEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jlong ioissuerthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcScheduleReadAheadEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (int64_t)ioissuerthread);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)ioissuerthread;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributes(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jboolean disablereadahead, jboolean disablewritebehind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetAdditionalCacheAttributes");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (bool)disablereadahead, (bool)disablewritebehind);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)disablereadahead;
    (void)disablewritebehind;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetAdditionalCacheAttributesEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetAdditionalCacheAttributesEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetBcbOwnerPointer(JNIEnv* km_env, jclass km_clazz, jlong bcb, jlong ownerpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetBcbOwnerPointer");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bcb, (void*)(uintptr_t)ownerpointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bcb;
    (void)ownerpointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetDirtyPageThreshold(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint dirtypagethreshold) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetDirtyPageThreshold");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)dirtypagethreshold);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)dirtypagethreshold;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetDirtyPinnedData(JNIEnv* km_env, jclass km_clazz, jlong bcbvoid, jlong lsn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetDirtyPinnedData");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bcbvoid, (void*)(uintptr_t)lsn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bcbvoid;
    (void)lsn;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetFileSizes(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesizes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetFileSizes");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesizes);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)filesizes;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetFileSizesEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesizes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetFileSizesEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesizes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)filesizes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetLogHandleForFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong loghandle, jlong flushtolsnroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetLogHandleForFile");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)loghandle, (void*)(uintptr_t)flushtolsnroutine);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)loghandle;
    (void)flushtolsnroutine;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetParallelFlushFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jboolean enableparallelflush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetParallelFlushFile");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (bool)enableparallelflush);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)enableparallelflush;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcSetReadAheadGranularity(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint granularity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetReadAheadGranularity");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)granularity);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    (void)granularity;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcUninitializeCacheMap(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong truncatesize, jlong uninitializeevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUninitializeCacheMap");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)truncatesize, (void*)(uintptr_t)uninitializeevent);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)truncatesize;
    (void)uninitializeevent;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcUnpinData(JNIEnv* km_env, jclass km_clazz, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUnpinData");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bcb);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bcb;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcUnpinDataForThread(JNIEnv* km_env, jclass km_clazz, jlong bcb, jlong resourcethreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUnpinDataForThread");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bcb, (uint64_t)resourcethreadid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bcb;
    (void)resourcethreadid;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcUnpinRepinnedBcb(JNIEnv* km_env, jclass km_clazz, jlong bcb, jboolean writethrough, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUnpinRepinnedBcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)bcb, (bool)writethrough, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bcb;
    (void)writethrough;
    (void)iostatus;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcWaitForCurrentLazyWriterActivity(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcWaitForCurrentLazyWriterActivity");
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

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCcZeroData(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong startoffset, jlong endoffset, jboolean wait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcZeroData");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)startoffset, (void*)(uintptr_t)endoffset, (bool)wait);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)startoffset;
    (void)endoffset;
    (void)wait;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemCompleteAuthToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong ptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompleteAuthToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)ptoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)ptoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemExDisableResourceBoostLite(JNIEnv* km_env, jclass km_clazz, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExDisableResourceBoostLite");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)resource);
    } else {
        errno = ENOSYS;
    }
#else
    (void)resource;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemExQueryPoolBlockSize(JNIEnv* km_env, jclass km_clazz, jlong poolblock, jlong quotacharged) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExQueryPoolBlockSize");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)poolblock, (void*)(uintptr_t)quotacharged);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)poolblock;
    (void)quotacharged;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemExportSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fflags, jlong ppackedcontext, jlong ptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportSecurityContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fflags, (void*)(uintptr_t)ppackedcontext, (void*)(uintptr_t)ptoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)fflags;
    (void)ppackedcontext;
    (void)ptoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAcknowledgeEcp(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAcknowledgeEcp");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAcquireFileExclusive(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAcquireFileExclusive");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddBaseMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)lbn, (int64_t)sectorcount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAddBaseMcbEntryEx(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddBaseMcbEntryEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)lbn, (int64_t)sectorcount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAddLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddLargeMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)lbn, (int64_t)sectorcount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAddMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint vbn, jint lbn, jint sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)vbn, (uint32_t)lbn, (uint32_t)sectorcount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey, jlong shortname, jlong longname, jboolean keybyshortname, jint datalength, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddToTunnelCache");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey, (void*)(uintptr_t)shortname, (void*)(uintptr_t)longname, (bool)keybyshortname, (uint32_t)datalength, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cache;
    (void)directorykey;
    (void)shortname;
    (void)longname;
    (void)keybyshortname;
    (void)datalength;
    (void)data;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAddToTunnelCacheEx(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey, jlong shortname, jlong longname, jint flags, jint datalength, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddToTunnelCacheEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey, (void*)(uintptr_t)shortname, (void*)(uintptr_t)longname, (uint32_t)flags, (uint32_t)datalength, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cache;
    (void)directorykey;
    (void)shortname;
    (void)longname;
    (void)flags;
    (void)datalength;
    (void)data;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAllocateAePushLock(JNIEnv* km_env, jclass km_clazz, jint pooltype, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateAePushLock");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)pooltype, (uint32_t)tag);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)pooltype;
    (void)tag;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecptype, jint sizeofcontext, jint flags, jlong cleanupcallback, jint pooltag, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ecptype, (uint32_t)sizeofcontext, (uint32_t)flags, (void*)(uintptr_t)cleanupcallback, (uint32_t)pooltag, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)pooltag;
    (void)ecpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterFromLookasideList(JNIEnv* km_env, jclass km_clazz, jlong ecptype, jint sizeofcontext, jint flags, jlong cleanupcallback, jlong lookasidelist, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameterFromLookasideList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ecptype, (uint32_t)sizeofcontext, (uint32_t)flags, (void*)(uintptr_t)cleanupcallback, (void*)(uintptr_t)lookasidelist, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)lookasidelist;
    (void)ecpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAllocateExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jint flags, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameterList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAllocateFileLock(JNIEnv* km_env, jclass km_clazz, jlong completelockirproutine, jlong unlockroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateFileLock");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)completelockirproutine, (void*)(uintptr_t)unlockroutine);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)completelockirproutine;
    (void)unlockroutine;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAllocateResource(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateResource");
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

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAreNamesEqual(JNIEnv* km_env, jclass km_clazz, jlong constantnamea, jlong constantnameb, jboolean ignorecase, jlong upcasetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreNamesEqual");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)constantnamea, (void*)(uintptr_t)constantnameb, (bool)ignorecase, (void*)(uintptr_t)upcasetable);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)constantnamea;
    (void)constantnameb;
    (void)ignorecase;
    (void)upcasetable;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAreThereCurrentOrInProgressFileLocks(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreThereCurrentOrInProgressFileLocks");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAreThereWaitingFileLocks(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreThereWaitingFileLocks");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlAreVolumeStartupApplicationsComplete(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreVolumeStartupApplicationsComplete");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlBalanceReads(JNIEnv* km_env, jclass km_clazz, jlong targetdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlBalanceReads");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)targetdevice);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)targetdevice;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForMultipleObjects(JNIEnv* km_env, jclass km_clazz, jint count, jlong objectarray, jint waittype, jlong timeout, jlong waitblockarray, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCancellableWaitForMultipleObjects");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)count, (void*)(uintptr_t)objectarray, (int32_t)waittype, (void*)(uintptr_t)timeout, (void*)(uintptr_t)waitblockarray, (void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)count;
    (void)objectarray;
    (void)waittype;
    (void)timeout;
    (void)waitblockarray;
    (void)irp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCancellableWaitForSingleObject(JNIEnv* km_env, jclass km_clazz, jlong object, jlong timeout, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCancellableWaitForSingleObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)timeout, (void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)object;
    (void)timeout;
    (void)irp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlChangeBackingFileObject(JNIEnv* km_env, jclass km_clazz, jlong currentfileobject, jlong newfileobject, jint changebackingtype, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlChangeBackingFileObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)currentfileobject, (void*)(uintptr_t)newfileobject, (int32_t)changebackingtype, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)currentfileobject;
    (void)newfileobject;
    (void)changebackingtype;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForOplockRequest(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong allocationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckLockForOplockRequest");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)allocationsize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)allocationsize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForReadAccess(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckLockForReadAccess");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)irp;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCheckLockForWriteAccess(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckLockForWriteAccess");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)irp;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCheckOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckOplock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irp;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckOplockEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCheckOplockEx2(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jint flagsex2, jlong completionroutinecontext, jlong completionroutine, jlong postirproutine, jlong timeout, jlong notifycontext, jlong notifyroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckOplockEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (uint32_t)flagsex2, (void*)(uintptr_t)completionroutinecontext, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine, (uint64_t)timeout, (void*)(uintptr_t)notifycontext, (void*)(uintptr_t)notifyroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)flagsex2;
    (void)completionroutinecontext;
    (void)completionroutine;
    (void)postirproutine;
    (void)timeout;
    (void)notifycontext;
    (void)notifyroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCheckUpperOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock, jint newloweroplockstate, jlong completionroutinecontext, jlong completionroutine, jlong prependroutine, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckUpperOplock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (uint32_t)newloweroplockstate, (void*)(uintptr_t)completionroutinecontext, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)prependroutine, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)newloweroplockstate;
    (void)completionroutinecontext;
    (void)completionroutine;
    (void)prependroutine;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCopyRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jint lockkey, jlong buffer, jlong iostatus, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCopyRead");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (uint32_t)lockkey, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)lockkey;
    (void)buffer;
    (void)iostatus;
    (void)deviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCopyWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jint lockkey, jlong buffer, jlong iostatus, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCopyWrite");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (uint32_t)lockkey, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)lockkey;
    (void)buffer;
    (void)iostatus;
    (void)deviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCreateSectionForDataScan(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jlong sectionobject, jlong sectionfilesize, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCreateSectionForDataScan");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionhandle, (void*)(uintptr_t)sectionobject, (void*)(uintptr_t)sectionfilesize, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sectionhandle;
    (void)sectionobject;
    (void)sectionfilesize;
    (void)fileobject;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCurrentBatchOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCurrentBatchOplock");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCurrentOplock");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlCurrentOplockH(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCurrentOplockH");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlDeleteExtraCreateParameterLookasideList(JNIEnv* km_env, jclass km_clazz, jlong lookaside, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeleteExtraCreateParameterLookasideList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lookaside, (uint32_t)flags);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lookaside;
    (void)flags;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlDeleteKeyFromTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeleteKeyFromTunnelCache");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cache;
    (void)directorykey;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlDeleteTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeleteTunnelCache");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)cache);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cache;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlDeregisterUncProvider(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeregisterUncProvider");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlDismountComplete(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jint dismountstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDismountComplete");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)deviceobject, (int32_t)dismountstatus);
    } else {
        errno = ENOSYS;
    }
#else
    (void)deviceobject;
    (void)dismountstatus;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlDoesDbcsContainWildCards(JNIEnv* km_env, jclass km_clazz, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDoesDbcsContainWildCards");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)name;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlDoesNameContainWildCards(JNIEnv* km_env, jclass km_clazz, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDoesNameContainWildCards");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)name;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForRead(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong startingbyte, jlong length, jint key, jlong fileobject, jlong processid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastCheckLockForRead");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)startingbyte, (void*)(uintptr_t)length, (uint32_t)key, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)processid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)startingbyte;
    (void)length;
    (void)key;
    (void)fileobject;
    (void)processid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFastCheckLockForWrite(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong startingbyte, jlong length, jint key, jlong fileobject, jlong processid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastCheckLockForWrite");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)startingbyte, (void*)(uintptr_t)length, (uint32_t)key, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)processid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)startingbyte;
    (void)length;
    (void)key;
    (void)fileobject;
    (void)processid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAll(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong fileobject, jlong processid, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastUnlockAll");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)fileobject, (int64_t)processid, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filelock;
    (void)fileobject;
    (void)processid;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockAllByKey(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong fileobject, jlong processid, jint key, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastUnlockAllByKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)fileobject, (int64_t)processid, (uint32_t)key, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filelock;
    (void)fileobject;
    (void)processid;
    (void)key;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFastUnlockSingle(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong fileobject, jlong fileoffset, jlong length, jlong processid, jint key, jlong context, jboolean alreadysynchronized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastUnlockSingle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)length, (int64_t)processid, (uint32_t)key, (void*)(uintptr_t)context, (bool)alreadysynchronized);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filelock;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)processid;
    (void)key;
    (void)context;
    (void)alreadysynchronized;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFindExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecplist, jlong ecptype, jlong ecpcontext, jlong ecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFindExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)ecpcontext, (void*)(uintptr_t)ecpcontextsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey, jlong name, jlong shortname, jlong longname, jlong datalength, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFindInTunnelCache");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey, (void*)(uintptr_t)name, (void*)(uintptr_t)shortname, (void*)(uintptr_t)longname, (void*)(uintptr_t)datalength, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)cache;
    (void)directorykey;
    (void)name;
    (void)shortname;
    (void)longname;
    (void)datalength;
    (void)data;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFindInTunnelCacheEx(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey, jlong name, jlong shortname, jlong longname, jint flags, jlong datalength, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFindInTunnelCacheEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey, (void*)(uintptr_t)name, (void*)(uintptr_t)shortname, (void*)(uintptr_t)longname, (uint32_t)flags, (void*)(uintptr_t)datalength, (void*)(uintptr_t)data);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)cache;
    (void)directorykey;
    (void)name;
    (void)shortname;
    (void)longname;
    (void)flags;
    (void)datalength;
    (void)data;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFreeAePushLock(JNIEnv* km_env, jclass km_clazz, jlong aepushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeAePushLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)aepushlock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)aepushlock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeExtraCreateParameter");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFreeExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeExtraCreateParameterList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ecplist;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlFreeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeFileLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filelock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetCurrentProcessLoaderList(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetCurrentProcessLoaderList");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetEcpListFromIrp(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetEcpListFromIrp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)irp;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetFileSize(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetFileSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)filesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetNextBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint runindex, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextBaseMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)runindex, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetNextExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecplist, jlong currentecpcontext, jlong nextecptype, jlong nextecpcontext, jlong nextecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ecplist, (void*)(uintptr_t)currentecpcontext, (void*)(uintptr_t)nextecptype, (void*)(uintptr_t)nextecpcontext, (void*)(uintptr_t)nextecpcontextsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ecplist;
    (void)currentecpcontext;
    (void)nextecptype;
    (void)nextecpcontext;
    (void)nextecpcontextsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetNextFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jboolean restart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextFileLock");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (bool)restart);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)filelock;
    (void)restart;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetNextLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint runindex, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextLargeMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)runindex, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetNextMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint runindex, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)runindex, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetSectorSizeInformation(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jlong sectorsizeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetSectorSizeInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject, (void*)(uintptr_t)sectorsizeinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceobject;
    (void)sectorsizeinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetSupportedFeatures(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jlong supportedfeatures) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetSupportedFeatures");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject, (void*)(uintptr_t)supportedfeatures);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceobject;
    (void)supportedfeatures;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlGetVirtualDiskNestingLevel(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jlong nestinglevel, jlong nestingflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetVirtualDiskNestingLevel");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject, (void*)(uintptr_t)nestinglevel, (void*)(uintptr_t)nestingflags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceobject;
    (void)nestinglevel;
    (void)nestingflags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastMdlReadWait(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastMdlReadWait");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNoWait(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadNoWait");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadNotPossible(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadNotPossible");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadResourceMiss(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadResourceMiss");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIncrementCcFastReadWait(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadWait");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitExtraCreateParameterLookasideList(JNIEnv* km_env, jclass km_clazz, jlong lookaside, jint flags, jlong size, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitExtraCreateParameterLookasideList");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)lookaside, (uint32_t)flags, (uint64_t)size, (uint32_t)tag);
    } else {
        errno = ENOSYS;
    }
#else
    (void)lookaside;
    (void)flags;
    (void)size;
    (void)tag;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint pooltype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeBaseMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb, (int32_t)pooltype);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    (void)pooltype;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitializeBaseMcbEx(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint pooltype, jshort flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeBaseMcbEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (int32_t)pooltype, (uint16_t)flags);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)pooltype;
    (void)flags;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecp, jint ecpflags, jlong cleanupcallback, jint totalsize, jlong ecptype, jlong listallocatedfrom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeExtraCreateParameter");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ecp, (uint32_t)ecpflags, (void*)(uintptr_t)cleanupcallback, (uint32_t)totalsize, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)listallocatedfrom);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ecp;
    (void)ecpflags;
    (void)cleanupcallback;
    (void)totalsize;
    (void)ecptype;
    (void)listallocatedfrom;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitializeExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeExtraCreateParameterList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitializeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong completelockirproutine, jlong unlockroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeFileLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)completelockirproutine, (void*)(uintptr_t)unlockroutine);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filelock;
    (void)completelockirproutine;
    (void)unlockroutine;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitializeLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint pooltype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeLargeMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb, (int32_t)pooltype);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    (void)pooltype;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitializeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint pooltype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb, (int32_t)pooltype);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    (void)pooltype;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitializeOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeOplock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)oplock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInitializeTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeTunnelCache");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)cache);
    } else {
        errno = ENOSYS;
    }
#else
    (void)cache;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInsertExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecplist, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ecplist;
    (void)ecpcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileContext(JNIEnv* km_env, jclass km_clazz, jlong perfilecontextpointer, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertPerFileContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)perfilecontextpointer, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)perfilecontextpointer;
    (void)ptr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInsertPerFileObjectContext(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertPerFileObjectContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)ptr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlInsertPerStreamContext(JNIEnv* km_env, jclass km_clazz, jlong perstreamcontext, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertPerStreamContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)perstreamcontext, (void*)(uintptr_t)ptr);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)perstreamcontext;
    (void)ptr;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIs32BitProcess(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIs32BitProcess");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)process);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)process;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsDaxVolume(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsDaxVolume");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsDbcsInExpression(JNIEnv* km_env, jclass km_clazz, jlong expression, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsDbcsInExpression");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)expression, (void*)(uintptr_t)name);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)expression;
    (void)name;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsEcpAcknowledged(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsEcpAcknowledged");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)ecpcontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsEcpFromUserMode(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsEcpFromUserMode");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)ecpcontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsExtentDangling(JNIEnv* km_env, jclass km_clazz, jint startpage, jint numberofpages, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsExtentDangling");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)startpage, (uint32_t)numberofpages, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)startpage;
    (void)numberofpages;
    (void)flags;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsMobileOS(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsMobileOS");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsNameInExpression(JNIEnv* km_env, jclass km_clazz, jlong expression, jlong name, jboolean ignorecase, jlong upcasetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNameInExpression");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)expression, (void*)(uintptr_t)name, (bool)ignorecase, (void*)(uintptr_t)upcasetable);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)expression;
    (void)name;
    (void)ignorecase;
    (void)upcasetable;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsNameInUnUpcasedExpression(JNIEnv* km_env, jclass km_clazz, jlong expression, jlong name, jboolean ignorecase, jlong upcasetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNameInUnUpcasedExpression");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)expression, (void*)(uintptr_t)name, (bool)ignorecase, (void*)(uintptr_t)upcasetable);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)expression;
    (void)name;
    (void)ignorecase;
    (void)upcasetable;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsNonEmptyDirectoryReparsePointAllowed(JNIEnv* km_env, jclass km_clazz, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNonEmptyDirectoryReparsePointAllowed");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)reparsetag);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)reparsetag;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsNtstatusExpected(JNIEnv* km_env, jclass km_clazz, jint exception) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNtstatusExpected");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)exception);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)exception;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsPagingFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsPagingFile");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIsSystemPagingFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsSystemPagingFile");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlIssueDeviceIoControl(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jint ioctl, jbyte flags, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength, jlong iosbinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIssueDeviceIoControl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject, (uint32_t)ioctl, (uint8_t)flags, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength, (void*)(uintptr_t)iosbinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceobject;
    (void)ioctl;
    (void)flags;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)iosbinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlKernelFsControlFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fscontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength, jlong retoutputbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlKernelFsControlFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)fscontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength, (void*)(uintptr_t)retoutputbuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)retoutputbuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLogCcFlushError(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong deviceobject, jlong sectionobjectpointer, jint flusherror, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLogCcFlushError");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)sectionobjectpointer, (int32_t)flusherror, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filename;
    (void)deviceobject;
    (void)sectionobjectpointer;
    (void)flusherror;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcountfromlbn, jlong startinglbn, jlong sectorcountfromstartinglbn, jlong arg6Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupBaseMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcountfromlbn, (void*)(uintptr_t)startinglbn, (void*)(uintptr_t)sectorcountfromstartinglbn, (void*)(uintptr_t)arg6Index);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcountfromlbn;
    (void)startinglbn;
    (void)sectorcountfromstartinglbn;
    (void)arg6Index;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcountfromlbn, jlong startinglbn, jlong sectorcountfromstartinglbn, jlong arg6Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLargeMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcountfromlbn, (void*)(uintptr_t)startinglbn, (void*)(uintptr_t)sectorcountfromstartinglbn, (void*)(uintptr_t)arg6Index);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcountfromlbn;
    (void)startinglbn;
    (void)sectorcountfromstartinglbn;
    (void)arg6Index;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastBaseMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupLastBaseMcbEntryAndIndex(JNIEnv* km_env, jclass km_clazz, jlong opaquemcb, jlong largevbn, jlong largelbn, jlong arg3Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastBaseMcbEntryAndIndex");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)opaquemcb, (void*)(uintptr_t)largevbn, (void*)(uintptr_t)largelbn, (void*)(uintptr_t)arg3Index);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)opaquemcb;
    (void)largevbn;
    (void)largelbn;
    (void)arg3Index;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastLargeMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupLastLargeMcbEntryAndIndex(JNIEnv* km_env, jclass km_clazz, jlong opaquemcb, jlong largevbn, jlong largelbn, jlong arg3Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastLargeMcbEntryAndIndex");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)opaquemcb, (void*)(uintptr_t)largevbn, (void*)(uintptr_t)largelbn, (void*)(uintptr_t)arg3Index);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)opaquemcb;
    (void)largevbn;
    (void)largelbn;
    (void)arg3Index;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupLastMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint vbn, jlong lbn, jlong sectorcount, jlong arg4Index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcount, (void*)(uintptr_t)arg4Index);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    (void)arg4Index;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileContext(JNIEnv* km_env, jclass km_clazz, jlong perfilecontextpointer, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupPerFileContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)perfilecontextpointer, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)perfilecontextpointer;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupPerFileObjectContext(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupPerFileObjectContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)fileobject;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlLookupPerStreamContextInternal(JNIEnv* km_env, jclass km_clazz, jlong streamcontext, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupPerStreamContextInternal");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)streamcontext, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)streamcontext;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlMdlReadCompleteDev(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong mdlchain, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlReadCompleteDev");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)mdlchain;
    (void)deviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlMdlReadDev(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlReadDev");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    (void)deviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlMdlReadEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlReadEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlMdlWriteCompleteDev(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jlong mdlchain, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlWriteCompleteDev");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    (void)deviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderIdFromName(JNIEnv* km_env, jclass km_clazz, jlong pprovidername, jlong pproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMupGetProviderIdFromName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pprovidername, (void*)(uintptr_t)pproviderid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pprovidername;
    (void)pproviderid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlMupGetProviderInfoFromFileObject(JNIEnv* km_env, jclass km_clazz, jlong pfileobject, jint level, jlong pbuffer, jlong pbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMupGetProviderInfoFromFileObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)pfileobject, (uint32_t)level, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pbuffersize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)pfileobject;
    (void)level;
    (void)pbuffer;
    (void)pbuffersize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNormalizeNtstatus(JNIEnv* km_env, jclass km_clazz, jint exception, jint genericexception) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNormalizeNtstatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)exception, (int32_t)genericexception);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)exception;
    (void)genericexception;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanup(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fscontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyCleanup");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fscontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyCleanupAll(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyCleanupAll");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notifysync;
    (void)notifylist;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterChangeDirectory(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fscontext, jlong fulldirectoryname, jboolean watchtree, jboolean ignorebuffer, jint completionfilter, jlong notifyirp, jlong traversecallback, jlong subjectcontext, jlong filtercallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, void*, bool, bool, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFilterChangeDirectory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fscontext, (void*)(uintptr_t)fulldirectoryname, (bool)watchtree, (bool)ignorebuffer, (uint32_t)completionfilter, (void*)(uintptr_t)notifyirp, (void*)(uintptr_t)traversecallback, (void*)(uintptr_t)subjectcontext, (void*)(uintptr_t)filtercallback);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
    (void)fulldirectoryname;
    (void)watchtree;
    (void)ignorebuffer;
    (void)completionfilter;
    (void)notifyirp;
    (void)traversecallback;
    (void)subjectcontext;
    (void)filtercallback;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyFilterReportChange(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fulltargetname, jshort targetnameoffset, jlong streamname, jlong normalizedparentname, jint filtermatch, jint action, jlong targetcontext, jlong filtercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFilterReportChange");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fulltargetname, (uint16_t)targetnameoffset, (void*)(uintptr_t)streamname, (void*)(uintptr_t)normalizedparentname, (uint32_t)filtermatch, (uint32_t)action, (void*)(uintptr_t)targetcontext, (void*)(uintptr_t)filtercontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notifysync;
    (void)notifylist;
    (void)fulltargetname;
    (void)targetnameoffset;
    (void)streamname;
    (void)normalizedparentname;
    (void)filtermatch;
    (void)action;
    (void)targetcontext;
    (void)filtercontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullChangeDirectory(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fscontext, jlong fulldirectoryname, jboolean watchtree, jboolean ignorebuffer, jint completionfilter, jlong notifyirp, jlong traversecallback, jlong subjectcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, void*, bool, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFullChangeDirectory");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fscontext, (void*)(uintptr_t)fulldirectoryname, (bool)watchtree, (bool)ignorebuffer, (uint32_t)completionfilter, (void*)(uintptr_t)notifyirp, (void*)(uintptr_t)traversecallback, (void*)(uintptr_t)subjectcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
    (void)fulldirectoryname;
    (void)watchtree;
    (void)ignorebuffer;
    (void)completionfilter;
    (void)notifyirp;
    (void)traversecallback;
    (void)subjectcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyFullReportChange(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fulltargetname, jshort targetnameoffset, jlong streamname, jlong normalizedparentname, jint filtermatch, jint action, jlong targetcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFullReportChange");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fulltargetname, (uint16_t)targetnameoffset, (void*)(uintptr_t)streamname, (void*)(uintptr_t)normalizedparentname, (uint32_t)filtermatch, (uint32_t)action, (void*)(uintptr_t)targetcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notifysync;
    (void)notifylist;
    (void)fulltargetname;
    (void)targetnameoffset;
    (void)streamname;
    (void)normalizedparentname;
    (void)filtermatch;
    (void)action;
    (void)targetcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyInitializeSync(JNIEnv* km_env, jclass km_clazz, jlong notifysync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyInitializeSync");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)notifysync);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notifysync;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyUninitializeSync(JNIEnv* km_env, jclass km_clazz, jlong notifysync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyUninitializeSync");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)notifysync);
    } else {
        errno = ENOSYS;
    }
#else
    (void)notifysync;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEvent(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint eventcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyVolumeEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)eventcode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)eventcode;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNotifyVolumeEventEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint eventcode, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyVolumeEventEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)eventcode, (void*)(uintptr_t)event);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)eventcode;
    (void)event;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInBaseMcb");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mcb;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInLargeMcb");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mcb;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlNumberOfRunsInMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInMcb");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mcb;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakH");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakH2(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jlong context, jlong completionroutine, jlong postirproutine, jlong grantedaccess, jlong shareaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakH2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)shareaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    (void)grantedaccess;
    (void)shareaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNone(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irpsp, jlong irp, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakToNone");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irpsp, (void*)(uintptr_t)irp, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irpsp;
    (void)irp;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockBreakToNoneEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakToNoneEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrl(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint opencount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockFsctrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)opencount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockFsctrlEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint opencount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockFsctrlEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)opencount, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockGetAnyBreakOwnerProcess(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockGetAnyBreakOwnerProcess");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockIsFastIoPossible(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockIsFastIoPossible");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)oplock;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockIsSharedRequest(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockIsSharedRequest");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)irp;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlOplockKeysEqual(JNIEnv* km_env, jclass km_clazz, jlong fo1, jlong fo2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockKeysEqual");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fo1, (void*)(uintptr_t)fo2);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fo1;
    (void)fo2;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlPostPagingFileStackOverflow(JNIEnv* km_env, jclass km_clazz, jlong context, jlong event, jlong stackoverflowroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPostPagingFileStackOverflow");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)event, (void*)(uintptr_t)stackoverflowroutine);
    } else {
        errno = ENOSYS;
    }
#else
    (void)context;
    (void)event;
    (void)stackoverflowroutine;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlPostStackOverflow(JNIEnv* km_env, jclass km_clazz, jlong context, jlong event, jlong stackoverflowroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPostStackOverflow");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)event, (void*)(uintptr_t)stackoverflowroutine);
    } else {
        errno = ENOSYS;
    }
#else
    (void)context;
    (void)event;
    (void)stackoverflowroutine;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteDev(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrepareMdlWriteDev");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    (void)deviceobject;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlPrepareMdlWriteEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrepareMdlWriteEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlPrepareToReuseEcp(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrepareToReuseEcp");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)ecpcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)ecpcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlPrivateLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong fileobject, jlong fileoffset, jlong length, jlong processid, jint key, jboolean failimmediately, jboolean exclusivelock, jlong iosb, jlong irp, jlong context, jboolean alreadysynchronized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, bool, bool, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrivateLock");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)length, (int64_t)processid, (uint32_t)key, (bool)failimmediately, (bool)exclusivelock, (void*)(uintptr_t)iosb, (void*)(uintptr_t)irp, (void*)(uintptr_t)context, (bool)alreadysynchronized);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)filelock;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)processid;
    (void)key;
    (void)failimmediately;
    (void)exclusivelock;
    (void)iosb;
    (void)irp;
    (void)context;
    (void)alreadysynchronized;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlProcessFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong irp, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlProcessFileLock");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)irp, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filelock;
    (void)irp;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlQueryCachedVdl(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong vdl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryCachedVdl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)vdl);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)vdl;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlQueryInformationFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass, jlong retfileinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (void*)(uintptr_t)retfileinformationsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)retfileinformationsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlQueryKernelEaFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong returnedeadata, jint length, jboolean returnsingleentry, jlong ealist, jint ealistlength, jlong eaindex, jboolean restartscan, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryKernelEaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)returnedeadata, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)ealist, (uint32_t)ealistlength, (void*)(uintptr_t)eaindex, (bool)restartscan, (void*)(uintptr_t)lengthreturned);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)returnedeadata;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    (void)lengthreturned;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlQueryMaximumVirtualDiskNestingLevel(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryMaximumVirtualDiskNestingLevel");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRegisterFileSystemFilterCallbacks(JNIEnv* km_env, jclass km_clazz, jlong filterdriverobject, jlong callbacks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterFileSystemFilterCallbacks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filterdriverobject, (void*)(uintptr_t)callbacks);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filterdriverobject;
    (void)callbacks;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProvider(JNIEnv* km_env, jclass km_clazz, jlong muphandle, jlong redirectordevicename, jboolean mailslotssupported) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterUncProvider");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)muphandle, (void*)(uintptr_t)redirectordevicename, (bool)mailslotssupported);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)muphandle;
    (void)redirectordevicename;
    (void)mailslotssupported;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx(JNIEnv* km_env, jclass km_clazz, jlong muphandle, jlong redirdevname, jlong deviceobject, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterUncProviderEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)muphandle, (void*)(uintptr_t)redirdevname, (void*)(uintptr_t)deviceobject, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)muphandle;
    (void)redirdevname;
    (void)deviceobject;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRegisterUncProviderEx2(JNIEnv* km_env, jclass km_clazz, jlong redirdevname, jlong deviceobject, jlong registration, jlong muphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterUncProviderEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)redirdevname, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)registration, (void*)(uintptr_t)muphandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)redirdevname;
    (void)deviceobject;
    (void)registration;
    (void)muphandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlReleaseFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlReleaseFile");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRemoveBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveBaseMcbEntry");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)sectorcount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRemoveDotsFromPath(JNIEnv* km_env, jclass km_clazz, jlong originalstring, jshort pathlength, jlong newlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveDotsFromPath");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)originalstring, (uint16_t)pathlength, (void*)(uintptr_t)newlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)originalstring;
    (void)pathlength;
    (void)newlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRemoveExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecplist, jlong ecptype, jlong ecpcontext, jlong ecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveExtraCreateParameter");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)ecpcontext, (void*)(uintptr_t)ecpcontextsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRemoveLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveLargeMcbEntry");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)sectorcount);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRemoveMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint vbn, jint sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveMcbEntry");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)vbn, (uint32_t)sectorcount);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileContext(JNIEnv* km_env, jclass km_clazz, jlong perfilecontextpointer, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemovePerFileContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)perfilecontextpointer, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)perfilecontextpointer;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRemovePerFileObjectContext(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemovePerFileObjectContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)fileobject;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlRemovePerStreamContext(JNIEnv* km_env, jclass km_clazz, jlong streamcontext, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemovePerStreamContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)streamcontext, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)streamcontext;
    (void)ownerid;
    (void)instanceid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlResetBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlResetBaseMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlResetLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jboolean selfsynchronized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlResetLargeMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb, (bool)selfsynchronized);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    (void)selfsynchronized;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlSetDriverBacking(JNIEnv* km_env, jclass km_clazz, jlong driverobj, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSetDriverBacking");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)driverobj, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)driverobj;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlSetEcpListIntoIrp(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSetEcpListIntoIrp");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)ecplist);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)irp;
    (void)ecplist;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlSetKernelEaFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong eabuffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSetKernelEaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)eabuffer, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)eabuffer;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlSplitBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSplitBaseMcb");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)amount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)amount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlSplitLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSplitLargeMcb");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)amount);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)mcb;
    (void)vbn;
    (void)amount;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerFileContexts(JNIEnv* km_env, jclass km_clazz, jlong perfilecontextpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTeardownPerFileContexts");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)perfilecontextpointer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)perfilecontextpointer;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlTeardownPerStreamContexts(JNIEnv* km_env, jclass km_clazz, jlong advancedheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTeardownPerStreamContexts");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)advancedheader);
    } else {
        errno = ENOSYS;
    }
#else
    (void)advancedheader;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlTruncateBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTruncateBaseMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    (void)vbn;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlTruncateLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTruncateLargeMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    (void)vbn;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlTruncateMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint vbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTruncateMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)vbn);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    (void)vbn;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlUninitializeBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeBaseMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlUninitializeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeFileLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filelock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filelock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlUninitializeLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeLargeMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlUninitializeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeMcb");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mcb);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mcb;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlUninitializeOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeOplock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)oplock);
    } else {
        errno = ENOSYS;
    }
#else
    (void)oplock;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlUpdateDiskCounters(JNIEnv* km_env, jclass km_clazz, jlong bytesread, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUpdateDiskCounters");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint64_t)bytesread, (uint64_t)byteswritten);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bytesread;
    (void)byteswritten;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlUpperOplockFsctrl(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint opencount, jint loweroplockstate, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUpperOplockFsctrl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)opencount, (uint32_t)loweroplockstate, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    (void)loweroplockstate;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlValidateReparsePointBuffer(JNIEnv* km_env, jclass km_clazz, jint bufferlength, jlong reparsebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlValidateReparsePointBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)bufferlength, (void*)(uintptr_t)reparsebuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bufferlength;
    (void)reparsebuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemFsRtlVolumeDeviceToCorrelationId(JNIEnv* km_env, jclass km_clazz, jlong volumedeviceobject, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlVolumeDeviceToCorrelationId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)volumedeviceobject, (void*)(uintptr_t)guid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volumedeviceobject;
    (void)guid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemGetSecurityUserInfo(JNIEnv* km_env, jclass km_clazz, jlong logonid, jint flags, jlong userinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityUserInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)logonid, (uint32_t)flags, (void*)(uintptr_t)userinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)logonid;
    (void)flags;
    (void)userinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoAcquireVpbSpinLock(JNIEnv* km_env, jclass km_clazz, jlong irql) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAcquireVpbSpinLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)irql);
    } else {
        errno = ENOSYS;
    }
#else
    (void)irql;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoApplyPriorityInfoThread(JNIEnv* km_env, jclass km_clazz, jlong inputpriorityinfo, jlong outputpriorityinfo, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoApplyPriorityInfoThread");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)inputpriorityinfo, (void*)(uintptr_t)outputpriorityinfo, (int64_t)thread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)inputpriorityinfo;
    (void)outputpriorityinfo;
    (void)thread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCheckDesiredAccess(JNIEnv* km_env, jclass km_clazz, jlong desiredaccess, jint grantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckDesiredAccess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)desiredaccess, (uint32_t)grantedaccess);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)desiredaccess;
    (void)grantedaccess;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCheckEaBufferValidity(JNIEnv* km_env, jclass km_clazz, jlong eabuffer, jint ealength, jlong erroroffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckEaBufferValidity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)eabuffer, (uint32_t)ealength, (void*)(uintptr_t)erroroffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)eabuffer;
    (void)ealength;
    (void)erroroffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCheckFunctionAccess(JNIEnv* km_env, jclass km_clazz, jint grantedaccess, jbyte majorfunction, jbyte minorfunction, jint iocontrolcode, jlong arg1, jlong arg2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckFunctionAccess");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)grantedaccess, (uint8_t)majorfunction, (uint8_t)minorfunction, (uint32_t)iocontrolcode, (void*)(uintptr_t)arg1, (void*)(uintptr_t)arg2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)grantedaccess;
    (void)majorfunction;
    (void)minorfunction;
    (void)iocontrolcode;
    (void)arg1;
    (void)arg2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCheckQuerySetFileInformation(JNIEnv* km_env, jclass km_clazz, jint fileinformationclass, jint length, jboolean setoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckQuerySetFileInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fileinformationclass, (uint32_t)length, (bool)setoperation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileinformationclass;
    (void)length;
    (void)setoperation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCheckQuerySetVolumeInformation(JNIEnv* km_env, jclass km_clazz, jint fsinformationclass, jint length, jboolean setoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckQuerySetVolumeInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)fsinformationclass, (uint32_t)length, (bool)setoperation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fsinformationclass;
    (void)length;
    (void)setoperation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCheckQuotaBufferValidity(JNIEnv* km_env, jclass km_clazz, jlong quotabuffer, jint quotalength, jlong erroroffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckQuotaBufferValidity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)quotabuffer, (uint32_t)quotalength, (void*)(uintptr_t)erroroffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)quotabuffer;
    (void)quotalength;
    (void)erroroffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoClearFsTrackOffsetState(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoClearFsTrackOffsetState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)irp;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObject(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObject");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)fileobject;
    (void)deviceobject;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong deviceobject, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObjectEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)fileobject;
    (void)deviceobject;
    (void)filehandle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectEx2(JNIEnv* km_env, jclass km_clazz, jlong createoptions, jlong fileobject, jlong deviceobject, jlong streamfileobject, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObjectEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)createoptions, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)streamfileobject, (void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)createoptions;
    (void)fileobject;
    (void)deviceobject;
    (void)streamfileobject;
    (void)filehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoCreateStreamFileObjectLite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObjectLite");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)fileobject;
    (void)deviceobject;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoEnumerateDeviceObjectList(JNIEnv* km_env, jclass km_clazz, jlong driverobject, jlong deviceobjectlist, jint deviceobjectlistsize, jlong actualnumberdeviceobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoEnumerateDeviceObjectList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)driverobject, (void*)(uintptr_t)deviceobjectlist, (uint32_t)deviceobjectlistsize, (void*)(uintptr_t)actualnumberdeviceobjects);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)driverobject;
    (void)deviceobjectlist;
    (void)deviceobjectlistsize;
    (void)actualnumberdeviceobjects;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoEnumerateRegisteredFiltersList(JNIEnv* km_env, jclass km_clazz, jlong driverobjectlist, jint driverobjectlistsize, jlong actualnumberdriverobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoEnumerateRegisteredFiltersList");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)driverobjectlist, (uint32_t)driverobjectlistsize, (void*)(uintptr_t)actualnumberdriverobjects);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)driverobjectlist;
    (void)driverobjectlistsize;
    (void)actualnumberdriverobjects;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoFastQueryNetworkAttributes(JNIEnv* km_env, jclass km_clazz, jlong objectattributes, jint desiredaccess, jint openoptions, jlong iostatus, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFastQueryNetworkAttributes");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objectattributes, (uint32_t)desiredaccess, (uint32_t)openoptions, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)objectattributes;
    (void)desiredaccess;
    (void)openoptions;
    (void)iostatus;
    (void)buffer;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetAttachedDevice(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetAttachedDevice");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceobject;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetBaseFileSystemDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetBaseFileSystemDeviceObject");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetDeviceAttachmentBaseRef(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceAttachmentBaseRef");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceobject;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetDeviceToVerify(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceToVerify");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)thread;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetDiskDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong filesystemdeviceobject, jlong diskdeviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDiskDeviceObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filesystemdeviceobject, (void*)(uintptr_t)diskdeviceobject);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filesystemdeviceobject;
    (void)diskdeviceobject;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetFsTrackOffsetState(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong retfstrackoffsetblob, jlong rettrackedoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetFsTrackOffsetState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)retfstrackoffsetblob, (void*)(uintptr_t)rettrackedoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)irp;
    (void)retfstrackoffsetblob;
    (void)rettrackedoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetLowerDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetLowerDeviceObject");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)deviceobject;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContext(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetOplockKeyContext");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetOplockKeyContextEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetOplockKeyContextEx");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)fileobject;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetRequestorProcess(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRequestorProcess");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)irp;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetRequestorProcessId(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRequestorProcessId");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)irp;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoGetRequestorSessionId(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong psessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRequestorSessionId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)psessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)irp;
    (void)psessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoIrpHasFsTrackOffsetExtensionType(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIrpHasFsTrackOffsetExtensionType");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)irp;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoIsOperationSynchronous(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsOperationSynchronous");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)irp;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoIsSystemThread(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsSystemThread");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)thread;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoIsValidNameGraftingBuffer(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong reparsebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsValidNameGraftingBuffer");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)reparsebuffer);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)irp;
    (void)reparsebuffer;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoPageRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong memorydescriptorlist, jlong startingoffset, jlong event, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoPageRead");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)memorydescriptorlist, (void*)(uintptr_t)startingoffset, (void*)(uintptr_t)event, (void*)(uintptr_t)iostatusblock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)memorydescriptorlist;
    (void)startingoffset;
    (void)event;
    (void)iostatusblock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoQueryFileDosDeviceName(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong objectnameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryFileDosDeviceName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)objectnameinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)objectnameinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoQueryFileInformation(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fileinformationclass, jint length, jlong fileinformation, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryFileInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (int32_t)fileinformationclass, (uint32_t)length, (void*)(uintptr_t)fileinformation, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)fileinformationclass;
    (void)length;
    (void)fileinformation;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoQueryVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fsinformationclass, jint length, jlong fsinformation, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryVolumeInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (int32_t)fsinformationclass, (uint32_t)length, (void*)(uintptr_t)fsinformation, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)fsinformationclass;
    (void)length;
    (void)fsinformation;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoQueueThreadIrp(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueueThreadIrp");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)irp);
    } else {
        errno = ENOSYS;
    }
#else
    (void)irp;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoRegisterFileSystem(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRegisterFileSystem");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoReleaseVpbSpinLock(JNIEnv* km_env, jclass km_clazz, jbyte irql) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReleaseVpbSpinLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint8_t)irql);
    } else {
        errno = ENOSYS;
    }
#else
    (void)irql;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoReplaceFileObjectName(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong newfilename, jshort filenamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReplaceFileObjectName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)newfilename, (uint16_t)filenamelength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)newfilename;
    (void)filenamelength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoRequestDeviceRemovalForReset(JNIEnv* km_env, jclass km_clazz, jlong physicaldeviceobject, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRequestDeviceRemovalForReset");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)physicaldeviceobject, (uint32_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)physicaldeviceobject;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoRetrievePriorityInfo(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong fileobject, jlong thread, jlong priorityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRetrievePriorityInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)fileobject, (int64_t)thread, (void*)(uintptr_t)priorityinfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)irp;
    (void)fileobject;
    (void)thread;
    (void)priorityinfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoSetDeviceToVerify(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetDeviceToVerify");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)thread, (void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)thread;
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoSetFsTrackOffsetState(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong fstrackoffsetblob, jlong trackedoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetFsTrackOffsetState");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)fstrackoffsetblob, (int64_t)trackedoffset);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)irp;
    (void)fstrackoffsetblob;
    (void)trackedoffset;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoSetInformation(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fileinformationclass, jint length, jlong fileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (int32_t)fileinformationclass, (uint32_t)length, (void*)(uintptr_t)fileinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)fileinformationclass;
    (void)length;
    (void)fileinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoSynchronousPageWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong memorydescriptorlist, jlong startingoffset, jlong event, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSynchronousPageWrite");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)memorydescriptorlist, (void*)(uintptr_t)startingoffset, (void*)(uintptr_t)event, (void*)(uintptr_t)iostatusblock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fileobject;
    (void)memorydescriptorlist;
    (void)startingoffset;
    (void)event;
    (void)iostatusblock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoThreadToProcess(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoThreadToProcess");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoUnregisterFileSystem(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUnregisterFileSystem");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)deviceobject);
    } else {
        errno = ENOSYS;
    }
#else
    (void)deviceobject;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemIoVerifyVolume(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jboolean allowrawmount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoVerifyVolume");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)deviceobject, (bool)allowrawmount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)deviceobject;
    (void)allowrawmount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeAcquireQueuedSpinLock(JNIEnv* km_env, jclass km_clazz, jint number) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireQueuedSpinLock");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)number);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)number;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeAcquireSpinLockRaiseToSynch(JNIEnv* km_env, jclass km_clazz, jlong spinlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireSpinLockRaiseToSynch");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)spinlock);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)spinlock;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeAttachProcess(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAttachProcess");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)process);
    } else {
        errno = ENOSYS;
    }
#else
    (void)process;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeDetachProcess(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeDetachProcess");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeInitializeMutant(JNIEnv* km_env, jclass km_clazz, jlong mutant, jboolean initialowner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeMutant");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)mutant, (bool)initialowner);
    } else {
        errno = ENOSYS;
    }
#else
    (void)mutant;
    (void)initialowner;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeInitializeQueue(JNIEnv* km_env, jclass km_clazz, jlong queue, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeQueue");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)queue, (uint32_t)count);
    } else {
        errno = ENOSYS;
    }
#else
    (void)queue;
    (void)count;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeInsertHeadQueue(JNIEnv* km_env, jclass km_clazz, jlong queue, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInsertHeadQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queue, (void*)(uintptr_t)entry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queue;
    (void)entry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeInsertQueue(JNIEnv* km_env, jclass km_clazz, jlong queue, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInsertQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queue, (void*)(uintptr_t)entry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queue;
    (void)entry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeReadStateMutant(JNIEnv* km_env, jclass km_clazz, jlong mutant) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateMutant");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mutant);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mutant;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeReadStateQueue(JNIEnv* km_env, jclass km_clazz, jlong queue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateQueue");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)queue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeReleaseMutant(JNIEnv* km_env, jclass km_clazz, jlong mutant, jint increment, jboolean abandoned, jboolean wait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseMutant");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mutant, (int32_t)increment, (bool)abandoned, (bool)wait);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mutant;
    (void)increment;
    (void)abandoned;
    (void)wait;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeReleaseQueuedSpinLock(JNIEnv* km_env, jclass km_clazz, jint number, jbyte oldirql) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseQueuedSpinLock");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int32_t)number, (uint8_t)oldirql);
    } else {
        errno = ENOSYS;
    }
#else
    (void)number;
    (void)oldirql;
    errno = ENOSYS;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeRemoveQueue(JNIEnv* km_env, jclass km_clazz, jlong queue, jbyte waitmode, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveQueue");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queue, (int8_t)waitmode, (void*)(uintptr_t)timeout);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)queue;
    (void)waitmode;
    (void)timeout;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeRemoveQueueEx(JNIEnv* km_env, jclass km_clazz, jlong queue, jbyte waitmode, jboolean alertable, jlong timeout, jlong entryarray, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int8_t, bool, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveQueueEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queue, (int8_t)waitmode, (bool)alertable, (void*)(uintptr_t)timeout, (void*)(uintptr_t)entryarray, (uint32_t)count);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)queue;
    (void)waitmode;
    (void)alertable;
    (void)timeout;
    (void)entryarray;
    (void)count;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeRundownQueue(JNIEnv* km_env, jclass km_clazz, jlong queue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRundownQueue");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)queue);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)queue;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeSetIdealProcessorThread(JNIEnv* km_env, jclass km_clazz, jlong thread, jbyte processor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetIdealProcessorThread");
    }
    uint8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread, (uint8_t)processor);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)thread;
    (void)processor;
    errno = ENOSYS;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeSetKernelStackSwapEnable(JNIEnv* km_env, jclass km_clazz, jboolean enable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetKernelStackSwapEnable");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)enable);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)enable;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeStackAttachProcess(JNIEnv* km_env, jclass km_clazz, jlong process, jlong apcstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeStackAttachProcess");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)process, (void*)(uintptr_t)apcstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)process;
    (void)apcstate;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeTryToAcquireQueuedSpinLock(JNIEnv* km_env, jclass km_clazz, jint number, jlong oldirql) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeTryToAcquireQueuedSpinLock");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)number, (void*)(uintptr_t)oldirql);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)number;
    (void)oldirql;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemKeUnstackDetachProcess(JNIEnv* km_env, jclass km_clazz, jlong apcstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeUnstackDetachProcess");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)apcstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)apcstate;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMakeSignature(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fqop, jlong pmessage, jint messageseqno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fqop, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMapSecurityError(JNIEnv* km_env, jclass km_clazz, jint secstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapSecurityError");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)secstatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)secstatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmCanFileBeTruncated(JNIEnv* km_env, jclass km_clazz, jlong sectionpointer, jlong newfilesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmCanFileBeTruncated");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionpointer, (void*)(uintptr_t)newfilesize);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)sectionpointer;
    (void)newfilesize;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmDoesFileHaveUserWritableReferences(JNIEnv* km_env, jclass km_clazz, jlong sectionpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmDoesFileHaveUserWritableReferences");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionpointer);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sectionpointer;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmFlushImageSection(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jint flushtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmFlushImageSection");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (int32_t)flushtype);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)sectionobjectpointer;
    (void)flushtype;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmForceSectionClosed(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jboolean delayclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmForceSectionClosed");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (bool)delayclose);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)sectionobjectpointer;
    (void)delayclose;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmForceSectionClosedEx(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jint forcecloseflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmForceSectionClosedEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (uint32_t)forcecloseflags);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)sectionobjectpointer;
    (void)forcecloseflags;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmGetMaximumFileSectionSize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetMaximumFileSectionSize");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmIsFileSectionActive(JNIEnv* km_env, jclass km_clazz, jlong fssectionpointer, jint flags, jlong sectionisactive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsFileSectionActive");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)fssectionpointer, (uint32_t)flags, (void*)(uintptr_t)sectionisactive);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fssectionpointer;
    (void)flags;
    (void)sectionisactive;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmIsRecursiveIoFault(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsRecursiveIoFault");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmMdlPagesAreZero(JNIEnv* km_env, jclass km_clazz, jlong mdl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMdlPagesAreZero");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)mdl);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)mdl;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmPrefetchPages(JNIEnv* km_env, jclass km_clazz, jint numberoflists, jlong readlists) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmPrefetchPages");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)numberoflists, (void*)(uintptr_t)readlists);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)numberoflists;
    (void)readlists;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemMmSetAddressRangeModified(JNIEnv* km_env, jclass km_clazz, jlong address, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmSetAddressRangeModified");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)address, (uint64_t)length);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)address;
    (void)length;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtAccessCheckAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jint desiredaccess, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckAndAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckByTypeAndAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckByTypeResultListAndAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtAccessCheckByTypeResultListAndAuditAlarmByHandle(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckByTypeResultListAndAuditAlarmByHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtAdjustGroupsToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jboolean resettodefault, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAdjustGroupsToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (bool)resettodefault, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtAdjustPrivilegesToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jboolean disableallprivileges, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAdjustPrivilegesToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (bool)disableallprivileges, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong zerobits, jlong regionsize, jint allocationtype, jint protect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAllocateVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (uint64_t)zerobits, (void*)(uintptr_t)regionsize, (uint32_t)allocationtype, (uint32_t)protect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)regionsize;
    (void)allocationtype;
    (void)protect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtAllocateVirtualMemoryEx(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jint allocationtype, jint pageprotection, jlong extendedparameters, jint extendedparametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAllocateVirtualMemoryEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (uint32_t)allocationtype, (uint32_t)pageprotection, (void*)(uintptr_t)extendedparameters, (uint32_t)extendedparametercount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)extendedparametercount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtCancelIoFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iorequesttocancel, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCancelIoFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iorequesttocancel, (void*)(uintptr_t)iostatusblock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iorequesttocancel;
    (void)iostatusblock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtCloseObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jboolean generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCloseObjectAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (bool)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtCreateDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateDirectoryObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)directoryhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtCreateEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jint desiredaccess, jlong objectattributes, jint eventtype, jboolean initialstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)eventhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (int32_t)eventtype, (bool)initialstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)eventtype;
    (void)initialstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtCreateFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jlong allocationsize, jint fileattributes, jint shareaccess, jint createdisposition, jint createoptions, jlong eabuffer, jint ealength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)allocationsize, (uint32_t)fileattributes, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (void*)(uintptr_t)eabuffer, (uint32_t)ealength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)allocationsize;
    (void)fileattributes;
    (void)shareaccess;
    (void)createdisposition;
    (void)createoptions;
    (void)eabuffer;
    (void)ealength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtCreateSection(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateSection");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (void*)(uintptr_t)filehandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtCreateSectionEx(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jlong filehandle, jlong extendedparameters, jint extendedparametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateSectionEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)extendedparameters, (uint32_t)extendedparametercount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    (void)extendedparameters;
    (void)extendedparametercount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtDeleteFile(JNIEnv* km_env, jclass km_clazz, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtDeleteObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jboolean generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteObjectAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (bool)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtDuplicateObject(JNIEnv* km_env, jclass km_clazz, jlong sourceprocesshandle, jlong sourcehandle, jlong targetprocesshandle, jlong targethandle, jint desiredaccess, jint handleattributes, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDuplicateObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourceprocesshandle, (void*)(uintptr_t)sourcehandle, (void*)(uintptr_t)targetprocesshandle, (void*)(uintptr_t)targethandle, (uint32_t)desiredaccess, (uint32_t)handleattributes, (uint32_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourceprocesshandle;
    (void)sourcehandle;
    (void)targetprocesshandle;
    (void)targethandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtDuplicateToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint desiredaccess, jlong objectattributes, jboolean effectiveonly, jint tokentype, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDuplicateToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (bool)effectiveonly, (int32_t)tokentype, (void*)(uintptr_t)newtokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)existingtokenhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)effectiveonly;
    (void)tokentype;
    (void)newtokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtFilterToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint flags, jlong sidstodisable, jlong privilegestodelete, jlong restrictedsids, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFilterToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)flags, (void*)(uintptr_t)sidstodisable, (void*)(uintptr_t)privilegestodelete, (void*)(uintptr_t)restrictedsids, (void*)(uintptr_t)newtokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)newtokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtFlushBuffersFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushBuffersFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtFlushBuffersFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint flags, jlong parameters, jint parameterssize, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushBuffersFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)flags, (void*)(uintptr_t)parameters, (uint32_t)parameterssize, (void*)(uintptr_t)iostatusblock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)flags;
    (void)parameters;
    (void)parameterssize;
    (void)iostatusblock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtFlushVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)iostatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtFreeVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jint freetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFreeVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (uint32_t)freetype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)freetype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtFsControlFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint fscontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFsControlFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)fscontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtImpersonateAnonymousToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtImpersonateAnonymousToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtLockFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong byteoffset, jlong length, jint key, jboolean failimmediately, jboolean exclusivelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtLockFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)length, (uint32_t)key, (bool)failimmediately, (bool)exclusivelock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    (void)failimmediately;
    (void)exclusivelock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtNotifyChangeKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint completionfilter, jboolean watchtree, jlong buffer, jint buffersize, jboolean asynchronous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, bool, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtNotifyChangeKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)completionfilter, (bool)watchtree, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (bool)asynchronous);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtOpenDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenDirectoryObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)directoryhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtOpenFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jint shareaccess, jint openoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (uint32_t)shareaccess, (uint32_t)openoptions);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)shareaccess;
    (void)openoptions;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtOpenObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong clienttoken, jint desiredaccess, jint grantedaccess, jlong privileges, jboolean objectcreation, jboolean accessgranted, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, bool, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenObjectAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)grantedaccess, (void*)(uintptr_t)privileges, (bool)objectcreation, (bool)accessgranted, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtOpenProcessToken(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenProcessToken");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtOpenProcessTokenEx(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jint handleattributes, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenProcessTokenEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)desiredaccess, (uint32_t)handleattributes, (void*)(uintptr_t)tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtOpenSymbolicLinkObject(JNIEnv* km_env, jclass km_clazz, jlong linkhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenSymbolicLinkObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)linkhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)linkhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtOpenThreadToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint desiredaccess, jboolean openasself, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenThreadToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)desiredaccess, (bool)openasself, (void*)(uintptr_t)tokenhandle);
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtOpenThreadTokenEx(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint desiredaccess, jboolean openasself, jint handleattributes, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenThreadTokenEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)desiredaccess, (bool)openasself, (uint32_t)handleattributes, (void*)(uintptr_t)tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)handleattributes;
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtPrivilegeCheck(JNIEnv* km_env, jclass km_clazz, jlong clienttoken, jlong requiredprivileges, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrivilegeCheck");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clienttoken, (void*)(uintptr_t)requiredprivileges, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtPrivilegeObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jint desiredaccess, jlong privileges, jboolean accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrivilegeObjectAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)privileges, (bool)accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtPrivilegedServiceAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong servicename, jlong clienttoken, jlong privileges, jboolean accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrivilegedServiceAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)servicename, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)privileges, (bool)accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jboolean returnsingleentry, jlong filename, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, bool, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryDirectoryFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (bool)returnsingleentry, (void*)(uintptr_t)filename, (bool)restartscan);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)returnsingleentry;
    (void)filename;
    (void)restartscan;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryDirectoryFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jint queryflags, jlong filename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryDirectoryFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (uint32_t)queryflags, (void*)(uintptr_t)filename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)queryflags;
    (void)filename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jlong buffer, jint length, jboolean returnsingleentry, jboolean restartscan, jlong context, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryDirectoryObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)directoryhandle, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (bool)restartscan, (void*)(uintptr_t)context, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)directoryhandle;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)restartscan;
    (void)context;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryEaFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong ealist, jint ealistlength, jlong eaindex, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryEaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)ealist, (uint32_t)ealistlength, (void*)(uintptr_t)eaindex, (bool)restartscan);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryFullAttributesFile(JNIEnv* km_env, jclass km_clazz, jlong objectattributes, jlong fileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryFullAttributesFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objectattributes, (void*)(uintptr_t)fileinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectattributes;
    (void)fileinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryInformationByName(JNIEnv* km_env, jclass km_clazz, jlong objectattributes, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationByName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryInformationToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong sidlist, jint sidlistlength, jlong startsid, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryQuotaInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)sidlist, (uint32_t)sidlistlength, (void*)(uintptr_t)startsid, (bool)restartscan);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)sidlist;
    (void)sidlistlength;
    (void)startsid;
    (void)restartscan;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQuerySecurityObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor, jint length, jlong lengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySecurityObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor, (uint32_t)length, (void*)(uintptr_t)lengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQuerySymbolicLinkObject(JNIEnv* km_env, jclass km_clazz, jlong linkhandle, jlong linktarget, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySymbolicLinkObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)linkhandle, (void*)(uintptr_t)linktarget, (void*)(uintptr_t)returnedlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)linkhandle;
    (void)linktarget;
    (void)returnedlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jint memoryinformationclass, jlong memoryinformation, jlong memoryinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (int32_t)memoryinformationclass, (void*)(uintptr_t)memoryinformation, (uint64_t)memoryinformationlength, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtQueryVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryVolumeInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtReadFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong buffer, jint length, jlong byteoffset, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtReadFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)byteoffset;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtSetEaFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetEaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtSetEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jlong previousstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)eventhandle, (void*)(uintptr_t)previousstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)eventhandle;
    (void)previousstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtSetInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtSetInformationToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtSetInformationVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint vminformationclass, jlong numberofentries, jlong virtualaddresses, jlong vminformation, jint vminformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (int32_t)vminformationclass, (uint64_t)numberofentries, (void*)(uintptr_t)virtualaddresses, (void*)(uintptr_t)vminformation, (uint32_t)vminformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)vminformationclass;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)vminformation;
    (void)vminformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtSetQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetQuotaInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtSetSecurityObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetSecurityObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtSetVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetVolumeInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtUnlockFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong byteoffset, jlong length, jint key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtUnlockFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)length, (uint32_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemNtWriteFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong buffer, jint length, jlong byteoffset, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtWriteFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)byteoffset;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemObInsertObject(JNIEnv* km_env, jclass km_clazz, jlong object, jlong passedaccessstate, jint desiredaccess, jint objectpointerbias, jlong newobject, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObInsertObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)passedaccessstate, (uint32_t)desiredaccess, (uint32_t)objectpointerbias, (void*)(uintptr_t)newobject, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)object;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objectpointerbias;
    (void)newobject;
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemObIsKernelHandle(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObIsKernelHandle");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)handle;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemObMakeTemporaryObject(JNIEnv* km_env, jclass km_clazz, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObMakeTemporaryObject");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)object);
    } else {
        errno = ENOSYS;
    }
#else
    (void)object;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemObOpenObjectByPointer(JNIEnv* km_env, jclass km_clazz, jlong object, jint handleattributes, jlong passedaccessstate, jint desiredaccess, jlong objecttype, jbyte accessmode, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObOpenObjectByPointer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (uint32_t)handleattributes, (void*)(uintptr_t)passedaccessstate, (uint32_t)desiredaccess, (int64_t)objecttype, (int8_t)accessmode, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)object;
    (void)handleattributes;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemObOpenObjectByPointerWithTag(JNIEnv* km_env, jclass km_clazz, jlong object, jint handleattributes, jlong passedaccessstate, jint desiredaccess, jlong objecttype, jbyte accessmode, jint tag, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t, int8_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObOpenObjectByPointerWithTag");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (uint32_t)handleattributes, (void*)(uintptr_t)passedaccessstate, (uint32_t)desiredaccess, (int64_t)objecttype, (int8_t)accessmode, (uint32_t)tag, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)object;
    (void)handleattributes;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)tag;
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemObQueryNameString(JNIEnv* km_env, jclass km_clazz, jlong object, jlong objectnameinfo, jint length, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObQueryNameString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)objectnameinfo, (uint32_t)length, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)object;
    (void)objectnameinfo;
    (void)length;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemObQueryObjectAuditingByHandle(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObQueryObjectAuditingByHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPfxFindPrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong fullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxFindPrefix");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)fullname);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)prefixtable;
    (void)fullname;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPfxInitialize(JNIEnv* km_env, jclass km_clazz, jlong prefixtable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxInitialize");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prefixtable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prefixtable;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPfxInsertPrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong prefix, jlong prefixtableentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxInsertPrefix");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)prefix, (void*)(uintptr_t)prefixtableentry);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)prefixtable;
    (void)prefix;
    (void)prefixtableentry;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPfxRemovePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong prefixtableentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxRemovePrefix");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)prefixtableentry);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prefixtable;
    (void)prefixtableentry;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPoQueueShutdownWorkItem(JNIEnv* km_env, jclass km_clazz, jlong workitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoQueueShutdownWorkItem");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)workitem);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)workitem;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsAssignImpersonationToken(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsAssignImpersonationToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread, (void*)(uintptr_t)token);
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsChargePoolQuota(JNIEnv* km_env, jclass km_clazz, jlong process, jint pooltype, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsChargePoolQuota");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)process, (int32_t)pooltype, (uint64_t)amount);
    } else {
        errno = ENOSYS;
    }
#else
    (void)process;
    (void)pooltype;
    (void)amount;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsChargeProcessPoolQuota(JNIEnv* km_env, jclass km_clazz, jlong process, jint pooltype, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsChargeProcessPoolQuota");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)process, (int32_t)pooltype, (uint64_t)amount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)pooltype;
    (void)amount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsDereferenceImpersonationToken(JNIEnv* km_env, jclass km_clazz, jlong impersonationtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDereferenceImpersonationToken");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)impersonationtoken);
    } else {
        errno = ENOSYS;
    }
#else
    (void)impersonationtoken;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsDereferencePrimaryToken(JNIEnv* km_env, jclass km_clazz, jlong primarytoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDereferencePrimaryToken");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)primarytoken);
    } else {
        errno = ENOSYS;
    }
#else
    (void)primarytoken;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsDisableImpersonation(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong impersonationstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDisableImpersonation");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread, (void*)(uintptr_t)impersonationstate);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)thread;
    (void)impersonationstate;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsGetProcessExitTime(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetProcessExitTime");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsGetThreadProcess(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetThreadProcess");
    }
    int64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    errno = ENOSYS;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsImpersonateClient(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong token, jboolean copyonopen, jboolean effectiveonly, jint impersonationlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, bool, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsImpersonateClient");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread, (void*)(uintptr_t)token, (bool)copyonopen, (bool)effectiveonly, (int32_t)impersonationlevel);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thread;
    (void)token;
    (void)copyonopen;
    (void)effectiveonly;
    (void)impersonationlevel;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsIsDiskCountersEnabled(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsDiskCountersEnabled");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsIsSystemThread(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsSystemThread");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)thread;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsIsThreadTerminating(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsThreadTerminating");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)thread;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsLookupProcessByProcessId(JNIEnv* km_env, jclass km_clazz, jlong processid, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsLookupProcessByProcessId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processid, (void*)(uintptr_t)process);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processid;
    (void)process;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsLookupThreadByThreadId(JNIEnv* km_env, jclass km_clazz, jlong threadid, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsLookupThreadByThreadId");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadid, (void*)(uintptr_t)thread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadid;
    (void)thread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsReferenceImpersonationToken(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong copyonopen, jlong effectiveonly, jlong impersonationlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReferenceImpersonationToken");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)thread, (void*)(uintptr_t)copyonopen, (void*)(uintptr_t)effectiveonly, (void*)(uintptr_t)impersonationlevel);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)thread;
    (void)copyonopen;
    (void)effectiveonly;
    (void)impersonationlevel;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsReferencePrimaryToken(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReferencePrimaryToken");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)process);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)process;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsRestoreImpersonation(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong impersonationstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRestoreImpersonation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)thread, (void*)(uintptr_t)impersonationstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)thread;
    (void)impersonationstate;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsReturnPoolQuota(JNIEnv* km_env, jclass km_clazz, jlong process, jint pooltype, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReturnPoolQuota");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)process, (int32_t)pooltype, (uint64_t)amount);
    } else {
        errno = ENOSYS;
    }
#else
    (void)process;
    (void)pooltype;
    (void)amount;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsRevertToSelf(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRevertToSelf");
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

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemPsUpdateDiskCounters(JNIEnv* km_env, jclass km_clazz, jlong process, jlong bytesread, jlong byteswritten, jint readoperationcount, jint writeoperationcount, jint flushoperationcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsUpdateDiskCounters");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)process, (uint64_t)bytesread, (uint64_t)byteswritten, (uint32_t)readoperationcount, (uint32_t)writeoperationcount, (uint32_t)flushoperationcount);
    } else {
        errno = ENOSYS;
    }
#else
    (void)process;
    (void)bytesread;
    (void)byteswritten;
    (void)readoperationcount;
    (void)writeoperationcount;
    (void)flushoperationcount;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemQuerySecurityContextToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityContextToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlAbsoluteToSelfRelativeSD(JNIEnv* km_env, jclass km_clazz, jlong absolutesecuritydescriptor, jlong selfrelativesecuritydescriptor, jlong bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAbsoluteToSelfRelativeSD");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)absolutesecuritydescriptor, (void*)(uintptr_t)selfrelativesecuritydescriptor, (void*)(uintptr_t)bufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)absolutesecuritydescriptor;
    (void)selfrelativesecuritydescriptor;
    (void)bufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint acerevision, jint accessmask, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddAccessAllowedAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)acerevision, (uint32_t)accessmask, (void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)acl;
    (void)acerevision;
    (void)accessmask;
    (void)sid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlAddAccessAllowedAceEx(JNIEnv* km_env, jclass km_clazz, jlong acl, jint acerevision, jint aceflags, jint accessmask, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddAccessAllowedAceEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)acerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)acl;
    (void)acerevision;
    (void)aceflags;
    (void)accessmask;
    (void)sid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlAddAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint acerevision, jint startingaceindex, jlong acelist, jint acelistlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)acerevision, (uint32_t)startingaceindex, (void*)(uintptr_t)acelist, (uint32_t)acelistlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)acl;
    (void)acerevision;
    (void)startingaceindex;
    (void)acelist;
    (void)acelistlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSid(JNIEnv* km_env, jclass km_clazz, jlong identifierauthority, jbyte subauthoritycount, jint subauthority0, jint subauthority1, jint subauthority2, jint subauthority3, jint subauthority4, jint subauthority5, jint subauthority6, jint subauthority7, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAllocateAndInitializeSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount, (uint32_t)subauthority0, (uint32_t)subauthority1, (uint32_t)subauthority2, (uint32_t)subauthority3, (uint32_t)subauthority4, (uint32_t)subauthority5, (uint32_t)subauthority6, (uint32_t)subauthority7, (void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)identifierauthority;
    (void)subauthoritycount;
    (void)subauthority0;
    (void)subauthority1;
    (void)subauthority2;
    (void)subauthority3;
    (void)subauthority4;
    (void)subauthority5;
    (void)subauthority6;
    (void)subauthority7;
    (void)sid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlAllocateAndInitializeSidEx(JNIEnv* km_env, jclass km_clazz, jlong identifierauthority, jbyte subauthoritycount, jlong subauthorities, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAllocateAndInitializeSidEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount, (void*)(uintptr_t)subauthorities, (void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)identifierauthority;
    (void)subauthoritycount;
    (void)subauthorities;
    (void)sid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlAllocateHeap(JNIEnv* km_env, jclass km_clazz, jlong heaphandle, jint flags, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAllocateHeap");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)heaphandle, (uint32_t)flags, (uint64_t)size);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)heaphandle;
    (void)flags;
    (void)size;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlAppendStringToString(JNIEnv* km_env, jclass km_clazz, jlong destination, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAppendStringToString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destination, (void*)(uintptr_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destination;
    (void)source;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCompareAltitudes(JNIEnv* km_env, jclass km_clazz, jlong altitude1, jlong altitude2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareAltitudes");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)altitude1, (void*)(uintptr_t)altitude2);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)altitude1;
    (void)altitude2;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCompareMemoryUlong(JNIEnv* km_env, jclass km_clazz, jlong source, jlong length, jint pattern) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareMemoryUlong");
    }
    uint64_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)source, (uint64_t)length, (uint32_t)pattern);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)source;
    (void)length;
    (void)pattern;
    errno = ENOSYS;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCompressBuffer(JNIEnv* km_env, jclass km_clazz, jshort compressionformatandengine, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jint uncompressedchunksize, jlong finalcompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompressBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)compressionformatandengine, (void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (uint32_t)uncompressedchunksize, (void*)(uintptr_t)finalcompressedsize, (void*)(uintptr_t)workspace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)compressionformatandengine;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)uncompressedchunksize;
    (void)finalcompressedsize;
    (void)workspace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCompressChunks(JNIEnv* km_env, jclass km_clazz, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jlong compresseddatainfo, jint compresseddatainfolength, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompressChunks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (void*)(uintptr_t)compresseddatainfo, (uint32_t)compresseddatainfolength, (void*)(uintptr_t)workspace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compresseddatainfo;
    (void)compresseddatainfolength;
    (void)workspace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCopyLuid(JNIEnv* km_env, jclass km_clazz, jlong destinationluid, jlong sourceluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCopyLuid");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)destinationluid, (void*)(uintptr_t)sourceluid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)destinationluid;
    (void)sourceluid;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCopySid(JNIEnv* km_env, jclass km_clazz, jint destinationsidlength, jlong destinationsid, jlong sourcesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCopySid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)destinationsidlength, (void*)(uintptr_t)destinationsid, (void*)(uintptr_t)sourcesid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destinationsidlength;
    (void)destinationsid;
    (void)sourcesid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCreateAcl(JNIEnv* km_env, jclass km_clazz, jlong acl, jint acllength, jint aclrevision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateAcl");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)acllength, (uint32_t)aclrevision);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)acl;
    (void)acllength;
    (void)aclrevision;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCreateHeap(JNIEnv* km_env, jclass km_clazz, jint flags, jlong heapbase, jlong reservesize, jlong commitsize, jlong lock, jlong parameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateHeap");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)heapbase, (uint64_t)reservesize, (uint64_t)commitsize, (void*)(uintptr_t)lock, (void*)(uintptr_t)parameters);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)flags;
    (void)heapbase;
    (void)reservesize;
    (void)commitsize;
    (void)lock;
    (void)parameters;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCreateServiceSid(JNIEnv* km_env, jclass km_clazz, jlong servicename, jlong servicesid, jlong servicesidlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateServiceSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)servicename, (void*)(uintptr_t)servicesid, (void*)(uintptr_t)servicesidlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)servicename;
    (void)servicesid;
    (void)servicesidlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCreateSystemVolumeInformationFolder(JNIEnv* km_env, jclass km_clazz, jlong volumerootpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateSystemVolumeInformationFolder");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)volumerootpath);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)volumerootpath;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCreateUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateUnicodeString");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCreateVirtualAccountSid(JNIEnv* km_env, jclass km_clazz, jlong name, jint basesubauthority, jlong sid, jlong sidlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateVirtualAccountSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (uint32_t)basesubauthority, (void*)(uintptr_t)sid, (void*)(uintptr_t)sidlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)basesubauthority;
    (void)sid;
    (void)sidlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlCustomCPToUnicodeN(JNIEnv* km_env, jclass km_clazz, jlong customcp, jlong unicodestring, jint maxbytesinunicodestring, jlong bytesinunicodestring, jlong customcpstring, jint bytesincustomcpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCustomCPToUnicodeN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcp, (void*)(uintptr_t)unicodestring, (uint32_t)maxbytesinunicodestring, (void*)(uintptr_t)bytesinunicodestring, (void*)(uintptr_t)customcpstring, (uint32_t)bytesincustomcpstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcp;
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)customcpstring;
    (void)bytesincustomcpstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDecompressBuffer(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jlong finaluncompressedsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (void*)(uintptr_t)finaluncompressedsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)finaluncompressedsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jlong finaluncompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressBufferEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (void*)(uintptr_t)finaluncompressedsize, (void*)(uintptr_t)workspace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)finaluncompressedsize;
    (void)workspace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDecompressBufferEx2(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jint uncompressedchunksize, jlong finaluncompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressBufferEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (uint32_t)uncompressedchunksize, (void*)(uintptr_t)finaluncompressedsize, (void*)(uintptr_t)workspace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)uncompressedchunksize;
    (void)finaluncompressedsize;
    (void)workspace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDecompressChunks(JNIEnv* km_env, jclass km_clazz, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jlong compressedtail, jint compressedtailsize, jlong compresseddatainfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressChunks");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (void*)(uintptr_t)compressedtail, (uint32_t)compressedtailsize, (void*)(uintptr_t)compresseddatainfo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compressedtail;
    (void)compressedtailsize;
    (void)compresseddatainfo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDecompressFragment(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedfragment, jint uncompressedfragmentsize, jlong compressedbuffer, jint compressedbuffersize, jint fragmentoffset, jlong finaluncompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressFragment");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedfragment, (uint32_t)uncompressedfragmentsize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (uint32_t)fragmentoffset, (void*)(uintptr_t)finaluncompressedsize, (void*)(uintptr_t)workspace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)compressionformat;
    (void)uncompressedfragment;
    (void)uncompressedfragmentsize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)fragmentoffset;
    (void)finaluncompressedsize;
    (void)workspace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDecompressFragmentEx(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedfragment, jint uncompressedfragmentsize, jlong compressedbuffer, jint compressedbuffersize, jint fragmentoffset, jint uncompressedchunksize, jlong finaluncompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressFragmentEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedfragment, (uint32_t)uncompressedfragmentsize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (uint32_t)fragmentoffset, (uint32_t)uncompressedchunksize, (void*)(uintptr_t)finaluncompressedsize, (void*)(uintptr_t)workspace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)compressionformat;
    (void)uncompressedfragment;
    (void)uncompressedfragmentsize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)fragmentoffset;
    (void)uncompressedchunksize;
    (void)finaluncompressedsize;
    (void)workspace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDeleteAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint aceindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)aceindex);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)acl;
    (void)aceindex;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDescribeChunk(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong compressedbuffer, jlong endofcompressedbufferplus1, jlong chunkbuffer, jlong chunksize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDescribeChunk");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)compressedbuffer, (void*)(uintptr_t)endofcompressedbufferplus1, (void*)(uintptr_t)chunkbuffer, (void*)(uintptr_t)chunksize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)compressionformat;
    (void)compressedbuffer;
    (void)endofcompressedbufferplus1;
    (void)chunkbuffer;
    (void)chunksize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDestroyHeap(JNIEnv* km_env, jclass km_clazz, jlong heaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDestroyHeap");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)heaphandle);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)heaphandle;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDosPathNameToNtPathNameUWithStatus(JNIEnv* km_env, jclass km_clazz, jlong dosfilename, jlong ntfilename, jlong filepart, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDosPathNameToNtPathName_U_WithStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dosfilename, (void*)(uintptr_t)ntfilename, (void*)(uintptr_t)filepart, (void*)(uintptr_t)reserved);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)dosfilename;
    (void)ntfilename;
    (void)filepart;
    (void)reserved;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDowncaseUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDowncaseUnicodeString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlDuplicateUnicodeString(JNIEnv* km_env, jclass km_clazz, jint flags, jlong stringin, jlong stringout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDuplicateUnicodeString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)stringin, (void*)(uintptr_t)stringout);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)stringin;
    (void)stringout;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlEqualPrefixSid(JNIEnv* km_env, jclass km_clazz, jlong sid1, jlong sid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEqualPrefixSid");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid1, (void*)(uintptr_t)sid2);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)sid1;
    (void)sid2;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlEqualSid(JNIEnv* km_env, jclass km_clazz, jlong sid1, jlong sid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEqualSid");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid1, (void*)(uintptr_t)sid2);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)sid1;
    (void)sid2;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlFindUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong fullname, jint caseinsensitiveindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindUnicodePrefix");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)fullname, (uint32_t)caseinsensitiveindex);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)prefixtable;
    (void)fullname;
    (void)caseinsensitiveindex;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlFreeHeap(JNIEnv* km_env, jclass km_clazz, jlong heaphandle, jint flags, jlong baseaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeHeap");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)heaphandle, (uint32_t)flags, (void*)(uintptr_t)baseaddress);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)heaphandle;
    (void)flags;
    (void)baseaddress;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlFreeSid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeSid");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)sid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlGenerate8dot3Name(JNIEnv* km_env, jclass km_clazz, jlong name, jboolean allowextendedcharacters, jlong context, jlong name8dot3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGenerate8dot3Name");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (bool)allowextendedcharacters, (void*)(uintptr_t)context, (void*)(uintptr_t)name8dot3);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)allowextendedcharacters;
    (void)context;
    (void)name8dot3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlGetAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint aceindex, jlong ace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetAce");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)aceindex, (void*)(uintptr_t)ace);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)acl;
    (void)aceindex;
    (void)ace;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlGetCompressionWorkSpaceSize(JNIEnv* km_env, jclass km_clazz, jshort compressionformatandengine, jlong compressbufferworkspacesize, jlong compressfragmentworkspacesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetCompressionWorkSpaceSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)compressionformatandengine, (void*)(uintptr_t)compressbufferworkspacesize, (void*)(uintptr_t)compressfragmentworkspacesize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)compressionformatandengine;
    (void)compressbufferworkspacesize;
    (void)compressfragmentworkspacesize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlGetDaclSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong daclpresent, jlong dacl, jlong dacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetDaclSecurityDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)daclpresent, (void*)(uintptr_t)dacl, (void*)(uintptr_t)dacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)daclpresent;
    (void)dacl;
    (void)dacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlGetGroupSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong group, jlong groupdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetGroupSecurityDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)group, (void*)(uintptr_t)groupdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)group;
    (void)groupdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlGetOwnerSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong owner, jlong ownerdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetOwnerSecurityDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)owner, (void*)(uintptr_t)ownerdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)owner;
    (void)ownerdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlGetSaclSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong saclpresent, jlong sacl, jlong sacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetSaclSecurityDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)saclpresent, (void*)(uintptr_t)sacl, (void*)(uintptr_t)sacldefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)saclpresent;
    (void)sacl;
    (void)sacldefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIdentifierAuthoritySid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdentifierAuthoritySid");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)sid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIdnToAscii(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcestring, jint sourcestringlength, jlong destinationstring, jlong destinationstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdnToAscii");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)destinationstring, (void*)(uintptr_t)destinationstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIdnToNameprepUnicode(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcestring, jint sourcestringlength, jlong destinationstring, jlong destinationstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdnToNameprepUnicode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)destinationstring, (void*)(uintptr_t)destinationstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIdnToUnicode(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcestring, jint sourcestringlength, jlong destinationstring, jlong destinationstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdnToUnicode");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)destinationstring, (void*)(uintptr_t)destinationstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlInitCodePageTable(JNIEnv* km_env, jclass km_clazz, jlong tablebase, jlong codepagetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitCodePageTable");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)tablebase, (void*)(uintptr_t)codepagetable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)tablebase;
    (void)codepagetable;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlInitUnicodeStringEx(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitUnicodeStringEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destinationstring;
    (void)sourcestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlInitializeSid(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong identifierauthority, jbyte subauthoritycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sid;
    (void)identifierauthority;
    (void)subauthoritycount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlInitializeSidEx(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong identifierauthority, jbyte subauthoritycount, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (*km_fn_t)(void*, void*, uint8_t, ...);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeSidEx");
    }
    int32_t km_res = -1;
    if (km_fn_ptr != NULL) {
        switch (km_vac) {
            case 0: km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount); break;
            case 1: km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount, (intptr_t)km_va0); break;
            case 2: km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount, (intptr_t)km_va0, (intptr_t)km_va1); break;
            case 3: km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2); break;
            default: km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount, (intptr_t)km_va0, (intptr_t)km_va1, (intptr_t)km_va2, (intptr_t)km_va3); break;
        }
    } else {
        errno = ENOSYS;
    }
#else
    (void)sid;
    (void)identifierauthority;
    (void)subauthoritycount;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlInitializeUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeUnicodePrefix");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prefixtable);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prefixtable;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlInsertUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong prefix, jlong prefixtableentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInsertUnicodePrefix");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)prefix, (void*)(uintptr_t)prefixtableentry);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)prefixtable;
    (void)prefix;
    (void)prefixtableentry;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIsCloudFilesPlaceholder(JNIEnv* km_env, jclass km_clazz, jint fileattributes, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsCloudFilesPlaceholder");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)fileattributes, (uint32_t)reparsetag);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileattributes;
    (void)reparsetag;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIsDosDeviceNameU(JNIEnv* km_env, jclass km_clazz, jlong dosfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsDosDeviceName_U");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)dosfilename);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)dosfilename;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIsNonEmptyDirectoryReparsePointAllowed(JNIEnv* km_env, jclass km_clazz, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsNonEmptyDirectoryReparsePointAllowed");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)reparsetag);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)reparsetag;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIsNormalizedString(JNIEnv* km_env, jclass km_clazz, jint normform, jlong sourcestring, jint sourcestringlength, jlong normalized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsNormalizedString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)normform, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)normalized);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)normform;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)normalized;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholder(JNIEnv* km_env, jclass km_clazz, jint fileattributes, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsPartialPlaceholder");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)fileattributes, (uint32_t)reparsetag);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)fileattributes;
    (void)reparsetag;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileHandle(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong ispartialplaceholder) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsPartialPlaceholderFileHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)ispartialplaceholder);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)ispartialplaceholder;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIsPartialPlaceholderFileInfo(JNIEnv* km_env, jclass km_clazz, jlong infobuffer, jint infoclass, jlong ispartialplaceholder) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsPartialPlaceholderFileInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)infobuffer, (int32_t)infoclass, (void*)(uintptr_t)ispartialplaceholder);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)infobuffer;
    (void)infoclass;
    (void)ispartialplaceholder;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIsSandboxedToken(JNIEnv* km_env, jclass km_clazz, jlong context, jbyte previousmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsSandboxedToken");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (int8_t)previousmode);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)context;
    (void)previousmode;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlIsValidOemCharacter(JNIEnv* km_env, jclass km_clazz, jlong arg0Char) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsValidOemCharacter");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Char);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)arg0Char;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlLengthRequiredSid(JNIEnv* km_env, jclass km_clazz, jint subauthoritycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLengthRequiredSid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)subauthoritycount);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)subauthoritycount;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlLengthSid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLengthSid");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)sid;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeN(JNIEnv* km_env, jclass km_clazz, jlong unicodestring, jint maxbytesinunicodestring, jlong bytesinunicodestring, jlong multibytestring, jint bytesinmultibytestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlMultiByteToUnicodeN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)unicodestring, (uint32_t)maxbytesinunicodestring, (void*)(uintptr_t)bytesinunicodestring, (void*)(uintptr_t)multibytestring, (uint32_t)bytesinmultibytestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlMultiByteToUnicodeSize(JNIEnv* km_env, jclass km_clazz, jlong bytesinunicodestring, jlong multibytestring, jint bytesinmultibytestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlMultiByteToUnicodeSize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)bytesinunicodestring, (void*)(uintptr_t)multibytestring, (uint32_t)bytesinmultibytestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlNextUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jboolean restart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNextUnicodePrefix");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)prefixtable, (bool)restart);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)prefixtable;
    (void)restart;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlNormalizeString(JNIEnv* km_env, jclass km_clazz, jint normform, jlong sourcestring, jint sourcestringlength, jlong destinationstring, jlong destinationstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNormalizeString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)normform, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)destinationstring, (void*)(uintptr_t)destinationstringlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)normform;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlNtStatusToDosErrorNoTeb(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNtStatusToDosErrorNoTeb");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)status);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)status;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlOemStringToCountedUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOemStringToCountedUnicodeString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlOemStringToUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOemStringToUnicodeString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlOemToUnicodeN(JNIEnv* km_env, jclass km_clazz, jlong unicodestring, jint maxbytesinunicodestring, jlong bytesinunicodestring, jlong oemstring, jint bytesinoemstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOemToUnicodeN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)unicodestring, (uint32_t)maxbytesinunicodestring, (void*)(uintptr_t)bytesinunicodestring, (void*)(uintptr_t)oemstring, (uint32_t)bytesinoemstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)oemstring;
    (void)bytesinoemstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlPrefixString(JNIEnv* km_env, jclass km_clazz, jlong string1, jlong string2, jboolean caseinsensitive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlPrefixString");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)string1, (void*)(uintptr_t)string2, (bool)caseinsensitive);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentity(JNIEnv* km_env, jclass km_clazz, jlong tokenobject, jlong packagefullname, jlong packagesize, jlong appid, jlong appidsize, jlong packaged) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryPackageIdentity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenobject, (void*)(uintptr_t)packagefullname, (void*)(uintptr_t)packagesize, (void*)(uintptr_t)appid, (void*)(uintptr_t)appidsize, (void*)(uintptr_t)packaged);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenobject;
    (void)packagefullname;
    (void)packagesize;
    (void)appid;
    (void)appidsize;
    (void)packaged;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlQueryPackageIdentityEx(JNIEnv* km_env, jclass km_clazz, jlong tokenobject, jlong packagefullname, jlong packagesize, jlong appid, jlong appidsize, jlong dynamicid, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryPackageIdentityEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenobject, (void*)(uintptr_t)packagefullname, (void*)(uintptr_t)packagesize, (void*)(uintptr_t)appid, (void*)(uintptr_t)appidsize, (void*)(uintptr_t)dynamicid, (void*)(uintptr_t)flags);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenobject;
    (void)packagefullname;
    (void)packagesize;
    (void)appid;
    (void)appidsize;
    (void)dynamicid;
    (void)flags;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlQueryProcessPlaceholderCompatibilityMode(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryProcessPlaceholderCompatibilityMode");
    }
    int8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlQueryThreadPlaceholderCompatibilityMode(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryThreadPlaceholderCompatibilityMode");
    }
    int8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr();
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    errno = ENOSYS;
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlRandom(JNIEnv* km_env, jclass km_clazz, jlong seed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRandom");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)seed);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)seed;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlRandomEx(JNIEnv* km_env, jclass km_clazz, jlong seed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRandomEx");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)seed);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)seed;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlRemoveUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong prefixtableentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRemoveUnicodePrefix");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)prefixtableentry);
    } else {
        errno = ENOSYS;
    }
#else
    (void)prefixtable;
    (void)prefixtableentry;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlReplaceSidInSd(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong oldsid, jlong newsid, jlong numchanges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlReplaceSidInSd");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)oldsid, (void*)(uintptr_t)newsid, (void*)(uintptr_t)numchanges);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)oldsid;
    (void)newsid;
    (void)numchanges;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlReserveChunk(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong compressedbuffer, jlong endofcompressedbufferplus1, jlong chunkbuffer, jint chunksize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlReserveChunk");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)compressedbuffer, (void*)(uintptr_t)endofcompressedbufferplus1, (void*)(uintptr_t)chunkbuffer, (uint32_t)chunksize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)compressionformat;
    (void)compressedbuffer;
    (void)endofcompressedbufferplus1;
    (void)chunkbuffer;
    (void)chunksize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlSecondsSince1970ToTime(JNIEnv* km_env, jclass km_clazz, jint elapsedseconds, jlong arg1Time) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSecondsSince1970ToTime");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)elapsedseconds, (void*)(uintptr_t)arg1Time);
    } else {
        errno = ENOSYS;
    }
#else
    (void)elapsedseconds;
    (void)arg1Time;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlSecondsSince1980ToTime(JNIEnv* km_env, jclass km_clazz, jint elapsedseconds, jlong arg1Time) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSecondsSince1980ToTime");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((uint32_t)elapsedseconds, (void*)(uintptr_t)arg1Time);
    } else {
        errno = ENOSYS;
    }
#else
    (void)elapsedseconds;
    (void)arg1Time;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlSelfRelativeToAbsoluteSD(JNIEnv* km_env, jclass km_clazz, jlong selfrelativesecuritydescriptor, jlong absolutesecuritydescriptor, jlong absolutesecuritydescriptorsize, jlong dacl, jlong daclsize, jlong sacl, jlong saclsize, jlong owner, jlong ownersize, jlong primarygroup, jlong primarygroupsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSelfRelativeToAbsoluteSD");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)selfrelativesecuritydescriptor, (void*)(uintptr_t)absolutesecuritydescriptor, (void*)(uintptr_t)absolutesecuritydescriptorsize, (void*)(uintptr_t)dacl, (void*)(uintptr_t)daclsize, (void*)(uintptr_t)sacl, (void*)(uintptr_t)saclsize, (void*)(uintptr_t)owner, (void*)(uintptr_t)ownersize, (void*)(uintptr_t)primarygroup, (void*)(uintptr_t)primarygroupsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)selfrelativesecuritydescriptor;
    (void)absolutesecuritydescriptor;
    (void)absolutesecuritydescriptorsize;
    (void)dacl;
    (void)daclsize;
    (void)sacl;
    (void)saclsize;
    (void)owner;
    (void)ownersize;
    (void)primarygroup;
    (void)primarygroupsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlSetGroupSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong group, jboolean groupdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetGroupSecurityDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)group, (bool)groupdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)group;
    (void)groupdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlSetOwnerSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong owner, jboolean ownerdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetOwnerSecurityDescriptor");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)owner, (bool)ownerdefaulted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securitydescriptor;
    (void)owner;
    (void)ownerdefaulted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlSetProcessPlaceholderCompatibilityMode(JNIEnv* km_env, jclass km_clazz, jbyte mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetProcessPlaceholderCompatibilityMode");
    }
    int8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mode;
    errno = ENOSYS;
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlSetThreadPlaceholderCompatibilityMode(JNIEnv* km_env, jclass km_clazz, jbyte mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetThreadPlaceholderCompatibilityMode");
    }
    int8_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int8_t)mode);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)mode;
    errno = ENOSYS;
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlSubAuthorityCountSid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSubAuthorityCountSid");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)sid;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlSubAuthoritySid(JNIEnv* km_env, jclass km_clazz, jlong sid, jint subauthority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSubAuthoritySid");
    }
    void* km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid, (uint32_t)subauthority);
    } else {
        errno = ENOSYS;
        km_res = NULL;
    }
#else
    (void)sid;
    (void)subauthority;
    errno = ENOSYS;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlTimeToSecondsSince1980(JNIEnv* km_env, jclass km_clazz, jlong arg0Time, jlong elapsedseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlTimeToSecondsSince1980");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)arg0Time, (void*)(uintptr_t)elapsedseconds);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)arg0Time;
    (void)elapsedseconds;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlUnicodeStringToCountedOemString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToCountedOemString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlUnicodeToCustomCPN(JNIEnv* km_env, jclass km_clazz, jlong customcp, jlong customcpstring, jint maxbytesincustomcpstring, jlong bytesincustomcpstring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToCustomCPN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcp, (void*)(uintptr_t)customcpstring, (uint32_t)maxbytesincustomcpstring, (void*)(uintptr_t)bytesincustomcpstring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcp;
    (void)customcpstring;
    (void)maxbytesincustomcpstring;
    (void)bytesincustomcpstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlUnicodeToMultiByteN(JNIEnv* km_env, jclass km_clazz, jlong multibytestring, jint maxbytesinmultibytestring, jlong bytesinmultibytestring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToMultiByteN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)multibytestring, (uint32_t)maxbytesinmultibytestring, (void*)(uintptr_t)bytesinmultibytestring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlUnicodeToOemN(JNIEnv* km_env, jclass km_clazz, jlong oemstring, jint maxbytesinoemstring, jlong bytesinoemstring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToOemN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oemstring, (uint32_t)maxbytesinoemstring, (void*)(uintptr_t)bytesinoemstring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oemstring;
    (void)maxbytesinoemstring;
    (void)bytesinoemstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToCountedOemString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeStringToCountedOemString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeStringToOemString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeStringToOemString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToCustomCPN(JNIEnv* km_env, jclass km_clazz, jlong customcp, jlong customcpstring, jint maxbytesincustomcpstring, jlong bytesincustomcpstring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToCustomCPN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)customcp, (void*)(uintptr_t)customcpstring, (uint32_t)maxbytesincustomcpstring, (void*)(uintptr_t)bytesincustomcpstring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)customcp;
    (void)customcpstring;
    (void)maxbytesincustomcpstring;
    (void)bytesincustomcpstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToMultiByteN(JNIEnv* km_env, jclass km_clazz, jlong multibytestring, jint maxbytesinmultibytestring, jlong bytesinmultibytestring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToMultiByteN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)multibytestring, (uint32_t)maxbytesinmultibytestring, (void*)(uintptr_t)bytesinmultibytestring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlUpcaseUnicodeToOemN(JNIEnv* km_env, jclass km_clazz, jlong oemstring, jint maxbytesinoemstring, jlong bytesinoemstring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToOemN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oemstring, (uint32_t)maxbytesinoemstring, (void*)(uintptr_t)bytesinoemstring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)oemstring;
    (void)maxbytesinoemstring;
    (void)bytesinoemstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlValidSid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlValidSid");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)sid;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlValidateUnicodeString(JNIEnv* km_env, jclass km_clazz, jint flags, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlValidateUnicodeString");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)string);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)string;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlxOemStringToUnicodeSize(JNIEnv* km_env, jclass km_clazz, jlong oemstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlxOemStringToUnicodeSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)oemstring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)oemstring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemRtlxUnicodeStringToOemSize(JNIEnv* km_env, jclass km_clazz, jlong unicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlxUnicodeStringToOemSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)unicodestring);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)unicodestring;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAccessCheckFromState(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong primarytokeninformation, jlong clienttokeninformation, jint desiredaccess, jint previouslygrantedaccess, jlong privileges, jlong genericmapping, jbyte accessmode, jlong grantedaccess, jlong accessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAccessCheckFromState");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)primarytokeninformation, (void*)(uintptr_t)clienttokeninformation, (uint32_t)desiredaccess, (uint32_t)previouslygrantedaccess, (void*)(uintptr_t)privileges, (void*)(uintptr_t)genericmapping, (int8_t)accessmode, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)securitydescriptor;
    (void)primarytokeninformation;
    (void)clienttokeninformation;
    (void)desiredaccess;
    (void)previouslygrantedaccess;
    (void)privileges;
    (void)genericmapping;
    (void)accessmode;
    (void)grantedaccess;
    (void)accessstatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAccessCheckFromStateEx(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong primarytoken, jlong clienttoken, jint desiredaccess, jint previouslygrantedaccess, jlong privileges, jlong genericmapping, jbyte accessmode, jlong grantedaccess, jlong accessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAccessCheckFromStateEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)primarytoken, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)previouslygrantedaccess, (void*)(uintptr_t)privileges, (void*)(uintptr_t)genericmapping, (int8_t)accessmode, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)securitydescriptor;
    (void)primarytoken;
    (void)clienttoken;
    (void)desiredaccess;
    (void)previouslygrantedaccess;
    (void)privileges;
    (void)genericmapping;
    (void)accessmode;
    (void)grantedaccess;
    (void)accessstatus;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForAccessConstraints(JNIEnv* km_env, jclass km_clazz, jlong objecttype, jlong securitydescriptor, jlong accessstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAdjustAccessStateForAccessConstraints");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)objecttype, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)objecttype;
    (void)securitydescriptor;
    (void)accessstate;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAdjustAccessStateForTrustLabel(JNIEnv* km_env, jclass km_clazz, jlong objecttype, jlong securitydescriptor, jlong accessstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAdjustAccessStateForTrustLabel");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)objecttype, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)objecttype;
    (void)securitydescriptor;
    (void)accessstate;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAdjustObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong objectname, jlong originaldescriptor, jlong proposeddescriptor, jlong subjectsecuritycontext, jlong adjusteddescriptor, jlong applyadjusteddescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAdjustObjectSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objectname, (void*)(uintptr_t)originaldescriptor, (void*)(uintptr_t)proposeddescriptor, (void*)(uintptr_t)subjectsecuritycontext, (void*)(uintptr_t)adjusteddescriptor, (void*)(uintptr_t)applyadjusteddescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectname;
    (void)originaldescriptor;
    (void)proposeddescriptor;
    (void)subjectsecuritycontext;
    (void)adjusteddescriptor;
    (void)applyadjusteddescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAppendPrivileges(JNIEnv* km_env, jclass km_clazz, jlong accessstate, jlong privileges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAppendPrivileges");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)accessstate, (void*)(uintptr_t)privileges);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)accessstate;
    (void)privileges;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditFipsCryptoSelftests(JNIEnv* km_env, jclass km_clazz, jboolean bsuccess, jint selftestcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(bool, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditFipsCryptoSelftests");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((bool)bsuccess, (uint32_t)selftestcode);
    } else {
        errno = ENOSYS;
    }
#else
    (void)bsuccess;
    (void)selftestcode;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreation(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong linkname, jboolean bsuccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditHardLinkCreation");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)linkname, (bool)bsuccess);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filename;
    (void)linkname;
    (void)bsuccess;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditHardLinkCreationWithTransaction(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong linkname, jboolean bsuccess, jlong transactionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditHardLinkCreationWithTransaction");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)linkname, (bool)bsuccess, (void*)(uintptr_t)transactionid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)filename;
    (void)linkname;
    (void)bsuccess;
    (void)transactionid;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditTransactionStateChange(JNIEnv* km_env, jclass km_clazz, jlong transactionid, jlong resourcemanagerid, jint newtransactionstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditTransactionStateChange");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)transactionid, (void*)(uintptr_t)resourcemanagerid, (uint32_t)newtransactionstate);
    } else {
        errno = ENOSYS;
    }
#else
    (void)transactionid;
    (void)resourcemanagerid;
    (void)newtransactionstate;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContext(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong subjectsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingAnyFileEventsWithContext");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditingAnyFileEventsWithContextEx(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong subjectsecuritycontext, jlong stagingenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingAnyFileEventsWithContextEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext, (void*)(uintptr_t)stagingenabled);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    (void)stagingenabled;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditingFileEvents(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileEvents");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)accessgranted;
    (void)securitydescriptor;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContext(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor, jlong subjectsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileEventsWithContext");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditingFileEventsWithContextEx(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor, jlong subjectsecuritycontext, jlong stagingenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileEventsWithContextEx");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext, (void*)(uintptr_t)stagingenabled);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    (void)stagingenabled;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditingFileOrGlobalEvents(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor, jlong subjectsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileOrGlobalEvents");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEvents(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingHardLinkEvents");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)accessgranted;
    (void)securitydescriptor;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeAuditingHardLinkEventsWithContext(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor, jlong subjectsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingHardLinkEventsWithContext");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeCaptureSubjectContextEx(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong process, jlong subjectcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCaptureSubjectContextEx");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((int64_t)thread, (int64_t)process, (void*)(uintptr_t)subjectcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)thread;
    (void)process;
    (void)subjectcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeCheckForCriticalAceRemoval(JNIEnv* km_env, jclass km_clazz, jlong currentdescriptor, jlong newdescriptor, jlong subjectsecuritycontext, jlong aceremoved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCheckForCriticalAceRemoval");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)currentdescriptor, (void*)(uintptr_t)newdescriptor, (void*)(uintptr_t)subjectsecuritycontext, (void*)(uintptr_t)aceremoved);
    } else {
        errno = ENOSYS;
    }
#else
    (void)currentdescriptor;
    (void)newdescriptor;
    (void)subjectsecuritycontext;
    (void)aceremoved;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeCreateClientSecurity(JNIEnv* km_env, jclass km_clazz, jlong clientthread, jlong clientsecurityqos, jboolean remotesession, jlong clientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCreateClientSecurity");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)clientthread, (void*)(uintptr_t)clientsecurityqos, (bool)remotesession, (void*)(uintptr_t)clientcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientthread;
    (void)clientsecurityqos;
    (void)remotesession;
    (void)clientcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeCreateClientSecurityFromSubjectContext(JNIEnv* km_env, jclass km_clazz, jlong subjectcontext, jlong clientsecurityqos, jboolean serverisremote, jlong clientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCreateClientSecurityFromSubjectContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subjectcontext, (void*)(uintptr_t)clientsecurityqos, (bool)serverisremote, (void*)(uintptr_t)clientcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subjectcontext;
    (void)clientsecurityqos;
    (void)serverisremote;
    (void)clientcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeDeleteClientSecurity(JNIEnv* km_env, jclass km_clazz, jlong clientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeleteClientSecurity");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)clientcontext);
    } else {
        errno = ENOSYS;
    }
#else
    (void)clientcontext;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong object, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeleteObjectAuditAlarm");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)object;
    (void)handle;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeDeleteObjectAuditAlarmWithTransaction(JNIEnv* km_env, jclass km_clazz, jlong object, jlong handle, jlong transactionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeleteObjectAuditAlarmWithTransaction");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)handle, (void*)(uintptr_t)transactionid);
    } else {
        errno = ENOSYS;
    }
#else
    (void)object;
    (void)handle;
    (void)transactionid;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeExamineSacl(JNIEnv* km_env, jclass km_clazz, jlong sacl, jlong resourcesacl, jlong token, jint desiredaccess, jboolean accessgranted, jlong generateaudit, jlong generatealarm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeExamineSacl");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)sacl, (void*)(uintptr_t)resourcesacl, (void*)(uintptr_t)token, (uint32_t)desiredaccess, (bool)accessgranted, (void*)(uintptr_t)generateaudit, (void*)(uintptr_t)generatealarm);
    } else {
        errno = ENOSYS;
    }
#else
    (void)sacl;
    (void)resourcesacl;
    (void)token;
    (void)desiredaccess;
    (void)accessgranted;
    (void)generateaudit;
    (void)generatealarm;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeFilterToken(JNIEnv* km_env, jclass km_clazz, jlong existingtoken, jint flags, jlong sidstodisable, jlong privilegestodelete, jlong restrictedsids, jlong filteredtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeFilterToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)existingtoken, (uint32_t)flags, (void*)(uintptr_t)sidstodisable, (void*)(uintptr_t)privilegestodelete, (void*)(uintptr_t)restrictedsids, (void*)(uintptr_t)filteredtoken);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)existingtoken;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)filteredtoken;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeFreePrivileges(JNIEnv* km_env, jclass km_clazz, jlong privileges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeFreePrivileges");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)privileges);
    } else {
        errno = ENOSYS;
    }
#else
    (void)privileges;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeImpersonateClient(JNIEnv* km_env, jclass km_clazz, jlong clientcontext, jlong serverthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeImpersonateClient");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)clientcontext, (int64_t)serverthread);
    } else {
        errno = ENOSYS;
    }
#else
    (void)clientcontext;
    (void)serverthread;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeImpersonateClientEx(JNIEnv* km_env, jclass km_clazz, jlong clientcontext, jlong serverthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeImpersonateClientEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clientcontext, (int64_t)serverthread);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clientcontext;
    (void)serverthread;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeLocateProcessImageName(JNIEnv* km_env, jclass km_clazz, jlong process, jlong pimagefilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeLocateProcessImageName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int64_t)process, (void*)(uintptr_t)pimagefilename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)process;
    (void)pimagefilename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotification(JNIEnv* km_env, jclass km_clazz, jlong logonid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeMarkLogonSessionForTerminationNotification");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)logonid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)logonid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeMarkLogonSessionForTerminationNotificationEx(JNIEnv* km_env, jclass km_clazz, jlong logonid, jlong pserversilo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeMarkLogonSessionForTerminationNotificationEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)logonid, (int64_t)pserversilo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)logonid;
    (void)pserversilo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong object, jlong absoluteobjectname, jlong securitydescriptor, jlong accessstate, jboolean objectcreated, jboolean accessgranted, jbyte accessmode, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectAuditAlarm");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)object, (void*)(uintptr_t)absoluteobjectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate, (bool)objectcreated, (bool)accessgranted, (int8_t)accessmode, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
    }
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)generateonclose;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeOpenObjectAuditAlarmWithTransaction(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong object, jlong absoluteobjectname, jlong securitydescriptor, jlong accessstate, jboolean objectcreated, jboolean accessgranted, jbyte accessmode, jlong transactionid, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectAuditAlarmWithTransaction");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)object, (void*)(uintptr_t)absoluteobjectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate, (bool)objectcreated, (bool)accessgranted, (int8_t)accessmode, (void*)(uintptr_t)transactionid, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
    }
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)transactionid;
    (void)generateonclose;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong object, jlong absoluteobjectname, jlong securitydescriptor, jlong accessstate, jboolean objectcreated, jboolean accessgranted, jbyte accessmode, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectForDeleteAuditAlarm");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)object, (void*)(uintptr_t)absoluteobjectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate, (bool)objectcreated, (bool)accessgranted, (int8_t)accessmode, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
    }
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)generateonclose;
    errno = ENOSYS;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeOpenObjectForDeleteAuditAlarmWithTransaction(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong object, jlong absoluteobjectname, jlong securitydescriptor, jlong accessstate, jboolean objectcreated, jboolean accessgranted, jbyte accessmode, jlong transactionid, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectForDeleteAuditAlarmWithTransaction");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)object, (void*)(uintptr_t)absoluteobjectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate, (bool)objectcreated, (bool)accessgranted, (int8_t)accessmode, (void*)(uintptr_t)transactionid, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
    }
#else
    (void)objecttypename;
    (void)object;
    (void)absoluteobjectname;
    (void)securitydescriptor;
    (void)accessstate;
    (void)objectcreated;
    (void)accessgranted;
    (void)accessmode;
    (void)transactionid;
    (void)generateonclose;
    errno = ENOSYS;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSePrivilegeCheck(JNIEnv* km_env, jclass km_clazz, jlong requiredprivileges, jlong subjectsecuritycontext, jbyte accessmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SePrivilegeCheck");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)requiredprivileges, (void*)(uintptr_t)subjectsecuritycontext, (int8_t)accessmode);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)requiredprivileges;
    (void)subjectsecuritycontext;
    (void)accessmode;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeQueryAuthenticationIdToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong authenticationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQueryAuthenticationIdToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)authenticationid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)token;
    (void)authenticationid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeQueryInformationToken(JNIEnv* km_env, jclass km_clazz, jlong token, jint tokeninformationclass, jlong tokeninformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQueryInformationToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)token;
    (void)tokeninformationclass;
    (void)tokeninformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeQuerySecurityDescriptorInfo(JNIEnv* km_env, jclass km_clazz, jlong securityinformation, jlong securitydescriptor, jlong length, jlong objectssecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQuerySecurityDescriptorInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)securityinformation, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)length, (void*)(uintptr_t)objectssecuritydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)objectssecuritydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeQueryServerSiloToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong pserversilo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQueryServerSiloToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)pserversilo);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)token;
    (void)pserversilo;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeQuerySessionIdToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQuerySessionIdToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)sessionid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)token;
    (void)sessionid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeQuerySessionIdTokenEx(JNIEnv* km_env, jclass km_clazz, jlong token, jlong sessionid, jlong isservicesession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQuerySessionIdTokenEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)sessionid, (void*)(uintptr_t)isservicesession);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)token;
    (void)sessionid;
    (void)isservicesession;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutine(JNIEnv* km_env, jclass km_clazz, jlong callbackroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeRegisterLogonSessionTerminatedRoutine");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeRegisterLogonSessionTerminatedRoutineEx(JNIEnv* km_env, jclass km_clazz, jlong callbackroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeRegisterLogonSessionTerminatedRoutineEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackroutine;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeReportSecurityEventWithSubCategory(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcename, jlong usersid, jlong auditparameters, jint auditsubcategoryid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeReportSecurityEventWithSubCategory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcename, (void*)(uintptr_t)usersid, (void*)(uintptr_t)auditparameters, (uint32_t)auditsubcategoryid);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)flags;
    (void)sourcename;
    (void)usersid;
    (void)auditparameters;
    (void)auditsubcategoryid;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeSetAccessStateGenericMapping(JNIEnv* km_env, jclass km_clazz, jlong accessstate, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetAccessStateGenericMapping");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)accessstate, (void*)(uintptr_t)genericmapping);
    } else {
        errno = ENOSYS;
    }
#else
    (void)accessstate;
    (void)genericmapping;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfo(JNIEnv* km_env, jclass km_clazz, jlong object, jlong securityinformation, jlong modificationdescriptor, jlong objectssecuritydescriptor, jint pooltype, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetSecurityDescriptorInfo");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)securityinformation, (void*)(uintptr_t)modificationdescriptor, (void*)(uintptr_t)objectssecuritydescriptor, (int32_t)pooltype, (void*)(uintptr_t)genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)object;
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)pooltype;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeSetSecurityDescriptorInfoEx(JNIEnv* km_env, jclass km_clazz, jlong object, jlong securityinformation, jlong modificationdescriptor, jlong objectssecuritydescriptor, jint autoinheritflags, jint pooltype, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetSecurityDescriptorInfoEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)securityinformation, (void*)(uintptr_t)modificationdescriptor, (void*)(uintptr_t)objectssecuritydescriptor, (uint32_t)autoinheritflags, (int32_t)pooltype, (void*)(uintptr_t)genericmapping);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)object;
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)autoinheritflags;
    (void)pooltype;
    (void)genericmapping;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeShouldCheckForAccessRightsFromParent(JNIEnv* km_env, jclass km_clazz, jlong objecttype, jlong childdescriptor, jlong accessstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeShouldCheckForAccessRightsFromParent");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objecttype, (void*)(uintptr_t)childdescriptor, (void*)(uintptr_t)accessstate);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)objecttype;
    (void)childdescriptor;
    (void)accessstate;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeTokenFromAccessInformation(JNIEnv* km_env, jclass km_clazz, jlong accessinformation, jlong token, jint length, jlong requiredlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenFromAccessInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)accessinformation, (void*)(uintptr_t)token, (uint32_t)length, (void*)(uintptr_t)requiredlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)accessinformation;
    (void)token;
    (void)length;
    (void)requiredlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeTokenIsAdmin(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenIsAdmin");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)token;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeTokenIsRestricted(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenIsRestricted");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)token;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeTokenIsWriteRestricted(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenIsWriteRestricted");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)token;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeTokenType(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenType");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)token);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)token;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutine(JNIEnv* km_env, jclass km_clazz, jlong callbackroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeUnregisterLogonSessionTerminatedRoutine");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackroutine);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackroutine;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSeUnregisterLogonSessionTerminatedRoutineEx(JNIEnv* km_env, jclass km_clazz, jlong callbackroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeUnregisterLogonSessionTerminatedRoutineEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)context);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)callbackroutine;
    (void)context;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSecLookupAccountName(JNIEnv* km_env, jclass km_clazz, jlong name, jlong sidsize, jlong sid, jlong nameuse, jlong domainsize, jlong referenceddomain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecLookupAccountName");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)sidsize, (void*)(uintptr_t)sid, (void*)(uintptr_t)nameuse, (void*)(uintptr_t)domainsize, (void*)(uintptr_t)referenceddomain);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)name;
    (void)sidsize;
    (void)sid;
    (void)nameuse;
    (void)domainsize;
    (void)referenceddomain;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSecLookupAccountSid(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong namesize, jlong namebuffer, jlong domainsize, jlong domainbuffer, jlong nameuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecLookupAccountSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)namesize, (void*)(uintptr_t)namebuffer, (void*)(uintptr_t)domainsize, (void*)(uintptr_t)domainbuffer, (void*)(uintptr_t)nameuse);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sid;
    (void)namesize;
    (void)namebuffer;
    (void)domainsize;
    (void)domainbuffer;
    (void)nameuse;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSecLookupWellKnownSid(JNIEnv* km_env, jclass km_clazz, jint sidtype, jlong sid, jint sidbuffersize, jlong sidsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecLookupWellKnownSid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((int32_t)sidtype, (void*)(uintptr_t)sid, (uint32_t)sidbuffersize, (void*)(uintptr_t)sidsize);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sidtype;
    (void)sid;
    (void)sidbuffersize;
    (void)sidsize;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSecMakeSPN(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong instancename, jshort instanceport, jlong referrer, jlong spn, jlong length, jboolean allocate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecMakeSPN");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)instancename, (uint16_t)instanceport, (void*)(uintptr_t)referrer, (void*)(uintptr_t)spn, (void*)(uintptr_t)length, (bool)allocate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)spn;
    (void)length;
    (void)allocate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSecMakeSPNEx(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong instancename, jshort instanceport, jlong referrer, jlong targetinfo, jlong spn, jlong length, jboolean allocate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecMakeSPNEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)instancename, (uint16_t)instanceport, (void*)(uintptr_t)referrer, (void*)(uintptr_t)targetinfo, (void*)(uintptr_t)spn, (void*)(uintptr_t)length, (bool)allocate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)targetinfo;
    (void)spn;
    (void)length;
    (void)allocate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSecMakeSPNEx2(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong instancename, jshort instanceport, jlong referrer, jlong intargetinfo, jlong spn, jlong totalsize, jboolean allocate, jboolean istargetinfomarshaled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, void*, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecMakeSPNEx2");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)instancename, (uint16_t)instanceport, (void*)(uintptr_t)referrer, (void*)(uintptr_t)intargetinfo, (void*)(uintptr_t)spn, (void*)(uintptr_t)totalsize, (bool)allocate, (bool)istargetinfomarshaled);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)intargetinfo;
    (void)spn;
    (void)totalsize;
    (void)allocate;
    (void)istargetinfomarshaled;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSetContextAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetContextAttributesW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiAcceptSecurityContextAsync(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcredential, jlong phcontext, jlong pinput, jint fcontextreq, jint targetdatarep, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiAcceptSecurityContextAsync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput, (uint32_t)fcontextreq, (uint32_t)targetdatarep, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)asynccontext;
    (void)phcredential;
    (void)phcontext;
    (void)pinput;
    (void)fcontextreq;
    (void)targetdatarep;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiCreateAsyncContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiCreateAsyncContext");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiDeleteSecurityContextAsync(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiDeleteSecurityContextAsync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcontext);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)asynccontext;
    (void)phcontext;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiFreeAsyncContext(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiFreeAsyncContext");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
    }
#else
    (void)handle;
    errno = ENOSYS;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiFreeCredentialsHandleAsync(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiFreeCredentialsHandleAsync");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcredential);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)asynccontext;
    (void)phcredential;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiGetAsyncCallStatus(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiGetAsyncCallStatus");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncA(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiInitializeSecurityContextAsyncA");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)asynccontext;
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiInitializeSecurityContextAsyncW(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiInitializeSecurityContextAsyncW");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)asynccontext;
    (void)phcredential;
    (void)phcontext;
    (void)psztargetname;
    (void)fcontextreq;
    (void)reserved1;
    (void)targetdatarep;
    (void)pinput;
    (void)reserved2;
    (void)phnewcontext;
    (void)poutput;
    (void)pfcontextattr;
    (void)ptsexpiry;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiReinitAsyncContext(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiReinitAsyncContext");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemSspiSetAsyncNotifyCallback(JNIEnv* km_env, jclass km_clazz, jlong context, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiSetAsyncNotifyCallback");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)callback, (void*)(uintptr_t)callbackdata);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)context;
    (void)callback;
    (void)callbackdata;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemVerifySignature(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pmessage, jint messageseqno, jlong pfqop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifySignature");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno, (void*)(uintptr_t)pfqop);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwAccessCheckAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jint desiredaccess, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckAndAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)desiredaccess;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckByTypeAndAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckByTypeResultListAndAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwAccessCheckByTypeResultListAndAuditAlarmByHandle(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckByTypeResultListAndAuditAlarmByHandle");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)principalselfsid;
    (void)desiredaccess;
    (void)audittype;
    (void)flags;
    (void)objecttypelist;
    (void)objecttypelistlength;
    (void)genericmapping;
    (void)objectcreation;
    (void)grantedaccess;
    (void)accessstatus;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwAdjustGroupsToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jboolean resettodefault, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAdjustGroupsToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (bool)resettodefault, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwAdjustPrivilegesToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jboolean disableallprivileges, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAdjustPrivilegesToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (bool)disableallprivileges, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong zerobits, jlong regionsize, jint allocationtype, jint protect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAllocateVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (uint64_t)zerobits, (void*)(uintptr_t)regionsize, (uint32_t)allocationtype, (uint32_t)protect);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)regionsize;
    (void)allocationtype;
    (void)protect;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwAllocateVirtualMemoryEx(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jint allocationtype, jint pageprotection, jlong extendedparameters, jint extendedparametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAllocateVirtualMemoryEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (uint32_t)allocationtype, (uint32_t)pageprotection, (void*)(uintptr_t)extendedparameters, (uint32_t)extendedparametercount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)extendedparametercount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwCancelIoFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iorequesttocancel, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCancelIoFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iorequesttocancel, (void*)(uintptr_t)iostatusblock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iorequesttocancel;
    (void)iostatusblock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwCloseObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jboolean generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCloseObjectAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (bool)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwCreateDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateDirectoryObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)directoryhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwCreateEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jint desiredaccess, jlong objectattributes, jint eventtype, jboolean initialstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)eventhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (int32_t)eventtype, (bool)initialstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)eventtype;
    (void)initialstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwCreateSectionEx(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jlong filehandle, jlong extendedparameters, jint extendedparametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateSectionEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sectionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)extendedparameters, (uint32_t)extendedparametercount);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    (void)extendedparameters;
    (void)extendedparametercount;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwDeleteFile(JNIEnv* km_env, jclass km_clazz, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwDeleteObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jboolean generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteObjectAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (bool)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwDuplicateObject(JNIEnv* km_env, jclass km_clazz, jlong sourceprocesshandle, jlong sourcehandle, jlong targetprocesshandle, jlong targethandle, jint desiredaccess, jint handleattributes, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDuplicateObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourceprocesshandle, (void*)(uintptr_t)sourcehandle, (void*)(uintptr_t)targetprocesshandle, (void*)(uintptr_t)targethandle, (uint32_t)desiredaccess, (uint32_t)handleattributes, (uint32_t)options);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourceprocesshandle;
    (void)sourcehandle;
    (void)targetprocesshandle;
    (void)targethandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)options;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwDuplicateToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint desiredaccess, jlong objectattributes, jboolean effectiveonly, jint tokentype, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDuplicateToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (bool)effectiveonly, (int32_t)tokentype, (void*)(uintptr_t)newtokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)existingtokenhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)effectiveonly;
    (void)tokentype;
    (void)newtokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwFilterToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint flags, jlong sidstodisable, jlong privilegestodelete, jlong restrictedsids, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFilterToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)flags, (void*)(uintptr_t)sidstodisable, (void*)(uintptr_t)privilegestodelete, (void*)(uintptr_t)restrictedsids, (void*)(uintptr_t)newtokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)newtokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwFlushBuffersFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushBuffersFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwFlushBuffersFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint flags, jlong parameters, jint parameterssize, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushBuffersFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)flags, (void*)(uintptr_t)parameters, (uint32_t)parameterssize, (void*)(uintptr_t)iostatusblock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)flags;
    (void)parameters;
    (void)parameterssize;
    (void)iostatusblock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwFlushVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (void*)(uintptr_t)iostatus);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)iostatus;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwFreeVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jint freetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFreeVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (uint32_t)freetype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)freetype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwFsControlFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint fscontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFsControlFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)fscontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwImpersonateAnonymousToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwImpersonateAnonymousToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwLockFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong byteoffset, jlong length, jint key, jboolean failimmediately, jboolean exclusivelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwLockFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)length, (uint32_t)key, (bool)failimmediately, (bool)exclusivelock);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    (void)failimmediately;
    (void)exclusivelock;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwNotifyChangeKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint completionfilter, jboolean watchtree, jlong buffer, jint buffersize, jboolean asynchronous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, bool, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwNotifyChangeKey");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)completionfilter, (bool)watchtree, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (bool)asynchronous);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)keyhandle;
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwOpenDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenDirectoryObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)directoryhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwOpenObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong clienttoken, jint desiredaccess, jint grantedaccess, jlong privileges, jboolean objectcreation, jboolean accessgranted, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, bool, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenObjectAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)grantedaccess, (void*)(uintptr_t)privileges, (bool)objectcreation, (bool)accessgranted, (void*)(uintptr_t)generateonclose);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)objecttypename;
    (void)objectname;
    (void)securitydescriptor;
    (void)clienttoken;
    (void)desiredaccess;
    (void)grantedaccess;
    (void)privileges;
    (void)objectcreation;
    (void)accessgranted;
    (void)generateonclose;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwOpenProcessToken(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenProcessToken");
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwOpenProcessTokenEx(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jint handleattributes, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenProcessTokenEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)desiredaccess, (uint32_t)handleattributes, (void*)(uintptr_t)tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwOpenThreadToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint desiredaccess, jboolean openasself, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenThreadToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)desiredaccess, (bool)openasself, (void*)(uintptr_t)tokenhandle);
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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwOpenThreadTokenEx(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint desiredaccess, jboolean openasself, jint handleattributes, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenThreadTokenEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)desiredaccess, (bool)openasself, (uint32_t)handleattributes, (void*)(uintptr_t)tokenhandle);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)handleattributes;
    (void)tokenhandle;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwPrivilegeCheck(JNIEnv* km_env, jclass km_clazz, jlong clienttoken, jlong requiredprivileges, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrivilegeCheck");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)clienttoken, (void*)(uintptr_t)requiredprivileges, (void*)(uintptr_t)result);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)result;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwPrivilegeObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jint desiredaccess, jlong privileges, jboolean accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrivilegeObjectAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)privileges, (bool)accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwPrivilegedServiceAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong servicename, jlong clienttoken, jlong privileges, jboolean accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrivilegedServiceAuditAlarm");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)servicename, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)privileges, (bool)accessgranted);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jboolean returnsingleentry, jlong filename, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, bool, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryDirectoryFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (bool)returnsingleentry, (void*)(uintptr_t)filename, (bool)restartscan);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)returnsingleentry;
    (void)filename;
    (void)restartscan;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryDirectoryFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jint queryflags, jlong filename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryDirectoryFileEx");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (uint32_t)queryflags, (void*)(uintptr_t)filename);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)event;
    (void)apcroutine;
    (void)apccontext;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)queryflags;
    (void)filename;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jlong buffer, jint length, jboolean returnsingleentry, jboolean restartscan, jlong context, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryDirectoryObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)directoryhandle, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (bool)restartscan, (void*)(uintptr_t)context, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)directoryhandle;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)restartscan;
    (void)context;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryEaFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong ealist, jint ealistlength, jlong eaindex, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryEaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)ealist, (uint32_t)ealistlength, (void*)(uintptr_t)eaindex, (bool)restartscan);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)ealist;
    (void)ealistlength;
    (void)eaindex;
    (void)restartscan;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryFullAttributesFile(JNIEnv* km_env, jclass km_clazz, jlong objectattributes, jlong fileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryFullAttributesFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)objectattributes, (void*)(uintptr_t)fileinformation);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)objectattributes;
    (void)fileinformation;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryInformationToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint objectinformationclass, jlong objectinformation, jint objectinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (int32_t)objectinformationclass, (void*)(uintptr_t)objectinformation, (uint32_t)objectinformationlength, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)objectinformationclass;
    (void)objectinformation;
    (void)objectinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong sidlist, jint sidlistlength, jlong startsid, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryQuotaInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)sidlist, (uint32_t)sidlistlength, (void*)(uintptr_t)startsid, (bool)restartscan);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)sidlist;
    (void)sidlistlength;
    (void)startsid;
    (void)restartscan;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQuerySecurityObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor, jint length, jlong lengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQuerySecurityObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor, (uint32_t)length, (void*)(uintptr_t)lengthneeded);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jint memoryinformationclass, jlong memoryinformation, jlong memoryinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (int32_t)memoryinformationclass, (void*)(uintptr_t)memoryinformation, (uint64_t)memoryinformationlength, (void*)(uintptr_t)returnlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)baseaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationlength;
    (void)returnlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwQueryVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryVolumeInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwSetEaFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetEaFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwSetEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jlong previousstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetEvent");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)eventhandle, (void*)(uintptr_t)previousstate);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)eventhandle;
    (void)previousstate;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwSetInformationToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationToken");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwSetInformationVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint vminformationclass, jlong numberofentries, jlong virtualaddresses, jlong vminformation, jint vminformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationVirtualMemory");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)processhandle, (int32_t)vminformationclass, (uint64_t)numberofentries, (void*)(uintptr_t)virtualaddresses, (void*)(uintptr_t)vminformation, (uint32_t)vminformationlength);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)processhandle;
    (void)vminformationclass;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)vminformation;
    (void)vminformationlength;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwSetQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetQuotaInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwSetSecurityObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetSecurityObject");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwSetVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetVolumeInformationFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssysWindowsWdkStorageFilesystemZwUnlockFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong byteoffset, jlong length, jint key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwUnlockFile");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)length, (uint32_t)key);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

