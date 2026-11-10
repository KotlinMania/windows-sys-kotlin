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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1applyControlToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pinput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyControlToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput) : -1;
#else
    (void)phcontext;
    (void)pinput;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccAsyncCopyRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer, jlong iostatus, jlong ioissuerthread, jlong asyncreadcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcAsyncCopyRead");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus, (int64_t)ioissuerthread, (void*)(uintptr_t)asyncreadcontext) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    (void)ioissuerthread;
    (void)asyncreadcontext;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccCanIWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint bytestowrite, jboolean wait, jbyte retrying) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, bool, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCanIWrite");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)bytestowrite, (bool)wait, (uint8_t)retrying) : false;
#else
    (void)fileobject;
    (void)bytestowrite;
    (void)wait;
    (void)retrying;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccCoherencyFlushAndPurgeCache(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jlong fileoffset, jint length, jlong iostatus, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCoherencyFlushAndPurgeCache");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (void*)(uintptr_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)iostatus, (uint32_t)flags);
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)iostatus;
    (void)flags;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccCopyRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyRead");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccCopyReadEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer, jlong iostatus, jlong ioissuerthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyReadEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus, (int64_t)ioissuerthread) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)iostatus;
    (void)ioissuerthread;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccCopyWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyWrite");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccCopyWriteEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jlong buffer, jlong ioissuerthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyWriteEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (void*)(uintptr_t)buffer, (int64_t)ioissuerthread) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)buffer;
    (void)ioissuerthread;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccCopyWriteWontFlush(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcCopyWriteWontFlush");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccDeferWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong postroutine, jlong context1, jlong context2, jint bytestowrite, jboolean retrying) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcDeferWrite");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)postroutine, (void*)(uintptr_t)context1, (void*)(uintptr_t)context2, (uint32_t)bytestowrite, (bool)retrying);
#else
    (void)fileobject;
    (void)postroutine;
    (void)context1;
    (void)context2;
    (void)bytestowrite;
    (void)retrying;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccErrorCallbackRoutine(JNIEnv* km_env, jclass km_clazz, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcErrorCallbackRoutine");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context) : -1;
#else
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccFastCopyRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fileoffset, jint length, jint pagecount, jlong buffer, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcFastCopyRead");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)fileoffset, (uint32_t)length, (uint32_t)pagecount, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)pagecount;
    (void)buffer;
    (void)iostatus;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccFastCopyWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fileoffset, jint length, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcFastCopyWrite");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)buffer);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)buffer;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccFlushCache(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jlong fileoffset, jint length, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcFlushCache");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (void*)(uintptr_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)iostatus);
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)iostatus;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccGetDirtyPages(JNIEnv* km_env, jclass km_clazz, jlong loghandle, jlong dirtypageroutine, jlong context1, jlong context2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetDirtyPages");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)loghandle, (void*)(uintptr_t)dirtypageroutine, (void*)(uintptr_t)context1, (void*)(uintptr_t)context2) : -1;
#else
    (void)loghandle;
    (void)dirtypageroutine;
    (void)context1;
    (void)context2;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccGetFileObjectFromBcb(JNIEnv* km_env, jclass km_clazz, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFileObjectFromBcb");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bcb) : NULL;
#else
    (void)bcb;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccGetFileObjectFromSectionPtrs(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFileObjectFromSectionPtrs");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionobjectpointer) : NULL;
#else
    (void)sectionobjectpointer;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccGetFileObjectFromSectionPtrsRef(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFileObjectFromSectionPtrsRef");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionobjectpointer) : NULL;
#else
    (void)sectionobjectpointer;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccGetFlushedValidData(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jboolean bcblistheld) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcGetFlushedValidData");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (bool)bcblistheld) : -1;
#else
    (void)sectionobjectpointer;
    (void)bcblistheld;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccInitializeCacheMap(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesizes, jboolean pinaccess, jlong callbacks, jlong lazywritecontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcInitializeCacheMap");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesizes, (bool)pinaccess, (void*)(uintptr_t)callbacks, (void*)(uintptr_t)lazywritecontext);
#else
    (void)fileobject;
    (void)filesizes;
    (void)pinaccess;
    (void)callbacks;
    (void)lazywritecontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccInitializeCacheMapEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesizes, jboolean pinaccess, jlong callbacks, jlong lazywritecontext, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcInitializeCacheMapEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesizes, (bool)pinaccess, (void*)(uintptr_t)callbacks, (void*)(uintptr_t)lazywritecontext, (uint32_t)flags);
#else
    (void)fileobject;
    (void)filesizes;
    (void)pinaccess;
    (void)callbacks;
    (void)lazywritecontext;
    (void)flags;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccIsCacheManagerCallbackNeeded(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcIsCacheManagerCallbackNeeded");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)status) : false;
#else
    (void)status;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccIsThereDirtyData(JNIEnv* km_env, jclass km_clazz, jlong vpb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcIsThereDirtyData");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vpb) : false;
#else
    (void)vpb;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccIsThereDirtyDataEx(JNIEnv* km_env, jclass km_clazz, jlong vpb, jlong numberofdirtypages) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcIsThereDirtyDataEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)vpb, (void*)(uintptr_t)numberofdirtypages) : false;
#else
    (void)vpb;
    (void)numberofdirtypages;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccMapData(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint flags, jlong bcb, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMapData");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)flags, (void*)(uintptr_t)bcb, (void*)(uintptr_t)buffer) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    (void)buffer;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccMdlRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlRead");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)mdlchain;
    (void)iostatus;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccMdlReadComplete(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlReadComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)mdlchain);
#else
    (void)fileobject;
    (void)mdlchain;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccMdlWriteAbort(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlWriteAbort");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)mdlchain);
#else
    (void)fileobject;
    (void)mdlchain;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccMdlWriteComplete(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jlong mdlchain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcMdlWriteComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)mdlchain);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccPinMappedData(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint flags, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPinMappedData");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)flags, (void*)(uintptr_t)bcb) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccPinRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint flags, jlong bcb, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPinRead");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)flags, (void*)(uintptr_t)bcb, (void*)(uintptr_t)buffer) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)flags;
    (void)bcb;
    (void)buffer;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccPrepareMdlWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPrepareMdlWrite");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)mdlchain;
    (void)iostatus;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccPreparePinWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean zero, jint flags, jlong bcb, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPreparePinWrite");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)zero, (uint32_t)flags, (void*)(uintptr_t)bcb, (void*)(uintptr_t)buffer) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)zero;
    (void)flags;
    (void)bcb;
    (void)buffer;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccPurgeCacheSection(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jlong fileoffset, jint length, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcPurgeCacheSection");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)flags) : false;
#else
    (void)sectionobjectpointer;
    (void)fileoffset;
    (void)length;
    (void)flags;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccRemapBcb(JNIEnv* km_env, jclass km_clazz, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcRemapBcb");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bcb) : NULL;
#else
    (void)bcb;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccRepinBcb(JNIEnv* km_env, jclass km_clazz, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcRepinBcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bcb);
#else
    (void)bcb;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccScheduleReadAhead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcScheduleReadAhead");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccScheduleReadAheadEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jlong ioissuerthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcScheduleReadAheadEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (int64_t)ioissuerthread);
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)ioissuerthread;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetAdditionalCacheAttributes(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jboolean disablereadahead, jboolean disablewritebehind) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetAdditionalCacheAttributes");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (bool)disablereadahead, (bool)disablewritebehind);
#else
    (void)fileobject;
    (void)disablereadahead;
    (void)disablewritebehind;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetAdditionalCacheAttributesEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetAdditionalCacheAttributesEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)flags);
#else
    (void)fileobject;
    (void)flags;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetBcbOwnerPointer(JNIEnv* km_env, jclass km_clazz, jlong bcb, jlong ownerpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetBcbOwnerPointer");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bcb, (void*)(uintptr_t)ownerpointer);
#else
    (void)bcb;
    (void)ownerpointer;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetDirtyPageThreshold(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint dirtypagethreshold) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetDirtyPageThreshold");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)dirtypagethreshold);
#else
    (void)fileobject;
    (void)dirtypagethreshold;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetDirtyPinnedData(JNIEnv* km_env, jclass km_clazz, jlong bcbvoid, jlong lsn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetDirtyPinnedData");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bcbvoid, (void*)(uintptr_t)lsn);
#else
    (void)bcbvoid;
    (void)lsn;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetFileSizes(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesizes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetFileSizes");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesizes);
#else
    (void)fileobject;
    (void)filesizes;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetFileSizesEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesizes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetFileSizesEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesizes) : -1;
#else
    (void)fileobject;
    (void)filesizes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetLogHandleForFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong loghandle, jlong flushtolsnroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetLogHandleForFile");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)loghandle, (void*)(uintptr_t)flushtolsnroutine);
#else
    (void)fileobject;
    (void)loghandle;
    (void)flushtolsnroutine;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetParallelFlushFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jboolean enableparallelflush) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetParallelFlushFile");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (bool)enableparallelflush);
#else
    (void)fileobject;
    (void)enableparallelflush;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccSetReadAheadGranularity(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint granularity) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcSetReadAheadGranularity");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)granularity);
#else
    (void)fileobject;
    (void)granularity;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccUninitializeCacheMap(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong truncatesize, jlong uninitializeevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUninitializeCacheMap");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)truncatesize, (void*)(uintptr_t)uninitializeevent) : false;
#else
    (void)fileobject;
    (void)truncatesize;
    (void)uninitializeevent;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccUnpinData(JNIEnv* km_env, jclass km_clazz, jlong bcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUnpinData");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bcb);
#else
    (void)bcb;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccUnpinDataForThread(JNIEnv* km_env, jclass km_clazz, jlong bcb, jlong resourcethreadid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUnpinDataForThread");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bcb, (uint64_t)resourcethreadid);
#else
    (void)bcb;
    (void)resourcethreadid;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccUnpinRepinnedBcb(JNIEnv* km_env, jclass km_clazz, jlong bcb, jboolean writethrough, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcUnpinRepinnedBcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)bcb, (bool)writethrough, (void*)(uintptr_t)iostatus);
#else
    (void)bcb;
    (void)writethrough;
    (void)iostatus;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccWaitForCurrentLazyWriterActivity(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcWaitForCurrentLazyWriterActivity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ccZeroData(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong startoffset, jlong endoffset, jboolean wait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CcZeroData");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)startoffset, (void*)(uintptr_t)endoffset, (bool)wait) : false;
#else
    (void)fileobject;
    (void)startoffset;
    (void)endoffset;
    (void)wait;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1completeAuthToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong ptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompleteAuthToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)ptoken) : -1;
#else
    (void)phcontext;
    (void)ptoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1exDisableResourceBoostLite(JNIEnv* km_env, jclass km_clazz, jlong resource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExDisableResourceBoostLite");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)resource);
#else
    (void)resource;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1exQueryPoolBlockSize(JNIEnv* km_env, jclass km_clazz, jlong poolblock, jlong quotacharged) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExQueryPoolBlockSize");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poolblock, (void*)(uintptr_t)quotacharged) : 0;
#else
    (void)poolblock;
    (void)quotacharged;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1exportSecurityContext(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fflags, jlong ppackedcontext, jlong ptoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExportSecurityContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fflags, (void*)(uintptr_t)ppackedcontext, (void*)(uintptr_t)ptoken) : -1;
#else
    (void)phcontext;
    (void)fflags;
    (void)ppackedcontext;
    (void)ptoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAcknowledgeEcp(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAcknowledgeEcp");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ecpcontext);
#else
    (void)ecpcontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAcquireFileExclusive(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAcquireFileExclusive");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject);
#else
    (void)fileobject;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAddBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddBaseMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)lbn, (int64_t)sectorcount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAddBaseMcbEntryEx(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddBaseMcbEntryEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)lbn, (int64_t)sectorcount) : -1;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAddLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddLargeMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)lbn, (int64_t)sectorcount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAddMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint vbn, jint lbn, jint sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)vbn, (uint32_t)lbn, (uint32_t)sectorcount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAddToTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey, jlong shortname, jlong longname, jboolean keybyshortname, jint datalength, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddToTunnelCache");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey, (void*)(uintptr_t)shortname, (void*)(uintptr_t)longname, (bool)keybyshortname, (uint32_t)datalength, (void*)(uintptr_t)data);
#else
    (void)cache;
    (void)directorykey;
    (void)shortname;
    (void)longname;
    (void)keybyshortname;
    (void)datalength;
    (void)data;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAddToTunnelCacheEx(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey, jlong shortname, jlong longname, jint flags, jint datalength, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAddToTunnelCacheEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey, (void*)(uintptr_t)shortname, (void*)(uintptr_t)longname, (uint32_t)flags, (uint32_t)datalength, (void*)(uintptr_t)data);
#else
    (void)cache;
    (void)directorykey;
    (void)shortname;
    (void)longname;
    (void)flags;
    (void)datalength;
    (void)data;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAllocateAePushLock(JNIEnv* km_env, jclass km_clazz, jint pooltype, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateAePushLock");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)pooltype, (uint32_t)tag) : NULL;
#else
    (void)pooltype;
    (void)tag;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAllocateExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecptype, jint sizeofcontext, jint flags, jlong cleanupcallback, jint pooltag, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ecptype, (uint32_t)sizeofcontext, (uint32_t)flags, (void*)(uintptr_t)cleanupcallback, (uint32_t)pooltag, (void*)(uintptr_t)ecpcontext) : -1;
#else
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)pooltag;
    (void)ecpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAllocateExtraCreateParameterFromLookasideList(JNIEnv* km_env, jclass km_clazz, jlong ecptype, jint sizeofcontext, jint flags, jlong cleanupcallback, jlong lookasidelist, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameterFromLookasideList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ecptype, (uint32_t)sizeofcontext, (uint32_t)flags, (void*)(uintptr_t)cleanupcallback, (void*)(uintptr_t)lookasidelist, (void*)(uintptr_t)ecpcontext) : -1;
#else
    (void)ecptype;
    (void)sizeofcontext;
    (void)flags;
    (void)cleanupcallback;
    (void)lookasidelist;
    (void)ecpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAllocateExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jint flags, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateExtraCreateParameterList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)ecplist) : -1;
#else
    (void)flags;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAllocateFileLock(JNIEnv* km_env, jclass km_clazz, jlong completelockirproutine, jlong unlockroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateFileLock");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)completelockirproutine, (void*)(uintptr_t)unlockroutine) : NULL;
#else
    (void)completelockirproutine;
    (void)unlockroutine;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAllocateResource(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAllocateResource");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAreNamesEqual(JNIEnv* km_env, jclass km_clazz, jlong constantnamea, jlong constantnameb, jboolean ignorecase, jlong upcasetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreNamesEqual");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)constantnamea, (void*)(uintptr_t)constantnameb, (bool)ignorecase, (void*)(uintptr_t)upcasetable) : false;
#else
    (void)constantnamea;
    (void)constantnameb;
    (void)ignorecase;
    (void)upcasetable;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAreThereCurrentOrInProgressFileLocks(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreThereCurrentOrInProgressFileLocks");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock) : false;
#else
    (void)filelock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAreThereWaitingFileLocks(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreThereWaitingFileLocks");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock) : false;
#else
    (void)filelock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlAreVolumeStartupApplicationsComplete(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlAreVolumeStartupApplicationsComplete");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlBalanceReads(JNIEnv* km_env, jclass km_clazz, jlong targetdevice) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlBalanceReads");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)targetdevice) : -1;
#else
    (void)targetdevice;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCancellableWaitForMultipleObjects(JNIEnv* km_env, jclass km_clazz, jint count, jlong objectarray, jint waittype, jlong timeout, jlong waitblockarray, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCancellableWaitForMultipleObjects");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)count, (void*)(uintptr_t)objectarray, (int32_t)waittype, (void*)(uintptr_t)timeout, (void*)(uintptr_t)waitblockarray, (void*)(uintptr_t)irp) : -1;
#else
    (void)count;
    (void)objectarray;
    (void)waittype;
    (void)timeout;
    (void)waitblockarray;
    (void)irp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCancellableWaitForSingleObject(JNIEnv* km_env, jclass km_clazz, jlong object, jlong timeout, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCancellableWaitForSingleObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)timeout, (void*)(uintptr_t)irp) : -1;
#else
    (void)object;
    (void)timeout;
    (void)irp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlChangeBackingFileObject(JNIEnv* km_env, jclass km_clazz, jlong currentfileobject, jlong newfileobject, jint changebackingtype, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlChangeBackingFileObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)currentfileobject, (void*)(uintptr_t)newfileobject, (int32_t)changebackingtype, (uint32_t)flags) : -1;
#else
    (void)currentfileobject;
    (void)newfileobject;
    (void)changebackingtype;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCheckLockForOplockRequest(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong allocationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckLockForOplockRequest");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)allocationsize) : false;
#else
    (void)filelock;
    (void)allocationsize;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCheckLockForReadAccess(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckLockForReadAccess");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)irp) : false;
#else
    (void)filelock;
    (void)irp;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCheckLockForWriteAccess(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckLockForWriteAccess");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)irp) : false;
#else
    (void)filelock;
    (void)irp;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCheckOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckOplock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCheckOplockEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckOplockEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCheckOplockEx2(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jint flagsex2, jlong completionroutinecontext, jlong completionroutine, jlong postirproutine, jlong timeout, jlong notifycontext, jlong notifyroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckOplockEx2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (uint32_t)flagsex2, (void*)(uintptr_t)completionroutinecontext, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine, (uint64_t)timeout, (void*)(uintptr_t)notifycontext, (void*)(uintptr_t)notifyroutine) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCheckUpperOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock, jint newloweroplockstate, jlong completionroutinecontext, jlong completionroutine, jlong prependroutine, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCheckUpperOplock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (uint32_t)newloweroplockstate, (void*)(uintptr_t)completionroutinecontext, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)prependroutine, (uint32_t)flags) : -1;
#else
    (void)oplock;
    (void)newloweroplockstate;
    (void)completionroutinecontext;
    (void)completionroutine;
    (void)prependroutine;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCopyRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jint lockkey, jlong buffer, jlong iostatus, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCopyRead");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (uint32_t)lockkey, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)lockkey;
    (void)buffer;
    (void)iostatus;
    (void)deviceobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCopyWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jboolean wait, jint lockkey, jlong buffer, jlong iostatus, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCopyWrite");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (bool)wait, (uint32_t)lockkey, (void*)(uintptr_t)buffer, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)wait;
    (void)lockkey;
    (void)buffer;
    (void)iostatus;
    (void)deviceobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCreateSectionForDataScan(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jlong sectionobject, jlong sectionfilesize, jlong fileobject, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCreateSectionForDataScan");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionhandle, (void*)(uintptr_t)sectionobject, (void*)(uintptr_t)sectionfilesize, (void*)(uintptr_t)fileobject, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (uint32_t)flags) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCurrentBatchOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCurrentBatchOplock");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCurrentOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCurrentOplock");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlCurrentOplockH(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlCurrentOplockH");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlDeleteExtraCreateParameterLookasideList(JNIEnv* km_env, jclass km_clazz, jlong lookaside, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeleteExtraCreateParameterLookasideList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lookaside, (uint32_t)flags);
#else
    (void)lookaside;
    (void)flags;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlDeleteKeyFromTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeleteKeyFromTunnelCache");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey);
#else
    (void)cache;
    (void)directorykey;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlDeleteTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeleteTunnelCache");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)cache);
