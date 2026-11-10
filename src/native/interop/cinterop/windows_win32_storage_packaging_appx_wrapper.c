#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_storage_packaging_appx_wrapper.h"
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

int32_t windowssys_windows_win32_storage_packaging_appx_activatePackageVirtualizationContext(void* context, void* cookie) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ActivatePackageVirtualizationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(context, cookie);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)context;
    (void)cookie;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_addPackageDependency(void* packagedependencyid, int32_t rank, int32_t options, void* packagedependencycontext, void* packagefullname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, int32_t, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AddPackageDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagedependencyid, rank, options, packagedependencycontext, packagefullname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagedependencyid;
    (void)rank;
    (void)options;
    (void)packagedependencycontext;
    (void)packagefullname;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_appPolicyGetClrCompat(void* processtoken, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetClrCompat");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processtoken, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_appPolicyGetCreateFileAccess(void* processtoken, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetCreateFileAccess");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processtoken, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_appPolicyGetLifecycleManagement(void* processtoken, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetLifecycleManagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processtoken, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_appPolicyGetMediaFoundationCodecLoading(void* processtoken, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetMediaFoundationCodecLoading");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processtoken, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_appPolicyGetProcessTerminationMethod(void* processtoken, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetProcessTerminationMethod");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processtoken, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_appPolicyGetShowDeveloperDiagnostic(void* processtoken, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetShowDeveloperDiagnostic");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processtoken, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_appPolicyGetThreadInitializationType(void* processtoken, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetThreadInitializationType");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processtoken, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_appPolicyGetWindowingModel(void* processtoken, void* policy) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "AppPolicyGetWindowingModel");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(processtoken, policy);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)processtoken;
    (void)policy;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_checkIsMSIXPackage(void* packagefullname, void* ismsixpackage) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CheckIsMSIXPackage");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname, ismsixpackage);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagefullname;
    (void)ismsixpackage;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_closePackageInfo(void* packageinforeference) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ClosePackageInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packageinforeference);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packageinforeference;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_createPackageVirtualizationContext(void* packagefamilyname, void* context) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "CreatePackageVirtualizationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilyname, context);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagefamilyname;
    (void)context;
    errno = ENOSYS;
    return -1;
#endif
}

void windowssys_windows_win32_storage_packaging_appx_deactivatePackageVirtualizationContext(uint64_t cookie) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(uint64_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeactivatePackageVirtualizationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(cookie);
        return;
    }
    errno = ENOSYS;
