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

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterGroupDependency(JNIEnv* km_env, jclass km_clazz, jlong hdependentgroup, jlong hprovidergroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdependentgroup, (int64_t)hprovidergroup) : 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroup;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterGroupDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong hdependentgroup, jlong hprovidergroup, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupDependencyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdependentgroup, (int64_t)hprovidergroup, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroup;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterGroupSetDependency(JNIEnv* km_env, jclass km_clazz, jlong hdependentgroupset, jlong hprovidergroupset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupSetDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdependentgroupset, (int64_t)hprovidergroupset) : 0;
#else
    (void)hdependentgroupset;
    (void)hprovidergroupset;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterGroupSetDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong hdependentgroupset, jlong hprovidergroupset, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupSetDependencyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdependentgroupset, (int64_t)hprovidergroupset, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hdependentgroupset;
    (void)hprovidergroupset;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterGroupToGroupSetDependency(JNIEnv* km_env, jclass km_clazz, jlong hdependentgroup, jlong hprovidergroupset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupToGroupSetDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdependentgroup, (int64_t)hprovidergroupset) : 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroupset;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterGroupToGroupSetDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong hdependentgroup, jlong hprovidergroupset, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterGroupToGroupSetDependencyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdependentgroup, (int64_t)hprovidergroupset, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hdependentgroup;
    (void)hprovidergroupset;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterNode(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznodename, jlong pfnprogresscallback, jlong pvcallbackarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterNode");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznodename, (void*)(uintptr_t)pfnprogresscallback, (void*)(uintptr_t)pvcallbackarg) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterNodeEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznodename, jint dwflags, jlong pfnprogresscallback, jlong pvcallbackarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterNodeEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznodename, (uint32_t)dwflags, (void*)(uintptr_t)pfnprogresscallback, (void*)(uintptr_t)pvcallbackarg) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)dwflags;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterResourceDependency(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hdependson) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterResourceDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hdependson) : 0;
#else
    (void)hresource;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterResourceDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hdependson, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterResourceDependencyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hdependson, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterResourceNode(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterResourceNode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hnode) : 0;
#else
    (void)hresource;
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterResourceNodeEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hnode, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterResourceNodeEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hnode, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)hnode;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddClusterStorageNode(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznodename, jlong pfnprogresscallback, jlong pvcallbackarg, jlong lpszclusterstoragenodedescription, jlong lpszclusterstoragenodelocation) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddClusterStorageNode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznodename, (void*)(uintptr_t)pfnprogresscallback, (void*)(uintptr_t)pvcallbackarg, (void*)(uintptr_t)lpszclusterstoragenodedescription, (void*)(uintptr_t)lpszclusterstoragenodelocation) : 0;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    (void)lpszclusterstoragenodedescription;
    (void)lpszclusterstoragenodelocation;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddCrossClusterGroupSetDependency(JNIEnv* km_env, jclass km_clazz, jlong hdependentgroupset, jlong lpremoteclustername, jlong lpremotegroupsetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddCrossClusterGroupSetDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdependentgroupset, (void*)(uintptr_t)lpremoteclustername, (void*)(uintptr_t)lpremotegroupsetname) : 0;
#else
    (void)hdependentgroupset;
    (void)lpremoteclustername;
    (void)lpremotegroupsetname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1AddResourceToClusterSharedVolumes(JNIEnv* km_env, jclass km_clazz, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddResourceToClusterSharedVolumes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1BackupClusterDatabase(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszpathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "BackupClusterDatabase");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszpathname) : 0;
#else
    (void)hcluster;
    (void)lpszpathname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CanResourceBeDependent(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hresourcedependent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CanResourceBeDependent");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hresourcedependent) : -1;
#else
    (void)hresource;
    (void)hresourcedependent;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CancelClusterGroupOperation(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint dwcancelflags_reserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CancelClusterGroupOperation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (uint32_t)dwcancelflags_reserved) : 0;
#else
    (void)hgroup;
    (void)dwcancelflags_reserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ChangeClusterResourceGroup(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeClusterResourceGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hgroup) : 0;
#else
    (void)hresource;
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ChangeClusterResourceGroupEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hgroup, jlong flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeClusterResourceGroupEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hgroup, (uint64_t)flags) : 0;
#else
    (void)hresource;
    (void)hgroup;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ChangeClusterResourceGroupEx2(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hgroup, jlong flags, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ChangeClusterResourceGroupEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hgroup, (uint64_t)flags, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)hgroup;
    (void)flags;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CloseCluster(JNIEnv* km_env, jclass km_clazz, jlong hcluster) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseCluster");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster) : -1;
#else
    (void)hcluster;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CloseClusterCryptProvider(JNIEnv* km_env, jclass km_clazz, jlong hcluscryptprovider) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterCryptProvider");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluscryptprovider) : 0;
#else
    (void)hcluscryptprovider;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CloseClusterGroup(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterGroup");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup) : -1;
#else
    (void)hgroup;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CloseClusterGroupSet(JNIEnv* km_env, jclass km_clazz, jlong hgroupset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterGroupSet");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset) : -1;
#else
    (void)hgroupset;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CloseClusterNetInterface(JNIEnv* km_env, jclass km_clazz, jlong hnetinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterNetInterface");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetinterface) : -1;
#else
    (void)hnetinterface;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CloseClusterNetwork(JNIEnv* km_env, jclass km_clazz, jlong hnetwork) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterNetwork");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork) : -1;
#else
    (void)hnetwork;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CloseClusterNode(JNIEnv* km_env, jclass km_clazz, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterNode");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode) : -1;
#else
    (void)hnode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CloseClusterNotifyPort(JNIEnv* km_env, jclass km_clazz, jlong hchange) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterNotifyPort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hchange) : -1;
#else
    (void)hchange;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CloseClusterResource(JNIEnv* km_env, jclass km_clazz, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CloseClusterResource");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource) : -1;
#else
    (void)hresource;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusAddClusterHealthFault(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong failure, jint param2) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusAddClusterHealthFault");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)failure, (uint32_t)param2) : 0;
#else
    (void)hcluster;
    (void)failure;
    (void)param2;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusGetClusterHealthFaults(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong objects, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusGetClusterHealthFaults");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)objects, (uint32_t)flags) : 0;
#else
    (void)hcluster;
    (void)objects;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusRemoveClusterHealthFault(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong id, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusRemoveClusterHealthFault");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)id, (uint32_t)flags) : 0;
#else
    (void)hcluster;
    (void)id;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusWorkerCheckTerminate(JNIEnv* km_env, jclass km_clazz, jlong lpworker) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkerCheckTerminate");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpworker) : -1;
#else
    (void)lpworker;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusWorkerCreate(JNIEnv* km_env, jclass km_clazz, jlong lpworker, jlong lpstartaddress, jlong lpparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkerCreate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpworker, (void*)(uintptr_t)lpstartaddress, (void*)(uintptr_t)lpparameter) : 0;
#else
    (void)lpworker;
    (void)lpstartaddress;
    (void)lpparameter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusWorkerTerminate(JNIEnv* km_env, jclass km_clazz, jlong lpworker) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkerTerminate");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)lpworker);
#else
    (void)lpworker;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusWorkerTerminateEx(JNIEnv* km_env, jclass km_clazz, jlong clusworker, jint timeoutinmilliseconds, jint waitonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkerTerminateEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clusworker, (uint32_t)timeoutinmilliseconds, (int32_t)waitonly) : 0;
#else
    (void)clusworker;
    (void)timeoutinmilliseconds;
    (void)waitonly;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusWorkersTerminate(JNIEnv* km_env, jclass km_clazz, jlong clusworkers, jlong clusworkerscount, jint timeoutinmilliseconds, jint waitonly) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint32_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusWorkersTerminate");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clusworkers, (uint64_t)clusworkerscount, (uint32_t)timeoutinmilliseconds, (int32_t)waitonly) : 0;
#else
    (void)clusworkers;
    (void)clusworkerscount;
    (void)timeoutinmilliseconds;
    (void)waitonly;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusapiSetReasonHandler(JNIEnv* km_env, jclass km_clazz, jlong lphandler) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusapiSetReasonHandler");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lphandler) : NULL;
#else
    (void)lphandler;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterAddGroupToAffinityRule(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong rulename, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAddGroupToAffinityRule");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)rulename, (int64_t)hgroup) : 0;
#else
    (void)hcluster;
    (void)rulename;
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterAddGroupToGroupSet(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAddGroupToGroupSet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (int64_t)hgroup) : 0;
#else
    (void)hgroupset;
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterAddGroupToGroupSetWithDomains(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong hgroup, jint faultdomain, jint updatedomain) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAddGroupToGroupSetWithDomains");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (int64_t)hgroup, (uint32_t)faultdomain, (uint32_t)updatedomain) : 0;
#else
    (void)hgroupset;
    (void)hgroup;
    (void)faultdomain;
    (void)updatedomain;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterAddGroupToGroupSetWithDomainsEx(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong hgroup, jint faultdomain, jint updatedomain, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAddGroupToGroupSetWithDomainsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (int64_t)hgroup, (uint32_t)faultdomain, (uint32_t)updatedomain, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroupset;
    (void)hgroup;
    (void)faultdomain;
    (void)updatedomain;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterAffinityRuleControl(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong affinityrulename, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint cbinbuffersize, jlong lpoutbuffer, jint cboutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterAffinityRuleControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)affinityrulename, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)cboutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterClearBackupStateForSharedVolume(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumepathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterClearBackupStateForSharedVolume");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumepathname) : 0;
#else
    (void)lpszvolumepathname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong henum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterCloseEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hclusterenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterCloseEnumEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hclusterenum) : 0;
#else
    (void)hclusterenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterControl(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
#else
    (void)hcluster;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterControlEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterControlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterCreateAffinityRule(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong rulename, jint ruletype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterCreateAffinityRule");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)rulename, (int32_t)ruletype) : 0;
#else
    (void)hcluster;
    (void)rulename;
    (void)ruletype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterDecrypt(JNIEnv* km_env, jclass km_clazz, jlong hcluscryptprovider, jlong pcryptinput, jint cbcryptinput, jlong ppcryptoutput, jlong pcbcryptoutput) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterDecrypt");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluscryptprovider, (void*)(uintptr_t)pcryptinput, (uint32_t)cbcryptinput, (void*)(uintptr_t)ppcryptoutput, (void*)(uintptr_t)pcbcryptoutput) : 0;
#else
    (void)hcluscryptprovider;
    (void)pcryptinput;
    (void)cbcryptinput;
    (void)ppcryptoutput;
    (void)pcbcryptoutput;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterEncrypt(JNIEnv* km_env, jclass km_clazz, jlong hcluscryptprovider, jlong pdata, jint cbdata, jlong ppdata, jlong pcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterEncrypt");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluscryptprovider, (void*)(uintptr_t)pdata, (uint32_t)cbdata, (void*)(uintptr_t)ppdata, (void*)(uintptr_t)pcbdata) : 0;
#else
    (void)hcluscryptprovider;
    (void)pdata;
    (void)cbdata;
    (void)ppdata;
    (void)pcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterEnum(JNIEnv* km_env, jclass km_clazz, jlong henum, jint dwindex, jlong lpdwtype, jlong lpszname, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)henum, (uint32_t)dwindex, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)henum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hclusterenum, jint dwindex, jlong pitem, jlong cbitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterEnumEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hclusterenum, (uint32_t)dwindex, (void*)(uintptr_t)pitem, (void*)(uintptr_t)cbitem) : 0;
#else
    (void)hclusterenum;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGetEnumCount(JNIEnv* km_env, jclass km_clazz, jlong henum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGetEnumCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)henum) : 0;
#else
    (void)henum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGetEnumCountEx(JNIEnv* km_env, jclass km_clazz, jlong hclusterenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGetEnumCountEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hclusterenum) : 0;
#else
    (void)hclusterenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGetVolumeNameForVolumeMountPoint(JNIEnv* km_env, jclass km_clazz, jlong lpszvolumemountpoint, jlong lpszvolumename, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGetVolumeNameForVolumeMountPoint");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszvolumemountpoint, (void*)(uintptr_t)lpszvolumename, (uint32_t)cchbufferlength) : -1;
#else
    (void)lpszvolumemountpoint;
    (void)lpszvolumename;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGetVolumePathName(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong lpszvolumepathname, jint cchbufferlength) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGetVolumePathName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)lpszvolumepathname, (uint32_t)cchbufferlength) : -1;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)cchbufferlength;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong hgroupenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupenum) : 0;
#else
    (void)hgroupenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupCloseEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hgroupenumex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupCloseEnumEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupenumex) : 0;
#else
    (void)hgroupenumex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupControl(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
#else
    (void)hgroup;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupControlEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupControlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupEnum(JNIEnv* km_env, jclass km_clazz, jlong hgroupenum, jint dwindex, jlong lpdwtype, jlong lpszresourcename, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupenum, (uint32_t)dwindex, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)lpszresourcename, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)hgroupenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszresourcename;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hgroupenumex, jint dwindex, jlong pitem, jlong cbitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupEnumEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupenumex, (uint32_t)dwindex, (void*)(uintptr_t)pitem, (void*)(uintptr_t)cbitem) : 0;
#else
    (void)hgroupenumex;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupGetEnumCount(JNIEnv* km_env, jclass km_clazz, jlong hgroupenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupGetEnumCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupenum) : 0;
#else
    (void)hgroupenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupGetEnumCountEx(JNIEnv* km_env, jclass km_clazz, jlong hgroupenumex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupGetEnumCountEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupenumex) : 0;
#else
    (void)hgroupenumex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupOpenEnum(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupOpenEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (uint32_t)dwtype) : -1;
#else
    (void)hgroup;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupOpenEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszproperties, jint cbproperties, jlong lpszroproperties, jint cbroproperties, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupOpenEnumEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszproperties, (uint32_t)cbproperties, (void*)(uintptr_t)lpszroproperties, (uint32_t)cbroproperties, (uint32_t)dwflags) : -1;
#else
    (void)hcluster;
    (void)lpszproperties;
    (void)cbproperties;
    (void)lpszroproperties;
    (void)cbroproperties;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupSetCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong hgroupsetenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupsetenum) : 0;
