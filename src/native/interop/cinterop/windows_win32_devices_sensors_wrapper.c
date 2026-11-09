#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_devices_sensors_wrapper.h"
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

int32_t windowssys_windows_win32_devices_sensors_CollectionsListAllocateBufferAndSerialize(void* sourcecollection, void* ptargetbuffersizeinbytes, void* ptargetbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListAllocateBufferAndSerialize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcecollection, ptargetbuffersizeinbytes, ptargetbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcecollection;
    (void)ptargetbuffersizeinbytes;
    (void)ptargetbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_CollectionsListCopyAndMarshall(void* target, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListCopyAndMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(target, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)target;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_CollectionsListDeserializeFromBuffer(uint32_t sourcebuffersizeinbytes, void* sourcebuffer, void* targetcollection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListDeserializeFromBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcebuffersizeinbytes, sourcebuffer, targetcollection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcebuffersizeinbytes;
    (void)sourcebuffer;
    (void)targetcollection;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_sensors_CollectionsListGetFillableCount(uint32_t buffersizebytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetFillableCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersizebytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersizebytes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSize(void* collection) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetMarshalledSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(collection);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)collection;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_sensors_CollectionsListGetMarshalledSizeWithoutSerialization(void* collection) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetMarshalledSizeWithoutSerialization");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(collection);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)collection;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_devices_sensors_CollectionsListGetSerializedSize(void* collection) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListGetSerializedSize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(collection);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)collection;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_CollectionsListMarshall(void* target) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListMarshall");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(target);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)target;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_CollectionsListSerializeToBuffer(void* sourcecollection, uint32_t targetbuffersizeinbytes, void* targetbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListSerializeToBuffer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcecollection, targetbuffersizeinbytes, targetbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcecollection;
    (void)targetbuffersizeinbytes;
    (void)targetbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_CollectionsListSortSubscribedActivitiesByConfidence(void* thresholds, void* pcollection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListSortSubscribedActivitiesByConfidence");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(thresholds, pcollection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)thresholds;
    (void)pcollection;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_CollectionsListUpdateMarshalledPointer(void* collection) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CollectionsListUpdateMarshalledPointer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(collection);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)collection;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_devices_sensors_EvaluateActivityThresholds(void* newsample, void* oldsample, void* thresholds) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvaluateActivityThresholds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(newsample, oldsample, thresholds);
    }
    errno = ENOSYS;
    return false;
#else
    (void)newsample;
    (void)oldsample;
    (void)thresholds;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_GetPerformanceTime(void* timems) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPerformanceTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(timems);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)timems;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_InitPropVariantFromCLSIDArray(void* members, uint32_t size, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromCLSIDArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(members, size, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)members;
    (void)size;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_InitPropVariantFromFloat(float fltval, void* ppropvar) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(float, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitPropVariantFromFloat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(fltval, ppropvar);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)fltval;
    (void)ppropvar;
    errno = ENOSYS;
    return -1;
#endif
}

bool windowssys_windows_win32_devices_sensors_IsCollectionListSame(void* lista, void* listb) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsCollectionListSame");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lista, listb);
    }
    errno = ENOSYS;
    return false;
#else
    (void)lista;
    (void)listb;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_sensors_IsGUIDPresentInList(void* guidarray, uint32_t arraylength, void* guidelem) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsGUIDPresentInList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(guidarray, arraylength, guidelem);
    }
    errno = ENOSYS;
    return false;
#else
    (void)guidarray;
    (void)arraylength;
    (void)guidelem;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_sensors_IsKeyPresentInCollectionList(void* plist, void* pkey) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsKeyPresentInCollectionList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plist;
    (void)pkey;
    errno = ENOSYS;
    return false;
#endif
}

bool windowssys_windows_win32_devices_sensors_IsKeyPresentInPropertyList(void* plist, void* pkey) {
#ifdef _WIN32
    typedef bool (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsKeyPresentInPropertyList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey);
    }
    errno = ENOSYS;
    return false;
#else
    (void)plist;
    (void)pkey;
    errno = ENOSYS;
    return false;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetBool(void* plist, void* pkey, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetBool");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetDouble(void* plist, void* pkey, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetDouble");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFileTime(void* plist, void* pkey, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetFileTime");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetFloat(void* plist, void* pkey, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetFloat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetGuid(void* plist, void* pkey, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetGuid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt32(void* plist, void* pkey, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetInt32");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetInt64(void* plist, void* pkey, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthInt64(void* plist, void* pkey, uint32_t occurrence, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthInt64");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, occurrence, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUlong(void* plist, void* pkey, uint32_t occurrence, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthUlong");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, occurrence, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetNthUshort(void* plist, void* pkey, uint32_t occurrence, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetNthUshort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, occurrence, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)occurrence;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetPropVariant(void* plist, void* pkey, bool typecheck, void* pvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetPropVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, typecheck, pvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)typecheck;
    (void)pvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUlong(void* plist, void* pkey, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetUlong");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeyGetUshort(void* plist, void* pkey, void* pretvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeyGetUshort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, pretvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)pretvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropKeyFindKeySetPropVariant(void* plist, void* pkey, bool typecheck, void* pvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, bool, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropKeyFindKeySetPropVariant");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(plist, pkey, typecheck, pvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)plist;
    (void)pkey;
    (void)typecheck;
    (void)pvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropVariantGetInformation(void* propvariantvalue, void* propvariantoffset, void* propvariantsize, void* propvariantpointer, void* remappedtype) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropVariantGetInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propvariantvalue, propvariantoffset, propvariantsize, propvariantpointer, remappedtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propvariantvalue;
    (void)propvariantoffset;
    (void)propvariantsize;
    (void)propvariantpointer;
    (void)remappedtype;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_PropertiesListCopy(void* target, void* source) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertiesListCopy");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(target, source);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)target;
    (void)source;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_devices_sensors_PropertiesListGetFillableCount(uint32_t buffersizebytes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PropertiesListGetFillableCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(buffersizebytes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)buffersizebytes;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_SensorCollectionGetAt(uint32_t arg_0_index, void* psensorslist, void* pkey, void* pvalue) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SensorCollectionGetAt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(arg_0_index, psensorslist, pkey, pvalue);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)arg_0_index;
    (void)psensorslist;
    (void)pkey;
    (void)pvalue;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_devices_sensors_SerializationBufferAllocate(uint32_t sizeinbytes, void* pbuffer) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SerializationBufferAllocate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sizeinbytes, pbuffer);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sizeinbytes;
    (void)pbuffer;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_devices_sensors_SerializationBufferFree(void* buffer) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("sensorsutilsv2.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SerializationBufferFree");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(buffer);
        return;
    }
    errno = ENOSYS;
#else
    (void)buffer;
    errno = ENOSYS;
#endif
}