#else
    (void)cache;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlDeregisterUncProvider(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDeregisterUncProvider");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle);
#else
    (void)handle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlDismountComplete(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jint dismountstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDismountComplete");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)deviceobject, (int32_t)dismountstatus);
#else
    (void)deviceobject;
    (void)dismountstatus;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlDissectDbcs(JNIEnv* km_env, jclass km_clazz, jstring path, jlong firstname, jlong remainingname) {
    (void)km_env;
    (void)km_clazz;
    const char* path_utf = (path != NULL) ? (*km_env)->GetStringUTFChars(km_env, path, NULL) : NULL;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(const char*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDissectDbcs");
    }
    if (km_fn_ptr != NULL) km_fn_ptr(path_utf, (void*)(uintptr_t)firstname, (void*)(uintptr_t)remainingname);
#else
    (void)firstname;
    (void)remainingname;
#endif
    if (path != NULL && path_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, path, path_utf);
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlDoesDbcsContainWildCards(JNIEnv* km_env, jclass km_clazz, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDoesDbcsContainWildCards");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name) : false;
#else
    (void)name;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlDoesNameContainWildCards(JNIEnv* km_env, jclass km_clazz, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlDoesNameContainWildCards");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name) : false;
#else
    (void)name;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFastCheckLockForRead(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong startingbyte, jlong length, jint key, jlong fileobject, jlong processid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastCheckLockForRead");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)startingbyte, (void*)(uintptr_t)length, (uint32_t)key, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)processid) : false;
#else
    (void)filelock;
    (void)startingbyte;
    (void)length;
    (void)key;
    (void)fileobject;
    (void)processid;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFastCheckLockForWrite(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong startingbyte, jlong length, jint key, jlong fileobject, jlong processid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastCheckLockForWrite");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)startingbyte, (void*)(uintptr_t)length, (uint32_t)key, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)processid) : false;
#else
    (void)filelock;
    (void)startingbyte;
    (void)length;
    (void)key;
    (void)fileobject;
    (void)processid;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFastUnlockAll(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong fileobject, jlong processid, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastUnlockAll");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)fileobject, (int64_t)processid, (void*)(uintptr_t)context) : -1;
#else
    (void)filelock;
    (void)fileobject;
    (void)processid;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFastUnlockAllByKey(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong fileobject, jlong processid, jint key, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastUnlockAllByKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)fileobject, (int64_t)processid, (uint32_t)key, (void*)(uintptr_t)context) : -1;
#else
    (void)filelock;
    (void)fileobject;
    (void)processid;
    (void)key;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFastUnlockSingle(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong fileobject, jlong fileoffset, jlong length, jlong processid, jint key, jlong context, jboolean alreadysynchronized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFastUnlockSingle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)length, (int64_t)processid, (uint32_t)key, (void*)(uintptr_t)context, (bool)alreadysynchronized) : -1;
#else
    (void)filelock;
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)processid;
    (void)key;
    (void)context;
    (void)alreadysynchronized;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFindExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecplist, jlong ecptype, jlong ecpcontext, jlong ecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFindExtraCreateParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)ecpcontext, (void*)(uintptr_t)ecpcontextsize) : -1;
#else
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFindInTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey, jlong name, jlong shortname, jlong longname, jlong datalength, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFindInTunnelCache");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey, (void*)(uintptr_t)name, (void*)(uintptr_t)shortname, (void*)(uintptr_t)longname, (void*)(uintptr_t)datalength, (void*)(uintptr_t)data) : false;
#else
    (void)cache;
    (void)directorykey;
    (void)name;
    (void)shortname;
    (void)longname;
    (void)datalength;
    (void)data;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFindInTunnelCacheEx(JNIEnv* km_env, jclass km_clazz, jlong cache, jlong directorykey, jlong name, jlong shortname, jlong longname, jint flags, jlong datalength, jlong data) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFindInTunnelCacheEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)cache, (uint64_t)directorykey, (void*)(uintptr_t)name, (void*)(uintptr_t)shortname, (void*)(uintptr_t)longname, (uint32_t)flags, (void*)(uintptr_t)datalength, (void*)(uintptr_t)data) : false;
#else
    (void)cache;
    (void)directorykey;
    (void)name;
    (void)shortname;
    (void)longname;
    (void)flags;
    (void)datalength;
    (void)data;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFreeAePushLock(JNIEnv* km_env, jclass km_clazz, jlong aepushlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeAePushLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)aepushlock);
#else
    (void)aepushlock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFreeExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeExtraCreateParameter");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ecpcontext);
#else
    (void)ecpcontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFreeExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeExtraCreateParameterList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ecplist);
#else
    (void)ecplist;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlFreeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlFreeFileLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filelock);
#else
    (void)filelock;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetCurrentProcessLoaderList(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetCurrentProcessLoaderList");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetEcpListFromIrp(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetEcpListFromIrp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)ecplist) : -1;
#else
    (void)irp;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetFileSize(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong filesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetFileSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)filesize) : -1;
#else
    (void)fileobject;
    (void)filesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetNextBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint runindex, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextBaseMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)runindex, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcount) : false;
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetNextExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecplist, jlong currentecpcontext, jlong nextecptype, jlong nextecpcontext, jlong nextecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextExtraCreateParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ecplist, (void*)(uintptr_t)currentecpcontext, (void*)(uintptr_t)nextecptype, (void*)(uintptr_t)nextecpcontext, (void*)(uintptr_t)nextecpcontextsize) : -1;
#else
    (void)ecplist;
    (void)currentecpcontext;
    (void)nextecptype;
    (void)nextecpcontext;
    (void)nextecpcontextsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetNextFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jboolean restart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextFileLock");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (bool)restart) : NULL;
#else
    (void)filelock;
    (void)restart;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetNextLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint runindex, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextLargeMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)runindex, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcount) : false;
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetNextMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint runindex, jlong vbn, jlong lbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetNextMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)runindex, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcount) : false;
#else
    (void)mcb;
    (void)runindex;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetSectorSizeInformation(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jlong sectorsizeinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetSectorSizeInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject, (void*)(uintptr_t)sectorsizeinfo) : -1;
#else
    (void)deviceobject;
    (void)sectorsizeinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetSupportedFeatures(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jlong supportedfeatures) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetSupportedFeatures");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject, (void*)(uintptr_t)supportedfeatures) : -1;
#else
    (void)deviceobject;
    (void)supportedfeatures;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlGetVirtualDiskNestingLevel(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jlong nestinglevel, jlong nestingflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlGetVirtualDiskNestingLevel");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject, (void*)(uintptr_t)nestinglevel, (void*)(uintptr_t)nestingflags) : -1;
#else
    (void)deviceobject;
    (void)nestinglevel;
    (void)nestingflags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIncrementCcFastMdlReadWait(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastMdlReadWait");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIncrementCcFastReadNoWait(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadNoWait");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIncrementCcFastReadNotPossible(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadNotPossible");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIncrementCcFastReadResourceMiss(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadResourceMiss");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIncrementCcFastReadWait(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIncrementCcFastReadWait");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitExtraCreateParameterLookasideList(JNIEnv* km_env, jclass km_clazz, jlong lookaside, jint flags, jlong size, jint tag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitExtraCreateParameterLookasideList");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lookaside, (uint32_t)flags, (uint64_t)size, (uint32_t)tag);
#else
    (void)lookaside;
    (void)flags;
    (void)size;
    (void)tag;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitializeBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint pooltype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeBaseMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb, (int32_t)pooltype);
#else
    (void)mcb;
    (void)pooltype;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitializeBaseMcbEx(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint pooltype, jshort flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeBaseMcbEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (int32_t)pooltype, (uint16_t)flags) : false;
#else
    (void)mcb;
    (void)pooltype;
    (void)flags;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitializeExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecp, jint ecpflags, jlong cleanupcallback, jint totalsize, jlong ecptype, jlong listallocatedfrom) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeExtraCreateParameter");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ecp, (uint32_t)ecpflags, (void*)(uintptr_t)cleanupcallback, (uint32_t)totalsize, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)listallocatedfrom);
#else
    (void)ecp;
    (void)ecpflags;
    (void)cleanupcallback;
    (void)totalsize;
    (void)ecptype;
    (void)listallocatedfrom;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitializeExtraCreateParameterList(JNIEnv* km_env, jclass km_clazz, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeExtraCreateParameterList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ecplist) : -1;
#else
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitializeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong completelockirproutine, jlong unlockroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeFileLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)completelockirproutine, (void*)(uintptr_t)unlockroutine);
#else
    (void)filelock;
    (void)completelockirproutine;
    (void)unlockroutine;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitializeLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint pooltype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeLargeMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb, (int32_t)pooltype);
#else
    (void)mcb;
    (void)pooltype;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitializeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint pooltype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb, (int32_t)pooltype);
#else
    (void)mcb;
    (void)pooltype;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitializeOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeOplock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)oplock);
#else
    (void)oplock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInitializeTunnelCache(JNIEnv* km_env, jclass km_clazz, jlong cache) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInitializeTunnelCache");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)cache);
#else
    (void)cache;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInsertExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecplist, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertExtraCreateParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecpcontext) : -1;
#else
    (void)ecplist;
    (void)ecpcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInsertPerFileContext(JNIEnv* km_env, jclass km_clazz, jlong perfilecontextpointer, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertPerFileContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)perfilecontextpointer, (void*)(uintptr_t)ptr) : -1;
#else
    (void)perfilecontextpointer;
    (void)ptr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInsertPerFileObjectContext(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertPerFileObjectContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)ptr) : -1;
#else
    (void)fileobject;
    (void)ptr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlInsertPerStreamContext(JNIEnv* km_env, jclass km_clazz, jlong perstreamcontext, jlong ptr) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlInsertPerStreamContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)perstreamcontext, (void*)(uintptr_t)ptr) : -1;
#else
    (void)perstreamcontext;
    (void)ptr;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIs32BitProcess(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIs32BitProcess");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)process) : false;
#else
    (void)process;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsDaxVolume(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsDaxVolume");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : false;
#else
    (void)fileobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsDbcsInExpression(JNIEnv* km_env, jclass km_clazz, jlong expression, jlong name) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsDbcsInExpression");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)expression, (void*)(uintptr_t)name) : false;
#else
    (void)expression;
    (void)name;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsEcpAcknowledged(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsEcpAcknowledged");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ecpcontext) : false;
#else
    (void)ecpcontext;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsEcpFromUserMode(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsEcpFromUserMode");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ecpcontext) : false;
#else
    (void)ecpcontext;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsExtentDangling(JNIEnv* km_env, jclass km_clazz, jint startpage, jint numberofpages, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsExtentDangling");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)startpage, (uint32_t)numberofpages, (uint32_t)flags) : 0;
#else
    (void)startpage;
    (void)numberofpages;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsFatDbcsLegal(JNIEnv* km_env, jclass km_clazz, jstring dbcsname, jboolean wildcardspermissible, jboolean pathnamepermissible, jboolean leadingbackslashpermissible) {
    (void)km_env;
    (void)km_clazz;
    const char* dbcsname_utf = (dbcsname != NULL) ? (*km_env)->GetStringUTFChars(km_env, dbcsname, NULL) : NULL;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(const char*, bool, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsFatDbcsLegal");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr(dbcsname_utf, (bool)wildcardspermissible, (bool)pathnamepermissible, (bool)leadingbackslashpermissible) : false;
#else
    (void)wildcardspermissible;
    (void)pathnamepermissible;
    (void)leadingbackslashpermissible;
    bool km_res = false;
#endif
    if (dbcsname != NULL && dbcsname_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, dbcsname, dbcsname_utf);
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsHpfsDbcsLegal(JNIEnv* km_env, jclass km_clazz, jstring dbcsname, jboolean wildcardspermissible, jboolean pathnamepermissible, jboolean leadingbackslashpermissible) {
    (void)km_env;
    (void)km_clazz;
    const char* dbcsname_utf = (dbcsname != NULL) ? (*km_env)->GetStringUTFChars(km_env, dbcsname, NULL) : NULL;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(const char*, bool, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsHpfsDbcsLegal");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr(dbcsname_utf, (bool)wildcardspermissible, (bool)pathnamepermissible, (bool)leadingbackslashpermissible) : false;
#else
    (void)wildcardspermissible;
    (void)pathnamepermissible;
    (void)leadingbackslashpermissible;
    bool km_res = false;
#endif
    if (dbcsname != NULL && dbcsname_utf != NULL) (*km_env)->ReleaseStringUTFChars(km_env, dbcsname, dbcsname_utf);
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsMobileOS(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsMobileOS");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsNameInExpression(JNIEnv* km_env, jclass km_clazz, jlong expression, jlong name, jboolean ignorecase, jlong upcasetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNameInExpression");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)expression, (void*)(uintptr_t)name, (bool)ignorecase, (void*)(uintptr_t)upcasetable) : false;
#else
    (void)expression;
    (void)name;
    (void)ignorecase;
    (void)upcasetable;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsNameInUnUpcasedExpression(JNIEnv* km_env, jclass km_clazz, jlong expression, jlong name, jboolean ignorecase, jlong upcasetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNameInUnUpcasedExpression");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)expression, (void*)(uintptr_t)name, (bool)ignorecase, (void*)(uintptr_t)upcasetable) : false;
#else
    (void)expression;
    (void)name;
    (void)ignorecase;
    (void)upcasetable;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsNonEmptyDirectoryReparsePointAllowed(JNIEnv* km_env, jclass km_clazz, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNonEmptyDirectoryReparsePointAllowed");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)reparsetag) : false;
#else
    (void)reparsetag;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsNtstatusExpected(JNIEnv* km_env, jclass km_clazz, jint exception) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsNtstatusExpected");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)exception) : false;
#else
    (void)exception;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsPagingFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsPagingFile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : 0;
#else
    (void)fileobject;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIsSystemPagingFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIsSystemPagingFile");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : 0;
#else
    (void)fileobject;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlIssueDeviceIoControl(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jint ioctl, jbyte flags, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength, jlong iosbinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint8_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlIssueDeviceIoControl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject, (uint32_t)ioctl, (uint8_t)flags, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength, (void*)(uintptr_t)iosbinformation) : -1;
#else
    (void)deviceobject;
    (void)ioctl;
    (void)flags;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)iosbinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlKernelFsControlFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fscontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength, jlong retoutputbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlKernelFsControlFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)fscontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength, (void*)(uintptr_t)retoutputbuffersize) : -1;
#else
    (void)fileobject;
    (void)fscontrolcode;
    (void)inputbuffer;
    (void)inputbufferlength;
    (void)outputbuffer;
    (void)outputbufferlength;
    (void)retoutputbuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLogCcFlushError(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong deviceobject, jlong sectionobjectpointer, jint flusherror, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLogCcFlushError");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)sectionobjectpointer, (int32_t)flusherror, (uint32_t)flags) : -1;
#else
    (void)filename;
    (void)deviceobject;
    (void)sectionobjectpointer;
    (void)flusherror;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcountfromlbn, jlong startinglbn, jlong sectorcountfromstartinglbn, jlong arg_6_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupBaseMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcountfromlbn, (void*)(uintptr_t)startinglbn, (void*)(uintptr_t)sectorcountfromstartinglbn, (void*)(uintptr_t)arg_6_index) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcountfromlbn;
    (void)startinglbn;
    (void)sectorcountfromstartinglbn;
    (void)arg_6_index;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn, jlong sectorcountfromlbn, jlong startinglbn, jlong sectorcountfromstartinglbn, jlong arg_6_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLargeMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcountfromlbn, (void*)(uintptr_t)startinglbn, (void*)(uintptr_t)sectorcountfromstartinglbn, (void*)(uintptr_t)arg_6_index) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcountfromlbn;
    (void)startinglbn;
    (void)sectorcountfromstartinglbn;
    (void)arg_6_index;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupLastBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastBaseMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupLastBaseMcbEntryAndIndex(JNIEnv* km_env, jclass km_clazz, jlong opaquemcb, jlong largevbn, jlong largelbn, jlong arg_3_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastBaseMcbEntryAndIndex");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)opaquemcb, (void*)(uintptr_t)largevbn, (void*)(uintptr_t)largelbn, (void*)(uintptr_t)arg_3_index) : false;
#else
    (void)opaquemcb;
    (void)largevbn;
    (void)largelbn;
    (void)arg_3_index;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupLastLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastLargeMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupLastLargeMcbEntryAndIndex(JNIEnv* km_env, jclass km_clazz, jlong opaquemcb, jlong largevbn, jlong largelbn, jlong arg_3_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastLargeMcbEntryAndIndex");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)opaquemcb, (void*)(uintptr_t)largevbn, (void*)(uintptr_t)largelbn, (void*)(uintptr_t)arg_3_index) : false;
#else
    (void)opaquemcb;
    (void)largevbn;
    (void)largelbn;
    (void)arg_3_index;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupLastMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong lbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupLastMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (void*)(uintptr_t)vbn, (void*)(uintptr_t)lbn) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint vbn, jlong lbn, jlong sectorcount, jlong arg_4_index) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)vbn, (void*)(uintptr_t)lbn, (void*)(uintptr_t)sectorcount, (void*)(uintptr_t)arg_4_index) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)lbn;
    (void)sectorcount;
    (void)arg_4_index;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupPerFileContext(JNIEnv* km_env, jclass km_clazz, jlong perfilecontextpointer, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupPerFileContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)perfilecontextpointer, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid) : NULL;
#else
    (void)perfilecontextpointer;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupPerFileObjectContext(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupPerFileObjectContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid) : NULL;
#else
    (void)fileobject;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlLookupPerStreamContextInternal(JNIEnv* km_env, jclass km_clazz, jlong streamcontext, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlLookupPerStreamContextInternal");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)streamcontext, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid) : NULL;
#else
    (void)streamcontext;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlMdlReadCompleteDev(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong mdlchain, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlReadCompleteDev");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)deviceobject) : false;
#else
    (void)fileobject;
    (void)mdlchain;
    (void)deviceobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlMdlReadDev(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlReadDev");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    (void)deviceobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlMdlReadEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlReadEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus) : -1;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlMdlWriteCompleteDev(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jlong mdlchain, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMdlWriteCompleteDev");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)mdlchain;
    (void)deviceobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlMupGetProviderIdFromName(JNIEnv* km_env, jclass km_clazz, jlong pprovidername, jlong pproviderid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMupGetProviderIdFromName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pprovidername, (void*)(uintptr_t)pproviderid) : -1;
#else
    (void)pprovidername;
    (void)pproviderid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlMupGetProviderInfoFromFileObject(JNIEnv* km_env, jclass km_clazz, jlong pfileobject, jint level, jlong pbuffer, jlong pbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlMupGetProviderInfoFromFileObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pfileobject, (uint32_t)level, (void*)(uintptr_t)pbuffer, (void*)(uintptr_t)pbuffersize) : -1;
#else
    (void)pfileobject;
    (void)level;
    (void)pbuffer;
    (void)pbuffersize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNormalizeNtstatus(JNIEnv* km_env, jclass km_clazz, jint exception, jint genericexception) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNormalizeNtstatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)exception, (int32_t)genericexception) : -1;