#else
    (void)hgroupsetenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupSetControl(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint cbinbuffersize, jlong lpoutbuffer, jint cboutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)cboutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
#else
    (void)hgroupset;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupSetControlEx(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint cbinbuffersize, jlong lpoutbuffer, jint cboutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetControlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)cboutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupSetEnum(JNIEnv* km_env, jclass km_clazz, jlong hgroupsetenum, jint dwindex, jlong lpszname, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupsetenum, (uint32_t)dwindex, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)hgroupsetenum;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupSetGetEnumCount(JNIEnv* km_env, jclass km_clazz, jlong hgroupsetenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetGetEnumCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupsetenum) : 0;
#else
    (void)hgroupsetenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterGroupSetOpenEnum(JNIEnv* km_env, jclass km_clazz, jlong hcluster) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterGroupSetOpenEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster) : -1;
#else
    (void)hcluster;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterIsPathOnSharedVolume(JNIEnv* km_env, jclass km_clazz, jlong lpszpathname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterIsPathOnSharedVolume");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszpathname) : -1;
#else
    (void)lpszpathname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetInterfaceCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong hnetinterfaceenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetinterfaceenum) : 0;
#else
    (void)hnetinterfaceenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetInterfaceControl(JNIEnv* km_env, jclass km_clazz, jlong hnetinterface, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetinterface, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
#else
    (void)hnetinterface;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetInterfaceControlEx(JNIEnv* km_env, jclass km_clazz, jlong hnetinterface, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceControlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetinterface, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetInterfaceEnum(JNIEnv* km_env, jclass km_clazz, jlong hnetinterfaceenum, jint dwindex, jlong lpszname, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetinterfaceenum, (uint32_t)dwindex, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)hnetinterfaceenum;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetInterfaceOpenEnum(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznodename, jlong lpsznetworkname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetInterfaceOpenEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznodename, (void*)(uintptr_t)lpsznetworkname) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)lpsznetworkname;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetworkCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong hnetworkenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetworkenum) : 0;
#else
    (void)hnetworkenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetworkControl(JNIEnv* km_env, jclass km_clazz, jlong hnetwork, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
#else
    (void)hnetwork;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetworkControlEx(JNIEnv* km_env, jclass km_clazz, jlong hnetwork, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkControlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetworkEnum(JNIEnv* km_env, jclass km_clazz, jlong hnetworkenum, jint dwindex, jlong lpdwtype, jlong lpszname, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetworkenum, (uint32_t)dwindex, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)hnetworkenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetworkGetEnumCount(JNIEnv* km_env, jclass km_clazz, jlong hnetworkenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkGetEnumCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetworkenum) : 0;
#else
    (void)hnetworkenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNetworkOpenEnum(JNIEnv* km_env, jclass km_clazz, jlong hnetwork, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNetworkOpenEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork, (uint32_t)dwtype) : -1;
#else
    (void)hnetwork;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong hnodeenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnodeenum) : 0;
#else
    (void)hnodeenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeCloseEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hnodeenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeCloseEnumEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnodeenum) : 0;
#else
    (void)hnodeenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeControl(JNIEnv* km_env, jclass km_clazz, jlong hnode, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
#else
    (void)hnode;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)ninbuffersize;
    (void)lpoutbuffer;
    (void)noutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeControlEx(JNIEnv* km_env, jclass km_clazz, jlong hnode, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeControlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeEnum(JNIEnv* km_env, jclass km_clazz, jlong hnodeenum, jint dwindex, jlong lpdwtype, jlong lpszname, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnodeenum, (uint32_t)dwindex, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)hnodeenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hnodeenum, jint dwindex, jlong pitem, jlong cbitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeEnumEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnodeenum, (uint32_t)dwindex, (void*)(uintptr_t)pitem, (void*)(uintptr_t)cbitem) : 0;
#else
    (void)hnodeenum;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeGetEnumCount(JNIEnv* km_env, jclass km_clazz, jlong hnodeenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeGetEnumCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnodeenum) : 0;
#else
    (void)hnodeenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeGetEnumCountEx(JNIEnv* km_env, jclass km_clazz, jlong hnodeenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeGetEnumCountEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnodeenum) : 0;
#else
    (void)hnodeenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeOpenEnum(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeOpenEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (uint32_t)dwtype) : -1;
#else
    (void)hnode;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeOpenEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint dwtype, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeOpenEnumEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (uint32_t)dwtype, (void*)(uintptr_t)poptions) : -1;
#else
    (void)hnode;
    (void)dwtype;
    (void)poptions;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterNodeReplacement(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznodenamecurrent, jlong lpsznodenamenew) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterNodeReplacement");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznodenamecurrent, (void*)(uintptr_t)lpsznodenamenew) : 0;
#else
    (void)hcluster;
    (void)lpsznodenamecurrent;
    (void)lpsznodenamenew;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterOpenEnum(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterOpenEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (uint32_t)dwtype) : -1;
#else
    (void)hcluster;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterOpenEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jint dwtype, jlong poptions) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterOpenEnumEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (uint32_t)dwtype, (void*)(uintptr_t)poptions) : -1;
#else
    (void)hcluster;
    (void)dwtype;
    (void)poptions;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterPrepareSharedVolumeForBackup(JNIEnv* km_env, jclass km_clazz, jlong lpszfilename, jlong lpszvolumepathname, jlong lpcchvolumepathname, jlong lpszvolumename, jlong lpcchvolumename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterPrepareSharedVolumeForBackup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszfilename, (void*)(uintptr_t)lpszvolumepathname, (void*)(uintptr_t)lpcchvolumepathname, (void*)(uintptr_t)lpszvolumename, (void*)(uintptr_t)lpcchvolumename) : 0;
#else
    (void)lpszfilename;
    (void)lpszvolumepathname;
    (void)lpcchvolumepathname;
    (void)lpszvolumename;
    (void)lpcchvolumename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegBatchAddCommand(JNIEnv* km_env, jclass km_clazz, jlong hregbatch, jint dwcommand, jlong wzname, jint dwoptions, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegBatchAddCommand");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hregbatch, (int32_t)dwcommand, (void*)(uintptr_t)wzname, (uint32_t)dwoptions, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : -1;
#else
    (void)hregbatch;
    (void)dwcommand;
    (void)wzname;
    (void)dwoptions;
    (void)lpdata;
    (void)cbdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegBatchCloseNotification(JNIEnv* km_env, jclass km_clazz, jlong hbatchnotification) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegBatchCloseNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbatchnotification) : -1;
#else
    (void)hbatchnotification;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegBatchReadCommand(JNIEnv* km_env, jclass km_clazz, jlong hbatchnotification, jlong pbatchcommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegBatchReadCommand");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbatchnotification, (void*)(uintptr_t)pbatchcommand) : -1;
#else
    (void)hbatchnotification;
    (void)pbatchcommand;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCloseBatch(JNIEnv* km_env, jclass km_clazz, jlong hregbatch, jint bcommit, jlong failedcommandnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseBatch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hregbatch, (int32_t)bcommit, (void*)(uintptr_t)failedcommandnumber) : -1;
#else
    (void)hregbatch;
    (void)bcommit;
    (void)failedcommandnumber;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCloseBatchEx(JNIEnv* km_env, jclass km_clazz, jlong hregbatch, jint flags, jlong failedcommandnumber) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseBatchEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hregbatch, (uint32_t)flags, (void*)(uintptr_t)failedcommandnumber) : -1;
#else
    (void)hregbatch;
    (void)flags;
    (void)failedcommandnumber;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCloseBatchNotifyPort(JNIEnv* km_env, jclass km_clazz, jlong hbatchnotifyport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseBatchNotifyPort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbatchnotifyport) : -1;
#else
    (void)hbatchnotifyport;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCloseKey(JNIEnv* km_env, jclass km_clazz, jlong hkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey) : -1;
#else
    (void)hkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCloseReadBatch(JNIEnv* km_env, jclass km_clazz, jlong hregreadbatch, jlong phregreadbatchreply) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseReadBatch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hregreadbatch, (void*)(uintptr_t)phregreadbatchreply) : -1;
#else
    (void)hregreadbatch;
    (void)phregreadbatchreply;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCloseReadBatchEx(JNIEnv* km_env, jclass km_clazz, jlong hregreadbatch, jint flags, jlong phregreadbatchreply) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseReadBatchEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hregreadbatch, (uint32_t)flags, (void*)(uintptr_t)phregreadbatchreply) : -1;
#else
    (void)hregreadbatch;
    (void)flags;
    (void)phregreadbatchreply;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCloseReadBatchReply(JNIEnv* km_env, jclass km_clazz, jlong hregreadbatchreply) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCloseReadBatchReply");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hregreadbatchreply) : -1;
#else
    (void)hregreadbatchreply;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCreateBatch(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong phregbatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateBatch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)phregbatch) : -1;
#else
    (void)hkey;
    (void)phregbatch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCreateBatchNotifyPort(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong phbatchnotifyport) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateBatchNotifyPort");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)phbatchnotifyport) : -1;
#else
    (void)hkey;
    (void)phbatchnotifyport;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCreateKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpszsubkey, jint dwoptions, jint samdesired, jlong lpsecurityattributes, jlong phkresult, jlong lpdwdisposition) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpszsubkey, (uint32_t)dwoptions, (uint32_t)samdesired, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)lpdwdisposition) : -1;
#else
    (void)hkey;
    (void)lpszsubkey;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCreateKeyEx(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jint dwoptions, jint samdesired, jlong lpsecurityattributes, jlong phkresult, jlong lpdwdisposition, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateKeyEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (uint32_t)dwoptions, (uint32_t)samdesired, (void*)(uintptr_t)lpsecurityattributes, (void*)(uintptr_t)phkresult, (void*)(uintptr_t)lpdwdisposition, (void*)(uintptr_t)lpszreason) : -1;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)lpszreason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegCreateReadBatch(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong phregreadbatch) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegCreateReadBatch");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)phregreadbatch) : -1;
#else
    (void)hkey;
    (void)phregreadbatch;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegDeleteKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpszsubkey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegDeleteKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpszsubkey) : -1;
#else
    (void)hkey;
    (void)lpszsubkey;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegDeleteKeyEx(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpsubkey, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegDeleteKeyEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpsubkey, (void*)(uintptr_t)lpszreason) : -1;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpszreason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegDeleteValue(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpszvaluename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegDeleteValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpszvaluename) : 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegDeleteValueEx(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpszvaluename, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegDeleteValueEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpszvaluename, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegEnumKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong lpszname, jlong lpcchname, jlong lpftlastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegEnumKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname, (void*)(uintptr_t)lpftlastwritetime) : -1;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpszname;
    (void)lpcchname;
    (void)lpftlastwritetime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegEnumValue(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint dwindex, jlong lpszvaluename, jlong lpcchvaluename, jlong lpdwtype, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegEnumValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)dwindex, (void*)(uintptr_t)lpszvaluename, (void*)(uintptr_t)lpcchvaluename, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpszvaluename;
    (void)lpcchvaluename;
    (void)lpdwtype;
    (void)lpdata;
    (void)lpcbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegGetBatchNotification(JNIEnv* km_env, jclass km_clazz, jlong hbatchnotify, jlong phbatchnotification) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegGetBatchNotification");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hbatchnotify, (void*)(uintptr_t)phbatchnotification) : -1;
#else
    (void)hbatchnotify;
    (void)phbatchnotification;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegGetKeySecurity(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint requestedinformation, jlong psecuritydescriptor, jlong lpcbsecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegGetKeySecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)requestedinformation, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)lpcbsecuritydescriptor) : -1;
