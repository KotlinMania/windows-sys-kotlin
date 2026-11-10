#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_hostcomputesystem_wrapper.h"
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

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsAddResourceToOperation(void* operation, int32_t type, void* uri, void* handle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsAddResourceToOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, type, uri, handle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operation;
    (void)type;
    (void)uri;
    (void)handle;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsAttachLayerStorageFilter(void* layerpath, void* layerdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsAttachLayerStorageFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(layerpath, layerdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)layerpath;
    (void)layerdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCancelOperation(void* operation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCancelOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operation;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_system_hostcomputesystem_hcsCloseComputeSystem(void* computesystem) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCloseComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(computesystem);
        return;
    }
    errno = ENOSYS;
#else
    (void)computesystem;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_hostcomputesystem_hcsCloseOperation(void* operation) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCloseOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(operation);
        return;
    }
    errno = ENOSYS;
#else
    (void)operation;
    errno = ENOSYS;
#endif
}

void windowssys_windows_win32_system_hostcomputesystem_hcsCloseProcess(void* process) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCloseProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(process);
        return;
    }
    errno = ENOSYS;
#else
    (void)process;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCrashComputeSystem(void* computesystem, void* operation, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCrashComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, operation, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystem(void* id, void* configuration, void* operation, void* securitydescriptor, void* computesystem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, configuration, operation, securitydescriptor, computesystem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)configuration;
    (void)operation;
    (void)securitydescriptor;
    (void)computesystem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystemInNamespace(void* idnamespace, void* id, void* configuration, void* operation, void* options, void* computesystem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateComputeSystemInNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idnamespace, id, configuration, operation, options, computesystem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idnamespace;
    (void)id;
    (void)configuration;
    (void)operation;
    (void)options;
    (void)computesystem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyGuestStateFile(void* gueststatefilepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateEmptyGuestStateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(gueststatefilepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)gueststatefilepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyRuntimeStateFile(void* runtimestatefilepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateEmptyRuntimeStateFile");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtimestatefilepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)runtimestatefilepath;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperation(void* context, void* callback) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, callback);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)context;
    (void)callback;
    errno = ENOSYS;
    return NULL;
#endif
}

void* windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperationWithNotifications(int32_t eventtypes, void* context, void* callback) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateOperationWithNotifications");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(eventtypes, context, callback);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)eventtypes;
    (void)context;
    (void)callback;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsCreateProcess(void* computesystem, void* processparameters, void* operation, void* securitydescriptor, void* process) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsCreateProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, processparameters, operation, securitydescriptor, process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)processparameters;
    (void)operation;
    (void)securitydescriptor;
    (void)process;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsDestroyLayer(void* layerpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsDestroyLayer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(layerpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)layerpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsDetachLayerStorageFilter(void* layerpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsDetachLayerStorageFilter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(layerpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)layerpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystems(void* query, void* operation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsEnumerateComputeSystems");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(query, operation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)query;
    (void)operation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystemsInNamespace(void* idnamespace, void* query, void* operation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsEnumerateComputeSystemsInNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idnamespace, query, operation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idnamespace;
    (void)query;
    (void)operation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsExportLayer(void* layerpath, void* exportfolderpath, void* layerdata, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsExportLayer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(layerpath, exportfolderpath, layerdata, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)layerpath;
    (void)exportfolderpath;
    (void)layerdata;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsExportLegacyWritableLayer(void* writablelayermountpath, void* writablelayerfolderpath, void* exportfolderpath, void* layerdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsExportLegacyWritableLayer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writablelayermountpath, writablelayerfolderpath, exportfolderpath, layerdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writablelayermountpath;
    (void)writablelayerfolderpath;
    (void)exportfolderpath;
    (void)layerdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsFormatWritableLayerVhd(void* vhdhandle) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsFormatWritableLayerVhd");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vhdhandle);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vhdhandle;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemFromOperation(void* operation) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetComputeSystemFromOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)operation;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemProperties(void* computesystem, void* operation, void* propertyquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetComputeSystemProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, operation, propertyquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)operation;
    (void)propertyquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetLayerVhdMountPath(void* vhdhandle, void* mountpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetLayerVhdMountPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vhdhandle, mountpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vhdhandle;
    (void)mountpath;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationContext(void* operation) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)operation;
    errno = ENOSYS;
    return NULL;
#endif
}

uint64_t windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationId(void* operation) {
#ifdef _WIN32
    typedef uint64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)operation;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResult(void* operation, void* resultdocument) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, resultdocument);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operation;
    (void)resultdocument;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResultAndProcessInfo(void* operation, void* processinformation, void* resultdocument) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationResultAndProcessInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, processinformation, resultdocument);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operation;
    (void)processinformation;
    (void)resultdocument;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationType(void* operation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetOperationType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operation;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessFromOperation(void* operation) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessFromOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)operation;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessInfo(void* process, void* operation) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, operation);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)operation;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessProperties(void* process, void* operation, void* propertyquery) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, operation, propertyquery);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)operation;
    (void)propertyquery;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessorCompatibilityFromSavedState(void* runtimefilename, void* processorfeaturesstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetProcessorCompatibilityFromSavedState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(runtimefilename, processorfeaturesstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)runtimefilename;
    (void)processorfeaturesstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGetServiceProperties(void* propertyquery, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGetServiceProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(propertyquery, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)propertyquery;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmAccess(void* vmid, void* filepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGrantVmAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmid, filepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmid;
    (void)filepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmGroupAccess(void* filepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsGrantVmGroupAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsImportLayer(void* layerpath, void* sourcefolderpath, void* layerdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsImportLayer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(layerpath, sourcefolderpath, layerdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)layerpath;
    (void)sourcefolderpath;
    (void)layerdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsInitializeLegacyWritableLayer(void* writablelayermountpath, void* writablelayerfolderpath, void* layerdata, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsInitializeLegacyWritableLayer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writablelayermountpath, writablelayerfolderpath, layerdata, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writablelayermountpath;
    (void)writablelayerfolderpath;
    (void)layerdata;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsInitializeWritableLayer(void* writablelayerpath, void* layerdata, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsInitializeWritableLayer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(writablelayerpath, layerdata, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)writablelayerpath;
    (void)layerdata;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsModifyComputeSystem(void* computesystem, void* operation, void* configuration, void* identity) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsModifyComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, operation, configuration, identity);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)operation;
    (void)configuration;
    (void)identity;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsModifyProcess(void* process, void* operation, void* settings) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsModifyProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, operation, settings);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)operation;
    (void)settings;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsModifyServiceSettings(void* settings, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsModifyServiceSettings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(settings, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)settings;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystem(void* id, uint32_t requestedaccess, void* computesystem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsOpenComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(id, requestedaccess, computesystem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)id;
    (void)requestedaccess;
    (void)computesystem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystemInNamespace(void* idnamespace, void* id, uint32_t requestedaccess, void* computesystem) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsOpenComputeSystemInNamespace");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(idnamespace, id, requestedaccess, computesystem);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)idnamespace;
    (void)id;
    (void)requestedaccess;
    (void)computesystem;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsOpenProcess(void* computesystem, uint32_t processid, uint32_t requestedaccess, void* process) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsOpenProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, processid, requestedaccess, process);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)processid;
    (void)requestedaccess;
    (void)process;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsPauseComputeSystem(void* computesystem, void* operation, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsPauseComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, operation, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsResumeComputeSystem(void* computesystem, void* operation, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsResumeComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, operation, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmAccess(void* vmid, void* filepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsRevokeVmAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(vmid, filepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)vmid;
    (void)filepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmGroupAccess(void* filepath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsRevokeVmGroupAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(filepath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)filepath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSaveComputeSystem(void* computesystem, void* operation, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSaveComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, operation, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetComputeSystemCallback(void* computesystem, int32_t callbackoptions, void* context, void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetComputeSystemCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, callbackoptions, context, callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)callbackoptions;
    (void)context;
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationCallback(void* operation, void* context, void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetOperationCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, context, callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operation;
    (void)context;
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationContext(void* operation, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetOperationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operation;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetProcessCallback(void* process, int32_t callbackoptions, void* context, void* callback) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetProcessCallback");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, callbackoptions, context, callback);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)callbackoptions;
    (void)context;
    (void)callback;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSLayer(void* layerpath, void* vhdhandle, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetupBaseOSLayer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(layerpath, vhdhandle, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)layerpath;
    (void)vhdhandle;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSVolume(void* layerpath, void* volumepath, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computestorage.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSetupBaseOSVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(layerpath, volumepath, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)layerpath;
    (void)volumepath;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsShutDownComputeSystem(void* computesystem, void* operation, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsShutDownComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, operation, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSignalProcess(void* process, void* operation, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSignalProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, operation, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsStartComputeSystem(void* computesystem, void* operation, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsStartComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, operation, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsSubmitWerReport(void* settings) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsSubmitWerReport");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(settings);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)settings;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsTerminateComputeSystem(void* computesystem, void* operation, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsTerminateComputeSystem");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, operation, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsTerminateProcess(void* process, void* operation, void* options) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsTerminateProcess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(process, operation, options);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)process;
    (void)operation;
    (void)options;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsWaitForComputeSystemExit(void* computesystem, uint32_t timeoutms, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForComputeSystemExit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, timeoutms, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)timeoutms;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResult(void* operation, uint32_t timeoutms, void* resultdocument) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForOperationResult");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, timeoutms, resultdocument);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operation;
    (void)timeoutms;
    (void)resultdocument;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResultAndProcessInfo(void* operation, uint32_t timeoutms, void* processinformation, void* resultdocument) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForOperationResultAndProcessInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(operation, timeoutms, processinformation, resultdocument);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)operation;
    (void)timeoutms;
    (void)processinformation;
    (void)resultdocument;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_hostcomputesystem_hcsWaitForProcessExit(void* computesystem, uint32_t timeoutms, void* result) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("computecore.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "HcsWaitForProcessExit");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(computesystem, timeoutms, result);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)computesystem;
    (void)timeoutms;
    (void)result;
    errno = ENOSYS;
    return -1;
#endif
}

