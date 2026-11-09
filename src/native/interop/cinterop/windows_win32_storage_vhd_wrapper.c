#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_vhd_wrapper.h"
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

uint32_t windowssys_windows_win32_storage_vhd_AddVirtualDiskParent(void* virtualdiskhandle, void* parentpath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddVirtualDiskParent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, parentpath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)parentpath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_ApplySnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplySnapshotVhdSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, parameters, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_AttachVirtualDisk(void* virtualdiskhandle, void* securitydescriptor, int32_t flags, uint32_t providerspecificflags, void* parameters, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AttachVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, securitydescriptor, flags, providerspecificflags, parameters, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)securitydescriptor;
    (void)flags;
    (void)providerspecificflags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_BreakMirrorVirtualDisk(void* virtualdiskhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BreakMirrorVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_CompactVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompactVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_CompleteForkVirtualDisk(void* virtualdiskhandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CompleteForkVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_CreateVirtualDisk(void* virtualstoragetype, void* path, int32_t virtualdiskaccessmask, void* securitydescriptor, int32_t flags, uint32_t providerspecificflags, void* parameters, void* overlapped, void* handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, int32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualstoragetype, path, virtualdiskaccessmask, securitydescriptor, flags, providerspecificflags, parameters, overlapped, handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualstoragetype;
    (void)path;
    (void)virtualdiskaccessmask;
    (void)securitydescriptor;
    (void)flags;
    (void)providerspecificflags;
    (void)parameters;
    (void)overlapped;
    (void)handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_DeleteSnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteSnapshotVhdSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, parameters, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_DeleteVirtualDiskMetadata(void* virtualdiskhandle, void* item) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteVirtualDiskMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, item);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)item;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_DetachVirtualDisk(void* virtualdiskhandle, int32_t flags, uint32_t providerspecificflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetachVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, flags, providerspecificflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)providerspecificflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_EnumerateVirtualDiskMetadata(void* virtualdiskhandle, void* numberofitems, void* items) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EnumerateVirtualDiskMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, numberofitems, items);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)numberofitems;
    (void)items;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_ExpandVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ExpandVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_ForkVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ForkVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_GetAllAttachedVirtualDiskPhysicalPaths(void* pathsbuffersizeinbytes, void* pathsbuffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetAllAttachedVirtualDiskPhysicalPaths");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pathsbuffersizeinbytes, pathsbuffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pathsbuffersizeinbytes;
    (void)pathsbuffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_GetStorageDependencyInformation(void* objecthandle, int32_t flags, uint32_t storagedependencyinfosize, void* storagedependencyinfo, void* sizeused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStorageDependencyInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(objecthandle, flags, storagedependencyinfosize, storagedependencyinfo, sizeused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)objecthandle;
    (void)flags;
    (void)storagedependencyinfosize;
    (void)storagedependencyinfo;
    (void)sizeused;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_GetVirtualDiskInformation(void* virtualdiskhandle, void* virtualdiskinfosize, void* virtualdiskinfo, void* sizeused) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVirtualDiskInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, virtualdiskinfosize, virtualdiskinfo, sizeused);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)virtualdiskinfosize;
    (void)virtualdiskinfo;
    (void)sizeused;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_GetVirtualDiskMetadata(void* virtualdiskhandle, void* item, void* metadatasize, void* metadata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVirtualDiskMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, item, metadatasize, metadata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)item;
    (void)metadatasize;
    (void)metadata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_GetVirtualDiskOperationProgress(void* virtualdiskhandle, void* overlapped, void* progress) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVirtualDiskOperationProgress");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, overlapped, progress);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)overlapped;
    (void)progress;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_GetVirtualDiskPhysicalPath(void* virtualdiskhandle, void* diskpathsizeinbytes, void* diskpath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetVirtualDiskPhysicalPath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, diskpathsizeinbytes, diskpath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)diskpathsizeinbytes;
    (void)diskpath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_MergeVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MergeVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_MirrorVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MirrorVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_ModifyVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ModifyVhdSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, parameters, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_OpenVirtualDisk(void* virtualstoragetype, void* path, int32_t virtualdiskaccessmask, int32_t flags, void* parameters, void* handle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualstoragetype, path, virtualdiskaccessmask, flags, parameters, handle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualstoragetype;
    (void)path;
    (void)virtualdiskaccessmask;
    (void)flags;
    (void)parameters;
    (void)handle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_QueryChangesVirtualDisk(void* virtualdiskhandle, void* changetrackingid, uint64_t byteoffset, uint64_t bytelength, int32_t flags, void* ranges, void* rangecount, void* processedlength) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, uint64_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryChangesVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, changetrackingid, byteoffset, bytelength, flags, ranges, rangecount, processedlength);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)changetrackingid;
    (void)byteoffset;
    (void)bytelength;
    (void)flags;
    (void)ranges;
    (void)rangecount;
    (void)processedlength;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_RawSCSIVirtualDisk(void* virtualdiskhandle, void* parameters, int32_t flags, void* response) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RawSCSIVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, parameters, flags, response);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    (void)response;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_ResizeVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResizeVirtualDisk");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, flags, parameters, overlapped);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)flags;
    (void)parameters;
    (void)overlapped;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_SetVirtualDiskInformation(void* virtualdiskhandle, void* virtualdiskinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVirtualDiskInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, virtualdiskinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)virtualdiskinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_SetVirtualDiskMetadata(void* virtualdiskhandle, void* item, uint32_t metadatasize, void* metadata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetVirtualDiskMetadata");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, item, metadatasize, metadata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)item;
    (void)metadatasize;
    (void)metadata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_vhd_TakeSnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("virtdisk.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "TakeSnapshotVhdSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(virtualdiskhandle, parameters, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)virtualdiskhandle;
    (void)parameters;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