#else
    (void)hkey;
    (void)requestedinformation;
    (void)psecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegOpenKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpszsubkey, jint samdesired, jlong phkresult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegOpenKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpszsubkey, (uint32_t)samdesired, (void*)(uintptr_t)phkresult) : -1;
#else
    (void)hkey;
    (void)lpszsubkey;
    (void)samdesired;
    (void)phkresult;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegQueryInfoKey(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpcsubkeys, jlong lpcchmaxsubkeylen, jlong lpcvalues, jlong lpcchmaxvaluenamelen, jlong lpcbmaxvaluelen, jlong lpcbsecuritydescriptor, jlong lpftlastwritetime) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegQueryInfoKey");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpcsubkeys, (void*)(uintptr_t)lpcchmaxsubkeylen, (void*)(uintptr_t)lpcvalues, (void*)(uintptr_t)lpcchmaxvaluenamelen, (void*)(uintptr_t)lpcbmaxvaluelen, (void*)(uintptr_t)lpcbsecuritydescriptor, (void*)(uintptr_t)lpftlastwritetime) : -1;
#else
    (void)hkey;
    (void)lpcsubkeys;
    (void)lpcchmaxsubkeylen;
    (void)lpcvalues;
    (void)lpcchmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegQueryValue(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpszvaluename, jlong lpdwvaluetype, jlong lpdata, jlong lpcbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegQueryValue");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpszvaluename, (void*)(uintptr_t)lpdwvaluetype, (void*)(uintptr_t)lpdata, (void*)(uintptr_t)lpcbdata) : -1;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)lpdwvaluetype;
    (void)lpdata;
    (void)lpcbdata;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegReadBatchAddCommand(JNIEnv* km_env, jclass km_clazz, jlong hregreadbatch, jlong wzsubkeyname, jlong wzvaluename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegReadBatchAddCommand");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hregreadbatch, (void*)(uintptr_t)wzsubkeyname, (void*)(uintptr_t)wzvaluename) : -1;
#else
    (void)hregreadbatch;
    (void)wzsubkeyname;
    (void)wzvaluename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegReadBatchReplyNextCommand(JNIEnv* km_env, jclass km_clazz, jlong hregreadbatchreply, jlong pbatchcommand) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegReadBatchReplyNextCommand");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hregreadbatchreply, (void*)(uintptr_t)pbatchcommand) : -1;
#else
    (void)hregreadbatchreply;
    (void)pbatchcommand;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegSetKeySecurity(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint securityinformation, jlong psecuritydescriptor) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSetKeySecurity");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor) : -1;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegSetKeySecurityEx(JNIEnv* km_env, jclass km_clazz, jlong hkey, jint securityinformation, jlong psecuritydescriptor, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSetKeySecurityEx");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (uint32_t)securityinformation, (void*)(uintptr_t)psecuritydescriptor, (void*)(uintptr_t)lpszreason) : -1;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)lpszreason;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegSetValue(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpszvaluename, jint dwtype, jlong lpdata, jint cbdata) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSetValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpszvaluename, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata) : 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegSetValueEx(JNIEnv* km_env, jclass km_clazz, jlong hkey, jlong lpszvaluename, jint dwtype, jlong lpdata, jint cbdata, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSetValueEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkey, (void*)(uintptr_t)lpszvaluename, (uint32_t)dwtype, (void*)(uintptr_t)lpdata, (uint32_t)cbdata, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hkey;
    (void)lpszvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRegSyncDatabase(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRegSyncDatabase");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (uint32_t)flags) : -1;
#else
    (void)hcluster;
    (void)flags;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRemoveAffinityRule(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong rulename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRemoveAffinityRule");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)rulename) : 0;
#else
    (void)hcluster;
    (void)rulename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRemoveGroupFromAffinityRule(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong rulename, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRemoveGroupFromAffinityRule");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)rulename, (int64_t)hgroup) : 0;
#else
    (void)hcluster;
    (void)rulename;
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRemoveGroupFromGroupSet(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRemoveGroupFromGroupSet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup) : 0;
#else
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterRemoveGroupFromGroupSetEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterRemoveGroupFromGroupSetEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong hresenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresenum) : 0;
#else
    (void)hresenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceCloseEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hresourceenumex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceCloseEnumEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresourceenumex) : 0;
#else
    (void)hresourceenumex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceControl(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint cbinbuffersize, jlong lpoutbuffer, jint cboutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)cboutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceControlAsUser(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint cbinbuffersize, jlong lpoutbuffer, jint cboutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceControlAsUser");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)cboutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
#else
    (void)hresource;
    (void)hhostnode;
    (void)dwcontrolcode;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpoutbuffer;
    (void)cboutbuffersize;
    (void)lpbytesreturned;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceControlAsUserEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint cbinbuffersize, jlong lpoutbuffer, jint cboutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceControlAsUserEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)cboutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceControlEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint cbinbuffersize, jlong lpoutbuffer, jint cboutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceControlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)cboutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceEnum(JNIEnv* km_env, jclass km_clazz, jlong hresenum, jint dwindex, jlong lpdwtype, jlong lpszname, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresenum, (uint32_t)dwindex, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)hresenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hresourceenumex, jint dwindex, jlong pitem, jlong cbitem) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceEnumEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresourceenumex, (uint32_t)dwindex, (void*)(uintptr_t)pitem, (void*)(uintptr_t)cbitem) : 0;
#else
    (void)hresourceenumex;
    (void)dwindex;
    (void)pitem;
    (void)cbitem;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceGetEnumCount(JNIEnv* km_env, jclass km_clazz, jlong hresenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceGetEnumCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresenum) : 0;
#else
    (void)hresenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceGetEnumCountEx(JNIEnv* km_env, jclass km_clazz, jlong hresourceenumex) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceGetEnumCountEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresourceenumex) : 0;
#else
    (void)hresourceenumex;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceOpenEnum(JNIEnv* km_env, jclass km_clazz, jlong hresource, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceOpenEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (uint32_t)dwtype) : -1;
#else
    (void)hresource;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceOpenEnumEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszproperties, jint cbproperties, jlong lpszroproperties, jint cbroproperties, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceOpenEnumEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszproperties, (uint32_t)cbproperties, (void*)(uintptr_t)lpszroproperties, (uint32_t)cbroproperties, (uint32_t)dwflags) : -1;
#else
    (void)hcluster;
    (void)lpszproperties;
    (void)cbproperties;
    (void)lpszroproperties;
    (void)cbroproperties;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceTypeCloseEnum(JNIEnv* km_env, jclass km_clazz, jlong hrestypeenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeCloseEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrestypeenum) : 0;
#else
    (void)hrestypeenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceTypeControl(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcetypename, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeControl");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcetypename, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceTypeControlAsUser(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcetypename, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeControlAsUser");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcetypename, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceTypeControlAsUserEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcetypename, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeControlAsUserEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcetypename, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceTypeControlEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcetypename, jlong hhostnode, jint dwcontrolcode, jlong lpinbuffer, jint ninbuffersize, jlong lpoutbuffer, jint noutbuffersize, jlong lpbytesreturned, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, int64_t, uint32_t, void*, uint32_t, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeControlEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcetypename, (int64_t)hhostnode, (uint32_t)dwcontrolcode, (void*)(uintptr_t)lpinbuffer, (uint32_t)ninbuffersize, (void*)(uintptr_t)lpoutbuffer, (uint32_t)noutbuffersize, (void*)(uintptr_t)lpbytesreturned, (void*)(uintptr_t)lpszreason) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceTypeEnum(JNIEnv* km_env, jclass km_clazz, jlong hrestypeenum, jint dwindex, jlong lpdwtype, jlong lpszname, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrestypeenum, (uint32_t)dwindex, (void*)(uintptr_t)lpdwtype, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)hrestypeenum;
    (void)dwindex;
    (void)lpdwtype;
    (void)lpszname;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceTypeGetEnumCount(JNIEnv* km_env, jclass km_clazz, jlong hrestypeenum) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeGetEnumCount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hrestypeenum) : 0;
#else
    (void)hrestypeenum;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterResourceTypeOpenEnum(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcetypename, jint dwtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterResourceTypeOpenEnum");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcetypename, (uint32_t)dwtype) : -1;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)dwtype;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterSetAccountAccess(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong szaccountsid, jint dwaccess, jint dwcontroltype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterSetAccountAccess");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)szaccountsid, (uint32_t)dwaccess, (uint32_t)dwcontroltype) : 0;
#else
    (void)hcluster;
    (void)szaccountsid;
    (void)dwaccess;
    (void)dwcontroltype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ClusterUpgradeFunctionalLevel(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jint perform, jlong pfnprogresscallback, jlong pvcallbackarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClusterUpgradeFunctionalLevel");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int32_t)perform, (void*)(uintptr_t)pfnprogresscallback, (void*)(uintptr_t)pvcallbackarg) : 0;
#else
    (void)hcluster;
    (void)perform;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateCluster(JNIEnv* km_env, jclass km_clazz, jlong pconfig, jlong pfnprogresscallback, jlong pvcallbackarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateCluster");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pconfig, (void*)(uintptr_t)pfnprogresscallback, (void*)(uintptr_t)pvcallbackarg) : -1;
#else
    (void)pconfig;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterAvailabilitySet(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpavailabilitysetname, jlong pavailabilitysetconfig) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterAvailabilitySet");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpavailabilitysetname, (void*)(uintptr_t)pavailabilitysetconfig) : -1;
#else
    (void)hcluster;
    (void)lpavailabilitysetname;
    (void)pavailabilitysetconfig;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterGroup(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterGroup");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszgroupname) : -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterGroupEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszgroupname, jlong pgroupinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterGroupEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszgroupname, (void*)(uintptr_t)pgroupinfo) : -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    (void)pgroupinfo;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterGroupSet(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong groupsetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterGroupSet");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)groupsetname) : -1;
#else
    (void)hcluster;
    (void)groupsetname;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterNameAccount(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong pconfig, jlong pfnprogresscallback, jlong pvcallbackarg) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterNameAccount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)pconfig, (void*)(uintptr_t)pfnprogresscallback, (void*)(uintptr_t)pvcallbackarg) : 0;
