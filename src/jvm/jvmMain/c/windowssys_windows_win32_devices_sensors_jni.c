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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListAllocateBufferAndSerialize(JNIEnv* km_env, jclass km_clazz, jlong sourcecollection, jlong ptargetbuffersizeinbytes, jlong ptargetbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListAllocateBufferAndSerialize");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcecollection, (void*)(uintptr_t)ptargetbuffersizeinbytes, (void*)(uintptr_t)ptargetbuffer) : -1;
#else
    (void)sourcecollection;
    (void)ptargetbuffersizeinbytes;
    (void)ptargetbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListCopyAndMarshall(JNIEnv* km_env, jclass km_clazz, jlong target, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListCopyAndMarshall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)target, (void*)(uintptr_t)source) : -1;
#else
    (void)target;
    (void)source;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListDeserializeFromBuffer(JNIEnv* km_env, jclass km_clazz, jint sourcebuffersizeinbytes, jlong sourcebuffer, jlong targetcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListDeserializeFromBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sourcebuffersizeinbytes, (void*)(uintptr_t)sourcebuffer, (void*)(uintptr_t)targetcollection) : -1;
#else
    (void)sourcebuffersizeinbytes;
    (void)sourcebuffer;
    (void)targetcollection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListGetFillableCount(JNIEnv* km_env, jclass km_clazz, jint buffersizebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetFillableCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)buffersizebytes) : 0;
#else
    (void)buffersizebytes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListGetMarshalledSize(JNIEnv* km_env, jclass km_clazz, jlong collection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetMarshalledSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)collection) : 0;
#else
    (void)collection;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListGetMarshalledSizeWithoutSerialization(JNIEnv* km_env, jclass km_clazz, jlong collection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetMarshalledSizeWithoutSerialization");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)collection) : 0;
#else
    (void)collection;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListGetSerializedSize(JNIEnv* km_env, jclass km_clazz, jlong collection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetSerializedSize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)collection) : 0;
#else
    (void)collection;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListMarshall(JNIEnv* km_env, jclass km_clazz, jlong target) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListMarshall");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)target) : -1;
#else
    (void)target;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListSerializeToBuffer(JNIEnv* km_env, jclass km_clazz, jlong sourcecollection, jint targetbuffersizeinbytes, jlong targetbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListSerializeToBuffer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)sourcecollection, (uint32_t)targetbuffersizeinbytes, (void*)(uintptr_t)targetbuffer) : -1;
#else
    (void)sourcecollection;
    (void)targetbuffersizeinbytes;
    (void)targetbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListSortSubscribedActivitiesByConfidence(JNIEnv* km_env, jclass km_clazz, jlong thresholds, jlong pcollection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListSortSubscribedActivitiesByConfidence");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)thresholds, (void*)(uintptr_t)pcollection) : -1;
#else
    (void)thresholds;
    (void)pcollection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1CollectionsListUpdateMarshalledPointer(JNIEnv* km_env, jclass km_clazz, jlong collection) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListUpdateMarshalledPointer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)collection) : -1;
#else
    (void)collection;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1EvaluateActivityThresholds(JNIEnv* km_env, jclass km_clazz, jlong newsample, jlong oldsample, jlong thresholds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvaluateActivityThresholds");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)newsample, (void*)(uintptr_t)oldsample, (void*)(uintptr_t)thresholds) : false;
#else
    (void)newsample;
    (void)oldsample;
    (void)thresholds;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1GetPerformanceTime(JNIEnv* km_env, jclass km_clazz, jlong timems) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerformanceTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)timems) : -1;
