#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_networking_clustering_wrapper.h"
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

uint32_t windowssys_windows_win32_networking_clustering_AddClusterGroupDependency(int64_t hdependentgroup, int64_t hprovidergroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependentgroup, hprovidergroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterGroupDependencyEx(int64_t hdependentgroup, int64_t hprovidergroup, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependentgroup, hprovidergroup, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroup;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependency(int64_t hdependentgroupset, int64_t hprovidergroupset) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupSetDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependentgroupset, hprovidergroupset);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependentgroupset;
    (void)hprovidergroupset;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependencyEx(int64_t hdependentgroupset, int64_t hprovidergroupset, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupSetDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependentgroupset, hprovidergroupset, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependentgroupset;
    (void)hprovidergroupset;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependency(int64_t hdependentgroup, int64_t hprovidergroupset) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupToGroupSetDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependentgroup, hprovidergroupset);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroupset;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependencyEx(int64_t hdependentgroup, int64_t hprovidergroupset, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupToGroupSetDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependentgroup, hprovidergroupset, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroupset;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_AddClusterNode(int64_t hcluster, void* lpsznodename, void* pfnprogresscallback, void* pvcallbackarg) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznodename, pfnprogresscallback, pvcallbackarg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_AddClusterNodeEx(int64_t hcluster, void* lpsznodename, uint32_t dwflags, void* pfnprogresscallback, void* pvcallbackarg) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznodename, dwflags, pfnprogresscallback, pvcallbackarg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)dwflags;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterResourceDependency(int64_t hresource, int64_t hdependson) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterResourceDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hdependson);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hdependson;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterResourceDependencyEx(int64_t hresource, int64_t hdependson, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterResourceDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hdependson, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterResourceNode(int64_t hresource, int64_t hnode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterResourceNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hnode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hnode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterResourceNodeEx(int64_t hresource, int64_t hnode, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterResourceNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hnode, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hnode;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddClusterStorageNode(int64_t hcluster, void* lpsznodename, void* pfnprogresscallback, void* pvcallbackarg, void* lpszclusterstoragenodedescription, void* lpszclusterstoragenodelocation) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterStorageNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznodename, pfnprogresscallback, pvcallbackarg, lpszclusterstoragenodedescription, lpszclusterstoragenodelocation);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    (void)lpszclusterstoragenodedescription;
    (void)lpszclusterstoragenodelocation;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddCrossClusterGroupSetDependency(int64_t hdependentgroupset, void* lpremoteclustername, void* lpremotegroupsetname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddCrossClusterGroupSetDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependentgroupset, lpremoteclustername, lpremotegroupsetname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependentgroupset;
    (void)lpremoteclustername;
    (void)lpremotegroupsetname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_AddResourceToClusterSharedVolumes(int64_t hresource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddResourceToClusterSharedVolumes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_BackupClusterDatabase(int64_t hcluster, void* lpszpathname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupClusterDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszpathname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszpathname;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_CanResourceBeDependent(int64_t hresource, int64_t hresourcedependent) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CanResourceBeDependent");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hresourcedependent);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hresource;
    (void)hresourcedependent;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_CancelClusterGroupOperation(int64_t hgroup, uint32_t dwcancelflags_reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelClusterGroupOperation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, dwcancelflags_reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)dwcancelflags_reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroup(int64_t hresource, int64_t hgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeClusterResourceGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx(int64_t hresource, int64_t hgroup, uint64_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeClusterResourceGroupEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hgroup, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hgroup;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx2(int64_t hresource, int64_t hgroup, uint64_t flags, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeClusterResourceGroupEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hgroup, flags, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hgroup;
    (void)flags;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_CloseCluster(int64_t hcluster) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseCluster");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_CloseClusterCryptProvider(int64_t hcluscryptprovider) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterCryptProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluscryptprovider);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluscryptprovider;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_CloseClusterGroup(int64_t hgroup) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_CloseClusterGroupSet(int64_t hgroupset) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterGroupSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroupset;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_CloseClusterNetInterface(int64_t hnetinterface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterNetInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetinterface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnetinterface;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_CloseClusterNetwork(int64_t hnetwork) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterNetwork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnetwork;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_CloseClusterNode(int64_t hnode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_CloseClusterNotifyPort(int64_t hchange) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterNotifyPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchange;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_CloseClusterResource(int64_t hresource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hresource;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusAddClusterHealthFault(int64_t hcluster, void* failure, uint32_t param2) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusAddClusterHealthFault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, failure, param2);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)failure;
    (void)param2;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusGetClusterHealthFaults(int64_t hcluster, void* objects, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusGetClusterHealthFaults");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, objects, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)objects;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusRemoveClusterHealthFault(int64_t hcluster, void* id, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusRemoveClusterHealthFault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, id, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)id;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusWorkerCheckTerminate(void* lpworker) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkerCheckTerminate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpworker);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpworker;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusWorkerCreate(void* lpworker, void* lpstartaddress, void* lpparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkerCreate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpworker, lpstartaddress, lpparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpworker;
    (void)lpstartaddress;
    (void)lpparameter;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networking_clustering_ClusWorkerTerminate(void* lpworker) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkerTerminate");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(lpworker);
        return;
    }
    errno = ENOSYS;
#else
    (void)lpworker;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusWorkerTerminateEx(void* clusworker, uint32_t timeoutinmilliseconds, int32_t waitonly) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkerTerminateEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clusworker, timeoutinmilliseconds, waitonly);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clusworker;
    (void)timeoutinmilliseconds;
    (void)waitonly;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusWorkersTerminate(void* clusworkers, uint64_t clusworkerscount, uint32_t timeoutinmilliseconds, int32_t waitonly) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkersTerminate");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clusworkers, clusworkerscount, timeoutinmilliseconds, waitonly);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clusworkers;
    (void)clusworkerscount;
    (void)timeoutinmilliseconds;
    (void)waitonly;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_ClusapiSetReasonHandler(void* lphandler) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusapiSetReasonHandler");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lphandler);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)lphandler;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterAddGroupToAffinityRule(int64_t hcluster, void* rulename, int64_t hgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAddGroupToAffinityRule");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, rulename, hgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)rulename;
    (void)hgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSet(int64_t hgroupset, int64_t hgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAddGroupToGroupSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, hgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)hgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomains(int64_t hgroupset, int64_t hgroup, uint32_t faultdomain, uint32_t updatedomain) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAddGroupToGroupSetWithDomains");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, hgroup, faultdomain, updatedomain);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)hgroup;
    (void)faultdomain;
    (void)updatedomain;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomainsEx(int64_t hgroupset, int64_t hgroup, uint32_t faultdomain, uint32_t updatedomain, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAddGroupToGroupSetWithDomainsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, hgroup, faultdomain, updatedomain, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)hgroup;
    (void)faultdomain;
    (void)updatedomain;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterAffinityRuleControl(int64_t hcluster, void* affinityrulename, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAffinityRuleControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, affinityrulename, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)affinityrulename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterClearBackupStateForSharedVolume(void* lpszvolumepathname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterClearBackupStateForSharedVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumepathname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszvolumepathname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterCloseEnum(int64_t henum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterCloseEnumEx(int64_t hclusterenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterCloseEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclusterenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclusterenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterControl(int64_t hcluster, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterControlEx(int64_t hcluster, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterControlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterCreateAffinityRule(int64_t hcluster, void* rulename, int32_t ruletype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterCreateAffinityRule");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, rulename, ruletype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)rulename;
    (void)ruletype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterDecrypt(int64_t hcluscryptprovider, void* pcryptinput, uint32_t cbcryptinput, void* ppcryptoutput, void* pcbcryptoutput) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterDecrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluscryptprovider, pcryptinput, cbcryptinput, ppcryptoutput, pcbcryptoutput);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluscryptprovider;
    (void)pcryptinput;
    (void)cbcryptinput;
    (void)ppcryptoutput;
    (void)pcbcryptoutput;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterEncrypt(int64_t hcluscryptprovider, void* pdata, uint32_t cbdata, void* ppdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterEncrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluscryptprovider, pdata, cbdata, ppdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluscryptprovider;
    (void)pdata;
    (void)cbdata;
    (void)ppdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterEnum(int64_t henum, uint32_t dwindex, void* lpdwtype, void* lpszname, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum, dwindex, lpdwtype, lpszname, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterEnumEx(int64_t hclusterenum, uint32_t dwindex, void* pitem, void* cbitem) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclusterenum, dwindex, pitem, cbitem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclusterenum;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGetEnumCount(int64_t henum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGetEnumCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(henum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)henum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGetEnumCountEx(int64_t hclusterenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGetEnumCountEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclusterenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclusterenum;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterGetVolumeNameForVolumeMountPoint(void* lpszvolumemountpoint, void* lpszvolumename, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGetVolumeNameForVolumeMountPoint");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszvolumemountpoint, lpszvolumename, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterGetVolumePathName(void* lpszfilename, void* lpszvolumepathname, uint32_t cchbufferlength) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGetVolumePathName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, lpszvolumepathname, cchbufferlength);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)cchbufferlength;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnum(int64_t hgroupenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnumEx(int64_t hgroupenumex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupCloseEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupenumex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupenumex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupControl(int64_t hgroup, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupControlEx(int64_t hgroup, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupControlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupEnum(int64_t hgroupenum, uint32_t dwindex, void* lpdwtype, void* lpszresourcename, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupenum, dwindex, lpdwtype, lpszresourcename, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszresourcename;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupEnumEx(int64_t hgroupenumex, uint32_t dwindex, void* pitem, void* cbitem) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupenumex, dwindex, pitem, cbitem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupenumex;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCount(int64_t hgroupenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupGetEnumCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCountEx(int64_t hgroupenumex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupGetEnumCountEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupenumex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupenumex;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnum(int64_t hgroup, uint32_t dwtype) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupOpenEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, dwtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)dwtype;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnumEx(int64_t hcluster, void* lpszproperties, uint32_t cbproperties, void* lpszroproperties, uint32_t cbroproperties, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupOpenEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszproperties, cbproperties, lpszroproperties, cbroproperties, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszproperties;
    (void)cbproperties;
    (void)lpszroproperties;
    (void)cbroproperties;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupSetCloseEnum(int64_t hgroupsetenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupsetenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupsetenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupSetControl(int64_t hgroupset, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupSetControlEx(int64_t hgroupset, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetControlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupSetEnum(int64_t hgroupsetenum, uint32_t dwindex, void* lpszname, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupsetenum, dwindex, lpszname, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupsetenum;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterGroupSetGetEnumCount(int64_t hgroupsetenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetGetEnumCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupsetenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupsetenum;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterGroupSetOpenEnum(int64_t hcluster) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetOpenEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterIsPathOnSharedVolume(void* lpszpathname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterIsPathOnSharedVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszpathname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszpathname;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNetInterfaceCloseEnum(int64_t hnetinterfaceenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetinterfaceenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetinterfaceenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControl(int64_t hnetinterface, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetinterface;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControlEx(int64_t hnetinterface, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceControlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetinterface, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetinterface;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNetInterfaceEnum(int64_t hnetinterfaceenum, uint32_t dwindex, void* lpszname, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetinterfaceenum, dwindex, lpszname, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetinterfaceenum;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterNetInterfaceOpenEnum(int64_t hcluster, void* lpsznodename, void* lpsznetworkname) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceOpenEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznodename, lpsznetworkname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)lpsznetworkname;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNetworkCloseEnum(int64_t hnetworkenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetworkenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetworkenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNetworkControl(int64_t hnetwork, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetwork;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNetworkControlEx(int64_t hnetwork, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkControlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetwork;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNetworkEnum(int64_t hnetworkenum, uint32_t dwindex, void* lpdwtype, void* lpszname, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetworkenum, dwindex, lpdwtype, lpszname, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetworkenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNetworkGetEnumCount(int64_t hnetworkenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkGetEnumCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetworkenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetworkenum;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterNetworkOpenEnum(int64_t hnetwork, uint32_t dwtype) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkOpenEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork, dwtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnetwork;
    (void)dwtype;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnum(int64_t hnodeenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnodeenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnodeenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnumEx(int64_t hnodeenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeCloseEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnodeenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnodeenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNodeControl(int64_t hnode, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNodeControlEx(int64_t hnode, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeControlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNodeEnum(int64_t hnodeenum, uint32_t dwindex, void* lpdwtype, void* lpszname, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnodeenum, dwindex, lpdwtype, lpszname, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnodeenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNodeEnumEx(int64_t hnodeenum, uint32_t dwindex, void* pitem, void* cbitem) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnodeenum, dwindex, pitem, cbitem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnodeenum;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCount(int64_t hnodeenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeGetEnumCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnodeenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnodeenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCountEx(int64_t hnodeenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeGetEnumCountEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnodeenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnodeenum;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnum(int64_t hnode, uint32_t dwtype) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeOpenEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, dwtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    (void)dwtype;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnumEx(int64_t hnode, uint32_t dwtype, void* poptions) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeOpenEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, dwtype, poptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    (void)dwtype;
    (void)poptions;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterNodeReplacement(int64_t hcluster, void* lpsznodenamecurrent, void* lpsznodenamenew) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeReplacement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznodenamecurrent, lpsznodenamenew);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpsznodenamecurrent;
    (void)lpsznodenamenew;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterOpenEnum(int64_t hcluster, uint32_t dwtype) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterOpenEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, dwtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)dwtype;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterOpenEnumEx(int64_t hcluster, uint32_t dwtype, void* poptions) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterOpenEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, dwtype, poptions);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)dwtype;
    (void)poptions;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterPrepareSharedVolumeForBackup(void* lpszfilename, void* lpszvolumepathname, void* lpcchvolumepathname, void* lpszvolumename, void* lpcchvolumename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterPrepareSharedVolumeForBackup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszfilename, lpszvolumepathname, lpcchvolumepathname, lpszvolumename, lpcchvolumename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)lpcchvolumepathname;
    (void)lpszvolumename;
    (void)lpcchvolumename;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegBatchAddCommand(int64_t hregbatch, int32_t dwcommand, void* wzname, uint32_t dwoptions, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegBatchAddCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregbatch, dwcommand, wzname, dwoptions, lpdata, cbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregbatch;
    (void)dwcommand;
    (void)wzname;
    (void)dwoptions;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegBatchCloseNotification(int64_t hbatchnotification) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegBatchCloseNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbatchnotification);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbatchnotification;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegBatchReadCommand(int64_t hbatchnotification, void* pbatchcommand) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegBatchReadCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbatchnotification, pbatchcommand);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbatchnotification;
    (void)pbatchcommand;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCloseBatch(int64_t hregbatch, int32_t bcommit, void* failedcommandnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseBatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregbatch, bcommit, failedcommandnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregbatch;
    (void)bcommit;
    (void)failedcommandnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchEx(int64_t hregbatch, uint32_t flags, void* failedcommandnumber) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseBatchEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregbatch, flags, failedcommandnumber);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregbatch;
    (void)flags;
    (void)failedcommandnumber;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchNotifyPort(int64_t hbatchnotifyport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseBatchNotifyPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbatchnotifyport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbatchnotifyport;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCloseKey(void* hkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatch(int64_t hregreadbatch, void* phregreadbatchreply) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseReadBatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregreadbatch, phregreadbatchreply);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregreadbatch;
    (void)phregreadbatchreply;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchEx(int64_t hregreadbatch, uint32_t flags, void* phregreadbatchreply) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseReadBatchEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregreadbatch, flags, phregreadbatchreply);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregreadbatch;
    (void)flags;
    (void)phregreadbatchreply;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchReply(int64_t hregreadbatchreply) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseReadBatchReply");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregreadbatchreply);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregreadbatchreply;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCreateBatch(void* hkey, void* phregbatch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateBatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, phregbatch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)phregbatch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCreateBatchNotifyPort(void* hkey, void* phbatchnotifyport) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateBatchNotifyPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, phbatchnotifyport);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)phbatchnotifyport;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCreateKey(void* hkey, void* lpszsubkey, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpszsubkey, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)lpszsubkey;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCreateKeyEx(void* hkey, void* lpsubkey, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* lpszreason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateKeyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition, lpszreason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)lpszreason;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegCreateReadBatch(void* hkey, void* phregreadbatch) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateReadBatch");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, phregreadbatch);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)phregreadbatch;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegDeleteKey(void* hkey, void* lpszsubkey) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegDeleteKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpszsubkey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)lpszsubkey;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegDeleteKeyEx(void* hkey, void* lpsubkey, void* lpszreason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegDeleteKeyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpszreason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpszreason;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterRegDeleteValue(void* hkey, void* lpszvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegDeleteValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpszvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterRegDeleteValueEx(void* hkey, void* lpszvaluename, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegDeleteValueEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpszvaluename, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegEnumKey(void* hkey, uint32_t dwindex, void* lpszname, void* lpcchname, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegEnumKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpszname, lpcchname, lpftlastwritetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterRegEnumValue(void* hkey, uint32_t dwindex, void* lpszvaluename, void* lpcchvaluename, void* lpdwtype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegEnumValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpszvaluename, lpcchvaluename, lpdwtype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpszvaluename;
    (void)lpcchvaluename;
    (void)lpdwtype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegGetBatchNotification(int64_t hbatchnotify, void* phbatchnotification) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegGetBatchNotification");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbatchnotify, phbatchnotification);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hbatchnotify;
    (void)phbatchnotification;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegGetKeySecurity(void* hkey, uint32_t requestedinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegGetKeySecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, requestedinformation, psecuritydescriptor, lpcbsecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegOpenKey(void* hkey, void* lpszsubkey, uint32_t samdesired, void* phkresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegOpenKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpszsubkey, samdesired, phkresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)lpszsubkey;
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegQueryInfoKey(void* hkey, void* lpcsubkeys, void* lpcchmaxsubkeylen, void* lpcvalues, void* lpcchmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegQueryInfoKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpcsubkeys, lpcchmaxsubkeylen, lpcvalues, lpcchmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)lpcsubkeys;
    (void)lpcchmaxsubkeylen;
    (void)lpcvalues;
    (void)lpcchmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegQueryValue(void* hkey, void* lpszvaluename, void* lpdwvaluetype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegQueryValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpszvaluename, lpdwvaluetype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)lpdwvaluetype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegReadBatchAddCommand(int64_t hregreadbatch, void* wzsubkeyname, void* wzvaluename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegReadBatchAddCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregreadbatch, wzsubkeyname, wzvaluename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregreadbatch;
    (void)wzsubkeyname;
    (void)wzvaluename;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegReadBatchReplyNextCommand(int64_t hregreadbatchreply, void* pbatchcommand) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegReadBatchReplyNextCommand");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hregreadbatchreply, pbatchcommand);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hregreadbatchreply;
    (void)pbatchcommand;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSetKeySecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurityEx(void* hkey, uint32_t securityinformation, void* psecuritydescriptor, void* lpszreason) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSetKeySecurityEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, securityinformation, psecuritydescriptor, lpszreason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)lpszreason;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterRegSetValue(void* hkey, void* lpszvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSetValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpszvaluename, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterRegSetValueEx(void* hkey, void* lpszvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSetValueEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpszvaluename, dwtype, lpdata, cbdata, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ClusterRegSyncDatabase(int64_t hcluster, uint32_t flags) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSyncDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, flags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)flags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterRemoveAffinityRule(int64_t hcluster, void* rulename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRemoveAffinityRule");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, rulename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)rulename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromAffinityRule(int64_t hcluster, void* rulename, int64_t hgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRemoveGroupFromAffinityRule");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, rulename, hgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)rulename;
    (void)hgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSet(int64_t hgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRemoveGroupFromGroupSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSetEx(int64_t hgroup, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRemoveGroupFromGroupSetEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnum(int64_t hresenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnumEx(int64_t hresourceenumex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceCloseEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresourceenumex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresourceenumex;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceControl(int64_t hresource, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUser(int64_t hresource, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceControlAsUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUserEx(int64_t hresource, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceControlAsUserEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceControlEx(int64_t hresource, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t cbinbuffersize, void* lpoutbuffer, uint32_t cboutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceControlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hhostnode, dwcontrolcode, lpinbuffer, cbinbuffersize, lpoutbuffer, cboutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceEnum(int64_t hresenum, uint32_t dwindex, void* lpdwtype, void* lpszname, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresenum, dwindex, lpdwtype, lpszname, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceEnumEx(int64_t hresourceenumex, uint32_t dwindex, void* pitem, void* cbitem) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresourceenumex, dwindex, pitem, cbitem);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresourceenumex;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCount(int64_t hresenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceGetEnumCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCountEx(int64_t hresourceenumex) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceGetEnumCountEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresourceenumex);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresourceenumex;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnum(int64_t hresource, uint32_t dwtype) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceOpenEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, dwtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hresource;
    (void)dwtype;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnumEx(int64_t hcluster, void* lpszproperties, uint32_t cbproperties, void* lpszroproperties, uint32_t cbroproperties, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceOpenEnumEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszproperties, cbproperties, lpszroproperties, cbroproperties, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszproperties;
    (void)cbproperties;
    (void)lpszroproperties;
    (void)cbroproperties;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceTypeCloseEnum(int64_t hrestypeenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeCloseEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrestypeenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrestypeenum;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceTypeControl(int64_t hcluster, void* lpszresourcetypename, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeControl");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUser(int64_t hcluster, void* lpszresourcetypename, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeControlAsUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUserEx(int64_t hcluster, void* lpszresourcetypename, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeControlAsUserEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlEx(int64_t hcluster, void* lpszresourcetypename, int64_t hhostnode, uint32_t dwcontrolcode, void* lpinbuffer, uint32_t ninbuffersize, void* lpoutbuffer, uint32_t noutbuffersize, void* lpbytesreturned, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeControlEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode, lpinbuffer, ninbuffersize, lpoutbuffer, noutbuffersize, lpbytesreturned, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceTypeEnum(int64_t hrestypeenum, uint32_t dwindex, void* lpdwtype, void* lpszname, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrestypeenum, dwindex, lpdwtype, lpszname, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrestypeenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterResourceTypeGetEnumCount(int64_t hrestypeenum) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeGetEnumCount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hrestypeenum);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hrestypeenum;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ClusterResourceTypeOpenEnum(int64_t hcluster, void* lpszresourcetypename, uint32_t dwtype) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeOpenEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcetypename, dwtype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)dwtype;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterSetAccountAccess(int64_t hcluster, void* szaccountsid, uint32_t dwaccess, uint32_t dwcontroltype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterSetAccountAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, szaccountsid, dwaccess, dwcontroltype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)szaccountsid;
    (void)dwaccess;
    (void)dwcontroltype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ClusterUpgradeFunctionalLevel(int64_t hcluster, int32_t perform, void* pfnprogresscallback, void* pvcallbackarg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterUpgradeFunctionalLevel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, perform, pfnprogresscallback, pvcallbackarg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)perform;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_CreateCluster(void* pconfig, void* pfnprogresscallback, void* pvcallbackarg) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCluster");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pconfig, pfnprogresscallback, pvcallbackarg);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pconfig;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_CreateClusterAvailabilitySet(int64_t hcluster, void* lpavailabilitysetname, void* pavailabilitysetconfig) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterAvailabilitySet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpavailabilitysetname, pavailabilitysetconfig);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpavailabilitysetname;
    (void)pavailabilitysetconfig;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_CreateClusterGroup(int64_t hcluster, void* lpszgroupname) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_CreateClusterGroupEx(int64_t hcluster, void* lpszgroupname, void* pgroupinfo) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterGroupEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszgroupname, pgroupinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    (void)pgroupinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_CreateClusterGroupSet(int64_t hcluster, void* groupsetname) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterGroupSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, groupsetname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)groupsetname;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_CreateClusterNameAccount(int64_t hcluster, void* pconfig, void* pfnprogresscallback, void* pvcallbackarg) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterNameAccount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, pconfig, pfnprogresscallback, pvcallbackarg);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)pconfig;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_CreateClusterNotifyPort(int64_t hchange, int64_t hcluster, uint32_t dwfilter, uint64_t dwnotifykey) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterNotifyPort");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange, hcluster, dwfilter, dwnotifykey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchange;
    (void)hcluster;
    (void)dwfilter;
    (void)dwnotifykey;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_CreateClusterNotifyPortV2(int64_t hchange, int64_t hcluster, void* filters, uint32_t dwfiltercount, uint64_t dwnotifykey) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterNotifyPortV2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange, hcluster, filters, dwfiltercount, dwnotifykey);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hchange;
    (void)hcluster;
    (void)filters;
    (void)dwfiltercount;
    (void)dwnotifykey;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_CreateClusterResource(int64_t hgroup, void* lpszresourcename, void* lpszresourcetype, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpszresourcename, lpszresourcetype, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_CreateClusterResourceEx(int64_t hgroup, void* lpszresourcename, void* lpszresourcetype, uint32_t dwflags, void* lpszreason) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpszresourcename, lpszresourcetype, dwflags, lpszreason);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwflags;
    (void)lpszreason;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_CreateClusterResourceType(int64_t hcluster, void* lpszresourcetypename, void* lpszdisplayname, void* lpszresourcetypedll, uint32_t dwlooksalivepollinterval, uint32_t dwisalivepollinterval) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterResourceType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval, dwisalivepollinterval);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)lpszdisplayname;
    (void)lpszresourcetypedll;
    (void)dwlooksalivepollinterval;
    (void)dwisalivepollinterval;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_CreateClusterResourceTypeEx(int64_t hcluster, void* lpszresourcetypename, void* lpszdisplayname, void* lpszresourcetypedll, uint32_t dwlooksalivepollinterval, uint32_t dwisalivepollinterval, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterResourceTypeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval, dwisalivepollinterval, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)lpszdisplayname;
    (void)lpszresourcetypedll;
    (void)dwlooksalivepollinterval;
    (void)dwisalivepollinterval;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DeleteClusterGroup(int64_t hgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DeleteClusterGroupEx(int64_t hgroup, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterGroupEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DeleteClusterGroupSet(int64_t hgroupset) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterGroupSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DeleteClusterGroupSetEx(int64_t hgroupset, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterGroupSetEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DeleteClusterResource(int64_t hresource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DeleteClusterResourceEx(int64_t hresource, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DeleteClusterResourceType(int64_t hcluster, void* lpszresourcetypename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterResourceType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcetypename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DeleteClusterResourceTypeEx(int64_t hcluster, void* lpsztypename, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterResourceTypeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsztypename, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpsztypename;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DestroyCluster(int64_t hcluster, void* pfnprogresscallback, void* pvcallbackarg, int32_t fdeletevirtualcomputerobjects) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyCluster");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, pfnprogresscallback, pvcallbackarg, fdeletevirtualcomputerobjects);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    (void)fdeletevirtualcomputerobjects;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DestroyClusterGroup(int64_t hgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyClusterGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DestroyClusterGroupEx(int64_t hgroup, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyClusterGroupEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromCluster(int64_t hcluster, void* pcnorestype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetermineCNOResTypeFromCluster");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, pcnorestype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)pcnorestype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromNodelist(uint32_t cnodes, void* ppsznodenames, void* pcnorestype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetermineCNOResTypeFromNodelist");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnodes, ppsznodenames, pcnorestype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cnodes;
    (void)ppsznodenames;
    (void)pcnorestype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromCluster(int64_t hcluster, void* pcloudtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetermineClusterCloudTypeFromCluster");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, pcloudtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)pcloudtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromNodelist(uint32_t cnodes, void* ppsznodenames, void* pcloudtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetermineClusterCloudTypeFromNodelist");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cnodes, ppsznodenames, pcloudtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)cnodes;
    (void)ppsznodenames;
    (void)pcloudtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_EvictClusterNode(int64_t hnode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvictClusterNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_EvictClusterNodeEx(int64_t hnode, uint32_t dwtimeout, void* phrcleanupstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvictClusterNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, dwtimeout, phrcleanupstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    (void)dwtimeout;
    (void)phrcleanupstatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_EvictClusterNodeEx2(int64_t hnode, uint32_t dwtimeout, void* phrcleanupstatus, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvictClusterNodeEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, dwtimeout, phrcleanupstatus, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    (void)dwtimeout;
    (void)phrcleanupstatus;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_FailClusterResource(int64_t hresource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FailClusterResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_FailClusterResourceEx(int64_t hresource, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FailClusterResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_FreeClusterCrypt(void* pcryptinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeClusterCrypt");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pcryptinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pcryptinfo;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_FreeClusterHealthFault(void* clusterhealthfault) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeClusterHealthFault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clusterhealthfault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clusterhealthfault;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_FreeClusterHealthFaultArray(void* clusterhealthfaultarray) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeClusterHealthFaultArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clusterhealthfaultarray);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clusterhealthfaultarray;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_GetClusterFromGroup(int64_t hgroup) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_GetClusterFromNetInterface(int64_t hnetinterface) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromNetInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetinterface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnetinterface;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_GetClusterFromNetwork(int64_t hnetwork) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromNetwork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnetwork;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_GetClusterFromNode(int64_t hnode) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_GetClusterFromResource(int64_t hresource) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hresource;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_clustering_GetClusterGroupKey(int64_t hgroup, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterGroupKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hgroup;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_GetClusterGroupState(int64_t hgroup, void* lpsznodename, void* lpcchnodename) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterGroupState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpsznodename, lpcchnodename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hgroup;
    (void)lpsznodename;
    (void)lpcchnodename;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetClusterInformation(int64_t hcluster, void* lpszclustername, void* lpcchclustername, void* lpclusterinfo) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterInformation");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszclustername, lpcchclustername, lpclusterinfo);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszclustername;
    (void)lpcchclustername;
    (void)lpclusterinfo;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_GetClusterKey(int64_t hcluster, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcluster;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetClusterNetInterface(int64_t hcluster, void* lpsznodename, void* lpsznetworkname, void* lpszinterfacename, void* lpcchinterfacename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznodename, lpsznetworkname, lpszinterfacename, lpcchinterfacename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)lpsznetworkname;
    (void)lpszinterfacename;
    (void)lpcchinterfacename;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceKey(int64_t hnetinterface, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetInterfaceKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetinterface, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hnetinterface;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceState(int64_t hnetinterface) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetInterfaceState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetinterface);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnetinterface;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetClusterNetworkId(int64_t hnetwork, void* lpsznetworkid, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetworkId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork, lpsznetworkid, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetwork;
    (void)lpsznetworkid;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_GetClusterNetworkKey(int64_t hnetwork, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetworkKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hnetwork;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_GetClusterNetworkState(int64_t hnetwork) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetworkState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnetwork;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetClusterNodeId(int64_t hnode, void* lpsznodeid, void* lpcchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNodeId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, lpsznodeid, lpcchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    (void)lpsznodeid;
    (void)lpcchname;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_GetClusterNodeKey(int64_t hnode, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNodeKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hnode;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_GetClusterNodeState(int64_t hnode) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNodeState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hnode;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetClusterNotify(int64_t hchange, void* lpdwnotifykey, void* lpdwfiltertype, void* lpszname, void* lpcchname, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNotify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange, lpdwnotifykey, lpdwfiltertype, lpszname, lpcchname, dwmilliseconds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hchange;
    (void)lpdwnotifykey;
    (void)lpdwfiltertype;
    (void)lpszname;
    (void)lpcchname;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetClusterNotifyV2(int64_t hchange, void* lpdwnotifykey, void* pfilterandtype, void* buffer, void* lpbbuffersize, void* lpszobjectid, void* lpcchobjectid, void* lpszparentid, void* lpcchparentid, void* lpszname, void* lpcchname, void* lpsztype, void* lpcchtype, uint32_t dwmilliseconds) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNotifyV2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange, lpdwnotifykey, pfilterandtype, buffer, lpbbuffersize, lpszobjectid, lpcchobjectid, lpszparentid, lpcchparentid, lpszname, lpcchname, lpsztype, lpcchtype, dwmilliseconds);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hchange;
    (void)lpdwnotifykey;
    (void)pfilterandtype;
    (void)buffer;
    (void)lpbbuffersize;
    (void)lpszobjectid;
    (void)lpcchobjectid;
    (void)lpszparentid;
    (void)lpcchparentid;
    (void)lpszname;
    (void)lpcchname;
    (void)lpsztype;
    (void)lpcchtype;
    (void)dwmilliseconds;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetClusterQuorumResource(int64_t hcluster, void* lpszresourcename, void* lpcchresourcename, void* lpszdevicename, void* lpcchdevicename, void* lpdwmaxquorumlogsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterQuorumResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcename, lpcchresourcename, lpszdevicename, lpcchdevicename, lpdwmaxquorumlogsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszresourcename;
    (void)lpcchresourcename;
    (void)lpszdevicename;
    (void)lpcchdevicename;
    (void)lpdwmaxquorumlogsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetClusterResourceDependencyExpression(int64_t hresource, void* lpszdependencyexpression, void* lpcchdependencyexpression) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceDependencyExpression");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpszdependencyexpression, lpcchdependencyexpression);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)lpszdependencyexpression;
    (void)lpcchdependencyexpression;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_GetClusterResourceKey(int64_t hresource, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hresource;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_GetClusterResourceNetworkName(int64_t hresource, void* lpbuffer, void* nsize) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceNetworkName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpbuffer, nsize);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hresource;
    (void)lpbuffer;
    (void)nsize;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_GetClusterResourceState(int64_t hresource, void* lpsznodename, void* lpcchnodename, void* lpszgroupname, void* lpcchgroupname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpsznodename, lpcchnodename, lpszgroupname, lpcchgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hresource;
    (void)lpsznodename;
    (void)lpcchnodename;
    (void)lpszgroupname;
    (void)lpcchgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

void* windowssys_windows_win32_networking_clustering_GetClusterResourceTypeKey(int64_t hcluster, void* lpsztypename, uint32_t samdesired) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceTypeKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsztypename, samdesired);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hcluster;
    (void)lpsztypename;
    (void)samdesired;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetNodeCloudTypeDW(void* ppsznodename, void* nodecloudtype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNodeCloudTypeDW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppsznodename, nodecloudtype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppsznodename;
    (void)nodecloudtype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetNodeClusterState(void* lpsznodename, void* pdwclusterstate) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNodeClusterState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpsznodename, pdwclusterstate);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpsznodename;
    (void)pdwclusterstate;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_GetNotifyEventHandle(int64_t hchange, void* lphtargetevent) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNotifyEventHandle");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange, lphtargetevent);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hchange;
    (void)lphtargetevent;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_InitializeClusterHealthFault(void* clusterhealthfault) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeClusterHealthFault");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clusterhealthfault);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clusterhealthfault;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_InitializeClusterHealthFaultArray(void* clusterhealthfaultarray) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeClusterHealthFaultArray");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(clusterhealthfaultarray);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)clusterhealthfaultarray;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_IsFileOnClusterSharedVolume(void* lpszpathname, void* pbfileisonsharedvolume) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsFileOnClusterSharedVolume");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszpathname, pbfileisonsharedvolume);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszpathname;
    (void)pbfileisonsharedvolume;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_MoveClusterGroup(int64_t hgroup, int64_t hdestinationnode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveClusterGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdestinationnode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_MoveClusterGroupEx(int64_t hgroup, int64_t hdestinationnode, uint32_t dwmoveflags, void* lpinbuffer, uint32_t cbinbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveClusterGroupEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdestinationnode, dwmoveflags, lpinbuffer, cbinbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwmoveflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_MoveClusterGroupEx2(int64_t hgroup, int64_t hdestinationnode, uint32_t dwmoveflags, void* lpinbuffer, uint32_t cbinbuffersize, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveClusterGroupEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdestinationnode, dwmoveflags, lpinbuffer, cbinbuffersize, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwmoveflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OfflineClusterGroup(int64_t hgroup) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx(int64_t hgroup, uint32_t dwofflineflags, void* lpinbuffer, uint32_t cbinbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterGroupEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, dwofflineflags, lpinbuffer, cbinbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx2(int64_t hgroup, uint32_t dwofflineflags, void* lpinbuffer, uint32_t cbinbuffersize, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterGroupEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, dwofflineflags, lpinbuffer, cbinbuffersize, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OfflineClusterResource(int64_t hresource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx(int64_t hresource, uint32_t dwofflineflags, void* lpinbuffer, uint32_t cbinbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, dwofflineflags, lpinbuffer, cbinbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx2(int64_t hresource, uint32_t dwofflineflags, void* lpinbuffer, uint32_t cbinbuffersize, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterResourceEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, dwofflineflags, lpinbuffer, cbinbuffersize, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OnlineClusterGroup(int64_t hgroup, int64_t hdestinationnode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdestinationnode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx(int64_t hgroup, int64_t hdestinationnode, uint32_t dwonlineflags, void* lpinbuffer, uint32_t cbinbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterGroupEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdestinationnode, dwonlineflags, lpinbuffer, cbinbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx2(int64_t hgroup, int64_t hdestinationnode, uint32_t dwonlineflags, void* lpinbuffer, uint32_t cbinbuffersize, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterGroupEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdestinationnode, dwonlineflags, lpinbuffer, cbinbuffersize, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OnlineClusterResource(int64_t hresource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx(int64_t hresource, uint32_t dwonlineflags, void* lpinbuffer, uint32_t cbinbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, dwonlineflags, lpinbuffer, cbinbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx2(int64_t hresource, uint32_t dwonlineflags, void* lpinbuffer, uint32_t cbinbuffersize, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterResourceEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, dwonlineflags, lpinbuffer, cbinbuffersize, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenCluster(void* lpszclustername) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenCluster");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszclustername);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszclustername;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterCryptProvider(void* lpszresource, void* lpszprovider, uint32_t dwtype, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterCryptProvider");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszresource, lpszprovider, dwtype, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszresource;
    (void)lpszprovider;
    (void)dwtype;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterCryptProviderEx(void* lpszresource, void* lpszkeyname, void* lpszprovider, uint32_t dwtype, uint32_t dwflags) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterCryptProviderEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszresource, lpszkeyname, lpszprovider, dwtype, dwflags);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszresource;
    (void)lpszkeyname;
    (void)lpszprovider;
    (void)dwtype;
    (void)dwflags;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterEx(void* lpszclustername, uint32_t desiredaccess, void* grantedaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszclustername, desiredaccess, grantedaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszclustername;
    (void)desiredaccess;
    (void)grantedaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterGroup(int64_t hcluster, void* lpszgroupname) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszgroupname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterGroupEx(int64_t hcluster, void* lpszgroupname, uint32_t dwdesiredaccess, void* lpdwgrantedaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterGroupEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszgroupname, dwdesiredaccess, lpdwgrantedaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterGroupSet(int64_t hcluster, void* lpszgroupsetname) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterGroupSet");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszgroupsetname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszgroupsetname;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterNetInterface(int64_t hcluster, void* lpszinterfacename) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNetInterface");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszinterfacename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszinterfacename;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterNetInterfaceEx(int64_t hcluster, void* lpszinterfacename, uint32_t dwdesiredaccess, void* lpdwgrantedaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNetInterfaceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszinterfacename, dwdesiredaccess, lpdwgrantedaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszinterfacename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterNetwork(int64_t hcluster, void* lpsznetworkname) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNetwork");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznetworkname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpsznetworkname;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterNetworkEx(int64_t hcluster, void* lpsznetworkname, uint32_t dwdesiredaccess, void* lpdwgrantedaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNetworkEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznetworkname, dwdesiredaccess, lpdwgrantedaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpsznetworkname;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterNode(int64_t hcluster, void* lpsznodename) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznodename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterNodeById(int64_t hcluster, uint32_t nodeid) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNodeById");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, nodeid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)nodeid;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterNodeEx(int64_t hcluster, void* lpsznodename, uint32_t dwdesiredaccess, void* lpdwgrantedaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznodename, dwdesiredaccess, lpdwgrantedaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterResource(int64_t hcluster, void* lpszresourcename) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcename);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszresourcename;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_OpenClusterResourceEx(int64_t hcluster, void* lpszresourcename, uint32_t dwdesiredaccess, void* lpdwgrantedaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszresourcename, dwdesiredaccess, lpdwgrantedaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)lpszresourcename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_PauseClusterNode(int64_t hnode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PauseClusterNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_PauseClusterNodeEx(int64_t hnode, int32_t bdrainnode, uint32_t dwpauseflags, int64_t hnodedraintarget) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PauseClusterNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, bdrainnode, dwpauseflags, hnodedraintarget);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    (void)bdrainnode;
    (void)dwpauseflags;
    (void)hnodedraintarget;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_PauseClusterNodeEx2(int64_t hnode, int32_t bdrainnode, uint32_t dwpauseflags, int64_t hnodedraintarget, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PauseClusterNodeEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, bdrainnode, dwpauseflags, hnodedraintarget, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    (void)bdrainnode;
    (void)dwpauseflags;
    (void)hnodedraintarget;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_QueryAppInstanceVersion(void* appinstanceid, void* instanceversionhigh, void* instanceversionlow, void* versionstatus) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryAppInstanceVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(appinstanceid, instanceversionhigh, instanceversionlow, versionstatus);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)appinstanceid;
    (void)instanceversionhigh;
    (void)instanceversionlow;
    (void)versionstatus;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RegisterAppInstance(void* processhandle, void* appinstanceid, int32_t childreninheritappinstance) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterAppInstance");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, appinstanceid, childreninheritappinstance);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processhandle;
    (void)appinstanceid;
    (void)childreninheritappinstance;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RegisterAppInstanceVersion(void* appinstanceid, uint64_t instanceversionhigh, uint64_t instanceversionlow) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterAppInstanceVersion");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(appinstanceid, instanceversionhigh, instanceversionlow);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)appinstanceid;
    (void)instanceversionhigh;
    (void)instanceversionlow;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RegisterClusterNotify(int64_t hchange, uint32_t dwfiltertype, void* hobject, uint64_t dwnotifykey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClusterNotify");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange, dwfiltertype, hobject, dwnotifykey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hchange;
    (void)dwfiltertype;
    (void)hobject;
    (void)dwnotifykey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RegisterClusterResourceTypeNotifyV2(int64_t hchange, int64_t hcluster, int64_t flags, void* restypename, uint64_t dwnotifykey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClusterResourceTypeNotifyV2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hchange, hcluster, flags, restypename, dwnotifykey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hchange;
    (void)hcluster;
    (void)flags;
    (void)restypename;
    (void)dwnotifykey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependency(int64_t hgroup, int64_t hdependson) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdependson);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdependson;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependencyEx(int64_t hgroup, int64_t hdependson, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdependson, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependency(int64_t hgroupset, int64_t hdependson) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupSetDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, hdependson);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)hdependson;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependencyEx(int64_t hgroupset, int64_t hdependson, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupSetDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, hdependson, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependency(int64_t hgroup, int64_t hdependson) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupToGroupSetDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdependson);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdependson;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependencyEx(int64_t hgroup, int64_t hdependson, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupToGroupSetDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, hdependson, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterNameAccount(int64_t hcluster, int32_t bdeletecomputerobjects) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterNameAccount");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, bdeletecomputerobjects);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)bdeletecomputerobjects;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependency(int64_t hresource, int64_t hdependson) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterResourceDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hdependson);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hdependson;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependencyEx(int64_t hresource, int64_t hdependson, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterResourceDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hdependson, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hdependson;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterResourceNode(int64_t hresource, int64_t hnode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterResourceNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hnode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hnode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterResourceNodeEx(int64_t hresource, int64_t hnode, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterResourceNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, hnode, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)hnode;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveClusterStorageNode(int64_t hcluster, void* lpszclusterstorageenclosurename, uint32_t dwtimeout, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterStorageNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpszclusterstorageenclosurename, dwtimeout, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpszclusterstorageenclosurename;
    (void)dwtimeout;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveCrossClusterGroupSetDependency(int64_t hdependentgroupset, void* lpremoteclustername, void* lpremotegroupsetname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveCrossClusterGroupSetDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hdependentgroupset, lpremoteclustername, lpremotegroupsetname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hdependentgroupset;
    (void)lpremoteclustername;
    (void)lpremotegroupsetname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RemoveResourceFromClusterSharedVolumes(int64_t hresource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveResourceFromClusterSharedVolumes");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilAddUnknownProperties(void* hkeyclusterkey, void* ppropertytable, void* poutpropertylist, uint32_t pcboutpropertylistsize, void* pcbbytesreturned, void* pcbrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilAddUnknownProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytable, poutpropertylist, pcboutpropertylistsize, pcbbytesreturned, pcbrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)pcboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilCreateDirectoryTree(void* pszpath) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilCreateDirectoryTree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszpath;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilDupGroup(int64_t group, void* copy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilDupGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(group, copy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)group;
    (void)copy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilDupParameterBlock(void* poutparams, void* pinparams, void* ppropertytable) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilDupParameterBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(poutparams, pinparams, ppropertytable);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)poutparams;
    (void)pinparams;
    (void)ppropertytable;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilDupResource(int64_t group, void* copy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilDupResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(group, copy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)group;
    (void)copy;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_ResUtilDupString(void* pszinstring) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilDupString");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszinstring);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszinstring;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilEnumGroups(int64_t hcluster, int64_t hself, void* prescallback, void* pparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumGroups");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hself, prescallback, pparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)hself;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilEnumGroupsEx(int64_t hcluster, int64_t hself, int32_t grouptype, void* prescallback, void* pparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumGroupsEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hself, grouptype, prescallback, pparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)hself;
    (void)grouptype;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilEnumPrivateProperties(void* hkeyclusterkey, void* pszoutproperties, uint32_t cboutpropertiessize, void* pcbbytesreturned, void* pcbrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumPrivateProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszoutproperties, cboutpropertiessize, pcbbytesreturned, pcbrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszoutproperties;
    (void)cboutpropertiessize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilEnumProperties(void* ppropertytable, void* pszoutproperties, uint32_t cboutpropertiessize, void* pcbbytesreturned, void* pcbrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertytable, pszoutproperties, cboutpropertiessize, pcbbytesreturned, pcbrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertytable;
    (void)pszoutproperties;
    (void)cboutpropertiessize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilEnumResources(int64_t hself, void* lpszrestypename, void* prescallback, void* pparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumResources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hself, lpszrestypename, prescallback, pparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx(int64_t hcluster, int64_t hself, void* lpszrestypename, void* prescallback, void* pparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumResourcesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hself, lpszrestypename, prescallback, pparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx2(int64_t hcluster, int64_t hself, void* lpszrestypename, void* prescallback, void* pparameter, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumResourcesEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hself, lpszrestypename, prescallback, pparameter, dwdesiredaccess);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_ResUtilExpandEnvironmentStrings(void* pszsrc) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilExpandEnvironmentStrings");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszsrc);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)pszsrc;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindBinaryProperty(void* ppropertylist, uint32_t cbpropertylistsize, void* pszpropertyname, void* pbpropertyvalue, void* pcbpropertyvaluesize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindBinaryProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pbpropertyvalue, pcbpropertyvaluesize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pbpropertyvalue;
    (void)pcbpropertyvaluesize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindDependentDiskResourceDriveLetter(int64_t hcluster, int64_t hresource, void* pszdriveletter, void* pcchdriveletter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindDependentDiskResourceDriveLetter");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hresource, pszdriveletter, pcchdriveletter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)hresource;
    (void)pszdriveletter;
    (void)pcchdriveletter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindDwordProperty(void* ppropertylist, uint32_t cbpropertylistsize, void* pszpropertyname, void* pdwpropertyvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindDwordProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pdwpropertyvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pdwpropertyvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindExpandSzProperty(void* ppropertylist, uint32_t cbpropertylistsize, void* pszpropertyname, void* pszpropertyvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindExpandSzProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindExpandedSzProperty(void* ppropertylist, uint32_t cbpropertylistsize, void* pszpropertyname, void* pszpropertyvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindExpandedSzProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindFileTimeProperty(void* ppropertylist, uint32_t cbpropertylistsize, void* pszpropertyname, void* pftpropertyvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindFileTimeProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pftpropertyvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pftpropertyvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindLongProperty(void* ppropertylist, uint32_t cbpropertylistsize, void* pszpropertyname, void* plpropertyvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindLongProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, plpropertyvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)plpropertyvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindMultiSzProperty(void* ppropertylist, uint32_t cbpropertylistsize, void* pszpropertyname, void* pszpropertyvalue, void* pcbpropertyvaluesize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindMultiSzProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue, pcbpropertyvaluesize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    (void)pcbpropertyvaluesize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindSzProperty(void* ppropertylist, uint32_t cbpropertylistsize, void* pszpropertyname, void* pszpropertyvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindSzProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, pszpropertyvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFindULargeIntegerProperty(void* ppropertylist, uint32_t cbpropertylistsize, void* pszpropertyname, void* plpropertyvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindULargeIntegerProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertylist, cbpropertylistsize, pszpropertyname, plpropertyvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)plpropertyvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilFreeEnvironment(void* lpenvironment) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFreeEnvironment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpenvironment);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpenvironment;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_networking_clustering_ResUtilFreeParameterBlock(void* poutparams, void* pinparams, void* ppropertytable) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFreeParameterBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(poutparams, pinparams, ppropertytable);
        return;
    }
    errno = ENOSYS;
#else
    (void)poutparams;
    (void)pinparams;
    (void)ppropertytable;
    errno = ENOSYS;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetAllProperties(void* hkeyclusterkey, void* ppropertytable, void* poutpropertylist, uint32_t cboutpropertylistsize, void* pcbbytesreturned, void* pcbrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetAllProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize, pcbbytesreturned, pcbrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetBinaryProperty(void* ppboutvalue, void* pcboutvaluesize, void* pvaluestruct, void* pboldvalue, uint32_t cboldvaluesize, void* pppropertylist, void* pcbpropertylistsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetBinaryProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppboutvalue, pcboutvaluesize, pvaluestruct, pboldvalue, cboldvaluesize, pppropertylist, pcbpropertylistsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    (void)pvaluestruct;
    (void)pboldvalue;
    (void)cboldvaluesize;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetBinaryValue(void* hkeyclusterkey, void* pszvaluename, void* ppboutvalue, void* pcboutvaluesize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetBinaryValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename, ppboutvalue, pcboutvaluesize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetClusterGroupType(int64_t hgroup, void* grouptype) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetClusterGroupType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, grouptype);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)grouptype;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetClusterId(int64_t hcluster, void* guid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetClusterId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, guid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)guid;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ResUtilGetClusterRoleState(int64_t hcluster, int32_t eclusterrole) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetClusterRoleState");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, eclusterrole);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)eclusterrole;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResources(int64_t hcluster, void* phclusternameresource, void* phclusteripaddressresource, void* phclusterquorumresource) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetCoreClusterResources");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, phclusternameresource, phclusteripaddressresource, phclusterquorumresource);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)phclusternameresource;
    (void)phclusteripaddressresource;
    (void)phclusterquorumresource;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResourcesEx(int64_t hclusterin, void* phclusternameresourceout, void* phclusterquorumresourceout, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetCoreClusterResourcesEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hclusterin, phclusternameresourceout, phclusterquorumresourceout, dwdesiredaccess);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hclusterin;
    (void)phclusternameresourceout;
    (void)phclusterquorumresourceout;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ResUtilGetCoreGroup(int64_t hcluster) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetCoreGroup");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetDwordProperty(void* pdwoutvalue, void* pvaluestruct, uint32_t dwoldvalue, uint32_t dwminimum, uint32_t dwmaximum, void* pppropertylist, void* pcbpropertylistsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetDwordProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pdwoutvalue, pvaluestruct, dwoldvalue, dwminimum, dwmaximum, pppropertylist, pcbpropertylistsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pdwoutvalue;
    (void)pvaluestruct;
    (void)dwoldvalue;
    (void)dwminimum;
    (void)dwmaximum;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetDwordValue(void* hkeyclusterkey, void* pszvaluename, void* pdwoutvalue, uint32_t dwdefaultvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetDwordValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename, pdwoutvalue, dwdefaultvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pdwoutvalue;
    (void)dwdefaultvalue;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_ResUtilGetEnvironmentWithNetName(int64_t hresource) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetEnvironmentWithNetName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hresource;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetLongProperty(void* ploutvalue, void* pvaluestruct, int32_t loldvalue, int32_t lminimum, int32_t lmaximum, void* pppropertylist, void* pcbpropertylistsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetLongProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ploutvalue, pvaluestruct, loldvalue, lminimum, lmaximum, pppropertylist, pcbpropertylistsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ploutvalue;
    (void)pvaluestruct;
    (void)loldvalue;
    (void)lminimum;
    (void)lmaximum;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetMultiSzProperty(void* ppszoutvalue, void* pcboutvaluesize, void* pvaluestruct, void* pszoldvalue, uint32_t cboldvaluesize, void* pppropertylist, void* pcbpropertylistsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetMultiSzProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppszoutvalue, pcboutvaluesize, pvaluestruct, pszoldvalue, cboldvaluesize, pppropertylist, pcbpropertylistsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppszoutvalue;
    (void)pcboutvaluesize;
    (void)pvaluestruct;
    (void)pszoldvalue;
    (void)cboldvaluesize;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetPrivateProperties(void* hkeyclusterkey, void* poutpropertylist, uint32_t cboutpropertylistsize, void* pcbbytesreturned, void* pcbrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetPrivateProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, poutpropertylist, cboutpropertylistsize, pcbbytesreturned, pcbrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetProperties(void* hkeyclusterkey, void* ppropertytable, void* poutpropertylist, uint32_t cboutpropertylistsize, void* pcbbytesreturned, void* pcbrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize, pcbbytesreturned, pcbrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetPropertiesToParameterBlock(void* hkeyclusterkey, void* ppropertytable, void* poutparams, int32_t bcheckforrequiredproperties, void* psznameofpropinerror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetPropertiesToParameterBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytable, poutparams, bcheckforrequiredproperties, psznameofpropinerror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutparams;
    (void)bcheckforrequiredproperties;
    (void)psznameofpropinerror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetProperty(void* hkeyclusterkey, void* ppropertytableitem, void* poutpropertyitem, void* pcboutpropertyitemsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytableitem, poutpropertyitem, pcboutpropertyitemsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytableitem;
    (void)poutpropertyitem;
    (void)pcboutpropertyitemsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetPropertyFormats(void* ppropertytable, void* poutpropertyformatlist, uint32_t cbpropertyformatlistsize, void* pcbbytesreturned, void* pcbrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetPropertyFormats");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertytable, poutpropertyformatlist, cbpropertyformatlistsize, pcbbytesreturned, pcbrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertytable;
    (void)poutpropertyformatlist;
    (void)cbpropertyformatlistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetPropertySize(void* hkeyclusterkey, void* ppropertytableitem, void* pcboutpropertylistsize, void* pnpropertycount) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetPropertySize");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytableitem, pcboutpropertylistsize, pnpropertycount);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytableitem;
    (void)pcboutpropertylistsize;
    (void)pnpropertycount;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetQwordValue(void* hkeyclusterkey, void* pszvaluename, void* pqwoutvalue, uint64_t qwdefaultvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetQwordValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename, pqwoutvalue, qwdefaultvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pqwoutvalue;
    (void)qwdefaultvalue;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependency(void* hself, void* lpszresourcetype) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hself, lpszresourcetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hself;
    (void)lpszresourcetype;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClass(int64_t hcluster, void* hself, void* prci, int32_t brecurse) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByClass");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hself, prci, brecurse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)hself;
    (void)prci;
    (void)brecurse;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClassEx(int64_t hcluster, void* hself, void* prci, int32_t brecurse, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByClassEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hself, prci, brecurse, dwdesiredaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)hself;
    (void)prci;
    (void)brecurse;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByName(int64_t hcluster, void* hself, void* lpszresourcetype, int32_t brecurse) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hself, lpszresourcetype, brecurse);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszresourcetype;
    (void)brecurse;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByNameEx(int64_t hcluster, void* hself, void* lpszresourcetype, int32_t brecurse, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByNameEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, hself, lpszresourcetype, brecurse, dwdesiredaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszresourcetype;
    (void)brecurse;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyEx(void* hself, void* lpszresourcetype, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hself, lpszresourcetype, dwdesiredaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hself;
    (void)lpszresourcetype;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependentIPAddressProps(int64_t hresource, void* pszaddress, void* pcchaddress, void* pszsubnetmask, void* pcchsubnetmask, void* psznetwork, void* pcchnetwork) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependentIPAddressProps");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, pszaddress, pcchaddress, pszsubnetmask, pcchsubnetmask, psznetwork, pcchnetwork);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)pszaddress;
    (void)pcchaddress;
    (void)pszsubnetmask;
    (void)pcchsubnetmask;
    (void)psznetwork;
    (void)pcchnetwork;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceName(int64_t hresource, void* pszresourcename, void* pcchresourcenameinout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, pszresourcename, pcchresourcenameinout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)pszresourcename;
    (void)pcchresourcenameinout;
    errno = ENOSYS;
    return 0;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependency(void* lpszresourcename, void* lpszresourcetype) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceNameDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszresourcename, lpszresourcetype);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszresourcename;
    (void)lpszresourcetype;
    errno = ENOSYS;
    return -1;
#endif
}

int64_t windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependencyEx(void* lpszresourcename, void* lpszresourcetype, uint32_t dwdesiredaccess) {
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceNameDependencyEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszresourcename, lpszresourcetype, dwdesiredaccess);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwdesiredaccess;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGetSzProperty(void* ppszoutvalue, void* pvaluestruct, void* pszoldvalue, void* pppropertylist, void* pcbpropertylistsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetSzProperty");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppszoutvalue, pvaluestruct, pszoldvalue, pppropertylist, pcbpropertylistsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppszoutvalue;
    (void)pvaluestruct;
    (void)pszoldvalue;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_networking_clustering_ResUtilGetSzValue(void* hkeyclusterkey, void* pszvaluename) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetSzValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename);
    }
    errno = ENOSYS;
    return NULL;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    errno = ENOSYS;
    return NULL;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilGroupsEqual(int64_t hself, int64_t hgroup, void* pequal) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGroupsEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hself, hgroup, pequal);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hself;
    (void)hgroup;
    (void)pequal;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ResUtilIsPathValid(void* pszpath) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilIsPathValid");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszpath);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszpath;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ResUtilIsResourceClassEqual(void* prci, int64_t hresource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilIsResourceClassEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(prci, hresource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)prci;
    (void)hresource;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ResUtilLeftPaxosIsLessThanRight(void* left, void* right) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilLeftPaxosIsLessThanRight");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(left, right);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)left;
    (void)right;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilNodeEnum(int64_t hcluster, void* pnodecallback, void* pparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilNodeEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, pnodecallback, pparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)pnodecallback;
    (void)pparameter;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ResUtilPaxosComparer(void* left, void* right) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilPaxosComparer");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(left, right);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)left;
    (void)right;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilPropertyListFromParameterBlock(void* ppropertytable, void* poutpropertylist, void* pcboutpropertylistsize, void* pinparams, void* pcbbytesreturned, void* pcbrequired) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilPropertyListFromParameterBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertytable, poutpropertylist, pcboutpropertylistsize, pinparams, pcbbytesreturned, pcbrequired);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)pcboutpropertylistsize;
    (void)pinparams;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilRemoveResourceServiceEnvironment(void* pszservicename, void* pfnlogevent, int64_t hresourcehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilRemoveResourceServiceEnvironment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszservicename, pfnlogevent, hresourcehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszservicename;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilResourceDepEnum(int64_t hself, uint32_t enumtype, void* prescallback, void* pparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilResourceDepEnum");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hself, enumtype, prescallback, pparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hself;
    (void)enumtype;
    (void)prescallback;
    (void)pparameter;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ResUtilResourceTypesEqual(void* lpszresourcetypename, int64_t hresource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilResourceTypesEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszresourcetypename, hresource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpszresourcetypename;
    (void)hresource;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_networking_clustering_ResUtilResourcesEqual(int64_t hself, int64_t hresource) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilResourcesEqual");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hself, hresource);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)hself;
    (void)hresource;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetBinaryValue(void* hkeyclusterkey, void* pszvaluename, void* pbnewvalue, uint32_t cbnewvaluesize, void* ppboutvalue, void* pcboutvaluesize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetBinaryValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename, pbnewvalue, cbnewvaluesize, ppboutvalue, pcboutvaluesize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pbnewvalue;
    (void)cbnewvaluesize;
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetDwordValue(void* hkeyclusterkey, void* pszvaluename, uint32_t dwnewvalue, void* pdwoutvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetDwordValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename, dwnewvalue, pdwoutvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)dwnewvalue;
    (void)pdwoutvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetExpandSzValue(void* hkeyclusterkey, void* pszvaluename, void* psznewvalue, void* ppszoutstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetExpandSzValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)ppszoutstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetMultiSzValue(void* hkeyclusterkey, void* pszvaluename, void* psznewvalue, uint32_t cbnewvaluesize, void* ppszoutvalue, void* pcboutvaluesize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetMultiSzValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename, psznewvalue, cbnewvaluesize, ppszoutvalue, pcboutvaluesize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)cbnewvaluesize;
    (void)ppszoutvalue;
    (void)pcboutvaluesize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetPrivatePropertyList(void* hkeyclusterkey, void* pinpropertylist, uint32_t cbinpropertylistsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPrivatePropertyList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pinpropertylist, cbinpropertylistsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlock(void* hkeyclusterkey, void* ppropertytable, void* reserved, void* pinparams, void* pinpropertylist, uint32_t cbinpropertylistsize, void* poutparams) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPropertyParameterBlock");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize, poutparams);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)pinparams;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlockEx(void* hkeyclusterkey, void* ppropertytable, void* reserved, void* pinparams, void* pinpropertylist, uint32_t cbinpropertylistsize, int32_t bforcewrite, void* poutparams) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPropertyParameterBlockEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize, bforcewrite, poutparams);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)pinparams;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)bforcewrite;
    (void)poutparams;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTable(void* hkeyclusterkey, void* ppropertytable, void* reserved, int32_t ballowunknownproperties, void* pinpropertylist, uint32_t cbinpropertylistsize, void* poutparams) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPropertyTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize, poutparams);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTableEx(void* hkeyclusterkey, void* ppropertytable, void* reserved, int32_t ballowunknownproperties, void* pinpropertylist, uint32_t cbinpropertylistsize, int32_t bforcewrite, void* poutparams) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPropertyTableEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize, bforcewrite, poutparams);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)bforcewrite;
    (void)poutparams;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetQwordValue(void* hkeyclusterkey, void* pszvaluename, uint64_t qwnewvalue, void* pqwoutvalue) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetQwordValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename, qwnewvalue, pqwoutvalue);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)qwnewvalue;
    (void)pqwoutvalue;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceEnvironment(void* pszservicename, int64_t hresource, void* pfnlogevent, int64_t hresourcehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetResourceServiceEnvironment");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszservicename, hresource, pfnlogevent, hresourcehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszservicename;
    (void)hresource;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParameters(void* pszservicename, void* schscmhandle, void* phservice, void* pfnlogevent, int64_t hresourcehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetResourceServiceStartParameters");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszservicename, schscmhandle, phservice, pfnlogevent, hresourcehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszservicename;
    (void)schscmhandle;
    (void)phservice;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParametersEx(void* pszservicename, void* schscmhandle, void* phservice, uint32_t dwdesiredaccess, void* pfnlogevent, int64_t hresourcehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetResourceServiceStartParametersEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszservicename, schscmhandle, phservice, dwdesiredaccess, pfnlogevent, hresourcehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszservicename;
    (void)schscmhandle;
    (void)phservice;
    (void)dwdesiredaccess;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetSzValue(void* hkeyclusterkey, void* pszvaluename, void* psznewvalue, void* ppszoutstring) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetSzValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)ppszoutstring;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetUnknownProperties(void* hkeyclusterkey, void* ppropertytable, void* pinpropertylist, uint32_t cbinpropertylistsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetUnknownProperties");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, ppropertytable, pinpropertylist, cbinpropertylistsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilSetValueEx(void* hkeyclusterkey, void* valuename, uint32_t valuetype, void* valuedata, uint32_t valuesize, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetValueEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyclusterkey, valuename, valuetype, valuedata, valuesize, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyclusterkey;
    (void)valuename;
    (void)valuetype;
    (void)valuedata;
    (void)valuesize;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilStartResourceService(void* pszservicename, void* phservicehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilStartResourceService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszservicename, phservicehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszservicename;
    (void)phservicehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilStopResourceService(void* pszservicename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilStopResourceService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszservicename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszservicename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilStopService(void* hservicehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilStopService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservicehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hservicehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilTerminateServiceProcessFromResDll(uint32_t dwservicepid, int32_t boffline, void* pdwresourcestate, void* pfnlogevent, int64_t hresourcehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilTerminateServiceProcessFromResDll");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(dwservicepid, boffline, pdwresourcestate, pfnlogevent, hresourcehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)dwservicepid;
    (void)boffline;
    (void)pdwresourcestate;
    (void)pfnlogevent;
    (void)hresourcehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilVerifyPrivatePropertyList(void* pinpropertylist, uint32_t cbinpropertylistsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyPrivatePropertyList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pinpropertylist, cbinpropertylistsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilVerifyPropertyTable(void* ppropertytable, void* reserved, int32_t ballowunknownproperties, void* pinpropertylist, uint32_t cbinpropertylistsize, void* poutparams) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyPropertyTable");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize, poutparams);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilVerifyResourceService(void* pszservicename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyResourceService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszservicename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pszservicename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilVerifyService(void* hservicehandle) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hservicehandle);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hservicehandle;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilVerifyShutdownSafe(uint32_t flags, uint32_t reason, void* presult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyShutdownSafe");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, reason, presult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)reason;
    (void)presult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResUtilsDeleteKeyTree(void* key, void* keyname, int32_t treatnokeyaserror) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilsDeleteKeyTree");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(key, keyname, treatnokeyaserror);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)key;
    (void)keyname;
    (void)treatnokeyaserror;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResetAllAppInstanceVersions(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetAllAppInstanceVersions");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return 0;
#else
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RestartClusterResource(int64_t hresource, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestartClusterResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RestartClusterResourceEx(int64_t hresource, uint32_t dwflags, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestartClusterResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, dwflags, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)dwflags;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_RestoreClusterDatabase(void* lpszpathname, int32_t bforce, void* lpszquorumdriveletter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreClusterDatabase");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszpathname, bforce, lpszquorumdriveletter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszpathname;
    (void)bforce;
    (void)lpszquorumdriveletter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResumeClusterNode(int64_t hnode) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeClusterNode");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx(int64_t hnode, int32_t eresumefailbacktype, uint32_t dwresumeflagsreserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeClusterNodeEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, eresumefailbacktype, dwresumeflagsreserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    (void)eresumefailbacktype;
    (void)dwresumeflagsreserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx2(int64_t hnode, int32_t eresumefailbacktype, uint32_t dwresumeflagsreserved, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeClusterNodeEx2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnode, eresumefailbacktype, dwresumeflagsreserved, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnode;
    (void)eresumefailbacktype;
    (void)dwresumeflagsreserved;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetAppInstanceCsvFlags(void* processhandle, uint32_t mask, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAppInstanceCsvFlags");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processhandle, mask, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processhandle;
    (void)mask;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterGroupName(int64_t hgroup, void* lpszgroupname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpszgroupname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)lpszgroupname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterGroupNameEx(int64_t hgroup, void* lpszgroupname, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupNameEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpszgroupname, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)lpszgroupname;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterGroupNodeList(int64_t hgroup, uint32_t nodecount, void* nodelist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupNodeList");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, nodecount, nodelist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)nodecount;
    (void)nodelist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterGroupNodeListEx(int64_t hgroup, uint32_t nodecount, void* nodelist, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupNodeListEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, nodecount, nodelist, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)nodecount;
    (void)nodelist;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpression(int64_t hgroupset, void* lpszdependencyexprssion) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupSetDependencyExpression");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, lpszdependencyexprssion);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)lpszdependencyexprssion;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpressionEx(int64_t hgroupset, void* lpszdependencyexpression, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupSetDependencyExpressionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroupset, lpszdependencyexpression, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroupset;
    (void)lpszdependencyexpression;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterName(int64_t hcluster, void* lpsznewclustername) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznewclustername);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpsznewclustername;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterNameEx(int64_t hcluster, void* lpsznewclustername, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterNameEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, lpsznewclustername, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)lpsznewclustername;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterNetworkName(int64_t hnetwork, void* lpszname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterNetworkName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork, lpszname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetwork;
    (void)lpszname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterNetworkNameEx(int64_t hnetwork, void* lpszname, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterNetworkNameEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hnetwork, lpszname, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hnetwork;
    (void)lpszname;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterNetworkPriorityOrder(int64_t hcluster, uint32_t networkcount, void* networklist) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterNetworkPriorityOrder");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hcluster, networkcount, networklist);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hcluster;
    (void)networkcount;
    (void)networklist;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterQuorumResource(int64_t hresource, void* lpszdevicename, uint32_t dwmaxquologsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterQuorumResource");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpszdevicename, dwmaxquologsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)lpszdevicename;
    (void)dwmaxquologsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterQuorumResourceEx(int64_t hresource, void* lpszdevicename, uint32_t dwmaxquorumlogsize, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterQuorumResourceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpszdevicename, dwmaxquorumlogsize, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)lpszdevicename;
    (void)dwmaxquorumlogsize;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterResourceDependencyExpression(int64_t hresource, void* lpszdependencyexpression) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterResourceDependencyExpression");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpszdependencyexpression);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)lpszdependencyexpression;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterResourceName(int64_t hresource, void* lpszresourcename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterResourceName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpszresourcename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)lpszresourcename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterResourceNameEx(int64_t hresource, void* lpszresourcename, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterResourceNameEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hresource, lpszresourcename, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hresource;
    (void)lpszresourcename;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetClusterServiceAccountPassword(void* lpszclustername, void* lpsznewpassword, uint32_t dwflags, void* lpreturnstatusbuffer, void* lpcbreturnstatusbuffersize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterServiceAccountPassword");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpszclustername, lpsznewpassword, dwflags, lpreturnstatusbuffer, lpcbreturnstatusbuffersize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpszclustername;
    (void)lpsznewpassword;
    (void)dwflags;
    (void)lpreturnstatusbuffer;
    (void)lpcbreturnstatusbuffersize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetGroupDependencyExpression(int64_t hgroup, void* lpszdependencyexpression) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGroupDependencyExpression");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpszdependencyexpression);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)lpszdependencyexpression;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_networking_clustering_SetGroupDependencyExpressionEx(int64_t hgroup, void* lpszdependencyexpression, void* lpszreason) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGroupDependencyExpressionEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hgroup, lpszdependencyexpression, lpszreason);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hgroup;
    (void)lpszdependencyexpression;
    (void)lpszreason;
    errno = ENOSYS;
    return 0;
#endif
}