#else
    (void)hcluster;
    (void)pconfig;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterNotifyPort(JNIEnv* km_env, jclass km_clazz, jlong hchange, jlong hcluster, jint dwfilter, jlong dwnotifykey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterNotifyPort");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hchange, (int64_t)hcluster, (uint32_t)dwfilter, (uint64_t)dwnotifykey) : -1;
#else
    (void)hchange;
    (void)hcluster;
    (void)dwfilter;
    (void)dwnotifykey;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterNotifyPortV2(JNIEnv* km_env, jclass km_clazz, jlong hchange, jlong hcluster, jlong filters, jint dwfiltercount, jlong dwnotifykey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, uint32_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterNotifyPortV2");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hchange, (int64_t)hcluster, (void*)(uintptr_t)filters, (uint32_t)dwfiltercount, (uint64_t)dwnotifykey) : -1;
#else
    (void)hchange;
    (void)hcluster;
    (void)filters;
    (void)dwfiltercount;
    (void)dwnotifykey;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterResource(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpszresourcename, jlong lpszresourcetype, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterResource");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpszresourcename, (void*)(uintptr_t)lpszresourcetype, (uint32_t)dwflags) : -1;
#else
    (void)hgroup;
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterResourceEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpszresourcename, jlong lpszresourcetype, jint dwflags, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterResourceEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpszresourcename, (void*)(uintptr_t)lpszresourcetype, (uint32_t)dwflags, (void*)(uintptr_t)lpszreason) : -1;
#else
    (void)hgroup;
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwflags;
    (void)lpszreason;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterResourceType(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcetypename, jlong lpszdisplayname, jlong lpszresourcetypedll, jint dwlooksalivepollinterval, jint dwisalivepollinterval) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterResourceType");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcetypename, (void*)(uintptr_t)lpszdisplayname, (void*)(uintptr_t)lpszresourcetypedll, (uint32_t)dwlooksalivepollinterval, (uint32_t)dwisalivepollinterval) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)lpszdisplayname;
    (void)lpszresourcetypedll;
    (void)dwlooksalivepollinterval;
    (void)dwisalivepollinterval;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1CreateClusterResourceTypeEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcetypename, jlong lpszdisplayname, jlong lpszresourcetypedll, jint dwlooksalivepollinterval, jint dwisalivepollinterval, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreateClusterResourceTypeEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcetypename, (void*)(uintptr_t)lpszdisplayname, (void*)(uintptr_t)lpszresourcetypedll, (uint32_t)dwlooksalivepollinterval, (uint32_t)dwisalivepollinterval, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    (void)lpszdisplayname;
    (void)lpszresourcetypedll;
    (void)dwlooksalivepollinterval;
    (void)dwisalivepollinterval;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DeleteClusterGroup(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup) : 0;
#else
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DeleteClusterGroupEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterGroupEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DeleteClusterGroupSet(JNIEnv* km_env, jclass km_clazz, jlong hgroupset) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterGroupSet");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset) : 0;
#else
    (void)hgroupset;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DeleteClusterGroupSetEx(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterGroupSetEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroupset;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DeleteClusterResource(JNIEnv* km_env, jclass km_clazz, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DeleteClusterResourceEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterResourceEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DeleteClusterResourceType(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcetypename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterResourceType");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcetypename) : 0;
#else
    (void)hcluster;
    (void)lpszresourcetypename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DeleteClusterResourceTypeEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsztypename, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeleteClusterResourceTypeEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsztypename, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hcluster;
    (void)lpsztypename;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DestroyCluster(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong pfnprogresscallback, jlong pvcallbackarg, jint fdeletevirtualcomputerobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyCluster");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)pfnprogresscallback, (void*)(uintptr_t)pvcallbackarg, (int32_t)fdeletevirtualcomputerobjects) : 0;
#else
    (void)hcluster;
    (void)pfnprogresscallback;
    (void)pvcallbackarg;
    (void)fdeletevirtualcomputerobjects;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DestroyClusterGroup(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyClusterGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup) : 0;
#else
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DestroyClusterGroupEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DestroyClusterGroupEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DetermineCNOResTypeFromCluster(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong pcnorestype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetermineCNOResTypeFromCluster");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)pcnorestype) : 0;
#else
    (void)hcluster;
    (void)pcnorestype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DetermineCNOResTypeFromNodelist(JNIEnv* km_env, jclass km_clazz, jint cnodes, jlong ppsznodenames, jlong pcnorestype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetermineCNOResTypeFromNodelist");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cnodes, (void*)(uintptr_t)ppsznodenames, (void*)(uintptr_t)pcnorestype) : 0;
#else
    (void)cnodes;
    (void)ppsznodenames;
    (void)pcnorestype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DetermineClusterCloudTypeFromCluster(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong pcloudtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetermineClusterCloudTypeFromCluster");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)pcloudtype) : 0;
#else
    (void)hcluster;
    (void)pcloudtype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1DetermineClusterCloudTypeFromNodelist(JNIEnv* km_env, jclass km_clazz, jint cnodes, jlong ppsznodenames, jlong pcloudtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DetermineClusterCloudTypeFromNodelist");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)cnodes, (void*)(uintptr_t)ppsznodenames, (void*)(uintptr_t)pcloudtype) : 0;
#else
    (void)cnodes;
    (void)ppsznodenames;
    (void)pcloudtype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1EvictClusterNode(JNIEnv* km_env, jclass km_clazz, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvictClusterNode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode) : 0;
#else
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1EvictClusterNodeEx(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint dwtimeout, jlong phrcleanupstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvictClusterNodeEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (uint32_t)dwtimeout, (void*)(uintptr_t)phrcleanupstatus) : 0;
#else
    (void)hnode;
    (void)dwtimeout;
    (void)phrcleanupstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1EvictClusterNodeEx2(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint dwtimeout, jlong phrcleanupstatus, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "EvictClusterNodeEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (uint32_t)dwtimeout, (void*)(uintptr_t)phrcleanupstatus, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hnode;
    (void)dwtimeout;
    (void)phrcleanupstatus;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1FailClusterResource(JNIEnv* km_env, jclass km_clazz, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FailClusterResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1FailClusterResourceEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FailClusterResourceEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1FreeClusterCrypt(JNIEnv* km_env, jclass km_clazz, jlong pcryptinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeClusterCrypt");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pcryptinfo) : 0;
#else
    (void)pcryptinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1FreeClusterHealthFault(JNIEnv* km_env, jclass km_clazz, jlong clusterhealthfault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeClusterHealthFault");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clusterhealthfault) : 0;
#else
    (void)clusterhealthfault;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1FreeClusterHealthFaultArray(JNIEnv* km_env, jclass km_clazz, jlong clusterhealthfaultarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FreeClusterHealthFaultArray");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clusterhealthfaultarray) : 0;
#else
    (void)clusterhealthfaultarray;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterFromGroup(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromGroup");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup) : -1;
#else
    (void)hgroup;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterFromNetInterface(JNIEnv* km_env, jclass km_clazz, jlong hnetinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromNetInterface");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetinterface) : -1;
#else
    (void)hnetinterface;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterFromNetwork(JNIEnv* km_env, jclass km_clazz, jlong hnetwork) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromNetwork");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork) : -1;
#else
    (void)hnetwork;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterFromNode(JNIEnv* km_env, jclass km_clazz, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromNode");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode) : -1;
#else
    (void)hnode;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterFromResource(JNIEnv* km_env, jclass km_clazz, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterFromResource");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource) : -1;
#else
    (void)hresource;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterGroupKey(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterGroupKey");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (uint32_t)samdesired) : NULL;
#else
    (void)hgroup;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterGroupState(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpsznodename, jlong lpcchnodename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterGroupState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpsznodename, (void*)(uintptr_t)lpcchnodename) : -1;
#else
    (void)hgroup;
    (void)lpsznodename;
    (void)lpcchnodename;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterInformation(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszclustername, jlong lpcchclustername, jlong lpclusterinfo) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterInformation");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszclustername, (void*)(uintptr_t)lpcchclustername, (void*)(uintptr_t)lpclusterinfo) : 0;
#else
    (void)hcluster;
    (void)lpszclustername;
    (void)lpcchclustername;
    (void)lpclusterinfo;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterKey(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterKey");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (uint32_t)samdesired) : NULL;
#else
    (void)hcluster;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNetInterface(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznodename, jlong lpsznetworkname, jlong lpszinterfacename, jlong lpcchinterfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetInterface");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznodename, (void*)(uintptr_t)lpsznetworkname, (void*)(uintptr_t)lpszinterfacename, (void*)(uintptr_t)lpcchinterfacename) : 0;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)lpsznetworkname;
    (void)lpszinterfacename;
    (void)lpcchinterfacename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNetInterfaceKey(JNIEnv* km_env, jclass km_clazz, jlong hnetinterface, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetInterfaceKey");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetinterface, (uint32_t)samdesired) : NULL;
#else
    (void)hnetinterface;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNetInterfaceState(JNIEnv* km_env, jclass km_clazz, jlong hnetinterface) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetInterfaceState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetinterface) : -1;
#else
    (void)hnetinterface;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNetworkId(JNIEnv* km_env, jclass km_clazz, jlong hnetwork, jlong lpsznetworkid, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetworkId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork, (void*)(uintptr_t)lpsznetworkid, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)hnetwork;
    (void)lpsznetworkid;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNetworkKey(JNIEnv* km_env, jclass km_clazz, jlong hnetwork, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetworkKey");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork, (uint32_t)samdesired) : NULL;
#else
    (void)hnetwork;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNetworkState(JNIEnv* km_env, jclass km_clazz, jlong hnetwork) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNetworkState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork) : -1;
#else
    (void)hnetwork;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNodeId(JNIEnv* km_env, jclass km_clazz, jlong hnode, jlong lpsznodeid, jlong lpcchname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNodeId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (void*)(uintptr_t)lpsznodeid, (void*)(uintptr_t)lpcchname) : 0;
#else
    (void)hnode;
    (void)lpsznodeid;
    (void)lpcchname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNodeKey(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNodeKey");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (uint32_t)samdesired) : NULL;
#else
    (void)hnode;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNodeState(JNIEnv* km_env, jclass km_clazz, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNodeState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode) : -1;
#else
    (void)hnode;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNotify(JNIEnv* km_env, jclass km_clazz, jlong hchange, jlong lpdwnotifykey, jlong lpdwfiltertype, jlong lpszname, jlong lpcchname, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNotify");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hchange, (void*)(uintptr_t)lpdwnotifykey, (void*)(uintptr_t)lpdwfiltertype, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname, (uint32_t)dwmilliseconds) : 0;
#else
    (void)hchange;
    (void)lpdwnotifykey;
    (void)lpdwfiltertype;
    (void)lpszname;
    (void)lpcchname;
    (void)dwmilliseconds;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterNotifyV2(JNIEnv* km_env, jclass km_clazz, jlong hchange, jlong lpdwnotifykey, jlong pfilterandtype, jlong buffer, jlong lpbbuffersize, jlong lpszobjectid, jlong lpcchobjectid, jlong lpszparentid, jlong lpcchparentid, jlong lpszname, jlong lpcchname, jlong lpsztype, jlong lpcchtype, jint dwmilliseconds) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterNotifyV2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hchange, (void*)(uintptr_t)lpdwnotifykey, (void*)(uintptr_t)pfilterandtype, (void*)(uintptr_t)buffer, (void*)(uintptr_t)lpbbuffersize, (void*)(uintptr_t)lpszobjectid, (void*)(uintptr_t)lpcchobjectid, (void*)(uintptr_t)lpszparentid, (void*)(uintptr_t)lpcchparentid, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpcchname, (void*)(uintptr_t)lpsztype, (void*)(uintptr_t)lpcchtype, (uint32_t)dwmilliseconds) : 0;
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
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterQuorumResource(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcename, jlong lpcchresourcename, jlong lpszdevicename, jlong lpcchdevicename, jlong lpdwmaxquorumlogsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterQuorumResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcename, (void*)(uintptr_t)lpcchresourcename, (void*)(uintptr_t)lpszdevicename, (void*)(uintptr_t)lpcchdevicename, (void*)(uintptr_t)lpdwmaxquorumlogsize) : 0;
#else
    (void)hcluster;
    (void)lpszresourcename;
    (void)lpcchresourcename;
    (void)lpszdevicename;
    (void)lpcchdevicename;
    (void)lpdwmaxquorumlogsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterResourceDependencyExpression(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpszdependencyexpression, jlong lpcchdependencyexpression) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceDependencyExpression");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpszdependencyexpression, (void*)(uintptr_t)lpcchdependencyexpression) : 0;
#else
    (void)hresource;
    (void)lpszdependencyexpression;
    (void)lpcchdependencyexpression;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterResourceKey(JNIEnv* km_env, jclass km_clazz, jlong hresource, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceKey");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (uint32_t)samdesired) : NULL;
#else
    (void)hresource;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterResourceNetworkName(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpbuffer, jlong nsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceNetworkName");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpbuffer, (void*)(uintptr_t)nsize) : -1;
#else
    (void)hresource;
    (void)lpbuffer;
    (void)nsize;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterResourceState(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpsznodename, jlong lpcchnodename, jlong lpszgroupname, jlong lpcchgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpsznodename, (void*)(uintptr_t)lpcchnodename, (void*)(uintptr_t)lpszgroupname, (void*)(uintptr_t)lpcchgroupname) : -1;
#else
    (void)hresource;
    (void)lpsznodename;
    (void)lpcchnodename;
    (void)lpszgroupname;
    (void)lpcchgroupname;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetClusterResourceTypeKey(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsztypename, jint samdesired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetClusterResourceTypeKey");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsztypename, (uint32_t)samdesired) : NULL;
#else
    (void)hcluster;
    (void)lpsztypename;
    (void)samdesired;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetNodeCloudTypeDW(JNIEnv* km_env, jclass km_clazz, jlong ppsznodename, jlong nodecloudtype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNodeCloudTypeDW");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppsznodename, (void*)(uintptr_t)nodecloudtype) : 0;
#else
    (void)ppsznodename;
    (void)nodecloudtype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetNodeClusterState(JNIEnv* km_env, jclass km_clazz, jlong lpsznodename, jlong pdwclusterstate) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNodeClusterState");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpsznodename, (void*)(uintptr_t)pdwclusterstate) : 0;
#else
    (void)lpsznodename;
    (void)pdwclusterstate;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1GetNotifyEventHandle(JNIEnv* km_env, jclass km_clazz, jlong hchange, jlong lphtargetevent) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetNotifyEventHandle");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hchange, (void*)(uintptr_t)lphtargetevent) : 0;
#else
    (void)hchange;
    (void)lphtargetevent;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1InitializeClusterHealthFault(JNIEnv* km_env, jclass km_clazz, jlong clusterhealthfault) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeClusterHealthFault");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clusterhealthfault) : 0;
#else
    (void)clusterhealthfault;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1InitializeClusterHealthFaultArray(JNIEnv* km_env, jclass km_clazz, jlong clusterhealthfaultarray) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "InitializeClusterHealthFaultArray");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)clusterhealthfaultarray) : 0;
#else
    (void)clusterhealthfaultarray;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1IsFileOnClusterSharedVolume(JNIEnv* km_env, jclass km_clazz, jlong lpszpathname, jlong pbfileisonsharedvolume) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsFileOnClusterSharedVolume");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszpathname, (void*)(uintptr_t)pbfileisonsharedvolume) : 0;
#else
    (void)lpszpathname;
    (void)pbfileisonsharedvolume;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1MoveClusterGroup(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdestinationnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveClusterGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdestinationnode) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1MoveClusterGroupEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdestinationnode, jint dwmoveflags, jlong lpinbuffer, jint cbinbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveClusterGroupEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdestinationnode, (uint32_t)dwmoveflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwmoveflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1MoveClusterGroupEx2(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdestinationnode, jint dwmoveflags, jlong lpinbuffer, jint cbinbuffersize, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "MoveClusterGroupEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdestinationnode, (uint32_t)dwmoveflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwmoveflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OfflineClusterGroup(JNIEnv* km_env, jclass km_clazz, jlong hgroup) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup) : 0;
#else
    (void)hgroup;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OfflineClusterGroupEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint dwofflineflags, jlong lpinbuffer, jint cbinbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterGroupEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (uint32_t)dwofflineflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize) : 0;
#else
    (void)hgroup;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OfflineClusterGroupEx2(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint dwofflineflags, jlong lpinbuffer, jint cbinbuffersize, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterGroupEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (uint32_t)dwofflineflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OfflineClusterResource(JNIEnv* km_env, jclass km_clazz, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OfflineClusterResourceEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jint dwofflineflags, jlong lpinbuffer, jint cbinbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterResourceEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (uint32_t)dwofflineflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize) : 0;
#else
    (void)hresource;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OfflineClusterResourceEx2(JNIEnv* km_env, jclass km_clazz, jlong hresource, jint dwofflineflags, jlong lpinbuffer, jint cbinbuffersize, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OfflineClusterResourceEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (uint32_t)dwofflineflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)dwofflineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OnlineClusterGroup(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdestinationnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdestinationnode) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OnlineClusterGroupEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdestinationnode, jint dwonlineflags, jlong lpinbuffer, jint cbinbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterGroupEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdestinationnode, (uint32_t)dwonlineflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OnlineClusterGroupEx2(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdestinationnode, jint dwonlineflags, jlong lpinbuffer, jint cbinbuffersize, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterGroupEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdestinationnode, (uint32_t)dwonlineflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)hdestinationnode;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OnlineClusterResource(JNIEnv* km_env, jclass km_clazz, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OnlineClusterResourceEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jint dwonlineflags, jlong lpinbuffer, jint cbinbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterResourceEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (uint32_t)dwonlineflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize) : 0;
#else
    (void)hresource;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OnlineClusterResourceEx2(JNIEnv* km_env, jclass km_clazz, jlong hresource, jint dwonlineflags, jlong lpinbuffer, jint cbinbuffersize, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OnlineClusterResourceEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (uint32_t)dwonlineflags, (void*)(uintptr_t)lpinbuffer, (uint32_t)cbinbuffersize, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)dwonlineflags;
    (void)lpinbuffer;
    (void)cbinbuffersize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenCluster(JNIEnv* km_env, jclass km_clazz, jlong lpszclustername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenCluster");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszclustername) : -1;
#else
    (void)lpszclustername;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterCryptProvider(JNIEnv* km_env, jclass km_clazz, jlong lpszresource, jlong lpszprovider, jint dwtype, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterCryptProvider");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszresource, (void*)(uintptr_t)lpszprovider, (uint32_t)dwtype, (uint32_t)dwflags) : -1;
#else
    (void)lpszresource;
    (void)lpszprovider;
    (void)dwtype;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterCryptProviderEx(JNIEnv* km_env, jclass km_clazz, jlong lpszresource, jlong lpszkeyname, jlong lpszprovider, jint dwtype, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterCryptProviderEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszresource, (void*)(uintptr_t)lpszkeyname, (void*)(uintptr_t)lpszprovider, (uint32_t)dwtype, (uint32_t)dwflags) : -1;
#else
    (void)lpszresource;
    (void)lpszkeyname;
    (void)lpszprovider;
    (void)dwtype;
    (void)dwflags;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterEx(JNIEnv* km_env, jclass km_clazz, jlong lpszclustername, jint desiredaccess, jlong grantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszclustername, (uint32_t)desiredaccess, (void*)(uintptr_t)grantedaccess) : -1;
#else
    (void)lpszclustername;
    (void)desiredaccess;
    (void)grantedaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterGroup(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterGroup");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszgroupname) : -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterGroupEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszgroupname, jint dwdesiredaccess, jlong lpdwgrantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterGroupEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszgroupname, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpszgroupname;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterGroupSet(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszgroupsetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterGroupSet");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszgroupsetname) : -1;
#else
    (void)hcluster;
    (void)lpszgroupsetname;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterNetInterface(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszinterfacename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNetInterface");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszinterfacename) : -1;
#else
    (void)hcluster;
    (void)lpszinterfacename;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterNetInterfaceEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszinterfacename, jint dwdesiredaccess, jlong lpdwgrantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNetInterfaceEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszinterfacename, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpszinterfacename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterNetwork(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznetworkname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNetwork");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznetworkname) : -1;
#else
    (void)hcluster;
    (void)lpsznetworkname;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterNetworkEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznetworkname, jint dwdesiredaccess, jlong lpdwgrantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNetworkEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznetworkname, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpsznetworkname;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterNode(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznodename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNode");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznodename) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterNodeById(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jint nodeid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNodeById");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (uint32_t)nodeid) : -1;
#else
    (void)hcluster;
    (void)nodeid;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterNodeEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznodename, jint dwdesiredaccess, jlong lpdwgrantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterNodeEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznodename, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpsznodename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterResource(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterResource");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcename) : -1;
#else
    (void)hcluster;
    (void)lpszresourcename;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1OpenClusterResourceEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszresourcename, jint dwdesiredaccess, jlong lpdwgrantedaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenClusterResourceEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszresourcename, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)lpdwgrantedaccess) : -1;
#else
    (void)hcluster;
    (void)lpszresourcename;
    (void)dwdesiredaccess;
    (void)lpdwgrantedaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1PauseClusterNode(JNIEnv* km_env, jclass km_clazz, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PauseClusterNode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode) : 0;
#else
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1PauseClusterNodeEx(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint bdrainnode, jint dwpauseflags, jlong hnodedraintarget) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PauseClusterNodeEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (int32_t)bdrainnode, (uint32_t)dwpauseflags, (int64_t)hnodedraintarget) : 0;
#else
    (void)hnode;
    (void)bdrainnode;
    (void)dwpauseflags;
    (void)hnodedraintarget;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1PauseClusterNodeEx2(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint bdrainnode, jint dwpauseflags, jlong hnodedraintarget, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PauseClusterNodeEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (int32_t)bdrainnode, (uint32_t)dwpauseflags, (int64_t)hnodedraintarget, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hnode;
    (void)bdrainnode;
    (void)dwpauseflags;
    (void)hnodedraintarget;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1QueryAppInstanceVersion(JNIEnv* km_env, jclass km_clazz, jlong appinstanceid, jlong instanceversionhigh, jlong instanceversionlow, jlong versionstatus) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "QueryAppInstanceVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)appinstanceid, (void*)(uintptr_t)instanceversionhigh, (void*)(uintptr_t)instanceversionlow, (void*)(uintptr_t)versionstatus) : 0;
#else
    (void)appinstanceid;
    (void)instanceversionhigh;
    (void)instanceversionlow;
    (void)versionstatus;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RegisterAppInstance(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jlong appinstanceid, jint childreninheritappinstance) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterAppInstance");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (void*)(uintptr_t)appinstanceid, (int32_t)childreninheritappinstance) : 0;
#else
    (void)processhandle;
    (void)appinstanceid;
    (void)childreninheritappinstance;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RegisterAppInstanceVersion(JNIEnv* km_env, jclass km_clazz, jlong appinstanceid, jlong instanceversionhigh, jlong instanceversionlow) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint64_t, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterAppInstanceVersion");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)appinstanceid, (uint64_t)instanceversionhigh, (uint64_t)instanceversionlow) : 0;
#else
    (void)appinstanceid;
    (void)instanceversionhigh;
    (void)instanceversionlow;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RegisterClusterNotify(JNIEnv* km_env, jclass km_clazz, jlong hchange, jint dwfiltertype, jlong hobject, jlong dwnotifykey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClusterNotify");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hchange, (uint32_t)dwfiltertype, (void*)(uintptr_t)hobject, (uint64_t)dwnotifykey) : 0;
#else
    (void)hchange;
    (void)dwfiltertype;
    (void)hobject;
    (void)dwnotifykey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RegisterClusterResourceTypeNotifyV2(JNIEnv* km_env, jclass km_clazz, jlong hchange, jlong hcluster, jlong flags, jlong restypename, jlong dwnotifykey) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int64_t, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterClusterResourceTypeNotifyV2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hchange, (int64_t)hcluster, (int64_t)flags, (void*)(uintptr_t)restypename, (uint64_t)dwnotifykey) : 0;
#else
    (void)hchange;
    (void)hcluster;
    (void)flags;
    (void)restypename;
    (void)dwnotifykey;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterGroupDependency(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdependson) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdependson) : 0;
#else
    (void)hgroup;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterGroupDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdependson, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupDependencyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdependson, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterGroupSetDependency(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong hdependson) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupSetDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (int64_t)hdependson) : 0;
#else
    (void)hgroupset;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterGroupSetDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong hdependson, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupSetDependencyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (int64_t)hdependson, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroupset;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterGroupToGroupSetDependency(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdependson) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupToGroupSetDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdependson) : 0;
#else
    (void)hgroup;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterGroupToGroupSetDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong hdependson, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterGroupToGroupSetDependencyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (int64_t)hdependson, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterNameAccount(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jint bdeletecomputerobjects) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterNameAccount");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int32_t)bdeletecomputerobjects) : 0;
#else
    (void)hcluster;
    (void)bdeletecomputerobjects;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterResourceDependency(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hdependson) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterResourceDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hdependson) : 0;
#else
    (void)hresource;
    (void)hdependson;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterResourceDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hdependson, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterResourceDependencyEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hdependson, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)hdependson;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterResourceNode(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterResourceNode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hnode) : 0;
#else
    (void)hresource;
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterResourceNodeEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong hnode, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterResourceNodeEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (int64_t)hnode, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)hnode;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveClusterStorageNode(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpszclusterstorageenclosurename, jint dwtimeout, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveClusterStorageNode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpszclusterstorageenclosurename, (uint32_t)dwtimeout, (uint32_t)dwflags) : 0;
#else
    (void)hcluster;
    (void)lpszclusterstorageenclosurename;
    (void)dwtimeout;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveCrossClusterGroupSetDependency(JNIEnv* km_env, jclass km_clazz, jlong hdependentgroupset, jlong lpremoteclustername, jlong lpremotegroupsetname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveCrossClusterGroupSetDependency");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hdependentgroupset, (void*)(uintptr_t)lpremoteclustername, (void*)(uintptr_t)lpremotegroupsetname) : 0;
#else
    (void)hdependentgroupset;
    (void)lpremoteclustername;
    (void)lpremotegroupsetname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RemoveResourceFromClusterSharedVolumes(JNIEnv* km_env, jclass km_clazz, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemoveResourceFromClusterSharedVolumes");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource) : 0;
#else
    (void)hresource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilAddUnknownProperties(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytable, jlong poutpropertylist, jint pcboutpropertylistsize, jlong pcbbytesreturned, jlong pcbrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilAddUnknownProperties");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)poutpropertylist, (uint32_t)pcboutpropertylistsize, (void*)(uintptr_t)pcbbytesreturned, (void*)(uintptr_t)pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)pcboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilCreateDirectoryTree(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilCreateDirectoryTree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : 0;
#else
    (void)pszpath;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilDupGroup(JNIEnv* km_env, jclass km_clazz, jlong group, jlong copy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilDupGroup");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)group, (void*)(uintptr_t)copy) : 0;
#else
    (void)group;
    (void)copy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilDupParameterBlock(JNIEnv* km_env, jclass km_clazz, jlong poutparams, jlong pinparams, jlong ppropertytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilDupParameterBlock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)poutparams, (void*)(uintptr_t)pinparams, (void*)(uintptr_t)ppropertytable) : 0;
#else
    (void)poutparams;
    (void)pinparams;
    (void)ppropertytable;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilDupResource(JNIEnv* km_env, jclass km_clazz, jlong group, jlong copy) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilDupResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)group, (void*)(uintptr_t)copy) : 0;
#else
    (void)group;
    (void)copy;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilDupString(JNIEnv* km_env, jclass km_clazz, jlong pszinstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilDupString");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszinstring) : NULL;
#else
    (void)pszinstring;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilEnumGroups(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hself, jlong prescallback, jlong pparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumGroups");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int64_t)hself, (void*)(uintptr_t)prescallback, (void*)(uintptr_t)pparameter) : 0;
#else
    (void)hcluster;
    (void)hself;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilEnumGroupsEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hself, jint grouptype, jlong prescallback, jlong pparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumGroupsEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int64_t)hself, (int32_t)grouptype, (void*)(uintptr_t)prescallback, (void*)(uintptr_t)pparameter) : 0;
#else
    (void)hcluster;
    (void)hself;
    (void)grouptype;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilEnumPrivateProperties(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszoutproperties, jint cboutpropertiessize, jlong pcbbytesreturned, jlong pcbrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumPrivateProperties");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszoutproperties, (uint32_t)cboutpropertiessize, (void*)(uintptr_t)pcbbytesreturned, (void*)(uintptr_t)pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszoutproperties;
    (void)cboutpropertiessize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilEnumProperties(JNIEnv* km_env, jclass km_clazz, jlong ppropertytable, jlong pszoutproperties, jint cboutpropertiessize, jlong pcbbytesreturned, jlong pcbrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumProperties");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)pszoutproperties, (uint32_t)cboutpropertiessize, (void*)(uintptr_t)pcbbytesreturned, (void*)(uintptr_t)pcbrequired) : 0;
#else
    (void)ppropertytable;
    (void)pszoutproperties;
    (void)cboutpropertiessize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilEnumResources(JNIEnv* km_env, jclass km_clazz, jlong hself, jlong lpszrestypename, jlong prescallback, jlong pparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumResources");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hself, (void*)(uintptr_t)lpszrestypename, (void*)(uintptr_t)prescallback, (void*)(uintptr_t)pparameter) : 0;
#else
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilEnumResourcesEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hself, jlong lpszrestypename, jlong prescallback, jlong pparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumResourcesEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int64_t)hself, (void*)(uintptr_t)lpszrestypename, (void*)(uintptr_t)prescallback, (void*)(uintptr_t)pparameter) : 0;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilEnumResourcesEx2(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hself, jlong lpszrestypename, jlong prescallback, jlong pparameter, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilEnumResourcesEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int64_t)hself, (void*)(uintptr_t)lpszrestypename, (void*)(uintptr_t)prescallback, (void*)(uintptr_t)pparameter, (uint32_t)dwdesiredaccess) : 0;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszrestypename;
    (void)prescallback;
    (void)pparameter;
    (void)dwdesiredaccess;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilExpandEnvironmentStrings(JNIEnv* km_env, jclass km_clazz, jlong pszsrc) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilExpandEnvironmentStrings");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszsrc) : NULL;
#else
    (void)pszsrc;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindBinaryProperty(JNIEnv* km_env, jclass km_clazz, jlong ppropertylist, jint cbpropertylistsize, jlong pszpropertyname, jlong pbpropertyvalue, jlong pcbpropertyvaluesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindBinaryProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertylist, (uint32_t)cbpropertylistsize, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)pbpropertyvalue, (void*)(uintptr_t)pcbpropertyvaluesize) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pbpropertyvalue;
    (void)pcbpropertyvaluesize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindDependentDiskResourceDriveLetter(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hresource, jlong pszdriveletter, jlong pcchdriveletter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindDependentDiskResourceDriveLetter");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int64_t)hresource, (void*)(uintptr_t)pszdriveletter, (void*)(uintptr_t)pcchdriveletter) : 0;
#else
    (void)hcluster;
    (void)hresource;
    (void)pszdriveletter;
    (void)pcchdriveletter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindDwordProperty(JNIEnv* km_env, jclass km_clazz, jlong ppropertylist, jint cbpropertylistsize, jlong pszpropertyname, jlong pdwpropertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindDwordProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertylist, (uint32_t)cbpropertylistsize, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)pdwpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pdwpropertyvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindExpandSzProperty(JNIEnv* km_env, jclass km_clazz, jlong ppropertylist, jint cbpropertylistsize, jlong pszpropertyname, jlong pszpropertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindExpandSzProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertylist, (uint32_t)cbpropertylistsize, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)pszpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindExpandedSzProperty(JNIEnv* km_env, jclass km_clazz, jlong ppropertylist, jint cbpropertylistsize, jlong pszpropertyname, jlong pszpropertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindExpandedSzProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertylist, (uint32_t)cbpropertylistsize, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)pszpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindFileTimeProperty(JNIEnv* km_env, jclass km_clazz, jlong ppropertylist, jint cbpropertylistsize, jlong pszpropertyname, jlong pftpropertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindFileTimeProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertylist, (uint32_t)cbpropertylistsize, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)pftpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pftpropertyvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindLongProperty(JNIEnv* km_env, jclass km_clazz, jlong ppropertylist, jint cbpropertylistsize, jlong pszpropertyname, jlong plpropertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindLongProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertylist, (uint32_t)cbpropertylistsize, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)plpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)plpropertyvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindMultiSzProperty(JNIEnv* km_env, jclass km_clazz, jlong ppropertylist, jint cbpropertylistsize, jlong pszpropertyname, jlong pszpropertyvalue, jlong pcbpropertyvaluesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindMultiSzProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertylist, (uint32_t)cbpropertylistsize, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)pszpropertyvalue, (void*)(uintptr_t)pcbpropertyvaluesize) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    (void)pcbpropertyvaluesize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindSzProperty(JNIEnv* km_env, jclass km_clazz, jlong ppropertylist, jint cbpropertylistsize, jlong pszpropertyname, jlong pszpropertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindSzProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertylist, (uint32_t)cbpropertylistsize, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)pszpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)pszpropertyvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFindULargeIntegerProperty(JNIEnv* km_env, jclass km_clazz, jlong ppropertylist, jint cbpropertylistsize, jlong pszpropertyname, jlong plpropertyvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFindULargeIntegerProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertylist, (uint32_t)cbpropertylistsize, (void*)(uintptr_t)pszpropertyname, (void*)(uintptr_t)plpropertyvalue) : 0;
#else
    (void)ppropertylist;
    (void)cbpropertylistsize;
    (void)pszpropertyname;
    (void)plpropertyvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFreeEnvironment(JNIEnv* km_env, jclass km_clazz, jlong lpenvironment) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFreeEnvironment");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpenvironment) : 0;
#else
    (void)lpenvironment;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT void JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilFreeParameterBlock(JNIEnv* km_env, jclass km_clazz, jlong poutparams, jlong pinparams, jlong ppropertytable) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilFreeParameterBlock");
    }
    if (km_fn_ptr != NULL) km_fn_ptr((void*)(uintptr_t)poutparams, (void*)(uintptr_t)pinparams, (void*)(uintptr_t)ppropertytable);
#else
    (void)poutparams;
    (void)pinparams;
    (void)ppropertytable;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetAllProperties(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytable, jlong poutpropertylist, jint cboutpropertylistsize, jlong pcbbytesreturned, jlong pcbrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetAllProperties");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)poutpropertylist, (uint32_t)cboutpropertylistsize, (void*)(uintptr_t)pcbbytesreturned, (void*)(uintptr_t)pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetBinaryProperty(JNIEnv* km_env, jclass km_clazz, jlong ppboutvalue, jlong pcboutvaluesize, jlong pvaluestruct, jlong pboldvalue, jint cboldvaluesize, jlong pppropertylist, jlong pcbpropertylistsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetBinaryProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppboutvalue, (void*)(uintptr_t)pcboutvaluesize, (void*)(uintptr_t)pvaluestruct, (void*)(uintptr_t)pboldvalue, (uint32_t)cboldvaluesize, (void*)(uintptr_t)pppropertylist, (void*)(uintptr_t)pcbpropertylistsize) : 0;
#else
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    (void)pvaluestruct;
    (void)pboldvalue;
    (void)cboldvaluesize;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetBinaryValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename, jlong ppboutvalue, jlong pcboutvaluesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetBinaryValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)ppboutvalue, (void*)(uintptr_t)pcboutvaluesize) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetClusterGroupType(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong grouptype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetClusterGroupType");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)grouptype) : 0;
#else
    (void)hgroup;
    (void)grouptype;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetClusterId(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong guid) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetClusterId");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)guid) : 0;
#else
    (void)hcluster;
    (void)guid;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetClusterRoleState(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jint eclusterrole) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetClusterRoleState");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (int32_t)eclusterrole) : -1;
#else
    (void)hcluster;
    (void)eclusterrole;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetCoreClusterResources(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong phclusternameresource, jlong phclusteripaddressresource, jlong phclusterquorumresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetCoreClusterResources");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)phclusternameresource, (void*)(uintptr_t)phclusteripaddressresource, (void*)(uintptr_t)phclusterquorumresource) : 0;
#else
    (void)hcluster;
    (void)phclusternameresource;
    (void)phclusteripaddressresource;
    (void)phclusterquorumresource;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetCoreClusterResourcesEx(JNIEnv* km_env, jclass km_clazz, jlong hclusterin, jlong phclusternameresourceout, jlong phclusterquorumresourceout, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetCoreClusterResourcesEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hclusterin, (void*)(uintptr_t)phclusternameresourceout, (void*)(uintptr_t)phclusterquorumresourceout, (uint32_t)dwdesiredaccess) : 0;
#else
    (void)hclusterin;
    (void)phclusternameresourceout;
    (void)phclusterquorumresourceout;
    (void)dwdesiredaccess;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetCoreGroup(JNIEnv* km_env, jclass km_clazz, jlong hcluster) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetCoreGroup");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster) : -1;
#else
    (void)hcluster;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetDwordProperty(JNIEnv* km_env, jclass km_clazz, jlong pdwoutvalue, jlong pvaluestruct, jint dwoldvalue, jint dwminimum, jint dwmaximum, jlong pppropertylist, jlong pcbpropertylistsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetDwordProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pdwoutvalue, (void*)(uintptr_t)pvaluestruct, (uint32_t)dwoldvalue, (uint32_t)dwminimum, (uint32_t)dwmaximum, (void*)(uintptr_t)pppropertylist, (void*)(uintptr_t)pcbpropertylistsize) : 0;
#else
    (void)pdwoutvalue;
    (void)pvaluestruct;
    (void)dwoldvalue;
    (void)dwminimum;
    (void)dwmaximum;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetDwordValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename, jlong pdwoutvalue, jint dwdefaultvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetDwordValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)pdwoutvalue, (uint32_t)dwdefaultvalue) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pdwoutvalue;
    (void)dwdefaultvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetEnvironmentWithNetName(JNIEnv* km_env, jclass km_clazz, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetEnvironmentWithNetName");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource) : NULL;
#else
    (void)hresource;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetLongProperty(JNIEnv* km_env, jclass km_clazz, jlong ploutvalue, jlong pvaluestruct, jint loldvalue, jint lminimum, jint lmaximum, jlong pppropertylist, jlong pcbpropertylistsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetLongProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ploutvalue, (void*)(uintptr_t)pvaluestruct, (int32_t)loldvalue, (int32_t)lminimum, (int32_t)lmaximum, (void*)(uintptr_t)pppropertylist, (void*)(uintptr_t)pcbpropertylistsize) : 0;
#else
    (void)ploutvalue;
    (void)pvaluestruct;
    (void)loldvalue;
    (void)lminimum;
    (void)lmaximum;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetMultiSzProperty(JNIEnv* km_env, jclass km_clazz, jlong ppszoutvalue, jlong pcboutvaluesize, jlong pvaluestruct, jlong pszoldvalue, jint cboldvaluesize, jlong pppropertylist, jlong pcbpropertylistsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetMultiSzProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppszoutvalue, (void*)(uintptr_t)pcboutvaluesize, (void*)(uintptr_t)pvaluestruct, (void*)(uintptr_t)pszoldvalue, (uint32_t)cboldvaluesize, (void*)(uintptr_t)pppropertylist, (void*)(uintptr_t)pcbpropertylistsize) : 0;
#else
    (void)ppszoutvalue;
    (void)pcboutvaluesize;
    (void)pvaluestruct;
    (void)pszoldvalue;
    (void)cboldvaluesize;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetPrivateProperties(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong poutpropertylist, jint cboutpropertylistsize, jlong pcbbytesreturned, jlong pcbrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetPrivateProperties");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)poutpropertylist, (uint32_t)cboutpropertylistsize, (void*)(uintptr_t)pcbbytesreturned, (void*)(uintptr_t)pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetProperties(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytable, jlong poutpropertylist, jint cboutpropertylistsize, jlong pcbbytesreturned, jlong pcbrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetProperties");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)poutpropertylist, (uint32_t)cboutpropertylistsize, (void*)(uintptr_t)pcbbytesreturned, (void*)(uintptr_t)pcbrequired) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)cboutpropertylistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetPropertiesToParameterBlock(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytable, jlong poutparams, jint bcheckforrequiredproperties, jlong psznameofpropinerror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetPropertiesToParameterBlock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)poutparams, (int32_t)bcheckforrequiredproperties, (void*)(uintptr_t)psznameofpropinerror) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)poutparams;
    (void)bcheckforrequiredproperties;
    (void)psznameofpropinerror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetProperty(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytableitem, jlong poutpropertyitem, jlong pcboutpropertyitemsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytableitem, (void*)(uintptr_t)poutpropertyitem, (void*)(uintptr_t)pcboutpropertyitemsize) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytableitem;
    (void)poutpropertyitem;
    (void)pcboutpropertyitemsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetPropertyFormats(JNIEnv* km_env, jclass km_clazz, jlong ppropertytable, jlong poutpropertyformatlist, jint cbpropertyformatlistsize, jlong pcbbytesreturned, jlong pcbrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetPropertyFormats");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)poutpropertyformatlist, (uint32_t)cbpropertyformatlistsize, (void*)(uintptr_t)pcbbytesreturned, (void*)(uintptr_t)pcbrequired) : 0;
#else
    (void)ppropertytable;
    (void)poutpropertyformatlist;
    (void)cbpropertyformatlistsize;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetPropertySize(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytableitem, jlong pcboutpropertylistsize, jlong pnpropertycount) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetPropertySize");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytableitem, (void*)(uintptr_t)pcboutpropertylistsize, (void*)(uintptr_t)pnpropertycount) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytableitem;
    (void)pcboutpropertylistsize;
    (void)pnpropertycount;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetQwordValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename, jlong pqwoutvalue, jlong qwdefaultvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetQwordValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)pqwoutvalue, (uint64_t)qwdefaultvalue) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pqwoutvalue;
    (void)qwdefaultvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceDependency(JNIEnv* km_env, jclass km_clazz, jlong hself, jlong lpszresourcetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependency");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hself, (void*)(uintptr_t)lpszresourcetype) : -1;
#else
    (void)hself;
    (void)lpszresourcetype;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceDependencyByClass(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hself, jlong prci, jint brecurse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByClass");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)hself, (void*)(uintptr_t)prci, (int32_t)brecurse) : -1;
#else
    (void)hcluster;
    (void)hself;
    (void)prci;
    (void)brecurse;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceDependencyByClassEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hself, jlong prci, jint brecurse, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByClassEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)hself, (void*)(uintptr_t)prci, (int32_t)brecurse, (uint32_t)dwdesiredaccess) : -1;
#else
    (void)hcluster;
    (void)hself;
    (void)prci;
    (void)brecurse;
    (void)dwdesiredaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceDependencyByName(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hself, jlong lpszresourcetype, jint brecurse) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByName");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)hself, (void*)(uintptr_t)lpszresourcetype, (int32_t)brecurse) : -1;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszresourcetype;
    (void)brecurse;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceDependencyByNameEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong hself, jlong lpszresourcetype, jint brecurse, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(int64_t, void*, void*, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyByNameEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)hself, (void*)(uintptr_t)lpszresourcetype, (int32_t)brecurse, (uint32_t)dwdesiredaccess) : -1;
#else
    (void)hcluster;
    (void)hself;
    (void)lpszresourcetype;
    (void)brecurse;
    (void)dwdesiredaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong hself, jlong lpszresourcetype, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependencyEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hself, (void*)(uintptr_t)lpszresourcetype, (uint32_t)dwdesiredaccess) : -1;
#else
    (void)hself;
    (void)lpszresourcetype;
    (void)dwdesiredaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceDependentIPAddressProps(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong pszaddress, jlong pcchaddress, jlong pszsubnetmask, jlong pcchsubnetmask, jlong psznetwork, jlong pcchnetwork) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceDependentIPAddressProps");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)pszaddress, (void*)(uintptr_t)pcchaddress, (void*)(uintptr_t)pszsubnetmask, (void*)(uintptr_t)pcchsubnetmask, (void*)(uintptr_t)psznetwork, (void*)(uintptr_t)pcchnetwork) : 0;
#else
    (void)hresource;
    (void)pszaddress;
    (void)pcchaddress;
    (void)pszsubnetmask;
    (void)pcchsubnetmask;
    (void)psznetwork;
    (void)pcchnetwork;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceName(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong pszresourcename, jlong pcchresourcenameinout) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)pszresourcename, (void*)(uintptr_t)pcchresourcenameinout) : 0;
#else
    (void)hresource;
    (void)pszresourcename;
    (void)pcchresourcenameinout;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceNameDependency(JNIEnv* km_env, jclass km_clazz, jlong lpszresourcename, jlong lpszresourcetype) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceNameDependency");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszresourcename, (void*)(uintptr_t)lpszresourcetype) : -1;
#else
    (void)lpszresourcename;
    (void)lpszresourcetype;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetResourceNameDependencyEx(JNIEnv* km_env, jclass km_clazz, jlong lpszresourcename, jlong lpszresourcetype, jint dwdesiredaccess) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int64_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetResourceNameDependencyEx");
    }
    int64_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszresourcename, (void*)(uintptr_t)lpszresourcetype, (uint32_t)dwdesiredaccess) : -1;
#else
    (void)lpszresourcename;
    (void)lpszresourcetype;
    (void)dwdesiredaccess;
    int64_t km_res = -1;
#endif
    return (jlong)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetSzProperty(JNIEnv* km_env, jclass km_clazz, jlong ppszoutvalue, jlong pvaluestruct, jlong pszoldvalue, jlong pppropertylist, jlong pcbpropertylistsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetSzProperty");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppszoutvalue, (void*)(uintptr_t)pvaluestruct, (void*)(uintptr_t)pszoldvalue, (void*)(uintptr_t)pppropertylist, (void*)(uintptr_t)pcbpropertylistsize) : 0;
#else
    (void)ppszoutvalue;
    (void)pvaluestruct;
    (void)pszoldvalue;
    (void)pppropertylist;
    (void)pcbpropertylistsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGetSzValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGetSzValue");
    }
    void* km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename) : NULL;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    void* km_res = NULL;
#endif
    return (jlong)(uintptr_t)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilGroupsEqual(JNIEnv* km_env, jclass km_clazz, jlong hself, jlong hgroup, jlong pequal) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilGroupsEqual");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hself, (int64_t)hgroup, (void*)(uintptr_t)pequal) : 0;
#else
    (void)hself;
    (void)hgroup;
    (void)pequal;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilIsPathValid(JNIEnv* km_env, jclass km_clazz, jlong pszpath) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilIsPathValid");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszpath) : -1;
#else
    (void)pszpath;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilIsResourceClassEqual(JNIEnv* km_env, jclass km_clazz, jlong prci, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilIsResourceClassEqual");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)prci, (int64_t)hresource) : -1;
#else
    (void)prci;
    (void)hresource;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilLeftPaxosIsLessThanRight(JNIEnv* km_env, jclass km_clazz, jlong left, jlong right) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilLeftPaxosIsLessThanRight");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)left, (void*)(uintptr_t)right) : -1;
#else
    (void)left;
    (void)right;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilNodeEnum(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong pnodecallback, jlong pparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilNodeEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)pnodecallback, (void*)(uintptr_t)pparameter) : 0;
#else
    (void)hcluster;
    (void)pnodecallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilPaxosComparer(JNIEnv* km_env, jclass km_clazz, jlong left, jlong right) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilPaxosComparer");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)left, (void*)(uintptr_t)right) : -1;
#else
    (void)left;
    (void)right;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilPropertyListFromParameterBlock(JNIEnv* km_env, jclass km_clazz, jlong ppropertytable, jlong poutpropertylist, jlong pcboutpropertylistsize, jlong pinparams, jlong pcbbytesreturned, jlong pcbrequired) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilPropertyListFromParameterBlock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)poutpropertylist, (void*)(uintptr_t)pcboutpropertylistsize, (void*)(uintptr_t)pinparams, (void*)(uintptr_t)pcbbytesreturned, (void*)(uintptr_t)pcbrequired) : 0;
#else
    (void)ppropertytable;
    (void)poutpropertylist;
    (void)pcboutpropertylistsize;
    (void)pinparams;
    (void)pcbbytesreturned;
    (void)pcbrequired;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilRemoveResourceServiceEnvironment(JNIEnv* km_env, jclass km_clazz, jlong pszservicename, jlong pfnlogevent, jlong hresourcehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilRemoveResourceServiceEnvironment");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszservicename, (void*)(uintptr_t)pfnlogevent, (int64_t)hresourcehandle) : 0;
#else
    (void)pszservicename;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilResourceDepEnum(JNIEnv* km_env, jclass km_clazz, jlong hself, jint enumtype, jlong prescallback, jlong pparameter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilResourceDepEnum");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hself, (uint32_t)enumtype, (void*)(uintptr_t)prescallback, (void*)(uintptr_t)pparameter) : 0;
#else
    (void)hself;
    (void)enumtype;
    (void)prescallback;
    (void)pparameter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilResourceTypesEqual(JNIEnv* km_env, jclass km_clazz, jlong lpszresourcetypename, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilResourceTypesEqual");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszresourcetypename, (int64_t)hresource) : -1;
#else
    (void)lpszresourcetypename;
    (void)hresource;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilResourcesEqual(JNIEnv* km_env, jclass km_clazz, jlong hself, jlong hresource) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int64_t, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilResourcesEqual");
    }
    int32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hself, (int64_t)hresource) : -1;
#else
    (void)hself;
    (void)hresource;
    int32_t km_res = -1;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetBinaryValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename, jlong pbnewvalue, jint cbnewvaluesize, jlong ppboutvalue, jlong pcboutvaluesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetBinaryValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)pbnewvalue, (uint32_t)cbnewvaluesize, (void*)(uintptr_t)ppboutvalue, (void*)(uintptr_t)pcboutvaluesize) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)pbnewvalue;
    (void)cbnewvaluesize;
    (void)ppboutvalue;
    (void)pcboutvaluesize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetDwordValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename, jint dwnewvalue, jlong pdwoutvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetDwordValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename, (uint32_t)dwnewvalue, (void*)(uintptr_t)pdwoutvalue) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)dwnewvalue;
    (void)pdwoutvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetExpandSzValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename, jlong psznewvalue, jlong ppszoutstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetExpandSzValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)psznewvalue, (void*)(uintptr_t)ppszoutstring) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)ppszoutstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetMultiSzValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename, jlong psznewvalue, jint cbnewvaluesize, jlong ppszoutvalue, jlong pcboutvaluesize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetMultiSzValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)psznewvalue, (uint32_t)cbnewvaluesize, (void*)(uintptr_t)ppszoutvalue, (void*)(uintptr_t)pcboutvaluesize) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)cbnewvaluesize;
    (void)ppszoutvalue;
    (void)pcboutvaluesize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetPrivatePropertyList(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pinpropertylist, jint cbinpropertylistsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPrivatePropertyList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pinpropertylist, (uint32_t)cbinpropertylistsize) : 0;