#else
    (void)exception;
    (void)genericexception;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyCleanup(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fscontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyCleanup");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fscontext);
#else
    (void)notifysync;
    (void)notifylist;
    (void)fscontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyCleanupAll(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyCleanupAll");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist);
#else
    (void)notifysync;
    (void)notifylist;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyFilterChangeDirectory(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fscontext, jlong fulldirectoryname, jboolean watchtree, jboolean ignorebuffer, jint completionfilter, jlong notifyirp, jlong traversecallback, jlong subjectcontext, jlong filtercallback) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, void*, bool, bool, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFilterChangeDirectory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fscontext, (void*)(uintptr_t)fulldirectoryname, (bool)watchtree, (bool)ignorebuffer, (uint32_t)completionfilter, (void*)(uintptr_t)notifyirp, (void*)(uintptr_t)traversecallback, (void*)(uintptr_t)subjectcontext, (void*)(uintptr_t)filtercallback);
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
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyFilterReportChange(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fulltargetname, jshort targetnameoffset, jlong streamname, jlong normalizedparentname, jint filtermatch, jint action, jlong targetcontext, jlong filtercontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFilterReportChange");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fulltargetname, (uint16_t)targetnameoffset, (void*)(uintptr_t)streamname, (void*)(uintptr_t)normalizedparentname, (uint32_t)filtermatch, (uint32_t)action, (void*)(uintptr_t)targetcontext, (void*)(uintptr_t)filtercontext);
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
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyFullChangeDirectory(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fscontext, jlong fulldirectoryname, jboolean watchtree, jboolean ignorebuffer, jint completionfilter, jlong notifyirp, jlong traversecallback, jlong subjectcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, void*, bool, bool, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFullChangeDirectory");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fscontext, (void*)(uintptr_t)fulldirectoryname, (bool)watchtree, (bool)ignorebuffer, (uint32_t)completionfilter, (void*)(uintptr_t)notifyirp, (void*)(uintptr_t)traversecallback, (void*)(uintptr_t)subjectcontext);
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
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyFullReportChange(JNIEnv* km_env, jclass km_clazz, jlong notifysync, jlong notifylist, jlong fulltargetname, jshort targetnameoffset, jlong streamname, jlong normalizedparentname, jint filtermatch, jint action, jlong targetcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*, void*, uint16_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyFullReportChange");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)notifysync, (void*)(uintptr_t)notifylist, (void*)(uintptr_t)fulltargetname, (uint16_t)targetnameoffset, (void*)(uintptr_t)streamname, (void*)(uintptr_t)normalizedparentname, (uint32_t)filtermatch, (uint32_t)action, (void*)(uintptr_t)targetcontext);
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
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyInitializeSync(JNIEnv* km_env, jclass km_clazz, jlong notifysync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyInitializeSync");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)notifysync);
#else
    (void)notifysync;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyUninitializeSync(JNIEnv* km_env, jclass km_clazz, jlong notifysync) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyUninitializeSync");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)notifysync);
#else
    (void)notifysync;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyVolumeEvent(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint eventcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyVolumeEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)eventcode) : -1;
#else
    (void)fileobject;
    (void)eventcode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNotifyVolumeEventEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint eventcode, jlong event) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNotifyVolumeEventEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (uint32_t)eventcode, (void*)(uintptr_t)event) : -1;
#else
    (void)fileobject;
    (void)eventcode;
    (void)event;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNumberOfRunsInBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInBaseMcb");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb) : 0;
#else
    (void)mcb;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNumberOfRunsInLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInLargeMcb");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb) : 0;
#else
    (void)mcb;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlNumberOfRunsInMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlNumberOfRunsInMcb");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb) : 0;
#else
    (void)mcb;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockBreakH(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakH");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockBreakH2(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jlong context, jlong completionroutine, jlong postirproutine, jlong grantedaccess, jlong shareaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakH2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)shareaccess) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    (void)grantedaccess;
    (void)shareaccess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockBreakToNone(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irpsp, jlong irp, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakToNone");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irpsp, (void*)(uintptr_t)irp, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine) : -1;
#else
    (void)oplock;
    (void)irpsp;
    (void)irp;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockBreakToNoneEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint flags, jlong context, jlong completionroutine, jlong postirproutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockBreakToNoneEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)flags, (void*)(uintptr_t)context, (void*)(uintptr_t)completionroutine, (void*)(uintptr_t)postirproutine) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)flags;
    (void)context;
    (void)completionroutine;
    (void)postirproutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockFsctrl(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint opencount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockFsctrl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)opencount) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockFsctrlEx(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint opencount, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockFsctrlEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)opencount, (uint32_t)flags) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockGetAnyBreakOwnerProcess(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockGetAnyBreakOwnerProcess");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock) : -1;
#else
    (void)oplock;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockIsFastIoPossible(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockIsFastIoPossible");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock) : false;
#else
    (void)oplock;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockIsSharedRequest(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockIsSharedRequest");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp) : false;
#else
    (void)irp;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlOplockKeysEqual(JNIEnv* km_env, jclass km_clazz, jlong fo1, jlong fo2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlOplockKeysEqual");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fo1, (void*)(uintptr_t)fo2) : false;
#else
    (void)fo1;
    (void)fo2;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlPostPagingFileStackOverflow(JNIEnv* km_env, jclass km_clazz, jlong context, jlong event, jlong stackoverflowroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPostPagingFileStackOverflow");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)event, (void*)(uintptr_t)stackoverflowroutine);
#else
    (void)context;
    (void)event;
    (void)stackoverflowroutine;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlPostStackOverflow(JNIEnv* km_env, jclass km_clazz, jlong context, jlong event, jlong stackoverflowroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPostStackOverflow");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)event, (void*)(uintptr_t)stackoverflowroutine);
#else
    (void)context;
    (void)event;
    (void)stackoverflowroutine;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlPrepareMdlWriteDev(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrepareMdlWriteDev");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)deviceobject) : false;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    (void)deviceobject;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlPrepareMdlWriteEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileoffset, jint length, jint lockkey, jlong mdlchain, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrepareMdlWriteEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (uint32_t)length, (uint32_t)lockkey, (void*)(uintptr_t)mdlchain, (void*)(uintptr_t)iostatus) : -1;
#else
    (void)fileobject;
    (void)fileoffset;
    (void)length;
    (void)lockkey;
    (void)mdlchain;
    (void)iostatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlPrepareToReuseEcp(JNIEnv* km_env, jclass km_clazz, jlong ecpcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrepareToReuseEcp");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)ecpcontext);
#else
    (void)ecpcontext;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlPrivateLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong fileobject, jlong fileoffset, jlong length, jlong processid, jint key, jboolean failimmediately, jboolean exclusivelock, jlong iosb, jlong irp, jlong context, jboolean alreadysynchronized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t, uint32_t, bool, bool, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlPrivateLock");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileoffset, (void*)(uintptr_t)length, (int64_t)processid, (uint32_t)key, (bool)failimmediately, (bool)exclusivelock, (void*)(uintptr_t)iosb, (void*)(uintptr_t)irp, (void*)(uintptr_t)context, (bool)alreadysynchronized) : false;
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
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlProcessFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock, jlong irp, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlProcessFileLock");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filelock, (void*)(uintptr_t)irp, (void*)(uintptr_t)context) : -1;
#else
    (void)filelock;
    (void)irp;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlQueryCachedVdl(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong vdl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryCachedVdl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)vdl) : -1;
#else
    (void)fileobject;
    (void)vdl;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlQueryInformationFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong fileinformation, jint length, jint fileinformationclass, jlong retfileinformationsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (void*)(uintptr_t)retfileinformationsize) : -1;
#else
    (void)fileobject;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    (void)retfileinformationsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlQueryKernelEaFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong returnedeadata, jint length, jboolean returnsingleentry, jlong ealist, jint ealistlength, jlong eaindex, jboolean restartscan, jlong lengthreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, void*, uint32_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryKernelEaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)returnedeadata, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)ealist, (uint32_t)ealistlength, (void*)(uintptr_t)eaindex, (bool)restartscan, (void*)(uintptr_t)lengthreturned) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlQueryMaximumVirtualDiskNestingLevel(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlQueryMaximumVirtualDiskNestingLevel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRegisterFileSystemFilterCallbacks(JNIEnv* km_env, jclass km_clazz, jlong filterdriverobject, jlong callbacks) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterFileSystemFilterCallbacks");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filterdriverobject, (void*)(uintptr_t)callbacks) : -1;
#else
    (void)filterdriverobject;
    (void)callbacks;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRegisterUncProvider(JNIEnv* km_env, jclass km_clazz, jlong muphandle, jlong redirectordevicename, jboolean mailslotssupported) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterUncProvider");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)muphandle, (void*)(uintptr_t)redirectordevicename, (bool)mailslotssupported) : -1;
#else
    (void)muphandle;
    (void)redirectordevicename;
    (void)mailslotssupported;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRegisterUncProviderEx(JNIEnv* km_env, jclass km_clazz, jlong muphandle, jlong redirdevname, jlong deviceobject, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterUncProviderEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)muphandle, (void*)(uintptr_t)redirdevname, (void*)(uintptr_t)deviceobject, (uint32_t)flags) : -1;
#else
    (void)muphandle;
    (void)redirdevname;
    (void)deviceobject;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRegisterUncProviderEx2(JNIEnv* km_env, jclass km_clazz, jlong redirdevname, jlong deviceobject, jlong registration, jlong muphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRegisterUncProviderEx2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)redirdevname, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)registration, (void*)(uintptr_t)muphandle) : -1;
#else
    (void)redirdevname;
    (void)deviceobject;
    (void)registration;
    (void)muphandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlReleaseFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlReleaseFile");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)fileobject);
#else
    (void)fileobject;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRemoveBaseMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveBaseMcbEntry");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)sectorcount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRemoveDotsFromPath(JNIEnv* km_env, jclass km_clazz, jlong originalstring, jshort pathlength, jlong newlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint16_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveDotsFromPath");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)originalstring, (uint16_t)pathlength, (void*)(uintptr_t)newlength) : -1;
#else
    (void)originalstring;
    (void)pathlength;
    (void)newlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRemoveExtraCreateParameter(JNIEnv* km_env, jclass km_clazz, jlong ecplist, jlong ecptype, jlong ecpcontext, jlong ecpcontextsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveExtraCreateParameter");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ecplist, (void*)(uintptr_t)ecptype, (void*)(uintptr_t)ecpcontext, (void*)(uintptr_t)ecpcontextsize) : -1;
#else
    (void)ecplist;
    (void)ecptype;
    (void)ecpcontext;
    (void)ecpcontextsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRemoveLargeMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveLargeMcbEntry");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)sectorcount);
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRemoveMcbEntry(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint vbn, jint sectorcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemoveMcbEntry");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)vbn, (uint32_t)sectorcount);
#else
    (void)mcb;
    (void)vbn;
    (void)sectorcount;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRemovePerFileContext(JNIEnv* km_env, jclass km_clazz, jlong perfilecontextpointer, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemovePerFileContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)perfilecontextpointer, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid) : NULL;
#else
    (void)perfilecontextpointer;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRemovePerFileObjectContext(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemovePerFileObjectContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid) : NULL;
#else
    (void)fileobject;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlRemovePerStreamContext(JNIEnv* km_env, jclass km_clazz, jlong streamcontext, jlong ownerid, jlong instanceid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlRemovePerStreamContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)streamcontext, (void*)(uintptr_t)ownerid, (void*)(uintptr_t)instanceid) : NULL;
#else
    (void)streamcontext;
    (void)ownerid;
    (void)instanceid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlResetBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlResetBaseMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb);
#else
    (void)mcb;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlResetLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jboolean selfsynchronized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlResetLargeMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb, (bool)selfsynchronized);
#else
    (void)mcb;
    (void)selfsynchronized;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlSetDriverBacking(JNIEnv* km_env, jclass km_clazz, jlong driverobj, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSetDriverBacking");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)driverobj, (uint32_t)flags) : -1;
#else
    (void)driverobj;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlSetEcpListIntoIrp(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong ecplist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSetEcpListIntoIrp");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)ecplist) : -1;
#else
    (void)irp;
    (void)ecplist;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlSetKernelEaFile(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong eabuffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSetKernelEaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)eabuffer, (uint32_t)length) : -1;
#else
    (void)fileobject;
    (void)eabuffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlSplitBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSplitBaseMcb");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)amount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)amount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlSplitLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlSplitLargeMcb");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn, (int64_t)amount) : false;
#else
    (void)mcb;
    (void)vbn;
    (void)amount;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlTeardownPerFileContexts(JNIEnv* km_env, jclass km_clazz, jlong perfilecontextpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTeardownPerFileContexts");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)perfilecontextpointer);
#else
    (void)perfilecontextpointer;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlTeardownPerStreamContexts(JNIEnv* km_env, jclass km_clazz, jlong advancedheader) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTeardownPerStreamContexts");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)advancedheader);
#else
    (void)advancedheader;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlTruncateBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTruncateBaseMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn);
#else
    (void)mcb;
    (void)vbn;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlTruncateLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jlong vbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTruncateLargeMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb, (int64_t)vbn);
#else
    (void)mcb;
    (void)vbn;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlTruncateMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb, jint vbn) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlTruncateMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb, (uint32_t)vbn);
#else
    (void)mcb;
    (void)vbn;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlUninitializeBaseMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeBaseMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb);
#else
    (void)mcb;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlUninitializeFileLock(JNIEnv* km_env, jclass km_clazz, jlong filelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeFileLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filelock);
#else
    (void)filelock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlUninitializeLargeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeLargeMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb);
#else
    (void)mcb;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlUninitializeMcb(JNIEnv* km_env, jclass km_clazz, jlong mcb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeMcb");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mcb);
#else
    (void)mcb;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlUninitializeOplock(JNIEnv* km_env, jclass km_clazz, jlong oplock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUninitializeOplock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)oplock);
#else
    (void)oplock;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlUpdateDiskCounters(JNIEnv* km_env, jclass km_clazz, jlong bytesread, jlong byteswritten) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUpdateDiskCounters");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint64_t)bytesread, (uint64_t)byteswritten);
#else
    (void)bytesread;
    (void)byteswritten;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlUpperOplockFsctrl(JNIEnv* km_env, jclass km_clazz, jlong oplock, jlong irp, jint opencount, jint loweroplockstate, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlUpperOplockFsctrl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oplock, (void*)(uintptr_t)irp, (uint32_t)opencount, (uint32_t)loweroplockstate, (uint32_t)flags) : -1;
#else
    (void)oplock;
    (void)irp;
    (void)opencount;
    (void)loweroplockstate;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlValidateReparsePointBuffer(JNIEnv* km_env, jclass km_clazz, jint bufferlength, jlong reparsebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlValidateReparsePointBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)bufferlength, (void*)(uintptr_t)reparsebuffer) : -1;
#else
    (void)bufferlength;
    (void)reparsebuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1fsRtlVolumeDeviceToCorrelationId(JNIEnv* km_env, jclass km_clazz, jlong volumedeviceobject, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FsRtlVolumeDeviceToCorrelationId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumedeviceobject, (void*)(uintptr_t)guid) : -1;
#else
    (void)volumedeviceobject;
    (void)guid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1getSecurityUserInfo(JNIEnv* km_env, jclass km_clazz, jlong logonid, jint flags, jlong userinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetSecurityUserInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)logonid, (uint32_t)flags, (void*)(uintptr_t)userinformation) : -1;
#else
    (void)logonid;
    (void)flags;
    (void)userinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioAcquireVpbSpinLock(JNIEnv* km_env, jclass km_clazz, jlong irql) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoAcquireVpbSpinLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)irql);
#else
    (void)irql;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioApplyPriorityInfoThread(JNIEnv* km_env, jclass km_clazz, jlong inputpriorityinfo, jlong outputpriorityinfo, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoApplyPriorityInfoThread");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)inputpriorityinfo, (void*)(uintptr_t)outputpriorityinfo, (int64_t)thread) : -1;
#else
    (void)inputpriorityinfo;
    (void)outputpriorityinfo;
    (void)thread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCheckDesiredAccess(JNIEnv* km_env, jclass km_clazz, jlong desiredaccess, jint grantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckDesiredAccess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)desiredaccess, (uint32_t)grantedaccess) : -1;
#else
    (void)desiredaccess;
    (void)grantedaccess;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCheckEaBufferValidity(JNIEnv* km_env, jclass km_clazz, jlong eabuffer, jint ealength, jlong erroroffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckEaBufferValidity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eabuffer, (uint32_t)ealength, (void*)(uintptr_t)erroroffset) : -1;
#else
    (void)eabuffer;
    (void)ealength;
    (void)erroroffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCheckFunctionAccess(JNIEnv* km_env, jclass km_clazz, jint grantedaccess, jbyte majorfunction, jbyte minorfunction, jint iocontrolcode, jlong arg1, jlong arg2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, uint8_t, uint8_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckFunctionAccess");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)grantedaccess, (uint8_t)majorfunction, (uint8_t)minorfunction, (uint32_t)iocontrolcode, (void*)(uintptr_t)arg1, (void*)(uintptr_t)arg2) : -1;
#else
    (void)grantedaccess;
    (void)majorfunction;
    (void)minorfunction;
    (void)iocontrolcode;
    (void)arg1;
    (void)arg2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCheckQuerySetFileInformation(JNIEnv* km_env, jclass km_clazz, jint fileinformationclass, jint length, jboolean setoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckQuerySetFileInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fileinformationclass, (uint32_t)length, (bool)setoperation) : -1;
#else
    (void)fileinformationclass;
    (void)length;
    (void)setoperation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCheckQuerySetVolumeInformation(JNIEnv* km_env, jclass km_clazz, jint fsinformationclass, jint length, jboolean setoperation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckQuerySetVolumeInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)fsinformationclass, (uint32_t)length, (bool)setoperation) : -1;
#else
    (void)fsinformationclass;
    (void)length;
    (void)setoperation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCheckQuotaBufferValidity(JNIEnv* km_env, jclass km_clazz, jlong quotabuffer, jint quotalength, jlong erroroffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCheckQuotaBufferValidity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)quotabuffer, (uint32_t)quotalength, (void*)(uintptr_t)erroroffset) : -1;
#else
    (void)quotabuffer;
    (void)quotalength;
    (void)erroroffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioClearFsTrackOffsetState(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoClearFsTrackOffsetState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp) : -1;
#else
    (void)irp;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCreateStreamFileObject(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObject");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)deviceobject) : NULL;
#else
    (void)fileobject;
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCreateStreamFileObjectEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong deviceobject, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObjectEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)filehandle) : NULL;
#else
    (void)fileobject;
    (void)deviceobject;
    (void)filehandle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCreateStreamFileObjectEx2(JNIEnv* km_env, jclass km_clazz, jlong createoptions, jlong fileobject, jlong deviceobject, jlong streamfileobject, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObjectEx2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)createoptions, (void*)(uintptr_t)fileobject, (void*)(uintptr_t)deviceobject, (void*)(uintptr_t)streamfileobject, (void*)(uintptr_t)filehandle) : -1;
#else
    (void)createoptions;
    (void)fileobject;
    (void)deviceobject;
    (void)streamfileobject;
    (void)filehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioCreateStreamFileObjectLite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoCreateStreamFileObjectLite");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)deviceobject) : NULL;
