#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_management_mobiledevicemanagementregistration_wrapper.h"
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

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_applyLocalManagementSyncML(void* syncmlrequest, void* syncmlresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmlocalmanagement.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "ApplyLocalManagementSyncML");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(syncmlrequest, syncmlresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)syncmlrequest;
    (void)syncmlresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementService(void* pszupn, void* ppmgmtinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiscoverManagementService");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszupn, ppmgmtinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszupn;
    (void)ppmgmtinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementServiceEx(void* pszupn, void* pszdiscoveryservicecandidate, void* ppmgmtinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "DiscoverManagementServiceEx");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszupn, pszdiscoveryservicecandidate, ppmgmtinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszupn;
    (void)pszdiscoveryservicecandidate;
    (void)ppmgmtinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceManagementConfigInfo(void* providerid, void* configstringbufferlength, void* configstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceManagementConfigInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerid, configstringbufferlength, configstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)providerid;
    (void)configstringbufferlength;
    (void)configstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceRegistrationInfo(int32_t deviceinformationclass, void* ppdeviceregistrationinfo) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetDeviceRegistrationInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(deviceinformationclass, ppdeviceregistrationinfo);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)deviceinformationclass;
    (void)ppdeviceregistrationinfo;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_getManagementAppHyperlink(uint32_t cchhyperlink, void* pszhyperlink) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetManagementAppHyperlink");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(cchhyperlink, pszhyperlink);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)cchhyperlink;
    (void)pszhyperlink;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_isDeviceRegisteredWithManagement(void* pfisdeviceregisteredwithmanagement, uint32_t cchupn, void* pszupn) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsDeviceRegisteredWithManagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfisdeviceregisteredwithmanagement, cchupn, pszupn);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfisdeviceregisteredwithmanagement;
    (void)cchupn;
    (void)pszupn;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_isManagementRegistrationAllowed(void* pfismanagementregistrationallowed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsManagementRegistrationAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pfismanagementregistrationallowed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pfismanagementregistrationallowed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_isMdmUxWithoutAadAllowed(void* isenrollmentallowed) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "IsMdmUxWithoutAadAllowed");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(isenrollmentallowed);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)isenrollmentallowed;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithLocalManagement(void* alreadyregistered) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmlocalmanagement.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithLocalManagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(alreadyregistered);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)alreadyregistered;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagement(void* pszupn, void* ppszmdmserviceuri, void* ppzsaccesstoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithManagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(pszupn, ppszmdmserviceuri, ppzsaccesstoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)pszupn;
    (void)ppszmdmserviceuri;
    (void)ppzsaccesstoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADCredentials(void* usertoken) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithManagementUsingAADCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(usertoken);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)usertoken;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithManagementUsingAADDeviceCredentials");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials2(void* mdmapplicationid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegisterDeviceWithManagementUsingAADDeviceCredentials2");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(mdmapplicationid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)mdmapplicationid;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_setDeviceManagementConfigInfo(void* providerid, void* configstring) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetDeviceManagementConfigInfo");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(providerid, configstring);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)providerid;
    (void)configstring;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_setManagedExternally(int32_t ismanagedexternally) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "SetManagedExternally");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(ismanagedexternally);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)ismanagedexternally;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithLocalManagement(void) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmlocalmanagement.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterDeviceWithLocalManagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr();
    }
    errno = ENOSYS;
    return -1;
#else
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithManagement(void* enrollmentid) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("mdmregistration.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "UnregisterDeviceWithManagement");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(enrollmentid);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)enrollmentid;
    errno = ENOSYS;
    return -1;
#endif
}