#else
    (void)timems;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1InitPropVariantFromCLSIDArray(JNIEnv* km_env, jclass km_clazz, jlong members, jint size, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromCLSIDArray");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)members, (uint32_t)size, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)members;
    (void)size;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1InitPropVariantFromFloat(JNIEnv* km_env, jclass km_clazz, jfloat fltval, jlong ppropvar) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromFloat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((float)fltval, (void*)(uintptr_t)ppropvar) : -1;
#else
    (void)fltval;
    (void)ppropvar;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1IsCollectionListSame(JNIEnv* km_env, jclass km_clazz, jlong lista, jlong listb) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCollectionListSame");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lista, (void*)(uintptr_t)listb) : false;
#else
    (void)lista;
    (void)listb;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1IsGUIDPresentInList(JNIEnv* km_env, jclass km_clazz, jlong guidarray, jint arraylength, jlong guidelem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsGUIDPresentInList");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)guidarray, (uint32_t)arraylength, (void*)(uintptr_t)guidelem) : false;
#else
    (void)guidarray;
    (void)arraylength;
    (void)guidelem;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1IsKeyPresentInCollectionList(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsKeyPresentInCollectionList");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey) : false;
#else
    (void)plist;
    (void)pkey;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jboolean JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1IsKeyPresentInPropertyList(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsKeyPresentInPropertyList");
    }
    bool km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey) : false;
#else
    (void)plist;
    (void)pkey;
    bool km_res = false;
#endif
    return (jboolean)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetBool(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetBool");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetDouble(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetDouble");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetFileTime(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetFileTime");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetFloat(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetFloat");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetGuid(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetGuid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetInt32(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetInt32");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetInt64(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetInt64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetNthInt64(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jint occurrence, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthInt64");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (uint32_t)occurrence, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetNthUlong(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jint occurrence, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthUlong");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (uint32_t)occurrence, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetNthUshort(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jint occurrence, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthUshort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (uint32_t)occurrence, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetPropVariant(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jboolean typecheck, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetPropVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (bool)typecheck, (void*)(uintptr_t)pvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)typecheck;
    (void)pvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetUlong(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetUlong");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeyGetUshort(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jlong pretvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetUshort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pretvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropKeyFindKeySetPropVariant(JNIEnv* km_env, jclass km_clazz, jlong plist, jlong pkey, jboolean typecheck, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeySetPropVariant");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)plist, (void*)(uintptr_t)pkey, (bool)typecheck, (void*)(uintptr_t)pvalue) : -1;
#else
    (void)plist;
    (void)pkey;
    (void)typecheck;
    (void)pvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropVariantGetInformation(JNIEnv* km_env, jclass km_clazz, jlong propvariantvalue, jlong propvariantoffset, jlong propvariantsize, jlong propvariantpointer, jlong remappedtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetInformation");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)propvariantvalue, (void*)(uintptr_t)propvariantoffset, (void*)(uintptr_t)propvariantsize, (void*)(uintptr_t)propvariantpointer, (void*)(uintptr_t)remappedtype) : -1;
#else
    (void)propvariantvalue;
    (void)propvariantoffset;
    (void)propvariantsize;
    (void)propvariantpointer;
    (void)remappedtype;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropertiesListCopy(JNIEnv* km_env, jclass km_clazz, jlong target, jlong source) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertiesListCopy");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)target, (void*)(uintptr_t)source) : -1;
#else
    (void)target;
    (void)source;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1PropertiesListGetFillableCount(JNIEnv* km_env, jclass km_clazz, jint buffersizebytes) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertiesListGetFillableCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)buffersizebytes) : 0;
#else
    (void)buffersizebytes;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1SensorCollectionGetAt(JNIEnv* km_env, jclass km_clazz, jint arg_0_index, jlong psensorslist, jlong pkey, jlong pvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SensorCollectionGetAt");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)arg_0_index, (void*)(uintptr_t)psensorslist, (void*)(uintptr_t)pkey, (void*)(uintptr_t)pvalue) : -1;
#else
    (void)arg_0_index;
    (void)psensorslist;
    (void)pkey;
    (void)pvalue;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1SerializationBufferAllocate(JNIEnv* km_env, jclass km_clazz, jint sizeinbytes, jlong pbuffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SerializationBufferAllocate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)sizeinbytes, (void*)(uintptr_t)pbuffer) : -1;
#else
    (void)sizeinbytes;
    (void)pbuffer;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_devices_sensors_WindowsWin32DevicesSensorsJniBridge_windowssys_1windows_1win32_1devices_1sensors_1SerializationBufferFree(JNIEnv* km_env, jclass km_clazz, jlong buffer) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SerializationBufferFree");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)buffer);
#else
    (void)buffer;
#endif
}