#else
    (void)fileobject;
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioEnumerateDeviceObjectList(JNIEnv* km_env, jclass km_clazz, jlong driverobject, jlong deviceobjectlist, jint deviceobjectlistsize, jlong actualnumberdeviceobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoEnumerateDeviceObjectList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)driverobject, (void*)(uintptr_t)deviceobjectlist, (uint32_t)deviceobjectlistsize, (void*)(uintptr_t)actualnumberdeviceobjects) : -1;
#else
    (void)driverobject;
    (void)deviceobjectlist;
    (void)deviceobjectlistsize;
    (void)actualnumberdeviceobjects;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioEnumerateRegisteredFiltersList(JNIEnv* km_env, jclass km_clazz, jlong driverobjectlist, jint driverobjectlistsize, jlong actualnumberdriverobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoEnumerateRegisteredFiltersList");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)driverobjectlist, (uint32_t)driverobjectlistsize, (void*)(uintptr_t)actualnumberdriverobjects) : -1;
#else
    (void)driverobjectlist;
    (void)driverobjectlistsize;
    (void)actualnumberdriverobjects;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioFastQueryNetworkAttributes(JNIEnv* km_env, jclass km_clazz, jlong objectattributes, jint desiredaccess, jint openoptions, jlong iostatus, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoFastQueryNetworkAttributes");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectattributes, (uint32_t)desiredaccess, (uint32_t)openoptions, (void*)(uintptr_t)iostatus, (void*)(uintptr_t)buffer) : false;
#else
    (void)objectattributes;
    (void)desiredaccess;
    (void)openoptions;
    (void)iostatus;
    (void)buffer;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetAttachedDevice(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetAttachedDevice");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject) : NULL;
#else
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetBaseFileSystemDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetBaseFileSystemDeviceObject");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : NULL;
#else
    (void)fileobject;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetDeviceAttachmentBaseRef(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceAttachmentBaseRef");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject) : NULL;
#else
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetDeviceToVerify(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDeviceToVerify");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread) : NULL;
#else
    (void)thread;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetDiskDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong filesystemdeviceobject, jlong diskdeviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetDiskDeviceObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filesystemdeviceobject, (void*)(uintptr_t)diskdeviceobject) : -1;
#else
    (void)filesystemdeviceobject;
    (void)diskdeviceobject;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetFsTrackOffsetState(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong retfstrackoffsetblob, jlong rettrackedoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetFsTrackOffsetState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)retfstrackoffsetblob, (void*)(uintptr_t)rettrackedoffset) : -1;
#else
    (void)irp;
    (void)retfstrackoffsetblob;
    (void)rettrackedoffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetLowerDeviceObject(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetLowerDeviceObject");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject) : NULL;
#else
    (void)deviceobject;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetOplockKeyContext(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetOplockKeyContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : NULL;
#else
    (void)fileobject;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetOplockKeyContextEx(JNIEnv* km_env, jclass km_clazz, jlong fileobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetOplockKeyContextEx");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject) : NULL;
#else
    (void)fileobject;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetRequestorProcess(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRequestorProcess");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp) : -1;
#else
    (void)irp;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetRequestorProcessId(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRequestorProcessId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp) : 0;
#else
    (void)irp;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioGetRequestorSessionId(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong psessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoGetRequestorSessionId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)psessionid) : -1;
#else
    (void)irp;
    (void)psessionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioIrpHasFsTrackOffsetExtensionType(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIrpHasFsTrackOffsetExtensionType");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp) : false;
#else
    (void)irp;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioIsOperationSynchronous(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsOperationSynchronous");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp) : false;
#else
    (void)irp;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioIsSystemThread(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsSystemThread");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread) : false;
#else
    (void)thread;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioIsValidNameGraftingBuffer(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong reparsebuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoIsValidNameGraftingBuffer");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)reparsebuffer) : false;
#else
    (void)irp;
    (void)reparsebuffer;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioPageRead(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong memorydescriptorlist, jlong startingoffset, jlong event, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoPageRead");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)memorydescriptorlist, (void*)(uintptr_t)startingoffset, (void*)(uintptr_t)event, (void*)(uintptr_t)iostatusblock) : -1;
#else
    (void)fileobject;
    (void)memorydescriptorlist;
    (void)startingoffset;
    (void)event;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioQueryFileDosDeviceName(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong objectnameinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryFileDosDeviceName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)objectnameinformation) : -1;
#else
    (void)fileobject;
    (void)objectnameinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioQueryFileInformation(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fileinformationclass, jint length, jlong fileinformation, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryFileInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (int32_t)fileinformationclass, (uint32_t)length, (void*)(uintptr_t)fileinformation, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)fileobject;
    (void)fileinformationclass;
    (void)length;
    (void)fileinformation;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioQueryVolumeInformation(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fsinformationclass, jint length, jlong fsinformation, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueryVolumeInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (int32_t)fsinformationclass, (uint32_t)length, (void*)(uintptr_t)fsinformation, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)fileobject;
    (void)fsinformationclass;
    (void)length;
    (void)fsinformation;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioQueueThreadIrp(JNIEnv* km_env, jclass km_clazz, jlong irp) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoQueueThreadIrp");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)irp);
#else
    (void)irp;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioRegisterFileSystem(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRegisterFileSystem");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)deviceobject);
#else
    (void)deviceobject;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioReleaseVpbSpinLock(JNIEnv* km_env, jclass km_clazz, jbyte irql) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReleaseVpbSpinLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint8_t)irql);
#else
    (void)irql;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioReplaceFileObjectName(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong newfilename, jshort filenamelength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint16_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoReplaceFileObjectName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)newfilename, (uint16_t)filenamelength) : -1;
#else
    (void)fileobject;
    (void)newfilename;
    (void)filenamelength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioRequestDeviceRemovalForReset(JNIEnv* km_env, jclass km_clazz, jlong physicaldeviceobject, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRequestDeviceRemovalForReset");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)physicaldeviceobject, (uint32_t)flags) : -1;
#else
    (void)physicaldeviceobject;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioRetrievePriorityInfo(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong fileobject, jlong thread, jlong priorityinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoRetrievePriorityInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)fileobject, (int64_t)thread, (void*)(uintptr_t)priorityinfo) : -1;
#else
    (void)irp;
    (void)fileobject;
    (void)thread;
    (void)priorityinfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioSetDeviceToVerify(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetDeviceToVerify");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)thread, (void*)(uintptr_t)deviceobject);
#else
    (void)thread;
    (void)deviceobject;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioSetFsTrackOffsetState(JNIEnv* km_env, jclass km_clazz, jlong irp, jlong fstrackoffsetblob, jlong trackedoffset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetFsTrackOffsetState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)irp, (void*)(uintptr_t)fstrackoffsetblob, (int64_t)trackedoffset) : -1;
#else
    (void)irp;
    (void)fstrackoffsetblob;
    (void)trackedoffset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioSetInformation(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jint fileinformationclass, jint length, jlong fileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSetInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (int32_t)fileinformationclass, (uint32_t)length, (void*)(uintptr_t)fileinformation) : -1;
#else
    (void)fileobject;
    (void)fileinformationclass;
    (void)length;
    (void)fileinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioSynchronousPageWrite(JNIEnv* km_env, jclass km_clazz, jlong fileobject, jlong memorydescriptorlist, jlong startingoffset, jlong event, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoSynchronousPageWrite");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fileobject, (void*)(uintptr_t)memorydescriptorlist, (void*)(uintptr_t)startingoffset, (void*)(uintptr_t)event, (void*)(uintptr_t)iostatusblock) : -1;
#else
    (void)fileobject;
    (void)memorydescriptorlist;
    (void)startingoffset;
    (void)event;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioThreadToProcess(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoThreadToProcess");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread) : -1;
#else
    (void)thread;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioUnregisterFileSystem(JNIEnv* km_env, jclass km_clazz, jlong deviceobject) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoUnregisterFileSystem");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)deviceobject);
#else
    (void)deviceobject;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ioVerifyVolume(JNIEnv* km_env, jclass km_clazz, jlong deviceobject, jboolean allowrawmount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IoVerifyVolume");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)deviceobject, (bool)allowrawmount) : -1;
#else
    (void)deviceobject;
    (void)allowrawmount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keAcquireQueuedSpinLock(JNIEnv* km_env, jclass km_clazz, jint number) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireQueuedSpinLock");
    }
    uint8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)number) : 0;
#else
    (void)number;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keAcquireSpinLockRaiseToSynch(JNIEnv* km_env, jclass km_clazz, jlong spinlock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAcquireSpinLockRaiseToSynch");
    }
    uint8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)spinlock) : 0;
#else
    (void)spinlock;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keAttachProcess(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeAttachProcess");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)process);
#else
    (void)process;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keDetachProcess(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeDetachProcess");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keInitializeMutant(JNIEnv* km_env, jclass km_clazz, jlong mutant, jboolean initialowner) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeMutant");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)mutant, (bool)initialowner);
#else
    (void)mutant;
    (void)initialowner;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keInitializeQueue(JNIEnv* km_env, jclass km_clazz, jlong queue, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInitializeQueue");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)queue, (uint32_t)count);
#else
    (void)queue;
    (void)count;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keInsertHeadQueue(JNIEnv* km_env, jclass km_clazz, jlong queue, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInsertHeadQueue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)queue, (void*)(uintptr_t)entry) : -1;
#else
    (void)queue;
    (void)entry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keInsertQueue(JNIEnv* km_env, jclass km_clazz, jlong queue, jlong entry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeInsertQueue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)queue, (void*)(uintptr_t)entry) : -1;
#else
    (void)queue;
    (void)entry;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keReadStateMutant(JNIEnv* km_env, jclass km_clazz, jlong mutant) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateMutant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mutant) : -1;
#else
    (void)mutant;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keReadStateQueue(JNIEnv* km_env, jclass km_clazz, jlong queue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReadStateQueue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)queue) : -1;
#else
    (void)queue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keReleaseMutant(JNIEnv* km_env, jclass km_clazz, jlong mutant, jint increment, jboolean abandoned, jboolean wait) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseMutant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mutant, (int32_t)increment, (bool)abandoned, (bool)wait) : -1;
#else
    (void)mutant;
    (void)increment;
    (void)abandoned;
    (void)wait;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keReleaseQueuedSpinLock(JNIEnv* km_env, jclass km_clazz, jint number, jbyte oldirql) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int32_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeReleaseQueuedSpinLock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int32_t)number, (uint8_t)oldirql);
#else
    (void)number;
    (void)oldirql;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keRemoveQueue(JNIEnv* km_env, jclass km_clazz, jlong queue, jbyte waitmode, jlong timeout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveQueue");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)queue, (int8_t)waitmode, (void*)(uintptr_t)timeout) : NULL;
#else
    (void)queue;
    (void)waitmode;
    (void)timeout;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keRemoveQueueEx(JNIEnv* km_env, jclass km_clazz, jlong queue, jbyte waitmode, jboolean alertable, jlong timeout, jlong entryarray, jint count) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int8_t, bool, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRemoveQueueEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)queue, (int8_t)waitmode, (bool)alertable, (void*)(uintptr_t)timeout, (void*)(uintptr_t)entryarray, (uint32_t)count) : 0;
#else
    (void)queue;
    (void)waitmode;
    (void)alertable;
    (void)timeout;
    (void)entryarray;
    (void)count;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keRundownQueue(JNIEnv* km_env, jclass km_clazz, jlong queue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeRundownQueue");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)queue) : NULL;
#else
    (void)queue;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keSetIdealProcessorThread(JNIEnv* km_env, jclass km_clazz, jlong thread, jbyte processor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint8_t (__stdcall *km_fn_t)(int64_t, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetIdealProcessorThread");
    }
    uint8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread, (uint8_t)processor) : 0;
#else
    (void)thread;
    (void)processor;
    uint8_t km_res = 0;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keSetKernelStackSwapEnable(JNIEnv* km_env, jclass km_clazz, jboolean enable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeSetKernelStackSwapEnable");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((bool)enable) : false;
#else
    (void)enable;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keStackAttachProcess(JNIEnv* km_env, jclass km_clazz, jlong process, jlong apcstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeStackAttachProcess");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)process, (void*)(uintptr_t)apcstate);
#else
    (void)process;
    (void)apcstate;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keTryToAcquireQueuedSpinLock(JNIEnv* km_env, jclass km_clazz, jint number, jlong oldirql) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeTryToAcquireQueuedSpinLock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)number, (void*)(uintptr_t)oldirql) : 0;
#else
    (void)number;
    (void)oldirql;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1keUnstackDetachProcess(JNIEnv* km_env, jclass km_clazz, jlong apcstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "KeUnstackDetachProcess");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)apcstate);
#else
    (void)apcstate;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1makeSignature(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint fqop, jlong pmessage, jint messageseqno) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MakeSignature");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)fqop, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno) : -1;
#else
    (void)phcontext;
    (void)fqop;
    (void)pmessage;
    (void)messageseqno;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mapSecurityError(JNIEnv* km_env, jclass km_clazz, jint secstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MapSecurityError");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)secstatus) : -1;
#else
    (void)secstatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmCanFileBeTruncated(JNIEnv* km_env, jclass km_clazz, jlong sectionpointer, jlong newfilesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmCanFileBeTruncated");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionpointer, (void*)(uintptr_t)newfilesize) : false;
#else
    (void)sectionpointer;
    (void)newfilesize;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmDoesFileHaveUserWritableReferences(JNIEnv* km_env, jclass km_clazz, jlong sectionpointer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmDoesFileHaveUserWritableReferences");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionpointer) : 0;
#else
    (void)sectionpointer;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmFlushImageSection(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jint flushtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmFlushImageSection");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (int32_t)flushtype) : false;
#else
    (void)sectionobjectpointer;
    (void)flushtype;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmForceSectionClosed(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jboolean delayclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmForceSectionClosed");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (bool)delayclose) : false;
#else
    (void)sectionobjectpointer;
    (void)delayclose;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmForceSectionClosedEx(JNIEnv* km_env, jclass km_clazz, jlong sectionobjectpointer, jint forcecloseflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmForceSectionClosedEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionobjectpointer, (uint32_t)forcecloseflags) : false;
#else
    (void)sectionobjectpointer;
    (void)forcecloseflags;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmGetMaximumFileSectionSize(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmGetMaximumFileSectionSize");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmIsFileSectionActive(JNIEnv* km_env, jclass km_clazz, jlong fssectionpointer, jint flags, jlong sectionisactive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsFileSectionActive");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)fssectionpointer, (uint32_t)flags, (void*)(uintptr_t)sectionisactive) : -1;
#else
    (void)fssectionpointer;
    (void)flags;
    (void)sectionisactive;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmIsRecursiveIoFault(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmIsRecursiveIoFault");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmMdlPagesAreZero(JNIEnv* km_env, jclass km_clazz, jlong mdl) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmMdlPagesAreZero");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)mdl) : 0;
#else
    (void)mdl;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmPrefetchPages(JNIEnv* km_env, jclass km_clazz, jint numberoflists, jlong readlists) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmPrefetchPages");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)numberoflists, (void*)(uintptr_t)readlists) : -1;
#else
    (void)numberoflists;
    (void)readlists;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1mmSetAddressRangeModified(JNIEnv* km_env, jclass km_clazz, jlong address, jlong length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MmSetAddressRangeModified");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)address, (uint64_t)length) : false;
#else
    (void)address;
    (void)length;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntAccessCheckAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jint desiredaccess, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckAndAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntAccessCheckByTypeAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckByTypeAndAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntAccessCheckByTypeResultListAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckByTypeResultListAndAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntAccessCheckByTypeResultListAndAuditAlarmByHandle(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAccessCheckByTypeResultListAndAuditAlarmByHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntAdjustGroupsToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jboolean resettodefault, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAdjustGroupsToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (bool)resettodefault, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntAdjustPrivilegesToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jboolean disableallprivileges, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAdjustPrivilegesToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (bool)disableallprivileges, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntAllocateVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong zerobits, jlong regionsize, jint allocationtype, jint protect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAllocateVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (uint64_t)zerobits, (void*)(uintptr_t)regionsize, (uint32_t)allocationtype, (uint32_t)protect) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)regionsize;
    (void)allocationtype;
    (void)protect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntAllocateVirtualMemoryEx(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jint allocationtype, jint pageprotection, jlong extendedparameters, jint extendedparametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtAllocateVirtualMemoryEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (uint32_t)allocationtype, (uint32_t)pageprotection, (void*)(uintptr_t)extendedparameters, (uint32_t)extendedparametercount) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)extendedparametercount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntCancelIoFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iorequesttocancel, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCancelIoFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iorequesttocancel, (void*)(uintptr_t)iostatusblock) : -1;
#else
    (void)filehandle;
    (void)iorequesttocancel;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntCloseObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jboolean generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCloseObjectAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (bool)generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntCreateDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateDirectoryObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)directoryhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntCreateEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jint desiredaccess, jlong objectattributes, jint eventtype, jboolean initialstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eventhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (int32_t)eventtype, (bool)initialstate) : -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)eventtype;
    (void)initialstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntCreateFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jlong allocationsize, jint fileattributes, jint shareaccess, jint createdisposition, jint createoptions, jlong eabuffer, jint ealength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, uint32_t, uint32_t, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)allocationsize, (uint32_t)fileattributes, (uint32_t)shareaccess, (uint32_t)createdisposition, (uint32_t)createoptions, (void*)(uintptr_t)eabuffer, (uint32_t)ealength) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntCreateSection(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jlong filehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateSection");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (void*)(uintptr_t)filehandle) : -1;
#else
    (void)sectionhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)maximumsize;
    (void)sectionpageprotection;
    (void)allocationattributes;
    (void)filehandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntCreateSectionEx(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jlong filehandle, jlong extendedparameters, jint extendedparametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtCreateSectionEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)extendedparameters, (uint32_t)extendedparametercount) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntDeleteFile(JNIEnv* km_env, jclass km_clazz, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectattributes) : -1;
#else
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntDeleteObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jboolean generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDeleteObjectAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (bool)generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntDuplicateObject(JNIEnv* km_env, jclass km_clazz, jlong sourceprocesshandle, jlong sourcehandle, jlong targetprocesshandle, jlong targethandle, jint desiredaccess, jint handleattributes, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDuplicateObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourceprocesshandle, (void*)(uintptr_t)sourcehandle, (void*)(uintptr_t)targetprocesshandle, (void*)(uintptr_t)targethandle, (uint32_t)desiredaccess, (uint32_t)handleattributes, (uint32_t)options) : -1;
#else
    (void)sourceprocesshandle;
    (void)sourcehandle;
    (void)targetprocesshandle;
    (void)targethandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntDuplicateToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint desiredaccess, jlong objectattributes, jboolean effectiveonly, jint tokentype, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtDuplicateToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (bool)effectiveonly, (int32_t)tokentype, (void*)(uintptr_t)newtokenhandle) : -1;
#else
    (void)existingtokenhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)effectiveonly;
    (void)tokentype;
    (void)newtokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntFilterToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint flags, jlong sidstodisable, jlong privilegestodelete, jlong restrictedsids, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFilterToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)flags, (void*)(uintptr_t)sidstodisable, (void*)(uintptr_t)privilegestodelete, (void*)(uintptr_t)restrictedsids, (void*)(uintptr_t)newtokenhandle) : -1;
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)newtokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntFlushBuffersFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushBuffersFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntFlushBuffersFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint flags, jlong parameters, jint parameterssize, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushBuffersFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)flags, (void*)(uintptr_t)parameters, (uint32_t)parameterssize, (void*)(uintptr_t)iostatusblock) : -1;
#else
    (void)filehandle;
    (void)flags;
    (void)parameters;
    (void)parameterssize;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntFlushVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFlushVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (void*)(uintptr_t)iostatus) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)iostatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntFreeVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jint freetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFreeVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (uint32_t)freetype) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)freetype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntFsControlFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint fscontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtFsControlFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)fscontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntImpersonateAnonymousToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtImpersonateAnonymousToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle) : -1;
#else
    (void)threadhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntLockFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong byteoffset, jlong length, jint key, jboolean failimmediately, jboolean exclusivelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtLockFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)length, (uint32_t)key, (bool)failimmediately, (bool)exclusivelock) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntNotifyChangeKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint completionfilter, jboolean watchtree, jlong buffer, jint buffersize, jboolean asynchronous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, bool, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtNotifyChangeKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)completionfilter, (bool)watchtree, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (bool)asynchronous) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntOpenDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenDirectoryObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)directoryhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntOpenFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint desiredaccess, jlong objectattributes, jlong iostatusblock, jint shareaccess, jint openoptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (uint32_t)shareaccess, (uint32_t)openoptions) : -1;
#else
    (void)filehandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)iostatusblock;
    (void)shareaccess;
    (void)openoptions;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntOpenObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong clienttoken, jint desiredaccess, jint grantedaccess, jlong privileges, jboolean objectcreation, jboolean accessgranted, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, bool, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenObjectAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)grantedaccess, (void*)(uintptr_t)privileges, (bool)objectcreation, (bool)accessgranted, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntOpenProcessToken(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenProcessToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntOpenProcessTokenEx(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jint handleattributes, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenProcessTokenEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)desiredaccess, (uint32_t)handleattributes, (void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntOpenSymbolicLinkObject(JNIEnv* km_env, jclass km_clazz, jlong linkhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenSymbolicLinkObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)linkhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)linkhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntOpenThreadToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint desiredaccess, jboolean openasself, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenThreadToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)desiredaccess, (bool)openasself, (void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntOpenThreadTokenEx(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint desiredaccess, jboolean openasself, jint handleattributes, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtOpenThreadTokenEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)desiredaccess, (bool)openasself, (uint32_t)handleattributes, (void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)handleattributes;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntPrivilegeCheck(JNIEnv* km_env, jclass km_clazz, jlong clienttoken, jlong requiredprivileges, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrivilegeCheck");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clienttoken, (void*)(uintptr_t)requiredprivileges, (void*)(uintptr_t)result) : -1;
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntPrivilegeObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jint desiredaccess, jlong privileges, jboolean accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrivilegeObjectAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)privileges, (bool)accessgranted) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntPrivilegedServiceAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong servicename, jlong clienttoken, jlong privileges, jboolean accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtPrivilegedServiceAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)servicename, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)privileges, (bool)accessgranted) : -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryDirectoryFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jboolean returnsingleentry, jlong filename, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, bool, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryDirectoryFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (bool)returnsingleentry, (void*)(uintptr_t)filename, (bool)restartscan) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryDirectoryFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jint queryflags, jlong filename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryDirectoryFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (uint32_t)queryflags, (void*)(uintptr_t)filename) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jlong buffer, jint length, jboolean returnsingleentry, jboolean restartscan, jlong context, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryDirectoryObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)directoryhandle, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (bool)restartscan, (void*)(uintptr_t)context, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)directoryhandle;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)restartscan;
    (void)context;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryEaFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong ealist, jint ealistlength, jlong eaindex, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryEaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)ealist, (uint32_t)ealistlength, (void*)(uintptr_t)eaindex, (bool)restartscan) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryFullAttributesFile(JNIEnv* km_env, jclass km_clazz, jlong objectattributes, jlong fileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryFullAttributesFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectattributes, (void*)(uintptr_t)fileinformation) : -1;
#else
    (void)objectattributes;
    (void)fileinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryInformationByName(JNIEnv* km_env, jclass km_clazz, jlong objectattributes, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationByName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectattributes, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass) : -1;
#else
    (void)objectattributes;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryInformationToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryInformationToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong sidlist, jint sidlistlength, jlong startsid, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryQuotaInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)sidlist, (uint32_t)sidlistlength, (void*)(uintptr_t)startsid, (bool)restartscan) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQuerySecurityObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor, jint length, jlong lengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySecurityObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor, (uint32_t)length, (void*)(uintptr_t)lengthneeded) : -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQuerySymbolicLinkObject(JNIEnv* km_env, jclass km_clazz, jlong linkhandle, jlong linktarget, jlong returnedlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQuerySymbolicLinkObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)linkhandle, (void*)(uintptr_t)linktarget, (void*)(uintptr_t)returnedlength) : -1;
