#ifndef _GNU_SOURCE
#define _GNU_SOURCE
#endif
#include "windows_win32_system_registry_wrapper.h"
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

uint32_t windowssys_windows_win32_system_registry_getRegistryValueWithFallbackW(void* hkeyprimary, void* pwszprimarysubkey, void* hkeyfallback, void* pwszfallbacksubkey, void* pwszvalue, uint32_t dwflags, void* pdwtype, void* pvdata, uint32_t cbdatain, void* pcbdataout) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, uint32_t, void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("api-ms-win-core-state-helpers-l1-1-0.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "GetRegistryValueWithFallbackW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeyprimary, pwszprimarysubkey, hkeyfallback, pwszfallbacksubkey, pwszvalue, dwflags, pdwtype, pvdata, cbdatain, pcbdataout);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeyprimary;
    (void)pwszprimarysubkey;
    (void)hkeyfallback;
    (void)pwszfallbacksubkey;
    (void)pwszvalue;
    (void)dwflags;
    (void)pdwtype;
    (void)pvdata;
    (void)cbdatain;
    (void)pcbdataout;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regCloseKey(void* hkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCloseKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regConnectRegistryA(void* lpmachinename, void* hkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, hkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

int32_t windowssys_windows_win32_system_registry_regConnectRegistryExA(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, hkey, flags, phkresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)flags;
    (void)phkresult;
    errno = ENOSYS;
    return -1;
#endif
}

int32_t windowssys_windows_win32_system_registry_regConnectRegistryExW(void* lpmachinename, void* hkey, uint32_t flags, void* phkresult) {
#ifdef _WIN32
    typedef int32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, hkey, flags, phkresult);
    }
    errno = ENOSYS;
    return -1;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)flags;
    (void)phkresult;
    errno = ENOSYS;
    return -1;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regConnectRegistryW(void* lpmachinename, void* hkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegConnectRegistryW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpmachinename, hkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpmachinename;
    (void)hkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regCopyTreeA(void* hkeysrc, void* lpsubkey, void* hkeydest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCopyTreeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeysrc, lpsubkey, hkeydest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeysrc;
    (void)lpsubkey;
    (void)hkeydest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regCopyTreeW(void* hkeysrc, void* lpsubkey, void* hkeydest) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCopyTreeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkeysrc, lpsubkey, hkeydest);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkeysrc;
    (void)lpsubkey;
    (void)hkeydest;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regCreateKeyA(void* hkey, void* lpsubkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regCreateKeyExA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, reserved, lpclass, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regCreateKeyExW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, reserved, lpclass, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regCreateKeyTransactedA(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, reserved, lpclass, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition, htransaction, pextendedparemeter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)htransaction;
    (void)pextendedparemeter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regCreateKeyTransactedW(void* hkey, void* lpsubkey, uint32_t reserved, void* lpclass, uint32_t dwoptions, uint32_t samdesired, void* lpsecurityattributes, void* phkresult, void* lpdwdisposition, void* htransaction, void* pextendedparemeter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t, uint32_t, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, reserved, lpclass, dwoptions, samdesired, lpsecurityattributes, phkresult, lpdwdisposition, htransaction, pextendedparemeter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)reserved;
    (void)lpclass;
    (void)dwoptions;
    (void)samdesired;
    (void)lpsecurityattributes;
    (void)phkresult;
    (void)lpdwdisposition;
    (void)htransaction;
    (void)pextendedparemeter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regCreateKeyW(void* hkey, void* lpsubkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegCreateKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteKeyA(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteKeyExA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, samdesired, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteKeyExW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, samdesired, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteKeyTransactedA(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, samdesired, reserved, htransaction, pextendedparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    (void)htransaction;
    (void)pextendedparameter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteKeyTransactedW(void* hkey, void* lpsubkey, uint32_t samdesired, uint32_t reserved, void* htransaction, void* pextendedparameter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, samdesired, reserved, htransaction, pextendedparameter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)samdesired;
    (void)reserved;
    (void)htransaction;
    (void)pextendedparameter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteKeyW(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteTreeA(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteTreeA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteTreeW(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteTreeW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteValueA(void* hkey, void* lpvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDeleteValueW(void* hkey, void* lpvaluename) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDeleteValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regDisablePredefinedCache(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDisablePredefinedCache");
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

uint32_t windowssys_windows_win32_system_registry_regDisablePredefinedCacheEx(void) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDisablePredefinedCacheEx");
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

uint32_t windowssys_windows_win32_system_registry_regDisableReflectionKey(void* hbase) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegDisableReflectionKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbase);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hbase;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regEnableReflectionKey(void* hbase) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnableReflectionKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbase);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hbase;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regEnumKeyA(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpname, cchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regEnumKeyExA(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)lpcchname;
    (void)lpreserved;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regEnumKeyExW(void* hkey, uint32_t dwindex, void* lpname, void* lpcchname, void* lpreserved, void* lpclass, void* lpcchclass, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)lpcchname;
    (void)lpreserved;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regEnumKeyW(void* hkey, uint32_t dwindex, void* lpname, uint32_t cchname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpname, cchname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpname;
    (void)cchname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regEnumValueA(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpvaluename;
    (void)lpcchvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regEnumValueW(void* hkey, uint32_t dwindex, void* lpvaluename, void* lpcchvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegEnumValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, dwindex, lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)dwindex;
    (void)lpvaluename;
    (void)lpcchvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regFlushKey(void* hkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegFlushKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regGetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor, void* lpcbsecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegGetKeySecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, securityinformation, psecuritydescriptor, lpcbsecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    (void)lpcbsecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regGetValueA(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegGetValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvalue, dwflags, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvalue;
    (void)dwflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regGetValueW(void* hkey, void* lpsubkey, void* lpvalue, uint32_t dwflags, void* pdwtype, void* pvdata, void* pcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegGetValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvalue, dwflags, pdwtype, pvdata, pcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvalue;
    (void)dwflags;
    (void)pdwtype;
    (void)pvdata;
    (void)pcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regLoadAppKeyA(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadAppKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfile, phkresult, samdesired, dwoptions, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfile;
    (void)phkresult;
    (void)samdesired;
    (void)dwoptions;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regLoadAppKeyW(void* lpfile, void* phkresult, uint32_t samdesired, uint32_t dwoptions, uint32_t reserved) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadAppKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(lpfile, phkresult, samdesired, dwoptions, reserved);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)lpfile;
    (void)phkresult;
    (void)samdesired;
    (void)dwoptions;
    (void)reserved;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regLoadKeyA(void* hkey, void* lpsubkey, void* lpfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regLoadKeyW(void* hkey, void* lpsubkey, void* lpfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regLoadMUIStringA(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadMUIStringA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszvalue, pszoutbuf, cboutbuf, pcbdata, flags, pszdirectory);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pszoutbuf;
    (void)cboutbuf;
    (void)pcbdata;
    (void)flags;
    (void)pszdirectory;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regLoadMUIStringW(void* hkey, void* pszvalue, void* pszoutbuf, uint32_t cboutbuf, void* pcbdata, uint32_t flags, void* pszdirectory) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegLoadMUIStringW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, pszvalue, pszoutbuf, cboutbuf, pcbdata, flags, pszdirectory);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)pszvalue;
    (void)pszoutbuf;
    (void)cboutbuf;
    (void)pcbdata;
    (void)flags;
    (void)pszdirectory;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regNotifyChangeKeyValue(void* hkey, int32_t bwatchsubtree, uint32_t dwnotifyfilter, void* hevent, int32_t fasynchronous) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, int32_t, uint32_t, void*, int32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegNotifyChangeKeyValue");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, bwatchsubtree, dwnotifyfilter, hevent, fasynchronous);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)bwatchsubtree;
    (void)dwnotifyfilter;
    (void)hevent;
    (void)fasynchronous;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regOpenCurrentUser(uint32_t samdesired, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenCurrentUser");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(samdesired, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regOpenKeyA(void* hkey, void* lpsubkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regOpenKeyExA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, uloptions, samdesired, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regOpenKeyExW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, uloptions, samdesired, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regOpenKeyTransactedA(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyTransactedA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, uloptions, samdesired, phkresult, htransaction, pextendedparemeter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    (void)htransaction;
    (void)pextendedparemeter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regOpenKeyTransactedW(void* hkey, void* lpsubkey, uint32_t uloptions, uint32_t samdesired, void* phkresult, void* htransaction, void* pextendedparemeter) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyTransactedW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, uloptions, samdesired, phkresult, htransaction, pextendedparemeter);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)uloptions;
    (void)samdesired;
    (void)phkresult;
    (void)htransaction;
    (void)pextendedparemeter;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regOpenKeyW(void* hkey, void* lpsubkey, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regOpenUserClassesRoot(void* htoken, uint32_t dwoptions, uint32_t samdesired, void* phkresult) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOpenUserClassesRoot");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(htoken, dwoptions, samdesired, phkresult);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)htoken;
    (void)dwoptions;
    (void)samdesired;
    (void)phkresult;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regOverridePredefKey(void* hkey, void* hnewhkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegOverridePredefKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, hnewhkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)hnewhkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regQueryInfoKeyA(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryInfoKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpreserved;
    (void)lpcsubkeys;
    (void)lpcbmaxsubkeylen;
    (void)lpcbmaxclasslen;
    (void)lpcvalues;
    (void)lpcbmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regQueryInfoKeyW(void* hkey, void* lpclass, void* lpcchclass, void* lpreserved, void* lpcsubkeys, void* lpcbmaxsubkeylen, void* lpcbmaxclasslen, void* lpcvalues, void* lpcbmaxvaluenamelen, void* lpcbmaxvaluelen, void* lpcbsecuritydescriptor, void* lpftlastwritetime) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryInfoKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpclass;
    (void)lpcchclass;
    (void)lpreserved;
    (void)lpcsubkeys;
    (void)lpcbmaxsubkeylen;
    (void)lpcbmaxclasslen;
    (void)lpcvalues;
    (void)lpcbmaxvaluenamelen;
    (void)lpcbmaxvaluelen;
    (void)lpcbsecuritydescriptor;
    (void)lpftlastwritetime;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regQueryMultipleValuesA(void* hkey, void* val_list, uint32_t num_vals, void* lpvaluebuf, void* ldwtotsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryMultipleValuesA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, val_list, num_vals, lpvaluebuf, ldwtotsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)val_list;
    (void)num_vals;
    (void)lpvaluebuf;
    (void)ldwtotsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regQueryMultipleValuesW(void* hkey, void* val_list, uint32_t num_vals, void* lpvaluebuf, void* ldwtotsize) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryMultipleValuesW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, val_list, num_vals, lpvaluebuf, ldwtotsize);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)val_list;
    (void)num_vals;
    (void)lpvaluebuf;
    (void)ldwtotsize;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regQueryReflectionKey(void* hbase, void* bisreflectiondisabled) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryReflectionKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hbase, bisreflectiondisabled);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hbase;
    (void)bisreflectiondisabled;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regQueryValueA(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regQueryValueExA(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regQueryValueExW(void* hkey, void* lpvaluename, void* lpreserved, void* lptype, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)lpreserved;
    (void)lptype;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regQueryValueW(void* hkey, void* lpsubkey, void* lpdata, void* lpcbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegQueryValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpdata, lpcbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpdata;
    (void)lpcbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regRenameKey(void* hkey, void* lpsubkeyname, void* lpnewkeyname) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRenameKey");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkeyname, lpnewkeyname);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkeyname;
    (void)lpnewkeyname;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regReplaceKeyA(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegReplaceKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpnewfile, lpoldfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpnewfile;
    (void)lpoldfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regReplaceKeyW(void* hkey, void* lpsubkey, void* lpnewfile, void* lpoldfile) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegReplaceKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpnewfile, lpoldfile);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpnewfile;
    (void)lpoldfile;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regRestoreKeyA(void* hkey, void* lpfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regRestoreKeyW(void* hkey, void* lpfile, uint32_t dwflags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegRestoreKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, dwflags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)dwflags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSaveKeyA(void* hkey, void* lpfile, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, lpsecurityattributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSaveKeyExA(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, lpsecurityattributes, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSaveKeyExW(void* hkey, void* lpfile, void* lpsecurityattributes, uint32_t flags) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, lpsecurityattributes, flags);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    (void)flags;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSaveKeyW(void* hkey, void* lpfile, void* lpsecurityattributes) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSaveKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpfile, lpsecurityattributes);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpfile;
    (void)lpsecurityattributes;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSetKeySecurity(void* hkey, uint32_t securityinformation, void* psecuritydescriptor) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, uint32_t, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetKeySecurity");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, securityinformation, psecuritydescriptor);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)securityinformation;
    (void)psecuritydescriptor;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSetKeyValueA(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetKeyValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvaluename, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSetKeyValueW(void* hkey, void* lpsubkey, void* lpvaluename, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetKeyValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, lpvaluename, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)lpvaluename;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSetValueA(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSetValueExA(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueExA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename, reserved, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)reserved;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSetValueExW(void* hkey, void* lpvaluename, uint32_t reserved, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueExW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpvaluename, reserved, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpvaluename;
    (void)reserved;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regSetValueW(void* hkey, void* lpsubkey, uint32_t dwtype, void* lpdata, uint32_t cbdata) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*, uint32_t, void*, uint32_t);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegSetValueW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey, dwtype, lpdata, cbdata);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    (void)dwtype;
    (void)lpdata;
    (void)cbdata;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regUnLoadKeyA(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegUnLoadKeyA");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

uint32_t windowssys_windows_win32_system_registry_regUnLoadKeyW(void* hkey, void* lpsubkey) {
#ifdef _WIN32
    typedef uint32_t (__stdcall *km_fn_t)(void*, void*);
    static km_fn_t km_fn_ptr = NULL;
    if (km_fn_ptr == NULL) {
        HMODULE km_h_mod = LoadLibraryA("advapi32.dll");
        if (km_h_mod != NULL) {
            km_fn_ptr = (km_fn_t)(void*)GetProcAddress(km_h_mod, "RegUnLoadKeyW");
        }
    }
    if (km_fn_ptr != NULL) {
        return km_fn_ptr(hkey, lpsubkey);
    }
    errno = ENOSYS;
    return 0;
#else
    (void)hkey;
    (void)lpsubkey;
    errno = ENOSYS;
    return 0;
#endif
}