#else
    (void)hkeyclusterkey;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetPropertyParameterBlock(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytable, jlong reserved, jlong pinparams, jlong pinpropertylist, jint cbinpropertylistsize, jlong poutparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPropertyParameterBlock");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)reserved, (void*)(uintptr_t)pinparams, (void*)(uintptr_t)pinpropertylist, (uint32_t)cbinpropertylistsize, (void*)(uintptr_t)poutparams) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)pinparams;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetPropertyParameterBlockEx(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytable, jlong reserved, jlong pinparams, jlong pinpropertylist, jint cbinpropertylistsize, jint bforcewrite, jlong poutparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPropertyParameterBlockEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)reserved, (void*)(uintptr_t)pinparams, (void*)(uintptr_t)pinpropertylist, (uint32_t)cbinpropertylistsize, (int32_t)bforcewrite, (void*)(uintptr_t)poutparams) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)pinparams;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)bforcewrite;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetPropertyTable(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytable, jlong reserved, jint ballowunknownproperties, jlong pinpropertylist, jint cbinpropertylistsize, jlong poutparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPropertyTable");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)reserved, (int32_t)ballowunknownproperties, (void*)(uintptr_t)pinpropertylist, (uint32_t)cbinpropertylistsize, (void*)(uintptr_t)poutparams) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetPropertyTableEx(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytable, jlong reserved, jint ballowunknownproperties, jlong pinpropertylist, jint cbinpropertylistsize, jint bforcewrite, jlong poutparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, int32_t, void*, uint32_t, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetPropertyTableEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)reserved, (int32_t)ballowunknownproperties, (void*)(uintptr_t)pinpropertylist, (uint32_t)cbinpropertylistsize, (int32_t)bforcewrite, (void*)(uintptr_t)poutparams) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)bforcewrite;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetQwordValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename, jlong qwnewvalue, jlong pqwoutvalue) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetQwordValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename, (uint64_t)qwnewvalue, (void*)(uintptr_t)pqwoutvalue) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)qwnewvalue;
    (void)pqwoutvalue;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetResourceServiceEnvironment(JNIEnv* km_env, jclass km_clazz, jlong pszservicename, jlong hresource, jlong pfnlogevent, jlong hresourcehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int64_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetResourceServiceEnvironment");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszservicename, (int64_t)hresource, (void*)(uintptr_t)pfnlogevent, (int64_t)hresourcehandle) : 0;
#else
    (void)pszservicename;
    (void)hresource;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetResourceServiceStartParameters(JNIEnv* km_env, jclass km_clazz, jlong pszservicename, jlong schscmhandle, jlong phservice, jlong pfnlogevent, jlong hresourcehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetResourceServiceStartParameters");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszservicename, (void*)(uintptr_t)schscmhandle, (void*)(uintptr_t)phservice, (void*)(uintptr_t)pfnlogevent, (int64_t)hresourcehandle) : 0;
#else
    (void)pszservicename;
    (void)schscmhandle;
    (void)phservice;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetResourceServiceStartParametersEx(JNIEnv* km_env, jclass km_clazz, jlong pszservicename, jlong schscmhandle, jlong phservice, jint dwdesiredaccess, jlong pfnlogevent, jlong hresourcehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetResourceServiceStartParametersEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszservicename, (void*)(uintptr_t)schscmhandle, (void*)(uintptr_t)phservice, (uint32_t)dwdesiredaccess, (void*)(uintptr_t)pfnlogevent, (int64_t)hresourcehandle) : 0;
#else
    (void)pszservicename;
    (void)schscmhandle;
    (void)phservice;
    (void)dwdesiredaccess;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetSzValue(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong pszvaluename, jlong psznewvalue, jlong ppszoutstring) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetSzValue");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)pszvaluename, (void*)(uintptr_t)psznewvalue, (void*)(uintptr_t)ppszoutstring) : 0;
#else
    (void)hkeyclusterkey;
    (void)pszvaluename;
    (void)psznewvalue;
    (void)ppszoutstring;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetUnknownProperties(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong ppropertytable, jlong pinpropertylist, jint cbinpropertylistsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetUnknownProperties");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)pinpropertylist, (uint32_t)cbinpropertylistsize) : 0;
#else
    (void)hkeyclusterkey;
    (void)ppropertytable;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilSetValueEx(JNIEnv* km_env, jclass km_clazz, jlong hkeyclusterkey, jlong valuename, jint valuetype, jlong valuedata, jint valuesize, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilSetValueEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hkeyclusterkey, (void*)(uintptr_t)valuename, (uint32_t)valuetype, (void*)(uintptr_t)valuedata, (uint32_t)valuesize, (uint32_t)flags) : 0;
#else
    (void)hkeyclusterkey;
    (void)valuename;
    (void)valuetype;
    (void)valuedata;
    (void)valuesize;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilStartResourceService(JNIEnv* km_env, jclass km_clazz, jlong pszservicename, jlong phservicehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilStartResourceService");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszservicename, (void*)(uintptr_t)phservicehandle) : 0;
#else
    (void)pszservicename;
    (void)phservicehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilStopResourceService(JNIEnv* km_env, jclass km_clazz, jlong pszservicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilStopResourceService");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszservicename) : 0;
#else
    (void)pszservicename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilStopService(JNIEnv* km_env, jclass km_clazz, jlong hservicehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilStopService");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservicehandle) : 0;
#else
    (void)hservicehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilTerminateServiceProcessFromResDll(JNIEnv* km_env, jclass km_clazz, jint dwservicepid, jint boffline, jlong pdwresourcestate, jlong pfnlogevent, jlong hresourcehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilTerminateServiceProcessFromResDll");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)dwservicepid, (int32_t)boffline, (void*)(uintptr_t)pdwresourcestate, (void*)(uintptr_t)pfnlogevent, (int64_t)hresourcehandle) : 0;
#else
    (void)dwservicepid;
    (void)boffline;
    (void)pdwresourcestate;
    (void)pfnlogevent;
    (void)hresourcehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilVerifyPrivatePropertyList(JNIEnv* km_env, jclass km_clazz, jlong pinpropertylist, jint cbinpropertylistsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyPrivatePropertyList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pinpropertylist, (uint32_t)cbinpropertylistsize) : 0;
#else
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilVerifyPropertyTable(JNIEnv* km_env, jclass km_clazz, jlong ppropertytable, jlong reserved, jint ballowunknownproperties, jlong pinpropertylist, jint cbinpropertylistsize, jlong poutparams) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyPropertyTable");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)ppropertytable, (void*)(uintptr_t)reserved, (int32_t)ballowunknownproperties, (void*)(uintptr_t)pinpropertylist, (uint32_t)cbinpropertylistsize, (void*)(uintptr_t)poutparams) : 0;
#else
    (void)ppropertytable;
    (void)reserved;
    (void)ballowunknownproperties;
    (void)pinpropertylist;
    (void)cbinpropertylistsize;
    (void)poutparams;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilVerifyResourceService(JNIEnv* km_env, jclass km_clazz, jlong pszservicename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyResourceService");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)pszservicename) : 0;
#else
    (void)pszservicename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilVerifyService(JNIEnv* km_env, jclass km_clazz, jlong hservicehandle) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyService");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)hservicehandle) : 0;
#else
    (void)hservicehandle;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilVerifyShutdownSafe(JNIEnv* km_env, jclass km_clazz, jint flags, jint reason, jlong presult) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilVerifyShutdownSafe");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((uint32_t)flags, (uint32_t)reason, (void*)(uintptr_t)presult) : 0;
#else
    (void)flags;
    (void)reason;
    (void)presult;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResUtilsDeleteKeyTree(JNIEnv* km_env, jclass km_clazz, jlong key, jlong keyname, jint treatnokeyaserror) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("resutils.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResUtilsDeleteKeyTree");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)key, (void*)(uintptr_t)keyname, (int32_t)treatnokeyaserror) : 0;
#else
    (void)key;
    (void)keyname;
    (void)treatnokeyaserror;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResetAllAppInstanceVersions(JNIEnv* km_env, jclass km_clazz) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResetAllAppInstanceVersions");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr() : 0;
#else
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RestartClusterResource(JNIEnv* km_env, jclass km_clazz, jlong hresource, jint dwflags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestartClusterResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (uint32_t)dwflags) : 0;
#else
    (void)hresource;
    (void)dwflags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RestartClusterResourceEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jint dwflags, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestartClusterResourceEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (uint32_t)dwflags, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)dwflags;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1RestoreClusterDatabase(JNIEnv* km_env, jclass km_clazz, jlong lpszpathname, jint bforce, jlong lpszquorumdriveletter) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RestoreClusterDatabase");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszpathname, (int32_t)bforce, (void*)(uintptr_t)lpszquorumdriveletter) : 0;
#else
    (void)lpszpathname;
    (void)bforce;
    (void)lpszquorumdriveletter;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResumeClusterNode(JNIEnv* km_env, jclass km_clazz, jlong hnode) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeClusterNode");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode) : 0;
#else
    (void)hnode;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResumeClusterNodeEx(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint eresumefailbacktype, jint dwresumeflagsreserved) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeClusterNodeEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (int32_t)eresumefailbacktype, (uint32_t)dwresumeflagsreserved) : 0;
#else
    (void)hnode;
    (void)eresumefailbacktype;
    (void)dwresumeflagsreserved;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1ResumeClusterNodeEx2(JNIEnv* km_env, jclass km_clazz, jlong hnode, jint eresumefailbacktype, jint dwresumeflagsreserved, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, int32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ResumeClusterNodeEx2");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnode, (int32_t)eresumefailbacktype, (uint32_t)dwresumeflagsreserved, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hnode;
    (void)eresumefailbacktype;
    (void)dwresumeflagsreserved;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetAppInstanceCsvFlags(JNIEnv* km_env, jclass km_clazz, jlong processhandle, jint mask, jint flags) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("ntlanman.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetAppInstanceCsvFlags");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)processhandle, (uint32_t)mask, (uint32_t)flags) : 0;
#else
    (void)processhandle;
    (void)mask;
    (void)flags;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterGroupName(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpszgroupname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpszgroupname) : 0;
#else
    (void)hgroup;
    (void)lpszgroupname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterGroupNameEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpszgroupname, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupNameEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpszgroupname, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszgroupname;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterGroupNodeList(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint nodecount, jlong nodelist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupNodeList");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (uint32_t)nodecount, (void*)(uintptr_t)nodelist) : 0;
#else
    (void)hgroup;
    (void)nodecount;
    (void)nodelist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterGroupNodeListEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jint nodecount, jlong nodelist, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupNodeListEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (uint32_t)nodecount, (void*)(uintptr_t)nodelist, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)nodecount;
    (void)nodelist;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterGroupSetDependencyExpression(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong lpszdependencyexprssion) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupSetDependencyExpression");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (void*)(uintptr_t)lpszdependencyexprssion) : 0;
#else
    (void)hgroupset;
    (void)lpszdependencyexprssion;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterGroupSetDependencyExpressionEx(JNIEnv* km_env, jclass km_clazz, jlong hgroupset, jlong lpszdependencyexpression, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterGroupSetDependencyExpressionEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroupset, (void*)(uintptr_t)lpszdependencyexpression, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroupset;
    (void)lpszdependencyexpression;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterName(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznewclustername) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznewclustername) : 0;
#else
    (void)hcluster;
    (void)lpsznewclustername;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterNameEx(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jlong lpsznewclustername, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterNameEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (void*)(uintptr_t)lpsznewclustername, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hcluster;
    (void)lpsznewclustername;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterNetworkName(JNIEnv* km_env, jclass km_clazz, jlong hnetwork, jlong lpszname) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterNetworkName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork, (void*)(uintptr_t)lpszname) : 0;
#else
    (void)hnetwork;
    (void)lpszname;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterNetworkNameEx(JNIEnv* km_env, jclass km_clazz, jlong hnetwork, jlong lpszname, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterNetworkNameEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hnetwork, (void*)(uintptr_t)lpszname, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hnetwork;
    (void)lpszname;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterNetworkPriorityOrder(JNIEnv* km_env, jclass km_clazz, jlong hcluster, jint networkcount, jlong networklist) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterNetworkPriorityOrder");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hcluster, (uint32_t)networkcount, (void*)(uintptr_t)networklist) : 0;
#else
    (void)hcluster;
    (void)networkcount;
    (void)networklist;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterQuorumResource(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpszdevicename, jint dwmaxquologsize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterQuorumResource");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpszdevicename, (uint32_t)dwmaxquologsize) : 0;
#else
    (void)hresource;
    (void)lpszdevicename;
    (void)dwmaxquologsize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterQuorumResourceEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpszdevicename, jint dwmaxquorumlogsize, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterQuorumResourceEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpszdevicename, (uint32_t)dwmaxquorumlogsize, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)lpszdevicename;
    (void)dwmaxquorumlogsize;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterResourceDependencyExpression(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpszdependencyexpression) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterResourceDependencyExpression");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpszdependencyexpression) : 0;
#else
    (void)hresource;
    (void)lpszdependencyexpression;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterResourceName(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpszresourcename) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterResourceName");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpszresourcename) : 0;
#else
    (void)hresource;
    (void)lpszresourcename;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterResourceNameEx(JNIEnv* km_env, jclass km_clazz, jlong hresource, jlong lpszresourcename, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterResourceNameEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hresource, (void*)(uintptr_t)lpszresourcename, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hresource;
    (void)lpszresourcename;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetClusterServiceAccountPassword(JNIEnv* km_env, jclass km_clazz, jlong lpszclustername, jlong lpsznewpassword, jint dwflags, jlong lpreturnstatusbuffer, jlong lpcbreturnstatusbuffersize) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetClusterServiceAccountPassword");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((void*)(uintptr_t)lpszclustername, (void*)(uintptr_t)lpsznewpassword, (uint32_t)dwflags, (void*)(uintptr_t)lpreturnstatusbuffer, (void*)(uintptr_t)lpcbreturnstatusbuffersize) : 0;
#else
    (void)lpszclustername;
    (void)lpsznewpassword;
    (void)dwflags;
    (void)lpreturnstatusbuffer;
    (void)lpcbreturnstatusbuffersize;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetGroupDependencyExpression(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpszdependencyexpression) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGroupDependencyExpression");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpszdependencyexpression) : 0;
#else
    (void)hgroup;
    (void)lpszdependencyexpression;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_windows_win32_networking_clustering_WindowsWin32NetworkingClusteringJniBridge_windowssys_1windows_1win32_1networking_1clustering_1SetGroupDependencyExpressionEx(JNIEnv* km_env, jclass km_clazz, jlong hgroup, jlong lpszdependencyexpression, jlong lpszreason) {
    (void)km_env;
    (void)km_clazz;
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int64_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("clusapi.dll");
        if (km_h_mod != NULL) km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetGroupDependencyExpressionEx");
    }
    uint32_t km_res = (km_fn_ptr != NULL) ? km_fn_ptr((int64_t)hgroup, (void*)(uintptr_t)lpszdependencyexpression, (void*)(uintptr_t)lpszreason) : 0;
#else
    (void)hgroup;
    (void)lpszdependencyexpression;
    (void)lpszreason;
    uint32_t km_res = 0;
#endif
    return (jint)km_res;
}