#else
    (void)linkhandle;
    (void)linktarget;
    (void)returnedlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jint memoryinformationclass, jlong memoryinformation, jlong memoryinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (int32_t)memoryinformationclass, (void*)(uintptr_t)memoryinformation, (uint64_t)memoryinformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntQueryVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtQueryVolumeInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntReadFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong buffer, jint length, jlong byteoffset, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtReadFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)key) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntSetEaFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetEaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntSetEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jlong previousstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eventhandle, (void*)(uintptr_t)previousstate) : -1;
#else
    (void)eventhandle;
    (void)previousstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntSetInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fileinformation;
    (void)length;
    (void)fileinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntSetInformationToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntSetInformationVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint vminformationclass, jlong numberofentries, jlong virtualaddresses, jlong vminformation, jint vminformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetInformationVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (int32_t)vminformationclass, (uint64_t)numberofentries, (void*)(uintptr_t)virtualaddresses, (void*)(uintptr_t)vminformation, (uint32_t)vminformationlength) : -1;
#else
    (void)processhandle;
    (void)vminformationclass;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)vminformation;
    (void)vminformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntSetQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetQuotaInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntSetSecurityObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetSecurityObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntSetVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtSetVolumeInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntUnlockFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong byteoffset, jlong length, jint key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtUnlockFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)length, (uint32_t)key) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1ntWriteFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong buffer, jint length, jlong byteoffset, jlong key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "NtWriteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)key) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1obInsertObject(JNIEnv* km_env, jclass km_clazz, jlong object, jlong passedaccessstate, jint desiredaccess, jint objectpointerbias, jlong newobject, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObInsertObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)passedaccessstate, (uint32_t)desiredaccess, (uint32_t)objectpointerbias, (void*)(uintptr_t)newobject, (void*)(uintptr_t)handle) : -1;
#else
    (void)object;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objectpointerbias;
    (void)newobject;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1obIsKernelHandle(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObIsKernelHandle");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : false;
#else
    (void)handle;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1obMakeTemporaryObject(JNIEnv* km_env, jclass km_clazz, jlong object) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObMakeTemporaryObject");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)object);
#else
    (void)object;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1obOpenObjectByPointer(JNIEnv* km_env, jclass km_clazz, jlong object, jint handleattributes, jlong passedaccessstate, jint desiredaccess, jlong objecttype, jbyte accessmode, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObOpenObjectByPointer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)object, (uint32_t)handleattributes, (void*)(uintptr_t)passedaccessstate, (uint32_t)desiredaccess, (int64_t)objecttype, (int8_t)accessmode, (void*)(uintptr_t)handle) : -1;
#else
    (void)object;
    (void)handleattributes;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1obOpenObjectByPointerWithTag(JNIEnv* km_env, jclass km_clazz, jlong object, jint handleattributes, jlong passedaccessstate, jint desiredaccess, jlong objecttype, jbyte accessmode, jint tag, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, int64_t, int8_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObOpenObjectByPointerWithTag");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)object, (uint32_t)handleattributes, (void*)(uintptr_t)passedaccessstate, (uint32_t)desiredaccess, (int64_t)objecttype, (int8_t)accessmode, (uint32_t)tag, (void*)(uintptr_t)handle) : -1;
#else
    (void)object;
    (void)handleattributes;
    (void)passedaccessstate;
    (void)desiredaccess;
    (void)objecttype;
    (void)accessmode;
    (void)tag;
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1obQueryNameString(JNIEnv* km_env, jclass km_clazz, jlong object, jlong objectnameinfo, jint length, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObQueryNameString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)objectnameinfo, (uint32_t)length, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)object;
    (void)objectnameinfo;
    (void)length;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1obQueryObjectAuditingByHandle(JNIEnv* km_env, jclass km_clazz, jlong handle, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ObQueryObjectAuditingByHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (void*)(uintptr_t)generateonclose) : -1;
#else
    (void)handle;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1pfxFindPrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong fullname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxFindPrefix");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)fullname) : NULL;
#else
    (void)prefixtable;
    (void)fullname;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1pfxInitialize(JNIEnv* km_env, jclass km_clazz, jlong prefixtable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxInitialize");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prefixtable);
#else
    (void)prefixtable;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1pfxInsertPrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong prefix, jlong prefixtableentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxInsertPrefix");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)prefix, (void*)(uintptr_t)prefixtableentry) : false;
#else
    (void)prefixtable;
    (void)prefix;
    (void)prefixtableentry;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1pfxRemovePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong prefixtableentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PfxRemovePrefix");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)prefixtableentry);
#else
    (void)prefixtable;
    (void)prefixtableentry;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1poQueueShutdownWorkItem(JNIEnv* km_env, jclass km_clazz, jlong workitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PoQueueShutdownWorkItem");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)workitem) : -1;
#else
    (void)workitem;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psAssignImpersonationToken(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsAssignImpersonationToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread, (void*)(uintptr_t)token) : -1;
#else
    (void)thread;
    (void)token;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psChargePoolQuota(JNIEnv* km_env, jclass km_clazz, jlong process, jint pooltype, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsChargePoolQuota");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)process, (int32_t)pooltype, (uint64_t)amount);
#else
    (void)process;
    (void)pooltype;
    (void)amount;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psChargeProcessPoolQuota(JNIEnv* km_env, jclass km_clazz, jlong process, jint pooltype, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsChargeProcessPoolQuota");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)process, (int32_t)pooltype, (uint64_t)amount) : -1;
#else
    (void)process;
    (void)pooltype;
    (void)amount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psDereferenceImpersonationToken(JNIEnv* km_env, jclass km_clazz, jlong impersonationtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDereferenceImpersonationToken");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)impersonationtoken);
#else
    (void)impersonationtoken;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psDereferencePrimaryToken(JNIEnv* km_env, jclass km_clazz, jlong primarytoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDereferencePrimaryToken");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)primarytoken);
#else
    (void)primarytoken;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psDisableImpersonation(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong impersonationstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsDisableImpersonation");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread, (void*)(uintptr_t)impersonationstate) : false;
#else
    (void)thread;
    (void)impersonationstate;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psGetProcessExitTime(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetProcessExitTime");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psGetThreadProcess(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsGetThreadProcess");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread) : -1;
#else
    (void)thread;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psImpersonateClient(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong token, jboolean copyonopen, jboolean effectiveonly, jint impersonationlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, bool, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsImpersonateClient");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread, (void*)(uintptr_t)token, (bool)copyonopen, (bool)effectiveonly, (int32_t)impersonationlevel) : -1;
#else
    (void)thread;
    (void)token;
    (void)copyonopen;
    (void)effectiveonly;
    (void)impersonationlevel;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psIsDiskCountersEnabled(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsDiskCountersEnabled");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : false;
#else
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psIsSystemThread(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsSystemThread");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread) : false;
#else
    (void)thread;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psIsThreadTerminating(JNIEnv* km_env, jclass km_clazz, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsIsThreadTerminating");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread) : false;
#else
    (void)thread;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psLookupProcessByProcessId(JNIEnv* km_env, jclass km_clazz, jlong processid, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsLookupProcessByProcessId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processid, (void*)(uintptr_t)process) : -1;
#else
    (void)processid;
    (void)process;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psLookupThreadByThreadId(JNIEnv* km_env, jclass km_clazz, jlong threadid, jlong thread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsLookupThreadByThreadId");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadid, (void*)(uintptr_t)thread) : -1;
#else
    (void)threadid;
    (void)thread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psReferenceImpersonationToken(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong copyonopen, jlong effectiveonly, jlong impersonationlevel) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReferenceImpersonationToken");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)thread, (void*)(uintptr_t)copyonopen, (void*)(uintptr_t)effectiveonly, (void*)(uintptr_t)impersonationlevel) : NULL;
#else
    (void)thread;
    (void)copyonopen;
    (void)effectiveonly;
    (void)impersonationlevel;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psReferencePrimaryToken(JNIEnv* km_env, jclass km_clazz, jlong process) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReferencePrimaryToken");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)process) : NULL;
#else
    (void)process;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psRestoreImpersonation(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong impersonationstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRestoreImpersonation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)thread, (void*)(uintptr_t)impersonationstate);
#else
    (void)thread;
    (void)impersonationstate;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psReturnPoolQuota(JNIEnv* km_env, jclass km_clazz, jlong process, jint pooltype, jlong amount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsReturnPoolQuota");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)process, (int32_t)pooltype, (uint64_t)amount);
#else
    (void)process;
    (void)pooltype;
    (void)amount;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psRevertToSelf(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsRevertToSelf");
    }
    if (km_fn_ptr != NULL) km_fn_ptr();
#else
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1psUpdateDiskCounters(JNIEnv* km_env, jclass km_clazz, jlong process, jlong bytesread, jlong byteswritten, jint readoperationcount, jint writeoperationcount, jint flushoperationcount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, uint64_t, uint64_t, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PsUpdateDiskCounters");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)process, (uint64_t)bytesread, (uint64_t)byteswritten, (uint32_t)readoperationcount, (uint32_t)writeoperationcount, (uint32_t)flushoperationcount);
#else
    (void)process;
    (void)bytesread;
    (void)byteswritten;
    (void)readoperationcount;
    (void)writeoperationcount;
    (void)flushoperationcount;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1querySecurityContextToken(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QuerySecurityContextToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)token) : -1;
#else
    (void)phcontext;
    (void)token;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlAbsoluteToSelfRelativeSD(JNIEnv* km_env, jclass km_clazz, jlong absolutesecuritydescriptor, jlong selfrelativesecuritydescriptor, jlong bufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAbsoluteToSelfRelativeSD");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)absolutesecuritydescriptor, (void*)(uintptr_t)selfrelativesecuritydescriptor, (void*)(uintptr_t)bufferlength) : -1;
#else
    (void)absolutesecuritydescriptor;
    (void)selfrelativesecuritydescriptor;
    (void)bufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlAddAccessAllowedAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint acerevision, jint accessmask, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddAccessAllowedAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)acerevision, (uint32_t)accessmask, (void*)(uintptr_t)sid) : -1;
#else
    (void)acl;
    (void)acerevision;
    (void)accessmask;
    (void)sid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlAddAccessAllowedAceEx(JNIEnv* km_env, jclass km_clazz, jlong acl, jint acerevision, jint aceflags, jint accessmask, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddAccessAllowedAceEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)acerevision, (uint32_t)aceflags, (uint32_t)accessmask, (void*)(uintptr_t)sid) : -1;
#else
    (void)acl;
    (void)acerevision;
    (void)aceflags;
    (void)accessmask;
    (void)sid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlAddAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint acerevision, jint startingaceindex, jlong acelist, jint acelistlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAddAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)acerevision, (uint32_t)startingaceindex, (void*)(uintptr_t)acelist, (uint32_t)acelistlength) : -1;
#else
    (void)acl;
    (void)acerevision;
    (void)startingaceindex;
    (void)acelist;
    (void)acelistlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlAllocateAndInitializeSid(JNIEnv* km_env, jclass km_clazz, jlong identifierauthority, jbyte subauthoritycount, jint subauthority0, jint subauthority1, jint subauthority2, jint subauthority3, jint subauthority4, jint subauthority5, jint subauthority6, jint subauthority7, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAllocateAndInitializeSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount, (uint32_t)subauthority0, (uint32_t)subauthority1, (uint32_t)subauthority2, (uint32_t)subauthority3, (uint32_t)subauthority4, (uint32_t)subauthority5, (uint32_t)subauthority6, (uint32_t)subauthority7, (void*)(uintptr_t)sid) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlAllocateAndInitializeSidEx(JNIEnv* km_env, jclass km_clazz, jlong identifierauthority, jbyte subauthoritycount, jlong subauthorities, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAllocateAndInitializeSidEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount, (void*)(uintptr_t)subauthorities, (void*)(uintptr_t)sid) : -1;
#else
    (void)identifierauthority;
    (void)subauthoritycount;
    (void)subauthorities;
    (void)sid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlAllocateHeap(JNIEnv* km_env, jclass km_clazz, jlong heaphandle, jint flags, jlong size) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAllocateHeap");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heaphandle, (uint32_t)flags, (uint64_t)size) : NULL;
#else
    (void)heaphandle;
    (void)flags;
    (void)size;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlAppendStringToString(JNIEnv* km_env, jclass km_clazz, jlong destination, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlAppendStringToString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destination, (void*)(uintptr_t)source) : -1;
#else
    (void)destination;
    (void)source;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCompareAltitudes(JNIEnv* km_env, jclass km_clazz, jlong altitude1, jlong altitude2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareAltitudes");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)altitude1, (void*)(uintptr_t)altitude2) : -1;
#else
    (void)altitude1;
    (void)altitude2;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCompareMemoryUlong(JNIEnv* km_env, jclass km_clazz, jlong source, jlong length, jint pattern) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompareMemoryUlong");
    }
    uint64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)source, (uint64_t)length, (uint32_t)pattern) : 0;
#else
    (void)source;
    (void)length;
    (void)pattern;
    uint64_t km_res = 0;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCompressBuffer(JNIEnv* km_env, jclass km_clazz, jshort compressionformatandengine, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jint uncompressedchunksize, jlong finalcompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompressBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)compressionformatandengine, (void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (uint32_t)uncompressedchunksize, (void*)(uintptr_t)finalcompressedsize, (void*)(uintptr_t)workspace) : -1;
#else
    (void)compressionformatandengine;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)uncompressedchunksize;
    (void)finalcompressedsize;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCompressChunks(JNIEnv* km_env, jclass km_clazz, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jlong compresseddatainfo, jint compresseddatainfolength, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCompressChunks");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (void*)(uintptr_t)compresseddatainfo, (uint32_t)compresseddatainfolength, (void*)(uintptr_t)workspace) : -1;
#else
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compresseddatainfo;
    (void)compresseddatainfolength;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCopyLuid(JNIEnv* km_env, jclass km_clazz, jlong destinationluid, jlong sourceluid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCopyLuid");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)destinationluid, (void*)(uintptr_t)sourceluid);
#else
    (void)destinationluid;
    (void)sourceluid;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCopySid(JNIEnv* km_env, jclass km_clazz, jint destinationsidlength, jlong destinationsid, jlong sourcesid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCopySid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)destinationsidlength, (void*)(uintptr_t)destinationsid, (void*)(uintptr_t)sourcesid) : -1;
#else
    (void)destinationsidlength;
    (void)destinationsid;
    (void)sourcesid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCreateAcl(JNIEnv* km_env, jclass km_clazz, jlong acl, jint acllength, jint aclrevision) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateAcl");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)acllength, (uint32_t)aclrevision) : -1;
#else
    (void)acl;
    (void)acllength;
    (void)aclrevision;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCreateHeap(JNIEnv* km_env, jclass km_clazz, jint flags, jlong heapbase, jlong reservesize, jlong commitsize, jlong lock, jlong parameters) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(uint32_t, void*, uint64_t, uint64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateHeap");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)heapbase, (uint64_t)reservesize, (uint64_t)commitsize, (void*)(uintptr_t)lock, (void*)(uintptr_t)parameters) : NULL;
#else
    (void)flags;
    (void)heapbase;
    (void)reservesize;
    (void)commitsize;
    (void)lock;
    (void)parameters;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCreateServiceSid(JNIEnv* km_env, jclass km_clazz, jlong servicename, jlong servicesid, jlong servicesidlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateServiceSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)servicename, (void*)(uintptr_t)servicesid, (void*)(uintptr_t)servicesidlength) : -1;
#else
    (void)servicename;
    (void)servicesid;
    (void)servicesidlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCreateSystemVolumeInformationFolder(JNIEnv* km_env, jclass km_clazz, jlong volumerootpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateSystemVolumeInformationFolder");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)volumerootpath) : -1;
#else
    (void)volumerootpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCreateUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateUnicodeString");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring) : false;
#else
    (void)destinationstring;
    (void)sourcestring;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCreateVirtualAccountSid(JNIEnv* km_env, jclass km_clazz, jlong name, jint basesubauthority, jlong sid, jlong sidlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCreateVirtualAccountSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (uint32_t)basesubauthority, (void*)(uintptr_t)sid, (void*)(uintptr_t)sidlength) : -1;
#else
    (void)name;
    (void)basesubauthority;
    (void)sid;
    (void)sidlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlCustomCPToUnicodeN(JNIEnv* km_env, jclass km_clazz, jlong customcp, jlong unicodestring, jint maxbytesinunicodestring, jlong bytesinunicodestring, jlong customcpstring, jint bytesincustomcpstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlCustomCPToUnicodeN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcp, (void*)(uintptr_t)unicodestring, (uint32_t)maxbytesinunicodestring, (void*)(uintptr_t)bytesinunicodestring, (void*)(uintptr_t)customcpstring, (uint32_t)bytesincustomcpstring) : -1;
#else
    (void)customcp;
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)customcpstring;
    (void)bytesincustomcpstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDecompressBuffer(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jlong finaluncompressedsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (void*)(uintptr_t)finaluncompressedsize) : -1;
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)finaluncompressedsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDecompressBufferEx(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jlong finaluncompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressBufferEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (void*)(uintptr_t)finaluncompressedsize, (void*)(uintptr_t)workspace) : -1;
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)finaluncompressedsize;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDecompressBufferEx2(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jint uncompressedchunksize, jlong finaluncompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressBufferEx2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (uint32_t)uncompressedchunksize, (void*)(uintptr_t)finaluncompressedsize, (void*)(uintptr_t)workspace) : -1;
#else
    (void)compressionformat;
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)uncompressedchunksize;
    (void)finaluncompressedsize;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDecompressChunks(JNIEnv* km_env, jclass km_clazz, jlong uncompressedbuffer, jint uncompressedbuffersize, jlong compressedbuffer, jint compressedbuffersize, jlong compressedtail, jint compressedtailsize, jlong compresseddatainfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressChunks");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)uncompressedbuffer, (uint32_t)uncompressedbuffersize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (void*)(uintptr_t)compressedtail, (uint32_t)compressedtailsize, (void*)(uintptr_t)compresseddatainfo) : -1;
#else
    (void)uncompressedbuffer;
    (void)uncompressedbuffersize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)compressedtail;
    (void)compressedtailsize;
    (void)compresseddatainfo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDecompressFragment(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedfragment, jint uncompressedfragmentsize, jlong compressedbuffer, jint compressedbuffersize, jint fragmentoffset, jlong finaluncompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressFragment");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedfragment, (uint32_t)uncompressedfragmentsize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (uint32_t)fragmentoffset, (void*)(uintptr_t)finaluncompressedsize, (void*)(uintptr_t)workspace) : -1;
#else
    (void)compressionformat;
    (void)uncompressedfragment;
    (void)uncompressedfragmentsize;
    (void)compressedbuffer;
    (void)compressedbuffersize;
    (void)fragmentoffset;
    (void)finaluncompressedsize;
    (void)workspace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDecompressFragmentEx(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong uncompressedfragment, jint uncompressedfragmentsize, jlong compressedbuffer, jint compressedbuffersize, jint fragmentoffset, jint uncompressedchunksize, jlong finaluncompressedsize, jlong workspace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, uint32_t, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDecompressFragmentEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)uncompressedfragment, (uint32_t)uncompressedfragmentsize, (void*)(uintptr_t)compressedbuffer, (uint32_t)compressedbuffersize, (uint32_t)fragmentoffset, (uint32_t)uncompressedchunksize, (void*)(uintptr_t)finaluncompressedsize, (void*)(uintptr_t)workspace) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDeleteAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint aceindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDeleteAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)aceindex) : -1;