#else
    (void)cookie;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_deletePackageDependency(void* packagedependencyid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DeletePackageDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagedependencyid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagedependencyid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_duplicatePackageVirtualizationContext(void* sourcecontext, void* destcontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DuplicatePackageVirtualizationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(sourcecontext, destcontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)sourcecontext;
    (void)destcontext;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_findPackagesByPackageFamily(void* packagefamilyname, uint32_t packagefilters, void* count, void* packagefullnames, void* bufferlength, void* buffer, void* packageproperties) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FindPackagesByPackageFamily");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilyname, packagefilters, count, packagefullnames, bufferlength, buffer, packageproperties);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefamilyname;
    (void)packagefilters;
    (void)count;
    (void)packagefullnames;
    (void)bufferlength;
    (void)buffer;
    (void)packageproperties;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_formatApplicationUserModelId(void* packagefamilyname, void* packagerelativeapplicationid, void* applicationusermodelidlength, void* applicationusermodelid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "FormatApplicationUserModelId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilyname, packagerelativeapplicationid, applicationusermodelidlength, applicationusermodelid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefamilyname;
    (void)packagerelativeapplicationid;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelId(void* hprocess, void* applicationusermodelidlength, void* applicationusermodelid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationUserModelId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, applicationusermodelidlength, applicationusermodelid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getApplicationUserModelIdFromToken(void* token, void* applicationusermodelidlength, void* applicationusermodelid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetApplicationUserModelIdFromToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, applicationusermodelidlength, applicationusermodelid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)token;
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getCurrentApplicationUserModelId(void* applicationusermodelidlength, void* applicationusermodelid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentApplicationUserModelId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(applicationusermodelidlength, applicationusermodelid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)applicationusermodelidlength;
    (void)applicationusermodelid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFamilyName(void* packagefamilynamelength, void* packagefamilyname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageFamilyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilynamelength, packagefamilyname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getCurrentPackageFullName(void* packagefullnamelength, void* packagefullname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageFullName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullnamelength, packagefullname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullnamelength;
    (void)packagefullname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getCurrentPackageId(void* bufferlength, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(bufferlength, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo(uint32_t flags, void* bufferlength, void* buffer, void* count) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, bufferlength, buffer, count);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo2(uint32_t flags, int32_t packagepathtype, void* bufferlength, void* buffer, void* count) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageInfo2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, packagepathtype, bufferlength, buffer, count);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)flags;
    (void)packagepathtype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_getCurrentPackageInfo3(uint32_t flags, int32_t packageinfotype, void* bufferlength, void* buffer, void* count) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageInfo3");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(flags, packageinfotype, bufferlength, buffer, count);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)flags;
    (void)packageinfotype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath(void* pathlength, void* path) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackagePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pathlength, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getCurrentPackagePath2(int32_t packagepathtype, void* pathlength, void* path) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackagePath2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagepathtype, pathlength, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

void* windowssys_windows_win32_storage_packaging_appx_getCurrentPackageVirtualizationContext(void) {
#ifdef _WIN32
    typedef void* (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetCurrentPackageVirtualizationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return NULL;
#else
    errno = ENOSYS;
    return NULL;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_getIdForPackageDependencyContext(void* packagedependencycontext, void* packagedependencyid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetIdForPackageDependencyContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagedependencycontext, packagedependencyid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagedependencycontext;
    (void)packagedependencyid;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackageApplicationIds(void* packageinforeference, void* bufferlength, void* buffer, void* count) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageApplicationIds");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packageinforeference, bufferlength, buffer, count);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packageinforeference;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackageFamilyName(void* hprocess, void* packagefamilynamelength, void* packagefamilyname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFamilyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, packagefamilynamelength, packagefamilyname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackageFamilyNameFromToken(void* token, void* packagefamilynamelength, void* packagefamilyname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFamilyNameFromToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, packagefamilynamelength, packagefamilyname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)token;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackageFullName(void* hprocess, void* packagefullnamelength, void* packagefullname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFullName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, packagefullnamelength, packagefullname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)packagefullnamelength;
    (void)packagefullname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackageFullNameFromToken(void* token, void* packagefullnamelength, void* packagefullname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageFullNameFromToken");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(token, packagefullnamelength, packagefullname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)token;
    (void)packagefullnamelength;
    (void)packagefullname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackageGraphRevisionId(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-6.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageGraphRevisionId");
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

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackageId(void* hprocess, void* bufferlength, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hprocess, bufferlength, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hprocess;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackageInfo(void* packageinforeference, uint32_t flags, void* bufferlength, void* buffer, void* count) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packageinforeference, flags, bufferlength, buffer, count);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packageinforeference;
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackageInfo2(void* packageinforeference, uint32_t flags, int32_t packagepathtype, void* bufferlength, void* buffer, void* count) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, int32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackageInfo2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packageinforeference, flags, packagepathtype, bufferlength, buffer, count);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packageinforeference;
    (void)flags;
    (void)packagepathtype;
    (void)bufferlength;
    (void)buffer;
    (void)count;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackagePath(void* packageid, uint32_t reserved, void* pathlength, void* path) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagePath");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packageid, reserved, pathlength, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packageid;
    (void)reserved;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName(void* packagefullname, void* pathlength, void* path) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagePathByFullName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname, pathlength, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullname;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackagePathByFullName2(void* packagefullname, int32_t packagepathtype, void* pathlength, void* path) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagePathByFullName2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname, packagepathtype, pathlength, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullname;
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getPackagesByPackageFamily(void* packagefamilyname, void* count, void* packagefullnames, void* bufferlength, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetPackagesByPackageFamily");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilyname, count, packagefullnames, bufferlength, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefamilyname;
    (void)count;
    (void)packagefullnames;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_getProcessesInVirtualizationContext(void* packagefamilyname, void* count, void* processes) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetProcessesInVirtualizationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilyname, count, processes);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagefamilyname;
    (void)count;
    (void)processes;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_getResolvedPackageFullNameForPackageDependency(void* packagedependencyid, void* packagefullname) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetResolvedPackageFullNameForPackageDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagedependencyid, packagefullname);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagedependencyid;
    (void)packagefullname;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getStagedPackageOrigin(void* packagefullname, void* origin) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStagedPackageOrigin");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname, origin);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullname;
    (void)origin;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName(void* packagefullname, void* pathlength, void* path) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStagedPackagePathByFullName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname, pathlength, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullname;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_getStagedPackagePathByFullName2(void* packagefullname, int32_t packagepathtype, void* pathlength, void* path) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-3.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetStagedPackagePathByFullName2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname, packagepathtype, pathlength, path);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullname;
    (void)packagepathtype;
    (void)pathlength;
    (void)path;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullName(void* packagefullname, uint32_t reserved, void* packageinforeference) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPackageInfoByFullName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname, reserved, packageinforeference);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullname;
    (void)reserved;
    (void)packageinforeference;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_openPackageInfoByFullNameForUser(void* usersid, void* packagefullname, uint32_t reserved, void* packageinforeference) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "OpenPackageInfoByFullNameForUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(usersid, packagefullname, reserved, packageinforeference);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)usersid;
    (void)packagefullname;
    (void)reserved;
    (void)packageinforeference;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromFullName(void* packagefullname, void* packagefamilynamelength, void* packagefamilyname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageFamilyNameFromFullName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname, packagefamilynamelength, packagefamilyname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullname;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_packageFamilyNameFromId(void* packageid, void* packagefamilynamelength, void* packagefamilyname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageFamilyNameFromId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packageid, packagefamilynamelength, packagefamilyname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packageid;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_packageFullNameFromId(void* packageid, void* packagefullnamelength, void* packagefullname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageFullNameFromId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packageid, packagefullnamelength, packagefullname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packageid;
    (void)packagefullnamelength;
    (void)packagefullname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_packageIdFromFullName(void* packagefullname, uint32_t flags, void* bufferlength, void* buffer) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageIdFromFullName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname, flags, bufferlength, buffer);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullname;
    (void)flags;
    (void)bufferlength;
    (void)buffer;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_packageNameAndPublisherIdFromFamilyName(void* packagefamilyname, void* packagenamelength, void* packagename, void* packagepublisheridlength, void* packagepublisherid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "PackageNameAndPublisherIdFromFamilyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilyname, packagenamelength, packagename, packagepublisheridlength, packagepublisherid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefamilyname;
    (void)packagenamelength;
    (void)packagename;
    (void)packagepublisheridlength;
    (void)packagepublisherid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_parseApplicationUserModelId(void* applicationusermodelid, void* packagefamilynamelength, void* packagefamilyname, void* packagerelativeapplicationidlength, void* packagerelativeapplicationid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ParseApplicationUserModelId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(applicationusermodelid, packagefamilynamelength, packagefamilyname, packagerelativeapplicationidlength, packagerelativeapplicationid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)applicationusermodelid;
    (void)packagefamilynamelength;
    (void)packagefamilyname;
    (void)packagerelativeapplicationidlength;
    (void)packagerelativeapplicationid;
    errno = ENOSYS;
    return 0;
#endif
}

void windowssys_windows_win32_storage_packaging_appx_releasePackageVirtualizationContext(void* context) {
#ifdef _WIN32
    typedef void (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernel32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ReleasePackageVirtualizationContext");
        }
    }
    if (km_fn_ptr != NULL) {
        km_fn_ptr(context);
        return;
    }
    errno = ENOSYS;
#else
    (void)context;
    errno = ENOSYS;
#endif
}

int32_t windowssys_windows_win32_storage_packaging_appx_removePackageDependency(void* packagedependencycontext) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("kernelbase.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RemovePackageDependency");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagedependencycontext);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)packagedependencycontext;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_verifyApplicationUserModelId(void* applicationusermodelid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyApplicationUserModelId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(applicationusermodelid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)applicationusermodelid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_verifyPackageFamilyName(void* packagefamilyname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageFamilyName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefamilyname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefamilyname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_verifyPackageFullName(void* packagefullname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageFullName");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagefullname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagefullname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_verifyPackageId(void* packageid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packageid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packageid;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_storage_packaging_appx_verifyPackageRelativeApplicationId(void* packagerelativeapplicationid) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-appmodel-runtime-l1-1-1.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "VerifyPackageRelativeApplicationId");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(packagerelativeapplicationid);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)packagerelativeapplicationid;
    errno = ENOSYS;
    return 0;
#endif
}

