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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListAllocateBufferAndSerialize(JNIEnv* km_env, jclass km_clazz, jlong sourcecollection, jlong ptargetbuffersizeinbytes, jlong ptargetbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListAllocateBufferAndSerialize");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcecollection, (void*)(uintptr_t)ptargetbuffersizeinbytes, (void*)(uintptr_t)ptargetbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcecollection;
    (void)ptargetbuffersizeinbytes;
    (void)ptargetbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListCopyAndMarshall(JNIEnv* km_env, jclass km_clazz, jlong target, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListCopyAndMarshall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)target, (void*)(uintptr_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)target;
    (void)source;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListDeserializeFromBuffer(JNIEnv* km_env, jclass km_clazz, jint sourcebuffersizeinbytes, jlong sourcebuffer, jlong targetcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListDeserializeFromBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)sourcebuffersizeinbytes, (void*)(uintptr_t)sourcebuffer, (void*)(uintptr_t)targetcollection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcebuffersizeinbytes;
    (void)sourcebuffer;
    (void)targetcollection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListGetFillableCount(JNIEnv* km_env, jclass km_clazz, jint buffersizebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetFillableCount");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)buffersizebytes);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersizebytes;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListGetMarshalledSize(JNIEnv* km_env, jclass km_clazz, jlong collection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetMarshalledSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)collection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)collection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListGetMarshalledSizeWithoutSerialization(JNIEnv* km_env, jclass km_clazz, jlong collection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetMarshalledSizeWithoutSerialization");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)collection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)collection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListGetSerializedSize(JNIEnv* km_env, jclass km_clazz, jlong collection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetSerializedSize");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)collection);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)collection;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListMarshall(JNIEnv* km_env, jclass km_clazz, jlong target) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListMarshall");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)target);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)target;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListSerializeToBuffer(JNIEnv* km_env, jclass km_clazz, jlong sourcecollection, jint targetbuffersizeinbytes, jlong targetbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListSerializeToBuffer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)sourcecollection, (uint32_t)targetbuffersizeinbytes, (void*)(uintptr_t)targetbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sourcecollection;
    (void)targetbuffersizeinbytes;
    (void)targetbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListSortSubscribedActivitiesByConfidence(JNIEnv* km_env, jclass km_clazz, jlong thresholds, jlong pcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListSortSubscribedActivitiesByConfidence");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)thresholds, (void*)(uintptr_t)pcollection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)thresholds;
    (void)pcollection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1collectionsListUpdateMarshalledPointer(JNIEnv* km_env, jclass km_clazz, jlong collection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListUpdateMarshalledPointer");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)collection);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)collection;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1evaluateActivityThresholds(JNIEnv* km_env, jclass km_clazz, jlong newsample, jlong oldsample, jlong thresholds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvaluateActivityThresholds");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)newsample, (void*)(uintptr_t)oldsample, (void*)(uintptr_t)thresholds);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)newsample;
    (void)oldsample;
    (void)thresholds;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1getPerformanceTime(JNIEnv* km_env, jclass km_clazz, jlong timems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerformanceTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)timems);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)timems;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1initPropVariantFromCLSIDArray(JNIEnv* km_env, jclass km_clazz, jlong members, jint size, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromCLSIDArray");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)members, (uint32_t)size, (void*)(uintptr_t)ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)members;
    (void)size;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1initPropVariantFromFloat(JNIEnv* km_env, jclass km_clazz, jfloat fltval, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromFloat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((float)fltval, (void*)(uintptr_t)ppropvar);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)fltval;
    (void)ppropvar;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1isCollectionListSame(JNIEnv* km_env, jclass km_clazz, jlong lista, jlong listb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCollectionListSame");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)lista, (void*)(uintptr_t)listb);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)lista;
    (void)listb;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1isGUIDPresentInList(JNIEnv* km_env, jclass km_clazz, jlong guidarray, jint arraylength, jlong guidelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsGUIDPresentInList");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)guidarray, (uint32_t)arraylength, (void*)(uintptr_t)guidelem);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)guidarray;
    (void)arraylength;
    (void)guidelem;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1isKeyPresentInCollectionList(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsKeyPresentInCollectionList");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)plist;
    (void)pkey;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1isKeyPresentInPropertyList(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsKeyPresentInPropertyList");
    }
    bool km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey);
    } else {
        errno = ENOSYS;
        km_res = false;
    }
#else
    (void)plist;
    (void)pkey;
    errno = ENOSYS;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetBool(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetBool");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetDouble(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetDouble");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetFileTime(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetFileTime");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetFloat(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetFloat");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetGuid(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetGuid");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetInt32(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetInt32");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetInt64(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetInt64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetNthInt64(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jint occurrence, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthInt64");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (uint32_t)occurrence, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetNthUlong(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jint occurrence, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthUlong");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (uint32_t)occurrence, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetNthUshort(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jint occurrence, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthUshort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (uint32_t)occurrence, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetPropVariant(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jboolean typecheck, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetPropVariant");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (bool)typecheck, (void*)(uintptr_t)pvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)typecheck;
    (void)pvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetUlong(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetUlong");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeyGetUshort(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetUshort");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propKeyFindKeySetPropVariant(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jboolean typecheck, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeySetPropVariant");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (bool)typecheck, (void*)(uintptr_t)pvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)plist;
    (void)pkey;
    (void)typecheck;
    (void)pvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propVariantGetInformation(JNIEnv* km_env, jclass km_clazz, jlong propvariantvalue, jlong propvariantoffset, jlong propvariantsize, jlong propvariantpointer, jlong remappedtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetInformation");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)propvariantvalue, (void*)(uintptr_t)propvariantoffset, (void*)(uintptr_t)propvariantsize, (void*)(uintptr_t)propvariantpointer, (void*)(uintptr_t)remappedtype);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)propvariantvalue;
    (void)propvariantoffset;
    (void)propvariantsize;
    (void)propvariantpointer;
    (void)remappedtype;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propertiesListCopy(JNIEnv* km_env, jclass km_clazz, jlong target, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertiesListCopy");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((void*)(uintptr_t)target, (void*)(uintptr_t)source);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)target;
    (void)source;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1propertiesListGetFillableCount(JNIEnv* km_env, jclass km_clazz, jint buffersizebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertiesListGetFillableCount");
    }
    uint32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)buffersizebytes);
    } else {
        errno = ENOSYS;
        km_res = 0;
    }
#else
    (void)buffersizebytes;
    errno = ENOSYS;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1sensorCollectionGetAt(JNIEnv* km_env, jclass km_clazz, jint arg_0_index, jlong psensorslist, jlong pkey, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SensorCollectionGetAt");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)arg_0_index, (void*)(uintptr_t)psensorslist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pvalue);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)arg_0_index;
    (void)psensorslist;
    (void)pkey;
    (void)pvalue;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1serializationBufferAllocate(JNIEnv* km_env, jclass km_clazz, jint sizeinbytes, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SerializationBufferAllocate");
    }
    int32_t km_res;
    if (km_fn_ptr != NULL) {
        km_res = km_fn_ptr((uint32_t)sizeinbytes, (void*)(uintptr_t)pbuffer);
    } else {
        errno = ENOSYS;
        km_res = -1;
    }
#else
    (void)sizeinbytes;
    (void)pbuffer;
    errno = ENOSYS;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1serializationBufferFree(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SerializationBufferFree");
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr((void*)(uintptr_t)buffer);
    } else {
        errno = ENOSYS;
    }
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