#else
    (void)acl;
    (void)aceindex;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDescribeChunk(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong compressedbuffer, jlong endofcompressedbufferplus1, jlong chunkbuffer, jlong chunksize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDescribeChunk");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)compressedbuffer, (void*)(uintptr_t)endofcompressedbufferplus1, (void*)(uintptr_t)chunkbuffer, (void*)(uintptr_t)chunksize) : -1;
#else
    (void)compressionformat;
    (void)compressedbuffer;
    (void)endofcompressedbufferplus1;
    (void)chunkbuffer;
    (void)chunksize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDestroyHeap(JNIEnv* km_env, jclass km_clazz, jlong heaphandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDestroyHeap");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heaphandle) : NULL;
#else
    (void)heaphandle;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDosPathNameToNtPathNameUWithStatus(JNIEnv* km_env, jclass km_clazz, jlong dosfilename, jlong ntfilename, jlong filepart, jlong reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDosPathNameToNtPathName_U_WithStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dosfilename, (void*)(uintptr_t)ntfilename, (void*)(uintptr_t)filepart, (void*)(uintptr_t)reserved) : -1;
#else
    (void)dosfilename;
    (void)ntfilename;
    (void)filepart;
    (void)reserved;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDowncaseUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDowncaseUnicodeString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlDuplicateUnicodeString(JNIEnv* km_env, jclass km_clazz, jint flags, jlong stringin, jlong stringout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlDuplicateUnicodeString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)stringin, (void*)(uintptr_t)stringout) : -1;
#else
    (void)flags;
    (void)stringin;
    (void)stringout;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlEqualPrefixSid(JNIEnv* km_env, jclass km_clazz, jlong sid1, jlong sid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEqualPrefixSid");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid1, (void*)(uintptr_t)sid2) : false;
#else
    (void)sid1;
    (void)sid2;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlEqualSid(JNIEnv* km_env, jclass km_clazz, jlong sid1, jlong sid2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlEqualSid");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid1, (void*)(uintptr_t)sid2) : false;
#else
    (void)sid1;
    (void)sid2;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlFindUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong fullname, jint caseinsensitiveindex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFindUnicodePrefix");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)fullname, (uint32_t)caseinsensitiveindex) : NULL;
#else
    (void)prefixtable;
    (void)fullname;
    (void)caseinsensitiveindex;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlFreeHeap(JNIEnv* km_env, jclass km_clazz, jlong heaphandle, jint flags, jlong baseaddress) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeHeap");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)heaphandle, (uint32_t)flags, (void*)(uintptr_t)baseaddress) : 0;
#else
    (void)heaphandle;
    (void)flags;
    (void)baseaddress;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlFreeSid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlFreeSid");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid) : NULL;
#else
    (void)sid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlGenerate8dot3Name(JNIEnv* km_env, jclass km_clazz, jlong name, jboolean allowextendedcharacters, jlong context, jlong name8dot3) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGenerate8dot3Name");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (bool)allowextendedcharacters, (void*)(uintptr_t)context, (void*)(uintptr_t)name8dot3) : -1;
#else
    (void)name;
    (void)allowextendedcharacters;
    (void)context;
    (void)name8dot3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlGetAce(JNIEnv* km_env, jclass km_clazz, jlong acl, jint aceindex, jlong ace) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetAce");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)acl, (uint32_t)aceindex, (void*)(uintptr_t)ace) : -1;
#else
    (void)acl;
    (void)aceindex;
    (void)ace;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlGetCompressionWorkSpaceSize(JNIEnv* km_env, jclass km_clazz, jshort compressionformatandengine, jlong compressbufferworkspacesize, jlong compressfragmentworkspacesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetCompressionWorkSpaceSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)compressionformatandengine, (void*)(uintptr_t)compressbufferworkspacesize, (void*)(uintptr_t)compressfragmentworkspacesize) : -1;
#else
    (void)compressionformatandengine;
    (void)compressbufferworkspacesize;
    (void)compressfragmentworkspacesize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlGetDaclSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong daclpresent, jlong dacl, jlong dacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetDaclSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)daclpresent, (void*)(uintptr_t)dacl, (void*)(uintptr_t)dacldefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)daclpresent;
    (void)dacl;
    (void)dacldefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlGetGroupSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong group, jlong groupdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetGroupSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)group, (void*)(uintptr_t)groupdefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)group;
    (void)groupdefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlGetOwnerSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong owner, jlong ownerdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetOwnerSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)owner, (void*)(uintptr_t)ownerdefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)owner;
    (void)ownerdefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlGetSaclSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong saclpresent, jlong sacl, jlong sacldefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlGetSaclSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)saclpresent, (void*)(uintptr_t)sacl, (void*)(uintptr_t)sacldefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)saclpresent;
    (void)sacl;
    (void)sacldefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIdentifierAuthoritySid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdentifierAuthoritySid");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid) : NULL;
#else
    (void)sid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIdnToAscii(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcestring, jint sourcestringlength, jlong destinationstring, jlong destinationstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdnToAscii");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)destinationstring, (void*)(uintptr_t)destinationstringlength) : -1;
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIdnToNameprepUnicode(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcestring, jint sourcestringlength, jlong destinationstring, jlong destinationstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdnToNameprepUnicode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)destinationstring, (void*)(uintptr_t)destinationstringlength) : -1;
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIdnToUnicode(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcestring, jint sourcestringlength, jlong destinationstring, jlong destinationstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIdnToUnicode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)destinationstring, (void*)(uintptr_t)destinationstringlength) : -1;
#else
    (void)flags;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlInitCodePageTable(JNIEnv* km_env, jclass km_clazz, jlong tablebase, jlong codepagetable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitCodePageTable");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)tablebase, (void*)(uintptr_t)codepagetable);
#else
    (void)tablebase;
    (void)codepagetable;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlInitUnicodeStringEx(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitUnicodeStringEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlInitializeSid(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong identifierauthority, jbyte subauthoritycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)identifierauthority, (uint8_t)subauthoritycount) : -1;
#else
    (void)sid;
    (void)identifierauthority;
    (void)subauthoritycount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlInitializeSidEx(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong identifierauthority, jbyte subauthoritycount, jint km_vac, jlong km_va0, jlong km_va1, jlong km_va2, jlong km_va3) {
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
    }
#else
    (void)sid;
    (void)identifierauthority;
    (void)subauthoritycount;
    (void)km_vac; (void)km_va0; (void)km_va1; (void)km_va2; (void)km_va3;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlInitializeUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInitializeUnicodePrefix");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prefixtable);
#else
    (void)prefixtable;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlInsertUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong prefix, jlong prefixtableentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlInsertUnicodePrefix");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)prefix, (void*)(uintptr_t)prefixtableentry) : false;
#else
    (void)prefixtable;
    (void)prefix;
    (void)prefixtableentry;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIsCloudFilesPlaceholder(JNIEnv* km_env, jclass km_clazz, jint fileattributes, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsCloudFilesPlaceholder");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fileattributes, (uint32_t)reparsetag) : false;
#else
    (void)fileattributes;
    (void)reparsetag;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIsDosDeviceNameU(JNIEnv* km_env, jclass km_clazz, jlong dosfilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsDosDeviceName_U");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)dosfilename) : 0;
#else
    (void)dosfilename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIsNonEmptyDirectoryReparsePointAllowed(JNIEnv* km_env, jclass km_clazz, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsNonEmptyDirectoryReparsePointAllowed");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)reparsetag) : false;
#else
    (void)reparsetag;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIsNormalizedString(JNIEnv* km_env, jclass km_clazz, jint normform, jlong sourcestring, jint sourcestringlength, jlong normalized) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsNormalizedString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)normform, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)normalized) : -1;
#else
    (void)normform;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)normalized;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIsPartialPlaceholder(JNIEnv* km_env, jclass km_clazz, jint fileattributes, jint reparsetag) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsPartialPlaceholder");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)fileattributes, (uint32_t)reparsetag) : false;
#else
    (void)fileattributes;
    (void)reparsetag;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIsPartialPlaceholderFileHandle(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong ispartialplaceholder) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsPartialPlaceholderFileHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)ispartialplaceholder) : -1;
#else
    (void)filehandle;
    (void)ispartialplaceholder;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIsPartialPlaceholderFileInfo(JNIEnv* km_env, jclass km_clazz, jlong infobuffer, jint infoclass, jlong ispartialplaceholder) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsPartialPlaceholderFileInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)infobuffer, (int32_t)infoclass, (void*)(uintptr_t)ispartialplaceholder) : -1;
#else
    (void)infobuffer;
    (void)infoclass;
    (void)ispartialplaceholder;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIsSandboxedToken(JNIEnv* km_env, jclass km_clazz, jlong context, jbyte previousmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsSandboxedToken");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context, (int8_t)previousmode) : false;
#else
    (void)context;
    (void)previousmode;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlIsValidOemCharacter(JNIEnv* km_env, jclass km_clazz, jlong arg_0_char) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlIsValidOemCharacter");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_char) : false;
#else
    (void)arg_0_char;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlLengthRequiredSid(JNIEnv* km_env, jclass km_clazz, jint subauthoritycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLengthRequiredSid");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)subauthoritycount) : 0;
#else
    (void)subauthoritycount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlLengthSid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlLengthSid");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid) : 0;
#else
    (void)sid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlMultiByteToUnicodeN(JNIEnv* km_env, jclass km_clazz, jlong unicodestring, jint maxbytesinunicodestring, jlong bytesinunicodestring, jlong multibytestring, jint bytesinmultibytestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlMultiByteToUnicodeN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)unicodestring, (uint32_t)maxbytesinunicodestring, (void*)(uintptr_t)bytesinunicodestring, (void*)(uintptr_t)multibytestring, (uint32_t)bytesinmultibytestring) : -1;
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlMultiByteToUnicodeSize(JNIEnv* km_env, jclass km_clazz, jlong bytesinunicodestring, jlong multibytestring, jint bytesinmultibytestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlMultiByteToUnicodeSize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)bytesinunicodestring, (void*)(uintptr_t)multibytestring, (uint32_t)bytesinmultibytestring) : -1;
#else
    (void)bytesinunicodestring;
    (void)multibytestring;
    (void)bytesinmultibytestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlNextUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jboolean restart) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNextUnicodePrefix");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prefixtable, (bool)restart) : NULL;
#else
    (void)prefixtable;
    (void)restart;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlNormalizeString(JNIEnv* km_env, jclass km_clazz, jint normform, jlong sourcestring, jint sourcestringlength, jlong destinationstring, jlong destinationstringlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNormalizeString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)normform, (void*)(uintptr_t)sourcestring, (int32_t)sourcestringlength, (void*)(uintptr_t)destinationstring, (void*)(uintptr_t)destinationstringlength) : -1;
#else
    (void)normform;
    (void)sourcestring;
    (void)sourcestringlength;
    (void)destinationstring;
    (void)destinationstringlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlNtStatusToDosErrorNoTeb(JNIEnv* km_env, jclass km_clazz, jint status) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlNtStatusToDosErrorNoTeb");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)status) : 0;
#else
    (void)status;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlOemStringToCountedUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOemStringToCountedUnicodeString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlOemStringToUnicodeString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOemStringToUnicodeString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlOemToUnicodeN(JNIEnv* km_env, jclass km_clazz, jlong unicodestring, jint maxbytesinunicodestring, jlong bytesinunicodestring, jlong oemstring, jint bytesinoemstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlOemToUnicodeN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)unicodestring, (uint32_t)maxbytesinunicodestring, (void*)(uintptr_t)bytesinunicodestring, (void*)(uintptr_t)oemstring, (uint32_t)bytesinoemstring) : -1;
#else
    (void)unicodestring;
    (void)maxbytesinunicodestring;
    (void)bytesinunicodestring;
    (void)oemstring;
    (void)bytesinoemstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlPrefixString(JNIEnv* km_env, jclass km_clazz, jlong string1, jlong string2, jboolean caseinsensitive) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlPrefixString");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)string1, (void*)(uintptr_t)string2, (bool)caseinsensitive) : false;
#else
    (void)string1;
    (void)string2;
    (void)caseinsensitive;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlQueryPackageIdentity(JNIEnv* km_env, jclass km_clazz, jlong tokenobject, jlong packagefullname, jlong packagesize, jlong appid, jlong appidsize, jlong packaged) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryPackageIdentity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenobject, (void*)(uintptr_t)packagefullname, (void*)(uintptr_t)packagesize, (void*)(uintptr_t)appid, (void*)(uintptr_t)appidsize, (void*)(uintptr_t)packaged) : -1;
#else
    (void)tokenobject;
    (void)packagefullname;
    (void)packagesize;
    (void)appid;
    (void)appidsize;
    (void)packaged;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlQueryPackageIdentityEx(JNIEnv* km_env, jclass km_clazz, jlong tokenobject, jlong packagefullname, jlong packagesize, jlong appid, jlong appidsize, jlong dynamicid, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryPackageIdentityEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenobject, (void*)(uintptr_t)packagefullname, (void*)(uintptr_t)packagesize, (void*)(uintptr_t)appid, (void*)(uintptr_t)appidsize, (void*)(uintptr_t)dynamicid, (void*)(uintptr_t)flags) : -1;
#else
    (void)tokenobject;
    (void)packagefullname;
    (void)packagesize;
    (void)appid;
    (void)appidsize;
    (void)dynamicid;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlQueryProcessPlaceholderCompatibilityMode(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryProcessPlaceholderCompatibilityMode");
    }
    int8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlQueryThreadPlaceholderCompatibilityMode(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlQueryThreadPlaceholderCompatibilityMode");
    }
    int8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : -1;
#else
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlRandom(JNIEnv* km_env, jclass km_clazz, jlong seed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRandom");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)seed) : 0;
#else
    (void)seed;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlRandomEx(JNIEnv* km_env, jclass km_clazz, jlong seed) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRandomEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)seed) : 0;
#else
    (void)seed;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlRemoveUnicodePrefix(JNIEnv* km_env, jclass km_clazz, jlong prefixtable, jlong prefixtableentry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlRemoveUnicodePrefix");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)prefixtable, (void*)(uintptr_t)prefixtableentry);
#else
    (void)prefixtable;
    (void)prefixtableentry;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlReplaceSidInSd(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong oldsid, jlong newsid, jlong numchanges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlReplaceSidInSd");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)oldsid, (void*)(uintptr_t)newsid, (void*)(uintptr_t)numchanges) : -1;
#else
    (void)securitydescriptor;
    (void)oldsid;
    (void)newsid;
    (void)numchanges;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlReserveChunk(JNIEnv* km_env, jclass km_clazz, jshort compressionformat, jlong compressedbuffer, jlong endofcompressedbufferplus1, jlong chunkbuffer, jint chunksize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint16_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlReserveChunk");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint16_t)compressionformat, (void*)(uintptr_t)compressedbuffer, (void*)(uintptr_t)endofcompressedbufferplus1, (void*)(uintptr_t)chunkbuffer, (uint32_t)chunksize) : -1;
#else
    (void)compressionformat;
    (void)compressedbuffer;
    (void)endofcompressedbufferplus1;
    (void)chunkbuffer;
    (void)chunksize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlSecondsSince1970ToTime(JNIEnv* km_env, jclass km_clazz, jint elapsedseconds, jlong arg_1_time) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSecondsSince1970ToTime");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)elapsedseconds, (void*)(uintptr_t)arg_1_time);
#else
    (void)elapsedseconds;
    (void)arg_1_time;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlSecondsSince1980ToTime(JNIEnv* km_env, jclass km_clazz, jint elapsedseconds, jlong arg_1_time) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSecondsSince1980ToTime");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((uint32_t)elapsedseconds, (void*)(uintptr_t)arg_1_time);
#else
    (void)elapsedseconds;
    (void)arg_1_time;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlSelfRelativeToAbsoluteSD(JNIEnv* km_env, jclass km_clazz, jlong selfrelativesecuritydescriptor, jlong absolutesecuritydescriptor, jlong absolutesecuritydescriptorsize, jlong dacl, jlong daclsize, jlong sacl, jlong saclsize, jlong owner, jlong ownersize, jlong primarygroup, jlong primarygroupsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSelfRelativeToAbsoluteSD");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)selfrelativesecuritydescriptor, (void*)(uintptr_t)absolutesecuritydescriptor, (void*)(uintptr_t)absolutesecuritydescriptorsize, (void*)(uintptr_t)dacl, (void*)(uintptr_t)daclsize, (void*)(uintptr_t)sacl, (void*)(uintptr_t)saclsize, (void*)(uintptr_t)owner, (void*)(uintptr_t)ownersize, (void*)(uintptr_t)primarygroup, (void*)(uintptr_t)primarygroupsize) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlSetGroupSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong group, jboolean groupdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetGroupSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)group, (bool)groupdefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)group;
    (void)groupdefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlSetOwnerSecurityDescriptor(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong owner, jboolean ownerdefaulted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetOwnerSecurityDescriptor");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)owner, (bool)ownerdefaulted) : -1;
#else
    (void)securitydescriptor;
    (void)owner;
    (void)ownerdefaulted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlSetProcessPlaceholderCompatibilityMode(JNIEnv* km_env, jclass km_clazz, jbyte mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetProcessPlaceholderCompatibilityMode");
    }
    int8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int8_t)mode) : -1;
#else
    (void)mode;
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jbyte JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlSetThreadPlaceholderCompatibilityMode(JNIEnv* km_env, jclass km_clazz, jbyte mode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int8_t (__stdcall *km_fn_t)(int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSetThreadPlaceholderCompatibilityMode");
    }
    int8_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int8_t)mode) : -1;
#else
    (void)mode;
    int8_t km_res = -1;
#endif
    return (jbyte)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlSubAuthorityCountSid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSubAuthorityCountSid");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid) : NULL;
#else
    (void)sid;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlSubAuthoritySid(JNIEnv* km_env, jclass km_clazz, jlong sid, jint subauthority) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlSubAuthoritySid");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid, (uint32_t)subauthority) : NULL;
#else
    (void)sid;
    (void)subauthority;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlTimeToSecondsSince1980(JNIEnv* km_env, jclass km_clazz, jlong arg_0_time, jlong elapsedseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlTimeToSecondsSince1980");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)arg_0_time, (void*)(uintptr_t)elapsedseconds) : false;
#else
    (void)arg_0_time;
    (void)elapsedseconds;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlUnicodeStringToCountedOemString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeStringToCountedOemString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlUnicodeToCustomCPN(JNIEnv* km_env, jclass km_clazz, jlong customcp, jlong customcpstring, jint maxbytesincustomcpstring, jlong bytesincustomcpstring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToCustomCPN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcp, (void*)(uintptr_t)customcpstring, (uint32_t)maxbytesincustomcpstring, (void*)(uintptr_t)bytesincustomcpstring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring) : -1;
#else
    (void)customcp;
    (void)customcpstring;
    (void)maxbytesincustomcpstring;
    (void)bytesincustomcpstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlUnicodeToMultiByteN(JNIEnv* km_env, jclass km_clazz, jlong multibytestring, jint maxbytesinmultibytestring, jlong bytesinmultibytestring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToMultiByteN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)multibytestring, (uint32_t)maxbytesinmultibytestring, (void*)(uintptr_t)bytesinmultibytestring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring) : -1;
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlUnicodeToOemN(JNIEnv* km_env, jclass km_clazz, jlong oemstring, jint maxbytesinoemstring, jlong bytesinoemstring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUnicodeToOemN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oemstring, (uint32_t)maxbytesinoemstring, (void*)(uintptr_t)bytesinoemstring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring) : -1;
#else
    (void)oemstring;
    (void)maxbytesinoemstring;
    (void)bytesinoemstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlUpcaseUnicodeStringToCountedOemString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeStringToCountedOemString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlUpcaseUnicodeStringToOemString(JNIEnv* km_env, jclass km_clazz, jlong destinationstring, jlong sourcestring, jboolean allocatedestinationstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeStringToOemString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)destinationstring, (void*)(uintptr_t)sourcestring, (bool)allocatedestinationstring) : -1;
#else
    (void)destinationstring;
    (void)sourcestring;
    (void)allocatedestinationstring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlUpcaseUnicodeToCustomCPN(JNIEnv* km_env, jclass km_clazz, jlong customcp, jlong customcpstring, jint maxbytesincustomcpstring, jlong bytesincustomcpstring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToCustomCPN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)customcp, (void*)(uintptr_t)customcpstring, (uint32_t)maxbytesincustomcpstring, (void*)(uintptr_t)bytesincustomcpstring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring) : -1;
#else
    (void)customcp;
    (void)customcpstring;
    (void)maxbytesincustomcpstring;
    (void)bytesincustomcpstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlUpcaseUnicodeToMultiByteN(JNIEnv* km_env, jclass km_clazz, jlong multibytestring, jint maxbytesinmultibytestring, jlong bytesinmultibytestring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToMultiByteN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)multibytestring, (uint32_t)maxbytesinmultibytestring, (void*)(uintptr_t)bytesinmultibytestring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring) : -1;
#else
    (void)multibytestring;
    (void)maxbytesinmultibytestring;
    (void)bytesinmultibytestring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlUpcaseUnicodeToOemN(JNIEnv* km_env, jclass km_clazz, jlong oemstring, jint maxbytesinoemstring, jlong bytesinoemstring, jlong unicodestring, jint bytesinunicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlUpcaseUnicodeToOemN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oemstring, (uint32_t)maxbytesinoemstring, (void*)(uintptr_t)bytesinoemstring, (void*)(uintptr_t)unicodestring, (uint32_t)bytesinunicodestring) : -1;
#else
    (void)oemstring;
    (void)maxbytesinoemstring;
    (void)bytesinoemstring;
    (void)unicodestring;
    (void)bytesinunicodestring;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlValidSid(JNIEnv* km_env, jclass km_clazz, jlong sid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlValidSid");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid) : false;
#else
    (void)sid;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlValidateUnicodeString(JNIEnv* km_env, jclass km_clazz, jint flags, jlong string) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlValidateUnicodeString");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)string) : -1;
#else
    (void)flags;
    (void)string;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlxOemStringToUnicodeSize(JNIEnv* km_env, jclass km_clazz, jlong oemstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlxOemStringToUnicodeSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)oemstring) : 0;
#else
    (void)oemstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1rtlxUnicodeStringToOemSize(JNIEnv* km_env, jclass km_clazz, jlong unicodestring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RtlxUnicodeStringToOemSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)unicodestring) : 0;
#else
    (void)unicodestring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAccessCheckFromState(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong primarytokeninformation, jlong clienttokeninformation, jint desiredaccess, jint previouslygrantedaccess, jlong privileges, jlong genericmapping, jbyte accessmode, jlong grantedaccess, jlong accessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAccessCheckFromState");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)primarytokeninformation, (void*)(uintptr_t)clienttokeninformation, (uint32_t)desiredaccess, (uint32_t)previouslygrantedaccess, (void*)(uintptr_t)privileges, (void*)(uintptr_t)genericmapping, (int8_t)accessmode, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus) : false;
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
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAccessCheckFromStateEx(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong primarytoken, jlong clienttoken, jint desiredaccess, jint previouslygrantedaccess, jlong privileges, jlong genericmapping, jbyte accessmode, jlong grantedaccess, jlong accessstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, void*, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAccessCheckFromStateEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)primarytoken, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)previouslygrantedaccess, (void*)(uintptr_t)privileges, (void*)(uintptr_t)genericmapping, (int8_t)accessmode, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus) : false;
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
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAdjustAccessStateForAccessConstraints(JNIEnv* km_env, jclass km_clazz, jlong objecttype, jlong securitydescriptor, jlong accessstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAdjustAccessStateForAccessConstraints");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)objecttype, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate);
#else
    (void)objecttype;
    (void)securitydescriptor;
    (void)accessstate;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAdjustAccessStateForTrustLabel(JNIEnv* km_env, jclass km_clazz, jlong objecttype, jlong securitydescriptor, jlong accessstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAdjustAccessStateForTrustLabel");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)objecttype, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate);
#else
    (void)objecttype;
    (void)securitydescriptor;
    (void)accessstate;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAdjustObjectSecurity(JNIEnv* km_env, jclass km_clazz, jlong objectname, jlong originaldescriptor, jlong proposeddescriptor, jlong subjectsecuritycontext, jlong adjusteddescriptor, jlong applyadjusteddescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAdjustObjectSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectname, (void*)(uintptr_t)originaldescriptor, (void*)(uintptr_t)proposeddescriptor, (void*)(uintptr_t)subjectsecuritycontext, (void*)(uintptr_t)adjusteddescriptor, (void*)(uintptr_t)applyadjusteddescriptor) : -1;
#else
    (void)objectname;
    (void)originaldescriptor;
    (void)proposeddescriptor;
    (void)subjectsecuritycontext;
    (void)adjusteddescriptor;
    (void)applyadjusteddescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAppendPrivileges(JNIEnv* km_env, jclass km_clazz, jlong accessstate, jlong privileges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAppendPrivileges");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)accessstate, (void*)(uintptr_t)privileges) : -1;
#else
    (void)accessstate;
    (void)privileges;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditFipsCryptoSelftests(JNIEnv* km_env, jclass km_clazz, jboolean bsuccess, jint selftestcode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(bool, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditFipsCryptoSelftests");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((bool)bsuccess, (uint32_t)selftestcode);
#else
    (void)bsuccess;
    (void)selftestcode;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditHardLinkCreation(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong linkname, jboolean bsuccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditHardLinkCreation");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)linkname, (bool)bsuccess);
#else
    (void)filename;
    (void)linkname;
    (void)bsuccess;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditHardLinkCreationWithTransaction(JNIEnv* km_env, jclass km_clazz, jlong filename, jlong linkname, jboolean bsuccess, jlong transactionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditHardLinkCreationWithTransaction");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)filename, (void*)(uintptr_t)linkname, (bool)bsuccess, (void*)(uintptr_t)transactionid);
#else
    (void)filename;
    (void)linkname;
    (void)bsuccess;
    (void)transactionid;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditTransactionStateChange(JNIEnv* km_env, jclass km_clazz, jlong transactionid, jlong resourcemanagerid, jint newtransactionstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditTransactionStateChange");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)transactionid, (void*)(uintptr_t)resourcemanagerid, (uint32_t)newtransactionstate);
#else
    (void)transactionid;
    (void)resourcemanagerid;
    (void)newtransactionstate;
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditingAnyFileEventsWithContext(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong subjectsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingAnyFileEventsWithContext");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext) : false;
#else
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditingAnyFileEventsWithContextEx(JNIEnv* km_env, jclass km_clazz, jlong securitydescriptor, jlong subjectsecuritycontext, jlong stagingenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingAnyFileEventsWithContextEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext, (void*)(uintptr_t)stagingenabled) : false;
#else
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    (void)stagingenabled;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditingFileEvents(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileEvents");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditingFileEventsWithContext(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor, jlong subjectsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileEventsWithContext");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditingFileEventsWithContextEx(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor, jlong subjectsecuritycontext, jlong stagingenabled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileEventsWithContextEx");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext, (void*)(uintptr_t)stagingenabled) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    (void)stagingenabled;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditingFileOrGlobalEvents(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor, jlong subjectsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingFileOrGlobalEvents");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditingHardLinkEvents(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingHardLinkEvents");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seAuditingHardLinkEventsWithContext(JNIEnv* km_env, jclass km_clazz, jboolean accessgranted, jlong securitydescriptor, jlong subjectsecuritycontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeAuditingHardLinkEventsWithContext");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((bool)accessgranted, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)subjectsecuritycontext) : false;
#else
    (void)accessgranted;
    (void)securitydescriptor;
    (void)subjectsecuritycontext;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seCaptureSubjectContextEx(JNIEnv* km_env, jclass km_clazz, jlong thread, jlong process, jlong subjectcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCaptureSubjectContextEx");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((int64_t)thread, (int64_t)process, (void*)(uintptr_t)subjectcontext);
#else
    (void)thread;
    (void)process;
    (void)subjectcontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seCheckForCriticalAceRemoval(JNIEnv* km_env, jclass km_clazz, jlong currentdescriptor, jlong newdescriptor, jlong subjectsecuritycontext, jlong aceremoved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCheckForCriticalAceRemoval");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)currentdescriptor, (void*)(uintptr_t)newdescriptor, (void*)(uintptr_t)subjectsecuritycontext, (void*)(uintptr_t)aceremoved);
#else
    (void)currentdescriptor;
    (void)newdescriptor;
    (void)subjectsecuritycontext;
    (void)aceremoved;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seCreateClientSecurity(JNIEnv* km_env, jclass km_clazz, jlong clientthread, jlong clientsecurityqos, jboolean remotesession, jlong clientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCreateClientSecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)clientthread, (void*)(uintptr_t)clientsecurityqos, (bool)remotesession, (void*)(uintptr_t)clientcontext) : -1;
#else
    (void)clientthread;
    (void)clientsecurityqos;
    (void)remotesession;
    (void)clientcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seCreateClientSecurityFromSubjectContext(JNIEnv* km_env, jclass km_clazz, jlong subjectcontext, jlong clientsecurityqos, jboolean serverisremote, jlong clientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeCreateClientSecurityFromSubjectContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subjectcontext, (void*)(uintptr_t)clientsecurityqos, (bool)serverisremote, (void*)(uintptr_t)clientcontext) : -1;
#else
    (void)subjectcontext;
    (void)clientsecurityqos;
    (void)serverisremote;
    (void)clientcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seDeleteClientSecurity(JNIEnv* km_env, jclass km_clazz, jlong clientcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeleteClientSecurity");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)clientcontext);
#else
    (void)clientcontext;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seDeleteObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong object, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeleteObjectAuditAlarm");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)handle);
#else
    (void)object;
    (void)handle;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seDeleteObjectAuditAlarmWithTransaction(JNIEnv* km_env, jclass km_clazz, jlong object, jlong handle, jlong transactionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeDeleteObjectAuditAlarmWithTransaction");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)handle, (void*)(uintptr_t)transactionid);
#else
    (void)object;
    (void)handle;
    (void)transactionid;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seExamineSacl(JNIEnv* km_env, jclass km_clazz, jlong sacl, jlong resourcesacl, jlong token, jint desiredaccess, jboolean accessgranted, jlong generateaudit, jlong generatealarm) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeExamineSacl");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)sacl, (void*)(uintptr_t)resourcesacl, (void*)(uintptr_t)token, (uint32_t)desiredaccess, (bool)accessgranted, (void*)(uintptr_t)generateaudit, (void*)(uintptr_t)generatealarm);
#else
    (void)sacl;
    (void)resourcesacl;
    (void)token;
    (void)desiredaccess;
    (void)accessgranted;
    (void)generateaudit;
    (void)generatealarm;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seFilterToken(JNIEnv* km_env, jclass km_clazz, jlong existingtoken, jint flags, jlong sidstodisable, jlong privilegestodelete, jlong restrictedsids, jlong filteredtoken) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeFilterToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)existingtoken, (uint32_t)flags, (void*)(uintptr_t)sidstodisable, (void*)(uintptr_t)privilegestodelete, (void*)(uintptr_t)restrictedsids, (void*)(uintptr_t)filteredtoken) : -1;
#else
    (void)existingtoken;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)filteredtoken;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seFreePrivileges(JNIEnv* km_env, jclass km_clazz, jlong privileges) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeFreePrivileges");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)privileges);
#else
    (void)privileges;
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seImpersonateClient(JNIEnv* km_env, jclass km_clazz, jlong clientcontext, jlong serverthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeImpersonateClient");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)clientcontext, (int64_t)serverthread);
#else
    (void)clientcontext;
    (void)serverthread;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seImpersonateClientEx(JNIEnv* km_env, jclass km_clazz, jlong clientcontext, jlong serverthread) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeImpersonateClientEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clientcontext, (int64_t)serverthread) : -1;
#else
    (void)clientcontext;
    (void)serverthread;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seLocateProcessImageName(JNIEnv* km_env, jclass km_clazz, jlong process, jlong pimagefilename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeLocateProcessImageName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)process, (void*)(uintptr_t)pimagefilename) : -1;
#else
    (void)process;
    (void)pimagefilename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seMarkLogonSessionForTerminationNotification(JNIEnv* km_env, jclass km_clazz, jlong logonid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeMarkLogonSessionForTerminationNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)logonid) : -1;
#else
    (void)logonid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seMarkLogonSessionForTerminationNotificationEx(JNIEnv* km_env, jclass km_clazz, jlong logonid, jlong pserversilo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeMarkLogonSessionForTerminationNotificationEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)logonid, (int64_t)pserversilo) : -1;
#else
    (void)logonid;
    (void)pserversilo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seOpenObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong object, jlong absoluteobjectname, jlong securitydescriptor, jlong accessstate, jboolean objectcreated, jboolean accessgranted, jbyte accessmode, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectAuditAlarm");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)object, (void*)(uintptr_t)absoluteobjectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate, (bool)objectcreated, (bool)accessgranted, (int8_t)accessmode, (void*)(uintptr_t)generateonclose);
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
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seOpenObjectAuditAlarmWithTransaction(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong object, jlong absoluteobjectname, jlong securitydescriptor, jlong accessstate, jboolean objectcreated, jboolean accessgranted, jbyte accessmode, jlong transactionid, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectAuditAlarmWithTransaction");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)object, (void*)(uintptr_t)absoluteobjectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate, (bool)objectcreated, (bool)accessgranted, (int8_t)accessmode, (void*)(uintptr_t)transactionid, (void*)(uintptr_t)generateonclose);
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
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seOpenObjectForDeleteAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong object, jlong absoluteobjectname, jlong securitydescriptor, jlong accessstate, jboolean objectcreated, jboolean accessgranted, jbyte accessmode, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectForDeleteAuditAlarm");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)object, (void*)(uintptr_t)absoluteobjectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate, (bool)objectcreated, (bool)accessgranted, (int8_t)accessmode, (void*)(uintptr_t)generateonclose);
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
#endif
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seOpenObjectForDeleteAuditAlarmWithTransaction(JNIEnv* km_env, jclass km_clazz, jlong objecttypename, jlong object, jlong absoluteobjectname, jlong securitydescriptor, jlong accessstate, jboolean objectcreated, jboolean accessgranted, jbyte accessmode, jlong transactionid, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, bool, bool, int8_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeOpenObjectForDeleteAuditAlarmWithTransaction");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)objecttypename, (void*)(uintptr_t)object, (void*)(uintptr_t)absoluteobjectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)accessstate, (bool)objectcreated, (bool)accessgranted, (int8_t)accessmode, (void*)(uintptr_t)transactionid, (void*)(uintptr_t)generateonclose);
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
#endif
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sePrivilegeCheck(JNIEnv* km_env, jclass km_clazz, jlong requiredprivileges, jlong subjectsecuritycontext, jbyte accessmode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, int8_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SePrivilegeCheck");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)requiredprivileges, (void*)(uintptr_t)subjectsecuritycontext, (int8_t)accessmode) : false;
#else
    (void)requiredprivileges;
    (void)subjectsecuritycontext;
    (void)accessmode;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seQueryAuthenticationIdToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong authenticationid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQueryAuthenticationIdToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)authenticationid) : -1;
#else
    (void)token;
    (void)authenticationid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seQueryInformationToken(JNIEnv* km_env, jclass km_clazz, jlong token, jint tokeninformationclass, jlong tokeninformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQueryInformationToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation) : -1;
#else
    (void)token;
    (void)tokeninformationclass;
    (void)tokeninformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seQuerySecurityDescriptorInfo(JNIEnv* km_env, jclass km_clazz, jlong securityinformation, jlong securitydescriptor, jlong length, jlong objectssecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQuerySecurityDescriptorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)securityinformation, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)length, (void*)(uintptr_t)objectssecuritydescriptor) : -1;
#else
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)objectssecuritydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seQueryServerSiloToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong pserversilo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQueryServerSiloToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)pserversilo) : -1;
#else
    (void)token;
    (void)pserversilo;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seQuerySessionIdToken(JNIEnv* km_env, jclass km_clazz, jlong token, jlong sessionid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQuerySessionIdToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)sessionid) : -1;
#else
    (void)token;
    (void)sessionid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seQuerySessionIdTokenEx(JNIEnv* km_env, jclass km_clazz, jlong token, jlong sessionid, jlong isservicesession) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeQuerySessionIdTokenEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token, (void*)(uintptr_t)sessionid, (void*)(uintptr_t)isservicesession) : -1;
#else
    (void)token;
    (void)sessionid;
    (void)isservicesession;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seRegisterLogonSessionTerminatedRoutine(JNIEnv* km_env, jclass km_clazz, jlong callbackroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeRegisterLogonSessionTerminatedRoutine");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackroutine) : -1;
#else
    (void)callbackroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seRegisterLogonSessionTerminatedRoutineEx(JNIEnv* km_env, jclass km_clazz, jlong callbackroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeRegisterLogonSessionTerminatedRoutineEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)callbackroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seReportSecurityEventWithSubCategory(JNIEnv* km_env, jclass km_clazz, jint flags, jlong sourcename, jlong usersid, jlong auditparameters, jint auditsubcategoryid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeReportSecurityEventWithSubCategory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (void*)(uintptr_t)sourcename, (void*)(uintptr_t)usersid, (void*)(uintptr_t)auditparameters, (uint32_t)auditsubcategoryid) : -1;
#else
    (void)flags;
    (void)sourcename;
    (void)usersid;
    (void)auditparameters;
    (void)auditsubcategoryid;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seSetAccessStateGenericMapping(JNIEnv* km_env, jclass km_clazz, jlong accessstate, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetAccessStateGenericMapping");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)accessstate, (void*)(uintptr_t)genericmapping);
#else
    (void)accessstate;
    (void)genericmapping;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seSetSecurityDescriptorInfo(JNIEnv* km_env, jclass km_clazz, jlong object, jlong securityinformation, jlong modificationdescriptor, jlong objectssecuritydescriptor, jint pooltype, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetSecurityDescriptorInfo");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)securityinformation, (void*)(uintptr_t)modificationdescriptor, (void*)(uintptr_t)objectssecuritydescriptor, (int32_t)pooltype, (void*)(uintptr_t)genericmapping) : -1;
#else
    (void)object;
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)pooltype;
    (void)genericmapping;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seSetSecurityDescriptorInfoEx(JNIEnv* km_env, jclass km_clazz, jlong object, jlong securityinformation, jlong modificationdescriptor, jlong objectssecuritydescriptor, jint autoinheritflags, jint pooltype, jlong genericmapping) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeSetSecurityDescriptorInfoEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)object, (void*)(uintptr_t)securityinformation, (void*)(uintptr_t)modificationdescriptor, (void*)(uintptr_t)objectssecuritydescriptor, (uint32_t)autoinheritflags, (int32_t)pooltype, (void*)(uintptr_t)genericmapping) : -1;
#else
    (void)object;
    (void)securityinformation;
    (void)modificationdescriptor;
    (void)objectssecuritydescriptor;
    (void)autoinheritflags;
    (void)pooltype;
    (void)genericmapping;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seShouldCheckForAccessRightsFromParent(JNIEnv* km_env, jclass km_clazz, jlong objecttype, jlong childdescriptor, jlong accessstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeShouldCheckForAccessRightsFromParent");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objecttype, (void*)(uintptr_t)childdescriptor, (void*)(uintptr_t)accessstate) : false;
#else
    (void)objecttype;
    (void)childdescriptor;
    (void)accessstate;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seTokenFromAccessInformation(JNIEnv* km_env, jclass km_clazz, jlong accessinformation, jlong token, jint length, jlong requiredlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenFromAccessInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)accessinformation, (void*)(uintptr_t)token, (uint32_t)length, (void*)(uintptr_t)requiredlength) : -1;
#else
    (void)accessinformation;
    (void)token;
    (void)length;
    (void)requiredlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seTokenIsAdmin(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenIsAdmin");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token) : false;
#else
    (void)token;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seTokenIsRestricted(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenIsRestricted");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token) : false;
#else
    (void)token;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seTokenIsWriteRestricted(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenIsWriteRestricted");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token) : false;
#else
    (void)token;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seTokenType(JNIEnv* km_env, jclass km_clazz, jlong token) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeTokenType");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)token) : -1;
#else
    (void)token;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seUnregisterLogonSessionTerminatedRoutine(JNIEnv* km_env, jclass km_clazz, jlong callbackroutine) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeUnregisterLogonSessionTerminatedRoutine");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackroutine) : -1;
#else
    (void)callbackroutine;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1seUnregisterLogonSessionTerminatedRoutineEx(JNIEnv* km_env, jclass km_clazz, jlong callbackroutine, jlong context) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntoskrnl.exe");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SeUnregisterLogonSessionTerminatedRoutineEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)callbackroutine, (void*)(uintptr_t)context) : -1;
#else
    (void)callbackroutine;
    (void)context;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1secLookupAccountName(JNIEnv* km_env, jclass km_clazz, jlong name, jlong sidsize, jlong sid, jlong nameuse, jlong domainsize, jlong referenceddomain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecLookupAccountName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)name, (void*)(uintptr_t)sidsize, (void*)(uintptr_t)sid, (void*)(uintptr_t)nameuse, (void*)(uintptr_t)domainsize, (void*)(uintptr_t)referenceddomain) : -1;
#else
    (void)name;
    (void)sidsize;
    (void)sid;
    (void)nameuse;
    (void)domainsize;
    (void)referenceddomain;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1secLookupAccountSid(JNIEnv* km_env, jclass km_clazz, jlong sid, jlong namesize, jlong namebuffer, jlong domainsize, jlong domainbuffer, jlong nameuse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecLookupAccountSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sid, (void*)(uintptr_t)namesize, (void*)(uintptr_t)namebuffer, (void*)(uintptr_t)domainsize, (void*)(uintptr_t)domainbuffer, (void*)(uintptr_t)nameuse) : -1;
#else
    (void)sid;
    (void)namesize;
    (void)namebuffer;
    (void)domainsize;
    (void)domainbuffer;
    (void)nameuse;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1secLookupWellKnownSid(JNIEnv* km_env, jclass km_clazz, jint sidtype, jlong sid, jint sidbuffersize, jlong sidsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecLookupWellKnownSid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int32_t)sidtype, (void*)(uintptr_t)sid, (uint32_t)sidbuffersize, (void*)(uintptr_t)sidsize) : -1;
#else
    (void)sidtype;
    (void)sid;
    (void)sidbuffersize;
    (void)sidsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1secMakeSPN(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong instancename, jshort instanceport, jlong referrer, jlong spn, jlong length, jboolean allocate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecMakeSPN");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)instancename, (uint16_t)instanceport, (void*)(uintptr_t)referrer, (void*)(uintptr_t)spn, (void*)(uintptr_t)length, (bool)allocate) : -1;
#else
    (void)serviceclass;
    (void)servicename;
    (void)instancename;
    (void)instanceport;
    (void)referrer;
    (void)spn;
    (void)length;
    (void)allocate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1secMakeSPNEx(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong instancename, jshort instanceport, jlong referrer, jlong targetinfo, jlong spn, jlong length, jboolean allocate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecMakeSPNEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)instancename, (uint16_t)instanceport, (void*)(uintptr_t)referrer, (void*)(uintptr_t)targetinfo, (void*)(uintptr_t)spn, (void*)(uintptr_t)length, (bool)allocate) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1secMakeSPNEx2(JNIEnv* km_env, jclass km_clazz, jlong serviceclass, jlong servicename, jlong instancename, jshort instanceport, jlong referrer, jlong intargetinfo, jlong spn, jlong totalsize, jboolean allocate, jboolean istargetinfomarshaled) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint16_t, void*, void*, void*, void*, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SecMakeSPNEx2");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)serviceclass, (void*)(uintptr_t)servicename, (void*)(uintptr_t)instancename, (uint16_t)instanceport, (void*)(uintptr_t)referrer, (void*)(uintptr_t)intargetinfo, (void*)(uintptr_t)spn, (void*)(uintptr_t)totalsize, (bool)allocate, (bool)istargetinfomarshaled) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1setContextAttributesW(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jint ulattribute, jlong pbuffer, jint cbbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetContextAttributesW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (uint32_t)ulattribute, (void*)(uintptr_t)pbuffer, (uint32_t)cbbuffer) : -1;
#else
    (void)phcontext;
    (void)ulattribute;
    (void)pbuffer;
    (void)cbbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiAcceptSecurityContextAsync(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcredential, jlong phcontext, jlong pinput, jint fcontextreq, jint targetdatarep, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiAcceptSecurityContextAsync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)pinput, (uint32_t)fcontextreq, (uint32_t)targetdatarep, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiCreateAsyncContext(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiCreateAsyncContext");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : NULL;
#else
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiDeleteSecurityContextAsync(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcontext) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiDeleteSecurityContextAsync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcontext) : -1;
#else
    (void)asynccontext;
    (void)phcontext;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiFreeAsyncContext(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiFreeAsyncContext");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)handle);
#else
    (void)handle;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiFreeCredentialsHandleAsync(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcredential) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiFreeCredentialsHandleAsync");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcredential) : -1;
#else
    (void)asynccontext;
    (void)phcredential;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiGetAsyncCallStatus(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiGetAsyncCallStatus");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiInitializeSecurityContextAsyncA(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiInitializeSecurityContextAsyncA");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiInitializeSecurityContextAsyncW(JNIEnv* km_env, jclass km_clazz, jlong asynccontext, jlong phcredential, jlong phcontext, jlong psztargetname, jint fcontextreq, jint reserved1, jint targetdatarep, jlong pinput, jint reserved2, jlong phnewcontext, jlong poutput, jlong pfcontextattr, jlong ptsexpiry) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t, void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiInitializeSecurityContextAsyncW");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)asynccontext, (void*)(uintptr_t)phcredential, (void*)(uintptr_t)phcontext, (void*)(uintptr_t)psztargetname, (uint32_t)fcontextreq, (uint32_t)reserved1, (uint32_t)targetdatarep, (void*)(uintptr_t)pinput, (uint32_t)reserved2, (void*)(uintptr_t)phnewcontext, (void*)(uintptr_t)poutput, (void*)(uintptr_t)pfcontextattr, (void*)(uintptr_t)ptsexpiry) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiReinitAsyncContext(JNIEnv* km_env, jclass km_clazz, jlong handle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiReinitAsyncContext");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle) : -1;
#else
    (void)handle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1sspiSetAsyncNotifyCallback(JNIEnv* km_env, jclass km_clazz, jlong context, jlong callback, jlong callbackdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ksecdd.sys");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SspiSetAsyncNotifyCallback");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)context, (void*)(uintptr_t)callback, (void*)(uintptr_t)callbackdata) : -1;
#else
    (void)context;
    (void)callback;
    (void)callbackdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1verifySignature(JNIEnv* km_env, jclass km_clazz, jlong phcontext, jlong pmessage, jint messageseqno, jlong pfqop) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("secur32.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifySignature");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)phcontext, (void*)(uintptr_t)pmessage, (uint32_t)messageseqno, (void*)(uintptr_t)pfqop) : -1;
#else
    (void)phcontext;
    (void)pmessage;
    (void)messageseqno;
    (void)pfqop;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwAccessCheckAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jint desiredaccess, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckAndAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (uint32_t)desiredaccess, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwAccessCheckByTypeAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckByTypeAndAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwAccessCheckByTypeResultListAndAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckByTypeResultListAndAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwAccessCheckByTypeResultListAndAuditAlarmByHandle(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong principalselfsid, jint desiredaccess, jint audittype, jint flags, jlong objecttypelist, jint objecttypelistlength, jlong genericmapping, jboolean objectcreation, jlong grantedaccess, jlong accessstatus, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*, uint32_t, void*, bool, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAccessCheckByTypeResultListAndAuditAlarmByHandle");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)principalselfsid, (uint32_t)desiredaccess, (int32_t)audittype, (uint32_t)flags, (void*)(uintptr_t)objecttypelist, (uint32_t)objecttypelistlength, (void*)(uintptr_t)genericmapping, (bool)objectcreation, (void*)(uintptr_t)grantedaccess, (void*)(uintptr_t)accessstatus, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwAdjustGroupsToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jboolean resettodefault, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAdjustGroupsToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (bool)resettodefault, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)tokenhandle;
    (void)resettodefault;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwAdjustPrivilegesToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jboolean disableallprivileges, jlong newstate, jint bufferlength, jlong previousstate, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, bool, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAdjustPrivilegesToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (bool)disableallprivileges, (void*)(uintptr_t)newstate, (uint32_t)bufferlength, (void*)(uintptr_t)previousstate, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)tokenhandle;
    (void)disableallprivileges;
    (void)newstate;
    (void)bufferlength;
    (void)previousstate;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwAllocateVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong zerobits, jlong regionsize, jint allocationtype, jint protect) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAllocateVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (uint64_t)zerobits, (void*)(uintptr_t)regionsize, (uint32_t)allocationtype, (uint32_t)protect) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)zerobits;
    (void)regionsize;
    (void)allocationtype;
    (void)protect;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwAllocateVirtualMemoryEx(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jint allocationtype, jint pageprotection, jlong extendedparameters, jint extendedparametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwAllocateVirtualMemoryEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (uint32_t)allocationtype, (uint32_t)pageprotection, (void*)(uintptr_t)extendedparameters, (uint32_t)extendedparametercount) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)allocationtype;
    (void)pageprotection;
    (void)extendedparameters;
    (void)extendedparametercount;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwCancelIoFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iorequesttocancel, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCancelIoFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iorequesttocancel, (void*)(uintptr_t)iostatusblock) : -1;
#else
    (void)filehandle;
    (void)iorequesttocancel;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwCloseObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jboolean generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCloseObjectAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (bool)generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwCreateDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateDirectoryObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)directoryhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwCreateEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jint desiredaccess, jlong objectattributes, jint eventtype, jboolean initialstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, int32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eventhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (int32_t)eventtype, (bool)initialstate) : -1;
#else
    (void)eventhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)eventtype;
    (void)initialstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwCreateSectionEx(JNIEnv* km_env, jclass km_clazz, jlong sectionhandle, jint desiredaccess, jlong objectattributes, jlong maximumsize, jint sectionpageprotection, jint allocationattributes, jlong filehandle, jlong extendedparameters, jint extendedparametercount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, uint32_t, uint32_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwCreateSectionEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sectionhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (void*)(uintptr_t)maximumsize, (uint32_t)sectionpageprotection, (uint32_t)allocationattributes, (void*)(uintptr_t)filehandle, (void*)(uintptr_t)extendedparameters, (uint32_t)extendedparametercount) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwDeleteFile(JNIEnv* km_env, jclass km_clazz, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectattributes) : -1;
#else
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwDeleteObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jboolean generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDeleteObjectAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (bool)generateonclose) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)generateonclose;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwDuplicateObject(JNIEnv* km_env, jclass km_clazz, jlong sourceprocesshandle, jlong sourcehandle, jlong targetprocesshandle, jlong targethandle, jint desiredaccess, jint handleattributes, jint options) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDuplicateObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourceprocesshandle, (void*)(uintptr_t)sourcehandle, (void*)(uintptr_t)targetprocesshandle, (void*)(uintptr_t)targethandle, (uint32_t)desiredaccess, (uint32_t)handleattributes, (uint32_t)options) : -1;
#else
    (void)sourceprocesshandle;
    (void)sourcehandle;
    (void)targetprocesshandle;
    (void)targethandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)options;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwDuplicateToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint desiredaccess, jlong objectattributes, jboolean effectiveonly, jint tokentype, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, bool, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwDuplicateToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes, (bool)effectiveonly, (int32_t)tokentype, (void*)(uintptr_t)newtokenhandle) : -1;
#else
    (void)existingtokenhandle;
    (void)desiredaccess;
    (void)objectattributes;
    (void)effectiveonly;
    (void)tokentype;
    (void)newtokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwFilterToken(JNIEnv* km_env, jclass km_clazz, jlong existingtokenhandle, jint flags, jlong sidstodisable, jlong privilegestodelete, jlong restrictedsids, jlong newtokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFilterToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)existingtokenhandle, (uint32_t)flags, (void*)(uintptr_t)sidstodisable, (void*)(uintptr_t)privilegestodelete, (void*)(uintptr_t)restrictedsids, (void*)(uintptr_t)newtokenhandle) : -1;
#else
    (void)existingtokenhandle;
    (void)flags;
    (void)sidstodisable;
    (void)privilegestodelete;
    (void)restrictedsids;
    (void)newtokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwFlushBuffersFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushBuffersFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwFlushBuffersFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jint flags, jlong parameters, jint parameterssize, jlong iostatusblock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushBuffersFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (uint32_t)flags, (void*)(uintptr_t)parameters, (uint32_t)parameterssize, (void*)(uintptr_t)iostatusblock) : -1;
#else
    (void)filehandle;
    (void)flags;
    (void)parameters;
    (void)parameterssize;
    (void)iostatusblock;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwFlushVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jlong iostatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFlushVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (void*)(uintptr_t)iostatus) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)iostatus;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwFreeVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jlong regionsize, jint freetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFreeVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (void*)(uintptr_t)regionsize, (uint32_t)freetype) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)regionsize;
    (void)freetype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwFsControlFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint fscontrolcode, jlong inputbuffer, jint inputbufferlength, jlong outputbuffer, jint outputbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwFsControlFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)fscontrolcode, (void*)(uintptr_t)inputbuffer, (uint32_t)inputbufferlength, (void*)(uintptr_t)outputbuffer, (uint32_t)outputbufferlength) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwImpersonateAnonymousToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwImpersonateAnonymousToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle) : -1;
#else
    (void)threadhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwLockFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong byteoffset, jlong length, jint key, jboolean failimmediately, jboolean exclusivelock) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, uint32_t, bool, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwLockFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)length, (uint32_t)key, (bool)failimmediately, (bool)exclusivelock) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwNotifyChangeKey(JNIEnv* km_env, jclass km_clazz, jlong keyhandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jint completionfilter, jboolean watchtree, jlong buffer, jint buffersize, jboolean asynchronous) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, bool, void*, uint32_t, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwNotifyChangeKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)keyhandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (uint32_t)completionfilter, (bool)watchtree, (void*)(uintptr_t)buffer, (uint32_t)buffersize, (bool)asynchronous) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwOpenDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jint desiredaccess, jlong objectattributes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenDirectoryObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)directoryhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)objectattributes) : -1;
#else
    (void)directoryhandle;
    (void)desiredaccess;
    (void)objectattributes;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwOpenObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong objecttypename, jlong objectname, jlong securitydescriptor, jlong clienttoken, jint desiredaccess, jint grantedaccess, jlong privileges, jboolean objectcreation, jboolean accessgranted, jlong generateonclose) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, uint32_t, void*, bool, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenObjectAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)objecttypename, (void*)(uintptr_t)objectname, (void*)(uintptr_t)securitydescriptor, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (uint32_t)grantedaccess, (void*)(uintptr_t)privileges, (bool)objectcreation, (bool)accessgranted, (void*)(uintptr_t)generateonclose) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwOpenProcessToken(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenProcessToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)desiredaccess, (void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwOpenProcessTokenEx(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint desiredaccess, jint handleattributes, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenProcessTokenEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)desiredaccess, (uint32_t)handleattributes, (void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)processhandle;
    (void)desiredaccess;
    (void)handleattributes;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwOpenThreadToken(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint desiredaccess, jboolean openasself, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenThreadToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)desiredaccess, (bool)openasself, (void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwOpenThreadTokenEx(JNIEnv* km_env, jclass km_clazz, jlong threadhandle, jint desiredaccess, jboolean openasself, jint handleattributes, jlong tokenhandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, bool, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwOpenThreadTokenEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)threadhandle, (uint32_t)desiredaccess, (bool)openasself, (uint32_t)handleattributes, (void*)(uintptr_t)tokenhandle) : -1;
#else
    (void)threadhandle;
    (void)desiredaccess;
    (void)openasself;
    (void)handleattributes;
    (void)tokenhandle;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwPrivilegeCheck(JNIEnv* km_env, jclass km_clazz, jlong clienttoken, jlong requiredprivileges, jlong result) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrivilegeCheck");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clienttoken, (void*)(uintptr_t)requiredprivileges, (void*)(uintptr_t)result) : -1;
#else
    (void)clienttoken;
    (void)requiredprivileges;
    (void)result;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwPrivilegeObjectAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong handleid, jlong clienttoken, jint desiredaccess, jlong privileges, jboolean accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrivilegeObjectAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)handleid, (void*)(uintptr_t)clienttoken, (uint32_t)desiredaccess, (void*)(uintptr_t)privileges, (bool)accessgranted) : -1;
#else
    (void)subsystemname;
    (void)handleid;
    (void)clienttoken;
    (void)desiredaccess;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwPrivilegedServiceAuditAlarm(JNIEnv* km_env, jclass km_clazz, jlong subsystemname, jlong servicename, jlong clienttoken, jlong privileges, jboolean accessgranted) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwPrivilegedServiceAuditAlarm");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)subsystemname, (void*)(uintptr_t)servicename, (void*)(uintptr_t)clienttoken, (void*)(uintptr_t)privileges, (bool)accessgranted) : -1;
#else
    (void)subsystemname;
    (void)servicename;
    (void)clienttoken;
    (void)privileges;
    (void)accessgranted;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryDirectoryFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jboolean returnsingleentry, jlong filename, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, bool, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryDirectoryFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (bool)returnsingleentry, (void*)(uintptr_t)filename, (bool)restartscan) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryDirectoryFileEx(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong event, jlong apcroutine, jlong apccontext, jlong iostatusblock, jlong fileinformation, jint length, jint fileinformationclass, jint queryflags, jlong filename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, uint32_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryDirectoryFileEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)event, (void*)(uintptr_t)apcroutine, (void*)(uintptr_t)apccontext, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fileinformation, (uint32_t)length, (int32_t)fileinformationclass, (uint32_t)queryflags, (void*)(uintptr_t)filename) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryDirectoryObject(JNIEnv* km_env, jclass km_clazz, jlong directoryhandle, jlong buffer, jint length, jboolean returnsingleentry, jboolean restartscan, jlong context, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, bool, bool, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryDirectoryObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)directoryhandle, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (bool)restartscan, (void*)(uintptr_t)context, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)directoryhandle;
    (void)buffer;
    (void)length;
    (void)returnsingleentry;
    (void)restartscan;
    (void)context;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryEaFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong ealist, jint ealistlength, jlong eaindex, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryEaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)ealist, (uint32_t)ealistlength, (void*)(uintptr_t)eaindex, (bool)restartscan) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryFullAttributesFile(JNIEnv* km_env, jclass km_clazz, jlong objectattributes, jlong fileinformation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryFullAttributesFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)objectattributes, (void*)(uintptr_t)fileinformation) : -1;
#else
    (void)objectattributes;
    (void)fileinformation;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryInformationToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryInformationToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint objectinformationclass, jlong objectinformation, jint objectinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (int32_t)objectinformationclass, (void*)(uintptr_t)objectinformation, (uint32_t)objectinformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)handle;
    (void)objectinformationclass;
    (void)objectinformation;
    (void)objectinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length, jboolean returnsingleentry, jlong sidlist, jint sidlistlength, jlong startsid, jboolean restartscan) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, bool, void*, uint32_t, void*, bool);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryQuotaInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length, (bool)returnsingleentry, (void*)(uintptr_t)sidlist, (uint32_t)sidlistlength, (void*)(uintptr_t)startsid, (bool)restartscan) : -1;
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
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQuerySecurityObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor, jint length, jlong lengthneeded) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQuerySecurityObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor, (uint32_t)length, (void*)(uintptr_t)lengthneeded) : -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    (void)length;
    (void)lengthneeded;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong baseaddress, jint memoryinformationclass, jlong memoryinformation, jlong memoryinformationlength, jlong returnlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)baseaddress, (int32_t)memoryinformationclass, (void*)(uintptr_t)memoryinformation, (uint64_t)memoryinformationlength, (void*)(uintptr_t)returnlength) : -1;
#else
    (void)processhandle;
    (void)baseaddress;
    (void)memoryinformationclass;
    (void)memoryinformation;
    (void)memoryinformationlength;
    (void)returnlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwQueryVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwQueryVolumeInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwSetEaFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetEaFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwSetEvent(JNIEnv* km_env, jclass km_clazz, jlong eventhandle, jlong previousstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetEvent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)eventhandle, (void*)(uintptr_t)previousstate) : -1;
#else
    (void)eventhandle;
    (void)previousstate;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwSetInformationToken(JNIEnv* km_env, jclass km_clazz, jlong tokenhandle, jint tokeninformationclass, jlong tokeninformation, jint tokeninformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationToken");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)tokenhandle, (int32_t)tokeninformationclass, (void*)(uintptr_t)tokeninformation, (uint32_t)tokeninformationlength) : -1;
#else
    (void)tokenhandle;
    (void)tokeninformationclass;
    (void)tokeninformation;
    (void)tokeninformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwSetInformationVirtualMemory(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint vminformationclass, jlong numberofentries, jlong virtualaddresses, jlong vminformation, jint vminformationlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, uint64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetInformationVirtualMemory");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (int32_t)vminformationclass, (uint64_t)numberofentries, (void*)(uintptr_t)virtualaddresses, (void*)(uintptr_t)vminformation, (uint32_t)vminformationlength) : -1;
#else
    (void)processhandle;
    (void)vminformationclass;
    (void)numberofentries;
    (void)virtualaddresses;
    (void)vminformation;
    (void)vminformationlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwSetQuotaInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong buffer, jint length) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetQuotaInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)buffer, (uint32_t)length) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)buffer;
    (void)length;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwSetSecurityObject(JNIEnv* km_env, jclass km_clazz, jlong handle, jint securityinformation, jlong securitydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetSecurityObject");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)handle, (uint32_t)securityinformation, (void*)(uintptr_t)securitydescriptor) : -1;
#else
    (void)handle;
    (void)securityinformation;
    (void)securitydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwSetVolumeInformationFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong fsinformation, jint length, jint fsinformationclass) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwSetVolumeInformationFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)fsinformation, (uint32_t)length, (int32_t)fsinformationclass) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)fsinformation;
    (void)length;
    (void)fsinformationclass;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_wdk_storage_filesystem_WindowsWdkStorageFilesystemJniBridge_windowssys_1windows_1wdk_1storage_1filesystem_1zwUnlockFile(JNIEnv* km_env, jclass km_clazz, jlong filehandle, jlong iostatusblock, jlong byteoffset, jlong length, jint key) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntdll.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ZwUnlockFile");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)filehandle, (void*)(uintptr_t)iostatusblock, (void*)(uintptr_t)byteoffset, (void*)(uintptr_t)length, (uint32_t)key) : -1;
#else
    (void)filehandle;
    (void)iostatusblock;
    (void)byteoffset;
    (void)length;
    (void)key;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

